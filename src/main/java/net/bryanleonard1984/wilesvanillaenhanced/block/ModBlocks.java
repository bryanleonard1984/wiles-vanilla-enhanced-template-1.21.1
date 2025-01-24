package net.bryanleonard1984.wilesvanillaenhanced.block;

import net.bryanleonard1984.wilesvanillaenhanced.WilesVanillaEnhanced;
import net.bryanleonard1984.wilesvanillaenhanced.block.custom.DecomposingBlock;
import net.bryanleonard1984.wilesvanillaenhanced.block.custom.ReclamationBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block RECLAMATION_BLOCK = registerBlock("reclamation_block",
            new ReclamationBlock(AbstractBlock.Settings.create().strength(4.0f, 2.5f)
                    .luminance(state -> 15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block DECOMPOSTION_BLOCK = registerBlock("decomposition_block",
            new DecomposingBlock(AbstractBlock.Settings.create().strength(3.0f, 1.5f)
                    .requiresTool().sounds(BlockSoundGroup.MUD)));

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
