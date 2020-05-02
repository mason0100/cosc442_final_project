/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class TerrainCursorTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class TerrainCursorTest {

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
	 * @return the terrain cursor
	 */
	private TerrainCursor createTestSubject() {
		return new TerrainCursor();
	}

	/**
	 * Checks if is active test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isActive", signature = "()Z")
	@Test
	public void isActiveTest() throws Exception {
		TerrainCursor testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isActive();

		Assert.fail();
	}

	/**
	 * Sets the active test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setActive", signature = "(Z)V")
	@Test
	public void setActiveTest() throws Exception {
		TerrainCursor testSubject;
		boolean newState = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setActive(newState);

		Assert.fail();
	}

	/**
	 * Start blinking test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startBlinking", signature = "()V")
	@Test
	public void startBlinkingTest() throws Exception {
		TerrainCursor testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.startBlinking();

		Assert.fail();
	}

	/**
	 * Stop blinking test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "stopBlinking", signature = "()V")
	@Test
	public void stopBlinkingTest() throws Exception {
		TerrainCursor testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.stopBlinking();

		Assert.fail();
	}

	/**
	 * Adds the action listener test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "addActionListener", signature = "(QActionListener;)V")
	@Test
	public void addActionListenerTest() throws Exception {
		TerrainCursor testSubject;
		ActionListener listener = null;

		// default test
		testSubject = createTestSubject();
		testSubject.addActionListener(listener);

		Assert.fail();
	}

	/**
	 * Removes the action listener test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "removeActionListener", signature = "(QActionListener;)V")
	@Test
	public void removeActionListenerTest() throws Exception {
		TerrainCursor testSubject;
		ActionListener listener = null;

		// default test
		testSubject = createTestSubject();
		testSubject.removeActionListener(listener);

		Assert.fail();
	}

	/**
	 * Fire action event test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "fireActionEvent", signature = "(QActionEvent;)V")
	@Test
	public void fireActionEventTest() throws Exception {
		TerrainCursor testSubject;
		ActionEvent ae = null;

		// default test
		testSubject = createTestSubject();
		testSubject.fireActionEvent(ae);

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
		TerrainCursor testSubject;
		ActionEvent ae = null;

		// default test
		testSubject = createTestSubject();
		testSubject.actionPerformed(ae);

		Assert.fail();
	}
}