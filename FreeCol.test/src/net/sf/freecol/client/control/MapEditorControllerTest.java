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

@Generated(value = "org.junit-tools-1.1.0")
public class MapEditorControllerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private MapEditorController createTestSubject() {
		return new MapEditorController(new FreeColClient(new InputStream(), ""));
	}

	@MethodRef(name = "startMapEditor", signature = "()V")
	@Test
	public void startMapEditorTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.startMapEditor();

		Assert.fail();
	}

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

	@MethodRef(name = "newMap", signature = "()V")
	@Test
	public void newMapTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.newMap();

		Assert.fail();
	}

	@MethodRef(name = "saveGame", signature = "()V")
	@Test
	public void saveGameTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.saveGame();

		Assert.fail();
	}

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

	@MethodRef(name = "loadGame", signature = "()V")
	@Test
	public void loadGameTest() throws Exception {
		MapEditorController testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.loadGame();

		Assert.fail();
	}

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