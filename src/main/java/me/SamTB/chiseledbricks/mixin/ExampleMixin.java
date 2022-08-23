package me.SamTB.chiseledbricks.mixin;

import me.SamTB.chiseledbricks.ChiseledBricks;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		ChiseledBricks.LOGGER.info("This line is printed by chiseled bricks mod mixin!");
	}
}
