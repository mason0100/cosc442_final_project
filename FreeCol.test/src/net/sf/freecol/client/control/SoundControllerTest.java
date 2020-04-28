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

import net.sf.freecol.client.FreeColClient;

// TODO: Auto-generated Javadoc
/**
 * The Class SoundControllerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class SoundControllerTest {

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
	 * @return the sound controller
	 */
	private SoundController createTestSubject() {
		return new SoundController(new FreeColClient(new InputStream(), ""), false);
	}

	/**
	 * Can play sound test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "canPlaySound", signature = "()Z")
	@Test
	public void canPlaySoundTest() throws Exception {
		SoundController testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.canPlaySound();

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
		SoundController testSubject;
		String sound = "";

		// test 1
		testSubject = createTestSubject();
		sound = null;
		testSubject.playSound(sound);

		// test 2
		testSubject = createTestSubject();
		sound = "";
		testSubject.playSound(sound);

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
		SoundController testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSoundMixerLabelText();

		Assert.fail();
	}
}