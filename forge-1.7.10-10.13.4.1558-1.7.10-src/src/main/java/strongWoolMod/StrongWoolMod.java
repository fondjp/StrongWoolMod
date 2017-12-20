package strongWoolMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod(modid = StrongWoolMod.MODID, version = StrongWoolMod.VERSION)
public class StrongWoolMod {
	@Mod.Instance("StrongWoolMod")
	public static final String MODID = "Strong Wool Mod";
	public static final String VERSION = "1.4.4";
	public static Block strongWoolLevel1;
	public static Block strongWoolLevel2;
	public static Block strongWoolLevel3;
	public static Block strongWoolLevel4;
	public static Block strongWoolLevel5;
	public static Block strongWoolLevel6;
	public static Block strongWoolLevel7;
	public static Block strongWoolLevel8;
	public static Block strongWoolLevel9;
	public static Block strongWoolLevel10;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		strongWoolLevel1 = new BlockStrongWoolLevel1();
		strongWoolLevel2 = new BlockStrongWoolLevel2();
		strongWoolLevel3 = new BlockStrongWoolLevel3();
		strongWoolLevel4 = new BlockStrongWoolLevel4();
		strongWoolLevel5 = new BlockStrongWoolLevel5();
		strongWoolLevel6 = new BlockStrongWoolLevel6();
		strongWoolLevel7 = new BlockStrongWoolLevel7();
		strongWoolLevel8 = new BlockStrongWoolLevel8();
		strongWoolLevel9 = new BlockStrongWoolLevel9();
		strongWoolLevel10 = new BlockStrongWoolLevel10();
		// 登録する際にItemBlockの情報を押し込む！
		GameRegistry.registerBlock(strongWoolLevel1, ItemBlockStrongWoolLevel1.class, "strongWoolLevel1");
		GameRegistry.registerBlock(strongWoolLevel2, ItemBlockStrongWoolLevel2.class, "strongWoolLevel2");
		GameRegistry.registerBlock(strongWoolLevel3, ItemBlockStrongWoolLevel3.class, "strongWoolLevel3");
		GameRegistry.registerBlock(strongWoolLevel4, ItemBlockStrongWoolLevel4.class, "strongWoolLevel4");
		GameRegistry.registerBlock(strongWoolLevel5, ItemBlockStrongWoolLevel5.class, "strongWoolLevel5");
		GameRegistry.registerBlock(strongWoolLevel6, ItemBlockStrongWoolLevel6.class, "strongWoolLevel6");
		GameRegistry.registerBlock(strongWoolLevel7, ItemBlockStrongWoolLevel7.class, "strongWoolLevel7");
		GameRegistry.registerBlock(strongWoolLevel8, ItemBlockStrongWoolLevel8.class, "strongWoolLevel8");
		GameRegistry.registerBlock(strongWoolLevel9, ItemBlockStrongWoolLevel9.class, "strongWoolLevel9");
		GameRegistry.registerBlock(strongWoolLevel10, ItemBlockStrongWoolLevel10.class, "strongWoolLevel10");
	}

	@EventHandler
	public void Init(FMLInitializationEvent e) {
		Recipe.registry();
		// レシピ登録はレシピクラスで。
	}
}