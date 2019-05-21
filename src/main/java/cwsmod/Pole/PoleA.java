package cwsmod.Pole;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PoleA extends Block {
	private int AABBstyle;
	private boolean fullCube;

	public PoleA(String arg0, int arg1, boolean fCube) {
		super(Material.ROCK);
		this.setCreativeTab(cwsmod.CTabs.CTabs.blockTab);
		this.setUnlocalizedName(arg0);
		this.setRegistryName(arg0);
		this.setHardness(2);
		AABBstyle = arg1;
		fullCube = fCube;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return false;
	}

	@Override
	public boolean isFullBlock(IBlockState iBlockState) {
		return true;
	}

	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return fullCube;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		switch (AABBstyle) {
		case 0:
			switch (state.getValue(PROPERTYFACING)) {
			case EAST:
				return new AxisAlignedBB(0, 0, 5 / 16F, 11 / 16F, 1, 11 / 16F);
			case WEST:
				return new AxisAlignedBB(5 / 16F, 0, 5 / 16F, 1, 1, 11 / 16F);
			case NORTH:
				return new AxisAlignedBB(5 / 16F, 0, 5 / 16F, 11 / 16F, 1, 1);
			case SOUTH:
				return new AxisAlignedBB(5 / 16F, 0, 0, 11 / 16F, 1, 11 / 16F);
			default:
				return FULL_BLOCK_AABB;
			}
		case 1:
			switch (state.getValue(PROPERTYFACING)) {
			case EAST:
				return new AxisAlignedBB(14 / 16F, 0, 0, 1, 1, 1);
			case WEST:
				return new AxisAlignedBB(0, 0, 0, 2 / 16F, 1, 1);
			case NORTH:
				return new AxisAlignedBB(0, 0, 0, 1, 1, 2 / 16F);
			case SOUTH:
				return new AxisAlignedBB(0, 0, 14 / 16F, 1, 1, 1);
			default:
				return FULL_BLOCK_AABB;
			}
		default:
			return FULL_BLOCK_AABB;
		}

	}

	public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing",
			EnumFacing.Plane.HORIZONTAL);

	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumFacing facing = EnumFacing.getHorizontal(meta);
		int colourbits = (meta & 0x0c) >> 2;
		return this.getDefaultState().withProperty(PROPERTYFACING, facing);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		EnumFacing facing = (EnumFacing) state.getValue(PROPERTYFACING);
		int facingbits = facing.getHorizontalIndex();
		return facingbits;
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return state;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { PROPERTYFACING });
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);
		return this.getDefaultState().withProperty(PROPERTYFACING, enumfacing);
	}
}