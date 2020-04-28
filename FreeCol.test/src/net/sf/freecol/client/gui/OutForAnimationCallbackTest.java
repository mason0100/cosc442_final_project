/*
 * 
 */
package net.sf.freecol.client.gui;

import javax.annotation.Generated;
import javax.swing.JLabel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

// TODO: Auto-generated Javadoc
/**
 * The Class OutForAnimationCallbackTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class OutForAnimationCallbackTest {

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
	 * @return the out for animation callback
	 */
	private OutForAnimationCallback createTestSubject() {
		return new OutForAnimationCallback();
	}

	/**
	 * Execute with unit out for animation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "executeWithUnitOutForAnimation", signature = "(QJLabel;)V")
	@Test
	public void executeWithUnitOutForAnimationTest() throws Exception {
		OutForAnimationCallback testSubject;
		JLabel unitLabel = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "executeWithUnitOutForAnimation", new Object[] { JLabel.class });

		Assert.fail();
	}
}