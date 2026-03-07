package net.mcreator.cubicfruits.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cubicfruits.world.inventory.GameWikiMainMenu;
import net.mcreator.cubicfruits.init.CubicFruitsModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class GameWikiMainScreen extends AbstractContainerScreen<GameWikiMainMenu> implements CubicFruitsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_search;
	Button button_fighting;
	Button button_mechanics;
	Button button_etc;

	public GameWikiMainScreen(GameWikiMainMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("cubic_fruits:textures/screens/game_wiki_main.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.cubic_fruits.game_wiki_main.label_cubic_fruits_wiki"), 53, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cubic_fruits.game_wiki_main.label_select_stuff_here"), 52, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cubic_fruits.game_wiki_main.label_or_put_an_item_here_and_search"), 23, 49, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_search = Button.builder(Component.translatable("gui.cubic_fruits.game_wiki_main.button_search"), e -> {
		}).bounds(this.leftPos + 113, this.topPos + 61, 56, 20).build();
		this.addRenderableWidget(button_search);
		button_fighting = Button.builder(Component.translatable("gui.cubic_fruits.game_wiki_main.button_fighting"), e -> {
		}).bounds(this.leftPos + 4, this.topPos + 25, 67, 20).build();
		this.addRenderableWidget(button_fighting);
		button_mechanics = Button.builder(Component.translatable("gui.cubic_fruits.game_wiki_main.button_mechanics"), e -> {
		}).bounds(this.leftPos + 75, this.topPos + 25, 72, 20).build();
		this.addRenderableWidget(button_mechanics);
		button_etc = Button.builder(Component.translatable("gui.cubic_fruits.game_wiki_main.button_etc"), e -> {
		}).bounds(this.leftPos + 152, this.topPos + 24, 40, 20).build();
		this.addRenderableWidget(button_etc);
	}
}