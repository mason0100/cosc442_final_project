/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;

import javax.annotation.Generated;
import javax.swing.JMenuBar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class FreeColFrameTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class FreeColFrameTest {

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
	 * @return the free col frame
	 */
	private FreeColFrame createTestSubject() {
		return new FreeColFrame(new FreeColClient(new InputStream(), ""), new GraphicsDevice(), new JMenuBar(),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))),
				false, new Rectangle());
	}

	/**
	 * Exit full screen test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "exitFullScreen", signature = "()V")
	@Test
	public void exitFullScreenTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.exitFullScreen();

		Assert.fail();
	}

	/**
	 * Sets the in game menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setInGameMenuBar", signature = "()V")
	@Test
	public void setInGameMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setInGameMenuBar();

		Assert.fail();
	}

	/**
	 * Sets the map editor menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setMapEditorMenuBar", signature = "()V")
	@Test
	public void setMapEditorMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setMapEditorMenuBar();

		Assert.fail();
	}

	/**
	 * Removes the menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "removeMenuBar", signature = "()V")
	@Test
	public void removeMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.removeMenuBar();

		Assert.fail();
	}

	/**
	 * Reset menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "resetMenuBar", signature = "()V")
	@Test
	public void resetMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.resetMenuBar();

		Assert.fail();
	}

	/**
	 * Update menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateMenuBar", signature = "()V")
	@Test
	public void updateMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMenuBar();

		Assert.fail();
	}

	/**
	 * Gets the frame name test.
	 *
	 * @return the frame name test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getFrameName", signature = "()QString;")
	@Test
	public void getFrameNameTest() throws Exception {
		String result;

		// default test
		result = Whitebox.invokeMethod(FreeColFrame.class, "getFrameName");

		Assert.fail();
	}

	/**
	 * Sets the canvas test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setCanvas", signature = "()V")
	@Test
	public void setCanvasTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setCanvas");

		Assert.fail();
	}
}