package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class GrandSwordLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure GrandSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 15);
	}
}
