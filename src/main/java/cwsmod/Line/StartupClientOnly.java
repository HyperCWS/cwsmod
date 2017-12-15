package cwsmod.Line;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irwd, 0,
				new ModelResourceLocation("cwsmod:RailWhiteDown", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irwu, 0,
				new ModelResourceLocation("cwsmod:RailWhiteUp", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irwk, 0,
				new ModelResourceLocation("cwsmod:RailWhiteThick", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irwn, 0,
				new ModelResourceLocation("cwsmod:RailWhiteThin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irwt, 0,
				new ModelResourceLocation("cwsmod:RailWhiteTurn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.iryn, 0,
				new ModelResourceLocation("cwsmod:RailYellowThin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.iryk, 0,
				new ModelResourceLocation("cwsmod:RailYellowThick", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.iryd, 0,
				new ModelResourceLocation("cwsmod:RailYellowDouble", "inventory"));
	}
}
