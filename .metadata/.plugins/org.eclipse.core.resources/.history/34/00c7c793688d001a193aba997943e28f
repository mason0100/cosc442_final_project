package net.sf.freecol.client.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsDevice;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.IndianSettlement;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.TileType;
import net.sf.freecol.common.model.Unit;

@Generated(value = "org.junit-tools-1.1.0")
public class TilePopupTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private TilePopup createTestSubject() {
		return new TilePopup(new FreeColClient(new InputStream(), ""),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))),
				new Tile(new Game(new Specification()), new TileType("", new Specification()), 0, 0));
	}

	@MethodRef(name = "addDebugItems", signature = "(QFreeColClient;QTile;)V")
	@Test
	public void addDebugItemsTest() throws Exception {
		TilePopup testSubject;
		FreeColClient freeColClient = null;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		testSubject.addDebugItems(freeColClient, tile);

		Assert.fail();
	}

	@MethodRef(name = "addUnit", signature = "(QContainer;QUnit;ZZ)I")
	@Test
	public void addUnitTest() throws Exception {
		TilePopup testSubject;
		Container menu = null;
		Unit unit = null;
		boolean enabled = false;
		boolean indent = false;
		int result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "addUnit",
				new Object[] { Container.class, Unit.class, enabled, indent });

		Assert.fail();
	}

	@MethodRef(name = "addColony", signature = "(QColony;)V")
	@Test
	public void addColonyTest() throws Exception {
		TilePopup testSubject;
		Colony colony = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addColony", new Object[] { Colony.class });

		Assert.fail();
	}

	@MethodRef(name = "addIndianSettlement", signature = "(QIndianSettlement;)V")
	@Test
	public void addIndianSettlementTest() throws Exception {
		TilePopup testSubject;
		IndianSettlement settlement = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addIndianSettlement", new Object[] { IndianSettlement.class });

		Assert.fail();
	}

	@MethodRef(name = "addTile", signature = "(QTile;)V")
	@Test
	public void addTileTest() throws Exception {
		TilePopup testSubject;
		Tile tile = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addTile", new Object[] { Tile.class });

		Assert.fail();
	}

	@MethodRef(name = "hasItem", signature = "()Z")
	@Test
	public void hasItemTest() throws Exception {
		TilePopup testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.hasItem();

		Assert.fail();
	}
}