package cwsmod.Pole;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class Fence extends BlockFence {

	public Fence(String arg0) {
		super(Material.ROCK, MapColor.QUARTZ);
		this.setUnlocalizedName(arg0);
		this.setRegistryName(arg0);
		this.setHardness(2);
		OreDictionary.registerOre(String.format("fenceB%s", new Object[] { arg0.replaceAll("Fence", "").substring(1) }),
				this);
		this.setCreativeTab(cwsmod.CTabs.CTabs.blockTab);
	}
}
