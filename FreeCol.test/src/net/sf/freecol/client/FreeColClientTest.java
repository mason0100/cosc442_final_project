package net.sf.freecol.client;

import java.awt.Dimension;
import java.io.File;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.control.ConnectController;
import net.sf.freecol.client.control.MapEditorController;
import net.sf.freecol.client.control.SoundController;
import net.sf.freecol.client.gui.GUI;
import net.sf.freecol.client.gui.action.ActionManager;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.networking.ServerAPI;
import net.sf.freecol.server.FreeColServer;

@Generated(value = "org.junit-tools-1.1.0")
public class FreeColClientTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private FreeColClient createTestSubject() {
		return new FreeColClient(new InputStream(), "");
	}

	@MethodRef(name = "startClient", signature = "(QDimension;QString;ZZQFile;QSpecification;)V")
	@Test
	public void startClientTest() throws Exception {
		FreeColClient testSubject;
		Dimension size = null;
		String userMsg = "";
		boolean sound = false;
		boolean showOpeningVideo = false;
		File savedGame = null;
		Specification spec = null;

		// test 1
		testSubject = createTestSubject();
		savedGame = null;
		spec = null;
		testSubject.startClient(size, userMsg, sound, showOpeningVideo, savedGame, spec);

		// test 2
		testSubject = createTestSubject();
		spec = null;
		savedGame = null;
		testSubject.startClient(size, userMsg, sound, showOpeningVideo, savedGame, spec);

		// test 3
		testSubject = createTestSubject();
		savedGame = null;
		testSubject.startClient(size, userMsg, sound, showOpeningVideo, savedGame, spec);

		// test 4
		testSubject = createTestSubject();
		spec = null;
		testSubject.startClient(size, userMsg, sound, showOpeningVideo, savedGame, spec);

		Assert.fail();
	}

	@MethodRef(name = "loadClientOptions", signature = "(QFile;)QClientOptions;")
	@Test
	public void loadClientOptionsTest() throws Exception {
		FreeColClient testSubject;
		File savedGameFile = null;
		ClientOptions result;

		// test 1
		testSubject = createTestSubject();
		savedGameFile = null;
		result = Whitebox.invokeMethod(testSubject, "loadClientOptions", new Object[] { File.class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "fatal", signature = "(QString;)V")
	@Test
	public void fatalTest() throws Exception {
		String err = "";

		// default test
		FreeColClient.fatal(err);

		Assert.fail();
	}

	@MethodRef(name = "getConnectController", signature = "()QConnectController;")
	@Test
	public void getConnectControllerTest() throws Exception {
		FreeColClient testSubject;
		ConnectController result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getConnectController();

		Assert.fail();
	}

	@MethodRef(name = "getPreGameController", signature = "()QPreGameController;")
	@Test
	public void getPreGameControllerTest() throws Exception {
		FreeColClient testSubject;
		PreGameController result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPreGameController();

		Assert.fail();
	}

	@MethodRef(name = "getPreGameInputHandler", signature = "()QPreGameInputHandler;")
	@Test
	public void getPreGameInputHandlerTest() throws Exception {
		FreeColClient testSubject;
		PreGameInputHandler result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPreGameInputHandler();

		Assert.fail();
	}

	@MethodRef(name = "getInGameController", signature = "()QInGameController;")
	@Test
	public void getInGameControllerTest() throws Exception {
		FreeColClient testSubject;
		InGameController result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getInGameController();

		Assert.fail();
	}

	@MethodRef(name = "getInGameInputHandler", signature = "()QInGameInputHandler;")
	@Test
	public void getInGameInputHandlerTest() throws Exception {
		FreeColClient testSubject;
		InGameInputHandler result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getInGameInputHandler();

		Assert.fail();
	}

	@MethodRef(name = "getMapEditorController", signature = "()QMapEditorController;")
	@Test
	public void getMapEditorControllerTest() throws Exception {
		FreeColClient testSubject;
		MapEditorController result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMapEditorController();

		Assert.fail();
	}

	@MethodRef(name = "getSoundController", signature = "()QSoundController;")
	@Test
	public void getSoundControllerTest() throws Exception {
		FreeColClient testSubject;
		SoundController result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSoundController();

		Assert.fail();
	}

	@MethodRef(name = "getFreeColServer", signature = "()QFreeColServer;")
	@Test
	public void getFreeColServerTest() throws Exception {
		FreeColClient testSubject;
		FreeColServer result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getFreeColServer();

		Assert.fail();
	}

	@MethodRef(name = "setFreeColServer", signature = "(QFreeColServer;)V")
	@Test
	public void setFreeColServerTest() throws Exception {
		FreeColClient testSubject;
		FreeColServer freeColServer = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setFreeColServer(freeColServer);

		Assert.fail();
	}

	@MethodRef(name = "askServer", signature = "()QServerAPI;")
	@Test
	public void askServerTest() throws Exception {
		FreeColClient testSubject;
		ServerAPI result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.askServer();

		Assert.fail();
	}

	@MethodRef(name = "getGUI", signature = "()QGUI;")
	@Test
	public void getGUITest() throws Exception {
		FreeColClient testSubject;
		GUI result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getGUI();

		Assert.fail();
	}

	@MethodRef(name = "getActionManager", signature = "()QActionManager;")
	@Test
	public void getActionManagerTest() throws Exception {
		FreeColClient testSubject;
		ActionManager result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getActionManager();

		Assert.fail();
	}

	@MethodRef(name = "getGame", signature = "()QGame;")
	@Test
	public void getGameTest() throws Exception {
		FreeColClient testSubject;
		Game result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getGame();

		Assert.fail();
	}

	@MethodRef(name = "setGame", signature = "(QGame;)V")
	@Test
	public void setGameTest() throws Exception {
		FreeColClient testSubject;
		Game game = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setGame(game);

		Assert.fail();
	}

	@MethodRef(name = "getMyPlayer", signature = "()QPlayer;")
	@Test
	public void getMyPlayerTest() throws Exception {
		FreeColClient testSubject;
		Player result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMyPlayer();

		Assert.fail();
	}

	@MethodRef(name = "setMyPlayer", signature = "(QPlayer;)V")
	@Test
	public void setMyPlayerTest() throws Exception {
		FreeColClient testSubject;
		Player player = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setMyPlayer(player);

		Assert.fail();
	}

	@MethodRef(name = "getClientOptions", signature = "()QClientOptions;")
	@Test
	public void getClientOptionsTest() throws Exception {
		FreeColClient testSubject;
		ClientOptions result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getClientOptions();

		Assert.fail();
	}

	@MethodRef(name = "tutorialMode", signature = "()Z")
	@Test
	public void tutorialModeTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.tutorialMode();

		Assert.fail();
	}

	@MethodRef(name = "isInGame", signature = "()Z")
	@Test
	public void isInGameTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isInGame();

		Assert.fail();
	}

	@MethodRef(name = "setInGame", signature = "(Z)V")
	@Test
	public void setInGameTest() throws Exception {
		FreeColClient testSubject;
		boolean inGame = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setInGame(inGame);

		Assert.fail();
	}

	@MethodRef(name = "isMapEditor", signature = "()Z")
	@Test
	public void isMapEditorTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isMapEditor();

		Assert.fail();
	}

	@MethodRef(name = "setMapEditor", signature = "(Z)V")
	@Test
	public void setMapEditorTest() throws Exception {
		FreeColClient testSubject;
		boolean mapEditor = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setMapEditor(mapEditor);

		Assert.fail();
	}

	@MethodRef(name = "isSinglePlayer", signature = "()Z")
	@Test
	public void isSinglePlayerTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isSinglePlayer();

		Assert.fail();
	}

	@MethodRef(name = "setSinglePlayer", signature = "(Z)V")
	@Test
	public void setSinglePlayerTest() throws Exception {
		FreeColClient testSubject;
		boolean singlePlayer = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setSinglePlayer(singlePlayer);

		Assert.fail();
	}

	@MethodRef(name = "isLoggedIn", signature = "()Z")
	@Test
	public void isLoggedInTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isLoggedIn();

		Assert.fail();
	}

	@MethodRef(name = "setLoggedIn", signature = "(Z)V")
	@Test
	public void setLoggedInTest() throws Exception {
		FreeColClient testSubject;
		boolean loggedIn = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setLoggedIn(loggedIn);

		Assert.fail();
	}

	@MethodRef(name = "isHeadless", signature = "()Z")
	@Test
	public void isHeadlessTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isHeadless();

		Assert.fail();
	}

	@MethodRef(name = "updateActions", signature = "()V")
	@Test
	public void updateActionsTest() throws Exception {
		FreeColClient testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateActions();

		Assert.fail();
	}

	@MethodRef(name = "addSpecificationActions", signature = "(QSpecification;)V")
	@Test
	public void addSpecificationActionsTest() throws Exception {
		FreeColClient testSubject;
		Specification specification = null;

		// default test
		testSubject = createTestSubject();
		testSubject.addSpecificationActions(specification);

		Assert.fail();
	}

	@MethodRef(name = "isAdmin", signature = "()Z")
	@Test
	public void isAdminTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isAdmin();

		Assert.fail();
	}

	@MethodRef(name = "canSaveCurrentGame", signature = "()Z")
	@Test
	public void canSaveCurrentGameTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.canSaveCurrentGame();

		Assert.fail();
	}

	@MethodRef(name = "currentPlayerIsMyPlayer", signature = "()Z")
	@Test
	public void currentPlayerIsMyPlayerTest() throws Exception {
		FreeColClient testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.currentPlayerIsMyPlayer();

		Assert.fail();
	}

	@MethodRef(name = "getAnimationSpeed", signature = "(QPlayer;)I")
	@Test
	public void getAnimationSpeedTest() throws Exception {
		FreeColClient testSubject;
		Player player = null;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAnimationSpeed(player);

		Assert.fail();
	}

	@MethodRef(name = "getMySortedColonies", signature = "()QList<QColony;>;")
	@Test
	public void getMySortedColoniesTest() throws Exception {
		FreeColClient testSubject;
		List<Colony> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMySortedColonies();

		Assert.fail();
	}

	@MethodRef(name = "setWork", signature = "(QRunnable;)V")
	@Test
	public void setWorkTest() throws Exception {
		FreeColClient testSubject;
		Runnable runnable = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setWork(runnable);

		Assert.fail();
	}

	@MethodRef(name = "newGame", signature = "(Z)V")
	@Test
	public void newGameTest() throws Exception {
		FreeColClient testSubject;
		boolean prompt = false;

		// default test
		testSubject = createTestSubject();
		testSubject.newGame(prompt);

		Assert.fail();
	}

	@MethodRef(name = "continuePlaying", signature = "()V")
	@Test
	public void continuePlayingTest() throws Exception {
		FreeColClient testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.continuePlaying();

		Assert.fail();
	}

	@MethodRef(name = "skipTurns", signature = "(I)V")
	@Test
	public void skipTurnsTest() throws Exception {
		FreeColClient testSubject;
		int turns = 0;

		// test 1
		testSubject = createTestSubject();
		turns = 0;
		testSubject.skipTurns(turns);

		// test 2
		testSubject = createTestSubject();
		turns = -1;
		testSubject.skipTurns(turns);

		// test 3
		testSubject = createTestSubject();
		turns = 1;
		testSubject.skipTurns(turns);

		Assert.fail();
	}

	@MethodRef(name = "askToQuit", signature = "()V")
	@Test
	public void askToQuitTest() throws Exception {
		FreeColClient testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.askToQuit();

		Assert.fail();
	}

	@MethodRef(name = "retire", signature = "()V")
	@Test
	public void retireTest() throws Exception {
		FreeColClient testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.retire();

		Assert.fail();
	}

	@MethodRef(name = "quit", signature = "()V")
	@Test
	public void quitTest() throws Exception {
		FreeColClient testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.quit();

		Assert.fail();
	}
}