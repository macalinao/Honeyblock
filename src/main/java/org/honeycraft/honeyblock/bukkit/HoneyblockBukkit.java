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
package org.honeycraft.honeyblock.bukkit;

import org.honeycraft.honeyblock.*;
import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Honeyblock main class
 */
public class HoneyblockBukkit extends JavaPlugin implements HoneyblockInterface {
    private Honeyblock honeyblock;

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Plugin disabled.");
    }

    @Override
    public void onEnable() {
        honeyblock = new Honeyblock(this);
        getLogger().log(Level.INFO, "Plugin enabled.");
    }

}
