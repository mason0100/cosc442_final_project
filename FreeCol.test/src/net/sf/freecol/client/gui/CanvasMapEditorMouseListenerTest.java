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

@Generated(value = "org.junit-tools-1.1.0")
public class CanvasMapEditorMouseListenerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private CanvasMapEditorMouseListener createTestSubject() {
		return new CanvasMapEditorMouseListener(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))));
	}

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