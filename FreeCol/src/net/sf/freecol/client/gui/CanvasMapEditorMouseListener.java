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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComponent;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.control.MapEditorController;
import net.sf.freecol.client.gui.panel.MapEditorTransformPanel.TileTypeTransform;
import net.sf.freecol.client.gui.panel.RiverStyleDialog;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.TileImprovement;
import net.sf.freecol.server.generator.TerrainGenerator;


// TODO: Auto-generated Javadoc
/**
 * Listens to the mouse being moved at the level of the Canvas.
 *
 * @see CanvasMapEditorMouseEvent
 */
public final class CanvasMapEditorMouseListener extends AbstractCanvasListener
    implements MouseListener, MouseMotionListener {

    /** The Constant logger. */
    private static final Logger logger = Logger.getLogger(CanvasMapEditorMouseListener.class.getName());

    /** The end point. */
    private Point endPoint;
    
    /** The start point. */
    private Point startPoint;


    /**
     * The constructor to use.
     *
     * @param freeColClient the free col client
     * @param canvas The component this object gets created for.
     */
    public CanvasMapEditorMouseListener(FreeColClient freeColClient, Canvas canvas) {
        super(freeColClient, canvas);
    }


    /**
     * Get the GUI.
     *
     * @return The GUI.
     */
    private GUI getGUI() {
        return freeColClient.getGUI();
    }

    /**
     * This method can be called to make sure the map is loaded
     * There is no point executing mouse events if the map is not loaded.
     *
     * @return the map
     */
    private Map getMap() {
        return (freeColClient.getGame() == null) ? null
            : freeColClient.getGame().getMap();
    }

    /**
     * Draw a box on screen.
     *
     * @param component The <code>JComponent</code> to draw on.
     * @param startPoint The starting <code>Point</code>.
     * @param endPoint The end <code>Point</code>.
     */
    private void drawBox(JComponent component,
                         Point startPoint, Point endPoint) {
        if (startPoint == null || endPoint == null
            || startPoint.distance(endPoint) == 0
            || freeColClient.getMapEditorController() == null)
            return;

        Graphics2D graphics = (Graphics2D)component.getGraphics();
        graphics.setColor(Color.WHITE);
        int x = Math.min(startPoint.x, endPoint.x);
        int y = Math.min(startPoint.y, endPoint.y);
        int width = Math.abs(startPoint.x - endPoint.x);
        int height = Math.abs(startPoint.y - endPoint.y);
        graphics.drawRect(x, y, width, height);
    }


    // Implement MouseListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if (getMap() == null) return;

        try {
            if (e.getClickCount() > 1) {
                canvas.convertToMapTile(e.getX(), e.getY());
            } else {
                canvas.requestFocus();
            }
        } catch (Exception ex) {
            logger.log(Level.WARNING, "Error in mouseClicked!", ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mousePressed(MouseEvent e) {
        if (getMap() == null || !e.getComponent().isEnabled()) return;

        try {
            if (e.getButton() == MouseEvent.BUTTON1) {
                Tile tile = canvas.convertToMapTile(e.getX(), e.getY());
                if (tile != null) getGUI().setSelectedTile(tile);
                startPoint = endPoint = null;

            } else if (e.getButton() == MouseEvent.BUTTON2) {
                startPoint = e.getPoint();
                JComponent component = (JComponent)e.getSource();
                drawBox(component, startPoint, endPoint);

            } else if (e.getButton() == MouseEvent.BUTTON3
                || e.isPopupTrigger()) {
                startPoint = e.getPoint();
                Tile tile = canvas.convertToMapTile(e.getX(), e.getY());
                if (tile != null) {
                    if (tile.hasRiver()) {
                        TileImprovement river = tile.getRiver();
                        String style = canvas.showRiverStyleDialog(tile);
                        if (style == null) {
                            // cancelled
                        } else if (RiverStyleDialog.DELETE.equals(style)) {
                            tile.getTileItemContainer().removeTileItem(river);
                        } else {
                            river.updateRiverConnections(style);
                        }
                    }
                    if (tile.getIndianSettlement() != null) {
                        canvas.showEditSettlementDialog(tile.getIndianSettlement());
                    }
                } else {
                    getGUI().setSelectedTile(null);
                }
            }
        } catch (Exception ex) {
            logger.log(Level.WARNING, "Error in mousePressed!", ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        if (getMap() == null
            || e.getButton() == MouseEvent.BUTTON1
            || getGUI().getFocus() == null) return;
        final JComponent component = (JComponent)e.getSource();
        final MapEditorController controller
            = freeColClient.getMapEditorController();
        final boolean isTransformActive = controller.getMapTransform() != null;

        endPoint = e.getPoint();
        if (startPoint == null) startPoint = endPoint;
        drawBox(component, startPoint, endPoint);
        Tile start = canvas.convertToMapTile(startPoint.x, startPoint.y);
        Tile end = (startPoint == endPoint) ? start
            : canvas.convertToMapTile(endPoint.x, endPoint.y);

        // edit 2 more conditions in if statement.  we need to
        // check for coordinator of X and Y if (x,y) outside of
        // map then dont focus to that else setfocus to that
        // position no option selected, just center map
        if (!isTransformActive && end.getX() >= 0 && end.getY() >= 0) {
            getGUI().setFocus(end);
            return;
        }

        // find the area to transform
        int minX;
        int maxX;
        int minY;
        int maxY;
        if (start.getX() < end.getX()) {
            minX = start.getX();
            maxX = end.getX();
        } else {
            minX = end.getX();
            maxX = start.getX();
        }
        if (start.getY() < end.getY()) {
            minY = start.getY();
            maxY = end.getY();
        } else {
            minY = end.getY();
            maxY = start.getY();
        }

        // apply transformation to all tiles in the area
        Tile t = null;
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                t = getMap().getTile(x, y);
                if (t != null) {
                    controller.transform(t);
                }
            }
        }
        if (controller.getMapTransform() instanceof TileTypeTransform) {
            for (int x = minX - 2; x <= maxX + 2; x++) {
                for (int y = minY - 2; y <= maxY + 2; y++) {
                    t = getMap().getTile(x, y);
                    if (t != null && t.getType().isWater()) {
                        TerrainGenerator.encodeStyle(t);
                    }
                }
            }
        }
        getGUI().refresh();
        canvas.requestFocus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseEntered(MouseEvent e) {
    	// Ignore for now.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseExited(MouseEvent e) {
    	// Ignore for now.
    } 


    // Implement MouseMotionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        if (getMap() == null) return;
        final JComponent component = (JComponent)e.getSource();

        drawBox(component, startPoint, endPoint);
        endPoint = e.getPoint();
        drawBox(component, startPoint, endPoint);

        performDragScrollIfActive(e);

        getGUI().refresh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        if (getMap() == null || e.getY() < AUTO_SCROLL_SPACE) return;

        performAutoScrollIfActive(e);
    }
}
