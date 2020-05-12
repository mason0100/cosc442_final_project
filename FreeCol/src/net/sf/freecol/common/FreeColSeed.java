/**
 *  Copyright (C) 2002-2015   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common;

import java.security.SecureRandom;
import java.util.logging.Logger;


// TODO: Auto-generated Javadoc
/**
 * A wrapper for the pseudo-random number generator seed.
 */
public class FreeColSeed {

    /** The Constant logger. */
    private static final Logger logger = Logger.getLogger(FreeColSeed.class.getName());

    /** The Constant DEFAULT_SEED. */
    public static final long DEFAULT_SEED = 0L;

    /** The free col default. */
    private static long freeColDefault = DEFAULT_SEED;
    

    /**
     * Gets the seed for the PRNG.
     *
     * @param generate Force generation of a new seed.
     * @return The seed.
     */
    public static long getFreeColSeed(boolean generate) {
        if (generate) {
            freeColDefault = new SecureRandom().nextLong();
            String loggerInfo = "Using seed: " + freeColDefault;
			logger.info(loggerInfo);
        }
        return freeColDefault;
    }

    /**
     * Sets the seed for the PRNG.
     *
     * @param arg A string defining the seed.
     */
    public static void setFreeColSeed(String arg) {
        try {
            FreeColSeed.freeColDefault = Long.parseLong(arg);
        } catch (NumberFormatException nfe) {}
    }

    /**
     * Increments the seed for the PRNG.
     */
    public static void incrementFreeColSeed() {
        freeColDefault = getFreeColSeed(false) + 1;
        String loggerInfo = "Reseeded with: " + freeColDefault;
		logger.info(loggerInfo);
    }
}
