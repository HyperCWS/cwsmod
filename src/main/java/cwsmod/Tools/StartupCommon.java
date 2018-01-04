package cwsmod.Tools;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static PutPole ppolek5 = new PutPole(5, "cwsmod:PoleM", "PPthick5");
	public static PutPole ppolek10 = new PutPole(10, "cwsmod:PoleM", "PPthick10");
	public static PutPole ppolen5 = new PutPole(5, "cwsmod:PoleL", "PPthin5");
	public static PutLine plinew = new PutLine("cwsmod:RailWhiteThin", "PLwhite");
	public static PutLine pliney = new PutLine("cwsmod:RailYellowThin", "PLyellow");

	public static void preInitCommon() {
		GameRegistry.register(ppolen5);
		GameRegistry.register(ppolek5);
		GameRegistry.register(ppolek10);
		GameRegistry.register(pliney);
		GameRegistry.register(plinew);
	}
}
