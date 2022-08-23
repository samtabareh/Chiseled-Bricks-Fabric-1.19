package me.SamTB.chiseledbricks;

import me.SamTB.chiseledbricks.block.ModBlocks;
import me.SamTB.chiseledbricks.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChiseledBricks implements ModInitializer {
	public static final String MOD_ID = "chiseledbricks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
