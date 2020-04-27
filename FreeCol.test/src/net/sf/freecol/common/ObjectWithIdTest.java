package net.sf.freecol.common;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class ObjectWithIdTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private ObjectWithId createTestSubject() {
		return new ObjectWithId();
	}

	@MethodRef(name = "getId", signature = "()QString;")
	@Test
	public void getIdTest() throws Exception {
		ObjectWithId testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();

		Assert.fail();
	}
}