package me.SamTB.chiseledbricks.block.custom;

import net.minecraft.block.DoorBlock;
import net.minecraft.sound.SoundEvent;

public class ModDoorBlock extends DoorBlock {
    public ModDoorBlock(Locals.Settings settings) {
        super(settings, Soundevent.of());
    }
}
