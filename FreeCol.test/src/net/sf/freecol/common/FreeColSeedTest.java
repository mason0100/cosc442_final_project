package net.sf.freecol.common;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class FreeColSeedTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private FreeColSeed createTestSubject() {
		return new FreeColSeed();
	}

	@MethodRef(name = "getFreeColSeed", signature = "(Z)J")
	@Test
	public void getFreeColSeedTest() throws Exception {
		boolean generate = false;
		long result;

		// default test
		result = FreeColSeed.getFreeColSeed(generate);

		Assert.fail();
	}

	@MethodRef(name = "setFreeColSeed", signature = "(QString;)V")
	@Test
	public void setFreeColSeedTest() throws Exception {
		String arg = "";

		// default test
		FreeColSeed.setFreeColSeed(arg);

		Assert.fail();
	}

	@MethodRef(name = "incrementFreeColSeed", signature = "()V")
	@Test
	public void incrementFreeColSeedTest() throws Exception {

		// default test
		FreeColSeed.incrementFreeColSeed();

		Assert.fail();
	}
}