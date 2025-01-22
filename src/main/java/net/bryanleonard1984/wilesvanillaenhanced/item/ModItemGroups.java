package net.bryanleonard1984.wilesvanillaenhanced.item;

import net.bryanleonard1984.wilesvanillaenhanced.WilesVanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup VANILLA_ENHANCED_TOOLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WilesVanillaEnhanced.MOD_ID, "vanilla_enhanced_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IRON_CHISEL))
                .displayName(Text.translatable("itemgroup.wilesvanillaenhanced.vanilla_enhanced_tools"))
                .entries(((displayContext, entries) ->
                {
                    entries.add(ModItems.IRON_CHISEL);
                    entries.add(ModItems.DIAMOND_CHISEL);
                    entries.add(ModItems.EMERALD_CHISEL);
                    entries.add(ModItems.NETHERITE_CHISEL);
                })).build());

    public static final ItemGroup VANILLA_ENHANCED_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WilesVanillaEnhanced.MOD_ID, "vanilla_enhanced_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BOOK_ENCHANTMENT_CORE))
                    .displayName(Text.translatable("itemgroup.wilesvanillaenhanced.vanilla_enhanced_items"))
                    .entries(((displayContext, entries) ->
                    {
                        entries.add(ModItems.BOOK_ENCHANTMENT_CORE);
                    })).build());


    public static void registerModItemGroups()
    {
        WilesVanillaEnhanced.LOGGER.info("Registering Mod Item Groups for " + WilesVanillaEnhanced.MOD_ID);
    }
}