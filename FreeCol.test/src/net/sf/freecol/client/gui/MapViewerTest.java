/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.annotation.Generated;
import javax.swing.JLabel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Direction;
import net.sf.freecol.common.model.PathNode;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Settlement;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.Unit;

// TODO: Auto-generated Javadoc
/**
 * The Class MapViewerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class MapViewerTest {

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
	 * @return the map viewer
	 */
	private MapViewer createTestSubject() {
		return new MapViewer(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Gets the image library test.
	 *
	 * @return the image library test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getImageLibrary", signature = "()QImageLibrary;")
	@Test
	public void getImageLibraryTest() throws Exception {
		MapViewer testSubject;
		ImageLibrary result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getImageLibrary");

		Assert.fail();
	}

	/**
	 * Gets the view mode test.
	 *
	 * @return the view mode test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getViewMode", signature = "()I")
	@Test
	public void getViewModeTest() throws Exception {
		MapViewer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getViewMode");

		Assert.fail();
	}

	/**
	 * Toggle view mode test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "toggleViewMode", signature = "()V")
	@Test
	public void toggleViewModeTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "toggleViewMode");

		Assert.fail();
	}

	/**
	 * Change view mode test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "changeViewMode", signature = "(I)V")
	@Test
	public void changeViewModeTest() throws Exception {
		MapViewer testSubject;
		int newViewMode = 0;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "changeViewMode", new Object[] { newViewMode });

		Assert.fail();
	}

	/**
	 * Center active unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "centerActiveUnit", signature = "()V")
	@Test
	public void centerActiveUnitTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "centerActiveUnit");

		Assert.fail();
	}

	/**
	 * Convert to map tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "convertToMapTile", signature = "(II)QTile;")
	@Test
	public void convertToMapTileTest() throws Exception {
		MapViewer testSubject;
		int x = 0;
		int y = 0;
		Tile result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "convertToMapTile", new Object[] { x, y });

		Assert.fail();
	}

	/**
	 * Execute with unit out for animation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "executeWithUnitOutForAnimation", signature = "(QUnit;QTile;QOutForAnimationCallback;)V")
	@Test
	public void executeWithUnitOutForAnimationTest() throws Exception {
		MapViewer testSubject;
		Unit unit = null;
		Tile sourceTile = null;
		OutForAnimationCallback r = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "executeWithUnitOutForAnimation",
				new Object[] { Unit.class, Tile.class, OutForAnimationCallback.class });

		Assert.fail();
	}

	/**
	 * Enter unit out for animation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "enterUnitOutForAnimation", signature = "(QUnit;QTile;)QJLabel;")
	@Test
	public void enterUnitOutForAnimationTest() throws Exception {
		MapViewer testSubject;
		Unit unit = null;
		Tile sourceTile = null;
		JLabel result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "enterUnitOutForAnimation",
				new Object[] { Unit.class, Tile.class });

		Assert.fail();
	}

	/**
	 * Release unit out for animation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "releaseUnitOutForAnimation", signature = "(QUnit;)V")
	@Test
	public void releaseUnitOutForAnimationTest() throws Exception {
		MapViewer testSubject;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "releaseUnitOutForAnimation", new Object[] { Unit.class });

		Assert.fail();
	}

	/**
	 * Checks if is out for animation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isOutForAnimation", signature = "(QUnit;)Z")
	@Test
	public void isOutForAnimationTest() throws Exception {
		MapViewer testSubject;
		Unit unit = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isOutForAnimation", new Object[] { Unit.class });

		Assert.fail();
	}

	/**
	 * Creates the unit label test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createUnitLabel", signature = "(QUnit;)QJLabel;")
	@Test
	public void createUnitLabelTest() throws Exception {
		MapViewer testSubject;
		Unit unit = null;
		JLabel result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "createUnitLabel", new Object[] { Unit.class });

		Assert.fail();
	}

	/**
	 * Calculate tile bounds test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "calculateTileBounds", signature = "(QTile;)QRectangle;")
	@Test
	public void calculateTileBoundsTest() throws Exception {
		MapViewer testSubject;
		Tile tile = null;
		Rectangle result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "calculateTileBounds", new Object[] { Tile.class });

		Assert.fail();
	}

	/**
	 * Calculate tile position test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "calculateTilePosition", signature = "(QTile;)QPoint;")
	@Test
	public void calculateTilePositionTest() throws Exception {
		MapViewer testSubject;
		Tile t = null;
		Point result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "calculateTilePosition", new Object[] { Tile.class });

		Assert.fail();
	}

	/**
	 * Gets the tile width test.
	 *
	 * @return the tile width test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getTileWidth", signature = "()I")
	@Test
	public void getTileWidthTest() throws Exception {
		MapViewer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getTileWidth");

		Assert.fail();
	}

	/**
	 * Calculate unit label position in tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "calculateUnitLabelPositionInTile", signature = "(IIQPoint;)QPoint;")
	@Test
	public void calculateUnitLabelPositionInTileTest() throws Exception {
		MapViewer testSubject;
		int labelWidth = 0;
		int labelHeight = 0;
		Point tileP = null;
		Point result;

		// test 1
		testSubject = createTestSubject();
		tileP = null;
		result = Whitebox.invokeMethod(testSubject, "calculateUnitLabelPositionInTile",
				new Object[] { labelWidth, labelHeight, Point.class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * On screen test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "onScreen", signature = "(QTile;)Z")
	@Test
	public void onScreenTest() throws Exception {
		MapViewer testSubject;
		Tile tileToCheck = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		tileToCheck = null;
		result = Whitebox.invokeMethod(testSubject, "onScreen", new Object[] { Tile.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Start cursor blinking test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startCursorBlinking", signature = "()V")
	@Test
	public void startCursorBlinkingTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "startCursorBlinking");

		Assert.fail();
	}

	/**
	 * Stop blinking test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "stopBlinking", signature = "()V")
	@Test
	public void stopBlinkingTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "stopBlinking");

		Assert.fail();
	}

	/**
	 * Restart blinking test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "restartBlinking", signature = "()V")
	@Test
	public void restartBlinkingTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "restartBlinking");

		Assert.fail();
	}

	/**
	 * Gets the focus test.
	 *
	 * @return the focus test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getFocus", signature = "()QTile;")
	@Test
	public void getFocusTest() throws Exception {
		MapViewer testSubject;
		Tile result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getFocus");

		Assert.fail();
	}

	/**
	 * Sets the focus test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setFocus", signature = "(QTile;)V")
	@Test
	public void setFocusTest() throws Exception {
		MapViewer testSubject;
		Tile focus = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setFocus", new Object[] { Tile.class });

		Assert.fail();
	}

	/**
	 * Sets the offset focus test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setOffsetFocus", signature = "(QTile;)I")
	@Test
	public void setOffsetFocusTest() throws Exception {
		MapViewer testSubject;
		Tile tile = null;
		int result;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		result = Whitebox.invokeMethod(testSubject, "setOffsetFocus", new Object[] { Tile.class });
		Assert.assertEquals(0, result, 0);

		Assert.fail();
	}

	/**
	 * Force reposition test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "forceReposition", signature = "()V")
	@Test
	public void forceRepositionTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "forceReposition");

		Assert.fail();
	}

	/**
	 * Reposition map if needed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "repositionMapIfNeeded", signature = "()V")
	@Test
	public void repositionMapIfNeededTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "repositionMapIfNeeded");

		Assert.fail();
	}

	/**
	 * Position map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "positionMap", signature = "(QTile;)V")
	@Test
	public void positionMapTest() throws Exception {
		MapViewer testSubject;
		Tile pos = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "positionMap", new Object[] { Tile.class });

		Assert.fail();
	}

	/**
	 * Scroll map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "scrollMap", signature = "(QDirection;)Z")
	@Test
	public void scrollMapTest() throws Exception {
		MapViewer testSubject;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "scrollMap", new Object[] { Direction.class });

		Assert.fail();
	}

	/**
	 * Checks if is map near bottom test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isMapNearBottom", signature = "(I)Z")
	@Test
	public void isMapNearBottomTest() throws Exception {
		MapViewer testSubject;
		int y = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isMapNearBottom", new Object[] { y });

		Assert.fail();
	}

	/**
	 * Checks if is map near left test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isMapNearLeft", signature = "(II)Z")
	@Test
	public void isMapNearLeftTest() throws Exception {
		MapViewer testSubject;
		int x = 0;
		int y = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isMapNearLeft", new Object[] { x, y });

		Assert.fail();
	}

	/**
	 * Checks if is map near right test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isMapNearRight", signature = "(II)Z")
	@Test
	public void isMapNearRightTest() throws Exception {
		MapViewer testSubject;
		int x = 0;
		int y = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isMapNearRight", new Object[] { x, y });

		Assert.fail();
	}

	/**
	 * Gets the left columns test.
	 *
	 * @return the left columns test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getLeftColumns", signature = "()I")
	@Test
	public void getLeftColumnsTest() throws Exception {
		MapViewer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getLeftColumns");

		Assert.fail();
	}

	/**
	 * Gets the left columns test 1.
	 *
	 * @return the left columns test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getLeftColumns", signature = "(I)I")
	@Test
	public void getLeftColumnsTest_1() throws Exception {
		MapViewer testSubject;
		int y = 0;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getLeftColumns", new Object[] { y });

		Assert.fail();
	}

	/**
	 * Gets the right columns test.
	 *
	 * @return the right columns test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getRightColumns", signature = "()I")
	@Test
	public void getRightColumnsTest() throws Exception {
		MapViewer testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getRightColumns");

		Assert.fail();
	}

	/**
	 * Gets the right columns test 1.
	 *
	 * @return the right columns test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getRightColumns", signature = "(I)I")
	@Test
	public void getRightColumnsTest_1() throws Exception {
		MapViewer testSubject;
		int y = 0;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getRightColumns", new Object[] { y });

		Assert.fail();
	}

	/**
	 * Checks if is map near top test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isMapNearTop", signature = "(I)Z")
	@Test
	public void isMapNearTopTest() throws Exception {
		MapViewer testSubject;
		int y = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isMapNearTop", new Object[] { y });

		Assert.fail();
	}

	/**
	 * Checks if is tile visible test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isTileVisible", signature = "(QTile;)Z")
	@Test
	public void isTileVisibleTest() throws Exception {
		MapViewer testSubject;
		Tile tile = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		result = Whitebox.invokeMethod(testSubject, "isTileVisible", new Object[] { Tile.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Gets the selected tile test.
	 *
	 * @return the selected tile test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSelectedTile", signature = "()QTile;")
	@Test
	public void getSelectedTileTest() throws Exception {
		MapViewer testSubject;
		Tile result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getSelectedTile");

		Assert.fail();
	}

	/**
	 * Sets the selected tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setSelectedTile", signature = "(QTile;)Z")
	@Test
	public void setSelectedTileTest() throws Exception {
		MapViewer testSubject;
		Tile newTile = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "setSelectedTile", new Object[] { Tile.class });

		Assert.fail();
	}

	/**
	 * Find unit in front test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "findUnitInFront", signature = "(QTile;)QUnit;")
	@Test
	public void findUnitInFrontTest() throws Exception {
		MapViewer testSubject;
		Tile unitTile = null;
		Unit result;

		// test 1
		testSubject = createTestSubject();
		unitTile = null;
		result = Whitebox.invokeMethod(testSubject, "findUnitInFront", new Object[] { Tile.class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Gets the active unit test.
	 *
	 * @return the active unit test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getActiveUnit", signature = "()QUnit;")
	@Test
	public void getActiveUnitTest() throws Exception {
		MapViewer testSubject;
		Unit result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getActiveUnit");

		Assert.fail();
	}

	/**
	 * Sets the active unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setActiveUnit", signature = "(QUnit;)Z")
	@Test
	public void setActiveUnitTest() throws Exception {
		MapViewer testSubject;
		Unit activeUnit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		activeUnit = null;
		result = Whitebox.invokeMethod(testSubject, "setActiveUnit", new Object[] { Unit.class });
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		activeUnit = null;
		result = Whitebox.invokeMethod(testSubject, "setActiveUnit", new Object[] { Unit.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Checks if is goto started test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isGotoStarted", signature = "()Z")
	@Test
	public void isGotoStartedTest() throws Exception {
		MapViewer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isGotoStarted");

		Assert.fail();
	}

	/**
	 * Start goto test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startGoto", signature = "()V")
	@Test
	public void startGotoTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "startGoto");

		Assert.fail();
	}

	/**
	 * Stop goto test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "stopGoto", signature = "()V")
	@Test
	public void stopGotoTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "stopGoto");

		Assert.fail();
	}

	/**
	 * Gets the goto path test.
	 *
	 * @return the goto path test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getGotoPath", signature = "()QPathNode;")
	@Test
	public void getGotoPathTest() throws Exception {
		MapViewer testSubject;
		PathNode result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getGotoPath");

		Assert.fail();
	}

	/**
	 * Sets the goto path test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setGotoPath", signature = "(QPathNode;)V")
	@Test
	public void setGotoPathTest() throws Exception {
		MapViewer testSubject;
		PathNode gotoPath = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setGotoPath", new Object[] { PathNode.class });

		Assert.fail();
	}

	/**
	 * Update current path for active unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateCurrentPathForActiveUnit", signature = "()V")
	@Test
	public void updateCurrentPathForActiveUnitTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateCurrentPathForActiveUnit");

		Assert.fail();
	}

	/**
	 * Sets the current path test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setCurrentPath", signature = "(QPathNode;)V")
	@Test
	public void setCurrentPathTest() throws Exception {
		MapViewer testSubject;
		PathNode path = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setCurrentPath", new Object[] { PathNode.class });

		Assert.fail();
	}

	/**
	 * Sets the size test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setSize", signature = "(QDimension;)V")
	@Test
	public void setSizeTest() throws Exception {
		MapViewer testSubject;
		Dimension size = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setSize", new Object[] { Dimension.class });

		Assert.fail();
	}

	/**
	 * Reset map scale test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "resetMapScale", signature = "()V")
	@Test
	public void resetMapScaleTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "resetMapScale");

		Assert.fail();
	}

	/**
	 * Checks if is at max map scale test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isAtMaxMapScale", signature = "()Z")
	@Test
	public void isAtMaxMapScaleTest() throws Exception {
		MapViewer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isAtMaxMapScale");

		Assert.fail();
	}

	/**
	 * Checks if is at min map scale test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isAtMinMapScale", signature = "()Z")
	@Test
	public void isAtMinMapScaleTest() throws Exception {
		MapViewer testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isAtMinMapScale");

		Assert.fail();
	}

	/**
	 * Increase map scale test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "increaseMapScale", signature = "()V")
	@Test
	public void increaseMapScaleTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "increaseMapScale");

		Assert.fail();
	}

	/**
	 * Decrease map scale test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "decreaseMapScale", signature = "()V")
	@Test
	public void decreaseMapScaleTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "decreaseMapScale");

		Assert.fail();
	}

	/**
	 * Update map display variables test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateMapDisplayVariables", signature = "()V")
	@Test
	public void updateMapDisplayVariablesTest() throws Exception {
		MapViewer testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateMapDisplayVariables");

		Assert.fail();
	}

	/**
	 * Sets the image library and update data test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setImageLibraryAndUpdateData", signature = "(QImageLibrary;)V")
	@Test
	public void setImageLibraryAndUpdateDataTest() throws Exception {
		MapViewer testSubject;
		ImageLibrary lib = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setImageLibraryAndUpdateData", new Object[] { ImageLibrary.class });

		Assert.fail();
	}

	/**
	 * Display map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayMap", signature = "(QGraphics2D;)V")
	@Test
	public void displayMapTest() throws Exception {
		MapViewer testSubject;
		Graphics2D g = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayMap", new Object[] { Graphics2D.class });

		Assert.fail();
	}

	/**
	 * Display settlement labels test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displaySettlementLabels", signature = "(QGraphics2D;QSettlement;QPlayer;IQFont;QFont;QFont;)V")
	@Test
	public void displaySettlementLabelsTest() throws Exception {
		MapViewer testSubject;
		Graphics2D g = null;
		Settlement settlement = null;
		Player player = null;
		int colonyLabels = 0;
		Font font = null;
		Font italicFont = null;
		Font productionFont = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displaySettlementLabels", new Object[] { Graphics2D.class, Settlement.class,
				Player.class, colonyLabels, Font.class, Font.class, Font.class });

		Assert.fail();
	}

	/**
	 * Creates the capital label test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCapitalLabel", signature = "(IIQColor;)QBufferedImage;")
	@Test
	public void createCapitalLabelTest() throws Exception {
		int extent = 0;
		int padding = 0;
		Color backgroundColor = null;
		BufferedImage result;

		// default test
		result = Whitebox.invokeMethod(MapViewer.class, "createCapitalLabel",
				new Object[] { extent, padding, Color.class });

		Assert.fail();
	}

	/**
	 * Creates the label test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createLabel", signature = "(QGraphics2D;QString;QFont;QColor;)QBufferedImage;")
	@Test
	public void createLabelTest() throws Exception {
		Graphics2D g = null;
		String text = "";
		Font font = null;
		Color backgroundColor = null;
		BufferedImage result;

		// default test
		result = Whitebox.invokeMethod(MapViewer.class, "createLabel",
				new Object[] { Graphics2D.class, text, Font.class, Color.class });

		Assert.fail();
	}

	/**
	 * Creates the label test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createLabel", signature = "(QGraphics2D;[QTextSpecification;QColor;)QBufferedImage;")
	@Test
	public void createLabelTest_1() throws Exception {
		Graphics2D g = null;
		TextSpecification[] textSpecs = new TextSpecification[] { null };
		Color backgroundColor = null;
		BufferedImage result;

		// default test
		result = Whitebox.invokeMethod(MapViewer.class, "createLabel",
				new Object[] { Graphics2D.class, TextSpecification[].class, Color.class });

		Assert.fail();
	}

	/**
	 * Creates the religious mission label test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createReligiousMissionLabel", signature = "(IIQColor;Z)QBufferedImage;")
	@Test
	public void createReligiousMissionLabelTest() throws Exception {
		int extent = 0;
		int padding = 0;
		Color backgroundColor = null;
		boolean expertMissionary = false;
		BufferedImage result;

		// default test
		result = Whitebox.invokeMethod(MapViewer.class, "createReligiousMissionLabel",
				new Object[] { extent, padding, Color.class, expertMissionary });

		Assert.fail();
	}

	/**
	 * Display path test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayPath", signature = "(QGraphics2D;QPathNode;)V")
	@Test
	public void displayPathTest() throws Exception {
		MapViewer testSubject;
		Graphics2D g = null;
		PathNode path = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayPath", new Object[] { Graphics2D.class, PathNode.class });

		Assert.fail();
	}

	/**
	 * Display unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayUnit", signature = "(QGraphics2D;QUnit;)V")
	@Test
	public void displayUnitTest() throws Exception {
		MapViewer testSubject;
		Graphics2D g = null;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayUnit", new Object[] { Graphics2D.class, Unit.class });

		Assert.fail();
	}

	/**
	 * Calculate unit image position in tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "calculateUnitImagePositionInTile", signature = "(QBufferedImage;)QPoint;")
	@Test
	public void calculateUnitImagePositionInTileTest() throws Exception {
		MapViewer testSubject;
		BufferedImage unitImage = null;
		Point result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "calculateUnitImagePositionInTile",
				new Object[] { BufferedImage.class });

		Assert.fail();
	}

	/**
	 * Display cursor test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayCursor", signature = "(QGraphics2D;)V")
	@Test
	public void displayCursorTest() throws Exception {
		MapViewer testSubject;
		Graphics2D g = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayCursor", new Object[] { Graphics2D.class });

		Assert.fail();
	}

	/**
	 * Display territorial borders test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayTerritorialBorders", signature = "(QGraphics2D;QTile;QBorderType;Z)V")
	@Test
	public void displayTerritorialBordersTest() throws Exception {
		MapViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		BorderType type = null;
		boolean opaque = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayTerritorialBorders",
				new Object[] { Graphics2D.class, Tile.class, BorderType.class, opaque });

		Assert.fail();
	}
}