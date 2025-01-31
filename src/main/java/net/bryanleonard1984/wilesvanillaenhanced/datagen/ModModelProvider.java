package net.bryanleonard1984.wilesvanillaenhanced.datagen;

import net.bryanleonard1984.wilesvanillaenhanced.block.ModBlocks;
import net.bryanleonard1984.wilesvanillaenhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RECLAMATION_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECOMPOSTION_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.IRON_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOOK_ENCHANTMENT_CORE, Models.GENERATED);
    }
}
