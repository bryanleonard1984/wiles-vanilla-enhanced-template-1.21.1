package net.bryanleonard1984.wilesvanillaenhanced.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class ExampleMixin
{
	@Inject(at = @At("TAIL"), method = "getMovementSpeed*")
	private void init(CallbackInfoReturnable<Float> cir)
	{
	}
}