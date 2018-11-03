package cwsmod.Line.bend;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static TBendLine BendLine = new TBendLine("BendLine");
	public static ITBendLine IBendLine = (ITBendLine) new ITBendLine(BendLine)
			.setRegistryName(BendLine.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(BendLine);
		GameRegistry.register(IBendLine);
	}
}
