package strongWoolMod;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemBlock;

public class ItemBlockStrongWoolLevel2 extends ItemBlock {

	public ItemBlockStrongWoolLevel2(Block block) {
		super(block);
		this.maxStackSize = 64;

	}

	@Override
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
				new AttributeModifier(field_111210_e, "Weapon modifier", 5.0D, 0));
		return multimap;
	}
}