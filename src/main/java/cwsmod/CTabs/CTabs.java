package cwsmod.CTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CTabs {
	public static CreativeTabs lineTab = new CreativeTabs("cws_ltab") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getByNameOrId("cwsmod:RailYellowDouble");
		}
	};
	public static CreativeTabs blockTab = new CreativeTabs("cws_btab") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getByNameOrId("cwsmod:BBlock");
		}
	};
	public static CreativeTabs tlightTab = new CreativeTabs("cws_tltab") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getByNameOrId("cwsmod:TrafficStraight");
		}
	};
	public static CreativeTabs toolTab = new CreativeTabs("cws_ttab") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.IRON_PICKAXE;
		}
	};
}