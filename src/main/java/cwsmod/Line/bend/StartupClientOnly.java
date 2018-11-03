package cwsmod.Line.bend;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IBendLine, TBendLine.EnumColour.WHITE.getMetadata(),
				new ModelResourceLocation("cwsmod:BendLine", "inventory"));
	}
}
