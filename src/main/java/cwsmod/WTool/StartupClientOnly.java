package cwsmod.WTool;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.wtcur, 0,
				new ModelResourceLocation("cwsmod:WTCur", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.wtera, 0,
				new ModelResourceLocation("cwsmod:WTEra", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.wthmr, 0,
				new ModelResourceLocation("cwsmod:WTHmr", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.wtcpy, 0,
				new ModelResourceLocation("cwsmod:WTCpy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.wtpst, 0,
				new ModelResourceLocation("cwsmod:WTPst", "inventory"));
	}
}
