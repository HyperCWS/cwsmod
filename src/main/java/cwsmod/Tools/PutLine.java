package cwsmod.Tools;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PutLine extends Item {
	private Block block;

	public PutLine(String arg0, String arg1) {
		this.setMaxStackSize(1);
		this.setUnlocalizedName(arg1);
		this.setRegistryName(arg1);
		this.setCreativeTab(cwsmod.CTabs.CTabs.lTab);
		block = Block.getBlockFromName(arg0);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		switch (playerIn.getHorizontalFacing()) {
		case EAST:
			for (int n = 0; n < 20; n++)
				worldIn.setBlockState(new BlockPos(pos.getX() + n, pos.getY() + 1, pos.getZ()),
						block.getDefaultState());
			break;
		case NORTH:
			for (int n = 0; n < 20; n++)
				worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ() - n),
						block.getDefaultState());
			break;
		case SOUTH:
			for (int n = 0; n < 20; n++)
				worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ() + n),
						block.getDefaultState());
			break;
		case WEST:
			for (int n = 0; n < 20; n++)
				worldIn.setBlockState(new BlockPos(pos.getX() - n, pos.getY() + 1, pos.getZ()),
						block.getDefaultState());
			break;
		default:
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}