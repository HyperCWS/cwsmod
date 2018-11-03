package cwsmod.Pole.bend;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ITBendPole extends ItemBlock {
	public ITBendPole(Block block) {
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int metadata) {
		return metadata;
	}
     
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		TBendPole.EnumColour colour = TBendPole.EnumColour.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + colour.toString();
	}
}
