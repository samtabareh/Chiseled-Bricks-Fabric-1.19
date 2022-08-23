package me.SamTB.chiseledbricks.item;

import me.SamTB.chiseledbricks.ChiseledBricks;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    private static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(ChiseledBricks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChiseledBricks.LOGGER.debug("Registering Mod Items for" + ChiseledBricks.MOD_ID);
    }
}
