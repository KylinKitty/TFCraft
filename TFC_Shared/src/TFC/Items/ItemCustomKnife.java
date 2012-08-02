package TFC.Items;

import java.util.List;

import TFC.Core.TFCSettings;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class ItemCustomKnife extends ItemSword
implements ITextureProvider
{
	private int weaponDamage = 1;
	public ItemCustomKnife(int i, EnumToolMaterial e)
	{
		super(i, e);
		this.setMaxDamage(e.getMaxUses());
		this.weaponDamage = 1 + e.getDamageVsEntity();
	}

	public int getDamageVsEntity(Entity par1Entity)
	{
		return this.weaponDamage;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.block;
	}

	public String getTextureFile() {
		return "/bioxx/terratools.png";
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}
	
	public void addInformation(ItemStack is, List arraylist) 
    {
        if(TFCSettings.enableDebugMode)
            arraylist.add("Damage: "+is.getItemDamage());
    }
}