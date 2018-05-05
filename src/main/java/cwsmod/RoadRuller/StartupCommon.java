package cwsmod.RoadRuller;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static RoadRuler rr = new RoadRuler();
	public static ItemRuler is = new ItemRuler();

	public static void preInitCommon() {
		GameRegistry.register(rr);
		GameRegistry.register(is);
	}
}