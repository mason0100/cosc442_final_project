/*
 * 
 */
package net.sf.freecol.common;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class ServerInfoTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class ServerInfoTest {

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {

	}

	/**
	 * Creates the test subject.
	 *
	 * @return the server info
	 */
	private ServerInfo createTestSubject() {
		return new ServerInfo();
	}

	/**
	 * Update test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Update test 1.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the name test.
	 *
	 * @return the name test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the address test.
	 *
	 * @return the address test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the port test.
	 *
	 * @return the port test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the currently playing test.
	 *
	 * @return the currently playing test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the slots available test.
	 *
	 * @return the slots available test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the version test.
	 *
	 * @return the version test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the game state test.
	 *
	 * @return the game state test
	 * @throws Exception the exception
	 */
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

	/**
	 * To XML element test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Read from XML element test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the XML element tag name test.
	 *
	 * @return the XML element tag name test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getXMLElementTagName", signature = "()QString;")
	@Test
	public void getXMLElementTagNameTest() throws Exception {
		String result;

		// default test
		result = ServerInfo.getXMLElementTagName();

		Assert.fail();
	}

	/**
	 * To string test.
	 *
	 * @throws Exception the exception
	 */
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