package cwsmod.Tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ppolek5, 0,
				new ModelResourceLocation("cwsmod:PPthick5", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ppolek10, 0,
				new ModelResourceLocation("cwsmod:PPthick10", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ppolen5, 0,
				new ModelResourceLocation("cwsmod:PPthin5", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.plinew, 0,
				new ModelResourceLocation("cwsmod:PLwhite", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.pliney, 0,
				new ModelResourceLocation("cwsmod:PLyellow", "inventory"));
	}
}
