package net.sf.freecol;



import java.io.File;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.util.Locale;

import javax.annotation.Generated;

import static org.junit.Assert.assertEquals;
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
import net.sf.freecol.common.option.Option;
import net.sf.freecol.common.option.OptionGroup;

@Generated(value = "org.junit-tools-1.1.0")
public class FreeColTest {
	
	//constants 
	int N = 0;
	
	
	

	private FreeCol createTestSubject() {
		return new FreeCol();
	}
	
	

	@MethodRef(name = "badLoad", signature = "(QFile;)QStringTemplate;")
	@Test
	public void badLoadTest() throws Exception {
		//tests a random string as the name of a file that does not exist
		//This method uses StringTemplate
		//If StringTemplate does not work correctly this test will most likely
		//work incorrectly. 
		String fileName = "does not exist";
		File file = new File(fileName);
		StringTemplate result;
		result = FreeCol.badLoad(file);
		String actualResult = result.toString();
		
		String expectedResult = "TEMPLATE: error.couldNotLoad [[%name%: NAME: " + fileName + "]]";
		
		assertEquals(expectedResult,actualResult);
		
	}

	@Before
	public void setUp() throws Exception {

	}

	@Before
	public void setUp_1() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		Runtime.getRuntime().gc();

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
		String[] args = new String[] { "help" };

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
		StringTemplate temp = new StringTemplate();
		StringTemplate template = new StringTemplate("TestID", temp);

		// default test
		FreeCol.fatal(template);

		Assert.fail();
		//an assertion must be made with a dependency
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
		Option options = null;
		int status = 0;

		// default test
	
		
		Whitebox.invokeMethod(test, "printUsage", options, status);

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
		FreeCol test = Whitebox.invokeConstructor(FreeCol.class);
		result = Whitebox.invokeMethod(FreeCol.class, "selectAdvantages", new Object[] { advantages });
		System.out.println(result);
		Assert.fail();
		//****************************************************************************************STAR HERE
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
		String actualResult;
		String expectedResult;

		// default test
		actualResult = FreeCol.getDifficulty();
		expectedResult = "model.difficulty.medium";
		assertEquals(expectedResult,actualResult);
	
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
		String expectedResult;
		String actualResult;
		String difficulty;
		
		//Case 1: handles null case
		difficulty = null;
		actualResult = "model.difficulty.medium";
		FreeCol.setDifficulty(difficulty);
		expectedResult = FreeCol.getDifficulty();
		assertEquals(expectedResult,actualResult);
		
		//needs more cases
	}

	@MethodRef(name = "getValidDifficulties", signature = "()QString;")
	@Test
	public void getValidDifficultiesTest() throws Exception {
		String actualResult;
		String expectedResult;
		
		expectedResult = "model.difficulty.veryEasy.name,model.difficulty.easy.name,model.difficulty.medium.name,model.difficulty.hard.name,model.difficulty.veryHard.name";
		actualResult = FreeCol.getValidDifficulties();

		assertEquals(expectedResult,actualResult);
	}

	@MethodRef(name = "getEuropeanCount", signature = "()I")
	@Test
	public void getEuropeanCountTest() throws Exception {
		//FreeCol test = new FreeCol();
		int expectedResult = N;
		int actualResult;

		// default test
		actualResult = FreeCol.getEuropeanCount();
		System.out.println(actualResult + "recd");
		Assert.assertEquals(expectedResult, actualResult);
	}

	@MethodRef(name = "setEuropeanCount", signature = "(I)V")
	@Test
	public void setEuropeanCountTest() throws Exception {
		int n = N;
		//FreeCol testObject = new FreeCol();
		// default test
		FreeCol.setEuropeanCount(n);
		int actualResult = FreeCol.getEuropeanCount();
		int expectedResult = n;
		
		Assert.assertEquals(expectedResult, actualResult);	
		//void method
	}

	@MethodRef(name = "setGUIScale", signature = "(QString;)Z")
	@Test
	public void setGUIScaleTest() throws Exception {
		String arg = "";
		boolean result;

		// test 1
		arg = null;
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(true, result);

		// test 2: test a valid entry
		arg = "400";
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(false, result);
		
		// test 3: tests invalad entry greater than the GUI_SCALE_MAX_PCT
		arg = "425";
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(false, result);		

		// test 4: tests invalad entry less than than the GUI_SCALE_MIN_PCT
		arg = "75";
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(false, result);		
		
		// test 5: that is not a multiple of the GUI_SCALE_STEP
		arg = "425";
		result = FreeCol.setGUIScale(arg);
		Assert.assertEquals(false, result);			
		
	
	}

	@MethodRef(name = "getValidGUIScales", signature = "()QString;")
	@Test
	public void getValidGUIScalesTest() throws Exception {
		String actualResult;
		String expectedResult;

		// default test
		actualResult = FreeCol.getValidGUIScales();
		expectedResult = "100,125,150,175,200";
		assertEquals(expectedResult,actualResult);
		
	}

	@MethodRef(name = "selectEuropeanCount", signature = "(QString;)I")
	@Test
	public void selectEuropeanCountTest() throws Exception {
		String arg = "";
		int result;
		FreeCol testObject = new FreeCol();
		// default test
		FreeCol.selectEuropeanCount(arg);
		System.out.println(FreeCol.getEuropeanCount());

		Assert.fail();
		//void method
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
		//this test method test both setName() and getName()
		String actualResult;
		String expectedResult;
		String name;

		// Case 1: name = null, uses systems user name if null
		name = null;
		FreeCol.setName(name);
		actualResult = FreeCol.getName();
		expectedResult = System.getProperty("user.name");
		assertEquals(expectedResult,actualResult);
		
		//needs more cases
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
		String actualResult;
		
		String expectedResult ="0.11.6";
		// default test
		actualResult = FreeCol.getVersion();

		assertEquals(expectedResult,actualResult);
	}

	@MethodRef(name = "setWindowSize", signature = "(QString;)V")
	@Test
	public void setWindowSizeTest() throws Exception {
		//currently working on this method
		//FIXME: figure out whitebox
		String arg = "";
		FreeCol test = new FreeCol();
		// test 1
		arg = null;
		//FreeCol.setWindowSize(arg);
		Whitebox.invokeMethod(test, "setWindowSize", arg);

		// test 2
		arg = "2z4";
		//Whitebox.invokeMethod(FreeCol.class, "setWindowSize", new Object[] { arg });

		//Assert.fail();
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