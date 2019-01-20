package cwsmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CwsMod.MODID, version = CwsMod.VERSION)
public class CwsMod {
	public static final String MODID = "cwsmod";
	public static final String VERSION = "2.1";
	@Mod.Instance(CwsMod.MODID)
	public static CwsMod instance;
	@SidedProxy(clientSide = "cwsmod.ClientOnlyProxy", serverSide = "cwsmod.DedicatedServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

	public static String prependModID(String name) {
		return MODID + ":" + name;
	}

}
