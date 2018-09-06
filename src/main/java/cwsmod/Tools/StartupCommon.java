package cwsmod.Tools;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static PutPole ppolek5 = new PutPole(5, "cwsmod:PoleM", "PPthick5");
	public static PutPole ppolek10 = new PutPole(10, "cwsmod:PoleM", "PPthick10");
	public static PutPole ppolen5 = new PutPole(5, "cwsmod:PoleL", "PPthin5");
	public static PutLine plinew = new PutLine("cwsmod:RailWhiteThin", "PLwhite");
	public static PutLine pliney = new PutLine("cwsmod:RailYellowThin", "PLyellow");
	public static BStation bs0 = new BStation(0, "BStation0");
	public static BStation bs1 = new BStation(1, "BStation1");
	public static BuildRoad br3 = new BuildRoad(3);
	public static BuildRoad br5 = new BuildRoad(5);
	public static BuildRoad br7 = new BuildRoad(7);
	public static PutLight l0 = new PutLight(0);
	public static PutLight l1 = new PutLight(1);
	public static PutLight l2 = new PutLight(2);
	public static PutLight l3 = new PutLight(3);
	public static PutLight l4 = new PutLight(4);
	public static PutLight l5 = new PutLight(5);
	public static PutLight l6 = new PutLight(6);
	public static PutLight l7 = new PutLight(7);
	public static PutLight l8 = new PutLight(8);
	public static PutLight l9 = new PutLight(9);
	public static PutLight l10 = new PutLight(10);
	public static PutLight l11 = new PutLight(11);
	public static PutLight l12 = new PutLight(12);
	public static PutStoneLine psl1 = new PutStoneLine(Blocks.STONE, "PutStone10");

	public static void preInitCommon() {
		GameRegistry.register(ppolen5);
		GameRegistry.register(ppolek5);
		GameRegistry.register(ppolek10);
		GameRegistry.register(pliney);
		GameRegistry.register(plinew);
		GameRegistry.register(bs0);
		GameRegistry.register(bs1);
		GameRegistry.register(br3);
		GameRegistry.register(br5);
		GameRegistry.register(br7);
		GameRegistry.register(l0);
		GameRegistry.register(l1);
		GameRegistry.register(l2);
		GameRegistry.register(l3);
		GameRegistry.register(l4);
		GameRegistry.register(l5);
		GameRegistry.register(l6);
		GameRegistry.register(l7);
		GameRegistry.register(l8);
		GameRegistry.register(l9);
		GameRegistry.register(l10);
		GameRegistry.register(l11);
		GameRegistry.register(l12);
		GameRegistry.register(psl1);
	}
}
