package cwsmod.sign;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ICwsign,0,
				new ModelResourceLocation("cwsmod:cwsign", "inventory"));
	}
}
