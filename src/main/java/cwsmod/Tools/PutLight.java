package cwsmod.Tools;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PutLight extends Item {
	private int style;

	public PutLight(int arg0) {
		this.setMaxStackSize(1);
		this.setUnlocalizedName("PutLight" + arg0);
		this.setRegistryName("PutLight" + arg0);
		this.setCreativeTab(cwsmod.CTabs.CTabs.lTab);
		style = arg0;
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing f, float hitX, float hitY, float hitZ) {
		IBlockState l = Block.getBlockFromName("cwsmod:RoadLight").getDefaultState();
		IBlockState thick = Block.getBlockFromName("cwsmod:PoleM").getDefaultState();
		IBlockState thin = Block.getBlockFromName("cwsmod:PoleL").getDefaultState();
		IBlockState cen = Block.getBlockFromName("cwsmod:PoleC").getDefaultState();
		IBlockState bottom = Block.getBlockFromName("cwsmod:PoleD").getDefaultState();
		IBlockState top = Block.getBlockFromName("cwsmod:PoleT").getDefaultState();
		int x = pos.getX();
		int y = pos.getY() + 1;
		int z = pos.getZ();
		EnumFacing facing = playerIn.getHorizontalFacing();
		switch (style) {
		case 0:
			for (int i = 0; i < 20; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
			}
			y += 20;
			worldIn.setBlockState(new BlockPos(x, y, z), thin);
			switch (facing) {
			case EAST:
				worldIn.setBlockState(new BlockPos(x - 1, y, z), l);
				worldIn.setBlockState(new BlockPos(x - 2, y, z), l);
				break;
			case NORTH:
				worldIn.setBlockState(new BlockPos(x, y, z + 1), l);
				worldIn.setBlockState(new BlockPos(x, y, z + 2), l);
				break;
			case SOUTH:
				worldIn.setBlockState(new BlockPos(x, y, z - 1), l);
				worldIn.setBlockState(new BlockPos(x, y, z - 2), l);
				break;
			case WEST:
				worldIn.setBlockState(new BlockPos(x + 1, y, z), l);
				worldIn.setBlockState(new BlockPos(x + 2, y, z), l);
				break;
			default:
				break;
			}
			break;
		case 1:
			for (int i = 0; i < 10; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
			}
			worldIn.setBlockState(new BlockPos(x, y + 10, z), bottom);
			y += 10;
			switch (facing) {
			case EAST:
				worldIn.setBlockState(new BlockPos(x - 1, y, z), l);
				worldIn.setBlockState(new BlockPos(x - 2, y, z), l);
				break;
			case NORTH:
				worldIn.setBlockState(new BlockPos(x, y, z + 1), l);
				worldIn.setBlockState(new BlockPos(x, y, z + 2), l);
				break;
			case SOUTH:
				worldIn.setBlockState(new BlockPos(x, y, z - 1), l);
				worldIn.setBlockState(new BlockPos(x, y, z - 2), l);
				break;
			case WEST:
				worldIn.setBlockState(new BlockPos(x + 1, y, z), l);
				worldIn.setBlockState(new BlockPos(x + 2, y, z), l);
				break;
			default:
				break;
			}
			break;
		case 2:
			for (int i = 0; i < 10; i++) {
				if (i < 5) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				} else {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
			}
			y += 9;
			switch (facing) {
			case EAST:
				worldIn.setBlockState(new BlockPos(x - 1, y, z), l);
				break;
			case NORTH:
				worldIn.setBlockState(new BlockPos(x, y, z + 1), l);
				break;
			case SOUTH:
				worldIn.setBlockState(new BlockPos(x, y, z - 1), l);
				break;
			case WEST:
				worldIn.setBlockState(new BlockPos(x + 1, y, z), l);
				break;
			default:
				break;
			}
			break;
		case 3:
			for (int i = 0; i < 15; i++) {
				if (i < 10) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				} else {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
			}
			y += 14;
			switch (facing) {
			case EAST:
				worldIn.setBlockState(new BlockPos(x - 1, y, z), cen);
				worldIn.setBlockState(new BlockPos(x + 1, y - 4, z), l);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x - j, y, z), l);
				}
				break;
			case NORTH:
				worldIn.setBlockState(new BlockPos(x, y, z + 1), cen);
				worldIn.setBlockState(new BlockPos(x, y - 4, z - 1), l);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x, y, z + j), l);
				}
				break;
			case SOUTH:
				worldIn.setBlockState(new BlockPos(x, y, z - 1), cen);
				worldIn.setBlockState(new BlockPos(x, y - 4, z + 1), l);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x, y, z - j), l);
				}
				break;
			case WEST:
				worldIn.setBlockState(new BlockPos(x + 1, y, z), cen);
				worldIn.setBlockState(new BlockPos(x - 1, y - 4, z), l);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x + j, y, z), l);
				}
				break;
			default:
				break;
			}
			break;
		case 4:
			for (int i = 0; i < 20; i++) {
				if (i < 18) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				} else {
					worldIn.setBlockState(new BlockPos(x, y + i, z), Blocks.QUARTZ_BLOCK.getDefaultState());
				}
			}
			y += 19;
			worldIn.setBlockState(new BlockPos(x - 1, y, z), cen);
			for (int j = 2; j <= 3; j++) {
				worldIn.setBlockState(new BlockPos(x - j, y, z), l);
			}
			worldIn.setBlockState(new BlockPos(x, y, z + 1), cen);
			for (int j = 2; j <= 3; j++) {
				worldIn.setBlockState(new BlockPos(x, y, z + j), l);
			}
			worldIn.setBlockState(new BlockPos(x, y, z - 1), cen);
			for (int j = 2; j <= 3; j++) {
				worldIn.setBlockState(new BlockPos(x, y, z - j), l);
			}
			worldIn.setBlockState(new BlockPos(x + 1, y, z), cen);
			for (int j = 2; j <= 3; j++) {
				worldIn.setBlockState(new BlockPos(x + j, y, z), l);
			}
			break;
		case 5:
			for (int i = 0; i < 10; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
			}
			worldIn.setBlockState(new BlockPos(x, y + 10, z), bottom);
			y += 10;
			switch (facing) {
			case EAST:
				worldIn.setBlockState(new BlockPos(x - 1, y, z), cen);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x - j, y, z), l);
				}
				break;
			case NORTH:
				worldIn.setBlockState(new BlockPos(x, y, z + 1), cen);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x, y, z + j), l);
				}
				break;
			case SOUTH:
				worldIn.setBlockState(new BlockPos(x, y, z - 1), cen);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x, y, z - j), l);
				}
				break;
			case WEST:
				worldIn.setBlockState(new BlockPos(x + 1, y, z), cen);
				for (int j = 2; j <= 3; j++) {
					worldIn.setBlockState(new BlockPos(x + j, y, z), l);
				}
				break;
			default:
				break;
			}
			break;
		case 6:
			for (int i = 0; i < 11; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
			}
			y += 7;
			switch (facing) {
			case EAST:
				x -= 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 3, z), cen);
				worldIn.setBlockState(new BlockPos(x - 1, y + 3, z), l);
				x += 2;
				y += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), l);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				break;
			case NORTH:
				z += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 3, z), cen);
				worldIn.setBlockState(new BlockPos(x, y + 3, z + 1), l);
				z -= 2;
				y += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), l);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				break;
			case SOUTH:
				z -= 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 3, z), cen);
				worldIn.setBlockState(new BlockPos(x, y + 3, z - 1), l);
				z += 2;
				y += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), l);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				break;
			case WEST:
				x += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 3, z), cen);
				worldIn.setBlockState(new BlockPos(x + 1, y + 3, z), l);
				x -= 2;
				y += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), l);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				break;
			default:
				break;
			}
			break;
		case 7:
			for (int i = 0; i < 15; i++) {
				if (i < 10) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				} else {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
			}
			y += 10;
			switch (facing) {
			case EAST:
				x -= 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 4, z), cen);
				x += 2;
				y += 2;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				y += 2;
				worldIn.setBlockState(new BlockPos(x - 3, y, z), l);
				worldIn.setBlockState(new BlockPos(x - 4, y, z), l);
				break;
			case NORTH:
				z += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 4, z), cen);
				z -= 2;
				y += 2;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				y += 2;
				worldIn.setBlockState(new BlockPos(x, y, z + 3), l);
				worldIn.setBlockState(new BlockPos(x, y, z + 4), l);
				break;
			case SOUTH:
				z -= 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 4, z), cen);
				z += 2;
				y += 2;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				y += 2;
				worldIn.setBlockState(new BlockPos(x, y, z - 3), l);
				worldIn.setBlockState(new BlockPos(x, y, z - 4), l);
				break;
			case WEST:
				x += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				worldIn.setBlockState(new BlockPos(x, y + 4, z), cen);
				x -= 2;
				y += 2;
				worldIn.setBlockState(new BlockPos(x, y, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				y += 2;
				worldIn.setBlockState(new BlockPos(x + 3, y, z), l);
				worldIn.setBlockState(new BlockPos(x + 4, y, z), l);
				break;
			default:
				break;
			}
			break;
		case 8:
			for (int i = 0; i < 12; i++) {
				if (i < 10) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				} else {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
			}
			y += 9;
			if (facing.name() == "NORTH" || facing.name() == "SOUTH") {
				z -= 2;
				worldIn.setBlockState(new BlockPos(x, y + 2, z), l);
				z += 1;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				z += 2;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				z += 1;
				worldIn.setBlockState(new BlockPos(x, y + 2, z), l);
			} else {
				x -= 2;
				worldIn.setBlockState(new BlockPos(x, y + 2, z), l);
				x += 1;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				x += 2;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), thin);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), bottom);
				x += 1;
				worldIn.setBlockState(new BlockPos(x, y + 2, z), l);
			}
			break;
		case 9:
			y -= 1;
			switch (facing) {
			case EAST:
				for (int i = -1; i < 2; i++) {
					worldIn.setBlockState(new BlockPos(x, y, z + i), Blocks.STONE.getDefaultState());
				}
				z -= 1;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x + 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x - 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x - 2, y + 20, z), cen);
				z += 2;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x + 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x - 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x - 2, y + 20, z), cen);
				z -= 1;
				worldIn.setBlockState(new BlockPos(x, y + 15, z), cen);
				worldIn.setBlockState(new BlockPos(x + 1, y + 15, z), l);
				worldIn.setBlockState(new BlockPos(x - 2, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x - 3, y + 20, z), l);
				worldIn.setBlockState(new BlockPos(x - 4, y + 20, z), l);
				break;
			case SOUTH:
				for (int i = -1; i < 2; i++) {
					worldIn.setBlockState(new BlockPos(x + i, y, z), Blocks.STONE.getDefaultState());
				}
				x -= 1;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 2), cen);
				x += 2;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 2), cen);
				x -= 1;
				worldIn.setBlockState(new BlockPos(x, y + 15, z), cen);
				worldIn.setBlockState(new BlockPos(x, y + 15, z + 1), l);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 2), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 3), l);
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 4), l);
				break;
			case NORTH:
				for (int i = -1; i < 2; i++) {
					worldIn.setBlockState(new BlockPos(x + i, y, z), Blocks.STONE.getDefaultState());
				}
				x -= 1;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 2), cen);
				x += 2;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x, y + 20, z - 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 1), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 2), cen);
				x -= 1;
				worldIn.setBlockState(new BlockPos(x, y + 15, z), cen);
				worldIn.setBlockState(new BlockPos(x, y + 15, z - 1), l);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 2), cen);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 3), l);
				worldIn.setBlockState(new BlockPos(x, y + 20, z + 4), l);
				break;
			case WEST:
				for (int i = -1; i < 2; i++) {
					worldIn.setBlockState(new BlockPos(x, y, z + i), Blocks.STONE.getDefaultState());
				}
				z -= 1;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x - 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x + 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x + 2, y + 20, z), cen);
				z += 2;
				for (int i = 1; i < 16; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thick);
				}
				for (int i = 11; i < 21; i++) {
					worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
				}
				worldIn.setBlockState(new BlockPos(x - 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x + 1, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x + 2, y + 20, z), cen);
				z -= 1;
				worldIn.setBlockState(new BlockPos(x, y + 15, z), cen);
				worldIn.setBlockState(new BlockPos(x - 1, y + 15, z), l);
				worldIn.setBlockState(new BlockPos(x + 2, y + 20, z), cen);
				worldIn.setBlockState(new BlockPos(x + 3, y + 20, z), l);
				worldIn.setBlockState(new BlockPos(x + 4, y + 20, z), l);
				break;
			default:
				break;
			}
			break;
		case 10:
			for (int i = 0; i < 5; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
			}
			y += 3;
			if (facing.name() == "NORTH" || facing.name() == "SOUTH") {
				z += 1;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), Blocks.SEA_LANTERN.getDefaultState());
				z -= 2;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), Blocks.SEA_LANTERN.getDefaultState());
			} else {
				x += 1;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), Blocks.SEA_LANTERN.getDefaultState());
				x -= 2;
				worldIn.setBlockState(new BlockPos(x, y + 1, z), top);
				worldIn.setBlockState(new BlockPos(x, y + 2, z), Blocks.SEA_LANTERN.getDefaultState());
			}
			break;
		case 11:
			for (int i = 0; i < 5; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), thin);
			}
			y += 4;
			worldIn.setBlockState(new BlockPos(x + 1, y, z), top);
			worldIn.setBlockState(new BlockPos(x - 1, y, z), top);
			worldIn.setBlockState(new BlockPos(x, y, z + 1), top);
			worldIn.setBlockState(new BlockPos(x, y, z - 1), top);
			y += 1;
			worldIn.setBlockState(new BlockPos(x + 1, y, z), Blocks.SEA_LANTERN.getDefaultState());
			worldIn.setBlockState(new BlockPos(x - 1, y, z), Blocks.SEA_LANTERN.getDefaultState());
			worldIn.setBlockState(new BlockPos(x, y, z + 1), Blocks.SEA_LANTERN.getDefaultState());
			worldIn.setBlockState(new BlockPos(x, y, z - 1), Blocks.SEA_LANTERN.getDefaultState());
			break;
		case 12:
			for (int i = 0; i < 6; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), Blocks.COBBLESTONE_WALL.getDefaultState());
			}
			for (int i = 6; i < 11; i++) {
				worldIn.setBlockState(new BlockPos(x, y + i, z), Blocks.DARK_OAK_FENCE.getDefaultState());
			}
			y += 10;
			if (facing.name() == "NORTH" || facing.name() == "SOUTH") {
				z += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), Blocks.DARK_OAK_FENCE.getDefaultState());
				worldIn.setBlockState(new BlockPos(x, y - 1, z), Blocks.SEA_LANTERN.getDefaultState());
				z -= 2;
				worldIn.setBlockState(new BlockPos(x, y, z), Blocks.DARK_OAK_FENCE.getDefaultState());
				worldIn.setBlockState(new BlockPos(x, y - 1, z), Blocks.SEA_LANTERN.getDefaultState());
			} else {
				x += 1;
				worldIn.setBlockState(new BlockPos(x, y, z), Blocks.DARK_OAK_FENCE.getDefaultState());
				worldIn.setBlockState(new BlockPos(x, y - 1, z), Blocks.SEA_LANTERN.getDefaultState());
				x -= 2;
				worldIn.setBlockState(new BlockPos(x, y, z), Blocks.DARK_OAK_FENCE.getDefaultState());
				worldIn.setBlockState(new BlockPos(x, y - 1, z), Blocks.SEA_LANTERN.getDefaultState());
			}
			break;
		}
		return EnumActionResult.SUCCESS;
	}
}