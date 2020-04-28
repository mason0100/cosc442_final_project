/*
 * 
 */
package net.sf.freecol.client.control;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class PreGameInputHandlerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class PreGameInputHandlerTest {

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
	 * @return the pre game input handler
	 */
	private PreGameInputHandler createTestSubject() {
		return new PreGameInputHandler(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Handle test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "handle", signature = "(QConnection;QElement;)QElement;")
	@Test
	public void handleTest() throws Exception {
		PreGameInputHandler testSubject;
		Connection connection = null;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.handle(connection, element);

		Assert.fail();
	}

	/**
	 * Adds the player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "addPlayer", signature = "(QElement;)QElement;")
	@Test
	public void addPlayerTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "addPlayer", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Chat test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chat", signature = "(QElement;)QElement;")
	@Test
	public void chatTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "chat", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Error test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "error", signature = "(QElement;)QElement;")
	@Test
	public void errorTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "error", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Logout test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "logout", signature = "(QElement;)QElement;")
	@Test
	public void logoutTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "logout", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Multiple test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "multiple", signature = "(QConnection;QElement;)QElement;")
	@Test
	public void multipleTest() throws Exception {
		PreGameInputHandler testSubject;
		Connection connection = null;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.multiple(connection, element);

		Assert.fail();
	}

	/**
	 * Player ready test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "playerReady", signature = "(QElement;)QElement;")
	@Test
	public void playerReadyTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "playerReady", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Removes the player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "removePlayer", signature = "(QElement;)QElement;")
	@Test
	public void removePlayerTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "removePlayer", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Sets the available test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setAvailable", signature = "(QElement;)QElement;")
	@Test
	public void setAvailableTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "setAvailable", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Start game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startGame", signature = "(QElement;)QElement;")
	@Test
	public void startGameTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "startGame", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update color test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateColor", signature = "(QElement;)QElement;")
	@Test
	public void updateColorTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateColor", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateGame", signature = "(QElement;)QElement;")
	@Test
	public void updateGameTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateGame", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update game options test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateGameOptions", signature = "(QElement;)QElement;")
	@Test
	public void updateGameOptionsTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateGameOptions", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update map generator options test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateMapGeneratorOptions", signature = "(QElement;)QElement;")
	@Test
	public void updateMapGeneratorOptionsTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateMapGeneratorOptions", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update nation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateNation", signature = "(QElement;)QElement;")
	@Test
	public void updateNationTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateNation", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update nation type test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateNationType", signature = "(QElement;)QElement;")
	@Test
	public void updateNationTypeTest() throws Exception {
		PreGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "updateNationType", new Object[] { Element.class });

		Assert.fail();
	}
}