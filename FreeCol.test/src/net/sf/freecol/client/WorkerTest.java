/*
 * 
 */
package net.sf.freecol.client;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class WorkerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class WorkerTest {

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
	 * @return the worker
	 */
	private Worker createTestSubject() {
		return new Worker();
	}

	/**
	 * Run test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "run", signature = "()V")
	@Test
	public void runTest() throws Exception {
		Worker testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.run();

		Assert.fail();
	}

	/**
	 * Schedule test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Ask to stop test.
	 *
	 * @throws Exception the exception
	 */
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