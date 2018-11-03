package cwsmod.RLight;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preinitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irlight, 0,
				new ModelResourceLocation("cwsmod:RoadLight", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.inrlight, NRLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:RoadLight2_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.inrlight, NRLight.EnumColour.BLUE.getMetadata(),
				new ModelResourceLocation("cwsmod:RoadLight2_b", "inventory"));
	}

}
