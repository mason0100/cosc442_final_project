/*
 * 
 */
package net.sf.freecol.common;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class ObjectWithIdTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class ObjectWithIdTest {

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
	 * @return the object with id
	 */
	private ObjectWithId createTestSubject() {
		return new ObjectWithId();
	}

	/**
	 * Gets the id test.
	 *
	 * @return the id test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getId", signature = "()QString;")
	@Test
	public void getIdTest() throws Exception {
		ObjectWithId testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();

		Assert.fail();
	}
}