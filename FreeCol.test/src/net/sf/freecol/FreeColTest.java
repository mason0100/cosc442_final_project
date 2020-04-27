package net.sf.freecol;

import java.io.File;
import java.net.JarURLConnection;
import java.util.Locale;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.common.io.FreeColTcFile;
import net.sf.freecol.common.model.NationOptions.Advantages;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.StringTemplate;
import net.sf.freecol.common.option.OptionGroup;

@Generated(value = "org.junit-tools-1.1.0")
public class FreeColTest {

	private FreeCol createTestSubject() {
		return new FreeCol();
	}

	@MethodRef(name = "badLoad", signature = "(QFile;)QStringTemplate;")
	@Test
	public void badLoadTest() throws Exception {
		File file = "null";
		StringTemplate result;

		// default test
		result = FreeCol.badLoad(file);
	}

	@Before
	public void setUp() throws Exception {

	}

	@Before
	public void setUp_1() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Before
	public void setUp_2() throws Exception {

	}

	@After
	public void tearDown_1() throws Exception {

	}

	@Before
	public void setUp_3() throws Exception {

	}

	@After
	public void tearDown_2() throws Exception {

	}

	@MethodRef(name = "main", signature = "([QString;)V")
	@Test
	public void mainTest() throws Exception {
		String[] args = new String[] { "" };

		// default test
		FreeCol.main(args);

		Assert.fail();
	}

	@MethodRef(name = "getJarURLConnection", signature = "(QClass;)QJarURLConnection;")
	@Test
	public void getJarURLConnectionTest() throws Exception {
		Class c = null;
		JarURLConnection result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "getJarURLConnection", new Object[] { Class.class });

