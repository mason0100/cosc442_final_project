/*
 * 
 */
package net.sf.freecol.client.control;

import java.io.File;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.control.MapEditorController.IMapTransform;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Tile;

// TODO: Auto-generated Javadoc
/**
 * The Class MapEditorControllerTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class MapEditorControllerTest {

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
	 * @return the map editor controller
	 */
	private MapEditorController createTestSubject() {
		return new MapEditorController(new FreeColClient(new InputStream(), ""));
	}

	/**
	 * Start map editor test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "startMapEditor", signature = "()V")
	@Test
	public void startMapEditorTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.startMapEditor();

		Assert.fail();
	}

	/**
	 * Gets the default specification test.
	 *
	 * @return the default specification test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getDefaultSpecification", signature = "()QSpecification;")
	@Test
	public void getDefaultSpecificationTest() throws Exception {
		MapEditorController testSubject;
		Specification result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDefaultSpecification();

		Assert.fail();
	}

	/**
	 * Sets the map transform test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "setMapTransform", signature = "(QIMapTransform;)V")
	@Test
	public void setMapTransformTest() throws Exception {
		MapEditorController testSubject;
		IMapTransform mt = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setMapTransform(mt);

		Assert.fail();
	}

	/**
	 * Gets the map transform test.
	 *
	 * @return the map transform test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMapTransform", signature = "()QIMapTransform;")
	@Test
	public void getMapTransformTest() throws Exception {
		MapEditorController testSubject;
		IMapTransform result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMapTransform();

		Assert.fail();
	}

	/**
	 * Transform test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "transform", signature = "(QTile;)V")
	@Test
	public void transformTest() throws Exception {
		MapEditorController testSubject;
		Tile t = null;

		// default test
		testSubject = createTestSubject();
		testSubject.transform(t);

		Assert.fail();
	}

	/**
	 * New map test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "newMap", signature = "()V")
	@Test
	public void newMapTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.newMap();

		Assert.fail();
	}

	/**
	 * Save game test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "saveGame", signature = "()V")
	@Test
	public void saveGameTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.saveGame();

		Assert.fail();
	}

	/**
	 * Save game test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "saveGame", signature = "(QFile;)V")
	@Test
	public void saveGameTest_1() throws Exception {
		MapEditorController testSubject;
		File file = null;

		// default test
		testSubject = createTestSubject();
		testSubject.saveGame(file);

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
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.loadGame();

		Assert.fail();
	}

	/**
	 * Require native nations test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "requireNativeNations", signature = "(QGame;)V")
	@Test
	public void requireNativeNationsTest() throws Exception {
		MapEditorController testSubject;
		Game game = null;

		// default test
		testSubject = createTestSubject();
		testSubject.requireNativeNations(game);

		Assert.fail();
	}

	/**
	 * Load game test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "loadGame", signature = "(QFile;)V")
	@Test
	public void loadGameTest_1() throws Exception {
		MapEditorController testSubject;
		File file = null;

		// default test
		testSubject = createTestSubject();
		testSubject.loadGame(file);

		Assert.fail();
	}

	/**
	 * Reload main panel test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "reloadMainPanel", signature = "()V")
	@Test
	public void reloadMainPanelTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "reloadMainPanel");

		Assert.fail();
	}
}