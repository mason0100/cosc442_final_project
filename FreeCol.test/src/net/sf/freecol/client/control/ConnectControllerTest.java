package net.sf.freecol.client.control;

import java.io.File;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.ServerInfo;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.server.FreeColServer;
import net.sf.freecol.server.FreeColServer.GameState;

@Generated(value = "org.junit-tools-1.1.0")
public class ConnectControllerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private ConnectController createTestSubject() {
		return new ConnectController(new FreeColClient(new InputStream(), ""));
	}

	@MethodRef(name = "finish", signature = "()V")
	@Test
	public void finishTest() throws Exception {
		ConnectController testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "finish");

		Assert.fail();
	}

	@MethodRef(name = "unblockServer", signature = "(I)Z")
	@Test
	public void unblockServerTest() throws Exception {
		ConnectController testSubject;
		int port = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "unblockServer", new Object[] { port });

		Assert.fail();
	}

	@MethodRef(name = "startServer", signature = "(ZZQSpecification;I)QFreeColServer;")
	@Test
	public void startServerTest() throws Exception {
		ConnectController testSubject;
		boolean publicServer = false;
		boolean singlePlayer = false;
		Specification spec = null;
		int port = 0;
		FreeColServer result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "startServer",
				new Object[] { publicServer, singlePlayer, Specification.class, port });

		Assert.fail();
	}

	@MethodRef(name = "getConnection", signature = "(QString;I)QConnection;")
	@Test
	public void getConnectionTest() throws Exception {
		ConnectController testSubject;
		String host = "";
		int port = 0;
		Connection result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getConnection", new Object[] { host, port });

		Assert.fail();
	}

	@MethodRef(name = "getGameState", signature = "(QString;I)QGameState;")
	@Test
	public void getGameStateTest() throws Exception {
		ConnectController testSubject;
		String host = "";
		int port = 0;
		GameState result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getGameState", new Object[] { host, port });

		Assert.fail();
	}

	@MethodRef(name = "getVacantPlayers", signature = "(QString;I)QList<QString;>;")
	@Test
	public void getVacantPlayersTest() throws Exception {
		ConnectController testSubject;
		String host = "";
		int port = 0;
		List<String> result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getVacantPlayers", new Object[] { host, port });

		Assert.fail();
	}

	@MethodRef(name = "login", signature = "(QString;QString;I)Z")
	@Test
	public void loginTest() throws Exception {
		ConnectController testSubject;
		String user = "";
		String host = "";
		int port = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.login(user, host, port);

		Assert.fail();
	}

	@MethodRef(name = "startMultiplayerGame", signature = "(QSpecification;ZI)Z")
	@Test
	public void startMultiplayerGameTest() throws Exception {
		ConnectController testSubject;
		Specification specification = null;
		boolean publicServer = false;
		int port = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.startMultiplayerGame(specification, publicServer, port);

		Assert.fail();
	}

	@MethodRef(name = "joinMultiplayerGame", signature = "(QString;I)Z")
	@Test
	public void joinMultiplayerGameTest() throws Exception {
		ConnectController testSubject;
		String host = "";
		int port = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.joinMultiplayerGame(host, port);

		Assert.fail();
	}

	@MethodRef(name = "startSinglePlayerGame", signature = "(QSpecification;Z)Z")
	@Test
	public void startSinglePlayerGameTest() throws Exception {
		ConnectController testSubject;
		Specification spec = null;
		boolean skip = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.startSinglePlayerGame(spec, skip);

		Assert.fail();
	}

	@MethodRef(name = "startSavedGame", signature = "(QFile;QString;)Z")
	@Test
	public void startSavedGameTest() throws Exception {
		ConnectController testSubject;
		File file = null;
		String userMsg = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.startSavedGame(file, userMsg);

		Assert.fail();
	}

	@MethodRef(name = "reconnect", signature = "()Z")
	@Test
	public void reconnectTest() throws Exception {
		ConnectController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.reconnect();

		Assert.fail();
	}

	@MethodRef(name = "logout", signature = "(Z)V")
	@Test
	public void logoutTest() throws Exception {
		ConnectController testSubject;
		boolean notifyServer = false;

		// default test
		testSubject = createTestSubject();
		testSubject.logout(notifyServer);

		Assert.fail();
	}

	@MethodRef(name = "quitGame", signature = "(ZZ)V")
	@Test
	public void quitGameTest() throws Exception {
		ConnectController testSubject;
		boolean stopServer = false;
		boolean notifyServer = false;

		// default test
		testSubject = createTestSubject();
		testSubject.quitGame(stopServer, notifyServer);

		Assert.fail();
	}

	@MethodRef(name = "quitGame", signature = "(Z)V")
	@Test
	public void quitGameTest_1() throws Exception {
		ConnectController testSubject;
		boolean stopServer = false;

		// default test
		testSubject = createTestSubject();
		testSubject.quitGame(stopServer);

		Assert.fail();
	}

	@MethodRef(name = "getServerList", signature = "()QList<QServerInfo;>;")
	@Test
	public void getServerListTest() throws Exception {
		ConnectController testSubject;
		List<ServerInfo> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getServerList();

		Assert.fail();
	}
}