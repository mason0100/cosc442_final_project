/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class CanvasMouseMotionListenerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class CanvasMouseMotionListenerTest {

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
	 * @return the canvas mouse motion listener
	 */
	private CanvasMouseMotionListener createTestSubject() {
		return new CanvasMouseMotionListener(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))));
	}

	/**
	 * Mouse moved test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseMoved", signature = "(QMouseEvent;)V")
	@Test
	public void mouseMovedTest() throws Exception {
		CanvasMouseMotionListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseMoved(e);

		Assert.fail();
	}

	/**
	 * Mouse dragged test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseDragged", signature = "(QMouseEvent;)V")
	@Test
	public void mouseDraggedTest() throws Exception {
		CanvasMouseMotionListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseDragged(e);

		Assert.fail();
	}
}