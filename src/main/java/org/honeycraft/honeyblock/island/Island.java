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
package org.honeycraft.honeyblock.island;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Represents an island.
 */
public class Island {
    /**
     * The Y that the island is generated at.
     */
    public static final int ISLAND_Y = 35;

    /**
     * The spacing between islands.
     */
    public static final int ISLAND_SPACING = 500;

    /**
     * Half of the spacing between islands.
     */
    public static final int ISLAND_SPACING_HALF = ISLAND_SPACING / 2;

    /**
     * The world of the island.
     */
    private World world;

    /**
     * The X position of the island.
     */
    private int x;

    /**
     * The Z position of the island.
     */
    private int z;

    /**
     * Gets the world of the island.
     *
     * @return The world of the island.
     */
    public World getWorld() {
        return world;
    }

    /**
     * Gets the X position of the island.
     *
     * @return The X position of the island.
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the Z position of the island.
     *
     * @return The Z position of the island.
     */
    public int getZ() {
        return z;
    }

    /**
     * Cleans up the entire area of the island.
     */
    public void cleanup() {
        for (int i = getX() - ISLAND_SPACING_HALF; i < getX() + ISLAND_SPACING_HALF; i++) {
            for (int j = 0; j < getWorld().getMaxHeight(); j++) {
                for (int k = getZ() - ISLAND_SPACING_HALF; k < getZ() + ISLAND_SPACING_HALF; k++) {
                    Block block = getWorld().getBlockAt(i, j, k);
                    if (block.getTypeId() != 0) {
                        block.setTypeId(0);
                    }
                }
            }
        }
    }

    /**
     * Generates the island.
     */
    public void generate() {
        int y = ISLAND_Y;

        for (int x_operate = getX(); x_operate < getX() + 3; x_operate++) {
            for (int y_operate = y; y_operate < y + 2; y_operate++) {
                for (int z_operate = getZ(); z_operate < getZ() + 6; z_operate++) {
                    Block blockToChange = getWorld().getBlockAt(x_operate, y_operate, z_operate);
                    blockToChange.setTypeId(3);
                }
            }

        }

        for (int x_operate = getX(); x_operate < getX() + 3; x_operate++) {
            for (int y_operate = y + 2; y_operate < y + 3; y_operate++) {
                for (int z_operate = getZ(); z_operate < getZ() + 6; z_operate++) {
                    Block blockToChange = getWorld().getBlockAt(x_operate, y_operate, z_operate);
                    blockToChange.setTypeId(2);
                }
            }
        }

        for (int x_operate = getX() + 3; x_operate < getX() + 6; x_operate++) {
            for (int y_operate = y; y_operate < y + 2; y_operate++) {
                for (int z_operate = getZ() + 3; z_operate < getZ() + 6; z_operate++) {
                    Block blockToChange = getWorld().getBlockAt(x_operate, y_operate, z_operate);
                    blockToChange.setTypeId(3);
                }
            }
        }

        for (int x_operate = getX() + 3; x_operate < getX() + 6; x_operate++) {
            for (int y_operate = y + 2; y_operate < y + 3; y_operate++) {
                for (int z_operate = getZ() + 3; z_operate < getZ() + 6; z_operate++) {
                    Block blockToChange = getWorld().getBlockAt(x_operate, y_operate, z_operate);
                    blockToChange.setTypeId(2);
                }
            }
        }

        for (int y_operate = y + 3; y_operate < y + 9; y_operate++) {
            Block blockToChange = getWorld().getBlockAt(getX() + 5, y_operate, getZ() + 5);
            blockToChange.setTypeId(17);
        }

        Block blockToChange = getWorld().getBlockAt(getX() + 1, y + 3, getZ() + 0);
        blockToChange.setTypeId(54);
        Chest chest = (Chest) blockToChange.getState();
        Inventory inventory = chest.getInventory();
        ItemStack item = new ItemStack(287, 12);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(327, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(352, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(338, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(40, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(79, 2);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(361, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(39, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(360, 1);
        inventory.addItem(new ItemStack[]{item});
        item = new ItemStack(81, 1);
        inventory.addItem(new ItemStack[]{item});

        blockToChange = getWorld().getBlockAt(getX() + 1, y, getZ() + 4);
        blockToChange.setTypeId(7);

        blockToChange = getWorld().getBlockAt(getX() + 4, y + 6, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 6, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 6, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 3, y + 7, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 7, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 7, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 7, getZ() + 3);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 7, getZ() + 3);
        blockToChange.setTypeId(18);

        blockToChange = getWorld().getBlockAt(getX() + 3, y + 6, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 6, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 6, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 6, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 6, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 3, y + 7, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 7, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 7, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 7, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 7, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 8, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 8, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 8, getZ() + 4);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 9, getZ() + 4);
        blockToChange.setTypeId(18);

        blockToChange = getWorld().getBlockAt(getX() + 3, y + 6, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 6, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 6, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 6, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 3, y + 7, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 7, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 7, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 7, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 8, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 8, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 9, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 9, getZ() + 5);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 9, getZ() + 5);
        blockToChange.setTypeId(18);

        blockToChange = getWorld().getBlockAt(getX() + 3, y + 6, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 6, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 6, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 6, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 6, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 3, y + 7, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 7, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 7, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 7, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 7, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 8, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 8, getZ() + 6);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 9, getZ() + 6);
        blockToChange.setTypeId(18);

        blockToChange = getWorld().getBlockAt(getX() + 4, y + 6, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 6, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 6, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 3, y + 7, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 7, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 5, y + 7, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 6, y + 7, getZ() + 7);
        blockToChange.setTypeId(18);
        blockToChange = getWorld().getBlockAt(getX() + 7, y + 7, getZ() + 7);
        blockToChange.setTypeId(18);

        blockToChange = getWorld().getBlockAt(getX() + 1, y + 1, getZ() + 1);
        blockToChange.setTypeId(12);
        blockToChange = getWorld().getBlockAt(getX() + 1, y + 1, getZ() + 4);
        blockToChange.setTypeId(12);
        blockToChange = getWorld().getBlockAt(getX() + 4, y + 1, getZ() + 4);
        blockToChange.setTypeId(12);
    }

}
