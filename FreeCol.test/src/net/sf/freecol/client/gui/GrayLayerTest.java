package net.sf.freecol.client.gui;

import java.awt.Graphics;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Player;

@Generated(value = "org.junit-tools-1.1.0")
public class GrayLayerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private GrayLayer createTestSubject() {
		return new GrayLayer(new FreeColClient(new InputStream(), ""));
	}

	@MethodRef(name = "paint", signature = "(QGraphics;)V")
	@Test
	public void paintTest() throws Exception {
		GrayLayer testSubject;
		Graphics g = null;

		// default test
		testSubject = createTestSubject();
		testSubject.paint(g);

		Assert.fail();
	}

	@MethodRef(name = "setPlayer", signature = "(QPlayer;)V")
	@Test
	public void setPlayerTest() throws Exception {
		GrayLayer testSubject;
		Player player = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setPlayer(player);

		Assert.fail();
	}
}