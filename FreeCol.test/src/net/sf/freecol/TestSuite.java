/*
 * 
 */
package net.sf.freecol;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The Class TestSuite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(

{ FreeColTest.class, net.sf.freecol.server.TestSuite.class })
public class TestSuite { // nothing
}
