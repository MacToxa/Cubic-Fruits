package net.mcreator.cubicfruits.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cubicfruits.network.CubicFruitsModVariables;

public class MasteryCheckScriptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Mastery:"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Six Powers:"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Iron Body: " + entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).tekkaiMasteryPercent)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Moonwalk: " + entity.getData(CubicFruitsModVariables.PLAYER_VARIABLES).geppoMasteryPercent)), false);
	}
}