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

public class BStation extends Item {
	private int style;

	public BStation(int arg0, String arg1) {
		this.setMaxStackSize(1);
		this.setUnlocalizedName(arg1);
		this.setRegistryName(arg1);
		this.setCreativeTab(cwsmod.CTabs.CTabs.lTab);
		style = arg0;
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
		switch (style) {
		case 1:
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 26; j++)
					switch (facing1) {
					case EAST:
						genBlock(worldIn, x + j, y, z + i, s);
						genBlock(worldIn, x + j, y + 1, z + i, stage);
						break;
					case NORTH:
						genBlock(worldIn, x + i, y, z - j, s);
						genBlock(worldIn, x + i, y + 1, z - j, stage);
						break;
					case SOUTH:
						genBlock(worldIn, x - i, y, z + j, s);
						genBlock(worldIn, x - i, y + 1, z + j, stage);
						break;
					case WEST:
						genBlock(worldIn, x - j, y, z - i, s);
						genBlock(worldIn, x - j, y + 1, z - i, stage);
						break;
					default:
						break;
					}
			break;
		case 0:
			for (int h = 0; h < 10; h++)
				for (int l = 0; l < 4; l++)
					switch (facing1) {
					case EAST:
						genBlock(worldIn, x + h, y + h, z + l, s);
						break;
					case NORTH:
						genBlock(worldIn, x + l, y + h, z - h, s);
						break;
					case SOUTH:
						genBlock(worldIn, x - l, y + h, z + h, s);
						break;
					case WEST:
						genBlock(worldIn, x - h, y + h, z - l, s);
						break;
					default:
						break;
					}
			break;
		case 2:
			for (int h = 0; h < 10; h++)
				for (int l = 0; l < 4; l++)
					switch (facing1) {
					case EAST:
						worldIn.setBlockToAir(new BlockPos(x + h, y + h, z + l));
						break;
					case NORTH:
						worldIn.setBlockToAir(new BlockPos(x + l, y + h, z - h));
						break;
					case SOUTH:
						worldIn.setBlockToAir(new BlockPos(x - l, y + h, z + h));
						break;
					case WEST:
						worldIn.setBlockToAir(new BlockPos(x - h, y + h, z - l));
						break;
					default:
						break;
					}
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}
