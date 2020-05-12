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

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.Europe;
import net.sf.freecol.common.model.FreeColGameObject;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.UnitType;


// TODO: Auto-generated Javadoc
/**
 * This panel displays a report.
 */
public class ReportPanel extends FreeColPanel {

    /** The Constant logger. */
    protected static final Logger logger = Logger.getLogger(ReportPanel.class.getName());

    /** The report J panel. */
    protected final JPanel reportJPanel;

    /** The header. */
    protected final JLabel header;

    /** The scroll pane. */
    protected JScrollPane scrollPane;


    /**
     * Creates the basic FreeCol report panel.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     * @param key A key for the title.
     */
    public ReportPanel(FreeColClient freeColClient, String key) {
        super(freeColClient, new MigLayout("wrap 1", "[fill]",
                                           "[]30[fill]30[]"));

        header = Utility.localizedHeader(Messages.nameKey(key), false);
        add(header, "cell 0 0, align center");

        reportJPanel = new MigPanel("ReportPanelUI");
        reportJPanel.setOpaque(true);
        reportJPanel.setBorder(createBorder());

        scrollPane = new JScrollPane(reportJPanel,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement( 16 );
        add(scrollPane, "cell 0 1, height 100%, width 100%");
        add(okButton, "cell 0 2, tag ok");

        float scale = getImageLibrary().getScaleFactor();
        getGUI().restoreSavedSize(this, 200 + (int)(scale*850), 200 + (int)(scale*525));
    }


    /**
     * Prepares this panel to be displayed.
     */
    public void initialize() {
        reportJPanel.removeAll();
        reportJPanel.doLayout();
    }

    /**
     * Creates the border.
     *
     * @return the border
     */
    private Border createBorder() {
        return new EmptyBorder(20, 20, 20, 20);
    }

    /**
     * Creates the unit type label.
     *
     * @param au the au
     * @return the j label
     */
    protected JLabel createUnitTypeLabel(AbstractUnit au) {
        UnitType unitType = au.getType(getSpecification());
        String roleId = au.getRoleId();
        int count = au.getNumber();
        ImageIcon unitIcon = new ImageIcon(getImageLibrary().getSmallUnitImage(
            unitType, roleId, (count == 0)));
        JLabel unitLabel = new JLabel(unitIcon);
        unitLabel.setText(String.valueOf(count));
        if (count == 0) {
            unitLabel.setForeground(Color.GRAY);
        }
        unitLabel.setToolTipText(au.getDescription());
        return unitLabel;
    }

    /**
     * Gets the location label for.
     *
     * @param unit the unit
     * @return the location label for
     */
    protected String getLocationLabelFor(Unit unit) {
        if (unit.getDestination() instanceof Map) {
            return Messages.message("sailingToAmerica");
        } else if (unit.getDestination() instanceof Europe) {
            return Messages.message("sailingToEurope");
        } else {
            return Messages.message(unit.getLocation()
                .getLocationLabelFor(unit.getOwner()));
        }
    }

    /**
     * Sets the main component.
     *
     * @param main the new main component
     */
    protected void setMainComponent(Component main) {
        remove(scrollPane);
        add(main, "cell 0 1, height 100%, width 100%");
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        final String command = ae.getActionCommand();
        if (OK.equals(command)) {
            getGUI().removeFromCanvas(this);
        } else {
            FreeColGameObject fco = getGame().getFreeColGameObject(command);
            if (fco != null) {
                getGUI().displayObject(fco);
            } else {
                getGUI().showColopediaPanel(command);
            }
        }
    }

    // Override Component

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeNotify() {
        super.removeNotify();

        removeAll();
        scrollPane = null;
    }
}
