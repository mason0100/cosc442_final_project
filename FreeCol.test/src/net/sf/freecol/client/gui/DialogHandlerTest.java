package net.sf.freecol.client.gui;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.powermock.reflect.Whitebox;

@Generated(value = "org.junit-tools-1.1.0")
public class DialogHandlerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private DialogHandler createTestSubject() {
		return new DialogHandler();
	}

	@MethodRef(name = "handle", signature = "(QT;)V")
	@Test
	public void handleTest() throws Exception {
		DialogHandler testSubject;
		T response = null;

		// default test
		testSubject = createTestSubject();
		Whitebox.invokeMethod(testSubject, "handle", new Object[] { T.class });

		Assert.fail();
	}
}