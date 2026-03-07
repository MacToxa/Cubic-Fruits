/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cubicfruits.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.cubicfruits.potion.*;
import net.mcreator.cubicfruits.CubicFruitsMod;

public class CubicFruitsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CubicFruitsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> TEKKAI_CD = REGISTRY.register("tekkai_cd", () -> new TekkaiCDMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABILITY_1_CD = REGISTRY.register("ability_1_cd", () -> new Ability1CDMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABILITY_2_CD = REGISTRY.register("ability_2_cd", () -> new Ability2CDMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABILITY_3_CD = REGISTRY.register("ability_3_cd", () -> new Ability3CDMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABILITY_4_CD = REGISTRY.register("ability_4_cd", () -> new Ability4CDMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABILITY_5_CD = REGISTRY.register("ability_5_cd", () -> new Ability5CDMobEffect());
}