/*
 * 
 */
package net.sf.freecol.client.control;

import java.awt.Color;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.NationOptions.NationState;
import net.sf.freecol.common.model.NationType;

// TODO: Auto-generated Javadoc
/**
 * The Class PreGameControllerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class PreGameControllerTest {

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
	 * @return the pre game controller
	 */
	private PreGameController createTestSubject() {
		return new PreGameController(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Chat test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "chat", signature = "(QString;)V")
	@Test
	public void chatTest() throws Exception {
		PreGameController testSubject;
		String message = "";

		// default test
		testSubject = createTestSubject();
		testSubject.chat(message);

		Assert.fail();
	}

	/**
	 * Sets the ready test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setReady", signature = "(Z)V")
	@Test
	public void setReadyTest() throws Exception {
		PreGameController testSubject;
		boolean ready = false;

		// default test
		testSubject = createTestSubject();
		testSubject.setReady(ready);

		Assert.fail();
	}

	/**
	 * Request launch test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "requestLaunch", signature = "()V")
	@Test
	public void requestLaunchTest() throws Exception {
		PreGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.requestLaunch();

		Assert.fail();
	}

	/**
	 * Sets the available test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setAvailable", signature = "(QNation;QNationState;)V")
	@Test
	public void setAvailableTest() throws Exception {
		PreGameController testSubject;
		Nation nation = null;
		NationState state = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setAvailable(nation, state);

		Assert.fail();
	}

	/**
	 * Sets the color test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setColor", signature = "(QNation;QColor;)V")
	@Test
	public void setColorTest() throws Exception {
		PreGameController testSubject;
		Nation nation = null;
		Color color = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setColor(nation, color);

		Assert.fail();
	}

	/**
	 * Sets the nation test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setNation", signature = "(QNation;)V")
	@Test
	public void setNationTest() throws Exception {
		PreGameController testSubject;
		Nation nation = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setNation(nation);

		Assert.fail();
	}

	/**
	 * Sets the nation type test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setNationType", signature = "(QNationType;)V")
	@Test
	public void setNationTypeTest() throws Exception {
		PreGameController testSubject;
		NationType nationType = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setNationType(nationType);

		Assert.fail();
	}

	/**
	 * Start game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startGame", signature = "()Z")
	@Test
	public void startGameTest() throws Exception {
		PreGameController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.startGame();

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
		PreGameController testSubject;

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
		PreGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMapGeneratorOptions();

		Assert.fail();
	}
}