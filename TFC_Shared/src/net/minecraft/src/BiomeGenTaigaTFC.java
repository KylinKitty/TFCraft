// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

import TFC.Entities.EntityBear;
import TFC.Entities.EntityWolfTFC;



// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, SpawnListEntry, EntityWolf, BiomeDecorator, 
//            WorldGenerator

public class BiomeGenTaigaTFC extends BiomeGenBase
{

	int treeCommon1 = -1;
	Boolean treeCommon1Size;
	int treeCommon2 = -1;
	Boolean treeCommon2Size;
	int treeUncommon = -1;
	Boolean treeUncommonSize;
	int treeRare = -1;
	Boolean treeRareSize;

	public BiomeGenTaigaTFC(int i)
	{
		super(i);
		spawnableCreatureList.add(new SpawnListEntry(EntityWolfTFC.class, 6, 1, 5));
        spawnableCreatureList.add(new SpawnListEntry(EntityBear.class, 6, 1, 2));
		biomeDecorator.treesPerChunk = 10;
		biomeDecorator.grassPerChunk = 1;
		treeCommon1 = 0;
		treeCommon2 = 0;
		treeUncommon = 0;
		treeRare = 0;
		setMinMaxHeight(0.2F, 0.4F);
		((BiomeDecoratorTFC)this.biomeDecorator).looseRocksPerChunk = 4;
        ((BiomeDecoratorTFC)this.biomeDecorator).looseRocksChancePerChunk = 90;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random random, World world)
	{
		
		int rand = random.nextInt(100);
		if(rand < 40) {
			return getTreeGen(treeCommon1,treeCommon1Size);
		} else if(rand < 80) {
			return getTreeGen(treeCommon2,treeCommon2Size);
		} else if(rand < 95) {
			return getTreeGen(treeUncommon,treeUncommonSize);
		} else {
			return getTreeGen(treeRare,treeRareSize);
		}
	}
	
	public void SetupTrees(World world, Random R)
    {
	    WorldGenerator[] ConiferGenList = {
	            worldGenRedwoodShortTrees,
                worldGenWhiteCedarTallTrees,
                worldGenPineShortTrees,
                worldGenSpruceShortTrees,
                worldGenOakShortTrees,
                worldGenBirchShortTrees,
                worldGenAshTallTrees,
                worldGenWhiteElmTallTrees,
                worldGenOakTallTrees,
                worldGenBirchTallTrees,
                worldGenPineTallTrees,
                worldGenAspenTallTrees,
                worldGenAspenShortTrees};

	   while(treeCommon1 == 0 || treeCommon2 == 0)
	   {
            treeCommon1 = R.nextInt(ConiferGenList.length);
            treeCommon1Size = R.nextBoolean();
            treeCommon2 = R.nextInt(ConiferGenList.length);
            treeCommon2Size = R.nextBoolean();
            treeUncommon = R.nextInt(ConiferGenList.length);
            treeUncommonSize = R.nextBoolean();
            treeRare = R.nextInt(ConiferGenList.length);
            treeRareSize = R.nextBoolean();
	   }

    }
	
	protected float getMonthTemp(int month)
    {
        switch(month)
        {
            case 11:
                return -1F;
            case 0:
                return 0F;
            case 1:
                return 0.25F;
            case 2:
                return 0.8F;
            case 3:
                return 0.75F; 
            case 4:
                return 1F;
            case 5:
                return 0.75F;
            case 6:
                return 0.5F;
            case 7:
                return 0.25F;
            case 8:
                return 0F;
            case 9:
                return -1F;
            case 10:
                return -2F;
            default:
                return 1F;
        }
    }
	
}
