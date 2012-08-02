package TFC.Blocks;

import java.util.ArrayList;
import java.util.Random;

import TFC.Core.ColorizerFoliageTFC;
import TFC.Core.ColorizerGrassTFC;

import net.minecraft.src.*;
import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.IShearable;

public class BlockCustomTallGrass extends BlockTallGrass implements IShearable
{
    public BlockCustomTallGrass(int par1, int par2)
    {
        super(par1, par2);
        float var3 = 0.4F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return par2 == 1 ? this.blockIndexInTexture : (par2 == 2 ? this.blockIndexInTexture + 16 + 1 : (par2 == 0 ? this.blockIndexInTexture + 16 : this.blockIndexInTexture));
    }

    public int getBlockColor()
    {
        double var1 = 0.5D;
        double var3 = 1.0D;
        return ColorizerGrassTFC.getGrassColor(var1, var3);
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor(int par1)
    {
        return par1 == 0 ? 16777215 : ColorizerFoliageTFC.getFoliageColorBasic();
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return mod_TFC_Core.proxy.grassColorMultiplier(par1IBlockAccess, par2, par3, par4);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return -1;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return 1 + par2Random.nextInt(par1 * 2 + 1);
    }

    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }
    
    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int meta, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
//        if (world.rand.nextInt(8) != 0)
//        {
//            return ret;
//        }
        
        ItemStack item = GetSeeds(world.rand);
        if (item != null)
        {
            ret.add(item);
        }
        return ret;
    }

    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z) 
    {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune) 
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z)));
        return ret;
    }
    
    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == mod_TFC_Core.terraGrass.blockID || par1 == mod_TFC_Core.terraGrass2.blockID || 
        par1 == mod_TFC_Core.terraDirt.blockID || par1 == mod_TFC_Core.terraDirt2.blockID ||
        par1 == mod_TFC_Core.terraClayGrass.blockID || par1 == mod_TFC_Core.terraClayGrass2.blockID ||
        par1 == mod_TFC_Core.terraPeatGrass.blockID ||
        par1 == Block.tilledField.blockID;
    }

    public static ItemStack GetSeeds(Random R)
    {
    	ItemStack is = null;
    	if(R.nextInt(20) == 0)
    	{
    		is = new ItemStack(TFCItems.SeedsWheat,1);
    	}
    	return is;
    }
}
