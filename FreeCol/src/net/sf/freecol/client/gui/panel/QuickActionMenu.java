/**
 *  Copyright (C) 2002-2015   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import net.miginfocom.swing.MigLayout;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.control.InGameController;
import net.sf.freecol.client.gui.ImageLibrary;
import net.sf.freecol.client.gui.SwingGUI;
import net.sf.freecol.client.gui.panel.ColonyPanel.TilesPanel.ASingleTilePanel;
import net.sf.freecol.client.gui.panel.UnitLabel.UnitAction;
import net.sf.freecol.common.debug.FreeColDebugger;
import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.model.Ability;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.Building;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Europe;
import net.sf.freecol.common.model.GameOptions;
import net.sf.freecol.common.model.Goods;
import net.sf.freecol.common.model.GoodsContainer;
import net.sf.freecol.common.model.GoodsType;
import net.sf.freecol.common.model.Location;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.StringTemplate;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.Role;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.Unit.UnitState;
import net.sf.freecol.common.model.UnitLocation;
import net.sf.freecol.common.model.UnitType;
import net.sf.freecol.common.model.UnitTypeChange.ChangeType;
import net.sf.freecol.common.model.WorkLocation;
import static net.sf.freecol.common.util.CollectionUtils.*;


/**
 * Handles the generation of popup menu's generated by DragListener
 * objects attached to units within the Colony and Europe panels.
 * @author Brian
 */
public final class QuickActionMenu extends JPopupMenu {

    private static final Logger logger = Logger.getLogger(QuickActionMenu.class.getName());

    private final FreeColClient freeColClient;

    private final SwingGUI gui;

    private final FreeColPanel parentPanel;


    /**
     * Creates a standard empty menu
     *
     * @param freeColClient The enclosing <code>FreeColClient</code>.
     * @param freeColPanel The parent <code>FreeColPanel</code>.
     */
    public QuickActionMenu(FreeColClient freeColClient,
                           FreeColPanel freeColPanel) {
        this.freeColClient = freeColClient;
        this.gui = (SwingGUI)freeColClient.getGUI();
        this.parentPanel = freeColPanel;
    }


    /**
     * Add specific menu items for a given component.
     *
     * @param comp The specific <code>JComponent</code>.
     * @return This <code>QuickActionMenu</code>.
     */
    public QuickActionMenu addMenuItems(JComponent comp) {
        if (comp instanceof UnitLabel) {
            createUnitMenu((UnitLabel)comp);
        } else if (comp instanceof GoodsLabel) {
            createGoodsMenu((GoodsLabel)comp);
        } else if (comp instanceof MarketLabel) {
            createMarketMenu((MarketLabel)comp);
        } else if (comp instanceof ASingleTilePanel) {
            createTileMenu((ASingleTilePanel)comp);
        } else if (comp.getParent() instanceof ASingleTilePanel) {
            // Also check the parent to show the popup in the
            // center of the colony panel tile.
            createTileMenu((ASingleTilePanel)comp.getParent());
        }
        return this;
    }


    /**
     * Prompt for an amount of goods to use.
     *
     * The amount is returned through the parameter amount.
     *
     * @param ag The <code>AbstractGoods</code> to query.
     */
    private void promptForGoods(AbstractGoods ag) {
        int ret = gui.showSelectAmountDialog(ag.getType(),
                                             GoodsContainer.CARGO_SIZE,
                                             ag.getAmount(), true);
        if (ret > 0) ag.setAmount(ret);
    }


