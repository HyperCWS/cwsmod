package cwsmod.RBlock;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static RBlock rblock = new RBlock();
	public static ItemBlock irblock = (ItemBlock) new ItemBlock(rblock).setRegistryName(rblock.getRegistryName());
	public static RColor ry = new RColor("RYellow");
	public static ItemBlock iry = (ItemBlock) new ItemBlock(ry).setRegistryName(ry.getRegistryName());
	public static RColor rw = new RColor("RWhite");
	public static ItemBlock irw = (ItemBlock) new ItemBlock(rw).setRegistryName(rw.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(rblock);
		GameRegistry.register(irblock);
		GameRegistry.register(rw);
		GameRegistry.register(irw);
		GameRegistry.register(ry);
		GameRegistry.register(iry);
	}

}
