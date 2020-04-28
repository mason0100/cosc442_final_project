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
 * The Class FreeColSeedTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class FreeColSeedTest {

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
	 * @return the free col seed
	 */
	private FreeColSeed createTestSubject() {
		return new FreeColSeed();
	}

	/**
	 * Gets the free col seed test.
	 *
	 * @return the free col seed test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getFreeColSeed", signature = "(Z)J")
	@Test
	public void getFreeColSeedTest() throws Exception {
		boolean generate = false;
		long result;

		// default test
		result = FreeColSeed.getFreeColSeed(generate);

		Assert.fail();
	}

	/**
	 * Sets the free col seed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setFreeColSeed", signature = "(QString;)V")
	@Test
	public void setFreeColSeedTest() throws Exception {
		String arg = "";

		// default test
		FreeColSeed.setFreeColSeed(arg);

		Assert.fail();
	}

	/**
	 * Increment free col seed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "incrementFreeColSeed", signature = "()V")
	@Test
	public void incrementFreeColSeedTest() throws Exception {

		// default test
		FreeColSeed.incrementFreeColSeed();

		Assert.fail();
	}
}