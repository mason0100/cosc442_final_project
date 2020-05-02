/*
 * 
 */
package net.sf.freecol.client.gui;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ImageLibraryTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class ImageLibraryTest {

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
	 * @return the image library
	 */
	private ImageLibrary createTestSubject() {
		return new ImageLibrary();
	}

	/**
	 * Gets the scale factor test.
	 *
	 * @return the scale factor test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getScaleFactor", signature = "()F")
	@Test
	public void getScaleFactorTest() throws Exception {
		ImageLibrary testSubject;
		float result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getScaleFactor();

		Assert.fail();
	}

	/**
	 * Scale dimension test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "scaleDimension", signature = "(QDimension;)QDimension;")
	@Test
	public void scaleDimensionTest() throws Exception {
		ImageLibrary testSubject;
		Dimension size = null;
		Dimension result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.scaleDimension(size);

		Assert.fail();
	}

	/**
	 * Scale dimension test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "scaleDimension", signature = "(QDimension;F)QDimension;")
	@Test
	public void scaleDimensionTest_1() throws Exception {
		Dimension size = null;
		float scaleFactor = 0;
		Dimension result;

		// default test
		result = ImageLibrary.scaleDimension(size, scaleFactor);

		Assert.fail();
	}

	/**
	 * Gets the foreground color test.
	 *
	 * @return the foreground color test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getForegroundColor", signature = "(QColor;)QColor;")
	@Test
	public void getForegroundColorTest() throws Exception {
		Color background = null;
		Color result;

		// default test
		result = ImageLibrary.getForegroundColor(background);

		Assert.fail();
	}

	/**
	 * Gets the string border color test.
	 *
	 * @return the string border color test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getStringBorderColor", signature = "(QColor;)QColor;")
	@Test
	public void getStringBorderColorTest() throws Exception {
		Color color = null;
		Color result;

		// default test
		result = ImageLibrary.getStringBorderColor(color);

		Assert.fail();
	}

	/**
	 * Checks if is even test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "isEven", signature = "(II)Z")
	@Test
	public void isEvenTest() throws Exception {
		int x = 0;
		int y = 0;
		boolean result;

		// default test
		result = Whitebox.invokeMethod(ImageLibrary.class, "isEven", new Object[] { x, y });

		Assert.fail();
	}

	/**
	 * Gets the beach corner image test.
	 *
	 * @return the beach corner image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBeachCornerImage", signature = "(III)QBufferedImage;")
	@Test
	public void getBeachCornerImageTest() throws Exception {
		ImageLibrary testSubject;
		int index = 0;
		int x = 0;
		int y = 0;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBeachCornerImage(index, x, y);

		Assert.fail();
	}

	/**
	 * Gets the beach edge image test.
	 *
	 * @return the beach edge image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBeachEdgeImage", signature = "(III)QBufferedImage;")
	@Test
	public void getBeachEdgeImageTest() throws Exception {
		ImageLibrary testSubject;
		int index = 0;
		int x = 0;
		int y = 0;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBeachEdgeImage(index, x, y);

		Assert.fail();
	}

	/**
	 * Gets the border image test.
	 *
	 * @return the border image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBorderImage", signature = "(QTileType;QDirection;II)QBufferedImage;")
	@Test
	public void getBorderImageTest() throws Exception {
		ImageLibrary testSubject;
		TileType type = null;
		Direction direction = null;
		int x = 0;
		int y = 0;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBorderImage(type, direction, x, y);

		Assert.fail();
	}

	/**
	 * Gets the forest image test.
	 *
	 * @return the forest image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getForestImage", signature = "(QTileType;)QBufferedImage;")
	@Test
	public void getForestImageTest() throws Exception {
		ImageLibrary testSubject;
		TileType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getForestImage(type);

		Assert.fail();
	}

	/**
	 * Gets the forest image test 1.
	 *
	 * @return the forest image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getForestImage", signature = "(QTileType;QDimension;)QBufferedImage;")
	@Test
	public void getForestImageTest_1() throws Exception {
		TileType type = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getForestImage(type, size);

		Assert.fail();
	}

	/**
	 * Gets the forest image test 2.
	 *
	 * @return the forest image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getForestImage", signature = "(QTileType;QTileImprovementStyle;)QBufferedImage;")
	@Test
	public void getForestImageTest_2() throws Exception {
		ImageLibrary testSubject;
		TileType type = null;
		TileImprovementStyle riverStyle = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getForestImage(type, riverStyle);

		Assert.fail();
	}

	/**
	 * Gets the forest image test 3.
	 *
	 * @return the forest image test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getForestImage", signature = "(QTileType;QTileImprovementStyle;QDimension;)QBufferedImage;")
	@Test
	public void getForestImageTest_3() throws Exception {
		TileType type = null;
		TileImprovementStyle riverStyle = null;
		Dimension size = null;
		BufferedImage result;

		// test 1
		riverStyle = null;
		result = ImageLibrary.getForestImage(type, riverStyle, size);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Gets the founding father image test.
	 *
	 * @return the founding father image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getFoundingFatherImage", signature = "(QFoundingFather;Z)QBufferedImage;")
	@Test
	public void getFoundingFatherImageTest() throws Exception {
		FoundingFather father = null;
		boolean grey = false;
		BufferedImage result;

		// default test
		result = ImageLibrary.getFoundingFatherImage(father, grey);

		Assert.fail();
	}

	/**
	 * Gets the small buildable image test.
	 *
	 * @return the small buildable image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallBuildableImage", signature = "(QBuildableType;QPlayer;)QBufferedImage;")
	@Test
	public void getSmallBuildableImageTest() throws Exception {
		ImageLibrary testSubject;
		BuildableType buildable = null;
		Player player = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallBuildableImage(buildable, player);

		Assert.fail();
	}

	/**
	 * Gets the buildable image test.
	 *
	 * @return the buildable image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBuildableImage", signature = "(QBuildableType;QDimension;)QBufferedImage;")
	@Test
	public void getBuildableImageTest() throws Exception {
		BuildableType buildable = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getBuildableImage(buildable, size);

		Assert.fail();
	}

	/**
	 * Gets the small building image test.
	 *
	 * @return the small building image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallBuildingImage", signature = "(QBuilding;)QBufferedImage;")
	@Test
	public void getSmallBuildingImageTest() throws Exception {
		ImageLibrary testSubject;
		Building building = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallBuildingImage(building);

		Assert.fail();
	}

	/**
	 * Gets the building image test.
	 *
	 * @return the building image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBuildingImage", signature = "(QBuilding;)QBufferedImage;")
	@Test
	public void getBuildingImageTest() throws Exception {
		ImageLibrary testSubject;
		Building building = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBuildingImage(building);

		Assert.fail();
	}

	/**
	 * Gets the building image test 1.
	 *
	 * @return the building image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBuildingImage", signature = "(QBuildingType;QPlayer;F)QBufferedImage;")
	@Test
	public void getBuildingImageTest_1() throws Exception {
		BuildingType buildingType = null;
		Player player = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getBuildingImage(buildingType, player, scale);

		Assert.fail();
	}

	/**
	 * Gets the building image test 2.
	 *
	 * @return the building image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBuildingImage", signature = "(QBuildingType;F)QBufferedImage;")
	@Test
	public void getBuildingImageTest_2() throws Exception {
		BuildingType buildingType = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getBuildingImage(buildingType, scale);

		Assert.fail();
	}

	/**
	 * Gets the building image test 3.
	 *
	 * @return the building image test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getBuildingImage", signature = "(QBuildingType;QDimension;)QBufferedImage;")
	@Test
	public void getBuildingImageTest_3() throws Exception {
		BuildingType buildingType = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getBuildingImage(buildingType, size);

		Assert.fail();
	}

	/**
	 * Gets the smaller icon image test.
	 *
	 * @return the smaller icon image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallerIconImage", signature = "(QFreeColGameObjectType;)QBufferedImage;")
	@Test
	public void getSmallerIconImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColGameObjectType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallerIconImage(type);

		Assert.fail();
	}

	/**
	 * Gets the small icon image test.
	 *
	 * @return the small icon image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallIconImage", signature = "(QFreeColGameObjectType;)QBufferedImage;")
	@Test
	public void getSmallIconImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColGameObjectType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallIconImage(type);

		Assert.fail();
	}

	/**
	 * Gets the icon image test.
	 *
	 * @return the icon image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getIconImage", signature = "(QFreeColGameObjectType;)QBufferedImage;")
	@Test
	public void getIconImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColGameObjectType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getIconImage(type);

		Assert.fail();
	}

	/**
	 * Gets the smaller misc icon image test.
	 *
	 * @return the smaller misc icon image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallerMiscIconImage", signature = "(QFreeColGameObjectType;)QBufferedImage;")
	@Test
	public void getSmallerMiscIconImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColGameObjectType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallerMiscIconImage(type);

		Assert.fail();
	}

	/**
	 * Gets the small misc icon image test.
	 *
	 * @return the small misc icon image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallMiscIconImage", signature = "(QFreeColGameObjectType;)QBufferedImage;")
	@Test
	public void getSmallMiscIconImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColGameObjectType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallMiscIconImage(type);

		Assert.fail();
	}

	/**
	 * Gets the misc icon image test.
	 *
	 * @return the misc icon image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMiscIconImage", signature = "(QFreeColGameObjectType;)QBufferedImage;")
	@Test
	public void getMiscIconImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColGameObjectType type = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMiscIconImage(type);

		Assert.fail();
	}

	/**
	 * Gets the misc icon image test 1.
	 *
	 * @return the misc icon image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMiscIconImage", signature = "(QFreeColGameObjectType;F)QBufferedImage;")
	@Test
	public void getMiscIconImageTest_1() throws Exception {
		FreeColGameObjectType type = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getMiscIconImage(type, scale);

		Assert.fail();
	}

	/**
	 * Gets the misc icon image test 2.
	 *
	 * @return the misc icon image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMiscIconImage", signature = "(QFreeColGameObjectType;QDimension;)QBufferedImage;")
	@Test
	public void getMiscIconImageTest_2() throws Exception {
		FreeColGameObjectType type = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getMiscIconImage(type, size);

		Assert.fail();
	}

	/**
	 * Gets the misc image test.
	 *
	 * @return the misc image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMiscImage", signature = "(QString;)QBufferedImage;")
	@Test
	public void getMiscImageTest() throws Exception {
		ImageLibrary testSubject;
		String id = "";
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMiscImage(id);

		Assert.fail();
	}

	/**
	 * Gets the misc image test 1.
	 *
	 * @return the misc image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMiscImage", signature = "(QString;F)QBufferedImage;")
	@Test
	public void getMiscImageTest_1() throws Exception {
		String id = "";
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getMiscImage(id, scale);

		Assert.fail();
	}

	/**
	 * Gets the misc image test 2.
	 *
	 * @return the misc image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMiscImage", signature = "(QString;QDimension;)QBufferedImage;")
	@Test
	public void getMiscImageTest_2() throws Exception {
		String id = "";
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getMiscImage(id, size);

		Assert.fail();
	}

	/**
	 * Gets the object image test.
	 *
	 * @return the object image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getObjectImage", signature = "(QFreeColObject;F)QBufferedImage;")
	@Test
	public void getObjectImageTest() throws Exception {
		ImageLibrary testSubject;
		FreeColObject display = null;
		float scale = 0;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getObjectImage(display, scale);

		Assert.fail();
	}

	/**
	 * Gets the monarch image test.
	 *
	 * @return the monarch image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMonarchImage", signature = "(QNation;)QBufferedImage;")
	@Test
	public void getMonarchImageTest() throws Exception {
		Nation nation = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getMonarchImage(nation);

		Assert.fail();
	}

	/**
	 * Gets the overlay image test.
	 *
	 * @return the overlay image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getOverlayImage", signature = "(QTile;)QBufferedImage;")
	@Test
	public void getOverlayImageTest() throws Exception {
		ImageLibrary testSubject;
		Tile tile = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getOverlayImage(tile);

		Assert.fail();
	}

	/**
	 * Gets the overlay image test 1.
	 *
	 * @return the overlay image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getOverlayImage", signature = "(QTileType;QString;QDimension;)QBufferedImage;")
	@Test
	public void getOverlayImageTest_1() throws Exception {
		TileType type = null;
		String id = "";
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getOverlayImage(type, id, size);

		Assert.fail();
	}

	/**
	 * Creates the overlay cache test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createOverlayCache", signature = "()QSet<QString;>;")
	@Test
	public void createOverlayCacheTest() throws Exception {
		Set<String> result;

		// default test
		result = ImageLibrary.createOverlayCache();

		Assert.fail();
	}

	/**
	 * Gets the overlay image test 2.
	 *
	 * @return the overlay image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getOverlayImage", signature = "(QTile;QSet<QString;>;)QBufferedImage;")
	@Test
	public void getOverlayImageTest_2() throws Exception {
		ImageLibrary testSubject;
		Tile tile = null;
		Set<String> overlayCache = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getOverlayImage(tile, overlayCache);

		Assert.fail();
	}

	/**
	 * Gets the overlay image test 3.
	 *
	 * @return the overlay image test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getOverlayImage", signature = "(QTileType;QString;QDimension;QSet<QString;>;)QBufferedImage;")
	@Test
	public void getOverlayImageTest_3() throws Exception {
		TileType type = null;
		String id = "";
		Dimension size = null;
		Set<String> overlayCache = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getOverlayImage(type, id, size, overlayCache);

		Assert.fail();
	}

	/**
	 * Gets the randomized image test.
	 *
	 * @return the randomized image test
	 * @throws Exception the exception
	 */
	@MethodRef(name="getRandomizedImage", signature="(QList<QString;>;QString;QDimension;)QBufferedImage;")
	@Test
	public void getRandomizedImageTest() throws Exception {
	List<String> keys = null;
	String id = "";
	Dimension size = null;
	BufferedImage result;
	
	// default test
	result=Whitebox.invokeMethod(ImageLibrary.class,"getRandomizedImage", new Object[]{List<String>.class, id, Dimension.class});
	
	Assert.fail();
	}

	/**
	 * Gets the path image test.
	 *
	 * @return the path image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getPathImage", signature = "(QPathType;)QBufferedImage;")
	@Test
	public void getPathImageTest() throws Exception {
		PathType pt = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getPathImage(pt);

		Assert.fail();
	}

	/**
	 * Gets the path image test 1.
	 *
	 * @return the path image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getPathImage", signature = "(QUnit;)QBufferedImage;")
	@Test
	public void getPathImageTest_1() throws Exception {
		Unit u = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getPathImage(u);

		Assert.fail();
	}

	/**
	 * Gets the path next turn image test.
	 *
	 * @return the path next turn image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getPathNextTurnImage", signature = "(QPathType;)QBufferedImage;")
	@Test
	public void getPathNextTurnImageTest() throws Exception {
		PathType pt = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getPathNextTurnImage(pt);

		Assert.fail();
	}

	/**
	 * Gets the path next turn image test 1.
	 *
	 * @return the path next turn image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getPathNextTurnImage", signature = "(QUnit;)QBufferedImage;")
	@Test
	public void getPathNextTurnImageTest_1() throws Exception {
		Unit u = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getPathNextTurnImage(u);

		Assert.fail();
	}

	/**
	 * Gets the river image test.
	 *
	 * @return the river image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getRiverImage", signature = "(QTileImprovementStyle;)QBufferedImage;")
	@Test
	public void getRiverImageTest() throws Exception {
		ImageLibrary testSubject;
		TileImprovementStyle style = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getRiverImage(style);

		Assert.fail();
	}

	/**
	 * Gets the river image test 1.
	 *
	 * @return the river image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getRiverImage", signature = "(QString;QDimension;)QBufferedImage;")
	@Test
	public void getRiverImageTest_1() throws Exception {
		String style = "";
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getRiverImage(style, size);

		Assert.fail();
	}

	/**
	 * Gets the river mouth image test.
	 *
	 * @return the river mouth image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getRiverMouthImage", signature = "(QDirection;III)QBufferedImage;")
	@Test
	public void getRiverMouthImageTest() throws Exception {
		ImageLibrary testSubject;
		Direction direction = null;
		int magnitude = 0;
		int x = 0;
		int y = 0;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getRiverMouthImage(direction, magnitude, x, y);

		Assert.fail();
	}

	/**
	 * Gets the small settlement image test.
	 *
	 * @return the small settlement image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallSettlementImage", signature = "(QSettlement;)QBufferedImage;")
	@Test
	public void getSmallSettlementImageTest() throws Exception {
		ImageLibrary testSubject;
		Settlement settlement = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallSettlementImage(settlement);

		Assert.fail();
	}

	/**
	 * Gets the settlement image test.
	 *
	 * @return the settlement image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSettlementImage", signature = "(QSettlement;)QBufferedImage;")
	@Test
	public void getSettlementImageTest() throws Exception {
		ImageLibrary testSubject;
		Settlement settlement = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSettlementImage(settlement);

		Assert.fail();
	}

	/**
	 * Gets the settlement image test 1.
	 *
	 * @return the settlement image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSettlementImage", signature = "(QSettlement;F)QBufferedImage;")
	@Test
	public void getSettlementImageTest_1() throws Exception {
		Settlement settlement = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getSettlementImage(settlement, scale);

		Assert.fail();
	}

	/**
	 * Gets the settlement image test 2.
	 *
	 * @return the settlement image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSettlementImage", signature = "(QSettlement;QDimension;)QBufferedImage;")
	@Test
	public void getSettlementImageTest_2() throws Exception {
		Settlement settlement = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getSettlementImage(settlement, size);

		Assert.fail();
	}

	/**
	 * Gets the settlement image test 3.
	 *
	 * @return the settlement image test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSettlementImage", signature = "(QSettlementType;)QBufferedImage;")
	@Test
	public void getSettlementImageTest_3() throws Exception {
		ImageLibrary testSubject;
		SettlementType settlementType = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSettlementImage(settlementType);

		Assert.fail();
	}

	/**
	 * Gets the settlement image test 4.
	 *
	 * @return the settlement image test 4
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSettlementImage", signature = "(QSettlementType;F)QBufferedImage;")
	@Test
	public void getSettlementImageTest_4() throws Exception {
		SettlementType settlementType = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getSettlementImage(settlementType, scale);

		Assert.fail();
	}

	/**
	 * Gets the terrain image test.
	 *
	 * @return the terrain image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getTerrainImage", signature = "(QTileType;II)QBufferedImage;")
	@Test
	public void getTerrainImageTest() throws Exception {
		ImageLibrary testSubject;
		TileType type = null;
		int x = 0;
		int y = 0;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTerrainImage(type, x, y);

		Assert.fail();
	}

	/**
	 * Gets the terrain image test 1.
	 *
	 * @return the terrain image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getTerrainImage", signature = "(QTileType;IIQDimension;)QBufferedImage;")
	@Test
	public void getTerrainImageTest_1() throws Exception {
		TileType type = null;
		int x = 0;
		int y = 0;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getTerrainImage(type, x, y, size);

		Assert.fail();
	}

	/**
	 * Gets the smaller unit image test.
	 *
	 * @return the smaller unit image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallerUnitImage", signature = "(QUnit;)QBufferedImage;")
	@Test
	public void getSmallerUnitImageTest() throws Exception {
		ImageLibrary testSubject;
		Unit unit = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallerUnitImage(unit);

		Assert.fail();
	}

	/**
	 * Gets the small unit image test.
	 *
	 * @return the small unit image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallUnitImage", signature = "(QUnit;)QBufferedImage;")
	@Test
	public void getSmallUnitImageTest() throws Exception {
		ImageLibrary testSubject;
		Unit unit = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallUnitImage(unit);

		Assert.fail();
	}

	/**
	 * Gets the small unit image test 1.
	 *
	 * @return the small unit image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallUnitImage", signature = "(QUnit;Z)QBufferedImage;")
	@Test
	public void getSmallUnitImageTest_1() throws Exception {
		ImageLibrary testSubject;
		Unit unit = null;
		boolean grayscale = false;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallUnitImage(unit, grayscale);

		Assert.fail();
	}

	/**
	 * Gets the unit image test.
	 *
	 * @return the unit image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnit;)QBufferedImage;")
	@Test
	public void getUnitImageTest() throws Exception {
		ImageLibrary testSubject;
		Unit unit = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getUnitImage(unit);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 1.
	 *
	 * @return the unit image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnit;Z)QBufferedImage;")
	@Test
	public void getUnitImageTest_1() throws Exception {
		ImageLibrary testSubject;
		Unit unit = null;
		boolean grayscale = false;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getUnitImage(unit, grayscale);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 2.
	 *
	 * @return the unit image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnit;F)QBufferedImage;")
	@Test
	public void getUnitImageTest_2() throws Exception {
		Unit unit = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getUnitImage(unit, scale);

		Assert.fail();
	}

	/**
	 * Gets the tiny unit image test.
	 *
	 * @return the tiny unit image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getTinyUnitImage", signature = "(QUnitType;)QBufferedImage;")
	@Test
	public void getTinyUnitImageTest() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTinyUnitImage(unitType);

		Assert.fail();
	}

	/**
	 * Gets the tiny unit image test 1.
	 *
	 * @return the tiny unit image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getTinyUnitImage", signature = "(QUnitType;Z)QBufferedImage;")
	@Test
	public void getTinyUnitImageTest_1() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		boolean grayscale = false;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTinyUnitImage(unitType, grayscale);

		Assert.fail();
	}

	/**
	 * Gets the smaller unit image test 1.
	 *
	 * @return the smaller unit image test 1
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallerUnitImage", signature = "(QUnitType;)QBufferedImage;")
	@Test
	public void getSmallerUnitImageTest_1() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallerUnitImage(unitType);

		Assert.fail();
	}

	/**
	 * Gets the small unit image test 2.
	 *
	 * @return the small unit image test 2
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallUnitImage", signature = "(QUnitType;)QBufferedImage;")
	@Test
	public void getSmallUnitImageTest_2() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallUnitImage(unitType);

		Assert.fail();
	}

	/**
	 * Gets the small unit image test 3.
	 *
	 * @return the small unit image test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallUnitImage", signature = "(QUnitType;Z)QBufferedImage;")
	@Test
	public void getSmallUnitImageTest_3() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		boolean grayscale = false;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallUnitImage(unitType, grayscale);

		Assert.fail();
	}

	/**
	 * Gets the small unit image test 4.
	 *
	 * @return the small unit image test 4
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getSmallUnitImage", signature = "(QUnitType;QString;Z)QBufferedImage;")
	@Test
	public void getSmallUnitImageTest_4() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		String roleId = "";
		boolean grayscale = false;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSmallUnitImage(unitType, roleId, grayscale);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 3.
	 *
	 * @return the unit image test 3
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnitType;)QBufferedImage;")
	@Test
	public void getUnitImageTest_3() throws Exception {
		ImageLibrary testSubject;
		UnitType unitType = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getUnitImage(unitType);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 4.
	 *
	 * @return the unit image test 4
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnitType;F)QBufferedImage;")
	@Test
	public void getUnitImageTest_4() throws Exception {
		UnitType unitType = null;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getUnitImage(unitType, scale);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 5.
	 *
	 * @return the unit image test 5
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnitType;QString;ZZF)QBufferedImage;")
	@Test
	public void getUnitImageTest_5() throws Exception {
		UnitType unitType = null;
		String roleId = "";
		boolean nativeEthnicity = false;
		boolean grayscale = false;
		float scale = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.getUnitImage(unitType, roleId, nativeEthnicity, grayscale, scale);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 6.
	 *
	 * @return the unit image test 6
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnit;QDimension;)QBufferedImage;")
	@Test
	public void getUnitImageTest_6() throws Exception {
		Unit unit = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getUnitImage(unit, size);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 7.
	 *
	 * @return the unit image test 7
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnitType;QDimension;)QBufferedImage;")
	@Test
	public void getUnitImageTest_7() throws Exception {
		UnitType unitType = null;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getUnitImage(unitType, size);

		Assert.fail();
	}

	/**
	 * Gets the unit image test 8.
	 *
	 * @return the unit image test 8
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getUnitImage", signature = "(QUnitType;QString;ZQDimension;)QBufferedImage;")
	@Test
	public void getUnitImageTest_8() throws Exception {
		UnitType unitType = null;
		String roleId = "";
		boolean nativeEthnicity = false;
		Dimension size = null;
		BufferedImage result;

		// default test
		result = ImageLibrary.getUnitImage(unitType, roleId, nativeEthnicity, size);

		Assert.fail();
	}

	/**
	 * Draw tiled image test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "drawTiledImage", signature = "(QString;QGraphics;QJComponent;QInsets;)V")
	@Test
	public void drawTiledImageTest() throws Exception {
		String resource = "";
		Graphics g = null;
		JComponent c = null;
		Insets insets = null;

		// test 1
		insets = null;
		ImageLibrary.drawTiledImage(resource, g, c, insets);

		Assert.fail();
	}

	/**
	 * Fill texture test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "fillTexture", signature = "(QGraphics2D;QBufferedImage;IIII)V")
	@Test
	public void fillTextureTest() throws Exception {
		Graphics2D g2 = null;
		BufferedImage img = null;
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;

		// default test
		ImageLibrary.fillTexture(g2, img, x, y, width, height);

		Assert.fail();
	}

	/**
	 * Creates the buffered image test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createBufferedImage", signature = "(QImage;)QBufferedImage;")
	@Test
	public void createBufferedImageTest() throws Exception {
		Image image = null;
		BufferedImage result;

		// test 1
		image = null;
		result = ImageLibrary.createBufferedImage(image);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Creates the mirrored image test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createMirroredImage", signature = "(QImage;)QBufferedImage;")
	@Test
	public void createMirroredImageTest() throws Exception {
		Image image = null;
		BufferedImage result;

		// test 1
		image = null;
		result = ImageLibrary.createMirroredImage(image);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Creates the resized image test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createResizedImage", signature = "(QImage;II)QBufferedImage;")
	@Test
	public void createResizedImageTest() throws Exception {
		Image image = null;
		int width = 0;
		int height = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.createResizedImage(image, width, height);

		Assert.fail();
	}

	/**
	 * Fade image test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "fadeImage", signature = "(QImage;FF)QBufferedImage;")
	@Test
	public void fadeImageTest() throws Exception {
		Image img = null;
		float fade = 0;
		float target = 0;
		BufferedImage result;

		// default test
		result = ImageLibrary.fadeImage(img, fade, target);

		Assert.fail();
	}

	/**
	 * Creates the chip test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createChip", signature = "(QGraphics2D;QString;QColor;QColor;QColor;)QBufferedImage;")
	@Test
	public void createChipTest() throws Exception {
		ImageLibrary testSubject;
		Graphics2D g = null;
		String text = "";
		Color border = null;
		Color background = null;
		Color foreground = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "createChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, Color.class });

		Assert.fail();
	}

	/**
	 * Creates the filled chip test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createFilledChip", signature = "(QGraphics2D;QString;QColor;QColor;DQColor;QColor;)QBufferedImage;")
	@Test
	public void createFilledChipTest() throws Exception {
		ImageLibrary testSubject;
		Graphics2D g = null;
		String text = "";
		Color border = null;
		Color background = null;
		double amount = 0.0;
		Color fill = null;
		Color foreground = null;
		BufferedImage result;

		// test 1
		testSubject = createTestSubject();
		amount = 0.0;
		result = Whitebox.invokeMethod(testSubject, "createFilledChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, amount, Color.class, Color.class });
		Assert.assertEquals(null, result);

		// test 2
		testSubject = createTestSubject();
		amount = -1.0;
		result = Whitebox.invokeMethod(testSubject, "createFilledChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, amount, Color.class, Color.class });
		Assert.assertEquals(null, result);

		// test 3
		testSubject = createTestSubject();
		amount = 1.0;
		result = Whitebox.invokeMethod(testSubject, "createFilledChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, amount, Color.class, Color.class });
		Assert.assertEquals(null, result);

		// test 4
		testSubject = createTestSubject();
		amount = 1.0;
		result = Whitebox.invokeMethod(testSubject, "createFilledChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, amount, Color.class, Color.class });
		Assert.assertEquals(null, result);

		// test 5
		testSubject = createTestSubject();
		amount = 0.0;
		result = Whitebox.invokeMethod(testSubject, "createFilledChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, amount, Color.class, Color.class });
		Assert.assertEquals(null, result);

		// test 6
		testSubject = createTestSubject();
		amount = 2.0;
		result = Whitebox.invokeMethod(testSubject, "createFilledChip",
				new Object[] { Graphics2D.class, text, Color.class, Color.class, amount, Color.class, Color.class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Gets the alarm chip test.
	 *
	 * @return the alarm chip test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getAlarmChip", signature = "(QGraphics2D;QIndianSettlement;QPlayer;)QBufferedImage;")
	@Test
	public void getAlarmChipTest() throws Exception {
		ImageLibrary testSubject;
		Graphics2D g = null;
		IndianSettlement is = null;
		Player player = null;
		BufferedImage result;

		// test 1
		testSubject = createTestSubject();
		player = null;
		result = testSubject.getAlarmChip(g, is, player);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Gets the indian settlement chip test.
	 *
	 * @return the indian settlement chip test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getIndianSettlementChip", signature = "(QGraphics2D;QIndianSettlement;)QBufferedImage;")
	@Test
	public void getIndianSettlementChipTest() throws Exception {
		ImageLibrary testSubject;
		Graphics2D g = null;
		IndianSettlement is = null;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getIndianSettlementChip(g, is);

		Assert.fail();
	}

	/**
	 * Gets the mission chip test.
	 *
	 * @return the mission chip test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getMissionChip", signature = "(QGraphics2D;QPlayer;Z)QBufferedImage;")
	@Test
	public void getMissionChipTest() throws Exception {
		ImageLibrary testSubject;
		Graphics2D g = null;
		Player owner = null;
		boolean expert = false;
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMissionChip(g, owner, expert);

		Assert.fail();
	}

	/**
	 * Gets the occupation indicator chip test.
	 *
	 * @return the occupation indicator chip test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getOccupationIndicatorChip", signature = "(QGraphics2D;QUnit;QString;)QBufferedImage;")
	@Test
	public void getOccupationIndicatorChipTest() throws Exception {
		ImageLibrary testSubject;
		Graphics2D g = null;
		Unit unit = null;
		String text = "";
		BufferedImage result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getOccupationIndicatorChip(g, unit, text);

		Assert.fail();
	}

	/**
	 * Gets the string image test.
	 *
	 * @return the string image test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getStringImage", signature = "(QGraphics;QString;QColor;QFont;)QBufferedImage;")
	@Test
	public void getStringImageTest() throws Exception {
		ImageLibrary testSubject;
		Graphics g = null;
		String text = "";
		Color color = null;
		Font font = null;
		BufferedImage result;

		// test 1
		testSubject = createTestSubject();
		color = null;
		result = testSubject.getStringImage(g, text, color, font);
		Assert.assertEquals(null, result);

		Assert.fail();
	}
}