package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraft.world.IWorld;

import java.util.Map;
import java.util.HashMap;

public class UnaryMeterUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure UnaryMeterUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure UnaryMeterUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure UnaryMeterUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure UnaryMeterUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			CableProcedure.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			PipeProcedure.executeProcedure($_dependencies);
		}
	}
}
