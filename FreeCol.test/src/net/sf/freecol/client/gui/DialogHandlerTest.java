/*
 * 
 */
package net.sf.freecol.client.gui;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

// TODO: Auto-generated Javadoc
/**
 * The Class DialogHandlerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class DialogHandlerTest {

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
	 * @return the dialog handler
	 */
	private DialogHandler createTestSubject() {
		return new DialogHandler();
	}

	/**
	 * Handle test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "handle", signature = "(QT;)V")
	@Test
	public void handleTest() throws Exception {
		DialogHandler testSubject;
		T response = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "handle", new Object[] { T.class });

		Assert.fail();
	}
}