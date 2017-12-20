package strongWoolMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockStrongWoolLevel5 extends Block {
	public BlockStrongWoolLevel5() {
		super(Material.cloth);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("strongWoolLevel5");
		setBlockTextureName("wool_colored_yellow");
		setStepSound(Block.soundTypeCloth);
		setHardness(0.8F);
		setLightLevel(1.0F); // Level 5は光源として！
		setResistance(2000.0F);
	}

	@Override
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