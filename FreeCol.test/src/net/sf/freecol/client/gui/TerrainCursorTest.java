package net.sf.freecol.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class TerrainCursorTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private TerrainCursor createTestSubject() {
		return new TerrainCursor();
	}

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

	@MethodRef(name = "startBlinking", signature = "()V")
	@Test
	public void startBlinkingTest() throws Exception {
		TerrainCursor testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.startBlinking();

		Assert.fail();
	}

	@MethodRef(name = "stopBlinking", signature = "()V")
	@Test
	public void stopBlinkingTest() throws Exception {
		TerrainCursor testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.stopBlinking();

		Assert.fail();
	}

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