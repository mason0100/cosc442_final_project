/*
 * 
 */
package net.sf.freecol.client.gui;

import java.awt.Font;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

import net.sf.freecol.client.gui.FontLibrary.FontSize;
import net.sf.freecol.client.gui.FontLibrary.FontType;

// TODO: Auto-generated Javadoc
/**
 * The Class FontLibraryTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class FontLibraryTest {

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
	 * @return the font library
	 */
	private FontLibrary createTestSubject() {
		return new FontLibrary();
	}

	/**
	 * Creates the main font test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createMainFont", signature = "(QString;F)QFont;")
	@Test
	public void createMainFontTest() throws Exception {
		String fontName = "";
		float scaleFactor = 0;
		Font result;

		// test 1
		fontName = null;
		result = Whitebox.invokeMethod(FontLibrary.class, "createMainFont", new Object[] { fontName, scaleFactor });
		Assert.assertEquals(null, result);

		// test 2
		fontName = "";
		result = Whitebox.invokeMethod(FontLibrary.class, "createMainFont", new Object[] { fontName, scaleFactor });
		Assert.assertEquals(null, result);

		Assert.fail();
	}

	/**
	 * Creates the scaled font test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createScaledFont", signature = "(QFontType;QFontSize;)QFont;")
	@Test
	public void createScaledFontTest() throws Exception {
		FontLibrary testSubject;
		FontType fontType = null;
		FontSize fontSize = null;
		Font result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createScaledFont(fontType, fontSize);

		Assert.fail();
	}

	/**
	 * Creates the scaled font test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createScaledFont", signature = "(QFontType;QFontSize;I)QFont;")
	@Test
	public void createScaledFontTest_1() throws Exception {
		FontLibrary testSubject;
		FontType fontType = null;
		FontSize fontSize = null;
		int style = 0;
		Font result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createScaledFont(fontType, fontSize, style);

		Assert.fail();
	}

	/**
	 * Creates the compatible scaled font test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCompatibleScaledFont", signature = "(QString;QFontType;QFontSize;)QFont;")
	@Test
	public void createCompatibleScaledFontTest() throws Exception {
		FontLibrary testSubject;
		String string = "";
		FontType fontType = null;
		FontSize fontSize = null;
		Font result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createCompatibleScaledFont(string, fontType, fontSize);

		Assert.fail();
	}

	/**
	 * Creates the compatible scaled font test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCompatibleScaledFont", signature = "(QString;QFontType;QFontSize;I)QFont;")
	@Test
	public void createCompatibleScaledFontTest_1() throws Exception {
		FontLibrary testSubject;
		String string = "";
		FontType fontType = null;
		FontSize fontSize = null;
		int style = 0;
		Font result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createCompatibleScaledFont(string, fontType, fontSize, style);

		Assert.fail();
	}

	/**
	 * Creates the font test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createFont", signature = "(QFontType;QFontSize;)QFont;")
	@Test
	public void createFontTest() throws Exception {
		FontType fontType = null;
		FontSize fontSize = null;
		Font result;

		// default test
		result = FontLibrary.createFont(fontType, fontSize);

		Assert.fail();
	}

	/**
	 * Creates the font test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createFont", signature = "(QFontType;QFontSize;I)QFont;")
	@Test
	public void createFontTest_1() throws Exception {
		FontType fontType = null;
		FontSize fontSize = null;
		int style = 0;
		Font result;

		// default test
		result = FontLibrary.createFont(fontType, fontSize, style);

		Assert.fail();
	}

	/**
	 * Creates the font test 2.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createFont", signature = "(QFontType;QFontSize;F)QFont;")
	@Test
	public void createFontTest_2() throws Exception {
		FontType fontType = null;
		FontSize fontSize = null;
		float scaleFactor = 0;
		Font result;

		// default test
		result = FontLibrary.createFont(fontType, fontSize, scaleFactor);

		Assert.fail();
	}

	/**
	 * Creates the compatible font test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCompatibleFont", signature = "(QString;QFontType;QFontSize;)QFont;")
	@Test
	public void createCompatibleFontTest() throws Exception {
		String string = "";
		FontType fontType = null;
		FontSize fontSize = null;
		Font result;

		// default test
		result = FontLibrary.createCompatibleFont(string, fontType, fontSize);

		Assert.fail();
	}

	/**
	 * Creates the compatible font test 1.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCompatibleFont", signature = "(QString;QFontType;QFontSize;I)QFont;")
	@Test
	public void createCompatibleFontTest_1() throws Exception {
		String string = "";
		FontType fontType = null;
		FontSize fontSize = null;
		int style = 0;
		Font result;

		// default test
		result = FontLibrary.createCompatibleFont(string, fontType, fontSize, style);

		Assert.fail();
	}

	/**
	 * Creates the compatible font test 2.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCompatibleFont", signature = "(QString;QFontType;QFontSize;F)QFont;")
	@Test
	public void createCompatibleFontTest_2() throws Exception {
		String string = "";
		FontType fontType = null;
		FontSize fontSize = null;
		float scaleFactor = 0;
		Font result;

		// default test
		result = FontLibrary.createCompatibleFont(string, fontType, fontSize, scaleFactor);

		Assert.fail();
	}

	/**
	 * Creates the font test 3.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createFont", signature = "(QFontType;QFontSize;IF)QFont;")
	@Test
	public void createFontTest_3() throws Exception {
		FontType fontType = null;
		FontSize fontSize = null;
		int style = 0;
		float scaleFactor = 0;
		Font result;

		// default test
		result = FontLibrary.createFont(fontType, fontSize, style, scaleFactor);

		Assert.fail();
	}

	/**
	 * Creates the compatible font test 3.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "createCompatibleFont", signature = "(QString;QFontType;QFontSize;IF)QFont;")
	@Test
	public void createCompatibleFontTest_3() throws Exception {
		String string = "";
		FontType fontType = null;
		FontSize fontSize = null;
		int style = 0;
		float scaleFactor = 0;
		Font result;

		// default test
		result = FontLibrary.createCompatibleFont(string, fontType, fontSize, style, scaleFactor);

		Assert.fail();
	}

	/**
	 * Calc scaled size test.
	 *
	 * @throws Exception the exception
	 */
	@MethodRef(name = "calcScaledSize", signature = "(QFontSize;F)F")
	@Test
	public void calcScaledSizeTest() throws Exception {
		FontSize fontSize = null;
		float scaleFactor = 0;
		float result;

		// default test
		result = Whitebox.invokeMethod(FontLibrary.class, "calcScaledSize",
				new Object[] { FontSize.class, scaleFactor });

		Assert.fail();
	}

	/**
	 * Gets the font key test.
	 *
	 * @return the font key test
	 * @throws Exception the exception
	 */
	@MethodRef(name = "getFontKey", signature = "(QFontType;)QString;")
	@Test
	public void getFontKeyTest() throws Exception {
		FontType fontType = null;
		String result;

		// default test
		result = Whitebox.invokeMethod(FontLibrary.class, "getFontKey", new Object[] { FontType.class });

		Assert.fail();
	}
}