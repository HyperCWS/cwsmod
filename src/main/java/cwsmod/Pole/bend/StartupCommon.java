package cwsmod.Pole.bend;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static TBendPole BendPole = new TBendPole("BendPole");
	public static ITBendPole IBendPole = (ITBendPole) new ITBendPole(BendPole)
			.setRegistryName(BendPole.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(BendPole);
		GameRegistry.register(IBendPole);
	}
}
