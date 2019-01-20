package cwsmod.sign;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ICwsign extends ItemBlock {
	public ICwsign(Block block) {
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int metadata) {
		return metadata;
	}
/*
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		Cwsign.EnumColour colour = Cwsign.EnumColour.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + colour.toString();
	}*/
}
