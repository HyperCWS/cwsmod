package cwsmod.TLight;

import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AABB {
	public static AxisAlignedBB setBound(IBlockState state, IBlockAccess source, BlockPos pos,
			PropertyDirection property, int style) {
		if (style == 1) {
			switch (state.getValue(property)) {
			case EAST:
				return new AxisAlignedBB(3 / 16F, 0, 0, 1, 1, 1);
			case WEST:
				return new AxisAlignedBB(0, 0, 0, 13 / 16F, 1, 1);
			case NORTH:
				return new AxisAlignedBB(0, 0, 0, 1, 1, 13/16F);
			case SOUTH:
				return new AxisAlignedBB(0, 0, 3/16F, 1, 1, 1);
			default:
				break;
			}
		} else if (style == 2) {
			switch (state.getValue(property)) {
			case EAST:
				return new AxisAlignedBB(0, 0, 2 / 16F, 1, 1, 14 / 16F);
			case WEST:
				return new AxisAlignedBB(0, 0, 2 / 16F, 1, 1, 14 / 16F);
			case NORTH:
				return new AxisAlignedBB(2 / 16F, 0, 0, 14 / 16F, 1, 1);
			case SOUTH:
				return new AxisAlignedBB(2 / 16F, 0, 0, 14 / 16F, 1, 1);
			default:
				break;
			}
		} else {
			return Block.FULL_BLOCK_AABB;
		}
		return state.getBoundingBox(source, pos);
	}
}
