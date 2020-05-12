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

package net.sf.freecol.client.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import net.sf.freecol.client.ClientOptions;
import net.sf.freecol.client.FreeColClient;

import static net.sf.freecol.common.util.StringUtils.*;


// TODO: Auto-generated Javadoc
/**
 * Display text over tiles.
 */
public class DisplayTileTextAction extends SelectableAction {


    /** The Constant ID. */
    public static final String ID = "displayTileTextAction.";

    /**
     * The Enum DisplayText.
     */
    // FIXME: make ClientOptions use enum
    public enum DisplayText {
        
        /** The empty. */
        EMPTY, 
 /** The names. */
 NAMES, 
 /** The owners. */
 OWNERS, 
 /** The regions. */
 REGIONS;

        /**
         * Gets the key.
         *
         * @return the key
         */
        public String getKey() {
            return getEnumKey(this);
        }
    }

    /** The Constant accelerators. */
    private static final int[] accelerators = {
        KeyEvent.VK_E,
        KeyEvent.VK_N,
        KeyEvent.VK_O,
        KeyEvent.VK_R
    };

    /** The display. */
    private DisplayText display = null;


    /**
     * Creates this action.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     * @param type a <code>DisplayText</code> value
     */
    public DisplayTileTextAction(FreeColClient freeColClient,
                                 DisplayText type) {
        super(freeColClient, ID + type.getKey(),
              ClientOptions.DISPLAY_TILE_TEXT);
        display = type;
        setAccelerator(KeyStroke.getKeyStroke(accelerators[type.ordinal()],
                KeyEvent.CTRL_MASK | KeyEvent.SHIFT_MASK));
    }


    // Override SelectableAction

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean shouldBeSelected() {
        return super.shouldBeEnabled()
            && freeColClient.getClientOptions() != null
            && display != null
            && freeColClient.getClientOptions().getDisplayTileText()
                == display.ordinal();
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (((JRadioButtonMenuItem)ae.getSource()).isSelected()) {
            freeColClient.getClientOptions()
                .setInteger(ClientOptions.DISPLAY_TILE_TEXT, display.ordinal());
            getGUI().refresh();
        }
    }
}
