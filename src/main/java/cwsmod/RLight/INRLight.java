package cwsmod.RLight;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class INRLight extends ItemBlock {
	public INRLight(Block block) {
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
		NRLight.EnumColour colour = NRLight.EnumColour.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + colour.toString();
	}
}
