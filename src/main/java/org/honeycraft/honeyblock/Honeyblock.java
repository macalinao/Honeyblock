/*
 * This file is part of Honeyblock.
 *
 * Honeyblock is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Honeyblock is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Honeyblock.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.honeycraft.honeyblock;

import java.util.logging.Logger;

/**
 * Honeyblock main class
 */
public class Honeyblock {
    /**
     * The Honeyblock logger.
     */
    private Logger logger;

    /**
     * Creates a new instance of Honeyblock.
     *
     * @param hb The honeyblock interface to use.
     */
    public Honeyblock(HoneyblockInterface hb) {
        this.logger = hb.getLogger();
    }

}
