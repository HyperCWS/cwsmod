package cwsmod.RBlock;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static RBlock rblock = new RBlock();
	public static ItemBlock irblock = (ItemBlock) new ItemBlock(rblock).setRegistryName(rblock.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(rblock);
		GameRegistry.register(irblock);
	}

}
