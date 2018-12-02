package cwsmod.Tools;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SubwayTurn extends Item {
	public SubwayTurn(String arg1) {
		this.setMaxStackSize(1);
		this.setUnlocalizedName(arg1);
		this.setRegistryName(arg1);
		this.setCreativeTab(cwsmod.CTabs.CTabs.lTab);
	}

	private void genBlock(World w, int x, int y, int z, Block b) {
		w.setBlockState(new BlockPos(x, y, z), b.getDefaultState());
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		Block stage = Blocks.DOUBLE_STONE_SLAB;
		Block s = Blocks.STONE;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		EnumFacing facing1 = playerIn.getHorizontalFacing();
		switch (facing1) {

		case NORTH:
			worldIn.setBlockToAir(new BlockPos(x, y, z - 1));
			break;
		case SOUTH:
			worldIn.setBlockToAir(new BlockPos(x, y, z + 1));
			break;
		case WEST:
			worldIn.setBlockToAir(new BlockPos(x - 1, y, z));
			break;
		case EAST:
			worldIn.setBlockToAir(new BlockPos(x + 1, y, z));
			break;
		default:
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}
