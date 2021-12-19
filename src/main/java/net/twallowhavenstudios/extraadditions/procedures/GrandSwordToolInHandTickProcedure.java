package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class GrandSwordToolInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure GrandSwordToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() == 0.1 && Math.random() == 0.1) {
			entity.setFire((int) 2);
		}
	}
}
