package net.sf.freecol.client.gui;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class CanvasTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private Canvas createTestSubject() {
		return new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
				new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
				new MapViewer(new FreeColClient(new InputStream(), "")));
	}

	@MethodRef(name = "isWindowed", signature = "()Z")
	@Test
	public void isWindowedTest() throws Exception {
		Canvas testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isWindowed");

		Assert.fail();
	}

	@MethodRef(name = "changeWindowedMode", signature = "()V")
	@Test
	public void changeWindowedModeTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "changeWindowedMode");

		Assert.fail();
	}

	@MethodRef(name = "createFrame", signature = "(QJMenuBar;QRectangle;)V")
	@Test
	public void createFrameTest() throws Exception {
		Canvas testSubject;
		JMenuBar menuBar = null;
		Rectangle windowBounds = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "createFrame", new Object[] { JMenuBar.class, Rectangle.class });

		Assert.fail();
	}

	@MethodRef(name = "startMapEditorGUI", signature = "()V")
	@Test
	public void startMapEditorGUITest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "startMapEditorGUI");

		Assert.fail();
	}

	@MethodRef(name = "quit", signature = "()V")
	@Test
	public void quitTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "quit");

		Assert.fail();
	}

	@MethodRef(name = "initializeInGame", signature = "()V")
	@Test
	public void initializeInGameTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "initializeInGame");

		Assert.fail();
	}

	@MethodRef(name = "resetMenuBar", signature = "()V")
	@Test
	public void resetMenuBarTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "resetMenuBar");

		Assert.fail();
	}

	@MethodRef(name = "updateMenuBar", signature = "()V")
	@Test
	public void updateMenuBarTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateMenuBar");

		Assert.fail();
	}

	@MethodRef(name = "scrollMap", signature = "(QDirection;)Z")
	@Test
	public void scrollMapTest() throws Exception {
		Canvas testSubject;
		Direction direction = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "scrollMap", new Object[] { Direction.class });

		Assert.fail();
	}

	@MethodRef(name = "convertToMapTile", signature = "(II)QTile;")
	@Test
	public void convertToMapTileTest() throws Exception {
		Canvas testSubject;
		int x = 0;
		int y = 0;
		Tile result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "convertToMapTile", new Object[] { x, y });

		Assert.fail();
	}

	@MethodRef(name = "getViewMode", signature = "()I")
	@Test
	public void getViewModeTest() throws Exception {
		Canvas testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getViewMode();

		Assert.fail();
	}

	@MethodRef(name = "getActiveUnit", signature = "()QUnit;")
	@Test
	public void getActiveUnitTest() throws Exception {
		Canvas testSubject;
		Unit result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getActiveUnit");

		Assert.fail();
	}

	@MethodRef(name = "setCurrentPath", signature = "(QPathNode;)V")
	@Test
	public void setCurrentPathTest() throws Exception {
		Canvas testSubject;
		PathNode path = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setCurrentPath", new Object[] { PathNode.class });

		Assert.fail();
	}

	@MethodRef(name = "updateCurrentPathForActiveUnit", signature = "()V")
	@Test
	public void updateCurrentPathForActiveUnitTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateCurrentPathForActiveUnit");

		Assert.fail();
	}

	@MethodRef(name = "getDragPoint", signature = "()QPoint;")
	@Test
	public void getDragPointTest() throws Exception {
		Canvas testSubject;
		Point result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getDragPoint");

		Assert.fail();
	}

	@MethodRef(name = "setDragPoint", signature = "(II)V")
	@Test
	public void setDragPointTest() throws Exception {
		Canvas testSubject;
		int x = 0;
		int y = 0;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setDragPoint", new Object[] { x, y });

		Assert.fail();
	}

	@MethodRef(name = "isGotoStarted", signature = "()Z")
	@Test
	public void isGotoStartedTest() throws Exception {
		Canvas testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isGotoStarted");

		Assert.fail();
	}

	@MethodRef(name = "getGotoPath", signature = "()QPathNode;")
	@Test
	public void getGotoPathTest() throws Exception {
		Canvas testSubject;
		PathNode result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getGotoPath");

		Assert.fail();
	}

	@MethodRef(name = "setGotoPath", signature = "(QPathNode;)V")
	@Test
	public void setGotoPathTest() throws Exception {
		Canvas testSubject;
		PathNode gotoPath = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setGotoPath", new Object[] { PathNode.class });

		Assert.fail();
	}

	@MethodRef(name = "startGoto", signature = "()V")
	@Test
	public void startGotoTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "startGoto");

		Assert.fail();
	}

	@MethodRef(name = "stopGoto", signature = "()V")
	@Test
	public void stopGotoTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "stopGoto");

		Assert.fail();
	}

	@MethodRef(name = "addAsFrame", signature = "(QJComponent;ZQPopupPosition;Z)QJInternalFrame;")
	@Test
	public void addAsFrameTest() throws Exception {
		Canvas testSubject;
		JComponent comp = null;
		boolean toolBox = false;
		PopupPosition popupPosition = null;
		boolean resizable = false;
		JInternalFrame result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "addAsFrame",
				new Object[] { JComponent.class, toolBox, PopupPosition.class, resizable });

		Assert.fail();
	}

	@MethodRef(name = "addCentered", signature = "(QComponent;QInteger;)V")
	@Test
	public void addCenteredTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Integer i = 0;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addCentered", new Object[] { Component.class, i });

		Assert.fail();
	}

	@MethodRef(name = "addToCanvas", signature = "(QComponent;QInteger;)V")
	@Test
	public void addToCanvasTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Integer i = 0;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addToCanvas", new Object[] { Component.class, i });

		Assert.fail();
	}

	@MethodRef(name = "chooseLocation", signature = "(QComponent;IIQPopupPosition;)QPoint;")
	@Test
	public void chooseLocationTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		int width = 0;
		int height = 0;
		PopupPosition popupPosition = null;
		Point result;

		// test 1
		testSubject = createTestSubject();
		popupPosition = null;
		result = Whitebox.invokeMethod(testSubject, "chooseLocation",
				new Object[] { Component.class, width, height, PopupPosition.class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "createKeyBindings", signature = "()V")
	@Test
	public void createKeyBindingsTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "createKeyBindings");

		Assert.fail();
	}

	@MethodRef(name = "getClearSpace", signature = "(IIIII)QPoint;")
	@Test
	public void getClearSpaceTest() throws Exception {
		Canvas testSubject;
		int x = 0;
		int y = 0;
		int w = 0;
		int h = 0;
		int tries = 0;
		Point result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getClearSpace", new Object[] { x, y, w, h, tries });

		Assert.fail();
	}

	@MethodRef(name = "getColonyPanel", signature = "(QColony;)QColonyPanel;")
	@Test
	public void getColonyPanelTest() throws Exception {
		Canvas testSubject;
		Colony colony = null;
		ColonyPanel result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getColonyPanel", new Object[] { Colony.class });

		Assert.fail();
	}

	@MethodRef(name = "getInternalFrame", signature = "(QComponent;)QJInternalFrame;")
	@Test
	public void getInternalFrameTest() throws Exception {
		Canvas testSubject;
		Component c = null;
		JInternalFrame result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getInternalFrame", new Object[] { Component.class });

		Assert.fail();
	}

	@MethodRef(name = "setOffsetFocus", signature = "(QTile;)QPopupPosition;")
	@Test
	public void setOffsetFocusTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;
		PopupPosition result;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		result = Whitebox.invokeMethod(testSubject, "setOffsetFocus", new Object[] { Tile.class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "getSavedPosition", signature = "(QComponent;)QPoint;")
	@Test
	public void getSavedPositionTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Point result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getSavedPosition", new Object[] { Component.class });

		Assert.fail();
	}

	@MethodRef(name = "getSavedSize", signature = "(QComponent;)QDimension;")
	@Test
	public void getSavedSizeTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Dimension result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getSavedSize", new Object[] { Component.class });

		Assert.fail();
	}

	@MethodRef(name = "getFileFilters", signature = "()[QFileFilter;")
	@Test
	public void getFileFiltersTest() throws Exception {
		Canvas testSubject;
		FileFilter[] result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getFileFilters");

		Assert.fail();
	}

	@MethodRef(name = "notifyClose", signature = "(QComponent;QJInternalFrame;)V")
	@Test
	public void notifyCloseTest() throws Exception {
		Canvas testSubject;
		Component c = null;
		JInternalFrame frame = null;

		// test 1
		testSubject = createTestSubject();
		frame = null;
		Whitebox.invokeMethod(testSubject, "notifyClose", new Object[] { Component.class, JInternalFrame.class });

		Assert.fail();
	}

	@MethodRef(name = "removeEuropeanSubpanels", signature = "()V")
	@Test
	public void removeEuropeanSubpanelsTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "removeEuropeanSubpanels");

		Assert.fail();
	}

	@MethodRef(name = "saveInteger", signature = "(QString;QString;I)V")
	@Test
	public void saveIntegerTest() throws Exception {
		Canvas testSubject;
		String className = "";
		String key = "";
		int value = 0;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "saveInteger", new Object[] { className, key, value });

		Assert.fail();
	}

	@MethodRef(name = "savePosition", signature = "(QComponent;QPoint;)V")
	@Test
	public void savePositionTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Point position = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "savePosition", new Object[] { Component.class, Point.class });

		Assert.fail();
	}

	@MethodRef(name = "saveSize", signature = "(QComponent;QDimension;)V")
	@Test
	public void saveSizeTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Dimension size = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "saveSize", new Object[] { Component.class, Dimension.class });

		Assert.fail();
	}

	@MethodRef(name = "restartBlinking", signature = "()V")
	@Test
	public void restartBlinkingTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "restartBlinking");

		Assert.fail();
	}

	@MethodRef(name = "stopBlinking", signature = "()V")
	@Test
	public void stopBlinkingTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "stopBlinking");

		Assert.fail();
	}

	@MethodRef(name="showFreeColDialog", signature="(QFreeColDialog<QT;>;QTile;)QT;")
	@Test
	public void showFreeColDialogTest() throws Exception {
	Canvas testSubject;FreeColDialog<T> freeColDialog = null;
	Tile tile = null;
	T result;
	
	// default test
	testSubject=createTestSubject();result=Whitebox.invokeMethod(testSubject,"showFreeColDialog", new Object[]{FreeColDialog<T>.class, Tile.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showFreeColPanel", signature = "(QFreeColPanel;QTile;Z)V")
	@Test
	public void showFreeColPanelTest() throws Exception {
		Canvas testSubject;
		FreeColPanel panel = null;
		Tile tile = null;
		boolean resizable = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showFreeColPanel",
				new Object[] { FreeColPanel.class, Tile.class, resizable });

		Assert.fail();
	}

	@MethodRef(name = "showSubPanel", signature = "(QFreeColPanel;Z)V")
	@Test
	public void showSubPanelTest() throws Exception {
		Canvas testSubject;
		FreeColPanel panel = null;
		boolean resizable = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showSubPanel", new Object[] { FreeColPanel.class, resizable });

		Assert.fail();
	}

	@MethodRef(name = "showSubPanel", signature = "(QFreeColPanel;QPopupPosition;Z)V")
	@Test
	public void showSubPanelTest_1() throws Exception {
		Canvas testSubject;
		FreeColPanel panel = null;
		PopupPosition popupPosition = null;
		boolean resizable = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showSubPanel",
				new Object[] { FreeColPanel.class, PopupPosition.class, resizable });

		Assert.fail();
	}

	@MethodRef(name = "add", signature = "(QComponent;)QComponent;")
	@Test
	public void addTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Component result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.add(comp);

		Assert.fail();
	}

	@MethodRef(name = "add", signature = "(QComponent;QInteger;)V")
	@Test
	public void addTest_1() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Integer i = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.add(comp, i);

		Assert.fail();
	}

	@MethodRef(name = "closeMenus", signature = "()V")
	@Test
	public void closeMenusTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "closeMenus");

		Assert.fail();
	}

	@MethodRef(name = "closeMainPanel", signature = "()V")
	@Test
	public void closeMainPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "closeMainPanel");

		Assert.fail();
	}

	@MethodRef(name = "closeStatusPanel", signature = "()V")
	@Test
	public void closeStatusPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "closeStatusPanel");

		Assert.fail();
	}

	@MethodRef(name = "containsInGameComponents", signature = "()Z")
	@Test
	public void containsInGameComponentsTest() throws Exception {
		Canvas testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "containsInGameComponents");

		Assert.fail();
	}

	@MethodRef(name = "displayChatMessage", signature = "(QGUIMessage;)V")
	@Test
	public void displayChatMessageTest() throws Exception {
		Canvas testSubject;
		GUIMessage message = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "displayChatMessage", new Object[] { GUIMessage.class });

		Assert.fail();
	}

	@MethodRef(name="dialogAdd", signature="(QFreeColDialog<*>;)V")
	@Test
	public void dialogAddTest() throws Exception {
	Canvas testSubject;FreeColDialog<?> fcd = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"dialogAdd", new Object[]{FreeColDialog<?>.class});
	
	Assert.fail();
	}

	@MethodRef(name="dialogRemove", signature="(QFreeColDialog<*>;)V")
	@Test
	public void dialogRemoveTest() throws Exception {
	Canvas testSubject;FreeColDialog<?> fcd = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"dialogRemove", new Object[]{FreeColDialog<?>.class});
	
	Assert.fail();
	}

	@MethodRef(name="getExistingFreeColPanel", signature="(QClass<QT;>;)QT;")
	@Test
	public void getExistingFreeColPanelTest() throws Exception {
	Canvas testSubject;Class<T> type = null;
	T result;
	
	// default test
	testSubject=createTestSubject();result=Whitebox.invokeMethod(testSubject,"getExistingFreeColPanel", new Object[]{Class<T>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "getLoadingSavegameDialog", signature = "()QLoadingSavegameDialog;")
	@Test
	public void getLoadingSavegameDialogTest() throws Exception {
		Canvas testSubject;
		LoadingSavegameDialog result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getLoadingSavegameDialog");

		Assert.fail();
	}

	@MethodRef(name = "getShowingSubPanel", signature = "()QComponent;")
	@Test
	public void getShowingSubPanelTest() throws Exception {
		Canvas testSubject;
		Component result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getShowingSubPanel");

		Assert.fail();
	}

	@MethodRef(name = "isClientOptionsDialogShowing", signature = "()Z")
	@Test
	public void isClientOptionsDialogShowingTest() throws Exception {
		Canvas testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isClientOptionsDialogShowing");

		Assert.fail();
	}

	@MethodRef(name = "isMapboardActionsEnabled", signature = "()Z")
	@Test
	public void isMapboardActionsEnabledTest() throws Exception {
		Canvas testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isMapboardActionsEnabled");

		Assert.fail();
	}

	@MethodRef(name = "isShowingSubPanel", signature = "()Z")
	@Test
	public void isShowingSubPanelTest() throws Exception {
		Canvas testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "isShowingSubPanel");

		Assert.fail();
	}

	@MethodRef(name = "refresh", signature = "()V")
	@Test
	public void refreshTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "refresh");

		Assert.fail();
	}

	@MethodRef(name = "removeFromCanvas", signature = "(QComponent;)V")
	@Test
	public void removeFromCanvasTest() throws Exception {
		Canvas testSubject;
		Component comp = null;

		// test 1
		testSubject = createTestSubject();
		comp = null;
		testSubject.removeFromCanvas(comp);

		Assert.fail();
	}

	@MethodRef(name = "removeInGameComponents", signature = "()V")
	@Test
	public void removeInGameComponentsTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "removeInGameComponents");

		Assert.fail();
	}

	@MethodRef(name = "restoreSavedSize", signature = "(QComponent;QDimension;)V")
	@Test
	public void restoreSavedSizeTest() throws Exception {
		Canvas testSubject;
		Component comp = null;
		Dimension d = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "restoreSavedSize", new Object[] { Component.class, Dimension.class });

		Assert.fail();
	}

	@MethodRef(name = "returnToTitle", signature = "()V")
	@Test
	public void returnToTitleTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "returnToTitle");

		Assert.fail();
	}

	@MethodRef(name = "setupMouseListeners", signature = "()V")
	@Test
	public void setupMouseListenersTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setupMouseListeners");

		Assert.fail();
	}

	@MethodRef(name = "updateSizes", signature = "()V")
	@Test
	public void updateSizesTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateSizes");

		Assert.fail();
	}

	@MethodRef(name = "paintComponent", signature = "(QGraphics;)V")
	@Test
	public void paintComponentTest() throws Exception {
		Canvas testSubject;
		Graphics g = null;

		// default test
		testSubject = createTestSubject();
		testSubject.paintComponent(g);

		Assert.fail();
	}

	@MethodRef(name = "remove", signature = "(QComponent;)V")
	@Test
	public void removeTest() throws Exception {
		Canvas testSubject;
		Component comp = null;

		// default test
		testSubject = createTestSubject();
		testSubject.remove(comp);

		Assert.fail();
	}

	@MethodRef(name = "refreshPlayersTable", signature = "()V")
	@Test
	public void refreshPlayersTableTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "refreshPlayersTable");

		Assert.fail();
	}

	@MethodRef(name = "updateGameOptions", signature = "()V")
	@Test
	public void updateGameOptionsTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateGameOptions");

		Assert.fail();
	}

	@MethodRef(name = "updateMapGeneratorOptions", signature = "()V")
	@Test
	public void updateMapGeneratorOptionsTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateMapGeneratorOptions");

		Assert.fail();
	}

	@MethodRef(name="showChoiceDialog", signature="(QTile;QObject;QImageIcon;QString;QList<QChoiceItem<QT;>;>;)QT;")
	@Test
	public void showChoiceDialogTest() throws Exception {
	Canvas testSubject;Tile tile = null;
	Object obj = null;
	ImageIcon icon = null;
	String cancelKey = "";
	List<ChoiceItem<T>> choices = null;
	T result;
	
	// default test
	testSubject=createTestSubject();result=Whitebox.invokeMethod(testSubject,"showChoiceDialog", new Object[]{Tile.class, Object.class, ImageIcon.class, cancelKey, List<ChoiceItem<T>>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showConfirmDialog", signature = "(QTile;QObject;QImageIcon;QString;QString;)Z")
	@Test
	public void showConfirmDialogTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;
		Object obj = null;
		ImageIcon icon = null;
		String okKey = "";
		String cancelKey = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showConfirmDialog",
				new Object[] { Tile.class, Object.class, ImageIcon.class, okKey, cancelKey });

		Assert.fail();
	}

	@MethodRef(name = "showInputDialog", signature = "(QTile;QStringTemplate;QString;QString;QString;)QString;")
	@Test
	public void showInputDialogTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;
		StringTemplate template = "";
		String defaultValue = "";
		String okKey = "";
		String cancelKey = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showInputDialog",
				new Object[] { Tile.class, template, defaultValue, okKey, cancelKey });

		Assert.fail();
	}

	@MethodRef(name="viewFreeColDialog", signature="(QFreeColDialog<QT;>;QTile;)V")
	@Test
	public void viewFreeColDialogTest() throws Exception {
	Canvas testSubject;FreeColDialog<T> freeColDialog = null;
	Tile tile = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"viewFreeColDialog", new Object[]{FreeColDialog<T>.class, Tile.class});
	
	Assert.fail();
	}

	@MethodRef(name = "removeTradeRoutePanel", signature = "(QTradeRoutePanel;)V")
	@Test
	public void removeTradeRoutePanelTest() throws Exception {
		Canvas testSubject;
		TradeRoutePanel panel = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "removeTradeRoutePanel", new Object[] { TradeRoutePanel.class });

		Assert.fail();
	}

	@MethodRef(name = "showAboutPanel", signature = "()V")
	@Test
	public void showAboutPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showAboutPanel");

		Assert.fail();
	}

	@MethodRef(name = "showBuildQueuePanel", signature = "(QColony;)V")
	@Test
	public void showBuildQueuePanelTest() throws Exception {
		Canvas testSubject;
		Colony colony = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showBuildQueuePanel", new Object[] { Colony.class });

		Assert.fail();
	}

	@MethodRef(name = "showBuildQueuePanel", signature = "(QColony;QRunnable;)V")
	@Test
	public void showBuildQueuePanelTest_1() throws Exception {
		Canvas testSubject;
		Colony colony = null;
		Runnable callBack = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showBuildQueuePanel", new Object[] { Colony.class, Runnable.class });

		Assert.fail();
	}

	@MethodRef(name="showCaptureGoodsDialog", signature="(QUnit;QList<QGoods;>;QDialogHandler<QList<QGoods;>;>;)V")
	@Test
	public void showCaptureGoodsDialogTest() throws Exception {
	Canvas testSubject;Unit unit = null;
	List<Goods> gl = null;
	DialogHandler<List<Goods>> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showCaptureGoodsDialog", new Object[]{Unit.class, List<Goods>.class, DialogHandler<List<Goods>>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showChatPanel", signature = "()V")
	@Test
	public void showChatPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showChatPanel");

		Assert.fail();
	}

	@MethodRef(name="showChooseFoundingFatherDialog", signature="(QList<QFoundingFather;>;QDialogHandler<QFoundingFather;>;)V")
	@Test
	public void showChooseFoundingFatherDialogTest() throws Exception {
	Canvas testSubject;List<FoundingFather> ffs = null;
	DialogHandler<FoundingFather> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showChooseFoundingFatherDialog", new Object[]{List<FoundingFather>.class, DialogHandler<FoundingFather>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showClientOptionsDialog", signature = "()QOptionGroup;")
	@Test
	public void showClientOptionsDialogTest() throws Exception {
		Canvas testSubject;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showClientOptionsDialog");

		Assert.fail();
	}

	@MethodRef(name = "showColonyPanel", signature = "(QColony;QUnit;)QColonyPanel;")
	@Test
	public void showColonyPanelTest() throws Exception {
		Canvas testSubject;
		Colony colony = null;
		Unit unit = null;
		ColonyPanel result;

		// test 1
		testSubject = createTestSubject();
		unit = null;
		result = testSubject.showColonyPanel(colony, unit);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "showColopediaPanel", signature = "(QString;)V")
	@Test
	public void showColopediaPanelTest() throws Exception {
		Canvas testSubject;
		String nodeId = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showColopediaPanel", new Object[] { nodeId });

		Assert.fail();
	}

	@MethodRef(name = "showColorChooserPanel", signature = "(QActionListener;)QColorChooserPanel;")
	@Test
	public void showColorChooserPanelTest() throws Exception {
		Canvas testSubject;
		ActionListener al = null;
		ColorChooserPanel result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showColorChooserPanel", new Object[] { ActionListener.class });

		Assert.fail();
	}

	@MethodRef(name = "showCompactLabourReport", signature = "()V")
	@Test
	public void showCompactLabourReportTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showCompactLabourReport");

		Assert.fail();
	}

	@MethodRef(name = "showCompactLabourReport", signature = "(QUnitData;)V")
	@Test
	public void showCompactLabourReportTest_1() throws Exception {
		Canvas testSubject;
		UnitData unitData = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showCompactLabourReport", new Object[] { UnitData.class });

		Assert.fail();
	}

	@MethodRef(name = "showConfirmDeclarationDialog", signature = "()QList<QString;>;")
	@Test
	public void showConfirmDeclarationDialogTest() throws Exception {
		Canvas testSubject;
		List<String> result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showConfirmDeclarationDialog");

		Assert.fail();
	}

	@MethodRef(name = "showDeclarationPanel", signature = "()V")
	@Test
	public void showDeclarationPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showDeclarationPanel");

		Assert.fail();
	}

	@MethodRef(name = "showDifficultyDialog", signature = "(QSpecification;QOptionGroup;Z)QOptionGroup;")
	@Test
	public void showDifficultyDialogTest() throws Exception {
		Canvas testSubject;
		Specification spec = null;
		OptionGroup group = null;
		boolean editable = false;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showDifficultyDialog",
				new Object[] { Specification.class, OptionGroup.class, editable });

		Assert.fail();
	}

	@MethodRef(name="showDumpCargoDialog", signature="(QUnit;QDialogHandler<QList<QGoods;>;>;)V")
	@Test
	public void showDumpCargoDialogTest() throws Exception {
	Canvas testSubject;Unit unit = null;
	DialogHandler<List<Goods>> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showDumpCargoDialog", new Object[]{Unit.class, DialogHandler<List<Goods>>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showEditOptionDialog", signature = "(QOption;)Z")
	@Test
	public void showEditOptionDialogTest() throws Exception {
		Canvas testSubject;
		Option option = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showEditOptionDialog", new Object[] { Option.class });

		Assert.fail();
	}

	@MethodRef(name = "showEditSettlementDialog", signature = "(QIndianSettlement;)V")
	@Test
	public void showEditSettlementDialogTest() throws Exception {
		Canvas testSubject;
		IndianSettlement settlement = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showEditSettlementDialog", new Object[] { IndianSettlement.class });

		Assert.fail();
	}

	@MethodRef(name="showEmigrationDialog", signature="(QPlayer;ZQDialogHandler<QInteger;>;)V")
	@Test
	public void showEmigrationDialogTest() throws Exception {
	Canvas testSubject;Player player = null;
	boolean fountainOfYouth = false;
	DialogHandler<Integer> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showEmigrationDialog", new Object[]{Player.class, fountainOfYouth, DialogHandler<Integer>.class});
	
	Assert.fail();
	}

	@MethodRef(name="showEndTurnDialog", signature="(QList<QUnit;>;QDialogHandler<QBoolean;>;)V")
	@Test
	public void showEndTurnDialogTest() throws Exception {
	Canvas testSubject;List<Unit> units = null;
	DialogHandler<Boolean> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showEndTurnDialog", new Object[]{List<Unit>.class, DialogHandler<Boolean>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showErrorMessage", signature = "(QString;)V")
	@Test
	public void showErrorMessageTest() throws Exception {
		Canvas testSubject;
		String messageId = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showErrorMessage", new Object[] { messageId });

		Assert.fail();
	}

	@MethodRef(name = "showErrorMessage", signature = "(QString;QString;)V")
	@Test
	public void showErrorMessageTest_1() throws Exception {
		Canvas testSubject;
		String messageId = "";
		String message = "";

		// test 1
		testSubject = createTestSubject();
		messageId = null;
		Whitebox.invokeMethod(testSubject, "showErrorMessage", new Object[] { messageId, message });

		// test 2
		testSubject = createTestSubject();
		messageId = "";
		Whitebox.invokeMethod(testSubject, "showErrorMessage", new Object[] { messageId, message });

		Assert.fail();
	}

	@MethodRef(name = "showEuropePanel", signature = "()V")
	@Test
	public void showEuropePanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showEuropePanel");

		Assert.fail();
	}

	@MethodRef(name = "showEventPanel", signature = "(QString;QString;QString;)V")
	@Test
	public void showEventPanelTest() throws Exception {
		Canvas testSubject;
		String header = "";
		String image = "";
		String footer = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showEventPanel", new Object[] { header, image, footer });

		Assert.fail();
	}

	@MethodRef(name = "showFindSettlementPanel", signature = "()V")
	@Test
	public void showFindSettlementPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showFindSettlementPanel");

		Assert.fail();
	}

	@MethodRef(name="showFirstContactDialog", signature="(QPlayer;QPlayer;QTile;IQDialogHandler<QBoolean;>;)V")
	@Test
	public void showFirstContactDialogTest() throws Exception {
	Canvas testSubject;Player player = null;
	Player other = null;
	Tile tile = null;
	int settlementCount = 0;
	DialogHandler<Boolean> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showFirstContactDialog", new Object[]{Player.class, Player.class, Tile.class, settlementCount, DialogHandler<Boolean>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showForeignColony", signature = "(QSettlement;)V")
	@Test
	public void showForeignColonyTest() throws Exception {
		Canvas testSubject;
		Settlement settlement = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showForeignColony", new Object[] { Settlement.class });

		Assert.fail();
	}

	@MethodRef(name = "showGameOptionsDialog", signature = "(ZZ)QOptionGroup;")
	@Test
	public void showGameOptionsDialogTest() throws Exception {
		Canvas testSubject;
		boolean editable = false;
		boolean custom = false;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showGameOptionsDialog", new Object[] { editable, custom });

		Assert.fail();
	}

	@MethodRef(name="showHighScoresPanel", signature="(QString;QList<QHighScore;>;)V")
	@Test
	public void showHighScoresPanelTest() throws Exception {
	Canvas testSubject;String messageId = "";
	List<HighScore> scores = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showHighScoresPanel", new Object[]{messageId, List<HighScore>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showIndianSettlementPanel", signature = "(QIndianSettlement;)V")
	@Test
	public void showIndianSettlementPanelTest() throws Exception {
		Canvas testSubject;
		IndianSettlement indianSettlement = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showIndianSettlementPanel", new Object[] { IndianSettlement.class });

		Assert.fail();
	}

	@MethodRef(name = "createImageIcon", signature = "(QImage;)QImageIcon;")
	@Test
	public void createImageIconTest() throws Exception {
		Image image = null;
		ImageIcon result;

		// default test
		result = Whitebox.invokeMethod(Canvas.class, "createImageIcon", new Object[] { Image.class });

		Assert.fail();
	}

	@MethodRef(name = "createObjectImageIcon", signature = "(QFreeColObject;)QImageIcon;")
	@Test
	public void createObjectImageIconTest() throws Exception {
		Canvas testSubject;
		FreeColObject display = null;
		ImageIcon result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "createObjectImageIcon", new Object[] { FreeColObject.class });

		Assert.fail();
	}

	@MethodRef(name = "showInformationMessage", signature = "(QFreeColObject;QStringTemplate;)V")
	@Test
	public void showInformationMessageTest() throws Exception {
		Canvas testSubject;
		FreeColObject displayObject = null;
		StringTemplate template = "";

		// test 1
		testSubject = createTestSubject();
		displayObject = null;
		Whitebox.invokeMethod(testSubject, "showInformationMessage", new Object[] { FreeColObject.class, template });

		Assert.fail();
	}

	@MethodRef(name = "showInformationMessage", signature = "(QFreeColObject;QTile;QImageIcon;QStringTemplate;)V")
	@Test
	public void showInformationMessageTest_1() throws Exception {
		Canvas testSubject;
		FreeColObject displayObject = null;
		Tile tile = null;
		ImageIcon icon = null;
		StringTemplate template = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showInformationMessage",
				new Object[] { FreeColObject.class, Tile.class, ImageIcon.class, template });

		Assert.fail();
	}

	@MethodRef(name = "showLoadDialog", signature = "(QFile;[QFileFilter;)QFile;")
	@Test
	public void showLoadDialogTest() throws Exception {
		Canvas testSubject;
		File directory = null;
		FileFilter[] filters = new FileFilter[] { null };
		File result;

		// test 1
		testSubject = createTestSubject();
		filters = null;
		result = Whitebox.invokeMethod(testSubject, "showLoadDialog", new Object[] { File.class, FileFilter[].class });
		Assert.assertEquals(null, result);

		// test 2
		testSubject = createTestSubject();
		filters = new FileFilter[] { null };
		result = Whitebox.invokeMethod(testSubject, "showLoadDialog", new Object[] { File.class, FileFilter[].class });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "showLoadingSavegameDialog", signature = "(ZZ)Z")
	@Test
	public void showLoadingSavegameDialogTest() throws Exception {
		Canvas testSubject;
		boolean publicServer = false;
		boolean singlePlayer = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showLoadingSavegameDialog",
				new Object[] { publicServer, singlePlayer });

		Assert.fail();
	}

	@MethodRef(name = "showLogFilePanel", signature = "()V")
	@Test
	public void showLogFilePanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showLogFilePanel");

		Assert.fail();
	}

	@MethodRef(name = "showMainPanel", signature = "(QString;)V")
	@Test
	public void showMainPanelTest() throws Exception {
		Canvas testSubject;
		String userMsg = "";

		// test 1
		testSubject = createTestSubject();
		userMsg = null;
		Whitebox.invokeMethod(testSubject, "showMainPanel", new Object[] { userMsg });

		// test 2
		testSubject = createTestSubject();
		userMsg = "";
		Whitebox.invokeMethod(testSubject, "showMainPanel", new Object[] { userMsg });

		Assert.fail();
	}

	@MethodRef(name = "showMapEditorTransformPanel", signature = "()V")
	@Test
	public void showMapEditorTransformPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showMapEditorTransformPanel");

		Assert.fail();
	}

	@MethodRef(name = "showMapGeneratorOptionsDialog", signature = "(Z)QOptionGroup;")
	@Test
	public void showMapGeneratorOptionsDialogTest() throws Exception {
		Canvas testSubject;
		boolean editable = false;
		OptionGroup result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showMapGeneratorOptionsDialog", new Object[] { editable });

		Assert.fail();
	}

	@MethodRef(name = "showMapSizeDialog", signature = "()QDimension;")
	@Test
	public void showMapSizeDialogTest() throws Exception {
		Canvas testSubject;
		Dimension result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showMapSizeDialog");

		Assert.fail();
	}

	@MethodRef(name="showModelMessages", signature="(QList<QModelMessage;>;)V")
	@Test
	public void showModelMessagesTest() throws Exception {
	Canvas testSubject;List<ModelMessage> messages = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showModelMessages", new Object[]{List<ModelMessage>.class});
	
	Assert.fail();
	}

	@MethodRef(name="showMonarchDialog", signature="(QMonarchAction;QStringTemplate;QString;QDialogHandler<QBoolean;>;)V")
	@Test
	public void showMonarchDialogTest() throws Exception {
	Canvas testSubject;MonarchAction action = null;
	StringTemplate template = "";
	String monarchKey = "";
	DialogHandler<Boolean> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showMonarchDialog", new Object[]{MonarchAction.class, template, monarchKey, DialogHandler<Boolean>.class});
	
	Assert.fail();
	}

	@MethodRef(name="showNamingDialog", signature="(QStringTemplate;QString;QUnit;QDialogHandler<QString;>;)V")
	@Test
	public void showNamingDialogTest() throws Exception {
	Canvas testSubject;StringTemplate template = "";
	String defaultName = "";
	Unit unit = null;
	DialogHandler<String> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showNamingDialog", new Object[]{template, defaultName, Unit.class, DialogHandler<String>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showNegotiationDialog", signature = "(QFreeColGameObject;QFreeColGameObject;QDiplomaticTrade;QStringTemplate;)QDiplomaticTrade;")
	@Test
	public void showNegotiationDialogTest() throws Exception {
		Canvas testSubject;
		FreeColGameObject our = null;
		FreeColGameObject other = null;
		DiplomaticTrade agreement = null;
		StringTemplate comment = "";
		DiplomaticTrade result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showNegotiationDialog",
				new Object[] { FreeColGameObject.class, FreeColGameObject.class, DiplomaticTrade.class, comment });

		Assert.fail();
	}

	@MethodRef(name = "showNewPanel", signature = "(QSpecification;)V")
	@Test
	public void showNewPanelTest() throws Exception {
		Canvas testSubject;
		Specification specification = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showNewPanel", new Object[] { Specification.class });

		Assert.fail();
	}

	@MethodRef(name = "showVideoComponent", signature = "(QComponent;QMouseListener;QKeyListener;)V")
	@Test
	public void showVideoComponentTest() throws Exception {
		Canvas testSubject;
		Component vp = null;
		MouseListener ml = null;
		KeyListener kl = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showVideoComponent",
				new Object[] { Component.class, MouseListener.class, KeyListener.class });

		Assert.fail();
	}

	@MethodRef(name = "showParametersDialog", signature = "()QParameters;")
	@Test
	public void showParametersDialogTest() throws Exception {
		Canvas testSubject;
		Parameters result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showParametersDialog");

		Assert.fail();
	}

	@MethodRef(name = "showPreCombatDialog", signature = "(QUnit;QFreeColGameObject;QTile;)Z")
	@Test
	public void showPreCombatDialogTest() throws Exception {
		Canvas testSubject;
		Unit attacker = null;
		FreeColGameObject defender = null;
		Tile tile = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showPreCombatDialog",
				new Object[] { Unit.class, FreeColGameObject.class, Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "showPurchasePanel", signature = "()V")
	@Test
	public void showPurchasePanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showPurchasePanel");

		Assert.fail();
	}

	@MethodRef(name = "showRecruitPanel", signature = "()V")
	@Test
	public void showRecruitPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showRecruitPanel");

		Assert.fail();
	}

	@MethodRef(name="showReportLabourDetailPanel", signature="(QUnitType;QMap<QUnitType;QMap<QLocation;QInteger;>;>;QTypeCountMap<QUnitType;>;QList<QColony;>;)V")
	@Test
	public void showReportLabourDetailPanelTest() throws Exception {
	Canvas testSubject;UnitType unitType = null;
	Map<UnitType,Map<Location,Integer>> data = null;
	TypeCountMap<UnitType> unitCount = null;
	List<Colony> colonies = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showReportLabourDetailPanel", new Object[]{UnitType.class, Map<UnitType,Map<Location,Integer>>.class, TypeCountMap<UnitType>.class, List<Colony>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showRiverStyleDialog", signature = "(QTile;)QString;")
	@Test
	public void showRiverStyleDialogTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showRiverStyleDialog", new Object[] { Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "showSaveDialog", signature = "(QFile;[QFileFilter;QString;)QFile;")
	@Test
	public void showSaveDialogTest() throws Exception {
		Canvas testSubject;
		File directory = null;
		FileFilter[] filters = new FileFilter[] { null };
		String defaultName = "";
		File result;

		// test 1
		testSubject = createTestSubject();
		filters = null;
		result = testSubject.showSaveDialog(directory, filters, defaultName);
		Assert.assertEquals(null, result);

		// test 2
		testSubject = createTestSubject();
		filters = new FileFilter[] { null };
		result = testSubject.showSaveDialog(directory, filters, defaultName);
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	@MethodRef(name = "showScaleMapSizeDialog", signature = "()QDimension;")
	@Test
	public void showScaleMapSizeDialogTest() throws Exception {
		Canvas testSubject;
		Dimension result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showScaleMapSizeDialog");

		Assert.fail();
	}

	@MethodRef(name = "showSelectAmountDialog", signature = "(QGoodsType;IIZ)I")
	@Test
	public void showSelectAmountDialogTest() throws Exception {
		Canvas testSubject;
		GoodsType goodsType = null;
		int available = 0;
		int defaultAmount = 0;
		boolean needToPay = false;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showSelectAmountDialog",
				new Object[] { GoodsType.class, available, defaultAmount, needToPay });

		Assert.fail();
	}

	@MethodRef(name = "showSelectTributeAmountDialog", signature = "(QStringTemplate;I)I")
	@Test
	public void showSelectTributeAmountDialogTest() throws Exception {
		Canvas testSubject;
		StringTemplate question = "";
		int maximum = 0;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showSelectTributeAmountDialog",
				new Object[] { question, maximum });

		Assert.fail();
	}

	@MethodRef(name = "showSelectDestinationDialog", signature = "(QUnit;)QLocation;")
	@Test
	public void showSelectDestinationDialogTest() throws Exception {
		Canvas testSubject;
		Unit unit = null;
		Location result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showSelectDestinationDialog", new Object[] { Unit.class });

		Assert.fail();
	}

	@MethodRef(name="showServerListPanel", signature="(QList<QServerInfo;>;)V")
	@Test
	public void showServerListPanelTest() throws Exception {
	Canvas testSubject;List<ServerInfo> serverList = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showServerListPanel", new Object[]{List<ServerInfo>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showSpyColonyPanel", signature = "(QTile;)QColonyPanel;")
	@Test
	public void showSpyColonyPanelTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;
		ColonyPanel result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showSpyColonyPanel", new Object[] { Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "showStartGamePanel", signature = "(QGame;QPlayer;Z)V")
	@Test
	public void showStartGamePanelTest() throws Exception {
		Canvas testSubject;
		Game game = null;
		Player player = null;
		boolean singlePlayerMode = false;

		// test 1
		testSubject = createTestSubject();
		game = null;
		Whitebox.invokeMethod(testSubject, "showStartGamePanel",
				new Object[] { Game.class, Player.class, singlePlayerMode });

		// test 2
		testSubject = createTestSubject();
		player = null;
		Whitebox.invokeMethod(testSubject, "showStartGamePanel",
				new Object[] { Game.class, Player.class, singlePlayerMode });

		Assert.fail();
	}

	@MethodRef(name = "showStatisticsPanel", signature = "()V")
	@Test
	public void showStatisticsPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showStatisticsPanel");

		Assert.fail();
	}

	@MethodRef(name = "showStatusPanel", signature = "(QString;)V")
	@Test
	public void showStatusPanelTest() throws Exception {
		Canvas testSubject;
		String message = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showStatusPanel", new Object[] { message });

		Assert.fail();
	}

	@MethodRef(name = "showTilePanel", signature = "(QTile;)V")
	@Test
	public void showTilePanelTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		Whitebox.invokeMethod(testSubject, "showTilePanel", new Object[] { Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "showTilePopup", signature = "(QTile;II)V")
	@Test
	public void showTilePopupTest() throws Exception {
		Canvas testSubject;
		Tile tile = null;
		int x = 0;
		int y = 0;

		// test 1
		testSubject = createTestSubject();
		tile = null;
		Whitebox.invokeMethod(testSubject, "showTilePopup", new Object[] { Tile.class, x, y });

		Assert.fail();
	}

	@MethodRef(name = "showTradeRoutePanel", signature = "(QUnit;)V")
	@Test
	public void showTradeRoutePanelTest() throws Exception {
		Canvas testSubject;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showTradeRoutePanel", new Object[] { Unit.class });

		Assert.fail();
	}

	@MethodRef(name = "showTradeRouteInputPanel", signature = "(QTradeRoute;QRunnable;)V")
	@Test
	public void showTradeRouteInputPanelTest() throws Exception {
		Canvas testSubject;
		TradeRoute newRoute = null;
		Runnable callBack = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showTradeRouteInputPanel",
				new Object[] { TradeRoute.class, Runnable.class });

		Assert.fail();
	}

	@MethodRef(name = "showTrainPanel", signature = "()V")
	@Test
	public void showTrainPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showTrainPanel");

		Assert.fail();
	}

	@MethodRef(name="showVictoryDialog", signature="(QDialogHandler<QBoolean;>;)V")
	@Test
	public void showVictoryDialogTest() throws Exception {
	Canvas testSubject;DialogHandler<Boolean> handler = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showVictoryDialog", new Object[]{DialogHandler<Boolean>.class});
	
	Assert.fail();
	}

	@MethodRef(name = "showWarehouseDialog", signature = "(QColony;)Z")
	@Test
	public void showWarehouseDialogTest() throws Exception {
		Canvas testSubject;
		Colony colony = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "showWarehouseDialog", new Object[] { Colony.class });

		Assert.fail();
	}

	@MethodRef(name = "showWorkProductionPanel", signature = "(QUnit;)V")
	@Test
	public void showWorkProductionPanelTest() throws Exception {
		Canvas testSubject;
		Unit unit = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showWorkProductionPanel", new Object[] { Unit.class });

		Assert.fail();
	}

	@MethodRef(name = "updateEuropeanSubpanels", signature = "()V")
	@Test
	public void updateEuropeanSubpanelsTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "updateEuropeanSubpanels");

		Assert.fail();
	}

	@MethodRef(name = "showReportCargoPanel", signature = "()V")
	@Test
	public void showReportCargoPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportCargoPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportColonyPanel", signature = "()V")
	@Test
	public void showReportColonyPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportColonyPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportContinentalCongressPanel", signature = "()V")
	@Test
	public void showReportContinentalCongressPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportContinentalCongressPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportEducationPanel", signature = "()V")
	@Test
	public void showReportEducationPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportEducationPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportExplorationPanel", signature = "()V")
	@Test
	public void showReportExplorationPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportExplorationPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportForeignAffairPanel", signature = "()V")
	@Test
	public void showReportForeignAffairPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportForeignAffairPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportHistoryPanel", signature = "()V")
	@Test
	public void showReportHistoryPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportHistoryPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportIndianPanel", signature = "()V")
	@Test
	public void showReportIndianPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportIndianPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportLabourPanel", signature = "()V")
	@Test
	public void showReportLabourPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportLabourPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportMilitaryPanel", signature = "()V")
	@Test
	public void showReportMilitaryPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportMilitaryPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportNavalPanel", signature = "()V")
	@Test
	public void showReportNavalPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportNavalPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportProductionPanel", signature = "()V")
	@Test
	public void showReportProductionPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportProductionPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportReligiousPanel", signature = "()V")
	@Test
	public void showReportReligiousPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportReligiousPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportRequirementsPanel", signature = "()V")
	@Test
	public void showReportRequirementsPanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportRequirementsPanel");

		Assert.fail();
	}

	@MethodRef(name = "showReportTradePanel", signature = "()V")
	@Test
	public void showReportTradePanelTest() throws Exception {
		Canvas testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "showReportTradePanel");

		Assert.fail();
	}

	@MethodRef(name="showReportTurnPanel", signature="(QList<QModelMessage;>;)V")
	@Test
	public void showReportTurnPanelTest() throws Exception {
	Canvas testSubject;List<ModelMessage> messages = null;
	
	
	// default test
	testSubject=createTestSubject();Whitebox.invokeMethod(testSubject,"showReportTurnPanel", new Object[]{List<ModelMessage>.class});
	
	Assert.fail();
	}
}