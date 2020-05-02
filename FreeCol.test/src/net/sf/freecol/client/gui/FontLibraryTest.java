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

@Generated(value = "org.junit-tools-1.1.0")
public class FontLibraryTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private FontLibrary createTestSubject() {
		return new FontLibrary();
	}

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