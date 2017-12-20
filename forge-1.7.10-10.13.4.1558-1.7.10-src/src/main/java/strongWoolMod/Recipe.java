package strongWoolMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipe
{
    public static void registry()
    {
        GameRegistry.addRecipe(
            new ItemStack(StrongWoolMod.strongWoolLevel1, 16),
            new Object[] {
            	"XXX",
                "XYX",
                "XXX",
                'X', Items.wooden_sword,
                'Y', Blocks.wool } );

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel2, 16),
                new Object[] {
                	"XXX",
                    "XYX",
                    "XXX",
                    'X', Items.stone_sword,
                    'Y', StrongWoolMod.strongWoolLevel1 } );

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel3, 16),
                new Object[] {
                	"XXX",
                    "XYX",
                    "XXX",
                    'X', Items.iron_sword,
                    'Y', StrongWoolMod.strongWoolLevel2 } );

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel4, 16),
                new Object[] {
                	"XXX",
                    "XYX",
                    "XXX",
                    'X', Items.diamond_sword,
                    'Y', StrongWoolMod.strongWoolLevel3 } );

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel5, 16),
                new Object[] {
                	"ZXZ",
                    "XYX",
                    "ZXZ",
                    'X', Blocks.glowstone,
                    'Y', StrongWoolMod.strongWoolLevel4,
                    'Z', Items.apple } );

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel5, 16), // 0 → 5の飛躍
                new Object[] {
                	"ZXZ",
                    "XYX",
                    "ZXZ",
                    'Z', Blocks.diamond_block,
                    'Y', Blocks.wool,
                    'Z', Items.golden_apple } );

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel6, 16),
                new Object[] {
                	"ZXZ",
                    "XYX",
                    "ZXZ",
                    'X', Blocks.cactus,
                    'Y', StrongWoolMod.strongWoolLevel5,
                    'Z', Items.blaze_rod } );

        GameRegistry.addRecipe(
                new ItemStack( StrongWoolMod.strongWoolLevel7, 16),
                new Object[] {
                	"ZXZ",
                    "XYX",
                    "ZXZ",
                    'X', Blocks.emerald_ore,
                    'Y', StrongWoolMod.strongWoolLevel6,
                    'Z', Items.feather } );

        GameRegistry.addRecipe(
                new ItemStack( StrongWoolMod.strongWoolLevel8, 16),
                new Object[] {
                	"ZXZ",
                    "XYX",
                    "ZXZ",
                    'X', Blocks.ice,
                    'Y', StrongWoolMod.strongWoolLevel7,
                    'Z', Items.sugar } );

        GameRegistry.addShapelessRecipe(new ItemStack(StrongWoolMod.strongWoolLevel9, 16),
        		Blocks.wool,
        		StrongWoolMod.strongWoolLevel1,
        		StrongWoolMod.strongWoolLevel2,
        		StrongWoolMod.strongWoolLevel3,
        		StrongWoolMod.strongWoolLevel4,
        		StrongWoolMod.strongWoolLevel5,
        		StrongWoolMod.strongWoolLevel6,
        		StrongWoolMod.strongWoolLevel7,
        		StrongWoolMod.strongWoolLevel8
        	);

        GameRegistry.addRecipe(
                new ItemStack(StrongWoolMod.strongWoolLevel10, 16),
                new Object[] {
                	"ZXZ",
                    "XYX",
                    "ZXZ",
                    'X', Blocks.obsidian,
                    'Y', StrongWoolMod.strongWoolLevel9,
                    'Z', Items.water_bucket } );

        return;
    }
}