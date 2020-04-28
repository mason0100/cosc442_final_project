/*
 * 
 */
package net.sf.freecol.client.gui;

import javax.annotation.Generated;
import javax.swing.JInternalFrame;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class FrameMotionListenerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class FrameMotionListenerTest {

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
	 * @return the frame motion listener
	 */
	private FrameMotionListener createTestSubject() {
		return new FrameMotionListener(new JInternalFrame());
	}

	/**
	 * Mouse dragged test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Mouse pressed test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Mouse released test.
	 *
	 * @throws Exception the exception
	 */
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