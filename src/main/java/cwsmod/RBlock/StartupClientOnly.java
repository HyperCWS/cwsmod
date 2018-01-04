package cwsmod.RBlock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preinitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irblock, 0,
				new ModelResourceLocation("cwsmod:RoadBlock", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irw, 0,
				new ModelResourceLocation("cwsmod:RWhite", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.iry, 0,
				new ModelResourceLocation("cwsmod:RYellow", "inventory"));
	}

}
