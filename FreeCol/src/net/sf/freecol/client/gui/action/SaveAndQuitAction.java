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
 * An action for prompting the user to save before quitting the game.
 */
public class SaveAndQuitAction extends FreeColAction {

<<<<<<< HEAD
    public static final String ID = "saveAndQuitAction";
=======
    public static final String id = "saveAndQuitAction";
>>>>>>> 07fe25ba89baa3ce1f5d697c2eeb98b11cbb2dc6


    /**
     * Creates a new <code>SaveAndQuitAction</code>.
     *
     * @param freeColClient The main controller object for the client.
     */
    public SaveAndQuitAction(FreeColClient freeColClient) {
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
        if (freeColClient.isMapEditor()) {
            freeColClient.getMapEditorController().saveGame();
        } else {
            if (!igc().saveGame()) return;
        }
        freeColClient.quit();
    }
}

