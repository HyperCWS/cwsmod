package cwsmod.Pole;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipc, 0,
				new ModelResourceLocation("cwsmod:PoleC", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipd, 0,
				new ModelResourceLocation("cwsmod:PoleD", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipl, 0,
				new ModelResourceLocation("cwsmod:PoleL", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipt, 0,
				new ModelResourceLocation("cwsmod:PoleT", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipm, 0,
				new ModelResourceLocation("cwsmod:PoleM", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.irf, 0,
				new ModelResourceLocation("cwsmod:RoadFence", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipa, 0,
				new ModelResourceLocation("cwsmod:PoleA", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipb, 0,
				new ModelResourceLocation("cwsmod:PoleB", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipe, 0,
				new ModelResourceLocation("cwsmod:PoleE", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipf, 0,
				new ModelResourceLocation("cwsmod:PoleF", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ipg, 0,
				new ModelResourceLocation("cwsmod:PoleG", "inventory"));
	}
}
