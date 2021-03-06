package strongWoolMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockStrongWoolLevel1 extends Block {
	public BlockStrongWoolLevel1() {
		super(Material.cloth);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("strongWoolLevel1");
		setBlockTextureName("wool_colored_brown");
		/*
		 * どこかのディレクトリを指定するのかと思いきや、 テクスチャに登録されているファイル名を引用するだけだった！
		 */
		setStepSound(Block.soundTypeCloth);
		setHardness(0.8F);
		setResistance(2000.0F); // 爆破耐性抜群！TNTでも壊れない！
	}

	@Override // ←基底クラスで定義されたメソッドを上書きしちゃいます宣言
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX,
			float posY, float posZ) {
		// *5
		return false;
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		// *6
	}

	@Override
	public int quantityDropped(Random random) {
		// *7
		return 1;
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock) {
		// 周囲のブロックが更新された際の動作
	}

}