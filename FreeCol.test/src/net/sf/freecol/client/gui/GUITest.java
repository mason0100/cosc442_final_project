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

@Generated(value = "org.junit-tools-1.1.0")
public class GUITest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private GUI createTestSubject() {
		return new GUI(new FreeColClient(new InputStream(), ""), 0);
	}

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

	@MethodRef(name = "quit", signature = "()V")
	@Test
	public void quitTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.quit();

		Assert.fail();
	}

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

	@MethodRef(name = "setupMouseListeners", signature = "()V")
	@Test
	public void setupMouseListenersTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setupMouseListeners();

		Assert.fail();
	}

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

	@MethodRef(name = "hideSplashScreen", signature = "()V")
	@Test
	public void hideSplashScreenTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.hideSplashScreen();

		Assert.fail();
	}

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

	@MethodRef(name = "changeWindowedMode", signature = "()V")
	@Test
	public void changeWindowedModeTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.changeWindowedMode();

		Assert.fail();
	}

	@MethodRef(name = "startMapEditorGUI", signature = "()V")
	@Test
	public void startMapEditorGUITest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.startMapEditorGUI();

		Assert.fail();
	}

	@MethodRef(name = "activateGotoPath", signature = "()V")
	@Test
	public void activateGotoPathTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.activateGotoPath();

		Assert.fail();
	}

	@MethodRef(name = "clearGotoPath", signature = "()V")
	@Test
	public void clearGotoPathTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.clearGotoPath();

		Assert.fail();
	}

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

	@MethodRef(name = "refresh", signature = "()V")
	@Test
	public void refreshTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.refresh();

		Assert.fail();
	}

	@MethodRef(name = "resetMenuBar", signature = "()V")
	@Test
	public void resetMenuBarTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.resetMenuBar();

		Assert.fail();
	}

	@MethodRef(name = "resetMapZoom", signature = "()V")
	@Test
	public void resetMapZoomTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "resetMapZoom");

		Assert.fail();
	}

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

	@MethodRef(name = "zoomInMap", signature = "()V")
	@Test
	public void zoomInMapTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomInMap();

		Assert.fail();
	}

	@MethodRef(name = "zoomOutMap", signature = "()V")
	@Test
	public void zoomOutMapTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomOutMap();

		Assert.fail();
	}

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

	@MethodRef(name = "updateMenuBar", signature = "()V")
	@Test
	public void updateMenuBarTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMenuBar();

		Assert.fail();
	}

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

	@MethodRef(name = "updateMapControls", signature = "()V")
	@Test
	public void updateMapControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMapControls();

		Assert.fail();
	}

	@MethodRef(name = "zoomInMapControls", signature = "()V")
	@Test
	public void zoomInMapControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomInMapControls();

		Assert.fail();
	}

	@MethodRef(name = "zoomOutMapControls", signature = "()V")
	@Test
	public void zoomOutMapControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.zoomOutMapControls();

		Assert.fail();
	}

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

	@MethodRef(name = "miniMapToggleViewControls", signature = "()V")
	@Test
	public void miniMapToggleViewControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.miniMapToggleViewControls();

		Assert.fail();
	}

	@MethodRef(name = "miniMapToggleFogOfWarControls", signature = "()V")
	@Test
	public void miniMapToggleFogOfWarControlsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.miniMapToggleFogOfWarControls();

		Assert.fail();
	}

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

	@MethodRef(name = "closeMainPanel", signature = "()V")
	@Test
	public void closeMainPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeMainPanel();

		Assert.fail();
	}

	@MethodRef(name = "closeMenus", signature = "()V")
	@Test
	public void closeMenusTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeMenus();

		Assert.fail();
	}

	@MethodRef(name = "closeStatusPanel", signature = "()V")
	@Test
	public void closeStatusPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeStatusPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "paintImmediatelyCanvasInItsBounds", signature = "()V")
	@Test
	public void paintImmediatelyCanvasInItsBoundsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.paintImmediatelyCanvasInItsBounds();

		Assert.fail();
	}

	@MethodRef(name = "refreshPlayersTable", signature = "()V")
	@Test
	public void refreshPlayersTableTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.refreshPlayersTable();

		Assert.fail();
	}

	@MethodRef(name = "removeInGameComponents", signature = "()V")
	@Test
	public void removeInGameComponentsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.removeInGameComponents();

		Assert.fail();
	}

	@MethodRef(name = "requestFocusForSubPanel", signature = "()V")
	@Test
	public void requestFocusForSubPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.requestFocusForSubPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "returnToTitle", signature = "()V")
	@Test
	public void returnToTitleTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.returnToTitle();

		Assert.fail();
	}

	@MethodRef(name = "showAboutPanel", signature = "()V")
	@Test
	public void showAboutPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showAboutPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showChatPanel", signature = "()V")
	@Test
	public void showChatPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showChatPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showClientOptionsDialog", signature = "()V")
	@Test
	public void showClientOptionsDialogTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showClientOptionsDialog();

		Assert.fail();
	}

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

	@MethodRef(name = "showCompactLabourReport", signature = "()V")
	@Test
	public void showCompactLabourReportTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showCompactLabourReport();

		Assert.fail();
	}

	@MethodRef(name = "showDeclarationPanel", signature = "()V")
	@Test
	public void showDeclarationPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showDeclarationPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showEuropePanel", signature = "()V")
	@Test
	public void showEuropePanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showEuropePanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showFindSettlementPanel", signature = "()V")
	@Test
	public void showFindSettlementPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showFindSettlementPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showLogFilePanel", signature = "()V")
	@Test
	public void showLogFilePanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showLogFilePanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showNewPanel", signature = "()V")
	@Test
	public void showNewPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showNewPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showReportCargoPanel", signature = "()V")
	@Test
	public void showReportCargoPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportCargoPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportColonyPanel", signature = "()V")
	@Test
	public void showReportColonyPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportColonyPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportContinentalCongressPanel", signature = "()V")
	@Test
	public void showReportContinentalCongressPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportContinentalCongressPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportEducationPanel", signature = "()V")
	@Test
	public void showReportEducationPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportEducationPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportExplorationPanel", signature = "()V")
	@Test
	public void showReportExplorationPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportExplorationPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportForeignAffairPanel", signature = "()V")
	@Test
	public void showReportForeignAffairPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportForeignAffairPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportHistoryPanel", signature = "()V")
	@Test
	public void showReportHistoryPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportHistoryPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportIndianPanel", signature = "()V")
	@Test
	public void showReportIndianPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportIndianPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportLabourPanel", signature = "()V")
	@Test
	public void showReportLabourPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportLabourPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportMilitaryPanel", signature = "()V")
	@Test
	public void showReportMilitaryPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportMilitaryPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportNavalPanel", signature = "()V")
	@Test
	public void showReportNavalPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportNavalPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportProductionPanel", signature = "()V")
	@Test
	public void showReportProductionPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportProductionPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportReligiousPanel", signature = "()V")
	@Test
	public void showReportReligiousPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportReligiousPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportRequirementsPanel", signature = "()V")
	@Test
	public void showReportRequirementsPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportRequirementsPanel();

		Assert.fail();
	}

	@MethodRef(name = "showReportTradePanel", signature = "()V")
	@Test
	public void showReportTradePanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showReportTradePanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showStatisticsPanel", signature = "()V")
	@Test
	public void showStatisticsPanelTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showStatisticsPanel();

		Assert.fail();
	}

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

	@MethodRef(name = "showTilePopUpAtSelectedTile", signature = "()V")
	@Test
	public void showTilePopUpAtSelectedTileTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.showTilePopUpAtSelectedTile();

		Assert.fail();
	}

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

	@MethodRef(name = "updateGameOptions", signature = "()V")
	@Test
	public void updateGameOptionsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateGameOptions();

		Assert.fail();
	}

	@MethodRef(name = "updateMapGeneratorOptions", signature = "()V")
	@Test
	public void updateMapGeneratorOptionsTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMapGeneratorOptions();

		Assert.fail();
	}

	@MethodRef(name = "centerActiveUnit", signature = "()V")
	@Test
	public void centerActiveUnitTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.centerActiveUnit();

		Assert.fail();
	}

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

	@MethodRef(name = "toggleViewMode", signature = "()V")
	@Test
	public void toggleViewModeTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.toggleViewMode();

		Assert.fail();
	}

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

	@MethodRef(name = "alertSound", signature = "()V")
	@Test
	public void alertSoundTest() throws Exception {
		GUI testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "alertSound");

		Assert.fail();
	}

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