		Assert.fail();
	}

	@MethodRef(name = "readVersion", signature = "(QJarURLConnection;)QString;")
	@Test
	public void readVersionTest() throws Exception {
		JarURLConnection juc = null;
		String result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "readVersion", new Object[] { JarURLConnection.class });

		Assert.fail();
	}

	@MethodRef(name = "getDefaultSplashStream", signature = "(QJarURLConnection;)QInputStream;")
	@Test
	public void getDefaultSplashStreamTest() throws Exception {
		JarURLConnection juc = null;
		InputStream result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "getDefaultSplashStream",
				new Object[] { JarURLConnection.class });

		Assert.fail();
	}

	@MethodRef(name = "fatal", signature = "(QStringTemplate;)V")
	@Test
	public void fatalTest() throws Exception {
		StringTemplate template = "";

		// default test
		FreeCol.fatal(template);

		Assert.fail();
	}

	@MethodRef(name = "fatal", signature = "(QString;)V")
	@Test
	public void fatalTest_1() throws Exception {
		String err = "";

		// test 1
		err = null;
		FreeCol.fatal(err);

		// test 2
		err = "";
		FreeCol.fatal(err);

		Assert.fail();
	}

	@MethodRef(name = "gripe", signature = "(QStringTemplate;)V")
	@Test
	public void gripeTest() throws Exception {
		StringTemplate template = "";

		// default test
		FreeCol.gripe(template);

		Assert.fail();
	}

	@MethodRef(name = "gripe", signature = "(QString;)V")
	@Test
	public void gripeTest_1() throws Exception {
		String key = "";

		// default test
		FreeCol.gripe(key);

		Assert.fail();
	}

	@MethodRef(name = "findArg", signature = "(QString;[QString;)QString;")
	@Test
	public void findArgTest() throws Exception {
		String option = "";
		String[] args = new String[] { "" };
		String result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "findArg", new Object[] { option, args });

		Assert.fail();
	}

	@MethodRef(name = "handleArgs", signature = "([QString;)V")
	@Test
	public void handleArgsTest() throws Exception {
		String[] args = new String[] { "" };

		// default test
		Whitebox.invokeMethod(FreeCol.class, "handleArgs", new Object[] { args });

		Assert.fail();
	}

	@MethodRef(name = "printUsage", signature = "(QOptions;I)V")
	@Test
	public void printUsageTest() throws Exception {
		Options options = null;
		int status = 0;

		// default test
		Whitebox.invokeMethod(FreeCol.class, "printUsage", new Object[] { Options.class, status });

		Assert.fail();
	}

	@MethodRef(name = "loadSpecification", signature = "(QFreeColTcFile;QAdvantages;QString;)QSpecification;")
	@Test
	public void loadSpecificationTest() throws Exception {
		FreeColTcFile tcf = null;
		Advantages advantages = null;
		String difficulty = "";
		Specification result;

		// default test
		result = FreeCol.loadSpecification(tcf, advantages, difficulty);

		Assert.fail();
	}

	@MethodRef(name = "getTCSpecification", signature = "()QSpecification;")
	@Test
	public void getTCSpecificationTest() throws Exception {
		Specification result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "getTCSpecification");

		Assert.fail();
	}

	@MethodRef(name = "getAdvantages", signature = "()QAdvantages;")
	@Test
	public void getAdvantagesTest() throws Exception {
		Advantages result;

		// default test
		result = FreeCol.getAdvantages();

		Assert.fail();
	}

	@MethodRef(name = "selectAdvantages", signature = "(QString;)QAdvantages;")
	@Test
	public void selectAdvantagesTest() throws Exception {
		String advantages = "";
		Advantages result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "selectAdvantages", new Object[] { advantages });

		Assert.fail();
	}

	@MethodRef(name = "setAdvantages", signature = "(QAdvantages;)V")
	@Test
	public void setAdvantagesTest() throws Exception {
		Advantages advantages = null;

		// default test
		FreeCol.setAdvantages(advantages);

		Assert.fail();
	}

	@MethodRef(name = "getValidAdvantages", signature = "()QString;")
	@Test
	public void getValidAdvantagesTest() throws Exception {
		String result;

		// default test
		result = Whitebox.invokeMethod(FreeCol.class, "getValidAdvantages");

		Assert.fail();
	}

	@MethodRef(name = "getDifficulty", signature = "()QString;")
	@Test
	public void getDifficultyTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getDifficulty();

		Assert.fail();
	}

	@MethodRef(name = "selectDifficulty", signature = "(QString;)QString;")
	@Test
	public void selectDifficultyTest() throws Exception {
		String arg = "";
		String result;

		// default test
		result = FreeCol.selectDifficulty(arg);

		Assert.fail();
	}

	@MethodRef(name = "setDifficulty", signature = "(QOptionGroup;)V")
	@Test
	public void setDifficultyTest() throws Exception {
		OptionGroup difficulty = null;

		// default test
		FreeCol.setDifficulty(difficulty);

		Assert.fail();
	}

	@MethodRef(name = "setDifficulty", signature = "(QString;)V")
	@Test
	public void setDifficultyTest_1() throws Exception {
		String difficulty = "";

		// default test
		FreeCol.setDifficulty(difficulty);

		Assert.fail();
	}

	@MethodRef(name = "getValidDifficulties", signature = "()QString;")
	@Test
	public void getValidDifficultiesTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getValidDifficulties();

		Assert.fail();
	}

	@MethodRef(name = "getEuropeanCount", signature = "()I")
	@Test
	public void getEuropeanCountTest() throws Exception {
		int result;

		// default test
		result = FreeCol.getEuropeanCount();

		Assert.fail();
	}

	@MethodRef(name = "setEuropeanCount", signature = "(I)V")
	@Test
	public void setEuropeanCountTest() throws Exception {
		int n = 0;

		// default test
		FreeCol.setEuropeanCount(n);

		Assert.fail();
	}

	@MethodRef(name = "setGUIScale", signature = "(QString;)Z")
	@Test
	public void setGUIScaleTest() throws Exception {
		String arg = "";
		boolean result;

		// test 1
		arg = null;
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(false, result);

		// test 2
		arg = "";
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	@MethodRef(name = "getValidGUIScales", signature = "()QString;")
	@Test
	public void getValidGUIScalesTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getValidGUIScales();

		Assert.fail();
	}

	@MethodRef(name = "selectEuropeanCount", signature = "(QString;)I")
	@Test
	public void selectEuropeanCountTest() throws Exception {
		String arg = "";
		int result;

		// default test
		result = FreeCol.selectEuropeanCount(arg);

		Assert.fail();
	}

	@MethodRef(name = "setLogLevel", signature = "(QString;)V")
	@Test
	public void setLogLevelTest() throws Exception {
		String arg = "";

		// default test
		Whitebox.invokeMethod(FreeCol.class, "setLogLevel", new Object[] { arg });

		Assert.fail();
	}

	@MethodRef(name = "getName", signature = "()QString;")
	@Test
	public void getNameTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getName();

		Assert.fail();
	}

	@MethodRef(name = "setName", signature = "(QString;)V")
	@Test
	public void setNameTest() throws Exception {
		String name = "";

		// default test
		FreeCol.setName(name);

		Assert.fail();
	}

	@MethodRef(name = "getLocale", signature = "()QLocale;")
	@Test
	public void getLocaleTest() throws Exception {
		Locale result;

		// default test
		result = FreeCol.getLocale();

		Assert.fail();
	}

	@MethodRef(name = "getRevision", signature = "()QString;")
	@Test
	public void getRevisionTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getRevision();

		Assert.fail();
	}

	@MethodRef(name = "getServerHost", signature = "()QString;")
	@Test
	public void getServerHostTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getServerHost();

		Assert.fail();
	}

	@MethodRef(name = "getServerPort", signature = "()I")
	@Test
	public void getServerPortTest() throws Exception {
		int result;

		// default test
		result = FreeCol.getServerPort();

		Assert.fail();
	}

	@MethodRef(name = "setServerPort", signature = "(QString;)Z")
	@Test
	public void setServerPortTest() throws Exception {
		String arg = "";
		boolean result;

		// test 1
		arg = null;
		result = FreeCol.setServerPort(arg);
		Assert.assertEquals(false, result);

		// test 2
		arg = "";
		result = FreeCol.setServerPort(arg);
		Assert.assertEquals(false, result);

		Assert.fail();
	}

	@MethodRef(name = "getTC", signature = "()QString;")
	@Test
	public void getTCTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getTC();

		Assert.fail();
	}

	@MethodRef(name = "setTC", signature = "(QString;)V")
	@Test
	public void setTCTest() throws Exception {
		String tc = "";

		// default test
		FreeCol.setTC(tc);

		Assert.fail();
	}

	@MethodRef(name = "getTCFile", signature = "()QFreeColTcFile;")
	@Test
	public void getTCFileTest() throws Exception {
		FreeColTcFile result;

		// default test
		result = FreeCol.getTCFile();

		Assert.fail();
	}

	@MethodRef(name = "getTimeout", signature = "(Z)I")
	@Test
	public void getTimeoutTest() throws Exception {
		boolean singlePlayer = false;
		int result;

		// default test
		result = FreeCol.getTimeout(singlePlayer);

		Assert.fail();
	}

	@MethodRef(name = "setTimeout", signature = "(QString;)Z")
	@Test
	public void setTimeoutTest() throws Exception {
		String timeout = "";
		boolean result;

		// default test
		result = FreeCol.setTimeout(timeout);

		Assert.fail();
	}

	@MethodRef(name = "getVersion", signature = "()QString;")
	@Test
	public void getVersionTest() throws Exception {
		String result;

		// default test
		result = FreeCol.getVersion();

		Assert.fail();
	}

	@MethodRef(name = "setWindowSize", signature = "(QString;)V")
	@Test
	public void setWindowSizeTest() throws Exception {
		String arg = "";

		// test 1
		arg = null;
		Whitebox.invokeMethod(FreeCol.class, "setWindowSize", new Object[] { arg });

		// test 2
		arg = "";
		Whitebox.invokeMethod(FreeCol.class, "setWindowSize", new Object[] { arg });

		Assert.fail();
	}

	@MethodRef(name = "badSave", signature = "(QFile;)QStringTemplate;")
	@Test
	public void badSaveTest() throws Exception {
		File file = null;
		StringTemplate result;

		// default test
		result = FreeCol.badSave(file);

		Assert.fail();
	}

	@MethodRef(name = "getConfiguration", signature = "()QStringBuilder;")
	@Test
	public void getConfigurationTest() throws Exception {
		StringBuilder result;

		// default test
		result = FreeCol.getConfiguration();

		Assert.fail();
	}

	@MethodRef(name = "startClient", signature = "(QString;)V")
	@Test
	public void startClientTest() throws Exception {
		String userMsg = "";

		// default test
		Whitebox.invokeMethod(FreeCol.class, "startClient", new Object[] { userMsg });

		Assert.fail();
	}

	@MethodRef(name = "startServer", signature = "()V")
	@Test
	public void startServerTest() throws Exception {

		// default test
		Whitebox.invokeMethod(FreeCol.class, "startServer");

		Assert.fail();
	}
}