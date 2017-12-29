package cwsmod.RLight;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static RLight rlight = new RLight();
	public static ItemBlock irlight = (ItemBlock) new ItemBlock(rlight).setRegistryName(rlight.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(rlight);
		GameRegistry.register(irlight);
	}

}
