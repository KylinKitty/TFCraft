package TFC.Food;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFC_Core;
import TFC.Core.TFC_ItemHeat;
import TFC.Core.Player.FoodStatsTFC;
import TFC.Items.ItemTerra;

public class ItemMeal extends ItemTerra
{
	PotionEffect foodEffect;
	private boolean alwaysEdible = false;

	public ItemMeal()
	{
		super();
		this.hasSubtypes = true;
		this.MetaNames = new String[]{"Meal0","Meal1","Meal2","Meal3","Meal4","Meal5","Meal6","Meal7","Meal8","Meal9","Meal10",};
		this.MetaIcons = new IIcon[11];
		this.setFolder("food/");
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return this.getUnlocalizedName();
	}

	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List arraylist, boolean flag) 
	{
		ItemFoodTFC.addHeatInformation(is, arraylist);

		if (is.hasTagCompound())
		{
			NBTTagCompound nbt = is.getTagCompound();

			if(nbt.hasKey("FG0"))
				arraylist.add(EnumChatFormatting.WHITE+StatCollector.translateToLocal(nbt.getString("FG0")));
			if(nbt.hasKey("FG1"))
				arraylist.add(EnumChatFormatting.WHITE+StatCollector.translateToLocal(nbt.getString("FG1")));
			if(nbt.hasKey("FG2"))
				arraylist.add(EnumChatFormatting.WHITE+StatCollector.translateToLocal(nbt.getString("FG2")));
			if(nbt.hasKey("FG3"))
				arraylist.add(EnumChatFormatting.WHITE+StatCollector.translateToLocal(nbt.getString("FG3")));

			if(nbt.hasKey("satisfaction"))
			{
				arraylist.add("Satisfaction Mult: " + 1+nbt.getFloat("satisfaction")+"x");
			}

			if(nbt.hasKey("foodWeight"))
			{
				float ounces = nbt.getFloat("foodWeight");
				if(ounces > 0)
					arraylist.add("Amount " + ounces+" oz / 80.0 oz");
				float decay = nbt.getFloat("foodDecay");
				if(decay > 0)
					arraylist.add(EnumChatFormatting.DARK_GRAY + "Decay " + decay/ounces*100+"%");
			}
		}
	}

	@Override
	public void onUpdate(ItemStack is, World world, Entity entity, int i, boolean isSelected) 
	{
		if (!world.isRemote && is.hasTagCompound())
		{
			NBTTagCompound stackTagCompound = is.getTagCompound();

			if(stackTagCompound.hasKey("temperature"))
				TFC_ItemHeat.HandleItemHeat(is);
		}
	}

	@Override
	public ItemStack onEaten(ItemStack is, World world, EntityPlayer player)
	{
		world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		if(!world.isRemote)
		{
			FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);
			foodstats.eatFood(is);
			TFC_Core.setPlayerFoodStats(player, foodstats);
			player.inventory.addItemStackToInventory(new ItemStack(Items.bowl,1));
		}
		is.stackSize--;
		return is;
	}

	public static boolean isWarm(ItemStack is)
	{
		if(TFC_ItemHeat.GetTemperature(is) > TFC_ItemHeat.getMeltingPoint(is) * 0.1)
			return true;
		else
			return false;
	}

	public float getFoodWeight(ItemStack is)
	{
		if(is.hasTagCompound() && is.getTagCompound().hasKey("foodWeight"))
		{
			NBTTagCompound nbt = is.getTagCompound();
			return nbt.getFloat("foodWeight");
		}
		return 0f;
	}

	public float getFoodDecay(ItemStack is)
	{
		if(is.hasTagCompound() && is.getTagCompound().hasKey("foodDecay"))
		{
			NBTTagCompound nbt = is.getTagCompound();
			return nbt.getFloat("foodDecay");
		}
		return 0f;
	}

	public float getSatisfaction(ItemStack is) 
	{
		if(is.hasTagCompound() && is.getTagCompound().hasKey("satisfaction"))
		{
			NBTTagCompound nbt = is.getTagCompound();
			return nbt.getFloat("satisfaction");
		}
		return 0f;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 32;
	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.eat;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player)
	{
		FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);

		//The player needs to be able to fit the food into his stomach
		if(foodstats.needFood())
			player.setItemInUse(is, this.getMaxItemUseDuration(is));

		return is;
	}

	@Override
	public EnumSize getSize(ItemStack is) 
	{
		return EnumSize.SMALL;
	}

	@Override
	public EnumWeight getWeight(ItemStack is) 
	{
		return EnumWeight.MEDIUM;
	}

}