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
	}

	public void init() {
		super.init();
		/*
		 * minecraftbyexample.mbe75_testing_framework.StartupClientOnly.
		 * initClientOnly();
		 * minecraftbyexample.testingarea.StartupClientOnly.initClientOnly();
		 */
	}

	public void postInit() {
		super.postInit();
		/*
		 * minecraftbyexample.mbe70_configuration.StartupClientOnly.
		 * postInitClientOnly();
		 */
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