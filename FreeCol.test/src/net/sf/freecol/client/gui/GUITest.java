/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.control.InGameController.ArmedUnitSettlementAction;
import net.sf.freecol.client.control.InGameController.BoycottAction;
import net.sf.freecol.client.control.InGameController.BuyAction;
import net.sf.freecol.client.control.InGameController.ClaimAction;
import net.sf.freecol.client.control.InGameController.MissionaryAction;
import net.sf.freecol.client.control.InGameController.ScoutColonyAction;
import net.sf.freecol.client.control.InGameController.ScoutIndianSettlementAction;
import net.sf.freecol.client.control.InGameController.SellAction;
import net.sf.freecol.client.control.InGameController.TradeAction;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.DiplomaticTrade;
import net.sf.freecol.common.model.Europe;
import net.sf.freecol.common.model.FoundingFather;
import net.sf.freecol.common.model.FreeColGameObject;
import net.sf.freecol.common.model.FreeColObject;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Goods;
import net.sf.freecol.common.model.GoodsType;
import net.sf.freecol.common.model.HighScore;
import net.sf.freecol.common.model.IndianSettlement;
import net.sf.freecol.common.model.ModelMessage;
import net.sf.freecol.common.model.Monarch.MonarchAction;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.NationSummary;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Settlement;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.StringTemplate;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.option.OptionGroup;

