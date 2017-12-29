package cwsmod.Pole;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StartupCommon {
	public static Fence poleT = new Fence("PoleT");
	public static Fence poleD = new Fence("PoleD");
	public static Fence poleC = new Fence("PoleC");
	public static Fence poleL = new Fence("PoleL");
	public static Fence roadF = new Fence("RoadFence");
	public static Thick poleM = new Thick("PoleM");
	public static ItemBlock ipt = (ItemBlock) new ItemBlock(poleT).setRegistryName(poleT.getRegistryName());
	public static ItemBlock ipd = (ItemBlock) new ItemBlock(poleD).setRegistryName(poleD.getRegistryName());
	public static ItemBlock ipc = (ItemBlock) new ItemBlock(poleC).setRegistryName(poleC.getRegistryName());
	public static ItemBlock ipl = (ItemBlock) new ItemBlock(poleL).setRegistryName(poleL.getRegistryName());
	public static ItemBlock ipm = (ItemBlock) new ItemBlock(poleM).setRegistryName(poleM.getRegistryName());
	public static ItemBlock irf = (ItemBlock) new ItemBlock(roadF).setRegistryName(roadF.getRegistryName());
	public static void preInitCommon() {
		GameRegistry.register(poleT);
		GameRegistry.register(poleD);
		GameRegistry.register(poleC);
		GameRegistry.register(poleL);
		GameRegistry.register(poleM);
		GameRegistry.register(roadF);
		GameRegistry.register(ipt);
		GameRegistry.register(ipd);
		GameRegistry.register(ipc);
		GameRegistry.register(ipl);
		GameRegistry.register(ipm);
		GameRegistry.register(irf);
	}
}