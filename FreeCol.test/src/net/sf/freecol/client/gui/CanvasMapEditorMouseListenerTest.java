/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Point;
import java.util.Map;

import javax.annotation.Generated;
import javax.swing.JComponent;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class CanvasMapEditorMouseListenerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class CanvasMapEditorMouseListenerTest {

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
	 * @return the canvas map editor mouse listener
	 */
	private CanvasMapEditorMouseListener createTestSubject() {
		return new CanvasMapEditorMouseListener(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))));
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
		CanvasMapEditorMouseListener testSubject;
		GUI result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getGUI");

		Assert.fail();
	}

	/**
	 * Gets the map test.
	 *
	 * @return the map test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMap", signature = "()QMap;")
	@Test
	public void getMapTest() throws Exception {
		CanvasMapEditorMouseListener testSubject;
		Map result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getMap");

		Assert.fail();
	}

	/**
	 * Draw box test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "drawBox", signature = "(QJComponent;QPoint;QPoint;)V")
	@Test
	public void drawBoxTest() throws Exception {
		CanvasMapEditorMouseListener testSubject;
		JComponent component = null;
		Point startPoint = null;
		Point endPoint = null;

		// test 1
		testSubject = createTestSubject();
		startPoint = null;
		endPoint = null;
		Whitebox.invokeMethod(testSubject, "drawBox", new Object[] { JComponent.class, Point.class, Point.class });

		// test 2
		testSubject = createTestSubject();
		endPoint = null;
		startPoint = null;
		Whitebox.invokeMethod(testSubject, "drawBox", new Object[] { JComponent.class, Point.class, Point.class });

		Assert.fail();
	}

	/**
	 * Mouse clicked test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseClicked", signature = "(QMouseEvent;)V")
	@Test
	public void mouseClickedTest() throws Exception {
		CanvasMapEditorMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseClicked(e);

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
		CanvasMapEditorMouseListener testSubject;
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
		CanvasMapEditorMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseReleased(e);

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
		CanvasMapEditorMouseListener testSubject;
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
		CanvasMapEditorMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseExited(e);

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
		CanvasMapEditorMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseDragged(e);

		Assert.fail();
	}

	/**
	 * Mouse moved test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "mouseMoved", signature = "(QMouseEvent;)V")
	@Test
	public void mouseMovedTest() throws Exception {
		CanvasMapEditorMouseListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseMoved(e);

		Assert.fail();
	}
}