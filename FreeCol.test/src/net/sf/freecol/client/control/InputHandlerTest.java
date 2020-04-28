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
import net.sf.freecol.client.gui.GUI;
import net.sf.freecol.common.model.Game;

// TODO: Auto-generated Javadoc
/**
 * The Class InputHandlerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class InputHandlerTest {

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
	 * @return the input handler
	 */
	private InputHandler createTestSubject() {
		return new InputHandler(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Gets the free col client test.
	 *
	 * @return the free col client test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getFreeColClient", signature = "()QFreeColClient;")
	@Test
	public void getFreeColClientTest() throws Exception {
		InputHandler testSubject;
		FreeColClient result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getFreeColClient");

		Assert.fail();
	}

	/**
	 * Gets the GUI test.
	 *
	 * @return the GUI test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getGUI", signature = "()QGUI;")
	@Test
	public void getGUITest() throws Exception {
		InputHandler testSubject;
		GUI result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getGUI");

		Assert.fail();
	}

	/**
	 * Gets the game test.
	 *
	 * @return the game test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getGame", signature = "()QGame;")
	@Test
	public void getGameTest() throws Exception {
		InputHandler testSubject;
		Game result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getGame");

		Assert.fail();
	}

	/**
	 * Handle test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "handle", signature = "(QConnection;QElement;)QElement;")
	@Test
	public void handleTest() throws Exception {
		InputHandler testSubject;
		Connection connection = null;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.handle(connection, element);

		Assert.fail();
	}

	/**
	 * Disconnect test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "disconnect", signature = "(QElement;)QElement;")
	@Test
	public void disconnectTest() throws Exception {
		InputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "disconnect", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Unknown test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "unknown", signature = "(QElement;)QElement;")
	@Test
	public void unknownTest() throws Exception {
		InputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "unknown", new Object[] { Element.class });

		Assert.fail();
	}
}