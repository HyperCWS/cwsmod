package cwsmod.Pole;

import cwsmod.sign.Cwsign;
import cwsmod.sign.ICwsign;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StartupCommon {
	public static PoleA poleA = new PoleA("PoleA", 0);
	public static PoleA poleB = new PoleA("PoleB", -1);
	public static Fence poleC = new Fence("PoleC");
	public static Fence poleD = new Fence("PoleD");
	public static PoleA poleE = new PoleA("PoleE", 1);
	public static Fence poleL = new Fence("PoleL");
	public static Thick poleM = new Thick("PoleM", 5);
	public static Fence poleT = new Fence("PoleT");
	public static Fence roadF = new Fence("RoadFence");
	public static ItemBlock ipt = (ItemBlock) new ItemBlock(poleT).setRegistryName(poleT.getRegistryName());
	public static ItemBlock ipd = (ItemBlock) new ItemBlock(poleD).setRegistryName(poleD.getRegistryName());
	public static ItemBlock ipc = (ItemBlock) new ItemBlock(poleC).setRegistryName(poleC.getRegistryName());
	public static ItemBlock ipl = (ItemBlock) new ItemBlock(poleL).setRegistryName(poleL.getRegistryName());
	public static ItemBlock ipm = (ItemBlock) new ItemBlock(poleM).setRegistryName(poleM.getRegistryName());
	public static ItemBlock irf = (ItemBlock) new ItemBlock(roadF).setRegistryName(roadF.getRegistryName());
	public static IPoleA ipa = (IPoleA) new IPoleA(poleA).setRegistryName(poleA.getRegistryName());
	public static IPoleA ipb = (IPoleA) new IPoleA(poleB).setRegistryName(poleB.getRegistryName());
	public static IPoleA ipe = (IPoleA) new IPoleA(poleE).setRegistryName(poleE.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(poleT);
		GameRegistry.register(poleA);
		GameRegistry.register(poleB);
		GameRegistry.register(poleD);
		GameRegistry.register(poleE);
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
		GameRegistry.register(ipa);
		GameRegistry.register(ipb);
		GameRegistry.register(ipe);
	}
}