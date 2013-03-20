package TFC.Entities.Mobs;

import java.util.Random;

import TFC.*;
import TFC.Core.TFC_MobDamage;
import TFC.Core.TFC_Time;
import TFC.Core.TFC_Settings;
import TFC.Entities.EntityAnimalTFC;
import TFC.Entities.EntityTameableTFC;
import TFC.Entities.AI.EntityAIHurtByTargetTFC;
import TFC.Entities.AI.EntityAIPanicTFC;
import TFC.Entities.AI.EntityAITargetNonTamedTFC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.packet.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.server.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.feature.*;

public class EntityBear extends EntityTameableTFC
{
	/**
	 * This flag is set when the bear is looking at a player with interest, i.e. with tilted head. This happens when
	 * tamed wolf is wound and player holds porkchop (raw or cooked), or when wild wolf sees bone in player's hands.
	 */
	private float field_25048_b;
	private float field_25054_c;
	private Random rand = new Random ();


	/** true is the wolf is wet else false */
	private boolean field_25052_g;


	public EntityBear (World par1World)
	{
		super (par1World);
		texture = "/mob/Bear.png";
		setSize (1.2F, 1.2F);
		moveSpeed = 0.2F;
		getNavigator ().setAvoidsWater (true);
		tasks.addTask (1, new EntityAISwimming (this));
		tasks.addTask (4, new EntityAIAttackOnCollide (this, moveSpeed * 1.5F, true));
		if (sex == 0)
		{
			tasks.addTask (6, new EntityAIMate (this, moveSpeed));
		}
		degreeOfDiversion = 4;
		tasks.addTask (7, new EntityAIWander (this, moveSpeed));
		tasks.addTask (8, new EntityAIWatchClosest (this, EntityPlayer.class, 8F));
		tasks.addTask (9, new EntityAILookIdle (this));
		tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
		targetTasks.addTask (4, new EntityAITargetNonTamedTFC (this, EntitySheepTFC.class, 16F, 200, false));
		targetTasks.addTask (4, new EntityAITargetNonTamedTFC (this, EntityPigTFC.class, 16F, 200, false));
		targetTasks.addTask (4, new EntityAITargetNonTamedTFC (this, EntityPlayer.class, 16F, 200, false));
		targetTasks.addTask(3, new EntityAIHurtByTargetTFC(this, false));
		targetTasks.addTask(2, new EntityAIPanicTFC(this,moveSpeed*1.5F,true,false));
		fooditems.add(Item.beefRaw.itemID);
		fooditems.add(Item.porkRaw.itemID);
		fooditems.add(Item.fishRaw.itemID);
	}


	public EntityBear (World par1World, EntityAnimalTFC mother, float father_size)
	{
		super (par1World,mother,father_size);
		texture = "/mob/Bear.png";
		setSize (1.2F, 1.2F);
		moveSpeed = 0.2F;
		degreeOfDiversion = 4;
		getNavigator ().setAvoidsWater (true);
		tasks.addTask (1, new EntityAISwimming (this));
		tasks.addTask (3, new EntityAIAttackOnCollide (this, moveSpeed * 1.5F, true));
		if (sex == 0)
		{
			tasks.addTask (6, new EntityAIMate (this, moveSpeed));
		}
		tasks.addTask (7, new EntityAIWander (this, moveSpeed));
		tasks.addTask (8, new EntityAIWatchClosest (this, EntityPlayer.class, 8F));
		tasks.addTask (9, new EntityAILookIdle (this));
		targetTasks.addTask (3, new EntityAIHurtByTarget (this, true));
		tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
		targetTasks.addTask (4, new EntityAITargetNonTamedTFC (this, EntitySheepTFC.class, 16F, 200, false));
		targetTasks.addTask (4, new EntityAITargetNonTamedTFC (this, EntityPigTFC.class, 16F, 200, false));
		targetTasks.addTask (4, new EntityAITargetNonTamedTFC (this, EntityPlayer.class, 16F, 200, false));
		targetTasks.addTask(3, new EntityAIHurtByTargetTFC(this, true));
		targetTasks.addTask(2, new EntityAIPanicTFC(this,moveSpeed*1.5F,true,false));
		fooditems.add(Item.beefRaw.itemID);
		fooditems.add(Item.porkRaw.itemID);
		fooditems.add(Item.fishRaw.itemID);
	}


	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	public boolean isAIEnabled ()
	{
		return true;
	}
	@Override
	public int getDegree(){
		return degreeOfDiversion;
	}

	/**
	 * Sets the active target the Task system uses for tracking
	 */
	@Override
	public void setAttackTarget (EntityLiving par1EntityLiving)
	{
		super.setAttackTarget (par1EntityLiving);
	}


