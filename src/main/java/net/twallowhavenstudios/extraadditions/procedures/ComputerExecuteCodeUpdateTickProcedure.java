package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.item.ModifiermanipulateItem;
import net.twallowhavenstudios.extraadditions.item.ModifierlogisticsItem;
import net.twallowhavenstudios.extraadditions.item.ModifierfilesystemItem;
import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class ComputerExecuteCodeUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure ComputerExecuteCodeUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure ComputerExecuteCodeUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure ComputerExecuteCodeUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExtraAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure ComputerExecuteCodeUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		String instruction = "";
		String type = "";
		String registry = "";
		String value = "";
		String fif = "";
		String AS = "";
		String BS = "";
		String CS = "";
		String DS = "";
		String ES = "";
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double E = 0;
		File file = new File((new Object() {
			public String getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "path")), File.separator + ((new Object() {
			public String getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file")) + ".cbb"));
		ExtraAdditionsMod.LOGGER.info((new Object() {
			public String getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file")));
		if (new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "active")) {
			try {
				BufferedReader fileReader = new BufferedReader(new FileReader(file));
				String stringiterator = "";
				while ((stringiterator = fileReader.readLine()) != null) {
					ExtraAdditionsMod.LOGGER.info(stringiterator);
					instruction = (stringiterator.substring((int) 0, (int) 5));
					type = (stringiterator.substring((int) 0, (int) 1));
					fif = (stringiterator.substring((int) 1, (int) 4));
					registry = (stringiterator.substring((int) 4, (int) 5));
					value = (stringiterator.substring((int) 6, (int) (stringiterator).length()));
					if (!((stringiterator).length() < 6)) {
						if ((fif).equals("nbt")) {
							if ((type).equals("N")) {
								if ((type).equals("A")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble(value, A);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("B")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble(value, A);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("C")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble(value, A);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("D")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble(value, A);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("E")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble(value, A);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							} else if ((type).equals("S")) {
								if ((type).equals("A")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putString(value, AS);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("B")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putString(value, BS);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("C")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putString(value, CS);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("D")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putString(value, DS);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								} else if ((type).equals("E")) {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putString(value, ES);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
						} else if ((fif).equals("set")) {
							if ((type).equals("N")) {
								if ((type).equals("A")) {
									A = new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value);
								} else if ((type).equals("B")) {
									B = new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value);
								} else if ((type).equals("C")) {
									C = new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value);
								} else if ((type).equals("D")) {
									D = new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value);
								} else if ((type).equals("E")) {
									E = new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value);
								}
							} else if ((type).equals("S")) {
								if ((type).equals("A")) {
									AS = value;
								} else if ((type).equals("B")) {
									BS = value;
								} else if ((type).equals("C")) {
									CS = value;
								} else if ((type).equals("D")) {
									DS = value;
								} else if ((type).equals("E")) {
									ES = value;
								}
							}
						} else if ((fif).equals("get")) {
							if ((type).equals("N")) {
								if ((type).equals("A")) {
									A = (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("B")) {
									B = (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("C")) {
									C = (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("D")) {
									D = (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("E")) {
									E = (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								}
							} else if ((type).equals("S")) {
								if ((type).equals("A")) {
									AS = (new Object() {
										public String getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getString(tag);
											return "";
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("B")) {
									BS = (new Object() {
										public String getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getString(tag);
											return "";
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("C")) {
									CS = (new Object() {
										public String getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getString(tag);
											return "";
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("D")) {
									DS = (new Object() {
										public String getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getString(tag);
											return "";
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								} else if ((type).equals("E")) {
									ES = (new Object() {
										public String getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getString(tag);
											return "";
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
								}
							}
						} else if ((fif).equals("eql")) {
							if ((type).equals("N")) {
								if ((type).equals("A")) {
									if (A == new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("B")) {
									if (B == new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("C")) {
									if (C == new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("D")) {
									if (D == new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("E")) {
									if (E == new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								}
							} else if ((type).equals("S")) {
								if ((type).equals("A")) {
									if ((value).equals(AS)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("B")) {
									if ((value).equals(BS)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("C")) {
									if ((value).equals(CS)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("D")) {
									if ((value).equals(DS)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								} else if ((type).equals("E")) {
									if ((value).equals(ES)) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putString("file", (new Object() {
													public String getValue(IWorld world, BlockPos pos, String tag) {
														TileEntity tileEntity = world.getTileEntity(pos);
														if (tileEntity != null)
															return tileEntity.getTileData().getString(tag);
														return "";
													}
												}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file1")));
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
									}
								}
							}
						} else if ((instruction).equals("setX0")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("sys.X0", new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("setY0")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("sys.Y0", new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("setZ0")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("sys.Z0", new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("setX1")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("sys.X1", new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("setY1")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("sys.Y1", new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("setZ1")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("sys.Z1", new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("setF1")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putString("sys.file1", value);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("print")) {
							if (!world.isRemote()) {
								MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
								if (mcserv != null)
									mcserv.getPlayerList().func_232641_a_(new StringTextComponent(value), ChatType.SYSTEM, Util.DUMMY_UUID);
							}
						} else if ((instruction).equals("usrlg")) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putString("usrlg", ((new Object() {
										public String getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getString(tag);
											return "";
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "usrlg")) + "" + value));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						} else if ((instruction).equals("mvBsi")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifierlogisticsItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifierlogisticsItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifierlogisticsItem.block) {
								if (!world.isRemote()) {
									MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
									if (mcserv != null)
										mcserv.getPlayerList().func_232641_a_(new StringTextComponent(value), ChatType.SYSTEM, Util.DUMMY_UUID);
								}
							}
						} else if ((instruction).equals("mvIsi")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifierlogisticsItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifierlogisticsItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifierlogisticsItem.block) {
								if (!world.isRemote()) {
									MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
									if (mcserv != null)
										mcserv.getPlayerList().func_232641_a_(new StringTextComponent(value), ChatType.SYSTEM, Util.DUMMY_UUID);
								}
							}
						} else if ((instruction).equals("trsid")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifierlogisticsItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifierlogisticsItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifierlogisticsItem.block) {
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.X0")), (int) (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Y0")), (int) (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Z0"))));
									if (_ent != null) {
										final int _sltid = (int) (new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(value));
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, ItemStack.EMPTY);
											}
										});
									}
								}
							}
						} else if ((instruction).equals("bplce")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifiermanipulateItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifiermanipulateItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifiermanipulateItem.block) {
								if ((world.getBlockState(new BlockPos((int) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.X0")), (int) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Y0")), (int) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Z0"))))).getBlock() == Blocks.AIR) {
									world.setBlockState(new BlockPos((int) (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.X0")), (int) (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Y0")), (int) (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Z0"))), (new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(value)))))), 3);
								}
							}
						} else if ((instruction).equals("bdsry")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifiermanipulateItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifiermanipulateItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifiermanipulateItem.block) {
								if ((0 == new Object() {
									public int getAmount(IWorld world, BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value))) || (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value)))).getItem() == (new ItemStack((world.getBlockState(new BlockPos((int) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.X0")), (int) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Y0")), (int) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Z0"))))).getBlock())).getItem())
										&& !((world.getBlockState(new BlockPos((int) (new Object() {
											public double getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.X0")), (int) (new Object() {
											public double getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Y0")), (int) (new Object() {
											public double getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Z0"))))).getBlock() == Blocks.AIR)) {
									{
										TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
										if (_ent != null) {
											final int _sltid = (int) (new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(value));
											final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (new Object() {
												public double getValue(IWorld world, BlockPos pos, String tag) {
													TileEntity tileEntity = world.getTileEntity(pos);
													if (tileEntity != null)
														return tileEntity.getTileData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.X0")), (int) (new Object() {
												public double getValue(IWorld world, BlockPos pos, String tag) {
													TileEntity tileEntity = world.getTileEntity(pos);
													if (tileEntity != null)
														return tileEntity.getTileData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Y0")), (int) (new Object() {
												public double getValue(IWorld world, BlockPos pos, String tag) {
													TileEntity tileEntity = world.getTileEntity(pos);
													if (tileEntity != null)
														return tileEntity.getTileData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "sys.Z0"))))).getBlock()));
											_setstack.setCount((int) (1 + new Object() {
												public int getAmount(IWorld world, BlockPos pos, int sltid) {
													AtomicInteger _retval = new AtomicInteger(0);
													TileEntity _ent = world.getTileEntity(pos);
													if (_ent != null) {
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> {
																	_retval.set(capability.getStackInSlot(sltid).getCount());
																});
													}
													return _retval.get();
												}
											}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(value)))));
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
												}
											});
										}
									}
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
								}
							}
						} else if ((instruction).equals("stfle")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifierfilesystemItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifierfilesystemItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifierfilesystemItem.block) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putString("file", value);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
						} else if ((instruction).equals("wrtlg")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifierfilesystemItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifierfilesystemItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifierfilesystemItem.block) {
								File log = new File(value, File.separator + "log-");
								if (!log.exists()) {
									try {
										log.createNewFile();
									} catch (IOException exception) {
										exception.printStackTrace();
									}
								}
								try {
									FileWriter logwriter = new FileWriter(log);
									BufferedWriter logbw = new BufferedWriter(logwriter);

									{
										logbw.write((new Object() {
											public String getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getString(tag);
												return "";
											}
										}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "log")));
									}
									logbw.close();
									logwriter.close();
								} catch (FileNotFoundException fileNotFoundException) {
									fileNotFoundException.printStackTrace();
								} catch (IOException exception) {
									exception.printStackTrace();
								}
							}
						} else if ((instruction).equals("sUsrL")) {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == ModifierfilesystemItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10))).getItem() == ModifierfilesystemItem.block
									|| (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11))).getItem() == ModifierfilesystemItem.block) {
								File usrlog = new File(((new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "path")) + "/logs"), File.separator + value);
								if (!usrlog.exists()) {
									try {
										usrlog.createNewFile();
									} catch (IOException exception) {
										exception.printStackTrace();
									}
								}
								try {
									FileWriter usrlogwriter = new FileWriter(usrlog);
									BufferedWriter usrlogbw = new BufferedWriter(usrlogwriter);

									{
										usrlogbw.write((new Object() {
											public String getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getString(tag);
												return "";
											}
										}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "usrlg")));
									}
									usrlogbw.close();
									usrlogwriter.close();
								} catch (FileNotFoundException fileNotFoundException) {
									fileNotFoundException.printStackTrace();
								} catch (IOException exception) {
									exception.printStackTrace();
								}
							}
						} else {
							if (!world.isRemote()) {
								MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
								if (mcserv != null)
									mcserv.getPlayerList().func_232641_a_(new StringTextComponent(
											"this command was not recognized, this may be due to misspellings or the command not existing, for the code reference see https://github.com/zturtledog/extra_edditions/wiki/cee-blunt-blunt-reference "),
											ChatType.SYSTEM, Util.DUMMY_UUID);
							}
						}
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putString("file1", ("instruction:" + instruction + "value:" + value + "\n" + (new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "log"))));
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				}
				fileReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
