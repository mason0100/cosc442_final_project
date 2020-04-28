/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Color;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class GUIMessageTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class GUIMessageTest {

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
	 * @return the GUI message
	 */
	private GUIMessage createTestSubject() {
		return new GUIMessage("", new Color(0, 0, 0));
	}

	/**
	 * Gets the message test.
	 *
	 * @return the message test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMessage", signature = "()QString;")
	@Test
	public void getMessageTest() throws Exception {
		GUIMessage testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMessage();

		Assert.fail();
	}

	/**
	 * Gets the color test.
	 *
	 * @return the color test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getColor", signature = "()QColor;")
	@Test
	public void getColorTest() throws Exception {
		GUIMessage testSubject;
		Color result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getColor();

		Assert.fail();
	}

	/**
	 * Gets the creation time test.
	 *
	 * @return the creation time test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getCreationTime", signature = "()J")
	@Test
	public void getCreationTimeTest() throws Exception {
		GUIMessage testSubject;
		long result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCreationTime();

		Assert.fail();
	}
}