package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.block.SprinklerBlock;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tags.BlockTags;

import java.util.Map;
import java.util.HashMap;

public class StopCropGrowProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onCropGrowPre(BlockEvent.CropGrowEvent.Pre event) {
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("blockstate", event.getState());
			dependencies.put("world", world);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure StopCropGrow!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure StopCropGrow!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure StopCropGrow!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure StopCropGrow!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double xd = 0;
		double yd = 0;
		double zd = 0;
		boolean is_range = false;
		xd = (x - 5);
		yd = (y - 5);
		zd = (z - 5);
		for (int index0 = 0; index0 < (int) (10); index0++) {
			for (int index1 = 0; index1 < (int) (10); index1++) {
				for (int index2 = 0; index2 < (int) (10); index2++) {
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:valid_crop_liquid"))
							.contains((world.getBlockState(new BlockPos((int) xd, (int) yd, (int) zd))).getBlock())) {
						is_range = (true);
					} else if ((world.getBlockState(new BlockPos((int) xd, (int) yd, (int) zd))).getBlock() == SprinklerBlock.block) {
						if (new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) xd, (int) yd, (int) zd), "sinceLastGrow") > 100) {
							is_range = (true);
							if (world instanceof World)
								((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) z),
										((World) world).getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
						}
					}
					zd = (1 + zd);
				}
				yd = (1 + yd);
			}
			xd = (1 + xd);
		}
		if (!((world.getWorldInfo().isRaining() || is_range) && ((world instanceof World) ? ((World) world).isDaytime() : false))) {
			if (dependencies.get("event") != null) {
				Object _obj = dependencies.get("event");
				if (_obj instanceof Event) {
					Event _evt = (Event) _obj;
					if (_evt.hasResult())
						_evt.setResult(Event.Result.DENY);
				}
			}
		}
	}
}
