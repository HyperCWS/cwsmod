package cwsmod.RoadRuller;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static RoadRuler rr = new RoadRuler();
	public static ItemRuler ir = new ItemRuler("RoadRuller", 0);
	public static ItemRuler is = new ItemRuler("BlockRuller", 1);
	public static ItemRuler is2 = new ItemRuler("BlockRuller2", 2);

	public static void preInitCommon() {
		GameRegistry.register(rr);
		GameRegistry.register(ir);
		GameRegistry.register(is);
		GameRegistry.register(is2);
	}
}