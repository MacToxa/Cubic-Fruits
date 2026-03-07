/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cubicfruits.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cubicfruits.client.gui.GameWikiMainScreen;

@EventBusSubscriber(Dist.CLIENT)
public class CubicFruitsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CubicFruitsModMenus.GAME_WIKI_MAIN.get(), GameWikiMainScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}