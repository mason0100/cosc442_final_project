package net.sf.freecol.client.gui;

import java.awt.Color;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class GUIMessageTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private GUIMessage createTestSubject() {
		return new GUIMessage("", new Color(0, 0, 0));
	}

	@MethodRef(name = "getMessage", signature = "()QString;")
	@Test
	public void getMessageTest() throws Exception {
		GUIMessage testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMessage();

		Assert.fail();
	}

	@MethodRef(name = "getColor", signature = "()QColor;")
	@Test
	public void getColorTest() throws Exception {
		GUIMessage testSubject;
		Color result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getColor();

		Assert.fail();
	}

	@MethodRef(name = "getCreationTime", signature = "()J")
	@Test
	public void getCreationTimeTest() throws Exception {
		GUIMessage testSubject;
		long result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCreationTime();

		Assert.fail();
	}
}