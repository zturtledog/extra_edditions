package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.block.CableBlock;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class CableJunctionUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure CableJunctionUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure CableJunctionUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure CableJunctionUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure CableJunctionUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double count = 0;
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == CableBlock.block)) {
			count = (double) (count + 1);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CableBlock.block)) {
			count = (double) (count + 1);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == CableBlock.block)) {
			count = (double) (count + 1);
		}
		if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == CableBlock.block)) {
			count = (double) (count + 1);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == CableBlock.block)) {
			count = (double) (count + 1);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == CableBlock.block)) {
			count = (double) (count + 1);
		}
		ExtraAdditionsMod.LOGGER.info((("cable level:  ") + "" + (count)));
		if ((count < 2)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), CableBlock.block.getDefaultState(), 3);
		}
	}
}
