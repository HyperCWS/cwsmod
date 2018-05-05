package cwsmod;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {
	public void preInit() {
		cwsmod.Line.StartupCommon.preInitCommon();
		cwsmod.BBlock.StartupCommon.preInitCommon();
		cwsmod.TLight.StartupCommon.preInitCommon();
		cwsmod.Pole.StartupCommon.preInitCommon();
		cwsmod.RLight.StartupCommon.preInitCommon();
		cwsmod.RBlock.StartupCommon.preInitCommon();
		cwsmod.Tools.StartupCommon.preInitCommon();
		cwsmod.WTool.StartupCommon.preInitCommon();
		cwsmod.RoadRuller.StartupCommon.preInitCommon();
	}

	public void init() {
	}

	public void postInit() {
	}

	abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	abstract public boolean isDedicatedServer();
}