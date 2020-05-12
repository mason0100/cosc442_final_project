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

package net.sf.freecol.client.gui;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;


// TODO: Auto-generated Javadoc
/**
 * The mouse adapter to handle frame movement.
 *
 * @see FrameMotionEvent
 */
public class FrameMotionListener extends MouseAdapter implements MouseMotionListener {

    /** The f. */
    private final JInternalFrame f;

    /** The loc. */
    private Point loc = null;


    /**
     * Instantiates a new frame motion listener.
     *
     * @param f the f
     */
    FrameMotionListener(JInternalFrame f) {
        this.f = f;
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseAdapter#mouseDragged(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        if (loc == null || f.getDesktopPane() == null || f.getDesktopPane().getDesktopManager() == null) {
            return;
        }

        Point p = SwingUtilities.convertPoint((Component) e.getSource(), e.getX(), e.getY(), null);
        int moveX = loc.x - p.x;
        int moveY = loc.y - p.y;
        f.getDesktopPane().getDesktopManager().dragFrame(f, f.getX() - moveX, f.getY() - moveY);
        loc = p;
    }

    //@Override
    //public void mouseMoved(MouseEvent arg0) {
    //}

    /* (non-Javadoc)
     * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e) {
        if (f.getDesktopPane() == null || f.getDesktopPane().getDesktopManager() == null) {
            return;
        }
        loc = SwingUtilities.convertPoint((Component) e.getSource(), e.getX(), e.getY(), null);
        f.getDesktopPane().getDesktopManager().beginDraggingFrame(f);
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        if (loc == null || f.getDesktopPane() == null || f.getDesktopPane().getDesktopManager() == null) {
            return;
        }
        f.getDesktopPane().getDesktopManager().endDraggingFrame(f);
    }

}
