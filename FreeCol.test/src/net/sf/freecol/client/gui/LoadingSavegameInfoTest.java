package net.sf.freecol.client.gui;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class LoadingSavegameInfoTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private LoadingSavegameInfo createTestSubject() {
		return new LoadingSavegameInfo(false, 0, "");
	}

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