package net.sf.freecol.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.common.io.FreeColModFile;
import net.sf.freecol.common.io.FreeColSavegameFile;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.ModelMessage;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.option.BooleanOption;

@Generated(value = "org.junit-tools-1.1.0")
public class ClientOptionsTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private ClientOptions createTestSubject() {
		return new ClientOptions();
	}

	@MethodRef(name = "load", signature = "(QFreeColXMLReader;)Z")
	@Test
	public void loadTest() throws Exception {
		ClientOptions testSubject;
		FreeColXMLReader xr = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		xr = null;
		result = Whitebox.invokeMethod(testSubject, "load", new Object[] { FreeColXMLReader.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	@MethodRef(name = "load", signature = "(QBufferedInputStream;)Z")
	@Test
	public void loadTest_1() throws Exception {
		ClientOptions testSubject;
		BufferedInputStream bis = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		bis = null;
		result = Whitebox.invokeMethod(testSubject, "load", new Object[] { BufferedInputStream.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	@MethodRef(name = "load", signature = "(QInputStream;)Z")
	@Test
	public void loadTest_2() throws Exception {
		ClientOptions testSubject;
		InputStream is = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "load", new Object[] { InputStream.class });

		Assert.fail();
	}

	@MethodRef(name = "load", signature = "(QFile;)Z")
	@Test
	public void loadTest_3() throws Exception {
		ClientOptions testSubject;
		File file = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		file = null;
		result = testSubject.load(file);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	@MethodRef(name = "merge", signature = "(QFile;)Z")
	@Test
	public void mergeTest() throws Exception {
		ClientOptions testSubject;
		File file = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.merge(file);

		Assert.fail();
	}

	@MethodRef(name = "load", signature = "(QFreeColSavegameFile;)Z")
	@Test
	public void loadTest_4() throws Exception {
		ClientOptions testSubject;
		FreeColSavegameFile save = null;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		save = null;
		result = Whitebox.invokeMethod(testSubject, "load", new Object[] { FreeColSavegameFile.class });
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	@MethodRef(name = "merge", signature = "(QFreeColSavegameFile;)Z")
	@Test
	public void mergeTest_1() throws Exception {
		ClientOptions testSubject;
		FreeColSavegameFile save = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.merge(save);

		Assert.fail();
	}

	@MethodRef(name = "getActiveMods", signature = "()QList<QFreeColModFile;>;")
	@Test
	public void getActiveModsTest() throws Exception {
		ClientOptions testSubject;
		List<FreeColModFile> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getActiveMods();

		Assert.fail();
	}

	@MethodRef(name = "getLanguageOption", signature = "()QString;")
	@Test
	public void getLanguageOptionTest() throws Exception {
		String result;

		// default test
		result = ClientOptions.getLanguageOption();

		Assert.fail();
	}

	@MethodRef(name = "getDisplayTileText", signature = "()I")
	@Test
	public void getDisplayTileTextTest() throws Exception {
		ClientOptions testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDisplayTileText();

		Assert.fail();
	}

	@MethodRef(name = "getSortedColonies", signature = "(QPlayer;)QList<QColony;>;")
	@Test
	public void getSortedColoniesTest() throws Exception {
		ClientOptions testSubject;
		Player p = null;
		List<Colony> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSortedColonies(p);

		Assert.fail();
	}

	@MethodRef(name = "getColonyComparator", signature = "()QComparator<QColony;>;")
	@Test
	public void getColonyComparatorTest() throws Exception {
		ClientOptions testSubject;
		Comparator<Colony> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getColonyComparator();

		Assert.fail();
	}

	@MethodRef(name = "getColonyComparator", signature = "(I)QComparator<QColony;>;")
	@Test
	public void getColonyComparatorTest_1() throws Exception {
		int type = 0;
		Comparator<Colony> result;

		// default test
		result = ClientOptions.getColonyComparator(type);

		Assert.fail();
	}

	@MethodRef(name = "getModelMessageComparator", signature = "(QGame;)QComparator<QModelMessage;>;")
	@Test
	public void getModelMessageComparatorTest() throws Exception {
		ClientOptions testSubject;
		Game game = null;
		Comparator<ModelMessage> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getModelMessageComparator(game);

		Assert.fail();
	}

	@MethodRef(name = "getBooleanOption", signature = "(QModelMessage;)QBooleanOption;")
	@Test
	public void getBooleanOptionTest() throws Exception {
		ClientOptions testSubject;
		ModelMessage message = null;
		BooleanOption result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBooleanOption(message);

		Assert.fail();
	}

	@MethodRef(name = "fixClientOptions", signature = "()V")
	@Test
	public void fixClientOptionsTest() throws Exception {
		ClientOptions testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.fixClientOptions();

		Assert.fail();
	}

	@MethodRef(name = "addBooleanOption", signature = "(QString;QString;Z)V")
	@Test
	public void addBooleanOptionTest() throws Exception {
		ClientOptions testSubject;
		String id = "";
		String gr = "";
		boolean val = false;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addBooleanOption", new Object[] { id, gr, val });

		Assert.fail();
	}

	@MethodRef(name = "addIntegerOption", signature = "(QString;QString;I)V")
	@Test
	public void addIntegerOptionTest() throws Exception {
		ClientOptions testSubject;
		String id = "";
		String gr = "";
		int val = 0;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addIntegerOption", new Object[] { id, gr, val });

		Assert.fail();
	}

	@MethodRef(name = "addTextOption", signature = "(QString;QString;QString;)V")
	@Test
	public void addTextOptionTest() throws Exception {
		ClientOptions testSubject;
		String id = "";
		String gr = "";
		String val = "";

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "addTextOption", new Object[] { id, gr, val });

		Assert.fail();
	}

	@MethodRef(name = "getXMLElementTagName", signature = "()QString;")
	@Test
	public void getXMLElementTagNameTest() throws Exception {
		String result;

		// default test
		result = ClientOptions.getXMLElementTagName();

		Assert.fail();
	}
}