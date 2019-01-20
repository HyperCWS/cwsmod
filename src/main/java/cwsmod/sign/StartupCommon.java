package cwsmod.sign;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static Cwsign Cwsign = new Cwsign("cwsign");
	public static ICwsign ICwsign = (ICwsign) new ICwsign(Cwsign).setRegistryName(Cwsign.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(Cwsign);
		GameRegistry.register(ICwsign);
	}
}
