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

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.tree.DefaultMutableTreeNode;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.ImageLibrary;
import net.sf.freecol.client.gui.action.ColopediaAction.PanelType;
import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.model.Ability;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.BuildableType;
import net.sf.freecol.common.model.FreeColGameObjectType;
import net.sf.freecol.common.model.GoodsType;
import net.sf.freecol.common.model.Modifier;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.ResourceType;
import net.sf.freecol.common.model.UnitType;
import net.sf.freecol.common.resources.ResourceManager;


// TODO: Auto-generated Javadoc
/**
 * This panel displays details of game objects in the Colopedia.
 *
 * @param <T> the generic type
 */
public abstract class ColopediaGameObjectTypePanel<T extends FreeColGameObjectType>
    extends FreeColPanel implements ColopediaDetailPanel<T> {


    /** The enclosing colopedia panel. */
    private ColopediaPanel colopediaPanel; 

    /** The specific panel id. */
    private final String id;


    /**
     * Create a new Colopedia game object type panel.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     * @param colopediaPanel The parent <code>ColopediaPanel</code>.
     * @param id The panel type identifier.
     */
    public ColopediaGameObjectTypePanel(FreeColClient freeColClient,
                                        ColopediaPanel colopediaPanel,
                                        String id) {
        super(freeColClient);

        this.colopediaPanel = colopediaPanel;
        this.id = "colopediaAction." + id;
    }


    /**
     * Get the panel id.
     *
     * @return The panel id, usually "colopediaAction.*".
     */
    protected String getId() {
        return id;
    }

    /**
     * Get the name of this ColopediaDetailPanel, which is generally
     * used to label the root node of its sub-tree.
     *
     * @return The panel name.
     */
    @Override
    public String getName() {
        return Messages.getName(id);
    }

    /**
     * Builds a subtree including all the given objects.
     *
     * @param root a <code>DefaultMutableTreeNode</code>
     * @param types a List of FreeColGameObjectTypes
     */
    public void addSubTrees(DefaultMutableTreeNode root, List<T> types) {
        addSubTrees(root, id, types);
    }

    /**
     * Builds a subtree including all the given objects.
     *
     * @param root a <code>DefaultMutableTreeNode</code>
     * @param id The object identifier of the new branch node.
     * @param types a List of FreeColGameObjectTypes
     */
    public void addSubTrees(DefaultMutableTreeNode root, String id,
                            List<T> types) {
        String name = getName();
        ColopediaTreeItem cti = new ColopediaTreeItem(this, id, name, null);
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(cti);
        int width = ImageLibrary.ICON_SIZE.width;
        int height = ImageLibrary.ICON_SIZE.height;
        for (FreeColGameObjectType type : types) {
            Image image = (type instanceof GoodsType)
                ? ImageLibrary.getMiscImage("image.icon." + type.getId(),
                                            ImageLibrary.ICON_SIZE)
                : (type instanceof ResourceType)
                ? ImageLibrary.getMiscImage("image.tileitem." + type.getId(),
                                            ImageLibrary.ICON_SIZE)
                : (type instanceof Nation)
                ? ImageLibrary.getMiscIconImage(type, ImageLibrary.ICON_SIZE)
                : (type instanceof BuildableType)
                ? ImageLibrary.getBuildableImage((BuildableType)type,
                                                 ImageLibrary.ICON_SIZE)
                : ImageLibrary.getMiscImage(ResourceManager.REPLACEMENT_IMAGE,
                                            ImageLibrary.ICON_SIZE);
            int x = (width - image.getWidth(null)) / 2;
            int y = (height - image.getHeight(null)) / 2;
            BufferedImage centeredImage
                = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = centeredImage.createGraphics();
            g.drawImage(image, x, y, null);
            g.dispose();
            node.add(buildItem(type, new ImageIcon(centeredImage)));
        }
        root.add(node);
    }

    /**
     * Builds the item.
     *
     * @param type the type
     * @param icon the icon
     * @return the default mutable tree node
     */
    protected DefaultMutableTreeNode buildItem(FreeColGameObjectType type,
                                               ImageIcon icon) {
        String name = Messages.getName(type);
        return new DefaultMutableTreeNode(new ColopediaTreeItem(this, 
                type.getId(), name, icon));
    }

    /**
     * Gets the button.
     *
     * @param type the type
     * @param text the text
     * @param icon the icon
     * @return the button
     */
    protected JButton getButton(FreeColGameObjectType type, String text,
                                ImageIcon icon) {
        JButton button = Utility.getLinkButton((text != null) ? text
            : Messages.getName(type), icon, type.getId());
        button.addActionListener(colopediaPanel);
        return button;
    }

    /**
     * Gets the button.
     *
     * @param panelType the panel type
     * @param text the text
     * @param icon the icon
     * @return the button
     */
    protected JButton getButton(PanelType panelType, String text,
                                ImageIcon icon) {
        JButton button = Utility.getLinkButton(text, icon,
            "colopediaAction." + panelType.getKey());
        button.addActionListener(colopediaPanel);
        return button;
    }

    /**
     * Gets the button.
     *
     * @param type the type
     * @return the button
     */
    protected JButton getButton(FreeColGameObjectType type) {
        return getButton(type, null, null);
    }

    /**
     * Gets the resource button.
     *
     * @param resourceType the resource type
     * @return the resource button
     */
    protected JButton getResourceButton(final ResourceType resourceType) {
        return getButton(resourceType, null, new ImageIcon(getImageLibrary()
            .getMiscImage("image.tileitem." + resourceType.getId())));
    }

    /**
     * Gets the goods button.
     *
     * @param goodsType the goods type
     * @return the goods button
     */
    protected JButton getGoodsButton(final GoodsType goodsType) {
        return getGoodsButton(goodsType, null);
    }

    /**
     * Gets the goods button.
     *
     * @param goodsType the goods type
     * @param amount the amount
     * @return the goods button
     */
    protected JButton getGoodsButton(final GoodsType goodsType, int amount) {
        return getGoodsButton(goodsType, Integer.toString(amount));
    }

    /**
     * Gets the goods button.
     *
     * @param goods the goods
     * @return the goods button
     */
    protected JButton getGoodsButton(final AbstractGoods goods) {
        return getGoodsButton(goods.getType(), goods.getAmount());
    }

    /**
     * Gets the goods button.
     *
     * @param goodsType the goods type
     * @param text the text
     * @return the goods button
     */
    protected JButton getGoodsButton(final GoodsType goodsType, String text) {
        JButton result = getButton(goodsType, text,
            new ImageIcon(getImageLibrary().getIconImage(goodsType)));
        result.setToolTipText(Messages.getName(goodsType));
        return result;
    }

    /**
     * Gets the unit button.
     *
     * @param au the au
     * @return the unit button
     */
    protected JButton getUnitButton(AbstractUnit au) {
        return getUnitButton(au.getType(getSpecification()), au.getRoleId());
    }

    /**
     * Gets the unit button.
     *
     * @param unitType the unit type
     * @param roleId the role id
     * @return the unit button
     */
    protected JButton getUnitButton(final UnitType unitType, String roleId) {
        ImageIcon unitIcon = new ImageIcon(
            getImageLibrary().getSmallUnitImage(unitType, roleId, false));
        JButton unitButton = getButton(unitType, null, unitIcon);
        unitButton.setHorizontalAlignment(JButton.LEFT);
        return unitButton;
    }

    /**
     * Gets the unit button.
     *
     * @param unitType the unit type
     * @return the unit button
     */
    protected JButton getUnitButton(final UnitType unitType) {
        return getUnitButton(unitType, unitType.getDisplayRoleId());
    }

    /**
     * Gets the modifier component.
     *
     * @param modifier the modifier
     * @return the modifier component
     */
    public JComponent getModifierComponent(Modifier modifier) {
        try {
            GoodsType goodsType = getSpecification()
                .getGoodsType(modifier.getId());
            String bonus = ModifierFormat.getModifierAsString(modifier);
            return getGoodsButton(goodsType, bonus);
        } catch (Exception e) {
            // not a production bonus
            JLabel label = new JLabel(ModifierFormat.getFeatureAsString(modifier) + ": "
                + ModifierFormat.getModifierAsString(modifier));
            label.setToolTipText(Messages.getShortDescription(modifier));
            return label;
        }
    }

    /**
     * Gets the ability component.
     *
     * @param ability the ability
     * @return the ability component
     */
    public JLabel getAbilityComponent(Ability ability) {
        if (ability.getValue()) {
            JLabel label = new JLabel(ModifierFormat.getFeatureAsString(ability));
            label.setToolTipText(Messages.getShortDescription(ability));
            return label;
        } else {
            return null;
        }
    }

    /**
     * Append required abilities.
     *
     * @param doc the doc
     * @param buildableType the buildable type
     * @throws BadLocationException the bad location exception
     */
    public void appendRequiredAbilities(StyledDocument doc, BuildableType buildableType)
        throws BadLocationException {
        List<JButton> requiredTypes = new ArrayList<>();
        for (Entry<String, Boolean> entry
                 : buildableType.getRequiredAbilities().entrySet()) {
            String getstyleRegular = "regular";
			doc.insertString(doc.getLength(),
                             Messages.getName(entry.getKey()),
                             doc.getStyle(getstyleRegular));
            requiredTypes.clear();
            for (FreeColGameObjectType type : getSpecification()
                     .getTypesProviding(entry.getKey(), entry.getValue())) {
                JButton typeButton = getButton(type);
                typeButton.addActionListener(this);
                requiredTypes.add(typeButton);
            }
            if (!requiredTypes.isEmpty()) {
                doc.insertString(doc.getLength(), " (", doc.getStyle(getstyleRegular));
                String getstyleButton = "button";
				StyleConstants.setComponent(doc.getStyle(getstyleButton), requiredTypes.get(0));
                doc.insertString(doc.getLength(), " ", doc.getStyle(getstyleButton));
                for (int index = 1; index < requiredTypes.size(); index++) {
                    JButton button = requiredTypes.get(index);
                    doc.insertString(doc.getLength(), " / ", doc.getStyle(getstyleRegular));
                    StyleConstants.setComponent(doc.getStyle(getstyleButton), button);
                    doc.insertString(doc.getLength(), " ", doc.getStyle(getstyleButton));
                }
                doc.insertString(doc.getLength(), ")", doc.getStyle(getstyleRegular));
            }
            doc.insertString(doc.getLength(), "\n", doc.getStyle(getstyleRegular));
        }
    }


    // Override Component

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeNotify() {
        super.removeNotify();

        colopediaPanel = null;
    }
}
