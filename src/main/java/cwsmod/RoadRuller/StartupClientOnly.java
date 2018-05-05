package cwsmod.RoadRuller;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.is, 0,
				new ModelResourceLocation("cwsmod:RoadRuller", "inventory"));
	}
}
