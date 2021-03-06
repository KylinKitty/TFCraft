package TFC.Items;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import TFC.Reference;
import TFC.TerraFirmaCraft;
import TFC.API.Armor;
import TFC.API.IQuiverAmmo;
import TFC.API.Enums.EnumAmmo;
import TFC.Core.TFCTabs;
import TFC.Core.TFC_Core;
import TFC.Core.Util.StringUtil;
import TFC.Items.Tools.ItemJavelin;

public class ItemQuiver extends ItemTFCArmor
{

	public ItemQuiver(int itemID, Armor armor, int renderIndex, int armorSlot, int thermal, int type)
	{
		super(itemID,armor,renderIndex,armorSlot,thermal,type);
		ArmorType = armor;
		this.setCreativeTab(TFCTabs.TFCArmor);
		//this.setMaxDamage(ArmorType.getDurability(armorSlot));
	}

	public ItemQuiver(int itemID, Armor armor, int renderIndex, int armorSlot, EnumArmorMaterial m, int thermal, int type)
	{
		super(itemID, armor, renderIndex, armorSlot,m,thermal,type);
		ArmorType = armor;
		this.setCreativeTab(TFCTabs.TFCArmor);
		//this.setMaxDamage(ArmorType.getDurability(armorSlot));
	}
	
	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * Gets an icon index based on an item's damage value and the given render pass
	 */
	public Icon getIconFromDamageForRenderPass(int par1, int par2)
	{
		return this.itemIcon;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		String m = ArmorType.metaltype.replace(" ", "").toLowerCase();
		return Reference.ModID+String.format(":textures/models/armor/%s_%d%s.png",
				m, (slot == 2 ? 2 : 1), type == null ? "" : String.format("_%s", type));
	}
	
	@Override
	public void onUpdate(ItemStack is, World world, Entity entity, int i, boolean isSelected) 
	{
		super.onUpdate(is, world, entity, i, isSelected);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		entityplayer.openGui(TerraFirmaCraft.instance, 40, entityplayer.worldObj, (int)entityplayer.posX, (int)entityplayer.posY, (int)entityplayer.posZ);
		return itemstack;
	}

	@Override
	public void registerIcons(IconRegister registerer)
	{
		this.itemIcon = registerer.registerIcon(Reference.ModID + ":quiver");
	}
	
	@Override
	/**
     * Determines if the specific ItemStack can be placed in the specified armor slot.
     *
     * @param stack The ItemStack
     * @param armorType Armor slot ID: 0: Helmet, 1: Chest, 2: Legs, 3: Boots
     * @param entity The entity trying to equip the armor
     * @return True if the given ItemStack can be inserted in the slot
     */
    public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
    {
        return armorType == 4;
    }
	
	public int getQuiverArrows(ItemStack item){
		int n = 0;
			ItemStack[] inventory = loadInventory(item);
			for(ItemStack i : inventory){
				if(i!=null && i.getItem() instanceof ItemArrow){
					n += i.stackSize;
				}
			}

		
		return n;
	}
	
	public int getQuiverJavelins(ItemStack item){
		int n = 0;
			ItemStack[] inventory = loadInventory(item);
			for(ItemStack i : inventory){
				if(i!=null && i.getItem() instanceof ItemJavelin){
					n += i.stackSize;
				}
			}
		return n;
	}
	
