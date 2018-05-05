package cwsmod.RoadRuller;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemRuler extends Item {
	public ItemRuler() {
		this.setMaxStackSize(1);
		this.setUnlocalizedName("RoadRuller");
		this.setRegistryName("RoadRuller");
		this.setCreativeTab(cwsmod.CTabs.CTabs.lTab);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing f, float hitX, float hitY, float hitZ) {
		IBlockState s = Block.getBlockFromName("cwsmod:RoadRullerBlock").getDefaultState();
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		worldIn.setBlockState(pos, s);
		EnumFacing facing = playerIn.getHorizontalFacing();
		switch (facing) {
		case EAST:
			worldIn.setBlockState(new BlockPos(x + 11, y, z), s);
			break;
		case NORTH:
			worldIn.setBlockState(new BlockPos(x, y, z - 11), s);
			break;
		case SOUTH:
			worldIn.setBlockState(new BlockPos(x, y, z + 11), s);
			break;
		case WEST:
			worldIn.setBlockState(new BlockPos(x - 11, y, z), s);
			break;
		default:
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}
