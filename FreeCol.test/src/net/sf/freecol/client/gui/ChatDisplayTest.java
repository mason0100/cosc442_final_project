/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

// TODO: Auto-generated Javadoc
/**
 * The Class ChatDisplayTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class ChatDisplayTest {

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
	 * @return the chat display
	 */
	private ChatDisplay createTestSubject() {
		return new ChatDisplay();
	}

	/**
	 * Adds the message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "addMessage", signature = "(QGUIMessage;)V")
	@Test
	public void addMessageTest() throws Exception {
		ChatDisplay testSubject;
		GUIMessage message = null;

		// default test
		testSubject = createTestSubject();
		testSubject.addMessage(message);

		Assert.fail();
	}

	/**
	 * Gets the message test.
	 *
	 * @return the message test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMessage", signature = "(I)QGUIMessage;")
	@Test
	public void getMessageTest() throws Exception {
		ChatDisplay testSubject;
		int index = 0;
		GUIMessage result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getMessage", new Object[] { index });

		Assert.fail();
	}

	/**
	 * Gets the message count test.
	 *
	 * @return the message count test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMessageCount", signature = "()I")
	@Test
	public void getMessageCountTest() throws Exception {
		ChatDisplay testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getMessageCount");

		Assert.fail();
	}

	/**
	 * Display test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "display", signature = "(QGraphics2D;QImageLibrary;QDimension;)V")
	@Test
	public void displayTest() throws Exception {
		ChatDisplay testSubject;
		Graphics2D g = null;
		ImageLibrary lib = null;
		Dimension size = null;

		// default test
		testSubject = createTestSubject();
		testSubject.display(g, lib, size);

		Assert.fail();
	}

	/**
	 * Removes the old messages test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "removeOldMessages", signature = "()Z")
	@Test
	public void removeOldMessagesTest() throws Exception {
		ChatDisplay testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.removeOldMessages();

		Assert.fail();
	}
}