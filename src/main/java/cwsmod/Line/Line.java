package cwsmod.Line;

import net.minecraft.block.BlockRail;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Line extends BlockRail {

	protected Line(String arg0) {
		this.setUnlocalizedName(arg0);
		this.setRegistryName(arg0);
		this.setHardness(0.5f);
		String oreDictName = String.format("railB%s", new Object[] { arg0.replaceAll("Rail", "").substring(1) });
		OreDictionary.registerOre(oreDictName, this);
		this.setCreativeTab(cwsmod.CTabs.CTabs.lineTab);
	}
}