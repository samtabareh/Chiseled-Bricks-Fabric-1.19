package me.SamTB.chiseledbricks.block;

import me.SamTB.chiseledbricks.ChiseledBricks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_MUDBRICKS = registerBlock("chiseled_mudbricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_PURPUR_BRICKS = registerBlock("chiseled_purpur_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ChiseledBricks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        return Registry.register(Registry.ITEM, new Identifier(ChiseledBricks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        ChiseledBricks.LOGGER.debug("Registering Mod Blocks for" + ChiseledBricks.MOD_ID);
    }
}
