package me.SamTB.chiseledbricks.item;

import me.SamTB.chiseledbricks.ChiseledBricks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(ChiseledBricks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChiseledBricks.LOGGER.debug("Registering Mod Items for" + ChiseledBricks.MOD_ID);
    }
}