    /**
     * Creates a popup menu for a Unit.
     */
    private void createUnitMenu(final UnitLabel unitLabel) {
        final Unit unit = unitLabel.getUnit();

        this.setLabel("Unit");
        ImageIcon unitIcon = new ImageIcon(gui.getImageLibrary().getSmallUnitImage(unit));
        JMenuItem name = new JMenuItem(unit.getDescription(Unit.UnitLabelType.NATIONAL)
            + " (" + Messages.message("colopedia") + ")", unitIcon);
        name.setActionCommand(UnitAction.COLOPEDIA.toString());
        name.addActionListener(unitLabel);
        this.add(name);
        this.addSeparator();

        if (addCarrierItems(unitLabel)) this.addSeparator();

        if (unit.isInEurope()) {
            if (addCommandItems(unitLabel)) this.addSeparator();
            if (addBoardItems(unitLabel, unit.getOwner().getEurope())) {
                this.addSeparator();
            }
        } else if (unit.hasTile()) {
            Colony colony = unit.getLocation().getTile().getColony();
            if (colony != null) {
                if (addTileItem(unitLabel)) this.addSeparator();
                if (addWorkItems(unitLabel)) this.addSeparator();
                if (addEducationItems(unitLabel)) this.addSeparator();
                if (unit.isInColony() && colony.canReducePopulation()) {
                    JMenuItem menuItem = Utility.localizedMenuItem("quickActionMenu.leaveTown");
                    menuItem.setActionCommand(UnitAction.LEAVE_TOWN.toString());
                    menuItem.addActionListener(unitLabel);
                    this.add(menuItem);
                    addBoardItems(unitLabel, colony.getTile());
                    this.addSeparator();
                } else {
                    if (addCommandItems(unitLabel)) this.addSeparator();
                    if (addBoardItems(unitLabel, colony.getTile())) {
                        this.addSeparator();
                    }
                }
            } else {
                if (addCommandItems(unitLabel)) this.addSeparator();
            }
        }

        if (unit.hasAbility(Ability.CAN_BE_EQUIPPED)) {
            if (addRoleItems(unitLabel)) this.addSeparator();
        }
    }

    private boolean addBoardItems(final UnitLabel unitLabel, Location loc) {
        final InGameController igc = freeColClient.getInGameController();
        final Unit tempUnit = unitLabel.getUnit();

        if (tempUnit.isCarrier()) return false;
        boolean added = false;
        for (final Unit unit : loc.getUnitList()) {
            if (unit.isCarrier() && unit.canCarryUnits()
                && unit.canAdd(tempUnit)
                && tempUnit.getLocation() != unit) {
                StringTemplate template = StringTemplate.template("quickActionMenu.board")
                    .addStringTemplate("%unit%",
                        unit.getLabel(Unit.UnitLabelType.NATIONAL));
                JMenuItem menuItem = Utility.localizedMenuItem(template);
                menuItem.addActionListener((ActionEvent ae) -> {
                        igc.boardShip(tempUnit, unit);
                    });
                this.add(menuItem);
                added = true;
            }
        }
        return added;
    }

