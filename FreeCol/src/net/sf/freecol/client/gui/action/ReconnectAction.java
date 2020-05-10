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
 * An action for reconnecting to the server.
 */
public class ReconnectAction extends FreeColAction {

<<<<<<< HEAD
    public static final String ID = "reconnectAction";
=======
    public static final String id = "reconnectAction";
>>>>>>> 07fe25ba89baa3ce1f5d697c2eeb98b11cbb2dc6


    /**
     * Creates a new <code>DeclareIndependenceAction</code>.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     */
    public ReconnectAction(FreeColClient freeColClient) {
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
        igc().reconnect();
    }
}
