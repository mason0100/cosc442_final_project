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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import net.miginfocom.swing.MigLayout;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.SwingGUI;
import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.model.GameOptions;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.NationOptions;
import net.sf.freecol.common.model.NationOptions.NationState;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.io.FreeColDirectories;
import net.sf.freecol.common.option.MapGeneratorOptions;
import net.sf.freecol.common.option.OptionGroup;


// TODO: Auto-generated Javadoc
/**
 * The panel where you choose your nation and color and connected players are
 * shown.
 */
public final class StartGamePanel extends FreeColPanel {

    /** The Constant logger. */
    private static final Logger logger = Logger.getLogger(StartGamePanel.class.getName());

    /** The Constant START. */
    private static final int START = 0;
    
    /** The Constant CANCEL. */
    private static final int CANCEL = 1;
    
    /** The Constant READY. */
    private static final int READY = 3;
    
    /** The Constant CHAT. */
    private static final int CHAT = 4;
    
    /** The Constant GAME_OPTIONS. */
    private static final int GAME_OPTIONS = 5;
    
    /** The Constant MAP_GENERATOR_OPTIONS. */
    private static final int MAP_GENERATOR_OPTIONS = 6;

    /** The single player game. */
    private boolean singlePlayerGame;

    /** The ready box. */
    private JCheckBox readyBox;

    /** The button chat. */
    private JTextField buttonChat;

    /** The chat area. */
    private JTextArea chatArea;

    /** The button start. */
    private JButton buttonStart;
    
    /** The button cancel. */
    private JButton buttonCancel;
    
    /** The game options. */
    private JButton gameOptions;
    
    /** The map generator options. */
    private JButton mapGeneratorOptions;

    /** The table. */
    private PlayersTable table;


    /**
     * Create the panel from which to start a game.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     */
    public StartGamePanel(FreeColClient freeColClient) {
        super(freeColClient, new MigLayout("fill, wrap 2"));
    }


    /**
     * Initialize.
     *
     * @param singlePlayer the single player
     */
    public void initialize(boolean singlePlayer) {
        removeAll();
        this.singlePlayerGame = singlePlayer;

        if (singlePlayer || getMyPlayer().isAdmin()) {
            Specification spec = getSpecification();

            String gtag = GameOptions.getXMLElementTagName();
            File gof = FreeColDirectories
                .getOptionsFile(FreeColDirectories.GAME_OPTIONS_FILE_NAME);
            OptionGroup gog = (gof.exists()) ? spec.loadOptionsFile(gtag, gof)
                : null;
            gog = (gog != null) ? spec.mergeGroup(gog)
                : spec.getOptionGroup(gtag);
            Specification.saveOptionsFile(gog, gof);

            String mtag = MapGeneratorOptions.getXMLElementTagName();
            File mof = FreeColDirectories
                .getOptionsFile(FreeColDirectories.MAP_GENERATOR_OPTIONS_FILE_NAME);
            OptionGroup mog = (mof.exists()) ? spec.loadOptionsFile(mtag, mof)
                : null;
            mog = (mog != null) ? spec.mergeGroup(mog)
                : spec.getOptionGroup(mtag);
            Specification.saveOptionsFile(mog, mof);
        }

        NationOptions nationOptions = getGame().getNationOptions();


        buttonCancel = Utility.localizedButton("cancel");
        setCancelComponent(buttonCancel);

        JScrollPane chatScroll = null;
        JScrollPane tableScroll;

        table = new PlayersTable(getFreeColClient(), nationOptions,
                                 getMyPlayer());

        buttonStart = Utility.localizedButton("startGame");

        gameOptions = Utility.localizedButton(Messages
            .nameKey(GameOptions.getXMLElementTagName()));

        mapGeneratorOptions = Utility.localizedButton(Messages
            .nameKey(MapGeneratorOptions.getXMLElementTagName()));

        readyBox = new JCheckBox(Messages.message("startGamePanel.iAmReady"));

        if (singlePlayerGame) {
            // If we set the ready flag to false then the player will
            // be able to change the settings as he likes.
            getMyPlayer().setReady(false);
            // Pretend as if the player is ready.
            readyBox.setSelected(true);
        } else {
            readyBox.setSelected(getMyPlayer().isReady());
            buttonChat = new JTextField();
            chatArea = new JTextArea();
            chatScroll = new JScrollPane(chatArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                                         ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        }

        refreshPlayersTable();
        tableScroll = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                                      ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tableScroll.getViewport().setOpaque(false);

        add(tableScroll, "width 600:, grow");
        if (!singlePlayerGame) {
            add(chatScroll, "width 250:, grow");
        }
        add(mapGeneratorOptions, "newline, split 2, growx, top, sg");
        add(gameOptions, "growx, top, sg");
        if (!singlePlayerGame) {

            add(buttonChat, "grow, top");
        }
        add(readyBox, "newline");
        add(buttonStart, "newline, span, split 2, tag ok");
        add(buttonCancel, "tag cancel");

        buttonStart.setActionCommand(String.valueOf(START));
        buttonCancel.setActionCommand(String.valueOf(CANCEL));

        readyBox.setActionCommand(String.valueOf(READY));
        gameOptions.setActionCommand(String.valueOf(GAME_OPTIONS));
        mapGeneratorOptions.setActionCommand(String.valueOf(MAP_GENERATOR_OPTIONS));

        if (!singlePlayerGame) {

            buttonChat.setActionCommand(String.valueOf(CHAT));
            buttonChat.addActionListener(this);

            chatArea.setEditable(false);
            chatArea.setLineWrap(true);
            chatArea.setWrapStyleWord(true);
            chatArea.setText("");
        }

        buttonStart.addActionListener(this);
        buttonCancel.addActionListener(this);

        readyBox.addActionListener(this);
        gameOptions.addActionListener(this);
        mapGeneratorOptions.addActionListener(this);

        setEnabled(true);
    }

    /* (non-Javadoc)
     * @see net.sf.freecol.client.gui.panel.FreeColPanel#requestFocus()
     */
    @Override
    public void requestFocus() {
        buttonStart.requestFocus();

    }

    /**
     * Updates the map generator options displayed on this panel.
     */
    public void updateMapGeneratorOptions() {
        getFreeColClient().getGame().getMapGeneratorOptions()
            .getOption(MapGeneratorOptions.MAP_WIDTH);
        getFreeColClient().getGame().getMapGeneratorOptions()
            .getOption(MapGeneratorOptions.MAP_HEIGHT);
    }

    /**
     * Updates the game options displayed on this panel.
     */
    public void updateGameOptions() {
        // Nothing yet.
    }

    /**
     * Sets whether or not this component is enabled. It also does this for its
     * children.
     *
     * @param enabled 'true' if this component and its children should be
     *            enabled, 'false' otherwise.
     */
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);

