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
		this.setCreativeTab(cwsmod.CTabs.CTabs.toolTab);
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
			for (int j = 0; j < 35; j++)
				for (int i = 0; i < 10 + j; i++)
					worldIn.setBlockToAir(new BlockPos(x - i, y, z - j));
			for (int k = 35; k < 73; k++)
				for (int l = 0; l < 44; l++)
					worldIn.setBlockToAir(new BlockPos(x - k - l + 34, y, z - k));
			break;
		case SOUTH:
			for (int j = 0; j < 35; j++)
				for (int i = 0; i < 10 + j; i++)
					worldIn.setBlockToAir(new BlockPos(x + i, y, z + j));
			for (int k = 35; k < 73; k++)
				for (int l = 0; l < 44; l++)
					worldIn.setBlockToAir(new BlockPos(x + k + l - 34, y, z + k));
			break;
		case WEST:
			for (int j = 0; j < 35; j++)
				for (int i = 0; i < 10 + j; i++)
					worldIn.setBlockToAir(new BlockPos(x - j, y, z + i));
			for (int k = 35; k < 73; k++)
				for (int l = 0; l < 44; l++)
					worldIn.setBlockToAir(new BlockPos(x - k, y, z + k + l - 34));
			break;
		case EAST:
			for (int j = 0; j < 35; j++)
				for (int i = 0; i < 10 + j; i++)
					worldIn.setBlockToAir(new BlockPos(x + j, y, z - i));
			for (int k = 35; k < 73; k++)
				for (int l = 0; l < 44; l++)
					worldIn.setBlockToAir(new BlockPos(x + k, y, z - k - l + 34));
			break;
		default:
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}
