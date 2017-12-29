package cwsmod.TLight;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ITLight extends ItemBlock {
	public ITLight(Block block) {
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
		TLight.EnumColour colour = TLight.EnumColour.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + colour.toString();
	}
}
