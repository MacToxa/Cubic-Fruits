/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cubicfruits.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cubicfruits.CubicFruitsMod;

public class CubicFruitsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CubicFruitsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUBIC_FRUITS = REGISTRY.register("cubic_fruits",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cubic_fruits.cubic_fruits")).icon(() -> new ItemStack(Blocks.STONE)).displayItems((parameters, tabData) -> {
				tabData.accept(CubicFruitsModItems.DUMBBELL.get());
			}).withSearchBar().build());
}