package cwsmod.Line;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static Line rwd = new Line("RailWhiteDown");
	public static Line rwu = new Line("RailWhiteUp");
	public static Line rwk = new Line("RailWhiteThick");
	public static Line rwn = new Line("RailWhiteThin");
	public static Line rwt = new Line("RailWhiteTurn");
	public static Line ryn = new Line("RailYellowThin");
	public static Line ryk = new Line("RailYellowThick");
	public static Line ryd = new Line("RailYellowDouble");
	public static ItemBlock irwd = (ItemBlock) new ItemBlock(rwd).setRegistryName(rwd.getRegistryName());
	public static ItemBlock irwu = (ItemBlock) new ItemBlock(rwu).setRegistryName(rwu.getRegistryName());
	public static ItemBlock irwk = (ItemBlock) new ItemBlock(rwk).setRegistryName(rwk.getRegistryName());
	public static ItemBlock irwn = (ItemBlock) new ItemBlock(rwn).setRegistryName(rwn.getRegistryName());
	public static ItemBlock irwt = (ItemBlock) new ItemBlock(rwt).setRegistryName(rwt.getRegistryName());
	public static ItemBlock iryn = (ItemBlock) new ItemBlock(ryn).setRegistryName(ryn.getRegistryName());
	public static ItemBlock iryk = (ItemBlock) new ItemBlock(ryk).setRegistryName(ryk.getRegistryName());
	public static ItemBlock iryd = (ItemBlock) new ItemBlock(ryd).setRegistryName(ryd.getRegistryName());
	public static void preInitCommon() {
		GameRegistry.register(rwd);
		GameRegistry.register(irwd);
		GameRegistry.register(rwu);
		GameRegistry.register(irwu);
		GameRegistry.register(rwk);
		GameRegistry.register(irwk);
		GameRegistry.register(rwn);
		GameRegistry.register(irwn);
		GameRegistry.register(rwt);
		GameRegistry.register(irwt);
		GameRegistry.register(ryn);
		GameRegistry.register(iryn);
		GameRegistry.register(ryk);
		GameRegistry.register(iryk);
		GameRegistry.register(ryd);
		GameRegistry.register(iryd);
	}
}
