/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.event.ActionEvent;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class CanvasMouseListenerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class CanvasMouseListenerTest {

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
	 * @return the canvas mouse listener
	 */
	private CanvasMouseListener createTestSubject() {
		return new CanvasMouseListener(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))));
	}

	/**
	 * Mouse clicked test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseClicked", signature = "(QMouseEvent;)V")
	@Test
	public void mouseClickedTest() throws Exception {
		CanvasMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseClicked(e);

		Assert.fail();
	}

	/**
	 * Mouse entered test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseEntered", signature = "(QMouseEvent;)V")
	@Test
	public void mouseEnteredTest() throws Exception {
		CanvasMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseEntered(e);

		Assert.fail();
	}

	/**
	 * Mouse exited test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseExited", signature = "(QMouseEvent;)V")
	@Test
	public void mouseExitedTest() throws Exception {
		CanvasMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseExited(e);

		Assert.fail();
	}

	/**
	 * Mouse pressed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mousePressed", signature = "(QMouseEvent;)V")
	@Test
	public void mousePressedTest() throws Exception {
		CanvasMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mousePressed(e);

		Assert.fail();
	}

	/**
	 * Mouse released test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseReleased", signature = "(QMouseEvent;)V")
	@Test
	public void mouseReleasedTest() throws Exception {
		CanvasMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseReleased(e);

		Assert.fail();
	}

	/**
	 * Action performed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "actionPerformed", signature = "(QActionEvent;)V")
	@Test
	public void actionPerformedTest() throws Exception {
		CanvasMouseListener testSubject;
		ActionEvent ae = null;

		// default test
		testSubject = createTestSubject();
		testSubject.actionPerformed(ae);

		Assert.fail();
	}
}