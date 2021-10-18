package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class GrandSwordRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure GrandSwordRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon minecraft:fireball ~ ~2 ~ {ExplosionPower:2} ");
			}
		}
	}
}
