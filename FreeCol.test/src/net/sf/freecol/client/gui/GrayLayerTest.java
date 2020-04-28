/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Graphics;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class GrayLayerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class GrayLayerTest {

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
	 * @return the gray layer
	 */
	private GrayLayer createTestSubject() {
		return new GrayLayer(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Paint test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "paint", signature = "(QGraphics;)V")
	@Test
	public void paintTest() throws Exception {
		GrayLayer testSubject;
		Graphics g = null;

		// default test
		testSubject = createTestSubject();
		testSubject.paint(g);

		Assert.fail();
	}

	/**
	 * Sets the player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setPlayer", signature = "(QPlayer;)V")
	@Test
	public void setPlayerTest() throws Exception {
		GrayLayer testSubject;
		Player player = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setPlayer(player);

		Assert.fail();
	}
}