        Component[] components = getComponents();
        for (Component component : components) {
            component.setEnabled(enabled);
        }

        if (singlePlayerGame && enabled) {
            readyBox.setEnabled(false);
        }

        if (enabled) {
            buttonStart.setEnabled(getFreeColClient().isAdmin());

        }

        gameOptions.setEnabled(enabled);
    }

    /**
     * Check that the user has not specified degenerate victory conditions
     * that are automatically true.
     *
     * @return True if the victory conditions are sensible.
     */
    private boolean checkVictoryConditions() {
        Specification spec = getSpecification();
        if (singlePlayerGame
            && spec.getBoolean(GameOptions.VICTORY_DEFEAT_EUROPEANS)
            && !spec.getBoolean(GameOptions.VICTORY_DEFEAT_REF)) {
            int n = 0;
            for (Entry<Nation, NationState> e
                     : getGame().getNationOptions().getNations().entrySet()) {
                if (e.getKey().getType().isEuropean()
                    && !e.getKey().isUnknownEnemy()
                    && e.getValue() != NationState.NOT_AVAILABLE) n++;
            }
            if (n == 0) {
                getGUI().showInformationMessage("info.noEuropeans");
                return false;
            }
        }
        return true;
    }

    /**
     * Displays a chat message to the user.
     *
     * @param senderName The name of the player who sent the chat message to the
     *            server.
     * @param message The chat message.
     * @param privateChat 'true' if the message is a private one, 'false'
     *            otherwise.
     */
    public void displayChat(String senderName, String message, boolean privateChat) {
        if (privateChat) {
            chatArea.append(senderName + " (" + Messages.message("private")
                + "): " + message + '\n');
        } else {
            chatArea.append(senderName + ": " + message + '\n');
        }
    }

    /**
     * Refreshes the table that displays the players and the choices that
     * they've made.
     */
    public void refreshPlayersTable() {
        if (table != null) {
            table.update();
        }
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        final String command = ae.getActionCommand();
        final FreeColClient fcc = getFreeColClient();
        final SwingGUI gui = getGUI();
        try {
            switch (Integer.parseInt(command)) {
            case START:
                int row = table.getSelectedRow();
                int col = table.getSelectedColumn();
                if (row > -1 && col > -1){
                    table.getCellEditor(row, col).stopCellEditing();
                }
                if (!checkVictoryConditions()) break;

                // The ready flag was set to false for single player
                // mode in order to allow the player to change
                // whatever he wants.
                if (singlePlayerGame) {
                    getMyPlayer().setReady(true);
                }

                fcc.getPreGameController().requestLaunch();
                break;
            case CANCEL:
                fcc.getConnectController().quitGame(true);
                gui.removeFromCanvas(this);
                gui.showNewPanel();
                break;
            case READY:
                fcc.getPreGameController().setReady(readyBox.isSelected());
                refreshPlayersTable();
                break;
            case CHAT:
                if (!buttonChat.getText().isEmpty()) {
                    fcc.getPreGameController().chat(buttonChat.getText());
                    displayChat(getMyPlayer().getName(), buttonChat.getText(),
                                false);
                    buttonChat.setText("");
                }
                break;
            case GAME_OPTIONS:
                OptionGroup go = gui.showGameOptionsDialog(fcc.isAdmin(), true);
                if (go != null) {
                    fcc.getGame().setGameOptions(go);
                    fcc.getPreGameController().updateGameOptions();
                }
                break;
            case MAP_GENERATOR_OPTIONS:
                OptionGroup mgo = gui.showMapGeneratorOptionsDialog(fcc.isAdmin());
                if (mgo != null) {
                    fcc.getGame().setMapGeneratorOptions(mgo);
                    fcc.getPreGameController().updateMapGeneratorOptions();
                }
                break;
            default:
                super.actionPerformed(ae);
            }
        } catch (NumberFormatException nfe) {
            logger.warning("Invalid ActionEvent, not a number: " + command);
        }
    }


    // Override Component

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeNotify() {
        // Do not propagate to superclass.  This panel is reused so
        // avoid the destructive cleanups in FreeColPanel.removeNotify.

        buttonStart.removeActionListener(this);
        buttonCancel.removeActionListener(this);
        readyBox.removeActionListener(this);
        gameOptions.removeActionListener(this);
        mapGeneratorOptions.removeActionListener(this);
        if (buttonChat != null) buttonChat.removeActionListener(this);
    }
}
