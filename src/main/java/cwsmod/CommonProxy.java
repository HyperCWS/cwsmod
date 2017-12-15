package cwsmod;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {
	public void preInit() {
		cwsmod.Line.StartupCommon.preInitCommon();
		cwsmod.BBlock.StartupCommon.preInitCommon();
	}

	public void init() {
		/*
		 * minecraftbyexample.mbe70_configuration.StartupCommon.initCommon();
		 */
	}

	public void postInit() {
		/*
		 * minecraftbyexample.mbe70_configuration.StartupCommon.postInitCommon()
		 */
	}

	abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	abstract public boolean isDedicatedServer();
}