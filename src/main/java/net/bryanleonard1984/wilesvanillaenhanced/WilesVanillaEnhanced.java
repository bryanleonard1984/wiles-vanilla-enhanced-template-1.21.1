package net.bryanleonard1984.wilesvanillaenhanced;

import net.bryanleonard1984.wilesvanillaenhanced.block.ModBlocks;
import net.bryanleonard1984.wilesvanillaenhanced.item.ModItemGroups;
import net.bryanleonard1984.wilesvanillaenhanced.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WilesVanillaEnhanced implements ModInitializer {
	public static final String MOD_ID = "wilesvanillaenhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}