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

import net.sf.freecol.client.FreeColClient;


/**
 * Returns to the <code>MainPanel</code>.
 * All in-game components are removed.
 *
 * @see net.sf.freecol.client.gui.panel.MainPanel
 */
public class ShowMainAction extends FreeColAction {

<<<<<<< HEAD
    public static final String ID = "showMainAction";
=======
    public static final String id = "showMainAction";
>>>>>>> 07fe25ba89baa3ce1f5d697c2eeb98b11cbb2dc6


    /**
     * Creates this action.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     */
    public ShowMainAction(FreeColClient freeColClient) {
<<<<<<< HEAD
        super(freeColClient, ID);
=======
        super(freeColClient, id);
>>>>>>> 07fe25ba89baa3ce1f5d697c2eeb98b11cbb2dc6
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!getGUI().confirmStopGame()) return;
        getConnectController().quitGame(true);
        getGUI().removeInGameComponents();
        freeColClient.setMapEditor(false);
        freeColClient.setGame(null);
        getGUI().returnToTitle();
    }
}
