package net.mcreator.cubicfruits.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cubicfruits.network.CubicFruitsModVariables;
import net.mcreator.cubicfruits.init.CubicFruitsModItems;

public class DumbbellUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiUsable == false) {
			{
				CubicFruitsModVariables.PlayerVariables _vars = entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES);
				_vars.tekkaiUsable = true;
				_vars.tekkaiMasteryLevel = 1;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You upgraded your Iron Body!"), true);
		} else if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryLevel == 1) {
			if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryPercent == 100) {
				{
					CubicFruitsModVariables.PlayerVariables _vars = entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES);
					_vars.tekkaiMasteryPercent = 0;
					_vars.tekkaiMasteryLevel = 2;
					_vars.markSyncDirty();
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You upgraded your Iron Body!"), true);
			}
		} else if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryLevel == 2) {
			if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryPercent == 100) {
				{
					CubicFruitsModVariables.PlayerVariables _vars = entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES);
					_vars.tekkaiMasteryPercent = 0;
					_vars.tekkaiMasteryLevel = 3;
					_vars.markSyncDirty();
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You upgraded your Iron Body!"), true);
			}
		} else if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryLevel == 3) {
			if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryPercent == 100) {
				{
					CubicFruitsModVariables.PlayerVariables _vars = entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES);
					_vars.tekkaiMasteryPercent = 0;
					_vars.tekkaiMasteryLevel = 4;
					_vars.markSyncDirty();
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You upgraded your Iron Body!"), true);
			}
		} else if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryLevel == 4) {
			if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryPercent == 100) {
				{
					CubicFruitsModVariables.PlayerVariables _vars = entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES);
					_vars.tekkaiMasteryPercent = 0;
					_vars.tekkaiMasteryLevel = 5;
					_vars.markSyncDirty();
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You upgraded your Iron Body!"), true);
			}
		} else if (entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryLevel == 5) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You already mastered Iron Body (Tekkai)"), true);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CubicFruitsModItems.DUMBBELL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You haven't met the conditions to upgrade/unlock Iron Body "), true);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CubicFruitsModItems.DUMBBELL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}