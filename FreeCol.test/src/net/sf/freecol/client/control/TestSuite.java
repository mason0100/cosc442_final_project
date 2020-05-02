/*
 * 
 */
package net.sf.freecol.client.control;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The Class TestSuite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(

{ InputHandlerTest.class, MapEditorControllerTest.class, SoundControllerTest.class, InGameInputHandlerTest.class,
		ConnectControllerTest.class, PreGameControllerTest.class, InGameControllerTest.class,
		PreGameInputHandlerTest.class })
public class TestSuite { // nothing
}
