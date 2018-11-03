package cwsmod.Line.bend;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ITBendLine extends ItemBlock {
	public ITBendLine(Block block) {
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
		TBendLine.EnumColour colour = TBendLine.EnumColour.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + colour.toString();
	}
}
