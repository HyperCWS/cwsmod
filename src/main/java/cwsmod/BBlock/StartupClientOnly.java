package cwsmod.BBlock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ibblock, 0,
				new ModelResourceLocation("cwsmod:BBlock", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ibnotice, 0,
				new ModelResourceLocation("cwsmod:BNotice", "inventory"));
	}
}
