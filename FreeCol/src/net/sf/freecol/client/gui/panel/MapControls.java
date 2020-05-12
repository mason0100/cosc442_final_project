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

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLayeredPane;
import net.sf.freecol.client.ClientOptions;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.Canvas;
import net.sf.freecol.client.gui.GUI;
import net.sf.freecol.client.gui.action.ActionManager;
import net.sf.freecol.client.gui.action.BuildColonyAction;
import net.sf.freecol.client.gui.action.DisbandUnitAction;
import net.sf.freecol.client.gui.action.FortifyAction;
import net.sf.freecol.client.gui.action.FreeColAction;
import net.sf.freecol.client.gui.action.MiniMapToggleViewAction;
import net.sf.freecol.client.gui.action.MiniMapToggleFogOfWarAction;
import net.sf.freecol.client.gui.action.MiniMapZoomInAction;
import net.sf.freecol.client.gui.action.MiniMapZoomOutAction;
import net.sf.freecol.client.gui.action.SentryAction;
import net.sf.freecol.client.gui.action.SkipUnitAction;
import net.sf.freecol.client.gui.action.WaitAction;
import net.sf.freecol.client.gui.panel.MapEditorTransformPanel.MapTransform;

import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.TileImprovementType;
import net.sf.freecol.common.model.Unit;


// TODO: Auto-generated Javadoc
/**
 * A collection of panels and buttons that are used to provide the
 * user with a more detailed view of certain elements on the map and
 * also to provide a means of input in case the user can't use the
 * keyboard.
 *
 * The MapControls are useless by themselves, this object needs to be
 * placed on a JComponent in order to be usable.
 */
public abstract class MapControls {

    /** The Constant MAP_WIDTH. */
    public static final int MAP_WIDTH = 220;
    
    /** The Constant MAP_HEIGHT. */
    public static final int MAP_HEIGHT = 128;
    
    /** The Constant GAP. */
    public static final int GAP = 4;
    
    /** The Constant CONTROLS_LAYER. */
    public static final int CONTROLS_LAYER = JLayeredPane.MODAL_LAYER;

    /** The free col client. */
    protected final FreeColClient freeColClient;
    
    /** The info panel. */
    protected final InfoPanel infoPanel;
    
    /** The mini map. */
    protected final MiniMap miniMap;
    
    /** The mini map toggle borders. */
    protected final UnitButton miniMapToggleBorders;
    
    /** The mini map toggle fog of war button. */
    protected final UnitButton miniMapToggleFogOfWarButton;
    
    /** The mini map zoom out button. */
    protected final UnitButton miniMapZoomOutButton;
    
    /** The mini map zoom in button. */
    protected final UnitButton miniMapZoomInButton;
    
    /** The unit buttons. */
    protected final List<UnitButton> unitButtons;


    /**
     * The basic constructor.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     * @param useSkin the use skin
     */
    public MapControls(final FreeColClient freeColClient, boolean useSkin) {
        this.freeColClient = freeColClient;

        infoPanel = new InfoPanel(freeColClient, useSkin);
        miniMap = new MiniMap(freeColClient);
        final ActionManager am = freeColClient.getActionManager();
        unitButtons = new ArrayList<>();

        final Game game = freeColClient.getGame();
        if (game != null) {
            unitButtons.add(new UnitButton(am, WaitAction.ID));
            unitButtons.add(new UnitButton(am, SkipUnitAction.ID));
            unitButtons.add(new UnitButton(am, SentryAction.ID));
            unitButtons.add(new UnitButton(am, FortifyAction.ID));
            
            final Specification spec = game.getSpecification();
            if (spec != null) {
                for (TileImprovementType type : spec.getTileImprovementTypeList()) {
                    FreeColAction action = am.getFreeColAction(type.getSuffix()
                                                               + "Action");
                    if (!type.isNatural() && action != null
                        && action.hasOrderButtons()) {
                        unitButtons.add(new UnitButton(am, type.getSuffix() + "Action"));
                    }
                }
            }
            unitButtons.add(new UnitButton(am, BuildColonyAction.ID));
            unitButtons.add(new UnitButton(am, DisbandUnitAction.ID));
        }
        miniMapToggleBorders = new UnitButton(am, MiniMapToggleViewAction.ID);
        miniMapToggleFogOfWarButton = new UnitButton(am, MiniMapToggleFogOfWarAction.ID);
        miniMapZoomOutButton = new UnitButton(am, MiniMapZoomOutAction.ID);
        miniMapZoomInButton = new UnitButton(am, MiniMapZoomInAction.ID);

        miniMapToggleBorders.setFocusable(false);
        miniMapToggleFogOfWarButton.setFocusable(false);
        miniMapZoomOutButton.setFocusable(false);
        miniMapZoomInButton.setFocusable(false);

        //
        // Don't allow them to gain focus
        //
        infoPanel.setFocusable(false);

        for (UnitButton button : unitButtons) {
            button.setFocusable(false);
        }
    }


    /**
     * Adds the map controls to the given component.
     *
     * @param component The component to add the map controls to.
     */
    public abstract void addToComponent(Canvas component);

    /**
     * Can zoom in map controls.
     *
     * @return true, if successful
     */
    public boolean canZoomInMapControls() {
        return miniMap != null && miniMap.canZoomIn();
    }

    /**
     * Can zoom out map controls.
     *
     * @return true, if successful
     */
    public boolean canZoomOutMapControls() {
        return miniMap != null && miniMap.canZoomOut();
    }

    /**
     * Checks if is showing.
     *
     * @return true, if is showing
     */
    public abstract boolean isShowing();

    /**
     * Removes the map controls from the parent canvas component.
     *
     * @param canvas <code>Canvas</code> parent
     */
    public abstract void removeFromComponent(Canvas canvas);

    /**
     * Repaint.
     */
    public abstract void repaint();
    
    /**
     * Toggle view.
     */
    public void toggleView() {
        miniMap.setToggleBordersOption(!freeColClient.getClientOptions()
            .getBoolean(ClientOptions.MINIMAP_TOGGLE_BORDERS));
        repaint();
    }
    
    /**
     * Toggle fog of war.
     */
    public void toggleFogOfWar() {
        miniMap.setToggleFogOfWarOption(!freeColClient.getClientOptions()
            .getBoolean(ClientOptions.MINIMAP_TOGGLE_FOG_OF_WAR));
        repaint();
    }

    /**
     * Updates this <code>MapControls</code>.
     */
    public void update() {
        final GUI gui = freeColClient.getGUI();
        Unit unit = gui.getActiveUnit();

        switch (gui.getViewMode()) {
        case GUI.MOVE_UNITS_MODE:
            infoPanel.update(unit);
            break;
        case GUI.VIEW_TERRAIN_MODE:
            infoPanel.update(gui.getSelectedTile());
            break;
        default:
            break;
        }
        for (UnitButton ub : unitButtons) {
            ub.setVisible(unit != null);
        }
    }

    /**
     * Updates this <code>InfoPanel</code>.
     *
     * @param mapTransform The current MapTransform.
     */
    public void update(MapTransform mapTransform) {
        if (infoPanel != null) {
            infoPanel.update(mapTransform);
        }
    }
    
    /**
     * Zoom in.
     */
    public void zoomIn() {
        miniMap.zoomIn();
        repaint();
    }

    /**
     * Zoom out.
     */
    public void zoomOut() {
        miniMap.zoomOut();
        repaint();
    }
}
