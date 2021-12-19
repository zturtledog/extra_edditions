
package net.twallowhavenstudios.extraadditions.gui;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HomeGuiWindow extends ContainerScreen<HomeGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = HomeGui.guistate;
	TextFieldWidget search;

	public HomeGuiWindow(HomeGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 189;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("extra_additions:textures/home.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		search.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		if (search.isFocused())
			return search.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		search.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("name")) + "", 51, 41, -12829636);
		this.font.drawString(ms, "catagory:" + (entity.getPersistentData().getString("catagory")) + "", 5, 55, -12829636);
		this.font.drawString(ms, "discription", 64, 68, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln1")) + "", 7, 78, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln2")) + "", 7, 87, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln3")) + "", 7, 96, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln4")) + "", 7, 105, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln5")) + "", 7, 114, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln6")) + "", 7, 123, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln7")) + "", 7, 131, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln8")) + "", 7, 139, -12829636);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("descriptionln9")) + "", 7, 148, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		search = new TextFieldWidget(this.font, this.guiLeft + 64, this.guiTop + 5, 120, 20, new StringTextComponent("click here to start")) {
			{
				setSuggestion("click here to start");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("click here to start");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("click here to start");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:search", search);
		search.setMaxStringLength(32767);
		this.children.add(this.search);
		this.addButton(new Button(this.guiLeft + 32, this.guiTop + 5, 30, 20, new StringTextComponent("@"), e -> {
			if (true) {
				ExtraAdditionsMod.PACKET_HANDLER.sendToServer(new HomeGui.ButtonPressedMessage(0, x, y, z));
				HomeGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 5, 30, 20, new StringTextComponent("H"), e -> {
			if (true) {
				ExtraAdditionsMod.PACKET_HANDLER.sendToServer(new HomeGui.ButtonPressedMessage(1, x, y, z));
				HomeGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