	/**
	 * main AI tick function, replaces updateEntityActionState
	 */
	@Override
	protected void updateAITick ()
	{
		dataWatcher.updateObject (18, Integer.valueOf (getHealth ()));
	}


	@Override
	public int getMaxHealth ()
	{
		return 1200;
	}

	@Override
	protected void entityInit ()
	{
		super.entityInit ();
		dataWatcher.addObject (18, new Integer (getHealth ()));
	}


	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	@Override
	protected boolean canTriggerWalking ()
	{
		return true;
	}


	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT (NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT (par1NBTTagCompound);
	}


	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT (NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT (par1NBTTagCompound);
	}


	/**
	 * Determines if an entity can be despawned, used on idle far away entities
	 */
	@Override
	protected boolean canDespawn ()
	{
		return true;
	}


	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound ()
	{
		return "mob.wolf.growl";
	}


	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound ()
	{
		if(!isChild()){
		return "mob.wolf.growl";
		}
		else{
			return "mob.wolf.whine";
		}
	}


	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound ()
	{
		return "mob.wolf.death";
	}


	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	@Override
	protected float getSoundVolume ()
	{
		return 0.4F;
	}


	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	@Override
	protected int getDropItemId ()
	{
		return -1;
	}


	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate ()
	{
		super.onLivingUpdate ();
		float t = (1.0F-(getGrowingAge()/(TFC_Time.getYearRatio() * adultAge * -TFC_Settings.dayLength)));
		if (!worldObj.isRemote && !field_25052_g && !hasPath () && onGround)
		{
			field_25052_g = true;
			worldObj.setEntityState (this, (byte) 8);
		}
		if(pregnant){
			if(TFC_Time.getTotalTicks() >= conception + pregnancyTime*TFC_Settings.dayLength){
				int i = rand.nextInt(3) + 1;
				for (int x = 0; x<i;x++){
				EntityBear baby = new EntityBear(worldObj, this,mateSizeMod);
				giveBirth(baby);
				}
				pregnant = false;
			}
		}



		if (TFC_Time.getTotalTicks() == birthTime + 60 && this instanceof EntityBear && this.sex == 1&& rand.nextInt(10) == 0 && getGrowingAge() >= 0){
			int i = rand.nextInt(3);
			if (mateSizeMod == 0){
				this.mateSizeMod = (float) (((rand.nextInt (5) - 2) / 10f) + 1F);
			}
			for (int x = 0; x<i;x++){
				giveBirth(new EntityBear(this.worldObj,this,this.mateSizeMod));
			}
		}
	}


	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate ()
	{
		super.onUpdate ();
		field_25054_c = field_25048_b;
		field_25048_b = field_25048_b + (0.0F - field_25048_b) * 0.4F;
	}

	@Override
	public float getEyeHeight ()
	{
		return height * 0.8F;
	}


	/**
	 * Called when the entity is attacked.
	 */
	@Override
	public boolean attackEntityFrom (DamageSource par1DamageSource, int par2)
	{
		Entity entity = par1DamageSource.getEntity ();

		if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
		{
			par2 = (par2 + 1) / 2;
		}
		return super.attackEntityFrom (par1DamageSource, par2);
	}

	@Override
	public boolean attackEntityAsMob (Entity par1Entity)
	{
		int dam =  TFC_MobDamage.BearDamage;
		return par1Entity.attackEntityFrom (DamageSource.causeMobDamage (this), dam);
	}

	@Override
	public void handleHealthUpdate (byte par1)
	{
		if (par1 == 8)
		{
			field_25052_g = true;
		}
		else
		{
			super.handleHealthUpdate (par1);
		}
	}


	/**
	 * Will return how many at most can spawn in a chunk at once.
	 */
	@Override
	public int getMaxSpawnedInChunk ()
	{
		return 2;
	}


	/**
	 * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
	 */
	@Override
	public void procreate (EntityAnimal par1EntityAnimal)
	{
		EntityBear entitybear = new EntityBear (worldObj, parent, ((EntityAnimalTFC)par1EntityAnimal).size_mod);
		worldObj.spawnEntityInWorld(entitybear);
	}

	@Override
	public boolean canMateWith (EntityAnimal par1EntityAnimal)
	{
		if (par1EntityAnimal == this)
		{
			return false;
		}
		if (!(par1EntityAnimal instanceof EntityBear))
		{
			return false;
		}
		EntityBear entitybear = (EntityBear) par1EntityAnimal;
		return isInLove () && entitybear.isInLove ();
	}
}