
package com.techiecrow.xenorite.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.techiecrow.xenorite.world.inventory.XenBookVol1GUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class XenBookVol1GUIScreen extends AbstractContainerScreen<XenBookVol1GUIMenu> {
	private final static HashMap<String, Object> guistate = XenBookVol1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public XenBookVol1GUIScreen(XenBookVol1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("xenorite:textures/screens/book.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + -11, 0, 0, 146, 180, 146, 180);

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Xen Book vol 1", 52, -2, -16777216);
		this.font.draw(poseStack, "The evil that is in", 34, 16, -16777216);
		this.font.draw(poseStack, "this world almost", 34, 25, -16777216);
		this.font.draw(poseStack, "of ignorance and good", 34, 34, -16777216);
		this.font.draw(poseStack, "intentions may do as", 34, 43, -16777216);
		this.font.draw(poseStack, "much harm as", 34, 52, -16777216);
		this.font.draw(poseStack, "malevolence if they", 34, 61, -16777216);
		this.font.draw(poseStack, "lack understanding.", 34, 70, -16777216);
		this.font.draw(poseStack, "-Albert Camus", 70, 142, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
