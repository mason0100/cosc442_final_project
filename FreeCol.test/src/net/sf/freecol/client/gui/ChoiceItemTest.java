/*
 * 
 */
package net.sf.freecol.client.gui;

import javax.annotation.Generated;
import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

// TODO: Auto-generated Javadoc
/**
 * The Class ChoiceItemTest.
 */
@Generated(value = "org.junit-tools-1.1.0")
public class ChoiceItemTest {

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
	 * @return the choice item
	 */
	private ChoiceItem createTestSubject() {
		return new ChoiceItem("", null, false);
	}

	/**
	 * Gets the object test.
	 *
	 * @return the object test
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the choice test.
	 *
	 * @return the choice test
	 * @throws Exception the exception
	 */
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

	/**
	 * Checks if is enabled test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * To string test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Gets the icon test.
	 *
	 * @return the icon test
	 * @throws Exception the exception
	 */
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

	/**
	 * Sets the icon test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Checks if is OK test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Ok option test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Checks if is cancel test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Cancel option test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Checks if is default test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Default option test.
	 *
	 * @throws Exception the exception
	 */
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

	/**
	 * Compare to test.
	 *
	 * @throws Exception the exception
	 */
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