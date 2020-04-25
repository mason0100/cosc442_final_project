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

@Generated(value = "org.junit-tools-1.1.0")
public class CanvasMouseListenerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private CanvasMouseListener createTestSubject() {
		return new CanvasMouseListener(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))));
	}

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