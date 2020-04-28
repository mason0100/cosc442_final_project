/*
 * 
 */
package net.sf.freecol.client.control;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Unit;

// TODO: Auto-generated Javadoc
/**
 * The Class InGameInputHandlerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class InGameInputHandlerTest {

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
	 * @return the in game input handler
	 */
	private InGameInputHandler createTestSubject() {
		return new InGameInputHandler(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Igc test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "igc", signature = "()QInGameController;")
	@Test
	public void igcTest() throws Exception {
		InGameInputHandler testSubject;
		InGameController result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "igc");

		Assert.fail();
	}

	/**
	 * Invoke and wait test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "invokeAndWait", signature = "(QRunnable;)V")
	@Test
	public void invokeAndWaitTest() throws Exception {
		InGameInputHandler testSubject;
		Runnable runnable = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "invokeAndWait", new Object[] { Runnable.class });

		Assert.fail();
	}

	/**
	 * Invoke later test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "invokeLater", signature = "(QRunnable;)V")
	@Test
	public void invokeLaterTest() throws Exception {
		InGameInputHandler testSubject;
		Runnable runnable = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "invokeLater", new Object[] { Runnable.class });

		Assert.fail();
	}

	/**
	 * Gets the integer attribute test.
	 *
	 * @return the integer attribute test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getIntegerAttribute", signature = "(QElement;QString;)I")
	@Test
	public void getIntegerAttributeTest() throws Exception {
		Element element = null;
		String attrib = "";
		int result;

		// default test
		result = Whitebox.invokeMethod(InGameInputHandler.class, "getIntegerAttribute",
				new Object[] { Element.class, attrib });

		Assert.fail();
	}

	/**
	 * Select element test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "selectElement", signature = "(QElement;QString;)QElement;")
	@Test
	public void selectElementTest() throws Exception {
		Element parent = null;
		String key = "";
		Element result;

		// default test
		result = Whitebox.invokeMethod(InGameInputHandler.class, "selectElement", new Object[] { Element.class, key });

		Assert.fail();
	}

	/**
	 * Select unit from element test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "selectUnitFromElement", signature = "(QGame;QElement;QString;)QUnit;")
	@Test
	public void selectUnitFromElementTest() throws Exception {
		Game game = null;
		Element element = null;
		String id = "";
		Unit result;

		// default test
		result = Whitebox.invokeMethod(InGameInputHandler.class, "selectUnitFromElement",
				new Object[] { Game.class, Element.class, id });

		Assert.fail();
	}

	/**
	 * Handle test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "handle", signature = "(QConnection;QElement;)QElement;")
	@Test
	public void handleTest() throws Exception {
		InGameInputHandler testSubject;
		Connection connection = null;
		Element element = null;
		Element result;

		// test 1
		testSubject = createTestSubject();
		element = null;
		result = testSubject.handle(connection, element);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Adds the object test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "addObject", signature = "(QElement;)QElement;")
	@Test
	public void addObjectTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "addObject", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Adds the player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "addPlayer", signature = "(QElement;)QElement;")
	@Test
	public void addPlayerTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "addPlayer", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Animate attack test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "animateAttack", signature = "(QElement;)QElement;")
	@Test
	public void animateAttackTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "animateAttack", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Animate move test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "animateMove", signature = "(QElement;)QElement;")
	@Test
	public void animateMoveTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "animateMove", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Chat test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chat", signature = "(QElement;)QElement;")
	@Test
	public void chatTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "chat", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Choose founding father test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chooseFoundingFather", signature = "(QElement;)QElement;")
	@Test
	public void chooseFoundingFatherTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "chooseFoundingFather", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Close menus test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "closeMenus", signature = "()QElement;")
	@Test
	public void closeMenusTest() throws Exception {
		InGameInputHandler testSubject;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "closeMenus");

		Assert.fail();
	}

	/**
	 * Diplomacy test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "diplomacy", signature = "(QElement;)QElement;")
	@Test
	public void diplomacyTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "diplomacy", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Dispose units test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "disposeUnits", signature = "(QElement;)QElement;")
	@Test
	public void disposeUnitsTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "disposeUnits", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Error test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "error", signature = "(QElement;)QElement;")
	@Test
	public void errorTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "error", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Feature change test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "featureChange", signature = "(QElement;)QElement;")
	@Test
	public void featureChangeTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "featureChange", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * First contact test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "firstContact", signature = "(QElement;)QElement;")
	@Test
	public void firstContactTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "firstContact", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Fountain of youth test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "fountainOfYouth", signature = "(QElement;)QElement;")
	@Test
	public void fountainOfYouthTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "fountainOfYouth", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Game ended test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "gameEnded", signature = "(QElement;)QElement;")
	@Test
	public void gameEndedTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "gameEnded", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Indian demand test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "indianDemand", signature = "(QElement;)QElement;")
	@Test
	public void indianDemandTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "indianDemand", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Loot cargo test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "lootCargo", signature = "(QElement;)QElement;")
	@Test
	public void lootCargoTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "lootCargo", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Monarch action test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "monarchAction", signature = "(QElement;)QElement;")
	@Test
	public void monarchActionTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "monarchAction", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Multiple test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "multiple", signature = "(QConnection;QElement;)QElement;")
	@Test
	public void multipleTest() throws Exception {
		InGameInputHandler testSubject;
		Connection connection = null;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "multiple", new Object[] { Connection.class, Element.class });

		Assert.fail();
	}

	/**
	 * New land name test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newLandName", signature = "(QElement;)QElement;")
	@Test
	public void newLandNameTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "newLandName", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * New region name test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newRegionName", signature = "(QElement;)QElement;")
	@Test
	public void newRegionNameTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "newRegionName", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * New turn test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newTurn", signature = "(QElement;)QElement;")
	@Test
	public void newTurnTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "newTurn", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Reconnect test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "reconnect", signature = "(QElement;)QElement;")
	@Test
	public void reconnectTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "reconnect", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Removes the test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "remove", signature = "(QElement;)QElement;")
	@Test
	public void removeTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "remove", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Sets the AI test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setAI", signature = "(QElement;)QElement;")
	@Test
	public void setAITest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "setAI", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Sets the current player test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setCurrentPlayer", signature = "(QElement;)QElement;")
	@Test
	public void setCurrentPlayerTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "setCurrentPlayer", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Sets the dead test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setDead", signature = "(QElement;)QElement;")
	@Test
	public void setDeadTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "setDead", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Sets the stance test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setStance", signature = "(QElement;)QElement;")
	@Test
	public void setStanceTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "setStance", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Spy result test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "spyResult", signature = "(QElement;)QElement;")
	@Test
	public void spyResultTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "spyResult", new Object[] { Element.class });

		Assert.fail();
	}

	/**
	 * Update test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "update", signature = "(QElement;)QElement;")
	@Test
	public void updateTest() throws Exception {
		InGameInputHandler testSubject;
		Element element = null;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "update", new Object[] { Element.class });

		Assert.fail();
	}
}