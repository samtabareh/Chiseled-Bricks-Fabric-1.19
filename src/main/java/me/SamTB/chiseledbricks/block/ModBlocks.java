package me.SamTB.chiseledbricks.block;

import me.SamTB.chiseledbricks.ChiseledBricks;
import me.SamTB.chiseledbricks.block.custom.ModDoorBlock;
import me.SamTB.chiseledbricks.block.custom.ModStairsBlock;
import me.SamTB.chiseledbricks.block.custom.ModTrapDoorBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block CHISELED_MUDBRICKS = registerBlock("chiseled_mudbricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block CHISELED_PURPUR_BRICKS = registerBlock("chiseled_purpur_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    //Slabs
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.GRASS)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SOUL_SAND_SLAB = registerBlock("soul_sand_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.SOUL_SAND)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SOUL_SOIL_SLAB = registerBlock("soul_soil_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.SOUL_SOIL)), ItemGroups.BUILDING_BLOCKS);

    //Stairs
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs",
            new ModStairsBlock(Blocks.DIRT.getDefaultState(), FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.GRASS)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SOUL_SOIL_STAIRS = registerBlock("soul_soil_stairs",
            new ModStairsBlock(Blocks.SOUL_SOIL.getDefaultState(), FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.SOUL_SOIL)), ItemGroups.BUILDING_BLOCKS);

    //TrapDoors
    public static final Block DIRT_TRAPDOOR = registerBlock("dirt_trapdoor",
            new ModTrapDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).sounds(BlockSoundGroup.GRASS).nonOpaque()), ItemGroups.BUILDING_BLOCKS);

    //Doors
    public static final Block DIRT_DOOR = registerBlock("dirt_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).sounds(BlockSoundGroup.GRASS).nonOpaque()), ItemGroups.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(ChiseledBricks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        return Registry.register(Registries.ITEM, new Identifier(ChiseledBricks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        ChiseledBricks.LOGGER.debug("Registering Mod Blocks for" + ChiseledBricks.MOD_ID);
    }
}
