/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Direction;

// TODO: Auto-generated Javadoc
/**
 * The Class ScrollThreadTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class ScrollThreadTest {

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
	 * @return the scroll thread
	 */
	private ScrollThread createTestSubject() {
		return new ScrollThread(new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
				new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
				new MapViewer(new FreeColClient(new InputStream(), ""))));
	}

	/**
	 * Sets the direction test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setDirection", signature = "(QDirection;)V")
	@Test
	public void setDirectionTest() throws Exception {
		ScrollThread testSubject;
		Direction d = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setDirection(d);

		Assert.fail();
	}

	/**
	 * Run test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "run", signature = "()V")
	@Test
	public void runTest() throws Exception {
		ScrollThread testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.run();

		Assert.fail();
	}
}