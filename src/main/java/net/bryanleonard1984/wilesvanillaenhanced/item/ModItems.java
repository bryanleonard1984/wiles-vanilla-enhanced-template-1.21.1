package net.bryanleonard1984.wilesvanillaenhanced.item;

import net.bryanleonard1984.wilesvanillaenhanced.WilesVanillaEnhanced;
import net.bryanleonard1984.wilesvanillaenhanced.item.custom.ChiselItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item BOOK_ENCHANTMENT_CORE = registerItem("book_enchantment_core",
            new Item(new Item.Settings()));


    public static final Item IRON_CHISEL = registerItem("iron_chisel",
            new ChiselItem(new Item.Settings().maxDamage(256)));
    public static final Item DIAMOND_CHISEL = registerItem("diamond_chisel",
            new ChiselItem(new Item.Settings().maxDamage(512)));
    public static final Item EMERALD_CHISEL = registerItem("emerald_chisel",
            new ChiselItem(new Item.Settings().maxDamage(1024)));
    public static final Item NETHERITE_CHISEL = registerItem("netherite_chisel",
            new ChiselItem(new Item.Settings().maxDamage(4096).fireproof()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(WilesVanillaEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        WilesVanillaEnhanced.LOGGER.info("Registering Mod Items for " + WilesVanillaEnhanced.MOD_ID);
    }
}