	public ArrayList[] getQuiverJavelinTypes(ItemStack item){
		ArrayList[] pair = new ArrayList[2];
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> listNum = new ArrayList<Integer>();
			ItemStack[] inventory = loadInventory(item);
			for(ItemStack i : inventory){
				if(i!=null && i.getItem() instanceof ItemJavelin){
					String s = i.getItem().getItemDisplayName(i);
					if(!list.contains(s)){
						list.add(s);
					}
					int n = list.indexOf(s);
					if(listNum.size() == n){
						listNum.add(0);
					}
					listNum.set(n, listNum.get(n)+1);
				}
			}
			pair[0] = list;
			pair[1] = listNum;
		return pair;
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List arraylist, boolean flag) 
	{
		ItemTerra.addSizeInformation(is, arraylist);
		ItemTerra.addHeatInformation(is, arraylist);

		if (TFC_Core.showExtraInformation()) 
		{
			//arraylist.add(EnumChatFormatting.WHITE + StringUtil.localize("gui.Armor.Advanced") + ":");
			//arraylist.add(EnumChatFormatting.ITALIC + StringUtil.localize("gui.Armor.Pierce") + ": " + EnumChatFormatting.AQUA + ArmorType.getPiercingAR());
			//arraylist.add(EnumChatFormatting.ITALIC + StringUtil.localize("gui.Armor.Slash") + ": " + EnumChatFormatting.AQUA + ArmorType.getSlashingAR());
			//arraylist.add(EnumChatFormatting.ITALIC + StringUtil.localize("gui.Armor.Crush") + ": " + EnumChatFormatting.AQUA + ArmorType.getCrushingAR());
			//arraylist.add("");
			arraylist.add(EnumChatFormatting.WHITE + StringUtil.localize("gui.Bow.Advanced") + ":");
			arraylist.add(EnumChatFormatting.ITALIC + StringUtil.localize("gui.Bow.Arrows") + ": " + EnumChatFormatting.YELLOW + getQuiverArrows(is));
			arraylist.add(EnumChatFormatting.ITALIC + StringUtil.localize("gui.Bow.Javelins") + ": " + EnumChatFormatting.YELLOW + getQuiverJavelins(is));
			ArrayList[] javData = getQuiverJavelinTypes(is);
			for(int i = 0; i < javData[0].size();i++){
				String s = (String)(javData[0].get(i));
				int n = (Integer)(javData[1].get(i));
				arraylist.add(EnumChatFormatting.ITALIC + "  -" + s + ": "+EnumChatFormatting.YELLOW+n);
			}
			if (is.hasTagCompound())
			{
				NBTTagCompound stackTagCompound = is.getTagCompound();

				if(stackTagCompound.hasKey("creator"))
					arraylist.add(EnumChatFormatting.ITALIC + StringUtil.localize("gui.Armor.ForgedBy") + " " + stackTagCompound.getString("creator"));
			}
		} else
			arraylist.add(EnumChatFormatting.DARK_GRAY + StringUtil.localize("gui.Armor.Advanced") + ": (" + StringUtil.localize("gui.Armor.Hold") + " " + 
					EnumChatFormatting.GRAY + StringUtil.localize("gui.Armor.Shift") + 
					EnumChatFormatting.DARK_GRAY + ")");

	}

	public ItemStack addItem(ItemStack quiver, ItemStack ammo)
	{
		ItemStack[] inventory = loadInventory(quiver);
		for(int i = 0; i < inventory.length && ammo != null; i++)
		{
			if(inventory[i] != null && inventory[i].isItemEqual(ammo))
			{
				if(ammo.stackSize + inventory[i].stackSize <= ammo.getMaxStackSize())
				{
					inventory[i].stackSize += ammo.stackSize;
					ammo = null;
				}
				else if(ammo.stackSize + inventory[i].stackSize > ammo.getMaxStackSize())
				{
					int diff = ammo.getMaxStackSize() - inventory[i].stackSize;
					inventory[i].stackSize = ammo.getMaxStackSize();
					ammo.stackSize -= diff;
				}
			}
			else if(inventory[i] == null)
			{
				inventory[i] = ammo.copy();
				ammo = null;
			}
		}
		saveInventory(quiver, inventory);
		return ammo;
	}

	public ItemStack consumeAmmo(ItemStack quiver, EnumAmmo ammoType, boolean shouldConsume)
	{
		ItemStack[] inventory = loadInventory(quiver);
		for(int i = 0; i < inventory.length; i++)
		{
			if(inventory[i] != null && inventory[i].getItem() instanceof IQuiverAmmo && ((IQuiverAmmo)inventory[i].getItem()).getAmmoType() == ammoType)
			{
				ItemStack out = inventory[i].copy();
				out.stackSize = 1;
				if(shouldConsume) {
					inventory[i].stackSize--;
				}
				if(inventory[i].stackSize <= 0) {
					inventory[i] = null;
				}
				saveInventory(quiver, inventory);
				return out;
			}
		}
		return null;
	}

	public ItemStack[] loadInventory(ItemStack quiver)
	{
		ItemStack[] inventory = new ItemStack[8];
		NBTTagCompound nbt = quiver.getTagCompound();
		if(nbt != null && nbt.hasKey("Items"))
		{
			NBTTagList nbttaglist = nbt.getTagList("Items");

			for(int i = 0; i < nbttaglist.tagCount(); i++)
			{
				NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
				byte byte0 = nbttagcompound1.getByte("Slot");
				if(byte0 >= 0 && byte0 < 8)
				{
					inventory[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
				}
			}
		}
		return inventory;
	}

	public void saveInventory(ItemStack quiver, ItemStack[] inventory)
	{
		NBTTagList nbttaglist = new NBTTagList();
		for(int i = 0; i < inventory.length; i++)
		{
			if(inventory[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte)i);
				inventory[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		if(quiver != null)
		{
			if(!quiver.hasTagCompound()) 
			{
				quiver.setTagCompound(new NBTTagCompound());
			}
			quiver.getTagCompound().setTag("Items", nbttaglist);
		}
	}

}