// TODO: Auto-generated Javadoc
/**
 * The Class GUITest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class GUITest {

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
	 * @return the gui
	 */
	private GUI createTestSubject() {
		return new GUI(new FreeColClient(new InputStream(), ""), 0);
	}

	/**
	 * Igc test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "igc", signature = "()QInGameController;")
	@Test
	public void igcTest() throws Exception {
		GUI testSubject;
		InGameController result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "igc");

		Assert.fail();
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
		GUI testSubject;
		ImageLibrary result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getImageLibrary();

		Assert.fail();
	}

	/**
	 * Checks if is windowed test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isWindowed", signature = "()Z")
	@Test
	public void isWindowedTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isWindowed();

		Assert.fail();
	}

	/**
	 * Install look and feel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "installLookAndFeel", signature = "(QString;)V")
	@Test
	public void installLookAndFeelTest() throws Exception {
		GUI testSubject;
		String fontName = "";

		// default test
		testSubject = createTestSubject();
		testSubject.installLookAndFeel(fontName);

		Assert.fail();
	}

	/**
	 * Quit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "quit", signature = "()V")
	@Test
	public void quitTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.quit();

		Assert.fail();
	}

	/**
	 * Initialize in game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "initializeInGame", signature = "(QTile;)V")
	@Test
	public void initializeInGameTest() throws Exception {
		GUI testSubject;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		testSubject.initializeInGame(tile);

		Assert.fail();
	}

	/**
	 * Setup mouse listeners test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setupMouseListeners", signature = "()V")
	@Test
	public void setupMouseListenersTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setupMouseListeners();

		Assert.fail();
	}

	/**
	 * Display splash screen test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displaySplashScreen", signature = "(QInputStream;)V")
	@Test
	public void displaySplashScreenTest() throws Exception {
		GUI testSubject;
		InputStream splashStream = null;

		// default test
		testSubject = createTestSubject();
		testSubject.displaySplashScreen(splashStream);

		Assert.fail();
	}

	/**
	 * Hide splash screen test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "hideSplashScreen", signature = "()V")
	@Test
	public void hideSplashScreenTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.hideSplashScreen();

		Assert.fail();
	}

	/**
	 * Show opening video test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showOpeningVideo", signature = "(QString;)V")
	@Test
	public void showOpeningVideoTest() throws Exception {
		GUI testSubject;
		String userMsg = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showOpeningVideo(userMsg);

		Assert.fail();
	}

	/**
	 * Start GUI test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startGUI", signature = "(QDimension;)V")
	@Test
	public void startGUITest() throws Exception {
		GUI testSubject;
		Dimension desiredWindowSize = null;

		// default test
		testSubject = createTestSubject();
		testSubject.startGUI(desiredWindowSize);

		Assert.fail();
	}

	/**
	 * Change windowed mode test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "changeWindowedMode", signature = "()V")
	@Test
	public void changeWindowedModeTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.changeWindowedMode();

		Assert.fail();
	}

	/**
	 * Start map editor GUI test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startMapEditorGUI", signature = "()V")
	@Test
	public void startMapEditorGUITest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.startMapEditorGUI();

		Assert.fail();
	}

	/**
	 * Activate goto path test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "activateGotoPath", signature = "()V")
	@Test
	public void activateGotoPathTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.activateGotoPath();

		Assert.fail();
	}

	/**
	 * Clear goto path test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "clearGotoPath", signature = "()V")
	@Test
	public void clearGotoPathTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.clearGotoPath();

		Assert.fail();
	}

	/**
	 * Creates the mini map thumb nail test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createMiniMapThumbNail", signature = "()QBufferedImage;")
	@Test
	public void createMiniMapThumbNailTest() throws Exception {
		GUI testSubject;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createMiniMapThumbNail();

		Assert.fail();
	}

	/**
	 * Display chat message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayChatMessage", signature = "(QPlayer;QString;Z)V")
	@Test
	public void displayChatMessageTest() throws Exception {
		GUI testSubject;
		Player player = null;
		String message = "";
		boolean privateChat = false;

		// default test
		testSubject = createTestSubject();
		testSubject.displayChatMessage(player, message, privateChat);

		Assert.fail();
	}

	/**
	 * Refresh test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "refresh", signature = "()V")
	@Test
	public void refreshTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.refresh();

		Assert.fail();
	}

	/**
	 * Reset menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "resetMenuBar", signature = "()V")
	@Test
	public void resetMenuBarTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.resetMenuBar();

		Assert.fail();
	}

	/**
	 * Reset map zoom test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "resetMapZoom", signature = "()V")
	@Test
	public void resetMapZoomTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "resetMapZoom");

		Assert.fail();
	}

	/**
	 * Can zoom in map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "canZoomInMap", signature = "()Z")
	@Test
	public void canZoomInMapTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.canZoomInMap();

		Assert.fail();
	}

	/**
	 * Can zoom out map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "canZoomOutMap", signature = "()Z")
	@Test
	public void canZoomOutMapTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.canZoomOutMap();

		Assert.fail();
	}

	/**
	 * Zoom in map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "zoomInMap", signature = "()V")
	@Test
	public void zoomInMapTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomInMap();

		Assert.fail();
	}

	/**
	 * Zoom out map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "zoomOutMap", signature = "()V")
	@Test
	public void zoomOutMapTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomOutMap();

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
		GUI testSubject;
		Unit unit = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.setActiveUnit(unit);

		Assert.fail();
	}

	/**
	 * Update menu bar test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateMenuBar", signature = "()V")
	@Test
	public void updateMenuBarTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMenuBar();

		Assert.fail();
	}

	/**
	 * Require focus test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "requireFocus", signature = "(QTile;)Z")
	@Test
	public void requireFocusTest() throws Exception {
		GUI testSubject;
		Tile tile = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.requireFocus(tile);

		Assert.fail();
	}

	/**
	 * Animate unit attack test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "animateUnitAttack", signature = "(QUnit;QUnit;QTile;QTile;Z)V")
	@Test
	public void animateUnitAttackTest() throws Exception {
		GUI testSubject;
		Unit attacker = null;
		Unit defender = null;
		Tile attackerTile = null;
		Tile defenderTile = null;
		boolean success = false;

		// default test
		testSubject = createTestSubject();
		testSubject.animateUnitAttack(attacker, defender, attackerTile, defenderTile, success);

		Assert.fail();
	}

	/**
	 * Animate unit move test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "animateUnitMove", signature = "(QUnit;QTile;QTile;)V")
	@Test
	public void animateUnitMoveTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		Tile srcTile = null;
		Tile dstTile = null;

		// default test
		testSubject = createTestSubject();
		testSubject.animateUnitMove(unit, srcTile, dstTile);

		Assert.fail();
	}

	/**
	 * Enable map controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "enableMapControls", signature = "(Z)V")
	@Test
	public void enableMapControlsTest() throws Exception {
		GUI testSubject;
		boolean enable = false;

		// default test
		testSubject = createTestSubject();
		testSubject.enableMapControls(enable);

		Assert.fail();
	}

	/**
	 * Update map controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateMapControls", signature = "()V")
	@Test
	public void updateMapControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMapControls();

		Assert.fail();
	}

	/**
	 * Zoom in map controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "zoomInMapControls", signature = "()V")
	@Test
	public void zoomInMapControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomInMapControls();

		Assert.fail();
	}

	/**
	 * Zoom out map controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "zoomOutMapControls", signature = "()V")
	@Test
	public void zoomOutMapControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomOutMapControls();

		Assert.fail();
	}

	/**
	 * Can zoom in map controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "canZoomInMapControls", signature = "()Z")
	@Test
	public void canZoomInMapControlsTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.canZoomInMapControls();

		Assert.fail();
	}

	/**
	 * Can zoom out map controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "canZoomOutMapControls", signature = "()Z")
	@Test
	public void canZoomOutMapControlsTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.canZoomOutMapControls();

		Assert.fail();
	}

	/**
	 * Mini map toggle view controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "miniMapToggleViewControls", signature = "()V")
	@Test
	public void miniMapToggleViewControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.miniMapToggleViewControls();

		Assert.fail();
	}

	/**
	 * Mini map toggle fog of war controls test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "miniMapToggleFogOfWarControls", signature = "()V")
	@Test
	public void miniMapToggleFogOfWarControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.miniMapToggleFogOfWarControls();

		Assert.fail();
	}

	/**
	 * Confirm test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirm", signature = "(QString;QString;QString;)Z")
	@Test
	public void confirmTest() throws Exception {
		GUI testSubject;
		String textKey = "";
		String okKey = "";
		String cancelKey = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirm(textKey, okKey, cancelKey);

		Assert.fail();
	}

	/**
	 * Confirm test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirm", signature = "(QTile;QStringTemplate;QString;QString;)Z")
	@Test
	public void confirmTest_1() throws Exception {
		GUI testSubject;
		Tile tile = null;
		StringTemplate template = "";
		String okKey = "";
		String cancelKey = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirm(tile, template, okKey, cancelKey);

		Assert.fail();
	}

	/**
	 * Confirm test 2.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirm", signature = "(QTile;QStringTemplate;QUnit;QString;QString;)Z")
	@Test
	public void confirmTest_2() throws Exception {
		GUI testSubject;
		Tile tile = null;
		StringTemplate template = "";
		Unit unit = null;
		String okKey = "";
		String cancelKey = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirm(tile, template, unit, okKey, cancelKey);

		Assert.fail();
	}

	/**
	 * Confirm test 3.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirm", signature = "(QTile;QStringTemplate;QSettlement;QString;QString;)Z")
	@Test
	public void confirmTest_3() throws Exception {
		GUI testSubject;
		Tile tile = null;
		StringTemplate template = "";
		Settlement settlement = null;
		String okKey = "";
		String cancelKey = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirm(tile, template, settlement, okKey, cancelKey);

		Assert.fail();
	}

	/**
	 * Confirm test 4.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirm", signature = "(QTile;QStringTemplate;QGoodsType;QString;QString;)Z")
	@Test
	public void confirmTest_4() throws Exception {
		GUI testSubject;
		Tile tile = null;
		StringTemplate template = "";
		GoodsType goodsType = null;
		String okKey = "";
		String cancelKey = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirm(tile, template, goodsType, okKey, cancelKey);

		Assert.fail();
	}

	/**
	 * Confirm abandon education test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmAbandonEducation", signature = "(QUnit;Z)Z")
	@Test
	public void confirmAbandonEducationTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		boolean leaveColony = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmAbandonEducation(unit, leaveColony);

		Assert.fail();
	}

	/**
	 * Confirm clear trade route test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmClearTradeRoute", signature = "(QUnit;)Z")
	@Test
	public void confirmClearTradeRouteTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmClearTradeRoute(unit);

		Assert.fail();
	}

	/**
	 * Confirm declaration test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmDeclaration", signature = "()QList<QString;>;")
	@Test
	public void confirmDeclarationTest() throws Exception {
		GUI testSubject;
		List<String> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmDeclaration();

		Assert.fail();
	}

	/**
	 * Confirm european tribute test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmEuropeanTribute", signature = "(QUnit;QColony;QNationSummary;)I")
	@Test
	public void confirmEuropeanTributeTest() throws Exception {
		GUI testSubject;
		Unit attacker = null;
		Colony colony = null;
		NationSummary ns = null;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmEuropeanTribute(attacker, colony, ns);

		Assert.fail();
	}

	/**
	 * Confirm hostile action test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmHostileAction", signature = "(QUnit;QTile;)Z")
	@Test
	public void confirmHostileActionTest() throws Exception {
		GUI testSubject;
		Unit attacker = null;
		Tile target = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmHostileAction(attacker, target);

		Assert.fail();
	}

	/**
	 * Confirm leave colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmLeaveColony", signature = "(QUnit;)Z")
	@Test
	public void confirmLeaveColonyTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmLeaveColony(unit);

		Assert.fail();
	}

	/**
	 * Confirm native tribute test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmNativeTribute", signature = "(QUnit;QIndianSettlement;)I")
	@Test
	public void confirmNativeTributeTest() throws Exception {
		GUI testSubject;
		Unit attacker = null;
		IndianSettlement is = null;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmNativeTribute(attacker, is);

		Assert.fail();
	}

	/**
	 * Confirm pre combat test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmPreCombat", signature = "(QUnit;QTile;)Z")
	@Test
	public void confirmPreCombatTest() throws Exception {
		GUI testSubject;
		Unit attacker = null;
		Tile tile = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmPreCombat(attacker, tile);

		Assert.fail();
	}

	/**
	 * Confirm stop game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "confirmStopGame", signature = "()Z")
	@Test
	public void confirmStopGameTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.confirmStopGame();

		Assert.fail();
	}

	/**
	 * Gets the armed unit settlement choice test.
	 *
	 * @return the armed unit settlement choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getArmedUnitSettlementChoice", signature = "(QSettlement;)QArmedUnitSettlementAction;")
	@Test
	public void getArmedUnitSettlementChoiceTest() throws Exception {
		GUI testSubject;
		Settlement settlement = null;
		ArmedUnitSettlementAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getArmedUnitSettlementChoice(settlement);

		Assert.fail();
	}

	/**
	 * Gets the boycott choice test.
	 *
	 * @return the boycott choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBoycottChoice", signature = "(QGoods;QEurope;)QBoycottAction;")
	@Test
	public void getBoycottChoiceTest() throws Exception {
		GUI testSubject;
		Goods goods = null;
		Europe europe = null;
		BoycottAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBoycottChoice(goods, europe);

		Assert.fail();
	}

	/**
	 * Gets the buy choice test.
	 *
	 * @return the buy choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBuyChoice", signature = "(QUnit;QSettlement;QGoods;IZ)QBuyAction;")
	@Test
	public void getBuyChoiceTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		Settlement settlement = null;
		Goods goods = null;
		int gold = 0;
		boolean canBuy = false;
		BuyAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBuyChoice(unit, settlement, goods, gold, canBuy);

		Assert.fail();
	}

	/**
	 * Gets the claim choice test.
	 *
	 * @return the claim choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getClaimChoice", signature = "(QTile;QPlayer;IQPlayer;)QClaimAction;")
	@Test
	public void getClaimChoiceTest() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Player player = null;
		int price = 0;
		Player owner = null;
		ClaimAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getClaimChoice(tile, player, price, owner);

		Assert.fail();
	}

	/**
	 * Gets the indian settlement trade choice test.
	 *
	 * @return the indian settlement trade choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getIndianSettlementTradeChoice", signature = "(QSettlement;QStringTemplate;ZZZ)QTradeAction;")
	@Test
	public void getIndianSettlementTradeChoiceTest() throws Exception {
		GUI testSubject;
		Settlement settlement = null;
		StringTemplate template = "";
		boolean canBuy = false;
		boolean canSell = false;
		boolean canGift = false;
		TradeAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getIndianSettlementTradeChoice(settlement, template, canBuy, canSell, canGift);

		Assert.fail();
	}

	/**
	 * Gets the missionary choice test.
	 *
	 * @return the missionary choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMissionaryChoice", signature = "(QUnit;QIndianSettlement;ZZ)QMissionaryAction;")
	@Test
	public void getMissionaryChoiceTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		IndianSettlement settlement = null;
		boolean canEstablish = false;
		boolean canDenounce = false;
		MissionaryAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMissionaryChoice(unit, settlement, canEstablish, canDenounce);

		Assert.fail();
	}

	/**
	 * Gets the new colony name test.
	 *
	 * @return the new colony name test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getNewColonyName", signature = "(QPlayer;QTile;)QString;")
	@Test
	public void getNewColonyNameTest() throws Exception {
		GUI testSubject;
		Player player = null;
		Tile tile = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getNewColonyName(player, tile);

		Assert.fail();
	}

	/**
	 * Gets the scout foreign colony choice test.
	 *
	 * @return the scout foreign colony choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getScoutForeignColonyChoice", signature = "(QColony;QUnit;Z)QScoutColonyAction;")
	@Test
	public void getScoutForeignColonyChoiceTest() throws Exception {
		GUI testSubject;
		Colony colony = null;
		Unit unit = null;
		boolean neg = false;
		ScoutColonyAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getScoutForeignColonyChoice(colony, unit, neg);

		Assert.fail();
	}

	/**
	 * Gets the scout indian settlement choice test.
	 *
	 * @return the scout indian settlement choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getScoutIndianSettlementChoice", signature = "(QIndianSettlement;QString;)QScoutIndianSettlementAction;")
	@Test
	public void getScoutIndianSettlementChoiceTest() throws Exception {
		GUI testSubject;
		IndianSettlement settlement = null;
		String numberString = "";
		ScoutIndianSettlementAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getScoutIndianSettlementChoice(settlement, numberString);

		Assert.fail();
	}

	/**
	 * Gets the sell choice test.
	 *
	 * @return the sell choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSellChoice", signature = "(QUnit;QSettlement;QGoods;I)QSellAction;")
	@Test
	public void getSellChoiceTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		Settlement settlement = null;
		Goods goods = null;
		int gold = 0;
		SellAction result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSellChoice(unit, settlement, goods, gold);

		Assert.fail();
	}

	/**
	 * Gets the choice test.
	 *
	 * @return the choice test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getChoice", signature = "(QTile;QObject;QString;QList<QChoiceItem<QT;>;>;)QT;")
	@Test
	public void getChoiceTest() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Object explain = null;
		String cancelKey = "";
		List<ChoiceItem<T>> choices = null;
		T result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChoice(tile, explain, cancelKey, choices);

		Assert.fail();
	}

	/**
	 * Gets the choice test 1.
	 *
	 * @return the choice test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getChoice", signature = "(QTile;QObject;QUnit;QString;QList<QChoiceItem<QT;>;>;)QT;")
	@Test
	public void getChoiceTest_1() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Object explain = null;
		Unit unit = null;
		String cancelKey = "";
		List<ChoiceItem<T>> choices = null;
		T result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChoice(tile, explain, unit, cancelKey, choices);

		Assert.fail();
	}

	/**
	 * Gets the choice test 2.
	 *
	 * @return the choice test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getChoice", signature = "(QTile;QObject;QSettlement;QString;QList<QChoiceItem<QT;>;>;)QT;")
	@Test
	public void getChoiceTest_2() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Object explain = null;
		Settlement settlement = null;
		String cancelKey = "";
		List<ChoiceItem<T>> choices = null;
		T result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChoice(tile, explain, settlement, cancelKey, choices);

		Assert.fail();
	}

	/**
	 * Gets the choice test 3.
	 *
	 * @return the choice test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getChoice", signature = "(QTile;QObject;QGoodsType;QString;QList<QChoiceItem<QT;>;>;)QT;")
	@Test
	public void getChoiceTest_3() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Object explain = null;
		GoodsType goodsType = null;
		String cancelKey = "";
		List<ChoiceItem<T>> choices = null;
		T result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChoice(tile, explain, goodsType, cancelKey, choices);

		Assert.fail();
	}

	/**
	 * Gets the choice test 4.
	 *
	 * @return the choice test 4
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getChoice", signature = "(QTile;QObject;QNation;QString;QList<QChoiceItem<QT;>;>;)QT;")
	@Test
	public void getChoiceTest_4() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Object explain = null;
		Nation nation = null;
		String cancelKey = "";
		List<ChoiceItem<T>> choices = null;
		T result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChoice(tile, explain, nation, cancelKey, choices);

		Assert.fail();
	}

	/**
	 * Gets the input test.
	 *
	 * @return the input test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getInput", signature = "(QTile;QStringTemplate;QString;QString;QString;)QString;")
	@Test
	public void getInputTest() throws Exception {
		GUI testSubject;
		Tile tile = null;
		StringTemplate template = "";
		String defaultValue = "";
		String okKey = "";
		String cancelKey = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getInput(tile, template, defaultValue, okKey, cancelKey);

		Assert.fail();
	}

	/**
	 * Close main panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "closeMainPanel", signature = "()V")
	@Test
	public void closeMainPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeMainPanel();

		Assert.fail();
	}

	/**
	 * Close menus test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "closeMenus", signature = "()V")
	@Test
	public void closeMenusTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeMenus();

		Assert.fail();
	}

	/**
	 * Close status panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "closeStatusPanel", signature = "()V")
	@Test
	public void closeStatusPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeStatusPanel();

		Assert.fail();
	}

	/**
	 * Contains in game components test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "containsInGameComponents", signature = "()Z")
	@Test
	public void containsInGameComponentsTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.containsInGameComponents();

		Assert.fail();
	}

	/**
	 * Gets the loading savegame info test.
	 *
	 * @return the loading savegame info test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getLoadingSavegameInfo", signature = "()QLoadingSavegameInfo;")
	@Test
	public void getLoadingSavegameInfoTest() throws Exception {
		GUI testSubject;
		LoadingSavegameInfo result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getLoadingSavegameInfo();

		Assert.fail();
	}

	/**
	 * Checks if is client options dialog showing test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isClientOptionsDialogShowing", signature = "()Z")
	@Test
	public void isClientOptionsDialogShowingTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isClientOptionsDialogShowing();

		Assert.fail();
	}

	/**
	 * Checks if is mapboard actions enabled test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isMapboardActionsEnabled", signature = "()Z")
	@Test
	public void isMapboardActionsEnabledTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isMapboardActionsEnabled();

		Assert.fail();
	}

	/**
	 * Checks if is showing sub panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isShowingSubPanel", signature = "()Z")
	@Test
	public void isShowingSubPanelTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isShowingSubPanel();

		Assert.fail();
	}

	/**
	 * Paint immediately canvas in test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "paintImmediatelyCanvasIn", signature = "(QRectangle;)V")
	@Test
	public void paintImmediatelyCanvasInTest() throws Exception {
		GUI testSubject;
		Rectangle rectangle = null;

		// default test
		testSubject = createTestSubject();
		testSubject.paintImmediatelyCanvasIn(rectangle);

		Assert.fail();
	}

	/**
	 * Paint immediately canvas in its bounds test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "paintImmediatelyCanvasInItsBounds", signature = "()V")
	@Test
	public void paintImmediatelyCanvasInItsBoundsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.paintImmediatelyCanvasInItsBounds();

		Assert.fail();
	}

	/**
	 * Refresh players table test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "refreshPlayersTable", signature = "()V")
	@Test
	public void refreshPlayersTableTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.refreshPlayersTable();

		Assert.fail();
	}

	/**
	 * Removes the in game components test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "removeInGameComponents", signature = "()V")
	@Test
	public void removeInGameComponentsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.removeInGameComponents();

		Assert.fail();
	}

	/**
	 * Request focus for sub panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "requestFocusForSubPanel", signature = "()V")
	@Test
	public void requestFocusForSubPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.requestFocusForSubPanel();

		Assert.fail();
	}

	/**
	 * Request focus in window test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "requestFocusInWindow", signature = "()Z")
	@Test
	public void requestFocusInWindowTest() throws Exception {
		GUI testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.requestFocusInWindow();

		Assert.fail();
	}

	/**
	 * Return to title test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "returnToTitle", signature = "()V")
	@Test
	public void returnToTitleTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.returnToTitle();

		Assert.fail();
	}

	/**
	 * Show about panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showAboutPanel", signature = "()V")
	@Test
	public void showAboutPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showAboutPanel();

		Assert.fail();
	}

	/**
	 * Show capture goods dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showCaptureGoodsDialog", signature = "(QUnit;QList<QGoods;>;QDialogHandler<QList<QGoods;>;>;)V")
	@Test
	public void showCaptureGoodsDialogTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		List<Goods> gl = null;
		DialogHandler<List<Goods>> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showCaptureGoodsDialog(unit, gl, handler);

		Assert.fail();
	}

	/**
	 * Show chat panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showChatPanel", signature = "()V")
	@Test
	public void showChatPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showChatPanel();

		Assert.fail();
	}

	/**
	 * Show choose founding father dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showChooseFoundingFatherDialog", signature = "(QList<QFoundingFather;>;QDialogHandler<QFoundingFather;>;)V")
	@Test
	public void showChooseFoundingFatherDialogTest() throws Exception {
		GUI testSubject;
		List<FoundingFather> ffs = null;
		DialogHandler<FoundingFather> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showChooseFoundingFatherDialog(ffs, handler);

		Assert.fail();
	}

	/**
	 * Show client options dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showClientOptionsDialog", signature = "()V")
	@Test
	public void showClientOptionsDialogTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showClientOptionsDialog();

		Assert.fail();
	}

	/**
	 * Show settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showSettlement", signature = "(QSettlement;)V")
	@Test
	public void showSettlementTest() throws Exception {
		GUI testSubject;
		Settlement settlement = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showSettlement", new Object[] { Settlement.class });

		Assert.fail();
	}

	/**
	 * Show foreign colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showForeignColony", signature = "(QSettlement;)V")
	@Test
	public void showForeignColonyTest() throws Exception {
		GUI testSubject;
		Settlement settlement = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showForeignColony", new Object[] { Settlement.class });

		Assert.fail();
	}

	/**
	 * Show colony panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showColonyPanel", signature = "(QColony;QUnit;)V")
	@Test
	public void showColonyPanelTest() throws Exception {
		GUI testSubject;
		Colony colony = null;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showColonyPanel(colony, unit);

		Assert.fail();
	}

	/**
	 * Show colopedia panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showColopediaPanel", signature = "(QString;)V")
	@Test
	public void showColopediaPanelTest() throws Exception {
		GUI testSubject;
		String nodeId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showColopediaPanel(nodeId);

		Assert.fail();
	}

	/**
	 * Show compact labour report test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showCompactLabourReport", signature = "()V")
	@Test
	public void showCompactLabourReportTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showCompactLabourReport();

		Assert.fail();
	}

	/**
	 * Show declaration panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showDeclarationPanel", signature = "()V")
	@Test
	public void showDeclarationPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showDeclarationPanel();

		Assert.fail();
	}

	/**
	 * Show difficulty dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showDifficultyDialog", signature = "()QOptionGroup;")
	@Test
	public void showDifficultyDialogTest() throws Exception {
		GUI testSubject;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showDifficultyDialog();

		Assert.fail();
	}

	/**
	 * Show dump cargo dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showDumpCargoDialog", signature = "(QUnit;QDialogHandler<QList<QGoods;>;>;)V")
	@Test
	public void showDumpCargoDialogTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		DialogHandler<List<Goods>> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showDumpCargoDialog(unit, handler);

		Assert.fail();
	}

	/**
	 * Show edit option dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showEditOptionDialog", signature = "(QOption;)Z")
	@Test
	public void showEditOptionDialogTest() throws Exception {
		GUI testSubject;
		Option option = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showEditOptionDialog(option);

		Assert.fail();
	}

	/**
	 * Show emigration dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showEmigrationDialog", signature = "(QPlayer;ZQDialogHandler<QInteger;>;)V")
	@Test
	public void showEmigrationDialogTest() throws Exception {
		GUI testSubject;
		Player player = null;
		boolean fountainOfYouth = false;
		DialogHandler<Integer> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showEmigrationDialog(player, fountainOfYouth, handler);

		Assert.fail();
	}

	/**
	 * Show end turn dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showEndTurnDialog", signature = "(QList<QUnit;>;QDialogHandler<QBoolean;>;)V")
	@Test
	public void showEndTurnDialogTest() throws Exception {
		GUI testSubject;
		List<Unit> units = null;
		DialogHandler<Boolean> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showEndTurnDialog(units, handler);

		Assert.fail();
	}

	/**
	 * Show error message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showErrorMessage", signature = "(QStringTemplate;)V")
	@Test
	public void showErrorMessageTest() throws Exception {
		GUI testSubject;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showErrorMessage(template);

		Assert.fail();
	}

	/**
	 * Show error message test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showErrorMessage", signature = "(QString;)V")
	@Test
	public void showErrorMessageTest_1() throws Exception {
		GUI testSubject;
		String messageId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showErrorMessage(messageId);

		Assert.fail();
	}

	/**
	 * Show error message test 2.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showErrorMessage", signature = "(QString;QString;)V")
	@Test
	public void showErrorMessageTest_2() throws Exception {
		GUI testSubject;
		String messageID = "";
		String message = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showErrorMessage(messageID, message);

		Assert.fail();
	}

	/**
	 * Show europe panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showEuropePanel", signature = "()V")
	@Test
	public void showEuropePanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showEuropePanel();

		Assert.fail();
	}

	/**
	 * Show event panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showEventPanel", signature = "(QString;QString;QString;)V")
	@Test
	public void showEventPanelTest() throws Exception {
		GUI testSubject;
		String header = "";
		String image = "";
		String footer = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showEventPanel(header, image, footer);

		Assert.fail();
	}

	/**
	 * Show find settlement panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showFindSettlementPanel", signature = "()V")
	@Test
	public void showFindSettlementPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showFindSettlementPanel();

		Assert.fail();
	}

	/**
	 * Show game options dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showGameOptionsDialog", signature = "(ZZ)QOptionGroup;")
	@Test
	public void showGameOptionsDialogTest() throws Exception {
		GUI testSubject;
		boolean editable = false;
		boolean custom = false;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showGameOptionsDialog(editable, custom);

		Assert.fail();
	}

	/**
	 * Show high scores panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showHighScoresPanel", signature = "(QString;QList<QHighScore;>;)V")
	@Test
	public void showHighScoresPanelTest() throws Exception {
		GUI testSubject;
		String messageId = "";
		List<HighScore> scores = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showHighScoresPanel(messageId, scores);

		Assert.fail();
	}

	/**
	 * Show indian settlement panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showIndianSettlementPanel", signature = "(QIndianSettlement;)V")
	@Test
	public void showIndianSettlementPanelTest() throws Exception {
		GUI testSubject;
		IndianSettlement indianSettlement = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showIndianSettlementPanel(indianSettlement);

		Assert.fail();
	}

	/**
	 * Show information message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QString;)V")
	@Test
	public void showInformationMessageTest() throws Exception {
		GUI testSubject;
		String messageId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(messageId);

		Assert.fail();
	}

	/**
	 * Show information message test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QStringTemplate;)V")
	@Test
	public void showInformationMessageTest_1() throws Exception {
		GUI testSubject;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(template);

		Assert.fail();
	}

	/**
	 * Show information message test 2.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QSettlement;QString;)V")
	@Test
	public void showInformationMessageTest_2() throws Exception {
		GUI testSubject;
		Settlement displayObject = null;
		String messageId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, messageId);

		Assert.fail();
	}

	/**
	 * Show information message test 3.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QSettlement;QStringTemplate;)V")
	@Test
	public void showInformationMessageTest_3() throws Exception {
		GUI testSubject;
		Settlement displayObject = null;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, template);

		Assert.fail();
	}

	/**
	 * Show information message test 4.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QUnit;QStringTemplate;)V")
	@Test
	public void showInformationMessageTest_4() throws Exception {
		GUI testSubject;
		Unit displayObject = null;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, template);

		Assert.fail();
	}

	/**
	 * Show information message test 5.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QTile;QString;)V")
	@Test
	public void showInformationMessageTest_5() throws Exception {
		GUI testSubject;
		Tile displayObject = null;
		String messageId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, messageId);

		Assert.fail();
	}

	/**
	 * Show information message test 6.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QTile;QStringTemplate;)V")
	@Test
	public void showInformationMessageTest_6() throws Exception {
		GUI testSubject;
		Tile displayObject = null;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, template);

		Assert.fail();
	}

	/**
	 * Show information message test 7.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QFreeColObject;QString;)V")
	@Test
	public void showInformationMessageTest_7() throws Exception {
		GUI testSubject;
		FreeColObject displayObject = null;
		String messageId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, messageId);

		Assert.fail();
	}

	/**
	 * Show information message test 8.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showInformationMessage", signature = "(QFreeColObject;QStringTemplate;)V")
	@Test
	public void showInformationMessageTest_8() throws Exception {
		GUI testSubject;
		FreeColObject displayObject = null;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showInformationMessage(displayObject, template);

		Assert.fail();
	}

	/**
	 * Show load dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showLoadDialog", signature = "(QFile;)QFile;")
	@Test
	public void showLoadDialogTest() throws Exception {
		GUI testSubject;
		File directory = null;
		File result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showLoadDialog(directory);

		Assert.fail();
	}

	/**
	 * Show load save file dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showLoadSaveFileDialog", signature = "()QFile;")
	@Test
	public void showLoadSaveFileDialogTest() throws Exception {
		GUI testSubject;
		File result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showLoadSaveFileDialog();

		Assert.fail();
	}

	/**
	 * Show loading savegame dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showLoadingSavegameDialog", signature = "(ZZ)Z")
	@Test
	public void showLoadingSavegameDialogTest() throws Exception {
		GUI testSubject;
		boolean publicServer = false;
		boolean singlePlayer = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showLoadingSavegameDialog(publicServer, singlePlayer);

		Assert.fail();
	}

	/**
	 * Show log file panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showLogFilePanel", signature = "()V")
	@Test
	public void showLogFilePanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showLogFilePanel();

		Assert.fail();
	}

	/**
	 * Show main panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showMainPanel", signature = "(QString;)V")
	@Test
	public void showMainPanelTest() throws Exception {
		GUI testSubject;
		String userMsg = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showMainPanel(userMsg);

		Assert.fail();
	}

	/**
	 * Show map generator options dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showMapGeneratorOptionsDialog", signature = "(Z)QOptionGroup;")
	@Test
	public void showMapGeneratorOptionsDialogTest() throws Exception {
		GUI testSubject;
		boolean editable = false;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showMapGeneratorOptionsDialog(editable);

		Assert.fail();
	}

	/**
	 * Show map size dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showMapSizeDialog", signature = "()QDimension;")
	@Test
	public void showMapSizeDialogTest() throws Exception {
		GUI testSubject;
		Dimension result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showMapSizeDialog();

		Assert.fail();
	}

	/**
	 * Show model messages test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showModelMessages", signature = "(QList<QModelMessage;>;)V")
	@Test
	public void showModelMessagesTest() throws Exception {
		GUI testSubject;
		List<ModelMessage> modelMessages = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showModelMessages(modelMessages);

		Assert.fail();
	}

	/**
	 * Show monarch dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showMonarchDialog", signature = "(QMonarchAction;QStringTemplate;QString;QDialogHandler<QBoolean;>;)V")
	@Test
	public void showMonarchDialogTest() throws Exception {
		GUI testSubject;
		MonarchAction action = null;
		StringTemplate template = "";
		String monarchKey = "";
		DialogHandler<Boolean> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showMonarchDialog(action, template, monarchKey, handler);

		Assert.fail();
	}

	/**
	 * Show naming dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showNamingDialog", signature = "(QStringTemplate;QString;QUnit;QDialogHandler<QString;>;)V")
	@Test
	public void showNamingDialogTest() throws Exception {
		GUI testSubject;
		StringTemplate template = "";
		String defaultName = "";
		Unit unit = null;
		DialogHandler<String> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showNamingDialog(template, defaultName, unit, handler);

		Assert.fail();
	}

	/**
	 * Show first contact dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showFirstContactDialog", signature = "(QPlayer;QPlayer;QTile;IQDialogHandler<QBoolean;>;)V")
	@Test
	public void showFirstContactDialogTest() throws Exception {
		GUI testSubject;
		Player player = null;
		Player other = null;
		Tile tile = null;
		int settlementCount = 0;
		DialogHandler<Boolean> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showFirstContactDialog(player, other, tile, settlementCount, handler);

		Assert.fail();
	}

	/**
	 * Show negotiation dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showNegotiationDialog", signature = "(QFreeColGameObject;QFreeColGameObject;QDiplomaticTrade;QStringTemplate;)QDiplomaticTrade;")
	@Test
	public void showNegotiationDialogTest() throws Exception {
		GUI testSubject;
		FreeColGameObject our = null;
		FreeColGameObject other = null;
		DiplomaticTrade agreement = null;
		StringTemplate comment = "";
		DiplomaticTrade result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showNegotiationDialog(our, other, agreement, comment);

		Assert.fail();
	}

	/**
	 * Show new panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showNewPanel", signature = "()V")
	@Test
	public void showNewPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showNewPanel();

		Assert.fail();
	}

	/**
	 * Show new panel test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showNewPanel", signature = "(QSpecification;)V")
	@Test
	public void showNewPanelTest_1() throws Exception {
		GUI testSubject;
		Specification specification = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showNewPanel(specification);

		Assert.fail();
	}

	/**
	 * Show spy colony panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showSpyColonyPanel", signature = "(QTile;QRunnable;)V")
	@Test
	public void showSpyColonyPanelTest() throws Exception {
		GUI testSubject;
		Tile tile = null;
		Runnable callback = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showSpyColonyPanel(tile, callback);

		Assert.fail();
	}

	/**
	 * Show parameters dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showParametersDialog", signature = "()QParameters;")
	@Test
	public void showParametersDialogTest() throws Exception {
		GUI testSubject;
		Parameters result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showParametersDialog();

		Assert.fail();
	}

	/**
	 * Show pre combat dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showPreCombatDialog", signature = "(QUnit;QFreeColGameObject;QTile;)Z")
	@Test
	public void showPreCombatDialogTest() throws Exception {
		GUI testSubject;
		Unit attacker = null;
		FreeColGameObject defender = null;
		Tile tile = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showPreCombatDialog(attacker, defender, tile);

		Assert.fail();
	}

	/**
	 * Show report cargo panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportCargoPanel", signature = "()V")
	@Test
	public void showReportCargoPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportCargoPanel();

		Assert.fail();
	}

	/**
	 * Show report colony panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportColonyPanel", signature = "()V")
	@Test
	public void showReportColonyPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportColonyPanel();

		Assert.fail();
	}

	/**
	 * Show report continental congress panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportContinentalCongressPanel", signature = "()V")
	@Test
	public void showReportContinentalCongressPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportContinentalCongressPanel();

		Assert.fail();
	}

	/**
	 * Show report education panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportEducationPanel", signature = "()V")
	@Test
	public void showReportEducationPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportEducationPanel();

		Assert.fail();
	}

	/**
	 * Show report exploration panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportExplorationPanel", signature = "()V")
	@Test
	public void showReportExplorationPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportExplorationPanel();

		Assert.fail();
	}

	/**
	 * Show report foreign affair panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportForeignAffairPanel", signature = "()V")
	@Test
	public void showReportForeignAffairPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportForeignAffairPanel();

		Assert.fail();
	}

	/**
	 * Show report history panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportHistoryPanel", signature = "()V")
	@Test
	public void showReportHistoryPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportHistoryPanel();

		Assert.fail();
	}

	/**
	 * Show report indian panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportIndianPanel", signature = "()V")
	@Test
	public void showReportIndianPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportIndianPanel();

		Assert.fail();
	}

	/**
	 * Show report labour panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportLabourPanel", signature = "()V")
	@Test
	public void showReportLabourPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportLabourPanel();

		Assert.fail();
	}

	/**
	 * Show report military panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportMilitaryPanel", signature = "()V")
	@Test
	public void showReportMilitaryPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportMilitaryPanel();

		Assert.fail();
	}

	/**
	 * Show report naval panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportNavalPanel", signature = "()V")
	@Test
	public void showReportNavalPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportNavalPanel();

		Assert.fail();
	}

	/**
	 * Show report production panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportProductionPanel", signature = "()V")
	@Test
	public void showReportProductionPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportProductionPanel();

		Assert.fail();
	}

	/**
	 * Show report religious panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportReligiousPanel", signature = "()V")
	@Test
	public void showReportReligiousPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportReligiousPanel();

		Assert.fail();
	}

	/**
	 * Show report requirements panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportRequirementsPanel", signature = "()V")
	@Test
	public void showReportRequirementsPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportRequirementsPanel();

		Assert.fail();
	}

	/**
	 * Show report trade panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportTradePanel", signature = "()V")
	@Test
	public void showReportTradePanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportTradePanel();

		Assert.fail();
	}

	/**
	 * Show report turn panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showReportTurnPanel", signature = "(QList<QModelMessage;>;)V")
	@Test
	public void showReportTurnPanelTest() throws Exception {
		GUI testSubject;
		List<ModelMessage> messages = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportTurnPanel(messages);

		Assert.fail();
	}

	/**
	 * Show save dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showSaveDialog", signature = "(QFile;QString;)QFile;")
	@Test
	public void showSaveDialogTest() throws Exception {
		GUI testSubject;
		File directory = null;
		String defaultName = "";
		File result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showSaveDialog(directory, defaultName);

		Assert.fail();
	}

	/**
	 * Show scale map size dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showScaleMapSizeDialog", signature = "()QDimension;")
	@Test
	public void showScaleMapSizeDialogTest() throws Exception {
		GUI testSubject;
		Dimension result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showScaleMapSizeDialog();

		Assert.fail();
	}

	/**
	 * Show select amount dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showSelectAmountDialog", signature = "(QGoodsType;IIZ)I")
	@Test
	public void showSelectAmountDialogTest() throws Exception {
		GUI testSubject;
		GoodsType goodsType = null;
		int available = 0;
		int defaultAmount = 0;
		boolean needToPay = false;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showSelectAmountDialog(goodsType, available, defaultAmount, needToPay);

		Assert.fail();
	}

	/**
	 * Show select tribute amount dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showSelectTributeAmountDialog", signature = "(QStringTemplate;I)I")
	@Test
	public void showSelectTributeAmountDialogTest() throws Exception {
		GUI testSubject;
		StringTemplate question = "";
		int maximum = 0;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showSelectTributeAmountDialog(question, maximum);

		Assert.fail();
	}

	/**
	 * Show select destination dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showSelectDestinationDialog", signature = "(QUnit;)QLocation;")
	@Test
	public void showSelectDestinationDialogTest() throws Exception {
		GUI testSubject;
		Unit unit = null;
		Location result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.showSelectDestinationDialog(unit);

		Assert.fail();
	}

	/**
	 * Show start game panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showStartGamePanel", signature = "(QGame;QPlayer;Z)V")
	@Test
	public void showStartGamePanelTest() throws Exception {
		GUI testSubject;
		Game game = null;
		Player player = null;
		boolean singlePlayerMode = false;

		// default test
		testSubject = createTestSubject();
		testSubject.showStartGamePanel(game, player, singlePlayerMode);

		Assert.fail();
	}

	/**
	 * Show statistics panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showStatisticsPanel", signature = "()V")
	@Test
	public void showStatisticsPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showStatisticsPanel();

		Assert.fail();
	}

	/**
	 * Show status panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showStatusPanel", signature = "(QString;)V")
	@Test
	public void showStatusPanelTest() throws Exception {
		GUI testSubject;
		String message = "";

		// default test
		testSubject = createTestSubject();
		testSubject.showStatusPanel(message);

		Assert.fail();
	}

	/**
	 * Show tile pop up at selected tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showTilePopUpAtSelectedTile", signature = "()V")
	@Test
	public void showTilePopUpAtSelectedTileTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showTilePopUpAtSelectedTile();

		Assert.fail();
	}

	/**
	 * Show trade route panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showTradeRoutePanel", signature = "(QUnit;)V")
	@Test
	public void showTradeRoutePanelTest() throws Exception {
		GUI testSubject;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showTradeRoutePanel(unit);

		Assert.fail();
	}

	/**
	 * Show victory dialog test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "showVictoryDialog", signature = "(QDialogHandler<QBoolean;>;)V")
	@Test
	public void showVictoryDialogTest() throws Exception {
		GUI testSubject;
		DialogHandler<Boolean> handler = null;

		// default test
		testSubject = createTestSubject();
		testSubject.showVictoryDialog(handler);

		Assert.fail();
	}

	/**
	 * Update game options test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateGameOptions", signature = "()V")
	@Test
	public void updateGameOptionsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateGameOptions();

		Assert.fail();
	}

	/**
	 * Update map generator options test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateMapGeneratorOptions", signature = "()V")
	@Test
	public void updateMapGeneratorOptionsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMapGeneratorOptions();

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
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.centerActiveUnit();

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
		GUI testSubject;
		int newViewMode = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.changeViewMode(newViewMode);

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
		GUI testSubject;
		Unit result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getActiveUnit();

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
		GUI testSubject;
		Tile result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getFocus();

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
		GUI testSubject;
		Tile result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSelectedTile();

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
		GUI testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getViewMode();

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
		GUI testSubject;
		Tile tileToFocus = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setFocus(tileToFocus);

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
		GUI testSubject;
		Tile newTileToSelect = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.setSelectedTile(newTileToSelect);

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
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.toggleViewMode();

		Assert.fail();
	}

	/**
	 * Play sound test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "playSound", signature = "(QString;)V")
	@Test
	public void playSoundTest() throws Exception {
		GUI testSubject;
		String sound = "";

		// default test
		testSubject = createTestSubject();
		testSubject.playSound(sound);

		Assert.fail();
	}

	/**
	 * Alert sound test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "alertSound", signature = "()V")
	@Test
	public void alertSoundTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "alertSound");

		Assert.fail();
	}

	/**
	 * Gets the sound mixer label text test.
	 *
	 * @return the sound mixer label text test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSoundMixerLabelText", signature = "()QString;")
	@Test
	public void getSoundMixerLabelTextTest() throws Exception {
		GUI testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSoundMixerLabelText();

		Assert.fail();
	}

	/**
	 * Invoke now or later test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "invokeNowOrLater", signature = "(QRunnable;)V")
	@Test
	public void invokeNowOrLaterTest() throws Exception {
		GUI testSubject;
		Runnable runnable = null;

		// default test
		testSubject = createTestSubject();
		testSubject.invokeNowOrLater(runnable);

		Assert.fail();
	}

	/**
	 * Invoke now or wait test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "invokeNowOrWait", signature = "(QRunnable;)V")
	@Test
	public void invokeNowOrWaitTest() throws Exception {
		GUI testSubject;
		Runnable runnable = null;

		// default test
		testSubject = createTestSubject();
		testSubject.invokeNowOrWait(runnable);

		Assert.fail();
	}
}