/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cubicfruits.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.cubicfruits.network.TekkaiMessage;
import net.mcreator.cubicfruits.network.MasteryCheckMessage;
import net.mcreator.cubicfruits.network.GameWikiMessage;

@EventBusSubscriber(Dist.CLIENT)
public class CubicFruitsModKeyMappings {
	public static final KeyMapping TEKKAI = new KeyMapping("key.cubic_fruits.tekkai", GLFW.GLFW_KEY_H, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new TekkaiMessage(0, 0));
				TekkaiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GAME_WIKI = new KeyMapping("key.cubic_fruits.game_wiki", GLFW.GLFW_KEY_F6, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new GameWikiMessage(0, 0));
				GameWikiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MASTERY_CHECK = new KeyMapping("key.cubic_fruits.mastery_check", GLFW.GLFW_KEY_F7, "key.categories.cubicfruits") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new MasteryCheckMessage(0, 0));
				MasteryCheckMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TEKKAI);
		event.register(GAME_WIKI);
		event.register(MASTERY_CHECK);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				TEKKAI.consumeClick();
				GAME_WIKI.consumeClick();
				MASTERY_CHECK.consumeClick();
			}
		}
	}
}