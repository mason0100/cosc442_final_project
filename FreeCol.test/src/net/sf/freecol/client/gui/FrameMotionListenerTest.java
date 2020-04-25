package net.sf.freecol.client.gui;

import javax.annotation.Generated;
import javax.swing.JInternalFrame;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class FrameMotionListenerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private FrameMotionListener createTestSubject() {
		return new FrameMotionListener(new JInternalFrame());
	}

	@MethodRef(name = "mouseDragged", signature = "(QMouseEvent;)V")
	@Test
	public void mouseDraggedTest() throws Exception {
		FrameMotionListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseDragged(e);

		Assert.fail();
	}

	@MethodRef(name = "mousePressed", signature = "(QMouseEvent;)V")
	@Test
	public void mousePressedTest() throws Exception {
		FrameMotionListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mousePressed(e);

		Assert.fail();
	}

	@MethodRef(name = "mouseReleased", signature = "(QMouseEvent;)V")
	@Test
	public void mouseReleasedTest() throws Exception {
		FrameMotionListener testSubject;
		MouseEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.mouseReleased(e);

		Assert.fail();
	}
}