/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;

import javax.annotation.Generated;
import javax.swing.JMenuBar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class FullScreenFrameListenerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class FullScreenFrameListenerTest {

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
	 * @return the full screen frame listener
	 */
	private FullScreenFrameListener createTestSubject() {
		return new FullScreenFrameListener(new FreeColClient(new InputStream(), ""),
				new FreeColFrame(new FreeColClient(new InputStream(), ""), new GraphicsDevice(), new JMenuBar(),
						new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
								new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
								new MapViewer(new FreeColClient(new InputStream(), ""))),
						false, new Rectangle()));
	}

	/**
	 * Window activated test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowActivated", signature = "(QWindowEvent;)V")
	@Test
	public void windowActivatedTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowActivated(event);

		Assert.fail();
	}

	/**
	 * Window closed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowClosed", signature = "(QWindowEvent;)V")
	@Test
	public void windowClosedTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowClosed(event);

		Assert.fail();
	}

	/**
	 * Window closing test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowClosing", signature = "(QWindowEvent;)V")
	@Test
	public void windowClosingTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowClosing(event);

		Assert.fail();
	}

	/**
	 * Window deactivated test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowDeactivated", signature = "(QWindowEvent;)V")
	@Test
	public void windowDeactivatedTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowDeactivated(event);

		Assert.fail();
	}

	/**
	 * Window deiconified test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowDeiconified", signature = "(QWindowEvent;)V")
	@Test
	public void windowDeiconifiedTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowDeiconified(event);

		Assert.fail();
	}

	/**
	 * Window iconified test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowIconified", signature = "(QWindowEvent;)V")
	@Test
	public void windowIconifiedTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowIconified(event);

		Assert.fail();
	}

	/**
	 * Window opened test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "windowOpened", signature = "(QWindowEvent;)V")
	@Test
	public void windowOpenedTest() throws Exception {
		FullScreenFrameListener testSubject;
		WindowEvent event = null;

		// default test
		testSubject = createTestSubject();
		testSubject.windowOpened(event);

		Assert.fail();
	}
}