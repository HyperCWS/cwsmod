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
		ModelLoader.setCustomModelResourceLocation(StartupCommon.bs0, 0,
				new ModelResourceLocation("cwsmod:BStation1", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.bs1, 0,
				new ModelResourceLocation("cwsmod:BStation2", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.br3, 0,
				new ModelResourceLocation("cwsmod:BuildRoad3", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.br5, 0,
				new ModelResourceLocation("cwsmod:BuildRoad5", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.br7, 0,
				new ModelResourceLocation("cwsmod:BuildRoad7", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l0, 0,
				new ModelResourceLocation("cwsmod:PutLight0", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l1, 0,
				new ModelResourceLocation("cwsmod:PutLight1", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l2, 0,
				new ModelResourceLocation("cwsmod:PutLight2", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l3, 0,
				new ModelResourceLocation("cwsmod:PutLight3", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l4, 0,
				new ModelResourceLocation("cwsmod:PutLight4", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l5, 0,
				new ModelResourceLocation("cwsmod:PutLight5", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l6, 0,
				new ModelResourceLocation("cwsmod:PutLight6", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l7, 0,
				new ModelResourceLocation("cwsmod:PutLight7", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l8, 0,
				new ModelResourceLocation("cwsmod:PutLight8", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l9, 0,
				new ModelResourceLocation("cwsmod:PutLight9", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l10, 0,
				new ModelResourceLocation("cwsmod:PutLight10", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l11, 0,
				new ModelResourceLocation("cwsmod:PutLight11", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.l12, 0,
				new ModelResourceLocation("cwsmod:PutLight12", "inventory"));
	}
}
