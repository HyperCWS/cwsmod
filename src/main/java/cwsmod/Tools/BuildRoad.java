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

public class BuildRoad extends Item {
	private int length;

	public BuildRoad(int arg0) {
		this.setMaxStackSize(1);
		this.setUnlocalizedName("BuildRoad" + arg0);
		this.setRegistryName("BuildRoad" + arg0);
		this.setCreativeTab(cwsmod.CTabs.CTabs.toolTab);
		length = arg0;
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		Block b = Block.getBlockFromName("cwsmod:BBlock");
		int x0 = pos.getX();
		int y = pos.getY();
		int z0 = pos.getZ();
		int x = x0 - ((length - 1) / 2);
		int z = z0 - ((length - 1) / 2);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				worldIn.setBlockState(new BlockPos(x + i, y, z + j), b.getDefaultState());
			}
		}
		return EnumActionResult.SUCCESS;
	}
}