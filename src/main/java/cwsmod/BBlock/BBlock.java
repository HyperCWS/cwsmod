package cwsmod.BBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BBlock extends Block {
	protected BBlock(String arg0) {
		super(Material.ROCK);
		this.setUnlocalizedName(arg0);
		this.setRegistryName(arg0);
		this.setCreativeTab(cwsmod.CTabs.CTabs.bTab);
		this.setHardness(2);
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}

	@Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return Blocks.STONE.isOpaqueCube(iBlockState);
	}

	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return Blocks.STONE.isOpaqueCube(iBlockState);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}
}
