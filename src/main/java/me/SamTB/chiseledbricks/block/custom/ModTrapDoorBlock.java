package me.SamTB.chiseledbricks.block.custom;

import net.minecraft.block.Blocks;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.SoundEvent;

public class ModTrapDoorBlock extends TrapdoorBlock {
    public ModTrapDoorBlock(Settings settings) {
        super(settings, SoundEvent.of());
    }
}
