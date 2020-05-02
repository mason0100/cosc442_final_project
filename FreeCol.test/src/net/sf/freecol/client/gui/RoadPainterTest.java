/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.common.model.Tile;

// TODO: Auto-generated Javadoc
/**
 * The Class RoadPainterTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class RoadPainterTest {

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
	 * @return the road painter
	 */
	private RoadPainter createTestSubject() {
		return new RoadPainter(new Dimension());
	}

	/**
	 * Display road test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayRoad", signature = "(QGraphics2D;QTile;)V")
	@Test
	public void displayRoadTest() throws Exception {
		RoadPainter testSubject;
		Graphics2D g = null;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		testSubject.displayRoad(g, tile);

		Assert.fail();
	}
}