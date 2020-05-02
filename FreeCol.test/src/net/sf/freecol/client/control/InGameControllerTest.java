/*
 * 
 */
package net.sf.freecol.client.control;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class InGameControllerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class InGameControllerTest {

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
	 * @return the in game controller
	 */
	private InGameController createTestSubject() {
		return new InGameController(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Ask server test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askServer", signature = "()QServerAPI;")
	@Test
	public void askServerTest() throws Exception {
		InGameController testSubject;
		ServerAPI result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "askServer");

		Assert.fail();
	}

	/**
	 * Sound test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "sound", signature = "(QString;)V")
	@Test
	public void soundTest() throws Exception {
		InGameController testSubject;
		String soundKey = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "sound", new Object[] { soundKey });

		Assert.fail();
	}

	/**
	 * Gets the specification test.
	 *
	 * @return the specification test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSpecification", signature = "()QSpecification;")
	@Test
	public void getSpecificationTest() throws Exception {
		InGameController testSubject;
		Specification result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getSpecification");

		Assert.fail();
	}

	/**
	 * Require our turn test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "requireOurTurn", signature = "()Z")
	@Test
	public void requireOurTurnTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "requireOurTurn");

		Assert.fail();
	}

	/**
	 * Colony panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "colonyPanel", signature = "(QColony;QUnit;)V")
	@Test
	public void colonyPanelTest() throws Exception {
		InGameController testSubject;
		Colony colony = null;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "colonyPanel", new Object[] { Colony.class, Unit.class });

		Assert.fail();
	}

	/**
	 * Gets the settlement at test.
	 *
	 * @return the settlement at test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSettlementAt", signature = "(QTile;QDirection;)QSettlement;")
	@Test
	public void getSettlementAtTest() throws Exception {
		InGameController testSubject;
		Tile tile = null;
		Direction direction = null;
		Settlement result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getSettlementAt", new Object[] { Tile.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Gets the nation at test.
	 *
	 * @return the nation at test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getNationAt", signature = "(QTile;QDirection;)QStringTemplate;")
	@Test
	public void getNationAtTest() throws Exception {
		InGameController testSubject;
		Tile tile = null;
		Direction direction = null;
		StringTemplate result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getNationAt", new Object[] { Tile.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Update GUI test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateGUI", signature = "(QTile;)V")
	@Test
	public void updateGUITest() throws Exception {
		InGameController testSubject;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateGUI", new Object[] { Tile.class });

		Assert.fail();
	}

	/**
	 * Ask assign trade route test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askAssignTradeRoute", signature = "(QUnit;QTradeRoute;)Z")
	@Test
	public void askAssignTradeRouteTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		TradeRoute tradeRoute = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		tradeRoute = null;
		result = Whitebox.invokeMethod(testSubject, "askAssignTradeRoute",
				new Object[] { Unit.class, TradeRoute.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Ask claim tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askClaimTile", signature = "(QPlayer;QTile;QFreeColGameObject;I)Z")
	@Test
	public void askClaimTileTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		Tile tile = null;
		FreeColGameObject claimant = null;
		int price = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		price = 0;
		result = Whitebox.invokeMethod(testSubject, "askClaimTile",
				new Object[] { Player.class, Tile.class, FreeColGameObject.class, price });
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		price = -1;
		result = Whitebox.invokeMethod(testSubject, "askClaimTile",
				new Object[] { Player.class, Tile.class, FreeColGameObject.class, price });
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		price = 1;
		result = Whitebox.invokeMethod(testSubject, "askClaimTile",
				new Object[] { Player.class, Tile.class, FreeColGameObject.class, price });
		Assert.assertEquals(false, result);

		// test 4
		testSubject = createTestSubject();
		price = 0;
		result = Whitebox.invokeMethod(testSubject, "askClaimTile",
				new Object[] { Player.class, Tile.class, FreeColGameObject.class, price });
		Assert.assertEquals(false, result);

		// test 5
		testSubject = createTestSubject();
		price = -1;
		result = Whitebox.invokeMethod(testSubject, "askClaimTile",
				new Object[] { Player.class, Tile.class, FreeColGameObject.class, price });
		Assert.assertEquals(false, result);

		// test 6
		testSubject = createTestSubject();
		price = 1;
		result = Whitebox.invokeMethod(testSubject, "askClaimTile",
				new Object[] { Player.class, Tile.class, FreeColGameObject.class, price });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Ask clear goto orders test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askClearGotoOrders", signature = "(QUnit;)Z")
	@Test
	public void askClearGotoOrdersTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "askClearGotoOrders", new Object[] { Unit.class });

		Assert.fail();
	}

	/**
	 * Ask embark test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askEmbark", signature = "(QUnit;QUnit;)Z")
	@Test
	public void askEmbarkTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Unit carrier = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "askEmbark", new Object[] { Unit.class, Unit.class });

		Assert.fail();
	}

	/**
	 * Ask emigrate test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askEmigrate", signature = "(QEurope;I)QUnit;")
	@Test
	public void askEmigrateTest() throws Exception {
		InGameController testSubject;
		Europe europe = null;
		int slot = 0;
		Unit result;

		// test 1
		testSubject = createTestSubject();
		europe = null;
		result = Whitebox.invokeMethod(testSubject, "askEmigrate", new Object[] { Europe.class, slot });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Emigration test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "emigration", signature = "(QPlayer;IZ)V")
	@Test
	public void emigrationTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		int n = 0;
		boolean fountainOfYouth = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "emigration", new Object[] { Player.class, n, fountainOfYouth });

		Assert.fail();
	}

	/**
	 * Ask load goods test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askLoadGoods", signature = "(QLocation;QGoodsType;IQUnit;)Z")
	@Test
	public void askLoadGoodsTest() throws Exception {
		InGameController testSubject;
		Location loc = null;
		GoodsType type = null;
		int amount = 0;
		Unit carrier = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "askLoadGoods",
				new Object[] { Location.class, GoodsType.class, amount, Unit.class });

		Assert.fail();
	}

	/**
	 * Ask set destination test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askSetDestination", signature = "(QUnit;QLocation;)Z")
	@Test
	public void askSetDestinationTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Location destination = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "askSetDestination", new Object[] { Unit.class, Location.class });

		Assert.fail();
	}

	/**
	 * Ask unload goods test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "askUnloadGoods", signature = "(QGoodsType;IQUnit;)Z")
	@Test
	public void askUnloadGoodsTest() throws Exception {
		InGameController testSubject;
		GoodsType type = null;
		int amount = 0;
		Unit carrier = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "askUnloadGoods",
				new Object[] { GoodsType.class, amount, Unit.class });

		Assert.fail();
	}

	/**
	 * Gets the save game string test.
	 *
	 * @return the save game string test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSaveGameString", signature = "(QGame;)QString;")
	@Test
	public void getSaveGameStringTest() throws Exception {
		InGameController testSubject;
		Game game = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getSaveGameString", new Object[] { Game.class });

		Assert.fail();
	}

	/**
	 * Auto save game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "autoSaveGame", signature = "()V")
	@Test
	public void autoSaveGameTest() throws Exception {
		InGameController testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "autoSaveGame");

		Assert.fail();
	}

	/**
	 * Save game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "saveGame", signature = "(QFile;)Z")
	@Test
	public void saveGameTest() throws Exception {
		InGameController testSubject;
		File file = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "saveGame", new Object[] { File.class });

		Assert.fail();
	}

	/**
	 * Should allow message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "shouldAllowMessage", signature = "(QModelMessage;)Z")
	@Test
	public void shouldAllowMessageTest() throws Exception {
		InGameController testSubject;
		ModelMessage message = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "shouldAllowMessage", new Object[] { ModelMessage.class });

		Assert.fail();
	}

	/**
	 * Start ignoring message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startIgnoringMessage", signature = "(QString;QTurn;)V")
	@Test
	public void startIgnoringMessageTest() throws Exception {
		InGameController testSubject;
		String key = "";
		Turn turn = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "startIgnoringMessage", new Object[] { key, Turn.class });

		Assert.fail();
	}

	/**
	 * Stop ignoring message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "stopIgnoringMessage", signature = "(QString;)V")
	@Test
	public void stopIgnoringMessageTest() throws Exception {
		InGameController testSubject;
		String key = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "stopIgnoringMessage", new Object[] { key });

		Assert.fail();
	}

	/**
	 * Reap ignored messages test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "reapIgnoredMessages", signature = "(QTurn;)V")
	@Test
	public void reapIgnoredMessagesTest() throws Exception {
		InGameController testSubject;
		Turn turn = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "reapIgnoredMessages", new Object[] { Turn.class });

		Assert.fail();
	}

	/**
	 * Continue ignore message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "continueIgnoreMessage", signature = "(QString;QTurn;)Z")
	@Test
	public void continueIgnoreMessageTest() throws Exception {
		InGameController testSubject;
		String key = "";
		Turn turn = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		key = null;
		result = Whitebox.invokeMethod(testSubject, "continueIgnoreMessage", new Object[] { key, Turn.class });
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		key = "";
		result = Whitebox.invokeMethod(testSubject, "continueIgnoreMessage", new Object[] { key, Turn.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Display turn report messages test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayTurnReportMessages", signature = "()V")
	@Test
	public void displayTurnReportMessagesTest() throws Exception {
		InGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.displayTurnReportMessages();

		Assert.fail();
	}

	/**
	 * Display model messages test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayModelMessages", signature = "(ZZ)Z")
	@Test
	public void displayModelMessagesTest() throws Exception {
		InGameController testSubject;
		boolean allMessages = false;
		boolean endOfTurn = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.displayModelMessages(allMessages, endOfTurn);

		Assert.fail();
	}

	/**
	 * Do execute goto orders test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "doExecuteGotoOrders", signature = "()Z")
	@Test
	public void doExecuteGotoOrdersTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "doExecuteGotoOrders");

		Assert.fail();
	}

	/**
	 * Do end turn test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "doEndTurn", signature = "(Z)Z")
	@Test
	public void doEndTurnTest() throws Exception {
		InGameController testSubject;
		boolean showDialog = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "doEndTurn", new Object[] { showDialog });

		Assert.fail();
	}

	/**
	 * Update active unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateActiveUnit", signature = "(QTile;)Z")
	@Test
	public void updateActiveUnitTest() throws Exception {
		InGameController testSubject;
		Tile tile = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		result = Whitebox.invokeMethod(testSubject, "updateActiveUnit", new Object[] { Tile.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Move to destination test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name="moveToDestination", signature="(QUnit;QList<QModelMessage;>;)Z")
	@Test
	public void moveToDestinationTest() throws Exception {
	InGameController testSubject;Unit unit = null;
	List<ModelMessage> messages = null;
	boolean result;
	
	// default test
	testSubject=createTestSubject();result=Whitebox.invokeMethod(testSubject,"moveToDestination", new Object[]{Unit.class, List<ModelMessage>.class});
	
	Assert.fail();
	}

	/**
	 * Move direction test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveDirection", signature = "(QUnit;QDirection;Z)Z")
	@Test
	public void moveDirectionTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean interactive = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.moveDirection(unit, direction, interactive);

		Assert.fail();
	}

	/**
	 * Move path test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "movePath", signature = "(QUnit;QPathNode;)Z")
	@Test
	public void movePathTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		PathNode path = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "movePath", new Object[] { Unit.class, PathNode.class });

		Assert.fail();
	}

	/**
	 * Move attack test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveAttack", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveAttackTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveAttack", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move attack settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveAttackSettlement", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveAttackSettlementTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveAttackSettlement",
				new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move diplomacy test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveDiplomacy", signature = "(QUnit;QDirection;QDiplomaticTrade;)Z")
	@Test
	public void moveDiplomacyTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		DiplomaticTrade dt = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveDiplomacy",
				new Object[] { Unit.class, Direction.class, DiplomaticTrade.class });

		Assert.fail();
	}

	/**
	 * Move disembark test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveDisembark", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveDisembarkTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveDisembark", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move embark test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveEmbark", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveEmbarkTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveEmbark", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move explore test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveExplore", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveExploreTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveExplore", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move high seas test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveHighSeas", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveHighSeasTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveHighSeas", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move learn skill test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveLearnSkill", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveLearnSkillTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveLearnSkill", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move move test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveMove", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveMoveTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveMove", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move scout colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveScoutColony", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveScoutColonyTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveScoutColony", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move scout indian settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveScoutIndianSettlement", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveScoutIndianSettlementTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveScoutIndianSettlement",
				new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move spy test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveSpy", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveSpyTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveSpy", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move trade test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveTrade", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveTradeTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveTrade", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Move trade indian settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveTradeIndianSettlement", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveTradeIndianSettlementTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveTradeIndianSettlement",
				new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Trade fail message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "tradeFailMessage", signature = "(IQSettlement;QGoods;)QStringTemplate;")
	@Test
	public void tradeFailMessageTest() throws Exception {
		InGameController testSubject;
		int fail = 0;
		Settlement settlement = null;
		Goods goods = null;
		StringTemplate result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "tradeFailMessage",
				new Object[] { fail, Settlement.class, Goods.class });

		Assert.fail();
	}

	/**
	 * Attempt buy from settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "attemptBuyFromSettlement", signature = "(QUnit;QSettlement;)QStringTemplate;")
	@Test
	public void attemptBuyFromSettlementTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Settlement settlement = null;
		StringTemplate result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "attemptBuyFromSettlement",
				new Object[] { Unit.class, Settlement.class });

		Assert.fail();
	}

	/**
	 * Attempt sell to settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "attemptSellToSettlement", signature = "(QUnit;QSettlement;)QStringTemplate;")
	@Test
	public void attemptSellToSettlementTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Settlement settlement = null;
		StringTemplate result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "attemptSellToSettlement",
				new Object[] { Unit.class, Settlement.class });

		Assert.fail();
	}

	/**
	 * Attempt gift to settlement test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "attemptGiftToSettlement", signature = "(QUnit;QSettlement;)QStringTemplate;")
	@Test
	public void attemptGiftToSettlementTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Settlement settlement = null;
		StringTemplate result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "attemptGiftToSettlement",
				new Object[] { Unit.class, Settlement.class });

		Assert.fail();
	}

	/**
	 * Move tribute test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveTribute", signature = "(QUnit;IQDirection;)Z")
	@Test
	public void moveTributeTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		int amount = 0;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveTribute",
				new Object[] { Unit.class, amount, Direction.class });

		Assert.fail();
	}

	/**
	 * Move use missionary test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveUseMissionary", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveUseMissionaryTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "moveUseMissionary", new Object[] { Unit.class, Direction.class });

		Assert.fail();
	}

	/**
	 * Follow trade route test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name="followTradeRoute", signature="(QUnit;QList<QModelMessage;>;)Z")
	@Test
	public void followTradeRouteTest() throws Exception {
	InGameController testSubject;Unit unit = null;
	List<ModelMessage> messages = null;
	boolean result;
	
	// default test
	testSubject=createTestSubject();result=Whitebox.invokeMethod(testSubject,"followTradeRoute", new Object[]{Unit.class, List<ModelMessage>.class});
	
	Assert.fail();
	}

	/**
	 * Load unit at stop test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "loadUnitAtStop", signature = "(QUnit;QLogBuilder;)Z")
	@Test
	public void loadUnitAtStopTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		LogBuilder lb = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "loadUnitAtStop", new Object[] { Unit.class, LogBuilder.class });

		Assert.fail();
	}

	/**
	 * Gets the load goods message test.
	 *
	 * @return the load goods message test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getLoadGoodsMessage", signature = "(QGoodsType;IIII)QString;")
	@Test
	public void getLoadGoodsMessageTest() throws Exception {
		InGameController testSubject;
		GoodsType type = null;
		int amount = 0;
		int present = 0;
		int export = 0;
		int toLoad = 0;
		String result;

		// test 1
		testSubject = createTestSubject();
		amount = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 2
		testSubject = createTestSubject();
		amount = 1;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 3
		testSubject = createTestSubject();
		toLoad = 0;
		export = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 4
		testSubject = createTestSubject();
		toLoad = 0;
		export = -1;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 5
		testSubject = createTestSubject();
		toLoad = 0;
		export = 1;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 6
		testSubject = createTestSubject();
		present = 0;
		export = 0;
		toLoad = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 7
		testSubject = createTestSubject();
		present = 0;
		export = -1;
		toLoad = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 8
		testSubject = createTestSubject();
		present = 0;
		export = 1;
		toLoad = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 9
		testSubject = createTestSubject();
		toLoad = 0;
		export = 0;
		present = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 10
		testSubject = createTestSubject();
		toLoad = 0;
		export = -1;
		present = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		// test 11
		testSubject = createTestSubject();
		toLoad = 0;
		export = 1;
		present = 0;
		result = Whitebox.invokeMethod(testSubject, "getLoadGoodsMessage",
				new Object[] { GoodsType.class, amount, present, export, toLoad });
		Assert.assertEquals("", result);

		Assert.fail();
	}

	/**
	 * Unload unit at stop test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "unloadUnitAtStop", signature = "(QUnit;QLogBuilder;)Z")
	@Test
	public void unloadUnitAtStopTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		LogBuilder lb = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "unloadUnitAtStop", new Object[] { Unit.class, LogBuilder.class });

		Assert.fail();
	}

	/**
	 * Gets the unload goods message test.
	 *
	 * @return the unload goods message test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnloadGoodsMessage", signature = "(QUnit;QGoodsType;IIII)QString;")
	@Test
	public void getUnloadGoodsMessageTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		GoodsType type = null;
		int amount = 0;
		int present = 0;
		int atStop = 0;
		int toUnload = 0;
		String result;

		// test 1
		testSubject = createTestSubject();
		amount = 0;
		atStop = 0;
		result = Whitebox.invokeMethod(testSubject, "getUnloadGoodsMessage",
				new Object[] { Unit.class, GoodsType.class, amount, present, atStop, toUnload });
		Assert.assertEquals("", result);

		// test 2
		testSubject = createTestSubject();
		amount = 0;
		atStop = -1;
		result = Whitebox.invokeMethod(testSubject, "getUnloadGoodsMessage",
				new Object[] { Unit.class, GoodsType.class, amount, present, atStop, toUnload });
		Assert.assertEquals("", result);

		// test 3
		testSubject = createTestSubject();
		amount = 0;
		atStop = 1;
		result = Whitebox.invokeMethod(testSubject, "getUnloadGoodsMessage",
				new Object[] { Unit.class, GoodsType.class, amount, present, atStop, toUnload });
		Assert.assertEquals("", result);

		Assert.fail();
	}

	/**
	 * Abandon colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "abandonColony", signature = "(QColony;)Z")
	@Test
	public void abandonColonyTest() throws Exception {
		InGameController testSubject;
		Colony colony = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		colony = null;
		result = testSubject.abandonColony(colony);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Animate attack test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "animateAttack", signature = "(QUnit;QUnit;QTile;QTile;Z)V")
	@Test
	public void animateAttackTest() throws Exception {
		InGameController testSubject;
		Unit attacker = null;
		Unit defender = null;
		Tile attackerTile = null;
		Tile defenderTile = null;
		boolean success = false;

		// default test
		testSubject = createTestSubject();
		testSubject.animateAttack(attacker, defender, attackerTile, defenderTile, success);

		Assert.fail();
	}

	/**
	 * Animate move test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "animateMove", signature = "(QUnit;QTile;QTile;)V")
	@Test
	public void animateMoveTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Tile oldTile = null;
		Tile newTile = null;

		// default test
		testSubject = createTestSubject();
		testSubject.animateMove(unit, oldTile, newTile);

		Assert.fail();
	}

	/**
	 * Assign teacher test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "assignTeacher", signature = "(QUnit;QUnit;)Z")
	@Test
	public void assignTeacherTest() throws Exception {
		InGameController testSubject;
		Unit student = null;
		Unit teacher = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		student = null;
		teacher = null;
		result = testSubject.assignTeacher(student, teacher);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		teacher = null;
		student = null;
		result = testSubject.assignTeacher(student, teacher);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Assign trade route test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "assignTradeRoute", signature = "(QUnit;QTradeRoute;)Z")
	@Test
	public void assignTradeRouteTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		TradeRoute tradeRoute = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.assignTradeRoute(unit, tradeRoute);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Board ship test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "boardShip", signature = "(QUnit;QUnit;)Z")
	@Test
	public void boardShipTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Unit carrier = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		carrier = null;
		result = testSubject.boardShip(unit, carrier);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		carrier = null;
		unit = null;
		result = testSubject.boardShip(unit, carrier);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Builds the colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "buildColony", signature = "(QUnit;)Z")
	@Test
	public void buildColonyTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.buildColony(unit);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.buildColony(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Buy goods test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "buyGoods", signature = "(QGoodsType;IQUnit;)Z")
	@Test
	public void buyGoodsTest() throws Exception {
		InGameController testSubject;
		GoodsType type = null;
		int amount = 0;
		Unit carrier = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		type = null;
		amount = 0;
		carrier = null;
		result = testSubject.buyGoods(type, amount, carrier);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		amount = 0;
		type = null;
		carrier = null;
		result = testSubject.buyGoods(type, amount, carrier);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		amount = -1;
		type = null;
		carrier = null;
		result = testSubject.buyGoods(type, amount, carrier);
		Assert.assertEquals(false, result);

		// test 4
		testSubject = createTestSubject();
		amount = 1;
		type = null;
		carrier = null;
		result = testSubject.buyGoods(type, amount, carrier);
		Assert.assertEquals(false, result);

		// test 5
		testSubject = createTestSubject();
		carrier = null;
		type = null;
		amount = 0;
		result = testSubject.buyGoods(type, amount, carrier);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Chat test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chat", signature = "(QPlayer;QString;Z)V")
	@Test
	public void chatTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		String message = "";
		boolean pri = false;

		// default test
		testSubject = createTestSubject();
		testSubject.chat(player, message, pri);

		Assert.fail();
	}

	/**
	 * Change state test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "changeState", signature = "(QUnit;QUnitState;)Z")
	@Test
	public void changeStateTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		UnitState state = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.changeState(unit, state);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Change work improvement type test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "changeWorkImprovementType", signature = "(QUnit;QTileImprovementType;)Z")
	@Test
	public void changeWorkImprovementTypeTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		TileImprovementType improvementType = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		improvementType = null;
		result = testSubject.changeWorkImprovementType(unit, improvementType);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		improvementType = null;
		unit = null;
		result = testSubject.changeWorkImprovementType(unit, improvementType);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Change work type test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "changeWorkType", signature = "(QUnit;QGoodsType;)Z")
	@Test
	public void changeWorkTypeTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		GoodsType workType = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.changeWorkType(unit, workType);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Check cash in treasure train test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "checkCashInTreasureTrain", signature = "(QUnit;)Z")
	@Test
	public void checkCashInTreasureTrainTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.checkCashInTreasureTrain(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Choose founding father test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chooseFoundingFather", signature = "(QList<QFoundingFather;>;QFoundingFather;)Z")
	@Test
	public void chooseFoundingFatherTest() throws Exception {
		InGameController testSubject;
		List<FoundingFather> ffs = null;
		FoundingFather ff = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		ffs = null;
		result = testSubject.chooseFoundingFather(ffs, ff);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Choose founding father test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chooseFoundingFather", signature = "(QList<QFoundingFather;>;)V")
	@Test
	public void chooseFoundingFatherTest_1() throws Exception {
		InGameController testSubject;
		List<FoundingFather> ffs = null;

		// test 1
		testSubject = createTestSubject();
		ffs = null;
		testSubject.chooseFoundingFather(ffs);

		Assert.fail();
	}

	/**
	 * Claim tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "claimTile", signature = "(QTile;QFreeColGameObject;)Z")
	@Test
	public void claimTileTest() throws Exception {
		InGameController testSubject;
		Tile tile = null;
		FreeColGameObject claimant = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		claimant = null;
		result = testSubject.claimTile(tile, claimant);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		claimant = null;
		tile = null;
		result = testSubject.claimTile(tile, claimant);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Clear goto orders test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "clearGotoOrders", signature = "(QUnit;)Z")
	@Test
	public void clearGotoOrdersTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.clearGotoOrders(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Clear orders test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "clearOrders", signature = "(QUnit;)Z")
	@Test
	public void clearOrdersTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.clearOrders(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Clear speciality test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "clearSpeciality", signature = "(QUnit;)Z")
	@Test
	public void clearSpecialityTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.clearSpeciality(unit);
		Assert.assertEquals(false, result);

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
		InGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.closeMenus();

		Assert.fail();
	}

	/**
	 * Declare independence test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "declareIndependence", signature = "()Z")
	@Test
	public void declareIndependenceTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.declareIndependence();

		Assert.fail();
	}

	/**
	 * Diplomacy test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "diplomacy", signature = "(QFreeColGameObject;QFreeColGameObject;QDiplomaticTrade;)QDiplomaticTrade;")
	@Test
	public void diplomacyTest() throws Exception {
		InGameController testSubject;
		FreeColGameObject our = null;
		FreeColGameObject other = null;
		DiplomaticTrade agreement = null;
		DiplomaticTrade result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.diplomacy(our, other, agreement);

		Assert.fail();
	}

	/**
	 * Disband unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "disbandUnit", signature = "(QUnit;)Z")
	@Test
	public void disbandUnitTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.disbandUnit(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Display high scores test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayHighScores", signature = "(QBoolean;)Z")
	@Test
	public void displayHighScoresTest() throws Exception {
		InGameController testSubject;
		Boolean high = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.displayHighScores(high);

		Assert.fail();
	}

	/**
	 * Display model messages test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "displayModelMessages", signature = "(Z)Z")
	@Test
	public void displayModelMessagesTest_1() throws Exception {
		InGameController testSubject;
		boolean allMessages = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.displayModelMessages(allMessages);

		Assert.fail();
	}

	/**
	 * Emigrate test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "emigrate", signature = "(QPlayer;IIZ)V")
	@Test
	public void emigrateTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		int slot = 0;
		int n = 0;
		boolean foY = false;

		// test 1
		testSubject = createTestSubject();
		player = null;
		testSubject.emigrate(player, slot, n, foY);

		Assert.fail();
	}

	/**
	 * End turn test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "endTurn", signature = "(Z)Z")
	@Test
	public void endTurnTest() throws Exception {
		InGameController testSubject;
		boolean showDialog = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.endTurn(showDialog);

		Assert.fail();
	}

	/**
	 * Equip unit for role test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "equipUnitForRole", signature = "(QUnit;QRole;I)Z")
	@Test
	public void equipUnitForRoleTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Role role = null;
		int roleCount = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		role = null;
		roleCount = 0;
		result = testSubject.equipUnitForRole(unit, role, roleCount);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		role = null;
		unit = null;
		roleCount = 0;
		result = testSubject.equipUnitForRole(unit, role, roleCount);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		roleCount = 0;
		unit = null;
		role = null;
		result = testSubject.equipUnitForRole(unit, role, roleCount);
		Assert.assertEquals(false, result);

		// test 4
		testSubject = createTestSubject();
		roleCount = -1;
		unit = null;
		role = null;
		result = testSubject.equipUnitForRole(unit, role, roleCount);
		Assert.assertEquals(false, result);

		// test 5
		testSubject = createTestSubject();
		roleCount = 1;
		unit = null;
		role = null;
		result = testSubject.equipUnitForRole(unit, role, roleCount);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Error test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "error", signature = "(QString;QString;)V")
	@Test
	public void errorTest() throws Exception {
		InGameController testSubject;
		String messageId = "";
		String message = "";

		// default test
		testSubject = createTestSubject();
		testSubject.error(messageId, message);

		Assert.fail();
	}

	/**
	 * Execute goto orders test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "executeGotoOrders", signature = "()Z")
	@Test
	public void executeGotoOrdersTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.executeGotoOrders();

		Assert.fail();
	}

	/**
	 * First contact test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "firstContact", signature = "(QPlayer;QPlayer;QTile;Z)Z")
	@Test
	public void firstContactTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		Player other = null;
		Tile tile = null;
		boolean result = false;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		player = null;
		tile = null;
		result = testSubject.firstContact(player, other, tile, result);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		player = null;
		tile = null;
		result = testSubject.firstContact(player, other, tile, result);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		tile = null;
		player = null;
		result = testSubject.firstContact(player, other, tile, result);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * First contact test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "firstContact", signature = "(QPlayer;QPlayer;QTile;I)V")
	@Test
	public void firstContactTest_1() throws Exception {
		InGameController testSubject;
		Player player = null;
		Player other = null;
		Tile tile = null;
		int n = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.firstContact(player, other, tile, n);

		Assert.fail();
	}

	/**
	 * Fountain of youth test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "fountainOfYouth", signature = "(I)V")
	@Test
	public void fountainOfYouthTest() throws Exception {
		InGameController testSubject;
		int n = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.fountainOfYouth(n);

		Assert.fail();
	}

	/**
	 * Gets the nation summary test.
	 *
	 * @return the nation summary test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getNationSummary", signature = "(QPlayer;)QNationSummary;")
	@Test
	public void getNationSummaryTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		NationSummary result;

		// test 1
		testSubject = createTestSubject();
		player = null;
		result = testSubject.getNationSummary(player);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Gets the new trade route test.
	 *
	 * @return the new trade route test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getNewTradeRoute", signature = "(QPlayer;)QTradeRoute;")
	@Test
	public void getNewTradeRouteTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		TradeRoute result;

		// test 1
		testSubject = createTestSubject();
		player = null;
		result = testSubject.getNewTradeRoute(player);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Gets the REF units test.
	 *
	 * @return the REF units test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getREFUnits", signature = "()QList<QAbstractUnit;>;")
	@Test
	public void getREFUnitsTest() throws Exception {
		InGameController testSubject;
		List<AbstractUnit> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getREFUnits();

		Assert.fail();
	}

	/**
	 * Gets the server statistics test.
	 *
	 * @return the server statistics test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getServerStatistics", signature = "()Qjava.util.Map<QString;QString;>;")
	@Test
	public void getServerStatisticsTest() throws Exception {
		InGameController testSubject;
		Map<String, String> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getServerStatistics();

		Assert.fail();
	}

	/**
	 * Go to tile test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "goToTile", signature = "(QUnit;QTile;)Z")
	@Test
	public void goToTileTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Tile tile = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.goToTile(unit, tile);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Ignore message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "ignoreMessage", signature = "(QModelMessage;Z)Z")
	@Test
	public void ignoreMessageTest() throws Exception {
		InGameController testSubject;
		ModelMessage message = null;
		boolean flag = false;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		message = null;
		result = testSubject.ignoreMessage(message, flag);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Indian demand test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "indianDemand", signature = "(QUnit;QColony;QGoodsType;I)Z")
	@Test
	public void indianDemandTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Colony colony = null;
		GoodsType type = null;
		int amount = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		colony = null;
		result = testSubject.indianDemand(unit, colony, type, amount);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		colony = null;
		unit = null;
		result = testSubject.indianDemand(unit, colony, type, amount);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		type = null;
		result = testSubject.indianDemand(unit, colony, type, amount);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Leave ship test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "leaveShip", signature = "(QUnit;)Z")
	@Test
	public void leaveShipTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.leaveShip(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Load cargo test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "loadCargo", signature = "(QGoods;QUnit;)Z")
	@Test
	public void loadCargoTest() throws Exception {
		InGameController testSubject;
		Goods goods = null;
		Unit carrier = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		goods = null;
		carrier = null;
		result = testSubject.loadCargo(goods, carrier);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		carrier = null;
		goods = null;
		result = testSubject.loadCargo(goods, carrier);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Load game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "loadGame", signature = "()V")
	@Test
	public void loadGameTest() throws Exception {
		InGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.loadGame();

		Assert.fail();
	}

	/**
	 * Loot cargo test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "lootCargo", signature = "(QUnit;QList<QGoods;>;QString;)Z")
	@Test
	public void lootCargoTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		List<Goods> goods = null;
		String defenderId = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		goods = null;
		defenderId = null;
		result = testSubject.lootCargo(unit, goods, defenderId);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		goods = null;
		unit = null;
		defenderId = null;
		result = testSubject.lootCargo(unit, goods, defenderId);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		defenderId = null;
		unit = null;
		goods = null;
		result = testSubject.lootCargo(unit, goods, defenderId);
		Assert.assertEquals(false, result);

		// test 4
		testSubject = createTestSubject();
		defenderId = "";
		unit = null;
		goods = null;
		result = testSubject.lootCargo(unit, goods, defenderId);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Loot test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "loot", signature = "(QUnit;QList<QGoods;>;QString;)V")
	@Test
	public void lootTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		List<Goods> goods = null;
		String defenderId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.loot(unit, goods, defenderId);

		Assert.fail();
	}

	/**
	 * Monarch action test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "monarchAction", signature = "(QMonarchAction;Z)Z")
	@Test
	public void monarchActionTest() throws Exception {
		InGameController testSubject;
		MonarchAction action = null;
		boolean accept = false;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		action = null;
		result = testSubject.monarchAction(action, accept);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Monarch test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "monarch", signature = "(QMonarchAction;QStringTemplate;QString;)V")
	@Test
	public void monarchTest() throws Exception {
		InGameController testSubject;
		MonarchAction action = null;
		StringTemplate template = "";
		String monarchKey = "";

		// default test
		testSubject = createTestSubject();
		testSubject.monarch(action, template, monarchKey);

		Assert.fail();
	}

	/**
	 * Move to test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveTo", signature = "(QUnit;QLocation;)Z")
	@Test
	public void moveToTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Location destination = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		destination = null;
		result = testSubject.moveTo(unit, destination);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		destination = null;
		unit = null;
		result = testSubject.moveTo(unit, destination);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Move unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveUnit", signature = "(QUnit;QDirection;)Z")
	@Test
	public void moveUnitTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		Direction direction = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		direction = null;
		result = testSubject.moveUnit(unit, direction);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		direction = null;
		unit = null;
		result = testSubject.moveUnit(unit, direction);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Move tile cursor test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "moveTileCursor", signature = "(QDirection;)Z")
	@Test
	public void moveTileCursorTest() throws Exception {
		InGameController testSubject;
		Direction direction = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		direction = null;
		result = testSubject.moveTileCursor(direction);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Name new land test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "nameNewLand", signature = "(QUnit;QString;)Z")
	@Test
	public void nameNewLandTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		String name = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		name = null;
		result = testSubject.nameNewLand(unit, name);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		name = null;
		unit = null;
		result = testSubject.nameNewLand(unit, name);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		name = "";
		unit = null;
		result = testSubject.nameNewLand(unit, name);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Name new region test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "nameNewRegion", signature = "(QTile;QUnit;QRegion;QString;)Z")
	@Test
	public void nameNewRegionTest() throws Exception {
		InGameController testSubject;
		Tile tile = null;
		Unit unit = null;
		Region region = null;
		String name = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		unit = null;
		region = null;
		result = testSubject.nameNewRegion(tile, unit, region, name);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		unit = null;
		tile = null;
		region = null;
		result = testSubject.nameNewRegion(tile, unit, region, name);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		region = null;
		tile = null;
		unit = null;
		result = testSubject.nameNewRegion(tile, unit, region, name);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * New land name test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newLandName", signature = "(QString;QUnit;)V")
	@Test
	public void newLandNameTest() throws Exception {
		InGameController testSubject;
		String defaultName = "";
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		testSubject.newLandName(defaultName, unit);

		Assert.fail();
	}

	/**
	 * New region name test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newRegionName", signature = "(QRegion;QString;QTile;QUnit;)V")
	@Test
	public void newRegionNameTest() throws Exception {
		InGameController testSubject;
		Region region = null;
		String defaultName = "";
		Tile tile = null;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		testSubject.newRegionName(region, defaultName, tile, unit);

		Assert.fail();
	}

	/**
	 * New turn test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newTurn", signature = "(I)Z")
	@Test
	public void newTurnTest() throws Exception {
		InGameController testSubject;
		int turn = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		turn = 0;
		result = testSubject.newTurn(turn);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		turn = -1;
		result = testSubject.newTurn(turn);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		turn = 1;
		result = testSubject.newTurn(turn);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Next active unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "nextActiveUnit", signature = "()Z")
	@Test
	public void nextActiveUnitTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.nextActiveUnit();

		Assert.fail();
	}

	/**
	 * Next model message test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "nextModelMessage", signature = "()Z")
	@Test
	public void nextModelMessageTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.nextModelMessage();

		Assert.fail();
	}

	/**
	 * Pay arrears test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "payArrears", signature = "(QGoodsType;)Z")
	@Test
	public void payArrearsTest() throws Exception {
		InGameController testSubject;
		GoodsType type = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		type = null;
		result = testSubject.payArrears(type);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Pay for building test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "payForBuilding", signature = "(QColony;)Z")
	@Test
	public void payForBuildingTest() throws Exception {
		InGameController testSubject;
		Colony colony = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		colony = null;
		result = testSubject.payForBuilding(colony);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Put outside colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "putOutsideColony", signature = "(QUnit;)Z")
	@Test
	public void putOutsideColonyTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.putOutsideColony(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Reconnect test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "reconnect", signature = "()V")
	@Test
	public void reconnectTest() throws Exception {
		InGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.reconnect();

		Assert.fail();
	}

	/**
	 * Recruit unit in europe test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "recruitUnitInEurope", signature = "(I)Z")
	@Test
	public void recruitUnitInEuropeTest() throws Exception {
		InGameController testSubject;
		int index = 0;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.recruitUnitInEurope(index);

		Assert.fail();
	}

	/**
	 * Removes the test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "remove", signature = "(QList<QFreeColGameObject;>;QFreeColGameObject;)V")
	@Test
	public void removeTest() throws Exception {
		InGameController testSubject;
		List<FreeColGameObject> objects = null;
		FreeColGameObject divert = null;

		// default test
		testSubject = createTestSubject();
		testSubject.remove(objects, divert);

		Assert.fail();
	}

	/**
	 * Rename test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "rename", signature = "(QNameable;)Z")
	@Test
	public void renameTest() throws Exception {
		InGameController testSubject;
		Nameable object = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.rename(object);

		Assert.fail();
	}

	/**
	 * Save game test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "saveGame", signature = "()Z")
	@Test
	public void saveGameTest_1() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.saveGame();

		Assert.fail();
	}

	/**
	 * Select destination test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "selectDestination", signature = "(QUnit;)Z")
	@Test
	public void selectDestinationTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.selectDestination(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Sell goods test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "sellGoods", signature = "(QGoods;)Z")
	@Test
	public void sellGoodsTest() throws Exception {
		InGameController testSubject;
		Goods goods = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		goods = null;
		result = testSubject.sellGoods(goods);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Send chat test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "sendChat", signature = "(QString;)Z")
	@Test
	public void sendChatTest() throws Exception {
		InGameController testSubject;
		String chat = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		chat = null;
		result = testSubject.sendChat(chat);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		chat = "";
		result = testSubject.sendChat(chat);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Sets the build queue test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setBuildQueue", signature = "(QColony;QList<QBuildableType;>;)Z")
	@Test
	public void setBuildQueueTest() throws Exception {
		InGameController testSubject;
		Colony colony = null;
		List<BuildableType> buildQueue = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		colony = null;
		buildQueue = null;
		result = testSubject.setBuildQueue(colony, buildQueue);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		buildQueue = null;
		colony = null;
		result = testSubject.setBuildQueue(colony, buildQueue);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Sets the current player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setCurrentPlayer", signature = "(QPlayer;)Z")
	@Test
	public void setCurrentPlayerTest() throws Exception {
		InGameController testSubject;
		Player player = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.setCurrentPlayer(player);

		Assert.fail();
	}

	/**
	 * Sets the dead test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setDead", signature = "(QPlayer;)Z")
	@Test
	public void setDeadTest() throws Exception {
		InGameController testSubject;
		Player dead = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		dead = null;
		result = testSubject.setDead(dead);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Sets the game connected test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setGameConnected", signature = "()V")
	@Test
	public void setGameConnectedTest() throws Exception {
		InGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setGameConnected();

		Assert.fail();
	}

	/**
	 * Sets the goods levels test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setGoodsLevels", signature = "(QColony;QGoodsType;)Z")
	@Test
	public void setGoodsLevelsTest() throws Exception {
		InGameController testSubject;
		Colony colony = null;
		GoodsType goodsType = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		colony = null;
		goodsType = null;
		result = testSubject.setGoodsLevels(colony, goodsType);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		goodsType = null;
		colony = null;
		result = testSubject.setGoodsLevels(colony, goodsType);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Sets the in debug mode test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setInDebugMode", signature = "()Z")
	@Test
	public void setInDebugModeTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.setInDebugMode();

		Assert.fail();
	}

	/**
	 * Sets the stance test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setStance", signature = "(QStance;QPlayer;QPlayer;)Z")
	@Test
	public void setStanceTest() throws Exception {
		InGameController testSubject;
		Stance stance = null;
		Player first = null;
		Player second = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		stance = null;
		first = null;
		second = null;
		result = testSubject.setStance(stance, first, second);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		first = null;
		stance = null;
		second = null;
		result = testSubject.setStance(stance, first, second);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		second = null;
		stance = null;
		first = null;
		result = testSubject.setStance(stance, first, second);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Sets the trade routes test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setTradeRoutes", signature = "(QList<QTradeRoute;>;)Z")
	@Test
	public void setTradeRoutesTest() throws Exception {
		InGameController testSubject;
		List<TradeRoute> routes = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		routes = null;
		result = testSubject.setTradeRoutes(routes);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Spy colony test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "spyColony", signature = "(QTile;QRunnable;)V")
	@Test
	public void spyColonyTest() throws Exception {
		InGameController testSubject;
		Tile tile = null;
		Runnable recover = null;

		// default test
		testSubject = createTestSubject();
		testSubject.spyColony(tile, recover);

		Assert.fail();
	}

	/**
	 * Train unit in europe test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "trainUnitInEurope", signature = "(QUnitType;)Z")
	@Test
	public void trainUnitInEuropeTest() throws Exception {
		InGameController testSubject;
		UnitType unitType = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unitType = null;
		result = testSubject.trainUnitInEurope(unitType);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Unload test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "unload", signature = "(QUnit;)Z")
	@Test
	public void unloadTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.unload(unit);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Unload cargo test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "unloadCargo", signature = "(QGoods;Z)Z")
	@Test
	public void unloadCargoTest() throws Exception {
		InGameController testSubject;
		Goods goods = null;
		boolean dump = false;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		goods = null;
		result = testSubject.unloadCargo(goods, dump);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Update trade route test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "updateTradeRoute", signature = "(QTradeRoute;)Z")
	@Test
	public void updateTradeRouteTest() throws Exception {
		InGameController testSubject;
		TradeRoute route = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		route = null;
		result = testSubject.updateTradeRoute(route);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	/**
	 * Victory test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "victory", signature = "(QString;)V")
	@Test
	public void victoryTest() throws Exception {
		InGameController testSubject;
		String score = "";

		// default test
		testSubject = createTestSubject();
		testSubject.victory(score);

		Assert.fail();
	}

	/**
	 * Victory test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "victory", signature = "(QBoolean;)Z")
	@Test
	public void victoryTest_1() throws Exception {
		InGameController testSubject;
		Boolean quit = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.victory(quit);

		Assert.fail();
	}

	/**
	 * Wait unit test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "waitUnit", signature = "()Z")
	@Test
	public void waitUnitTest() throws Exception {
		InGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.waitUnit();

		Assert.fail();
	}

	/**
	 * Work test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "work", signature = "(QUnit;QWorkLocation;)Z")
	@Test
	public void workTest() throws Exception {
		InGameController testSubject;
		Unit unit = null;
		WorkLocation workLocation = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		workLocation = null;
		result = testSubject.work(unit, workLocation);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		workLocation = null;
		unit = null;
		result = testSubject.work(unit, workLocation);
		Assert.assertEquals(false, result);

		Assert.fail();
	}
}