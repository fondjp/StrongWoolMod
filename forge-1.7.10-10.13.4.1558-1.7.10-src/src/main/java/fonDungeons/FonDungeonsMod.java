package fonDungeons;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = FonDungeonsMod.modid, name = FonDungeonsMod.modid, version = "0.0.1")
public class FonDungeonsMod {

	public static final String modid = "FonDungeons";

	// @EventHandler
	// public void init(FMLInitializationEvent event) {
	// // チャンク生成時に追加構造物の生成が行われるようにフック
	// MinecraftForge.EVENT_BUS.register(new SampleDungeonEventHandler());
	//
	// // 構造物・構成パーツは名前をMapGenStructureIOに登録しなければならない
	// MapGenStructureIO.func_143034_b(StructureSampleDungeonStart.class,
	// "SampleDungeon");
	// MapGenStructureIO.func_143031_a(ComponentSampleDungeon1.class, "SD1");
	// MapGenStructureIO.func_143031_a(ComponentSampleDungeon2.class, "SD2");
	// MapGenStructureIO.func_143031_a(ComponentSampleDungeon3.class, "SD3");
	// MapGenStructureIO.func_143031_a(ComponentSampleDungeon4.class, "SD4");
	// }
}