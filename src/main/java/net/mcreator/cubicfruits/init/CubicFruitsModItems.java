/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cubicfruits.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.cubicfruits.item.DumbbellItem;
import net.mcreator.cubicfruits.CubicFruitsMod;

public class CubicFruitsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CubicFruitsMod.MODID);
	public static final DeferredItem<Item> DUMBBELL;
	static {
		DUMBBELL = REGISTRY.register("dumbbell", DumbbellItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}