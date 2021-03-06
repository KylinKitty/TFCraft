package TFC.Containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import TFC.Containers.Slots.ContainerHorseInventorySlotArmor;
import TFC.Containers.Slots.ContainerHorseInventorySlotSaddle;
import TFC.Entities.Mobs.EntityHorseTFC;

public class ContainerHorseInventoryTFC extends Container
{
	private IInventory field_111243_a;
	private EntityHorseTFC theHorse;

	public ContainerHorseInventoryTFC(IInventory playerInv, IInventory horseInv, EntityHorseTFC horse)
	{
		this.field_111243_a = horseInv;
		this.theHorse = horse;
		byte b0 = 3;
		horseInv.openChest();
		int i = (b0 - 4) * 18;
		this.addSlotToContainer(new ContainerHorseInventorySlotSaddle(this, horseInv, 0, 8, 18));
		this.addSlotToContainer(new ContainerHorseInventorySlotArmor(this, horseInv, 1, 8, 36, horse));
		int j;
		int k;

		if (horse.isChested())
		{
			for (j = 0; j < b0; ++j)
			{
				for (k = 0; k < 5; ++k)
				{
					this.addSlotToContainer(new Slot(horseInv, 2 + k + j * 5, 80 + k * 18, 18 + j * 18));
				}
			}
		}

		for (j = 0; j < 3; ++j)
		{
			for (k = 0; k < 9; ++k)
			{
				this.addSlotToContainer(new Slot(playerInv, k + j * 9 + 9, 8 + k * 18, 102 + j * 18 + i));
			}
		}

		for (j = 0; j < 9; ++j)
		{
			this.addSlotToContainer(new Slot(playerInv, j, 8 + j * 18, 160 + i));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return this.field_111243_a.isUseableByPlayer(par1EntityPlayer) && this.theHorse.isEntityAlive() && this.theHorse.getDistanceToEntity(par1EntityPlayer) < 8.0F;
	}

	/**
	 * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par2)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(par2);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (par2 < this.field_111243_a.getSizeInventory())
			{
				if (!this.mergeItemStack(itemstack1, this.field_111243_a.getSizeInventory(), this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (this.getSlot(1).isItemValid(itemstack1) && !this.getSlot(1).getHasStack())
			{
				if (!this.mergeItemStack(itemstack1, 1, 2, false))
				{
					return null;
				}
			}
			else if (this.getSlot(0).isItemValid(itemstack1))
			{
				if (!this.mergeItemStack(itemstack1, 0, 1, false))
				{
					return null;
				}
			}
			else if (this.field_111243_a.getSizeInventory() <= 2 || !this.mergeItemStack(itemstack1, 2, this.field_111243_a.getSizeInventory(), false))
			{
				return null;
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack)null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

	/**
	 * Called when the container is closed.
	 */
	@Override
	public void onContainerClosed(EntityPlayer par1EntityPlayer)
	{
		super.onContainerClosed(par1EntityPlayer);
		this.field_111243_a.closeChest();
		this.theHorse.updateChestSaddle();
	}
}
