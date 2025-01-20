package net.bryanleonard1984.wilesvanillaenhanced.block;

import net.bryanleonard1984.wilesvanillaenhanced.WilesVanillaEnhanced;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(WilesVanillaEnhanced.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(WilesVanillaEnhanced.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks()
    {
        WilesVanillaEnhanced.LOGGER.info("Registering Mod Blocks for " + WilesVanillaEnhanced.MOD_ID);
    }
}
