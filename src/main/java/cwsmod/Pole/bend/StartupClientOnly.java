package cwsmod.Pole.bend;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IBendPole, TBendPole.EnumColour.A.getMetadata(),
				new ModelResourceLocation("cwsmod:BendPole_a", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IBendPole, TBendPole.EnumColour.B.getMetadata(),
				new ModelResourceLocation("cwsmod:BendPole_b", "inventory"));
	}
}
