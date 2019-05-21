package cwsmod.sign;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ICwsign, 0,
				new ModelResourceLocation("cwsmod:cwsign", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INoenter, 0,
				new ModelResourceLocation("cwsmod:noenter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ISpeed40, 0,
				new ModelResourceLocation("cwsmod:speed40", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ISpeed60, 0,
				new ModelResourceLocation("cwsmod:speed60", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ISpeed70, 0,
				new ModelResourceLocation("cwsmod:speed70", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IBack, 0,
				new ModelResourceLocation("cwsmod:back", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IBike, 0,
				new ModelResourceLocation("cwsmod:bike", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IBus, 0,
				new ModelResourceLocation("cwsmod:bus", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ICanteen, 0,
				new ModelResourceLocation("cwsmod:canteen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ICar, 0,
				new ModelResourceLocation("cwsmod:car", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IHotel, 0,
				new ModelResourceLocation("cwsmod:hotel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ILeft, 0,
				new ModelResourceLocation("cwsmod:left", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INoback, 0,
				new ModelResourceLocation("cwsmod:noback", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INobike, 0,
				new ModelResourceLocation("cwsmod:nobike", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INocar, 0,
				new ModelResourceLocation("cwsmod:nocar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INoleft, 0,
				new ModelResourceLocation("cwsmod:noleft", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INomoto, 0,
				new ModelResourceLocation("cwsmod:nomoto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INopass, 0,
				new ModelResourceLocation("cwsmod:nopass", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INopeople, 0,
				new ModelResourceLocation("cwsmod:nopeople", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INoright, 0,
				new ModelResourceLocation("cwsmod:noright", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INostop, 0,
				new ModelResourceLocation("cwsmod:nostop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INotice, 0,
				new ModelResourceLocation("cwsmod:notice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INotruk, 0,
				new ModelResourceLocation("cwsmod:notruk", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INpeople, 0,
				new ModelResourceLocation("cwsmod:npeople", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INrail, 0,
				new ModelResourceLocation("cwsmod:nrail", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.INrough, 0,
				new ModelResourceLocation("cwsmod:nrough", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IOil, 0,
				new ModelResourceLocation("cwsmod:oil", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IPhone, 0,
				new ModelResourceLocation("cwsmod:phone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IRang, 0,
				new ModelResourceLocation("cwsmod:rang", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IRepair, 0,
				new ModelResourceLocation("cwsmod:repair", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IRight, 0,
				new ModelResourceLocation("cwsmod:right", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IStop, 0,
				new ModelResourceLocation("cwsmod:stop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IToleft, 0,
				new ModelResourceLocation("cwsmod:toleft", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IToright, 0,
				new ModelResourceLocation("cwsmod:toright", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IWind, 0,
				new ModelResourceLocation("cwsmod:wind", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.IWorking, 0,
				new ModelResourceLocation("cwsmod:working", "inventory"));

	}
}
