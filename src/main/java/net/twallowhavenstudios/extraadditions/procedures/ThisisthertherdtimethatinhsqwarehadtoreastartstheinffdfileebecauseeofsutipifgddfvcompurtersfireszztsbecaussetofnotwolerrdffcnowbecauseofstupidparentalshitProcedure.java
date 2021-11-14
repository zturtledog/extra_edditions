package net.twallowhavenstudios.extraadditions.procedures;

import net.twallowhavenstudios.extraadditions.ExtraAdditionsMod;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.block.BlockState;

import java.util.Map;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;

public class ThisisthertherdtimethatinhsqwarehadtoreastartstheinffdfileebecauseeofsutipifgddfvcompurtersfireszztsbecaussetofnotwolerrdffcnowbecauseofstupidparentalshitProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExtraAdditionsMod.LOGGER.warn(
						"Failed to load dependency x for procedure Thisisthertherdtimethatinhsqwarehadtoreastartstheinffdfileebecauseeofsutipifgddfvcompurtersfireszztsbecaussetofnotwolerrdffcnowbecauseofstupidparentalshit!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExtraAdditionsMod.LOGGER.warn(
						"Failed to load dependency y for procedure Thisisthertherdtimethatinhsqwarehadtoreastartstheinffdfileebecauseeofsutipifgddfvcompurtersfireszztsbecaussetofnotwolerrdffcnowbecauseofstupidparentalshit!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExtraAdditionsMod.LOGGER.warn(
						"Failed to load dependency z for procedure Thisisthertherdtimethatinhsqwarehadtoreastartstheinffdfileebecauseeofsutipifgddfvcompurtersfireszztsbecaussetofnotwolerrdffcnowbecauseofstupidparentalshit!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExtraAdditionsMod.LOGGER.warn(
						"Failed to load dependency world for procedure Thisisthertherdtimethatinhsqwarehadtoreastartstheinffdfileebecauseeofsutipifgddfvcompurtersfireszztsbecaussetofnotwolerrdffcnowbecauseofstupidparentalshit!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double E = 0;
		String instruction = "";
		String register = "";
		String type = "";
		String all = "";
		String value = "";
		String AS = "";
		String BS = "";
		String CS = "";
		String DS = "";
		String ES = "";
		if ((new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "active"))) {
			File file = new File((new Object() {
				public String getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "path")), File.separator + (new Object() {
				public String getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "file")));
			try {
				BufferedReader fileReader = new BufferedReader(new FileReader(file));
				String stringiterator = "";
				while ((stringiterator = fileReader.readLine()) != null) {
					instruction = (String) (stringiterator.substring((int) 1, (int) 4));
					register = (String) (stringiterator.substring((int) 4, (int) 5));
					type = (String) (stringiterator.substring((int) 0, (int) 1));
					value = (String) (stringiterator.substring((int) 6, (int) (stringiterator).length()));
					all = (String) ((type) + "" + (instruction) + "" + (register));
					value = (String) (value.replace("[AN]", ("" + (A))));
					value = (String) (value.replace("[BN]", ("" + (B))));
					value = (String) (value.replace("[CN]", ("" + (C))));
					value = (String) (value.replace("[DN]", ("" + (D))));
					value = (String) (value.replace("[EN]", ("" + (E))));
					value = (String) (value.replace("[AS]", AS));
					value = (String) (value.replace("[BS]", BS));
					value = (String) (value.replace("[CS]", CS));
					value = (String) (value.replace("[DS]", DS));
					value = (String) (value.replace("[ES]", ES));
					value = (String) (value.replace("[X0]", ("" + ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "X0"))))));
					value = (String) (value.replace("[Y0]", ("" + ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "Y0"))))));
					value = (String) (value.replace("[Z0]", ("" + ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "Z0"))))));
					value = (String) (value.replace("[X1]", ("" + ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "X1"))))));
					value = (String) (value.replace("[Y1]", ("" + ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "Y1"))))));
					value = (String) (value.replace("[Z1]", ("" + ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "Z1"))))));
					if (((instruction).equals("nbt"))) {
						if (((type).equals("S"))) {
							if (((register).equals("A"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putString(value, AS);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("B"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putString(value, BS);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("C"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putString(value, CS);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("D"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putString(value, DS);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("E"))) {
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
						} else if (((type).equals("N"))) {
							if (((register).equals("A"))) {
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
							if (((register).equals("B"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble(value, B);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("C"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble(value, C);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("D"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble(value, D);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							if (((register).equals("E"))) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble(value, E);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
						}
					}
					if (((instruction).equals("set"))) {
						if (((type).equals("S"))) {
							if (((register).equals("A"))) {
								AS = (String) value;
							}
							if (((register).equals("B"))) {
								BS = (String) value;
							}
							if (((register).equals("C"))) {
								CS = (String) value;
							}
							if (((register).equals("D"))) {
								DS = (String) value;
							}
							if (((register).equals("E"))) {
								ES = (String) value;
							}
						} else if (((type).equals("N"))) {
							if (((register).equals("A"))) {
								A = (double) new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value);
							}
							if (((register).equals("B"))) {
								B = (double) new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value);
							}
							if (((register).equals("C"))) {
								C = (double) new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value);
							}
							if (((register).equals("D"))) {
								D = (double) new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value);
							}
							if (((register).equals("E"))) {
								E = (double) new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value);
							}
						}
					}
					if (((instruction).equals("get"))) {
						if (((type).equals("S"))) {
							if (((register).equals("A"))) {
								AS = (String) (new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("B"))) {
								BS = (String) (new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("C"))) {
								CS = (String) (new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("D"))) {
								DS = (String) (new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("E"))) {
								ES = (String) (new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
						} else if (((type).equals("N"))) {
							if (((register).equals("A"))) {
								A = (double) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("B"))) {
								B = (double) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("C"))) {
								C = (double) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("D"))) {
								D = (double) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
							if (((register).equals("E"))) {
								E = (double) (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), value));
							}
						}
					}
					if (((instruction).equals("eql"))) {
						if (((type).equals("S"))) {
							if (((register).equals("A"))) {
								if (((value).equals(AS))) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("B"))) {
								if (((value).equals(BS))) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("C"))) {
								if (((value).equals(CS))) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("D"))) {
								if (((value).equals(DS))) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("E"))) {
								if (((value).equals(ES))) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
						} else if (((type).equals("N"))) {
							if (((register).equals("A"))) {
								if ((new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value) == A)) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("B"))) {
								if ((new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value) == B)) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("C"))) {
								if ((new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value) == C)) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("D"))) {
								if ((new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value) == D)) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
							if (((register).equals("E"))) {
								if ((new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(value) == E)) {
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
											}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "F1")));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							}
						}
					}
					if (((all).equals("setX0"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("X0", new Object() {
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
					}
					if (((all).equals("setY0"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("Y0", new Object() {
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
					}
					if (((all).equals("setZ0"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("Z0", new Object() {
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
					}
					if (((all).equals("setX1"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("X1", new Object() {
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
					}
					if (((all).equals("setY1"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("Y1", new Object() {
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
					}
					if (((all).equals("setZ1"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("Z1", new Object() {
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
					}
					if (((all).equals("setF1"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putString("F1", value);
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
					if (((all).equals("print"))) {
						if (!world.isRemote()) {
							MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
							if (mcserv != null)
								mcserv.getPlayerList().func_232641_a_(new StringTextComponent(value), ChatType.SYSTEM, Util.DUMMY_UUID);
						}
					}
					if (((all).equals("usrlg"))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putString("usrlog", ((value) + "" + ("\n") + "" + ((new Object() {
									public String getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getString(tag);
										return "";
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "tagName")))));
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
