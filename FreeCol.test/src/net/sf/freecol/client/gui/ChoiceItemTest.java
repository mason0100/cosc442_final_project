package net.sf.freecol.client.gui;

import javax.annotation.Generated;
import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class ChoiceItemTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private ChoiceItem createTestSubject() {
		return new ChoiceItem("", null, false);
	}

	@MethodRef(name = "getObject", signature = "()QT;")
	@Test
	public void getObjectTest() throws Exception {
		ChoiceItem testSubject;
		T result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getObject();

		Assert.fail();
	}

	@MethodRef(name = "getChoice", signature = "()I")
	@Test
	public void getChoiceTest() throws Exception {
		ChoiceItem testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChoice();

		Assert.fail();
	}

	@MethodRef(name = "isEnabled", signature = "()Z")
	@Test
	public void isEnabledTest() throws Exception {
		ChoiceItem testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isEnabled();

		Assert.fail();
	}

	@MethodRef(name = "toString", signature = "()QString;")
	@Test
	public void toStringTest() throws Exception {
		ChoiceItem testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.toString();

		Assert.fail();
	}

	@MethodRef(name = "getIcon", signature = "()QImageIcon;")
	@Test
	public void getIconTest() throws Exception {
		ChoiceItem testSubject;
		ImageIcon result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getIcon();

		Assert.fail();
	}

	@MethodRef(name = "setIcon", signature = "(QImageIcon;)QChoiceItem<QT;>;")
	@Test
	public void setIconTest() throws Exception {
		ChoiceItem testSubject;
		ImageIcon icon = null;
		ChoiceItem<T> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.setIcon(icon);

		Assert.fail();
	}

	@MethodRef(name = "isOK", signature = "()Z")
	@Test
	public void isOKTest() throws Exception {
		ChoiceItem testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isOK();

		Assert.fail();
	}

	@MethodRef(name = "okOption", signature = "()QChoiceItem<QT;>;")
	@Test
	public void okOptionTest() throws Exception {
		ChoiceItem testSubject;
		ChoiceItem<T> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.okOption();

		Assert.fail();
	}

	@MethodRef(name = "isCancel", signature = "()Z")
	@Test
	public void isCancelTest() throws Exception {
		ChoiceItem testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isCancel();

		Assert.fail();
	}

	@MethodRef(name = "cancelOption", signature = "()QChoiceItem<QT;>;")
	@Test
	public void cancelOptionTest() throws Exception {
		ChoiceItem testSubject;
		ChoiceItem<T> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.cancelOption();

		Assert.fail();
	}

	@MethodRef(name = "isDefault", signature = "()Z")
	@Test
	public void isDefaultTest() throws Exception {
		ChoiceItem testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isDefault();

		Assert.fail();
	}

	@MethodRef(name = "defaultOption", signature = "()QChoiceItem<QT;>;")
	@Test
	public void defaultOptionTest() throws Exception {
		ChoiceItem testSubject;
		ChoiceItem<T> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.defaultOption();

		Assert.fail();
	}

	@MethodRef(name = "compareTo", signature = "(QChoiceItem<QT;>;)I")
	@Test
	public void compareToTest() throws Exception {
		ChoiceItem testSubject;
		ChoiceItem<T> other = null;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.compareTo(other);

		Assert.fail();
	}
}