package net.twallowhavenstudios.extraadditions;

import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import engine.DatascrpItnr;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.entity.Entity;

public class FindWikientr {
	public FindWikientr() {
		//
	}

	public static void find(Entity ent, String inps) {
		DatascrpItnr wiki = new DatascrpItnr();

		try {
			wiki = wiki.load("D:/moda/extra_edditions/src/main/resources/assets/wiki.dtsp");
		} catch (Exception e) {
			System.out.println("wiki not loafed");
			System.out.println(e);
		}

		String inp = inps.replaceAll(" ", "_").toLowerCase();

		addnbt(ent,"name", wiki.get(":"+inp+".name"));
		addnbt(ent,"catagory", wiki.get(":"+inp+".catagory"));
		
		int indx = 0;
		for (DatascrpItnr.idra itr : wiki.getStr(":"+inp+"-dis")) {
			indx++;
			addnbt(ent,"descriptionln"+indx, itr.value);
		}
	}

	public static void addnbt(Entity ent, String tag, String val) {
		ent.getPersistentData().putString(tag, val);
	}
}
