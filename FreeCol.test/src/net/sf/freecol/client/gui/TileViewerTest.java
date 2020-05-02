package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.TileImprovement;
import net.sf.freecol.common.model.TileItem;
import net.sf.freecol.common.model.TileType;

@Generated(value = "org.junit-tools-1.1.0")
public class TileViewerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private TileViewer createTestSubject() {
		return new TileViewer(new FreeColClient(new InputStream(), ""));
	}

	@MethodRef(name = "getImageLibrary", signature = "()QImageLibrary;")
	@Test
	public void getImageLibraryTest() throws Exception {
		TileViewer testSubject;
		ImageLibrary result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getImageLibrary");

		Assert.fail();
	}

	@MethodRef(name = "createTileImageWithOverlayAndForest", signature = "(QTileType;QDimension;)QBufferedImage;")
	@Test
	public void createTileImageWithOverlayAndForestTest() throws Exception {
		TileType type = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = Whitebox.invokeMethod(TileViewer.class, "createTileImageWithOverlayAndForest",
				new Object[] { TileType.class, Dimension.class });

		Assert.fail();
	}

	@MethodRef(name = "createTileImageWithBeachBorderAndItems", signature = "(QTile;)QBufferedImage;")
	@Test
	public void createTileImageWithBeachBorderAndItemsTest() throws Exception {
		TileViewer testSubject;
		Tile tile = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "createTileImageWithBeachBorderAndItems",
				new Object[] { Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "createTileImage", signature = "(QTile;)QBufferedImage;")
	@Test
	public void createTileImageTest() throws Exception {
		TileViewer testSubject;
		Tile tile = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "createTileImage", new Object[] { Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "createColonyTileImage", signature = "(QTile;QColony;)QBufferedImage;")
	@Test
	public void createColonyTileImageTest() throws Exception {
		TileViewer testSubject;
		Tile tile = null;
		Colony colony = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "createColonyTileImage", new Object[] { Tile.class, Colony.class });

		Assert.fail();
	}

	@MethodRef(name = "displayColonyTiles", signature = "(QGraphics2D;[[QTile;QColony;)V")
	@Test
	public void displayColonyTilesTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile[][] tiles = new Tile[][] { null };
		Colony colony = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayColonyTiles",
				new Object[] { Graphics2D.class, Tile[][].class, Colony.class });

		Assert.fail();
	}

	@MethodRef(name = "displayColonyTile", signature = "(QGraphics2D;QTile;QColony;QBufferedImage;)V")
	@Test
	public void displayColonyTileTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		Colony colony = null;
		BufferedImage overlayImage = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayColonyTile",
				new Object[] { Graphics2D.class, Tile.class, Colony.class, BufferedImage.class });

		Assert.fail();
	}

	@MethodRef(name = "displayTile", signature = "(QGraphics2D;QTile;QBufferedImage;)V")
	@Test
	public void displayTileTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		BufferedImage overlayImage = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayTile",
				new Object[] { Graphics2D.class, Tile.class, BufferedImage.class });

		Assert.fail();
	}

	@MethodRef(name = "setImageLibraryAndUpdateData", signature = "(QImageLibrary;)V")
	@Test
	public void setImageLibraryAndUpdateDataTest() throws Exception {
		TileViewer testSubject;
		ImageLibrary lib = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setImageLibraryAndUpdateData", new Object[] { ImageLibrary.class });

		Assert.fail();
	}

	@MethodRef(name = "displayCenteredImage", signature = "(QGraphics2D;QBufferedImage;)V")
	@Test
	public void displayCenteredImageTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		BufferedImage image = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayCenteredImage",
				new Object[] { Graphics2D.class, BufferedImage.class });

		Assert.fail();
	}

	@MethodRef(name = "displayLargeCenteredImage", signature = "(QGraphics2D;QBufferedImage;)V")
	@Test
	public void displayLargeCenteredImageTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		BufferedImage image = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayLargeCenteredImage",
				new Object[] { Graphics2D.class, BufferedImage.class });

		Assert.fail();
	}

	@MethodRef(name = "displayTileWithBeachAndBorder", signature = "(QGraphics2D;QTile;)V")
	@Test
	public void displayTileWithBeachAndBorderTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		Whitebox.invokeMethod(testSubject, "displayTileWithBeachAndBorder",
				new Object[] { Graphics2D.class, Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "displayUnknownTileBorder", signature = "(QGraphics2D;QTile;)V")
	@Test
	public void displayUnknownTileBorderTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayUnknownTileBorder", new Object[] { Graphics2D.class, Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "displayFogOfWar", signature = "(QGraphics2D;QTile;)V")
	@Test
	public void displayFogOfWarTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayFogOfWar", new Object[] { Graphics2D.class, Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "displayOptionalTileText", signature = "(QGraphics2D;QTile;)V")
	@Test
	public void displayOptionalTileTextTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayOptionalTileText", new Object[] { Graphics2D.class, Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "displaySettlementWithChipsOrPopulationNumber", signature = "(QGraphics2D;QTile;Z)V")
	@Test
	public void displaySettlementWithChipsOrPopulationNumberTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		boolean withNumber = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displaySettlementWithChipsOrPopulationNumber",
				new Object[] { Graphics2D.class, Tile.class, withNumber });

		Assert.fail();
	}

	@MethodRef(name = "displayTileItems", signature = "(QGraphics2D;QTile;QBufferedImage;)V")
	@Test
	public void displayTileItemsTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		BufferedImage overlayImage = null;

		// test 1
		testSubject = createTestSubject();
		overlayImage = null;
		Whitebox.invokeMethod(testSubject, "displayTileItems",
				new Object[] { Graphics2D.class, Tile.class, BufferedImage.class });

		Assert.fail();
	}

	@MethodRef(name = "displayTileItem", signature = "(QGraphics2D;QTile;QTileItem;)V")
	@Test
	public void displayTileItemTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		TileItem item = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayTileItem",
				new Object[] { Graphics2D.class, Tile.class, TileItem.class });

		Assert.fail();
	}

	@MethodRef(name = "displayResourceTileItem", signature = "(QGraphics2D;QResource;)V")
	@Test
	public void displayResourceTileItemTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Resource item = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayResourceTileItem",
				new Object[] { Graphics2D.class, Resource.class });

		Assert.fail();
	}

	@MethodRef(name = "displayLostCityRumour", signature = "(QGraphics2D;)V")
	@Test
	public void displayLostCityRumourTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayLostCityRumour", new Object[] { Graphics2D.class });

		Assert.fail();
	}

	@MethodRef(name = "displayTileImprovement", signature = "(QGraphics2D;QTile;QTileImprovement;)V")
	@Test
	public void displayTileImprovementTest() throws Exception {
		TileViewer testSubject;
		Graphics2D g = null;
		Tile tile = null;
		TileImprovement ti = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayTileImprovement",
				new Object[] { Graphics2D.class, Tile.class, TileImprovement.class });

		Assert.fail();
	}
}