package net.sf.freecol.common;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class ServerInfoTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private ServerInfo createTestSubject() {
		return new ServerInfo();
	}

	@MethodRef(name = "update", signature = "(QString;QString;IIIZQString;I)V")
	@Test
	public void updateTest() throws Exception {
		ServerInfo testSubject;
		String name = "";
		String address = "";
		int port = 0;
		int slotsAvailable = 0;
		int currentlyPlaying = 0;
		boolean isGameStarted = false;
		String version = "";
		int gameState = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.update(name, address, port, slotsAvailable, currentlyPlaying, isGameStarted, version, gameState);

		Assert.fail();
	}

	@MethodRef(name = "update", signature = "(QElement;)V")
	@Test
	public void updateTest_1() throws Exception {
		ServerInfo testSubject;
		Element element = null;

		// default test
		testSubject = createTestSubject();
		testSubject.update(element);

		Assert.fail();
	}

	@MethodRef(name = "getName", signature = "()QString;")
	@Test
	public void getNameTest() throws Exception {
		ServerInfo testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();

		Assert.fail();
	}

	@MethodRef(name = "getAddress", signature = "()QString;")
	@Test
	public void getAddressTest() throws Exception {
		ServerInfo testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAddress();

		Assert.fail();
	}

	@MethodRef(name = "getPort", signature = "()I")
	@Test
	public void getPortTest() throws Exception {
		ServerInfo testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPort();

		Assert.fail();
	}

	@MethodRef(name = "getCurrentlyPlaying", signature = "()I")
	@Test
	public void getCurrentlyPlayingTest() throws Exception {
		ServerInfo testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCurrentlyPlaying();

		Assert.fail();
	}

	@MethodRef(name = "getSlotsAvailable", signature = "()I")
	@Test
	public void getSlotsAvailableTest() throws Exception {
		ServerInfo testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSlotsAvailable();

		Assert.fail();
	}

	@MethodRef(name = "getVersion", signature = "()QString;")
	@Test
	public void getVersionTest() throws Exception {
		ServerInfo testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getVersion();

		Assert.fail();
	}

	@MethodRef(name = "getGameState", signature = "()I")
	@Test
	public void getGameStateTest() throws Exception {
		ServerInfo testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getGameState();

		Assert.fail();
	}

	@MethodRef(name = "toXMLElement", signature = "(QDocument;)QElement;")
	@Test
	public void toXMLElementTest() throws Exception {
		ServerInfo testSubject;
		Document document = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.toXMLElement(document);

		Assert.fail();
	}

	@MethodRef(name = "readFromXMLElement", signature = "(QElement;)V")
	@Test
	public void readFromXMLElementTest() throws Exception {
		ServerInfo testSubject;
		Element element = null;

		// default test
		testSubject = createTestSubject();
		testSubject.readFromXMLElement(element);

		Assert.fail();
	}

	@MethodRef(name = "getXMLElementTagName", signature = "()QString;")
	@Test
	public void getXMLElementTagNameTest() throws Exception {
		String result;

		// default test
		result = ServerInfo.getXMLElementTagName();

		Assert.fail();
	}

	@MethodRef(name = "toString", signature = "()QString;")
	@Test
	public void toStringTest() throws Exception {
		ServerInfo testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.toString();

		Assert.fail();
	}
}