    private boolean addLoadItems(final Goods goods, Location loc) {
        final InGameController igc = freeColClient.getInGameController();

        boolean added = false;
        for (final Unit unit : loc.getUnitList()) {
            if (unit.isCarrier() && unit.canCarryGoods()
                && unit.canAdd(goods)) {
                StringTemplate template = StringTemplate.template("quickActionMenu.loadOnTo")
                    .addStringTemplate("%unit%",
                        unit.getLabel(Unit.UnitLabelType.NATIONAL));
                JMenuItem menuItem = Utility.localizedMenuItem(template);
                menuItem.addActionListener((ActionEvent ae) -> {
                        if ((ae.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                            promptForGoods(goods);
                        }
                        igc.loadCargo(goods, unit);
                    });
                this.add(menuItem);
                added = true;
            }
        }
        return added;
    }

    private boolean addCarrierItems(final UnitLabel unitLabel) {
        final Unit unit = unitLabel.getUnit();
        if (!unit.isCarrier() || !unit.hasCargo()) return false;

        JMenuItem cargo = Utility.localizedMenuItem("cargoOnCarrier");
        this.add(cargo);

        for (Unit passenger : unit.getUnitList()) {
            JMenuItem menuItem = new JMenuItem("    "
                + passenger.getDescription(Unit.UnitLabelType.NATIONAL));
            menuItem.setFont(menuItem.getFont().deriveFont(Font.ITALIC));
            this.add(menuItem);
        }
        for (Goods goods : unit.getGoodsList()) {
            JMenuItem menuItem = new JMenuItem("    "
                + Messages.message(goods.getLabel(true)));
            menuItem.setFont(menuItem.getFont().deriveFont(Font.ITALIC));
            this.add(menuItem);
        }
        return true;
    }

    private List<JMenuItem> descendingList(final Map<JMenuItem, Integer> map) {
        List<JMenuItem> ret = new ArrayList<>(map.keySet());
        Collections.sort(ret, new Comparator<JMenuItem>() {
                @Override
                public int compare(JMenuItem m1, JMenuItem m2) {
                    Integer i1 = map.get(m1);
                    Integer i2 = map.get(m2);
                    int cmp = i2.compareTo(i1);
                    if (cmp == 0) cmp = m1.getText().compareTo(m2.getText());
                    return cmp;
                }
            });
        return ret;
    }

    private JMenuItem makeProductionItem(GoodsType type, WorkLocation wl,
                                         int amount, UnitLabel unitLabel,
                                         boolean claim) {
        StringTemplate t = StringTemplate.template(type.getId() + ".workAs")
            .addAmount("%amount%", amount);
        if (claim) {
            t.addStringTemplate("%claim%", wl.getClaimTemplate());
        } else if (FreeColDebugger.isInDebugMode(FreeColDebugger.DebugMode.MENUS)) {
            t.addStringTemplate("%claim%", wl.getLocationLabel());
        } else {
            t.addName("%claim%", "");
        }
        JMenuItem menuItem = Utility.localizedMenuItem(t,
            new ImageIcon(gui.getImageLibrary().getSmallIconImage(type)));
        menuItem.setActionCommand(UnitLabel.getWorkLabel(wl)
            + "/" + wl.getId() + "/" + type.getId()
            + "/" + ((claim) ? "!" : ""));
        menuItem.addActionListener(unitLabel);
        return menuItem;
    }

    private boolean addWorkItems(final UnitLabel unitLabel) {
        final Unit unit = unitLabel.getUnit();
        if (unit.isCarrier()) return false;

        final UnitType unitType = unit.getType();
        final GoodsType expertGoods = unitType.getExpertProduction();
        final Colony colony = unit.getLocation().getColony();
        final Specification spec = freeColClient.getGame().getSpecification();
        final WorkLocation current = unit.getWorkLocation();
        final int bonusChange = (current != null) ? 0
            : colony.governmentChange(colony.getUnitCount() + 1);
        final int bonus = colony.getProductionBonus();

        Map<JMenuItem, Integer> items = new HashMap<>();
        Map<JMenuItem, Integer> extras = new HashMap<>();
        JMenuItem expertOwned = null;
        JMenuItem expertUnowned = null;
        for (GoodsType type : spec.getGoodsTypeList()) {
            int bestOwnedProd = bonus + bonusChange;
            int bestUnownedProd = bonus + bonusChange;
            WorkLocation bestOwned = null;
            WorkLocation bestUnowned = null;
            for (WorkLocation wl : colony.getAllWorkLocations()) {
                int prod = 0;
                switch (wl.getNoAddReason(unit)) {
                case NONE:
                    prod = wl.getPotentialProduction(type, unitType);
                    if (bestOwnedProd < prod) {
                        bestOwnedProd = prod;
                        bestOwned = wl;
                    }
                    break;
                case ALREADY_PRESENT:
                    prod = wl.getPotentialProduction(type, unitType);
                    if (bestOwnedProd < prod) {
                        bestOwnedProd = prod;
                        bestOwned = (unit.getWorkType() == type) ? null : wl;
                    }
                    break;
                case CLAIM_REQUIRED:
                    prod = wl.getPotentialProduction(type, unitType);
                    if (bestUnownedProd < prod) {
                        bestUnownedProd = prod;
                        bestUnowned = wl;
                    }
                    break;
                default:
                    break;
                }
            }
            if (bestOwned != null && bestOwnedProd > 0) {
                JMenuItem ji = makeProductionItem(type, bestOwned,
                    bestOwnedProd, unitLabel, false);
                if (type == expertGoods) {
                    expertOwned = ji;
                } else {
                    items.put(ji, bestOwnedProd);
                }
            }
            if (bestUnowned != null && bestUnownedProd > bestOwnedProd
                && bestUnownedProd > 0) {
                JMenuItem ji = makeProductionItem(type, bestUnowned,
                    bestUnownedProd, unitLabel, true);
                if (type == expertGoods) {
                    expertUnowned = ji;
                } else {
                    extras.put(ji, bestUnownedProd);
                }
            }
        }

        JMenu container = Utility.localizedMenu("quickActionMenu.changeWork");
        List<JMenuItem> owned = descendingList(items);
        if (expertOwned != null) owned.add(0, expertOwned);
        for (JMenuItem j : owned) container.add(j);
        List<JMenuItem> unowned = descendingList(extras);
        if (expertUnowned != null) unowned.add(0, expertUnowned);
        if (!unowned.isEmpty()) {
            if (!owned.isEmpty()) container.addSeparator();
            for (JMenuItem j : unowned) container.add(j);
        }
        if (container.getItemCount() > 0) this.add(container);

        if (current != null && unit.getWorkType() != null) {
            JMenuItem ji = Utility.localizedMenuItem("showProductionModifiers");
            ji.addActionListener((ActionEvent ae) -> {
                    gui.showWorkProductionPanel(unit);
                });
            this.add(ji);
        }
        return !(owned.isEmpty() && unowned.isEmpty() && current == null);
    }

    private boolean addEducationItems(final UnitLabel unitLabel) {
        boolean separatorNeeded = false;
        Unit unit = unitLabel.getUnit();

        ImageLibrary lib = gui.getImageLibrary();
        if (unit.getSpecification().getBoolean(GameOptions.ALLOW_STUDENT_SELECTION)) {
            for (Unit teacher : unit.getColony().getTeachers()) {
                if (unit.canBeStudent(teacher) && unit.isInColony()) {
                    JMenuItem menuItem = null;
                    ImageIcon teacherIcon = new ImageIcon(lib.getSmallerUnitImage(teacher));
                    if (teacher.getStudent() != unit) {
                        menuItem = Utility.localizedMenuItem("quickActionMenu.assignToTeacher",
                                                         teacherIcon);
                        if (teacher.getStudent() != null) {
                            menuItem.setText(menuItem.getText()
                                + " (" + teacher.getTurnsOfTraining()
                                + "/" + teacher.getNeededTurnsOfTraining()
                                + ")");
                        }
                        menuItem.setActionCommand(UnitAction.ASSIGN + "/" + teacher.getId());
                        menuItem.addActionListener(unitLabel);
                    } else {
                        menuItem = Utility.localizedMenuItem(StringTemplate
                            .template("quickActionMenu.apprentice")
                            .addName("%unit%",
                                Messages.getName(teacher.getType())),
                            teacherIcon);
                        menuItem.setText(menuItem.getText()
                            + ": " + teacher.getTurnsOfTraining()
                            + "/" + teacher.getNeededTurnsOfTraining());
                        menuItem.setEnabled(false);
                    }
                    this.add(menuItem);
                    separatorNeeded = true;
                }
            }
        }
        if (unit.getStudent() != null) {
            Unit student = unit.getStudent();
            JMenuItem menuItem = Utility.localizedMenuItem(StringTemplate
                .template("quickActionMenu.teaching")
                .addName("%unit%", Messages.getName(student.getType())));
            menuItem.setText(menuItem.getText() 
                + ": " + unit.getTurnsOfTraining()
                + "/" + unit.getNeededTurnsOfTraining());
            menuItem.setEnabled(false);
            this.add(menuItem);
            separatorNeeded = true;
        }
        int experience = unit.getExperience();
        GoodsType goods = unit.getExperienceType();
        if (experience > 0 && goods != null) {
            UnitType expertType = freeColClient.getGame()
                .getSpecification().getExpertForProducing(goods);
            if (unit.getType().canBeUpgraded(expertType, ChangeType.EXPERIENCE)) {
                int maxExperience = unit.getType().getMaximumExperience();
                double probability = unit.getType().getUnitTypeChange(expertType)
                    .getProbability(ChangeType.EXPERIENCE) * experience / (double) maxExperience;
                String jobName = Messages.message(goods.getWorkingAsKey());
                JPanel experiencePanel = new MigPanel();
                experiencePanel.setLayout(new MigLayout("wrap 3"));
                experiencePanel.add(new JLabel(new ImageIcon(
                        lib.getSmallerUnitImage(expertType))),
                    "spany 2");
                experiencePanel.add(Utility.localizedLabel(StringTemplate
                        .template("quickActionMenu.experience")
                        .addName("%job%", jobName)));
                experiencePanel.add(Utility.localizedLabel(StringTemplate
                        .label("/")
                        .addName(String.valueOf(experience))
                        .addName(String.valueOf(maxExperience))),
                    "align right");
                experiencePanel.add(Utility.localizedLabel("quickActionMenu.upgrade"));
                experiencePanel.add(new JLabel(ModifierFormat.format(probability) + "%"),
                                    "align right");
                this.add(experiencePanel);
                separatorNeeded = true;
            }
        }
        return separatorNeeded;
    }

    private boolean addCommandItems(final UnitLabel unitLabel) {
        final Unit tempUnit = unitLabel.getUnit();
        final boolean isUnitAtSea = tempUnit.isAtSea();

        JMenuItem menuItem = Utility.localizedMenuItem("activateUnit");
        menuItem.addActionListener((ActionEvent ae) -> {
                if (tempUnit.getState() != Unit.UnitState.ACTIVE) {
                    freeColClient.getInGameController()
                        .changeState(tempUnit, Unit.UnitState.ACTIVE);
                }
                gui.setActiveUnit(tempUnit);
            });
        menuItem.setEnabled(!isUnitAtSea);
        this.add(menuItem);

        if (!(tempUnit.getLocation() instanceof Europe)) {
            menuItem = Utility.localizedMenuItem("fortify");
            menuItem.setActionCommand(UnitAction.FORTIFY.toString());
            menuItem.addActionListener(unitLabel);
            menuItem.setEnabled((tempUnit.getMovesLeft() > 0)
                && !(tempUnit.getState() == Unit.UnitState.FORTIFIED
                    || tempUnit.getState() == Unit.UnitState.FORTIFYING));
            this.add(menuItem);
        }

        UnitState unitState = tempUnit.getState();
        menuItem = Utility.localizedMenuItem("sentry");
        menuItem.setActionCommand(UnitAction.SENTRY.toString());
        menuItem.addActionListener(unitLabel);
        menuItem.setEnabled(unitState != Unit.UnitState.SENTRY
            && !isUnitAtSea);
        this.add(menuItem);

        boolean hasTradeRoute = tempUnit.getTradeRoute() != null;
        menuItem = Utility.localizedMenuItem("clearOrders");
        menuItem.setActionCommand(UnitAction.CLEAR_ORDERS.toString());
        menuItem.addActionListener(unitLabel);
        menuItem.setEnabled((unitState != Unit.UnitState.ACTIVE
                || hasTradeRoute)
            && !isUnitAtSea);
        this.add(menuItem);

        if (tempUnit.isCarrier()) {
            menuItem = Utility.localizedMenuItem("assignTradeRoute");
            menuItem.setActionCommand(UnitAction.ASSIGN_TRADE_ROUTE.toString());
            menuItem.addActionListener(unitLabel);
            menuItem.setEnabled(!hasTradeRoute);
            this.add(menuItem);
        }

        if (tempUnit.canCarryTreasure() && tempUnit.canCashInTreasureTrain()) {
            menuItem = Utility.localizedMenuItem("cashInTreasureTrain");
            menuItem.addActionListener((ActionEvent ae) -> {
                    freeColClient.getInGameController()
                        .checkCashInTreasureTrain(tempUnit);
                });
            menuItem.setEnabled(true);
            this.add(menuItem);
        }

        if (tempUnit.getLocation() instanceof Unit) {
            menuItem = Utility.localizedMenuItem("leaveShip");
            menuItem.setActionCommand(UnitAction.LEAVE_SHIP.toString());
            menuItem.addActionListener(unitLabel);
            menuItem.setEnabled(true);
            this.add(menuItem);
        }

        if (tempUnit.isCarrier()) {
            menuItem = Utility.localizedMenuItem("unload");
            menuItem.setActionCommand(UnitAction.UNLOAD.toString());
            menuItem.addActionListener(unitLabel);
            menuItem.setEnabled(tempUnit.hasCargo() && !isUnitAtSea);
            this.add(menuItem);
        }

        return true;
    }

    /**
     * Nasty hack to get menu item to change roles.
     *
     * Hacky because we are continuing to express this in terms of equipment
     * changes despite the point of the role cutover was to get rid of
     * equipment types.  However, its time to release, and we should avoid
     * string changes.  Get rid of this post 0.11.0-release.
     */
    private JMenuItem createRoleItem(final UnitLabel unitLabel,
                                     final Role from, final int fromCount, 
                                     final Role to, final int toCount,
                                     final int price) {
        // Get the text
        String key = "model.role.change." + to.getSuffix();
        if (!Messages.containsKey(key)) {
            // Fall back to the full "from"."to" key
            key = "model.role.change." + from.getSuffix()
                + "." + to.getSuffix();
        }
        String text = Messages.message(key);
        if (price > 0) {
            text += " ("
                + Messages.message(StringTemplate.template("goldAmount")
                    .addAmount("%amount%", price))
                + ")";
        }

        // Get an icon
        AbstractGoods change = null;
        List<AbstractGoods> need = Role.getGoodsDifference(from, fromCount,
                                                           to, toCount);
        switch (need.size()) {
        case 0:
            break;
        case 1:
            change = need.get(0);
            break;
        default:
            change = find(need, ag -> ag.getAmount() > 0);
            break;
        }
        Icon icon = (change == null) ? null : new ImageIcon(
            gui.getImageLibrary().getSmallIconImage(change.getType()));

        JMenuItem item = new JMenuItem(text, icon);
        final InGameController igc = freeColClient.getInGameController();
        item.addActionListener((ActionEvent ae) -> {
                igc.equipUnitForRole(unitLabel.getUnit(), to, toCount);
                unitLabel.updateIcon();
                // FIXME: fix the PCL handling so this can go away
                if (parentPanel instanceof ColonyPanel) {
                    ((ColonyPanel)parentPanel).update();
                }
            });
        return item;
    }

    /**
     * Add menu items for role manipulation for a unit.
     *
     * Note "clear speciality" is here too to keep it well separated from
     * other items.
     *
     * @param unitLabel The <code>UnitLabel</code> specifying the unit.
     * @return True if menu items were added and a separator is now needed.
     */
    private boolean addRoleItems(final UnitLabel unitLabel) {
        final Unit unit = unitLabel.getUnit();
        final Role role = unit.getRole();
        final int roleCount = unit.getRoleCount();
        boolean separatorNeeded = false;

        UnitLocation uloc = (unit.isInEurope()) ? unit.getOwner().getEurope()
            : unit.getSettlement();
        if (uloc == null) return false;
        for (Role r : unit.getAvailableRoles(null)) {
            if (r == role) continue;
            JMenuItem newItem;
            if (r.isDefaultRole()) { // Always valid
                newItem = createRoleItem(unitLabel, role, roleCount, r, 0, 0);
            } else {
                newItem = null;
                for (int count = r.getMaximumCount(); count > 0; count--) {
                    List<AbstractGoods> req = unit.getGoodsDifference(r, count);
                    int price = uloc.priceGoods(req);
                    if (price < 0) continue;
                    if (unit.getOwner().checkGold(price)) {
                        newItem = createRoleItem(unitLabel, role, roleCount,
                                                 r, count, price);
                        break;
                    }
                }
            }
            if (newItem != null) {
                this.add(newItem);
                separatorNeeded = true;
            }
        }

        UnitType newUnitType = unit.getType()
            .getTargetType(ChangeType.CLEAR_SKILL, unit.getOwner());
        if (newUnitType != null) {
            if (separatorNeeded) this.addSeparator();
            JMenuItem menuItem = Utility.localizedMenuItem("quickActionMenu.clearSpeciality",
                new ImageIcon(
                    gui.getImageLibrary().getTinyUnitImage(newUnitType)));
            menuItem.setActionCommand(UnitAction.CLEAR_SPECIALITY.toString());
            menuItem.addActionListener(unitLabel);
            this.add(menuItem);
            if (unit.getLocation() instanceof Building
                && !((Building)unit.getLocation()).canAddType(newUnitType)) {
                menuItem.setEnabled(false);
            }
            separatorNeeded = true;
        }
        return separatorNeeded;
    }


    /**
     * Creates a menu for some goods.
     */
    private void createGoodsMenu(final GoodsLabel goodsLabel) {
        final InGameController igc = freeColClient.getInGameController();
        final Player player = freeColClient.getMyPlayer();
        final Goods goods = goodsLabel.getGoods();

        this.setLabel(Messages.message("cargo"));
        JMenuItem name = new JMenuItem(
            Messages.getName(goods) + " (" + Messages.message("colopedia") + ")",
            new ImageIcon(
                gui.getImageLibrary().getSmallIconImage(goods.getType())));
        name.addActionListener((ActionEvent ae) -> {
                gui.showColopediaPanel(goods.getType().getId());
            });
        this.add(name);

        int amount = (player.getMarket() == null) ? 0
            : player.getMarket().getSalePrice(goods.getType(), 
                                              goods.getAmount());
        if (amount > 0) amount -= amount * player.getTax() / 100;
        if (amount > 0) {
            JMenuItem price = Utility.localizedMenuItem(StringTemplate
                .template("quickActionMenu.profit")
                .addAmount("%amount%", amount));
            this.add(price);
        }
        
        if (goods.getLocation() instanceof Colony) {
            Colony colony = (Colony)goods.getLocation();
            addLoadItems(goods, colony.getTile());

        } else if (goods.getLocation() instanceof Europe) {
            Europe europe = (Europe)goods.getLocation();
            addLoadItems(goods, europe);
            if (!player.canTrade(goods.getType())) {
                addPayArrears(goods.getType());
            }

        } else if (goods.getLocation() instanceof Unit) {
            Unit carrier = (Unit)goods.getLocation();

            if (carrier.getLocation().getColony() != null
                || (carrier.isInEurope()
                    && player.canTrade(goods.getType()))) {
                JMenuItem unload = Utility.localizedMenuItem("unload");
                unload.addActionListener((ActionEvent ae) -> {
                        if ((ae.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                            promptForGoods(goods);
                        }
                        igc.unloadCargo(goods, false);
                    });
                this.add(unload);
            } else {
                if (carrier.isInEurope()
                    && !player.canTrade(goods.getType())) {
                    addPayArrears(goods.getType());
                }

                JMenuItem dump = Utility.localizedMenuItem("dumpCargo");
                dump.addActionListener((ActionEvent ae) -> {
                        if ((ae.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                            promptForGoods(goods);
                        }
                        igc.unloadCargo(goods, true);
                        // FIXME: fix pcls so this hackery can go away
                        if (parentPanel instanceof CargoPanel) {
                            ((CargoPanel) parentPanel).initialize();
                        }
                        parentPanel.revalidate();
                    });
                this.add(dump);
            }
        }
    }

    /**
     * Add an item to pay arrears on the given goods type.
     *
     * @param goodsType The <code>GoodsType</code> to pay arrears on.
     */
    private void addPayArrears(final GoodsType goodsType) {
        final InGameController igc = freeColClient.getInGameController();

        JMenuItem menuItem = Utility.localizedMenuItem("payArrears");
        menuItem.addActionListener((ActionEvent ae) -> {
                igc.payArrears(goodsType);
                // FIXME: fix pcls so this hackery can go away
                if (parentPanel instanceof CargoPanel) {
                    CargoPanel cargoPanel = (CargoPanel) parentPanel;
                    cargoPanel.initialize();
                }
                parentPanel.revalidate();
            });
        this.add(menuItem);
    }


    /**
     * Creates menu items for some goods in a market.
     *
     * @param marketLabel The <code>MarketLabel</code> to create entries for.
     */
    private void createMarketMenu(MarketLabel marketLabel) {
        final AbstractGoods ag = marketLabel.getAbstractGoods();
        final Player player = freeColClient.getMyPlayer();

        this.setLabel(Messages.message("cargo"));
        JMenuItem name = new JMenuItem(
            Messages.getName(ag) + " (" + Messages.message("colopedia") + ")",
            new ImageIcon(
                gui.getImageLibrary().getSmallIconImage(ag.getType())));
        name.addActionListener((ActionEvent ae) -> {
                gui.showColopediaPanel(ag.getType().getId());
            });
        this.add(name);

        final Europe europe = this.freeColClient.getMyPlayer().getEurope();
        addMarketItems(ag, europe);

        if (!player.canTrade(ag.getType())) {
            addPayArrears(ag.getType());
        }
    }

    private boolean addMarketItems(final AbstractGoods ag, Europe europe) {
        final InGameController igc = freeColClient.getInGameController();
        final Goods goods = new Goods(europe.getGame(), null,
                                      ag.getType(), ag.getAmount());
        boolean added = false;
        for (final Unit unit : europe.getUnitList()) {
            if (unit.isCarrier() && unit.canCarryGoods()
                && unit.canAdd(goods)) {
                StringTemplate template = StringTemplate.template("loadOnTo")
                    .addStringTemplate("%unit%",
                        unit.getLabel(Unit.UnitLabelType.NATIONAL));
                JMenuItem menuItem = Utility.localizedMenuItem(template);
                menuItem.addActionListener((ActionEvent ae) -> {
                        if ((ae.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                            promptForGoods(ag);
                        }
                        igc.buyGoods(ag.getType(), ag.getAmount(), unit);
                    });
                this.add(menuItem);
                added = true;
            }
        }
        return added;
    }


    /**
     * Creates a menu for a tile.
     */
    private void createTileMenu(final ASingleTilePanel singleTilePanel) {
        if (singleTilePanel.getColonyTile() != null
            && singleTilePanel.getColonyTile().getColony() != null) {
            addTileItem(singleTilePanel.getColonyTile().getWorkTile());
        }
    }

    /**
     * Add a menu item for the tile a unit is working.
     *
     * @param unitLabel The <code>UnitLabel</code> specifying the unit.
     * @return True if an item was added.
     */
    private boolean addTileItem(final UnitLabel unitLabel) {
        final Unit unit = unitLabel.getUnit();
        if (unit.getWorkTile() != null) {
            final Tile tile = unit.getWorkTile().getWorkTile();
            addTileItem(tile);
            return true;
        }
        return false;
    }

    /**
     * Add a menu item to show the tile panel for a tile.
     *
     * @param tile The <code>Tile</code> to use.
     */
    private void addTileItem(final Tile tile) {
        if (tile != null) {
            JMenuItem menuItem = new JMenuItem(Messages.getName(tile));
            menuItem.addActionListener((ActionEvent ae) -> {
                    gui.showTilePanel(tile);
            });
            this.add(menuItem);
        }
    }
}
