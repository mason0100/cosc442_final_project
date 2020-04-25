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

@Generated(value = "org.junit-tools-1.1.0")
public class InputHandlerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private InputHandler createTestSubject() {
		return new InputHandler(new FreeColClient(new InputStream(), ""));
	}

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