package cwsmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ClientOnlyProxy extends CommonProxy {
	public void preInit() {
		super.preInit();
		cwsmod.Line.StartupClientOnly.preInitClientOnly();
		cwsmod.BBlock.StartupClientOnly.preInitClientOnly();
		cwsmod.TLight.StartupClientOnly.preInitClientOnly();
		cwsmod.Pole.StartupClientOnly.preInitClientOnly();
		cwsmod.RLight.StartupClientOnly.preinitClientOnly();
		cwsmod.RBlock.StartupClientOnly.preinitClientOnly();
	}

	public void init() {
		super.init();
	}

	public void postInit() {
		super.postInit();
	}

	@Override
	public boolean playerIsInCreativeMode(EntityPlayer player) {
		if (player instanceof EntityPlayerMP) {
			EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;
			return entityPlayerMP.interactionManager.isCreative();
		} else if (player instanceof EntityPlayerSP) {
			return Minecraft.getMinecraft().playerController.isInCreativeMode();
		}
		return false;
	}

	@Override
	public boolean isDedicatedServer() {
		return false;
	}
}