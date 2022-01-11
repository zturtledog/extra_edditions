package net.twallowhavenstudios.extraadditions.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Map;
import java.io.File;
import java.io.FileWriter;
import java.util.Collections;

public class TrefsjProcedure {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			executeProcedure(Collections.emptyMap());
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {//9AD852
		try {
			File wiki = new File(FMLPaths.GAMEDIR.get().toString()+"\\config\\Extra-Edditions\\wiki.dtsp");
			FileWriter wikiWriter = new  FileWriter(FMLPaths.GAMEDIR.get().toString()+"\\config\\Extra-Edditions\\wiki.dtsp");

			if (!wiki.createNewFile()) {
				wikiWriter.write(Wikicontents);
				wikiWriter.close();
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public static String Wikicontents = ":assembler\nname:Assembler\ncatagory:~Machines\n:assembler-dis\n0:Your ~first ~venture ~into ~the\n1:computer ~industry, ~it ~is ~required\n2:for ~anything ~more ~advanced\n3:than ~a ~disk ~of ~iron, ~it ~takes ~3\n4:TPT ~per ~cycle.\n:wafer_cutter\nname:Wafer ~Cutter\ncatagory:~Machines\n:wafer_cutter-dis\n0:this ~is ~the ~cutter ~of\n1:frisbees ~and ~fingers,\n2:it ~will ~let ~you ~make ~the ~basics\n3:of ~transistors ~and ~other ~small\n4:parts\n:extractor\nname:Extractor\ncatagory:~Machines\n:extractor-dis\n0:this ~powerfull ~machine\n1:alows ~you ~to ~extract\n2:materials ~from\n3:simpler ~things ~such ~as\n4:biopolymer ~and ~silicon\n5:it ~is ~your ~first ~step ~into ~the \n6:world ~of ~prossesing";
}
