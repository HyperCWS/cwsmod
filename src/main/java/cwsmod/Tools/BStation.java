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
		Block quartz = Blocks.QUARTZ_BLOCK;
		Block gls = Blocks.STAINED_GLASS;
		Block stage = Blocks.DOUBLE_STONE_SLAB;
		Block glsp = Blocks.STAINED_GLASS_PANE;
		Block s = Blocks.STONE;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		EnumFacing facing1 = playerIn.getHorizontalFacing();
		switch (style) {
		case 1:
			switch (facing1) {
			case EAST:
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x + j, y, z + i, s);
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x + j, y + 1, z + i, stage);
				break;
			case NORTH:
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x + i, y, z - j, s);
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x + i, y + 1, z - j, stage);
				break;
			case SOUTH:
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x - i, y, z + j, s);
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x - i, y + 1, z + j, stage);
				break;
			case WEST:
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x - j, y, z - i, s);
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 26; j++)
						genBlock(worldIn, x - j, y + 1, z - i, stage);
				break;
			default:
				break;
			}
			break;
		case 0:
			switch (facing1) {
			case EAST:
				for (int h = 1; h <= 15; h++) {
					genBlock(worldIn, x, y + h, z, quartz);
					genBlock(worldIn, x + 1, y + h, z, quartz);
					genBlock(worldIn, x + 1, y + h, z + 1, glsp);
					genBlock(worldIn, x + 1, y + h, z + 2, glsp);
					genBlock(worldIn, x, y + h, z + 3, quartz);
					genBlock(worldIn, x + 1, y + h, z + 3, quartz);
					if (h > 4 && h < 13)
						for (int a = 0; a < 4; a++)
							genBlock(worldIn, x - 1, y + h, z + a, gls);
					if (h == 13)
						for (int k = 0; k < 4; k++)
							genBlock(worldIn, x - 1, y + h, z + k, stage);
				}
				for (int i = -1; i < 2; i++)
					for (int j = 0; j < 4; j++)
						genBlock(worldIn, x - i, y + 16, z + j, stage);
				break;
			case NORTH:
				for (int h = 1; h <= 15; h++) {
					genBlock(worldIn, x, y + h, z, quartz);
					genBlock(worldIn, x, y + h, z - 1, quartz);
					genBlock(worldIn, x + 1, y + h, z - 1, glsp);
					genBlock(worldIn, x + 2, y + h, z - 1, glsp);
					genBlock(worldIn, x + 3, y + h, z, quartz);
					genBlock(worldIn, x + 3, y + h, z - 1, quartz);
					if (h > 4 && h < 13)
						for (int a = 0; a < 4; a++)
							genBlock(worldIn, x + a, y + h, z + 1, gls);
					if (h == 13)
						for (int k = 0; k < 4; k++)
							genBlock(worldIn, x + k, y + h, z + 1, stage);
				}
				for (int i = -1; i < 2; i++)
					for (int j = 0; j < 4; j++)
						genBlock(worldIn, x + j, y + 16, z + i, stage);
				break;
			case SOUTH:
				for (int h = 1; h <= 15; h++) {
					genBlock(worldIn, x, y + h, z, quartz);
					genBlock(worldIn, x - 3, y + h, z, quartz);
					genBlock(worldIn, x - 1, y + h, z + 1, glsp);
					genBlock(worldIn, x - 2, y + h, z + 1, glsp);
					genBlock(worldIn, x, y + h, z + 1, quartz);
					genBlock(worldIn, x - 3, y + h, z + 1, quartz);
					if (h > 4 && h < 13)
						for (int a = 0; a < 4; a++)
							genBlock(worldIn, x - a, y + h, z - 1, gls);
					if (h == 13)
						for (int k = 0; k < 4; k++)
							genBlock(worldIn, x - k, y + h, z - 1, stage);
				}
				for (int i = -1; i < 2; i++)
					for (int j = 0; j < 4; j++)
						genBlock(worldIn, x - j, y + 16, z - i, stage);
				break;
			case WEST:
				for (int h = 1; h <= 15; h++) {
					genBlock(worldIn, x, y + h, z, quartz);
					genBlock(worldIn, x - 1, y + h, z, quartz);
					genBlock(worldIn, x - 1, y + h, z - 1, glsp);
					genBlock(worldIn, x - 1, y + h, z - 2, glsp);
					genBlock(worldIn, x, y + h, z - 3, quartz);
					genBlock(worldIn, x - 1, y + h, z - 3, quartz);
					if (h > 4 && h < 13)
						for (int a = 0; a < 4; a++)
							genBlock(worldIn, x + 1, y + h, z - a, gls);
					if (h == 13)
						for (int k = 0; k < 4; k++)
							genBlock(worldIn, x + 1, y + h, z - k, stage);
				}
				for (int i = -1; i < 2; i++)
					for (int j = 0; j < 4; j++)
						genBlock(worldIn, x + i, y + 16, z - j, stage);
				break;
			default:
				break;
			}
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}
