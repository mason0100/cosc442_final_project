package net.sf.freecol.client;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class WorkerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private Worker createTestSubject() {
		return new Worker();
	}

	@MethodRef(name = "run", signature = "()V")
	@Test
	public void runTest() throws Exception {
		Worker testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.run();

		Assert.fail();
	}

	@MethodRef(name = "schedule", signature = "(QRunnable;)V")
	@Test
	public void scheduleTest() throws Exception {
		Worker testSubject;
		Runnable job = null;

		// default test
		testSubject = createTestSubject();
		testSubject.schedule(job);

		Assert.fail();
	}

	@MethodRef(name = "askToStop", signature = "()V")
	@Test
	public void askToStopTest() throws Exception {
		Worker testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.askToStop();

		Assert.fail();
	}
}