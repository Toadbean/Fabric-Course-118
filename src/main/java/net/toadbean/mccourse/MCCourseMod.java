package net.toadbean.mccourse;

import net.fabricmc.api.ModInitializer;
import net.toadbean.mccourse.block.ModBlocks;
import net.toadbean.mccourse.item.ModItems;
import net.toadbean.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();

	}
}
