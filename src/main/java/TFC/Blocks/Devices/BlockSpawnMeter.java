package TFC.Blocks.Devices;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import TFC.Reference;
import TFC.Blocks.BlockTerraContainer;
import TFC.TileEntities.TileEntitySpawnMeter;

public class BlockSpawnMeter extends BlockTerraContainer
{
	IIcon iconTop;
	IIcon[] icons = new IIcon[9];

	public BlockSpawnMeter()
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setLightLevel(1F);
	}

	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) 
	{
		int meta = world.getBlockMetadata(x, y, z);
		return Math.min(meta, 8);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return true;
	}

	@Override
	public int damageDropped(int j) 
	{
		return j;
	}

	@Override
	public IIcon getIcon(int i, int j) 
	{
		if(i < 2)
			return iconTop;
		return icons[j];
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegisterer)
	{
		iconTop = iconRegisterer.registerIcon(Reference.ModID + ":" + "devices/MeterTop");
		for(int i = 0; i < 9; i++)
			icons[i] = iconRegisterer.registerIcon(Reference.ModID + ":" + "devices/Meter"+i);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		return new TileEntitySpawnMeter();
	}
}