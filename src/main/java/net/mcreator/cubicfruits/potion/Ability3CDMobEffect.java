package net.mcreator.cubicfruits.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public class Ability3CDMobEffect extends MobEffect {
	public Ability3CDMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return ParticleTypes.END_ROD;
	}
}