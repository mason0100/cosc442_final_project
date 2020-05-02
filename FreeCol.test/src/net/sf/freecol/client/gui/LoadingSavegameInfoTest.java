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

// TODO: Auto-generated Javadoc
/**
 * The Class LoadingSavegameInfoTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class LoadingSavegameInfoTest {

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
	 * @return the loading savegame info
	 */
	private LoadingSavegameInfo createTestSubject() {
		return new LoadingSavegameInfo(false, 0, "");
	}

	/**
	 * Checks if is single player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isSinglePlayer", signature = "()Z")
	@Test
	public void isSinglePlayerTest() throws Exception {
		LoadingSavegameInfo testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isSinglePlayer();

		Assert.fail();
	}

	/**
	 * Gets the port test.
	 *
	 * @return the port test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getPort", signature = "()I")
	@Test
	public void getPortTest() throws Exception {
		LoadingSavegameInfo testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPort();

		Assert.fail();
	}

	/**
	 * Gets the server name test.
	 *
	 * @return the server name test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getServerName", signature = "()QString;")
	@Test
	public void getServerNameTest() throws Exception {
		LoadingSavegameInfo testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getServerName();

		Assert.fail();
	}
}