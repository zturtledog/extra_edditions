
package net.twallowhavenstudios.extraadditions.gui;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
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
public class ComputerGUIGuiWindow extends ContainerScreen<ComputerGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = ComputerGUIGui.guistate;
	TextFieldWidget path;
	TextFieldWidget file;
	public ComputerGUIGuiWindow(ComputerGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 234;
		this.ySize = 167;
	}
	private static final ResourceLocation texture = new ResourceLocation("extra_additions:textures/computer_gui.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		path.render(ms, mouseX, mouseY, partialTicks);
		file.render(ms, mouseX, mouseY, partialTicks);
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
		if (path.isFocused())
			return path.keyPressed(key, b, c);
		if (file.isFocused())
			return file.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		path.tick();
		file.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "computer", 115, 6, -12829636);
		this.font.drawString(ms, "inventory", 12, 7, -12829636);
		this.font.drawString(ms, "path: " + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "path")) + "", 71, 21, -12829636);
		this.font.drawString(ms, "modifiers", 184, 12, -12829636);
		this.font.drawString(ms, "file: " + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "file")) + "", 71, 50, -12829636);
		this.font.drawString(ms, "0", 14, 29, -12829636);
		this.font.drawString(ms, "1", 32, 29, -12829636);
		this.font.drawString(ms, "2", 50, 29, -12829636);
		this.font.drawString(ms, "3", 14, 47, -12829636);
		this.font.drawString(ms, "4", 32, 47, -12829636);
		this.font.drawString(ms, "5", 50, 46, -12829636);
		this.font.drawString(ms, "6", 14, 64, -12829636);
		this.font.drawString(ms, "7", 32, 64, -12829636);
		this.font.drawString(ms, "8", 49, 64, -12829636);
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
		path = new TextFieldWidget(this.font, this.guiLeft + 71, this.guiTop + 30, 120, 20, new StringTextComponent("path")) {
			{
				setSuggestion("path");
			}
			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("path");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("path");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:path", path);
		path.setMaxStringLength(32767);
		this.children.add(this.path);
		file = new TextFieldWidget(this.font, this.guiLeft + 71, this.guiTop + 60, 120, 20, new StringTextComponent("file name")) {
			{
				setSuggestion("file name");
			}
			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("file name");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("file name");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:file", file);
		file.setMaxStringLength(32767);
		this.children.add(this.file);
		this.addButton(new Button(this.guiLeft + 198, this.guiTop + 93, 30, 20, new StringTextComponent("save"), e -> {
			if (true) {
				ExtraAdditionsMod.PACKET_HANDLER.sendToServer(new ComputerGUIGui.ButtonPressedMessage(0, x, y, z));
				ComputerGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
