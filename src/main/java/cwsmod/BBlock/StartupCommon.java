package cwsmod.BBlock;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StartupCommon {
	public static BBlock bblock = new BBlock("BBlock");
	public static ItemBlock ibblock = (ItemBlock) new ItemBlock(bblock).setRegistryName(bblock.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(bblock);
		GameRegistry.register(ibblock);
	}
}