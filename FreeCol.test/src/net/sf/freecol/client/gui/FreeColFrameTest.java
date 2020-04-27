package net.sf.freecol.client.gui;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;

import javax.annotation.Generated;
import javax.swing.JMenuBar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.FreeColClient;

@Generated(value = "org.junit-tools-1.1.0")
public class FreeColFrameTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private FreeColFrame createTestSubject() {
		return new FreeColFrame(new FreeColClient(new InputStream(), ""), new GraphicsDevice(), new JMenuBar(),
				new Canvas(new FreeColClient(new InputStream(), ""), new GraphicsDevice(),
						new SwingGUI(new FreeColClient(new InputStream(), ""), 0), new Dimension(),
						new MapViewer(new FreeColClient(new InputStream(), ""))),
				false, new Rectangle());
	}

	@MethodRef(name = "exitFullScreen", signature = "()V")
	@Test
	public void exitFullScreenTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.exitFullScreen();

		Assert.fail();
	}

	@MethodRef(name = "setInGameMenuBar", signature = "()V")
	@Test
	public void setInGameMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setInGameMenuBar();

		Assert.fail();
	}

	@MethodRef(name = "setMapEditorMenuBar", signature = "()V")
	@Test
	public void setMapEditorMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.setMapEditorMenuBar();

		Assert.fail();
	}

	@MethodRef(name = "removeMenuBar", signature = "()V")
	@Test
	public void removeMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.removeMenuBar();

		Assert.fail();
	}

	@MethodRef(name = "resetMenuBar", signature = "()V")
	@Test
	public void resetMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.resetMenuBar();

		Assert.fail();
	}

	@MethodRef(name = "updateMenuBar", signature = "()V")
	@Test
	public void updateMenuBarTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateMenuBar();

		Assert.fail();
	}

	@MethodRef(name = "getFrameName", signature = "()QString;")
	@Test
	public void getFrameNameTest() throws Exception {
		String result;

		// default test
		result = Whitebox.invokeMethod(FreeColFrame.class, "getFrameName");

		Assert.fail();
	}

	@MethodRef(name = "setCanvas", signature = "()V")
	@Test
	public void setCanvasTest() throws Exception {
		FreeColFrame testSubject;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "setCanvas");

		Assert.fail();
	}
}