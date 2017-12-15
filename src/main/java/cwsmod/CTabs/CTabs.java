package cwsmod.CTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CTabs {
	public static CreativeTabs lTab= new CreativeTabs("cws_ltab") {
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getByNameOrId("cwsmod:RailYellowDouble");
			}
		};
	public static CreativeTabs bTab= new CreativeTabs("cws_btab") {
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getByNameOrId("cwsmod:BBlock");
			}
		};
}