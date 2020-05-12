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
import net.sf.freecol.client.ClientOptions;

import net.sf.freecol.client.FreeColClient;


// TODO: Auto-generated Javadoc
/**
 * Change view in on the minimap.
 */
public class MiniMapToggleViewAction extends MapboardAction {
    
    /** The Constant ID. */
    public static final String ID = "miniMapToggleBordersAction";
    
    
    /**
     * Creates a new <code>MiniMapToggleViewAction</code>.
     *
     */
    static String togglePolitics = "toggle_view_politics";
    
    /**
     * Instantiates a new mini map toggle view action.
     *
     * @param freeColClient the free col client
     */
    public MiniMapToggleViewAction(FreeColClient freeColClient) {
        super(freeColClient, ID);

		addImageIcons(togglePolitics);
    }

    /**
     * Creates a new <code>MiniMapToggleViewAction</code>.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     * @param b a <code>boolean</code> value
     */
    public MiniMapToggleViewAction(FreeColClient freeColClient, boolean b) {
        super(freeColClient, ID + ".secondary");
 
        addImageIcons(togglePolitics);
    }

    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        getGUI().miniMapToggleViewControls();

        if (freeColClient.getClientOptions().getBoolean(ClientOptions.MINIMAP_TOGGLE_BORDERS)) {
            addImageIcons(togglePolitics);
        } else {
            addImageIcons("toggle_view_economic");
        }
    }
}
