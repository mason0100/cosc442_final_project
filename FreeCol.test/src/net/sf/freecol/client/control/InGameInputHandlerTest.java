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

@Generated(value = "org.junit-tools-1.1.0")
public class InGameInputHandlerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private InGameInputHandler createTestSubject() {
		return new InGameInputHandler(new FreeColClient(new InputStream(), ""));
	}

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