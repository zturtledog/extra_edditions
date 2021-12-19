package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.gui.HomeGui;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import java.util.Map;
import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class SearchWikiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure SearchWiki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure SearchWiki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure SearchWiki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure SearchWiki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure SearchWiki!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency guistate for procedure SearchWiki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		String inp = "";
		inp = (new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:search");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText());
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
				NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
					@Override
					public ITextComponent getDisplayName() {
						return new StringTextComponent("Home");
					}

					@Override
					public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
						return new HomeGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		entity.getPersistentData().putString("descriptionln1", "");
		entity.getPersistentData().putString("descriptionln2", "");
		entity.getPersistentData().putString("descriptionln3", "");
		entity.getPersistentData().putString("descriptionln4", " ");
		entity.getPersistentData().putString("descriptionln5", " ");
		entity.getPersistentData().putString("descriptionln6", " ");
		entity.getPersistentData().putString("descriptionln7", " ");
		entity.getPersistentData().putString("descriptionln8", " ");
		entity.getPersistentData().putString("descriptionln9", " ");
		if ((inp).equals("Assembler")) {
			entity.getPersistentData().putString("name", "Assembler");
			entity.getPersistentData().putString("catagory", "machines");
			entity.getPersistentData().putString("descriptionln1", "Your first venture into the");
			entity.getPersistentData().putString("descriptionln2", "computer industry, it is required");
			entity.getPersistentData().putString("descriptionln3", "for anything more advanced");
			entity.getPersistentData().putString("descriptionln4", "than a disk of iron, it takes 3");
			entity.getPersistentData().putString("descriptionln5", "TPT per cycle.");
		} else if ((inp).equals("Wafer Cutter")) {
			entity.getPersistentData().putString("name", "Wafer Cutter");
			entity.getPersistentData().putString("catagory", "machines");
			entity.getPersistentData().putString("descriptionln1", "this is the cutter of");
			entity.getPersistentData().putString("descriptionln2", "frisbees and fingers,");
			entity.getPersistentData().putString("descriptionln3", "it will let you bake the basics");
			entity.getPersistentData().putString("descriptionln4", "of transistors and other small");
			entity.getPersistentData().putString("descriptionln5", "parts");
		} else if ((inp).equals("Extractor")) {
			entity.getPersistentData().putString("name", "Extractor");
			entity.getPersistentData().putString("catagory", "machines");
			entity.getPersistentData().putString("descriptionln1", "this powerfull machine");
			entity.getPersistentData().putString("descriptionln2", "alows you to extract");
			entity.getPersistentData().putString("descriptionln3", "materials from");
			entity.getPersistentData().putString("descriptionln4", "simpler things such as");
			entity.getPersistentData().putString("descriptionln5", "biopolymer and silicon");
			entity.getPersistentData().putString("descriptionln6", "it is your first step into the ");
			entity.getPersistentData().putString("descriptionln7", "world of prossesing");
		} else {
			entity.getPersistentData().putString("name", "error");
			entity.getPersistentData().putString("catagory", "error");
			entity.getPersistentData().putString("descriptionln1", ("the entry: " + inp + " has not been found"));
			entity.getPersistentData().putString("descriptionln2", "the spelling and capitilazation must be");
			entity.getPersistentData().putString("descriptionln2", "prsise or you might get this screen");
		}
	}
}
