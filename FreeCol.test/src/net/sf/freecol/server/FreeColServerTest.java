package net.sf.freecol.server;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map;
import java.util.Random;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.common.io.FreeColSavegameFile;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.option.OptionGroup;
import net.sf.freecol.server.FreeColServer.GameState;
import net.sf.freecol.server.ai.AIMain;
import net.sf.freecol.server.ai.AIPlayer;
import net.sf.freecol.server.control.Controller;
import net.sf.freecol.server.control.UserConnectionHandler;
import net.sf.freecol.server.generator.MapGenerator;
import net.sf.freecol.server.model.ServerGame;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.server.networking.Server;

@Generated(value = "org.junit-tools-1.1.0")
public class FreeColServerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private FreeColServer createTestSubject() {
		return new FreeColServer(false, false, new Specification(), 0, "");
	}

	@MethodRef(name = "getSinglePlayer", signature = "()Z")
	@Test
	public void getSinglePlayerTest() throws Exception {
		FreeColServer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSinglePlayer();

		Assert.fail();
	}

	@MethodRef(name = "setSinglePlayer", signature = "(Z)V")
	@Test
	public void setSinglePlayerTest() throws Exception {
		FreeColServer testSubject;
		boolean singlePlayer = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setSinglePlayer(singlePlayer);

		Assert.fail();
	}

	@MethodRef(name = "getPublicServer", signature = "()Z")
	@Test
	public void getPublicServerTest() throws Exception {
		FreeColServer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPublicServer();

		Assert.fail();
	}

	@MethodRef(name = "setPublicServer", signature = "(Z)V")
	@Test
	public void setPublicServerTest() throws Exception {
		FreeColServer testSubject;
		boolean publicServer = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setPublicServer(publicServer);

		Assert.fail();
	}

	@MethodRef(name = "getName", signature = "()QString;")
	@Test
	public void getNameTest() throws Exception {
		FreeColServer testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();

		Assert.fail();
	}

	@MethodRef(name = "setName", signature = "(QString;)V")
	@Test
	public void setNameTest() throws Exception {
		FreeColServer testSubject;
		String name = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setName(name);

		Assert.fail();
	}

	@MethodRef(name = "getHost", signature = "()QString;")
	@Test
	public void getHostTest() throws Exception {
		FreeColServer testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getHost();

		Assert.fail();
	}

	@MethodRef(name = "getPort", signature = "()I")
	@Test
	public void getPortTest() throws Exception {
		FreeColServer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPort();

		Assert.fail();
	}

	@MethodRef(name = "serverStart", signature = "(I)QServer;")
	@Test
	public void serverStartTest() throws Exception {
		FreeColServer testSubject;
		int firstPort = 0;
		Server result;

		// test 1
		testSubject = createTestSubject();
		firstPort = 0;
		result = Whitebox.invokeMethod(testSubject, "serverStart", new Object[] { firstPort });
		Assert.assertEquals(null, result);

		// test 2
		testSubject = createTestSubject();
		firstPort = -1;
		result = Whitebox.invokeMethod(testSubject, "serverStart", new Object[] { firstPort });
		Assert.assertEquals(null, result);

		// test 3
		testSubject = createTestSubject();
		firstPort = 1;
		result = Whitebox.invokeMethod(testSubject, "serverStart", new Object[] { firstPort });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "getSpecification", signature = "()QSpecification;")
	@Test
	public void getSpecificationTest() throws Exception {
		FreeColServer testSubject;
		Specification result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSpecification();

		Assert.fail();
	}

	@MethodRef(name = "getUserConnectionHandler", signature = "()QUserConnectionHandler;")
	@Test
	public void getUserConnectionHandlerTest() throws Exception {
		FreeColServer testSubject;
		UserConnectionHandler result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getUserConnectionHandler();

		Assert.fail();
	}

	@MethodRef(name = "getController", signature = "()QController;")
	@Test
	public void getControllerTest() throws Exception {
		FreeColServer testSubject;
		Controller result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getController();

		Assert.fail();
	}

	@MethodRef(name = "getPreGameInputHandler", signature = "()QPreGameInputHandler;")
	@Test
	public void getPreGameInputHandlerTest() throws Exception {
		FreeColServer testSubject;
		PreGameInputHandler result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPreGameInputHandler();

		Assert.fail();
	}

	@MethodRef(name = "getInGameInputHandler", signature = "()QInGameInputHandler;")
	@Test
	public void getInGameInputHandlerTest() throws Exception {
		FreeColServer testSubject;
		InGameInputHandler result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getInGameInputHandler();

		Assert.fail();
	}

	@MethodRef(name = "getInGameController", signature = "()QInGameController;")
	@Test
	public void getInGameControllerTest() throws Exception {
		FreeColServer testSubject;
		InGameController result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getInGameController();

		Assert.fail();
	}

	@MethodRef(name = "getGame", signature = "()QServerGame;")
	@Test
	public void getGameTest() throws Exception {
		FreeColServer testSubject;
		ServerGame result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getGame();

		Assert.fail();
	}

	@MethodRef(name = "setGame", signature = "(QServerGame;)V")
	@Test
	public void setGameTest() throws Exception {
		FreeColServer testSubject;
		ServerGame game = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setGame(game);

		Assert.fail();
	}

	@MethodRef(name = "setAIMain", signature = "(QAIMain;)V")
	@Test
	public void setAIMainTest() throws Exception {
		FreeColServer testSubject;
		AIMain aiMain = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setAIMain(aiMain);

		Assert.fail();
	}

	@MethodRef(name = "getAIMain", signature = "()QAIMain;")
	@Test
	public void getAIMainTest() throws Exception {
		FreeColServer testSubject;
		AIMain result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAIMain();

		Assert.fail();
	}

	@MethodRef(name = "getGameState", signature = "()QGameState;")
	@Test
	public void getGameStateTest() throws Exception {
		FreeColServer testSubject;
		GameState result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getGameState();

		Assert.fail();
	}

	@MethodRef(name = "setGameState", signature = "(QGameState;)V")
	@Test
	public void setGameStateTest() throws Exception {
		FreeColServer testSubject;
		GameState state = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setGameState(state);

		Assert.fail();
	}

	@MethodRef(name = "getServer", signature = "()QServer;")
	@Test
	public void getServerTest() throws Exception {
		FreeColServer testSubject;
		Server result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getServer();

		Assert.fail();
	}

	@MethodRef(name = "getIntegrity", signature = "()I")
	@Test
	public void getIntegrityTest() throws Exception {
		FreeColServer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getIntegrity();

		Assert.fail();
	}

	@MethodRef(name = "getMapGenerator", signature = "()QMapGenerator;")
	@Test
	public void getMapGeneratorTest() throws Exception {
		FreeColServer testSubject;
		MapGenerator result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMapGenerator();

		Assert.fail();
	}

	@MethodRef(name = "setMapGenerator", signature = "(QMapGenerator;)V")
	@Test
	public void setMapGeneratorTest() throws Exception {
		FreeColServer testSubject;
		MapGenerator mapGenerator = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setMapGenerator(mapGenerator);

		Assert.fail();
	}

	@MethodRef(name = "getServerRandom", signature = "()QRandom;")
	@Test
	public void getServerRandomTest() throws Exception {
		FreeColServer testSubject;
		Random result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getServerRandom();

		Assert.fail();
	}

	@MethodRef(name = "setServerRandom", signature = "(QRandom;)V")
	@Test
	public void setServerRandomTest() throws Exception {
		FreeColServer testSubject;
		Random random = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setServerRandom(random);

		Assert.fail();
	}

	@MethodRef(name = "getActiveUnit", signature = "()QUnit;")
	@Test
	public void getActiveUnitTest() throws Exception {
		FreeColServer testSubject;
		Unit result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getActiveUnit();

		Assert.fail();
	}

	@MethodRef(name = "setActiveUnit", signature = "(QUnit;)V")
	@Test
	public void setActiveUnitTest() throws Exception {
		FreeColServer testSubject;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setActiveUnit(unit);

		Assert.fail();
	}

	@MethodRef(name = "updateMetaServer", signature = "()Z")
	@Test
	public void updateMetaServerTest() throws Exception {
		FreeColServer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.updateMetaServer();

		Assert.fail();
	}

	@MethodRef(name = "updateMetaServer", signature = "(Z)Z")
	@Test
	public void updateMetaServerTest_1() throws Exception {
		FreeColServer testSubject;
		boolean firstTime = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateMetaServer", new Object[] { firstTime });

		Assert.fail();
	}

	@MethodRef(name = "removeFromMetaServer", signature = "()Z")
	@Test
	public void removeFromMetaServerTest() throws Exception {
		FreeColServer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.removeFromMetaServer();

		Assert.fail();
	}

	@MethodRef(name = "getSlotsAvailable", signature = "()I")
	@Test
	public void getSlotsAvailableTest() throws Exception {
		FreeColServer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSlotsAvailable();

		Assert.fail();
	}

	@MethodRef(name = "getNumberOfLivingHumanPlayers", signature = "()I")
	@Test
	public void getNumberOfLivingHumanPlayersTest() throws Exception {
		FreeColServer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getNumberOfLivingHumanPlayers();

		Assert.fail();
	}

	@MethodRef(name = "saveGame", signature = "(QFile;QOptionGroup;)V")
	@Test
	public void saveGameTest() throws Exception {
		FreeColServer testSubject;
		File file = null;
		OptionGroup options = null;

		// default test
		testSubject = createTestSubject();
		testSubject.saveGame(file, options);

		Assert.fail();
	}

	@MethodRef(name = "saveMapEditorGame", signature = "(QFile;QBufferedImage;)V")
	@Test
	public void saveMapEditorGameTest() throws Exception {
		FreeColServer testSubject;
		File file = null;
		BufferedImage image = null;

		// default test
		testSubject = createTestSubject();
		testSubject.saveMapEditorGame(file, image);

		Assert.fail();
	}

	@MethodRef(name = "saveGame", signature = "(QFile;QOptionGroup;QBufferedImage;)V")
	@Test
	public void saveGameTest_1() throws Exception {
		FreeColServer testSubject;
		File file = null;
		OptionGroup options = null;
		BufferedImage image = null;

		// default test
		testSubject = createTestSubject();
		testSubject.saveGame(file, options, image);

		Assert.fail();
	}

	@MethodRef(name = "loadGame", signature = "(QFreeColSavegameFile;)QServerGame;")
	@Test
	public void loadGameTest() throws Exception {
		FreeColServer testSubject;
		FreeColSavegameFile fis = null;
		ServerGame result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.loadGame(fis);

		Assert.fail();
	}

	@MethodRef(name = "readGame", signature = "(QFile;QSpecification;QFreeColServer;)QServerGame;")
	@Test
	public void readGameTest() throws Exception {
		File file = null;
		Specification spec = null;
		FreeColServer server = null;
		ServerGame result;

		// default test
		result = FreeColServer.readGame(file, spec, server);

		Assert.fail();
	}

	@MethodRef(name = "readGame", signature = "(QFreeColSavegameFile;QSpecification;QFreeColServer;)QServerGame;")
	@Test
	public void readGameTest_1() throws Exception {
		FreeColSavegameFile fis = null;
		Specification specification = null;
		FreeColServer server = null;
		ServerGame result;

		// default test
		result = FreeColServer.readGame(fis, specification, server);

		Assert.fail();
	}

	@MethodRef(name = "loadGame", signature = "(QFreeColSavegameFile;QSpecification;QServer;)QServerGame;")
	@Test
	public void loadGameTest_1() throws Exception {
		FreeColServer testSubject;
		FreeColSavegameFile fis = null;
		Specification specification = null;
		Server server = null;
		ServerGame result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "loadGame",
				new Object[] { FreeColSavegameFile.class, Specification.class, Server.class });

		Assert.fail();
	}

	@MethodRef(name = "establishUnknownEnemy", signature = "(QGame;)QServerPlayer;")
	@Test
	public void establishUnknownEnemyTest() throws Exception {
		FreeColServer testSubject;
		Game game = null;
		ServerPlayer result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "establishUnknownEnemy", new Object[] { Game.class });

		Assert.fail();
	}

	@MethodRef(name = "createEmptyMap", signature = "(QGame;II)QMap;")
	@Test
	public void createEmptyMapTest() throws Exception {
		FreeColServer testSubject;
		Game game = null;
		int width = 0;
		int height = 0;
		Map result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createEmptyMap(game, width, height);

		Assert.fail();
	}

	@MethodRef(name = "buildGame", signature = "()QGame;")
	@Test
	public void buildGameTest() throws Exception {
		FreeColServer testSubject;
		Game result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.buildGame();

		Assert.fail();
	}

	@MethodRef(name = "makeAIPlayer", signature = "(QNation;)QServerPlayer;")
	@Test
	public void makeAIPlayerTest() throws Exception {
		FreeColServer testSubject;
		Nation nation = null;
		ServerPlayer result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.makeAIPlayer(nation);

		Assert.fail();
	}

	@MethodRef(name = "removeAutosaves", signature = "(QString;)V")
	@Test
	public void removeAutosavesTest() throws Exception {
		String prefix = "";

		// default test
		FreeColServer.removeAutosaves(prefix);

		Assert.fail();
	}

	@MethodRef(name = "exploreMapForAllPlayers", signature = "(Z)V")
	@Test
	public void exploreMapForAllPlayersTest() throws Exception {
		FreeColServer testSubject;
		boolean reveal = false;

		// default test
		testSubject = createTestSubject();
		testSubject.exploreMapForAllPlayers(reveal);

		Assert.fail();
	}

	@MethodRef(name = "getPlayer", signature = "(QConnection;)QServerPlayer;")
	@Test
	public void getPlayerTest() throws Exception {
		FreeColServer testSubject;
		Connection connection = null;
		ServerPlayer result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPlayer(connection);

		Assert.fail();
	}

	@MethodRef(name = "getAIPlayer", signature = "(QPlayer;)QAIPlayer;")
	@Test
	public void getAIPlayerTest() throws Exception {
		FreeColServer testSubject;
		Player player = null;
		AIPlayer result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAIPlayer(player);

		Assert.fail();
	}

	@MethodRef(name = "shutdown", signature = "()V")
	@Test
	public void shutdownTest() throws Exception {
		FreeColServer testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.shutdown();

		Assert.fail();
	}
}