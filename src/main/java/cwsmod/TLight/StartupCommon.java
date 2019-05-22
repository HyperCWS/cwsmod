package cwsmod.TLight;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static TLight TrafficB = new TLight("TrafficB", 0);
	public static ITLight ITrafficB = (ITLight) new ITLight(TrafficB).setRegistryName(TrafficB.getRegistryName());
	public static TLight TrafficR = new TLight("TrafficR", 0);
	public static ITLight ITrafficR = (ITLight) new ITLight(TrafficR).setRegistryName(TrafficR.getRegistryName());
	public static TLight TrafficT = new TLight("TrafficT", 0);
	public static ITLight ITrafficT = (ITLight) new ITLight(TrafficT).setRegistryName(TrafficT.getRegistryName());
	public static TLight TrafficSt = new TLight("TrafficStraight", 1);
	public static ITLight ITrafficSt = (ITLight) new ITLight(TrafficSt).setRegistryName(TrafficSt.getRegistryName());
	public static TLight TrafficLt = new TLight("TrafficLeft", 1);
	public static ITLight ITrafficLt = (ITLight) new ITLight(TrafficLt).setRegistryName(TrafficLt.getRegistryName());
	public static TLight TrafficRt = new TLight("TrafficRight", 1);
	public static ITLight ITrafficRt = (ITLight) new ITLight(TrafficRt).setRegistryName(TrafficRt.getRegistryName());
	public static TLight TrafficBi = new TLight("TrafficBike", 1);
	public static ITLight ITrafficBi = (ITLight) new ITLight(TrafficBi).setRegistryName(TrafficBi.getRegistryName());
	public static TLight TrafficBk = new TLight("TrafficBack", 1);
	public static ITLight ITrafficBk = (ITLight) new ITLight(TrafficBk).setRegistryName(TrafficBk.getRegistryName());
	public static TLight TrafficCr = new TLight("TrafficCircle", 1);
	public static ITLight ITrafficCr = (ITLight) new ITLight(TrafficCr).setRegistryName(TrafficCr.getRegistryName());
	public static TLight TrafficPp = new TLight("TrafficPeople", 1);
	public static ITLight ITrafficPp = (ITLight) new ITLight(TrafficPp).setRegistryName(TrafficPp.getRegistryName());
	public static TLight TrafficSt1 = new TLight("TrafficStraight1", 2);
	public static ITLight ITrafficSt1 = (ITLight) new ITLight(TrafficSt1).setRegistryName(TrafficSt1.getRegistryName());
	public static TLight TrafficLt1 = new TLight("TrafficLeft1", 2);
	public static ITLight ITrafficLt1 = (ITLight) new ITLight(TrafficLt1).setRegistryName(TrafficLt1.getRegistryName());
	public static TLight TrafficSt2 = new TLight("TrafficStraight2", 0);
	public static ITLight ITrafficSt2 = (ITLight) new ITLight(TrafficSt2).setRegistryName(TrafficSt2.getRegistryName());
	public static TLight TrafficLt2 = new TLight("TrafficLeft2", 0);
	public static ITLight ITrafficLt2 = (ITLight) new ITLight(TrafficLt2).setRegistryName(TrafficLt2.getRegistryName());
	public static TLight TrafficBi2 = new TLight("TrafficBike2", 1);
	public static ITLight ITrafficBi2 = (ITLight) new ITLight(TrafficBi2).setRegistryName(TrafficBi2.getRegistryName());
	public static TLight TrafficCr2 = new TLight("TrafficCircle2", 1);
	public static ITLight ITrafficCr2 = (ITLight) new ITLight(TrafficCr2).setRegistryName(TrafficCr2.getRegistryName());
	public static TLight TrafficL = new TLight("TrafficL", 0);
	public static ITLight ITrafficL = (ITLight) new ITLight(TrafficL).setRegistryName(TrafficL.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(TrafficB);
		GameRegistry.register(ITrafficB);
		GameRegistry.register(TrafficR);
		GameRegistry.register(ITrafficR);
		GameRegistry.register(TrafficT);
		GameRegistry.register(ITrafficT);
		GameRegistry.register(TrafficSt);
		GameRegistry.register(ITrafficSt);
		GameRegistry.register(TrafficLt);
		GameRegistry.register(ITrafficLt);
		GameRegistry.register(TrafficRt);
		GameRegistry.register(ITrafficRt);
		GameRegistry.register(TrafficBi);
		GameRegistry.register(ITrafficBi);
		GameRegistry.register(TrafficBk);
		GameRegistry.register(ITrafficBk);
		GameRegistry.register(TrafficCr);
		GameRegistry.register(ITrafficCr);
		GameRegistry.register(TrafficPp);
		GameRegistry.register(ITrafficPp);
		GameRegistry.register(TrafficSt1);
		GameRegistry.register(ITrafficSt1);
		GameRegistry.register(TrafficLt1);
		GameRegistry.register(ITrafficLt1);
		GameRegistry.register(TrafficSt2);
		GameRegistry.register(ITrafficSt2);
		GameRegistry.register(TrafficLt2);
		GameRegistry.register(ITrafficLt2);
		GameRegistry.register(TrafficCr2);
		GameRegistry.register(ITrafficCr2);
		GameRegistry.register(TrafficBi2);
		GameRegistry.register(ITrafficBi2);
		GameRegistry.register(TrafficL);
		GameRegistry.register(ITrafficL);
	}
}
