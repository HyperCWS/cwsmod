package cwsmod.TLight;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly() {
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficB, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficB_EMPTY", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficB, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficB_RED", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficB, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficB_GREEN", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficB, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficB_YELLOW", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficR, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficR_EMPTY", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficR, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficR_RED", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficR, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficR_GREEN", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficR, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficR_YELLOW", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficT, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficT_EMPTY", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficT, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficT_RED", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficT, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficT_GREEN", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficT, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficT_YELLOW", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficRt, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficRight_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficRt, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficRight_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficRt, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficRight_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficRt, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficRight_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBi, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBike_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBi, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBike_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBi, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBike_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBi, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBike_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBk, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBack_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBk, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBack_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBk, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBack_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficBk, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficBack_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficCr, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficCircle_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficCr, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficCircle_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficCr, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficCircle_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficCr, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficCircle_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficPp, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficPeople_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficPp, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficPeople_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficPp, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficPeople_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficPp, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficPeople_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt1, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight1_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt1, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight1_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt1, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight1_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficSt1, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficStraight1_y", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt1, TLight.EnumColour.EMPTY.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft1_e", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt1, TLight.EnumColour.RED.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft1_r", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt1, TLight.EnumColour.GREEN.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft1_g", "inventory"));
		ModelLoader.setCustomModelResourceLocation(StartupCommon.ITrafficLt1, TLight.EnumColour.YELLOW.getMetadata(),
				new ModelResourceLocation("cwsmod:TrafficLeft1_y", "inventory"));
	}
}
