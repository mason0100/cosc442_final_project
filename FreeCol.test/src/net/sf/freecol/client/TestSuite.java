/*
 * 
 */
package net.sf.freecol.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The Class TestSuite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(

{ ClientOptionsTest.class, FreeColClientTest.class, WorkerTest.class, net.sf.freecol.client.gui.TestSuite.class })
public class TestSuite { // nothing
}
