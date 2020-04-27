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

@Generated(value = "org.junit-tools-1.1.0")
public class PreGameControllerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private PreGameController createTestSubject() {
		return new PreGameController(new FreeColClient(new InputStream(), ""));
	}

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

	@MethodRef(name = "requestLaunch", signature = "()V")
	@Test
	public void requestLaunchTest() throws Exception {
		PreGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.requestLaunch();

		Assert.fail();
	}

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

	@MethodRef(name = "updateGameOptions", signature = "()V")
	@Test
	public void updateGameOptionsTest() throws Exception {
		PreGameController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateGameOptions();

		Assert.fail();
	}

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