package net.twallowhavenstudios.extraadditions;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraft.entity.Entity;
import engine.DatascrpItnr;

public class FindWikientr {
	public FindWikientr() {
		//
	}

	public static void find(Entity ent, String inps) {
		DatascrpItnr wiki = new DatascrpItnr();

		try {
			wiki = wiki.load(FMLPaths.GAMEDIR.get().toString()+"\\config\\Extra-Edditions\\wiki.dtsp");
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
