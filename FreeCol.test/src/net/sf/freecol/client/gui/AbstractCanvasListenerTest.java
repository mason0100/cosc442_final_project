package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;

@Generated(value = "org.junit-tools-1.1.0")
public class AbstractCanvasListenerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private AbstractCanvasListener createTestSubject() {
		return new AbstractCanvasListener(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))));
	}

	@MethodRef(name = "performAutoScrollIfActive", signature = "(QMouseEvent;)V")
	@Test
	public void performAutoScrollIfActiveTest() throws Exception {
		AbstractCanvasListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "performAutoScrollIfActive", new Object[] { MouseEvent.class });

		Assert.fail();
	}

	@MethodRef(name = "performDragScrollIfActive", signature = "(QMouseEvent;)V")
	@Test
	public void performDragScrollIfActiveTest() throws Exception {
		AbstractCanvasListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "performDragScrollIfActive", new Object[] { MouseEvent.class });

		Assert.fail();
	}

	@MethodRef(name = "stopScrollIfScrollIsActive", signature = "()V")
	@Test
	public void stopScrollIfScrollIsActiveTest() throws Exception {
		AbstractCanvasListener testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "stopScrollIfScrollIsActive");

		Assert.fail();
	}

	@MethodRef(name = "scroll", signature = "(III)V")
	@Test
	public void scrollTest() throws Exception {
		AbstractCanvasListener testSubject;
		int x = 0;
		int y = 0;
		int scrollSpace = 0;

		// test 1
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = 0;
		y = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 2
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = -1;
		y = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 3
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = 1;
		y = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 4
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = 0;
		x = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 5
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = -1;
		x = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 6
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = 1;
		x = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 7
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 8
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = -1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 9
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = 1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 10
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 11
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = -1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 12
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = 1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 13
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 14
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = -1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 15
		testSubject = createTestSubject();
		y = 0;
		scrollSpace = 1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 16
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = 0;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 17
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = -1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		// test 18
		testSubject = createTestSubject();
		x = 0;
		scrollSpace = 1;
		Whitebox.invokeMethod(testSubject, "scroll", new Object[] { x, y, scrollSpace });

		Assert.fail();
	}
}