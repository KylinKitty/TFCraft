package TFC;

import java.io.File;

import TFC.Blocks.BlockCustomDoor;
import TFC.Blocks.BlockSluice;
import TFC.Core.*;
import TFC.Enums.EnumMetalType;
import TFC.Enums.EnumSize;
import TFC.Food.ItemMeal;
import TFC.Food.ItemTerraFood;
import TFC.Items.*;
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
import net.minecraftforge.common.*;

public class TFCItems
{
    public static Item WoodSupportItemH;
    public static Item WoodSupportItemV;

    public static Item GemRuby;
    public static Item GemSapphire;
    public static Item GemEmerald;
    public static Item GemTopaz;
    public static Item GemGarnet;
    public static Item GemOpal;
    public static Item GemAmethyst;
    public static Item GemJasper;
    public static Item GemBeryl;
    public static Item GemTourmaline;
    public static Item GemJade;
    public static Item GemAgate;
    public static Item GemDiamond;
    public static Item SulfurPowder;
    public static Item SaltpeterPowder;

    public static Item BismuthIngot;
    public static Item BismuthBronzeIngot;
    public static Item BlackBronzeIngot;
    public static Item BlackSteelIngot;
    public static Item HCBlackSteelIngot;
    public static Item BlueSteelIngot;
    public static Item WeakBlueSteelIngot;
    public static Item HCBlueSteelIngot;
    public static Item BrassIngot;
    public static Item BronzeIngot;
    public static Item CopperIngot;
    public static Item GoldIngot;
    public static Item WroughtIronIngot;
    public static Item LeadIngot;
    public static Item NickelIngot;
    public static Item PigIronIngot;
    public static Item PlatinumIngot;
    public static Item RedSteelIngot;
    public static Item WeakRedSteelIngot;
    public static Item HCRedSteelIngot;
    public static Item RoseGoldIngot;
    public static Item SilverIngot;
    public static Item SteelIngot;
    public static Item WeakSteelIngot;
    public static Item HCSteelIngot;
    public static Item SterlingSilverIngot;
    public static Item TinIngot;
    public static Item ZincIngot;

    public static Item BismuthIngot2x;
    public static Item BismuthBronzeIngot2x;
    public static Item BlackBronzeIngot2x;
    public static Item BlackSteelIngot2x;
    public static Item BlueSteelIngot2x;
    public static Item BrassIngot2x;
    public static Item BronzeIngot2x;
    public static Item CopperIngot2x;
    public static Item GoldIngot2x;
    public static Item WroughtIronIngot2x;
    public static Item LeadIngot2x;
    public static Item NickelIngot2x;
    public static Item PigIronIngot2x;
    public static Item PlatinumIngot2x;
    public static Item RedSteelIngot2x;
    public static Item RoseGoldIngot2x;
    public static Item SilverIngot2x;
    public static Item SteelIngot2x;
    public static Item SterlingSilverIngot2x;
    public static Item TinIngot2x;
    public static Item ZincIngot2x;

    public static Item IgInPick;
    public static Item IgInShovel;
    public static Item IgInAxe;
    public static Item IgInHoe;
    public static Item SedPick;
    public static Item SedShovel;
    public static Item SedAxe;
    public static Item SedHoe;
    public static Item IgExPick;
    public static Item IgExShovel;
    public static Item IgExAxe;
    public static Item IgExHoe;
    public static Item MMPick;
    public static Item MMShovel;
    public static Item MMAxe;
    public static Item MMHoe;

    public static Item BismuthPick;
    public static Item BismuthShovel;
    public static Item BismuthAxe;
    public static Item BismuthHoe;
    public static Item BismuthBronzePick;
    public static Item BismuthBronzeShovel;
    public static Item BismuthBronzeAxe;
    public static Item BismuthBronzeHoe;
    public static Item BlackBronzePick;
    public static Item BlackBronzeShovel;
    public static Item BlackBronzeAxe;
    public static Item BlackBronzeHoe;
    public static Item BlackSteelPick;
    public static Item BlackSteelShovel;
    public static Item BlackSteelAxe;
    public static Item BlackSteelHoe;
    public static Item BlueSteelPick;
    public static Item BlueSteelShovel;
    public static Item BlueSteelAxe;
    public static Item BlueSteelHoe;
    public static Item BronzePick;
    public static Item BronzeShovel;
    public static Item BronzeAxe;
    public static Item BronzeHoe;
    public static Item CopperPick;
    public static Item CopperShovel;
    public static Item CopperAxe;
    public static Item CopperHoe;
    public static Item WroughtIronPick;
    public static Item WroughtIronShovel;
    public static Item WroughtIronAxe;
    public static Item WroughtIronHoe;
    public static Item RedSteelPick;
    public static Item RedSteelShovel;
    public static Item RedSteelAxe;
    public static Item RedSteelHoe;
    public static Item RoseGoldPick;
    public static Item RoseGoldShovel;
    public static Item RoseGoldAxe;
    public static Item RoseGoldHoe;
    public static Item SteelPick;
    public static Item SteelShovel;
    public static Item SteelAxe;
    public static Item SteelHoe;
    public static Item TinPick;
    public static Item TinShovel;
    public static Item TinAxe;
    public static Item TinHoe;
    public static Item ZincPick;
    public static Item ZincShovel;
    public static Item ZincAxe;
    public static Item ZincHoe;

    public static Item StoneChisel;
    public static Item BismuthChisel;
    public static Item BismuthBronzeChisel;
    public static Item BlackBronzeChisel;
    public static Item BlackSteelChisel;
    public static Item BlueSteelChisel;
    public static Item BronzeChisel;
    public static Item CopperChisel;
    public static Item WroughtIronChisel;
    public static Item RedSteelChisel;
    public static Item RoseGoldChisel;
    public static Item SteelChisel;
    public static Item TinChisel;
    public static Item ZincChisel;

    public static Item IgInStoneSword;
    public static Item IgExStoneSword;
    public static Item SedStoneSword;
    public static Item MMStoneSword;
    public static Item BismuthSword;
    public static Item BismuthBronzeSword;
    public static Item BlackBronzeSword;
    public static Item BlackSteelSword;
    public static Item BlueSteelSword;
    public static Item BronzeSword;
    public static Item CopperSword;
    public static Item WroughtIronSword;
    public static Item RedSteelSword;
    public static Item RoseGoldSword;
    public static Item SteelSword;
    public static Item TinSword;
    public static Item ZincSword;

    public static Item IgInStoneMace;
    public static Item IgExStoneMace;
    public static Item SedStoneMace;
    public static Item MMStoneMace; 
    public static Item BismuthMace;
    public static Item BismuthBronzeMace;
    public static Item BlackBronzeMace;
    public static Item BlackSteelMace;
    public static Item BlueSteelMace;
    public static Item BronzeMace;
    public static Item CopperMace;
    public static Item WroughtIronMace;
    public static Item RedSteelMace;
    public static Item RoseGoldMace;
    public static Item SteelMace;
    public static Item TinMace;
    public static Item ZincMace;

    public static Item BismuthSaw;
    public static Item BismuthBronzeSaw;
    public static Item BlackBronzeSaw;
    public static Item BlackSteelSaw;
    public static Item BlueSteelSaw;
    public static Item BronzeSaw;
    public static Item CopperSaw;
    public static Item WroughtIronSaw;
    public static Item RedSteelSaw;
    public static Item RoseGoldSaw;
    public static Item SteelSaw;
    public static Item TinSaw;
    public static Item ZincSaw;

    public static Item OreChunk;
    public static Item Logs;
    public static Item Barrel;
    public static Item Javelin;

    public static Item boneIgInPick;
    public static Item boneIgInShovel;
    public static Item boneIgInAxe;
    public static Item boneIgInHoe;
    public static Item boneIgExPick;
    public static Item boneIgExShovel;
    public static Item boneIgExAxe;
    public static Item boneIgExHoe;
    public static Item boneSedPick;
    public static Item boneSedShovel;
    public static Item boneSedAxe;
    public static Item boneSedHoe;
    public static Item boneMMPick;
    public static Item boneMMShovel;
    public static Item boneMMAxe;
    public static Item boneMMHoe;
    
    public static Item BismuthScythe;
    public static Item BismuthBronzeScythe;
    public static Item BlackBronzeScythe;
    public static Item BlackSteelScythe;
    public static Item BlueSteelScythe;
    public static Item BronzeScythe;
    public static Item CopperScythe;
    public static Item WroughtIronScythe;
    public static Item RedSteelScythe;
    public static Item RoseGoldScythe;
    public static Item SteelScythe;
    public static Item TinScythe;
    public static Item ZincScythe;
    
    public static Item BismuthKnife;
    public static Item BismuthBronzeKnife;
    public static Item BlackBronzeKnife;
    public static Item BlackSteelKnife;
    public static Item BlueSteelKnife;
    public static Item BronzeKnife;
    public static Item CopperKnife;
    public static Item WroughtIronKnife;
    public static Item RedSteelKnife;
    public static Item RoseGoldKnife;
    public static Item SteelKnife;
    public static Item TinKnife;
    public static Item ZincKnife;
    
    public static Item FireStarter;
    public static Item BellowsItem;
    public static Item StoneAnvilItem;
    public static Item BismuthBronzeAnvilItem;
    public static Item BlackBronzeAnvilItem;
    public static Item BlackSteelAnvilItem;
    public static Item BlueSteelAnvilItem;
    public static Item BronzeAnvilItem;
    public static Item CopperAnvilItem;
    public static Item WroughtIronAnvilItem;
    public static Item RedSteelAnvilItem;
    public static Item RoseGoldAnvilItem;
    public static Item SteelAnvilItem;

    public static Item StoneHammer;
    public static Item BismuthHammer;
    public static Item BismuthBronzeHammer;
    public static Item BlackBronzeHammer;
    public static Item BlackSteelHammer;
    public static Item BlueSteelHammer;
    public static Item BronzeHammer;
    public static Item CopperHammer;
    public static Item WroughtIronHammer;
    public static Item RedSteelHammer;
    public static Item RoseGoldHammer;
    public static Item SteelHammer;
    public static Item TinHammer;
    public static Item ZincHammer;

    public static Item BismuthUnshaped;
    public static Item BismuthBronzeUnshaped;
    public static Item BlackBronzeUnshaped;
    public static Item BlackSteelUnshaped;
    public static Item HCBlackSteelUnshaped;
    public static Item BlueSteelUnshaped;
    public static Item WeakBlueSteelUnshaped;
    public static Item HCBlueSteelUnshaped;
    public static Item BrassUnshaped;
    public static Item BronzeUnshaped;
    public static Item CopperUnshaped;
    public static Item GoldUnshaped;
    public static Item WroughtIronUnshaped;
    public static Item LeadUnshaped;
    public static Item NickelUnshaped;
    public static Item PigIronUnshaped;
    public static Item PlatinumUnshaped;
    public static Item RedSteelUnshaped;
    public static Item WeakRedSteelUnshaped;
    public static Item HCRedSteelUnshaped;
    public static Item RoseGoldUnshaped;
    public static Item SilverUnshaped;
    public static Item SteelUnshaped;
    public static Item WeakSteelUnshaped;
    public static Item HCSteelUnshaped;
    public static Item SterlingSilverUnshaped;
    public static Item TinUnshaped;
    public static Item ZincUnshaped;
    public static Item ClayMold;
    public static Item CeramicMold;
    public static Item terraMeltedUnknown;

    public static Item terraSlag;
    public static Item Ink;

    //Plans
    public static Item PickaxeHeadPlan;
    public static Item ShovelHeadPlan;
    public static Item HoeHeadPlan;
    public static Item AxeHeadPlan;
    public static Item HammerHeadPlan;
    public static Item ChiselHeadPlan;
    public static Item SwordBladePlan;
    public static Item MaceHeadPlan;
    public static Item SawBladePlan;
    public static Item ProPickHeadPlan;
    public static Item HelmetPlan;
    public static Item ChestplatePlan;
    public static Item GreavesPlan;
    public static Item BootsPlan;
    public static Item ScythePlan;
    public static Item KnifePlan;
    public static Item BucketPlan;

    //Tool Heads
    public static Item BismuthPickaxeHead;
    public static Item BismuthBronzePickaxeHead;
    public static Item BlackBronzePickaxeHead;
    public static Item BlackSteelPickaxeHead;
    public static Item BlueSteelPickaxeHead;
    public static Item BronzePickaxeHead;
    public static Item CopperPickaxeHead;
    public static Item WroughtIronPickaxeHead;
    public static Item RedSteelPickaxeHead;
    public static Item RoseGoldPickaxeHead;
    public static Item SteelPickaxeHead;
    public static Item TinPickaxeHead;
    public static Item ZincPickaxeHead;

    public static Item BismuthShovelHead;
    public static Item BismuthBronzeShovelHead;
    public static Item BlackBronzeShovelHead;
    public static Item BlackSteelShovelHead;
    public static Item BlueSteelShovelHead;
    public static Item BronzeShovelHead;
    public static Item CopperShovelHead;
    public static Item WroughtIronShovelHead;
    public static Item RedSteelShovelHead;
    public static Item RoseGoldShovelHead;
    public static Item SilverShovelHead;
    public static Item SteelShovelHead;
    public static Item TinShovelHead;
    public static Item ZincShovelHead;

    public static Item BismuthHoeHead;
    public static Item BismuthBronzeHoeHead;
    public static Item BlackBronzeHoeHead;
    public static Item BlackSteelHoeHead;
    public static Item BlueSteelHoeHead;
    public static Item BronzeHoeHead;
    public static Item CopperHoeHead;
    public static Item WroughtIronHoeHead;
    public static Item RedSteelHoeHead;
    public static Item RoseGoldHoeHead;
    public static Item SteelHoeHead;
    public static Item TinHoeHead;
    public static Item ZincHoeHead;

    public static Item BismuthAxeHead;
    public static Item BismuthBronzeAxeHead;
    public static Item BlackBronzeAxeHead;
    public static Item BlackSteelAxeHead;
    public static Item BlueSteelAxeHead;
    public static Item BronzeAxeHead;
    public static Item CopperAxeHead;
    public static Item WroughtIronAxeHead;
    public static Item RedSteelAxeHead;
    public static Item RoseGoldAxeHead;
    public static Item SteelAxeHead;
    public static Item TinAxeHead;
    public static Item ZincAxeHead;

    public static Item BismuthHammerHead;
    public static Item BismuthBronzeHammerHead;
    public static Item BlackBronzeHammerHead;
    public static Item BlackSteelHammerHead;
    public static Item BlueSteelHammerHead;
    public static Item BronzeHammerHead;
    public static Item CopperHammerHead;
    public static Item WroughtIronHammerHead;
    public static Item RedSteelHammerHead;
    public static Item RoseGoldHammerHead;
    public static Item SteelHammerHead;
    public static Item TinHammerHead;
    public static Item ZincHammerHead;

    public static Item BismuthChiselHead;
    public static Item BismuthBronzeChiselHead;
    public static Item BlackBronzeChiselHead;
    public static Item BlackSteelChiselHead;
    public static Item BlueSteelChiselHead;
    public static Item BronzeChiselHead;
    public static Item CopperChiselHead;
    public static Item WroughtIronChiselHead;
    public static Item RedSteelChiselHead;
    public static Item RoseGoldChiselHead;
    public static Item SteelChiselHead;
    public static Item TinChiselHead;
    public static Item ZincChiselHead;

    public static Item BismuthSwordHead;
    public static Item BismuthBronzeSwordHead;
    public static Item BlackBronzeSwordHead;
    public static Item BlackSteelSwordHead;
    public static Item BlueSteelSwordHead;
    public static Item BronzeSwordHead;
    public static Item CopperSwordHead;
    public static Item WroughtIronSwordHead;
    public static Item RedSteelSwordHead;
    public static Item RoseGoldSwordHead;
    public static Item SteelSwordHead;
    public static Item TinSwordHead;
    public static Item ZincSwordHead;

    public static Item BismuthMaceHead;
    public static Item BismuthBronzeMaceHead;
    public static Item BlackBronzeMaceHead;
    public static Item BlackSteelMaceHead;
    public static Item BlueSteelMaceHead;
    public static Item BronzeMaceHead;
    public static Item CopperMaceHead;
    public static Item WroughtIronMaceHead;
    public static Item RedSteelMaceHead;
    public static Item RoseGoldMaceHead;
    public static Item SteelMaceHead;
    public static Item TinMaceHead;
    public static Item ZincMaceHead;

    public static Item BismuthSawHead;
    public static Item BismuthBronzeSawHead;
    public static Item BlackBronzeSawHead;
    public static Item BlackSteelSawHead;
    public static Item BlueSteelSawHead;
    public static Item BronzeSawHead;
    public static Item CopperSawHead;
    public static Item WroughtIronSawHead;
    public static Item RedSteelSawHead;
    public static Item RoseGoldSawHead;
    public static Item SteelSawHead;
    public static Item TinSawHead;
    public static Item ZincSawHead;

    public static Item BismuthProPickHead;
    public static Item BismuthBronzeProPickHead;
    public static Item BlackBronzeProPickHead;
    public static Item BlackSteelProPickHead;
    public static Item BlueSteelProPickHead;
    public static Item BronzeProPickHead;
    public static Item CopperProPickHead;
    public static Item WroughtIronProPickHead;
    public static Item RedSteelProPickHead;
    public static Item RoseGoldProPickHead;
    public static Item SteelProPickHead;
    public static Item TinProPickHead;
    public static Item ZincProPickHead;
    
    public static Item BismuthScytheHead;
    public static Item BismuthBronzeScytheHead;
    public static Item BlackBronzeScytheHead;
    public static Item BlackSteelScytheHead;
    public static Item BlueSteelScytheHead;
    public static Item BronzeScytheHead;
    public static Item CopperScytheHead;
    public static Item WroughtIronScytheHead;
    public static Item RedSteelScytheHead;
    public static Item RoseGoldScytheHead;
    public static Item SteelScytheHead;
    public static Item TinScytheHead;
    public static Item ZincScytheHead;
    
    public static Item BismuthKnifeHead;
    public static Item BismuthBronzeKnifeHead;
    public static Item BlackBronzeKnifeHead;
    public static Item BlackSteelKnifeHead;
    public static Item BlueSteelKnifeHead;
    public static Item BronzeKnifeHead;
    public static Item CopperKnifeHead;
    public static Item WroughtIronKnifeHead;
    public static Item RedSteelKnifeHead;
    public static Item RoseGoldKnifeHead;
    public static Item SteelKnifeHead;
    public static Item TinKnifeHead;
    public static Item ZincKnifeHead;

    public static Item Coke;
    public static Item Flux;

    //Formerly TFC_Mining
    
    public static Item terraGoldPan;
    public static Item terraSluiceItem;

    public static Item ProPickStone;
    public static Item ProPickBismuth; 
    public static Item ProPickBismuthBronze;   
    public static Item ProPickBlackBronze;
    public static Item ProPickBlackSteel;
    public static Item ProPickBlueSteel;
    public static Item ProPickBronze;
    public static Item ProPickCopper;
    public static Item ProPickIron;
    public static Item ProPickRedSteel;
    public static Item ProPickRoseGold;
    public static Item ProPickSteel;
    public static Item ProPickTin;
    public static Item ProPickZinc;

    /**Armor Crafting related items*/
    public static Item BismuthSheet;
    public static Item BismuthBronzeSheet;
    public static Item BlackBronzeSheet;
    public static Item BlackSteelSheet;
    public static Item BlueSteelSheet;
    public static Item BronzeSheet;
    public static Item CopperSheet;
    public static Item WroughtIronSheet;
    public static Item RedSteelSheet;
    public static Item RoseGoldSheet;
    public static Item SteelSheet;
    public static Item TinSheet;
    public static Item ZincSheet;
    
    public static Item BrassSheet;
    public static Item GoldSheet;
    public static Item LeadSheet;
    public static Item NickelSheet;
    public static Item PigIronSheet;
    public static Item PlatinumSheet;
    public static Item SilverSheet;
    public static Item SterlingSilverSheet;

    public static Item BismuthSheet2x;
    public static Item BismuthBronzeSheet2x;
    public static Item BlackBronzeSheet2x;
    public static Item BlackSteelSheet2x;
    public static Item BlueSteelSheet2x;
    public static Item BronzeSheet2x;
    public static Item CopperSheet2x;
    public static Item WroughtIronSheet2x;
    public static Item RedSteelSheet2x;
    public static Item RoseGoldSheet2x;
    public static Item SteelSheet2x;
    public static Item TinSheet2x;
    public static Item ZincSheet2x;
    
    public static Item BrassSheet2x;
    public static Item GoldSheet2x;
    public static Item LeadSheet2x;
    public static Item NickelSheet2x;
    public static Item PigIronSheet2x;
    public static Item PlatinumSheet2x;
    public static Item SilverSheet2x;
    public static Item SterlingSilverSheet2x;

    public static Item BismuthUnfinishedChestplate;
    public static Item BismuthBronzeUnfinishedChestplate;
    public static Item BlackBronzeUnfinishedChestplate;
    public static Item BlackSteelUnfinishedChestplate;
    public static Item BlueSteelUnfinishedChestplate;
    public static Item BronzeUnfinishedChestplate;
    public static Item CopperUnfinishedChestplate;
    public static Item WroughtIronUnfinishedChestplate;
    public static Item RedSteelUnfinishedChestplate;
    public static Item RoseGoldUnfinishedChestplate;
    public static Item SteelUnfinishedChestplate;
    public static Item TinUnfinishedChestplate;
    public static Item ZincUnfinishedChestplate;

    public static Item BismuthUnfinishedGreaves;
    public static Item BismuthBronzeUnfinishedGreaves;
    public static Item BlackBronzeUnfinishedGreaves;
    public static Item BlackSteelUnfinishedGreaves;
    public static Item BlueSteelUnfinishedGreaves;
    public static Item BronzeUnfinishedGreaves;
    public static Item CopperUnfinishedGreaves;
    public static Item WroughtIronUnfinishedGreaves;
    public static Item RedSteelUnfinishedGreaves;
    public static Item RoseGoldUnfinishedGreaves;
    public static Item SteelUnfinishedGreaves;
    public static Item TinUnfinishedGreaves;
    public static Item ZincUnfinishedGreaves;

    public static Item BismuthUnfinishedBoots;
    public static Item BismuthBronzeUnfinishedBoots;
    public static Item BlackBronzeUnfinishedBoots;
    public static Item BlackSteelUnfinishedBoots;
    public static Item BlueSteelUnfinishedBoots;
    public static Item BronzeUnfinishedBoots;
    public static Item CopperUnfinishedBoots;
    public static Item WroughtIronUnfinishedBoots;
    public static Item RedSteelUnfinishedBoots;
    public static Item RoseGoldUnfinishedBoots;
    public static Item SteelUnfinishedBoots;
    public static Item TinUnfinishedBoots;
    public static Item ZincUnfinishedBoots;

    public static Item BismuthUnfinishedHelmet;
    public static Item BismuthBronzeUnfinishedHelmet;
    public static Item BlackBronzeUnfinishedHelmet;
    public static Item BlackSteelUnfinishedHelmet;
    public static Item BlueSteelUnfinishedHelmet;
    public static Item BronzeUnfinishedHelmet;
    public static Item CopperUnfinishedHelmet;
    public static Item WroughtIronUnfinishedHelmet;
    public static Item RedSteelUnfinishedHelmet;
    public static Item RoseGoldUnfinishedHelmet;
    public static Item SteelUnfinishedHelmet;
    public static Item TinUnfinishedHelmet;
    public static Item ZincUnfinishedHelmet;

    public static Item BismuthChestplate;
    public static Item BismuthBronzeChestplate;
    public static Item BlackBronzeChestplate;
    public static Item BlackSteelChestplate;
    public static Item BlueSteelChestplate;
    public static Item BronzeChestplate;
    public static Item CopperChestplate;
    public static Item WroughtIronChestplate;
    public static Item RedSteelChestplate;
    public static Item RoseGoldChestplate;
    public static Item SteelChestplate;
    public static Item TinChestplate;
    public static Item ZincChestplate;

    public static Item BismuthGreaves;
    public static Item BismuthBronzeGreaves;
    public static Item BlackBronzeGreaves;
    public static Item BlackSteelGreaves;
    public static Item BlueSteelGreaves;
    public static Item BronzeGreaves;
    public static Item CopperGreaves;
    public static Item WroughtIronGreaves;
    public static Item RedSteelGreaves;
    public static Item RoseGoldGreaves;
    public static Item SteelGreaves;
    public static Item TinGreaves;
    public static Item ZincGreaves;

    public static Item BismuthBoots;
    public static Item BismuthBronzeBoots;
    public static Item BlackBronzeBoots;
    public static Item BlackSteelBoots;
    public static Item BlueSteelBoots;
    public static Item BronzeBoots;
    public static Item CopperBoots;
    public static Item WroughtIronBoots;
    public static Item RedSteelBoots;
    public static Item RoseGoldBoots;
    public static Item SteelBoots;
    public static Item TinBoots;
    public static Item ZincBoots;

    public static Item BismuthHelmet;
    public static Item BismuthBronzeHelmet;
    public static Item BlackBronzeHelmet;
    public static Item BlackSteelHelmet;
    public static Item BlueSteelHelmet;
    public static Item BronzeHelmet;
    public static Item CopperHelmet;
    public static Item WroughtIronHelmet;
    public static Item RedSteelHelmet;
    public static Item RoseGoldHelmet;
    public static Item SteelHelmet;
    public static Item TinHelmet;
    public static Item ZincHelmet;
    
    public static Item WoodenBucketEmpty;
    public static Item WoodenBucketWater;
    public static Item WoodenBucketMilk;
    
    /**Food Related Items and Blocks*/
    public static Item SeedsWheat;
    public static Item SeedsMelon;
    public static Item SeedsPumpkin;
    public static Item SeedsMaize;
    public static Item SeedsTomato;
    public static Item SeedsBarley;
    public static Item SeedsRye;
    public static Item SeedsOat;
    public static Item SeedsRice;
    public static Item SeedsPotato;
    public static Item SeedsOnion;
    public static Item SeedsCabbage;
    public static Item SeedsGarlic;
    public static Item SeedsCarrot;
    public static Item SeedsSugarcane;
    public static Item SeedsHemp;
    public static Item SeedsYellowBellPepper;
    public static Item SeedsRedBellPepper;
    public static Item SeedsSoybean;
    public static Item SeedsGreenbean;
    public static Item SeedsSquash;
    
    public static Item FruitTreeSapling1;
    public static Item FruitTreeSapling2;
    
    public static Item RedApple;
    public static Item GreenApple;
    public static Item Banana;
    public static Item Orange;
    public static Item Lemon;
    public static Item Olive;
    public static Item Cherry;
    public static Item Peach;
    public static Item Plum;
    public static Item Egg;
    public static Item EggCooked;
    
    public static Item WheatGrain;
    public static Item BarleyGrain;
    public static Item OatGrain;
    public static Item RyeGrain;
    public static Item RiceGrain;
    public static Item MaizeEar;
    public static Item Tomato;
    public static Item Potato;
    public static Item Onion;
    public static Item Cabbage;
    public static Item Garlic;
    public static Item Carrot;
    public static Item Sugarcane;
    public static Item Hemp;
    public static Item Soybean;
    public static Item Greenbeans;
    public static Item GreenBellPepper;
    public static Item YellowBellPepper;
    public static Item RedBellPepper;
    public static Item Squash;
    
    public static Item WheatGround;
    public static Item BarleyGround;
    public static Item OatGround;
    public static Item RyeGround;
    public static Item RiceGround;
    public static Item CornmealGround;
    
    public static Item WheatDough;
    public static Item BarleyDough;
    public static Item OatDough;
    public static Item RyeDough;
    public static Item RiceDough;
    public static Item CornmealDough;
    
    public static Item BarleyBread;
    public static Item OatBread;
    public static Item RyeBread;
    public static Item RiceBread;
    public static Item CornBread;
    
    public static Item WheatWhole;
    public static Item BarleyWhole;
    public static Item OatWhole;
    public static Item RyeWhole;
    public static Item RiceWhole;
    
    public static Item LooseRock;
    public static Item FlatRock;
    
    public static Item IgInStonePickaxeHead;
    public static Item SedStonePickaxeHead;
    public static Item IgExStonePickaxeHead;
    public static Item MMStonePickaxeHead;
    public static Item IgInStoneShovelHead;
    public static Item SedStoneShovelHead;
    public static Item IgExStoneShovelHead;
    public static Item MMStoneShovelHead;
    public static Item IgInStoneAxeHead;
    public static Item SedStoneAxeHead;
    public static Item IgExStoneAxeHead;
    public static Item MMStoneAxeHead;
    public static Item IgInStoneHoeHead;
    public static Item SedStoneHoeHead;
    public static Item IgExStoneHoeHead;
    public static Item MMStoneHoeHead;
    
    public static Item StoneKnife;
    public static Item StoneKnifeHead;
    public static Item StoneHammerHead;
    public static Item StoneProPickHead;
    public static Item SmallOreChunk;
    public static Item SinglePlank;
    
    public static Item minecartEmpty;
    public static Item minecartCrate;
    
    public static Item RedSteelBucketEmpty;
    public static Item RedSteelBucketWater;
    
    public static Item BlueSteelBucketEmpty;
    public static Item BlueSteelBucketLava;
    
    public static Item MealGeneric;
    public static Item MealMoveSpeed;
    public static Item MealDigSpeed;
    public static Item MealDamageBoost;
    public static Item MealJump;
    public static Item MealDamageResist;
    public static Item MealFireResist;
    public static Item MealWaterBreathing;
    public static Item MealNightVision;
    
    public static Item Quern;
    public static Item FlintSteel;
    
    public static Item DoorOak;
	public static Item DoorAspen;
	public static Item DoorBirch;
	public static Item DoorChestnut;
	public static Item DoorDouglasFir;
	public static Item DoorHickory;
	public static Item DoorMaple;
	public static Item DoorAsh;
	public static Item DoorPine;
	public static Item DoorSequoia;
	public static Item DoorSpruce;
	public static Item DoorSycamore;
	public static Item DoorWhiteCedar;
	public static Item DoorWhiteElm;
	public static Item DoorWillow;
	public static Item DoorKapok;
	
	public static Item Blueprint;
	public static Item writabeBookTFC;
    public static Item WoolYarn;
    public static Item Wool;
    public static Item WoolCloth;
    public static Item Spindle;
    public static Item ClaySpindle;
    public static Item SpindleHead;
    public static Item StoneBrick;
    public static Item Mortar;
    public static Item Limewater;
    public static Item Hide;
    public static Item SoakedHide;
    public static Item ScrapedHide;
    public static Item PrepHide;
    public static Item SheepSkin;
    public static Item TerraLeather;
    public static Item muttonRaw;
    public static Item muttonCooked;
    public static Item FlatLeather;
    public static Item Beer;
    
    /**
     * Item Uses Setup
     * */
    public static int IgInStoneUses = 60;
    public static int IgExStoneUses = 70;
    public static int SedStoneUses = 50;
    public static int MMStoneUses = 55; 
    
    //Tier 0
    public static int BismuthUses = 300;
    public static int TinUses = 290;
    public static int ZincUses = 250;
    //Tier 1
    public static int CopperUses = 600;
    //Tier 2
    public static int BronzeUses = 1300;
    public static int RoseGoldUses = 1140;
    public static int BismuthBronzeUses = 1200;
    public static int BlackBronzeUses = 1460;
    //Tier 3
    public static int WroughtIronUses = 2200;
    //Tier 4
    public static int SteelUses = 3300;
    //Tier 5
    public static int BlackSteelUses = 4200;
    //Tier 6
    public static int BlueSteelUses = 6500;
    public static int RedSteelUses = 6500;
    
    
  //Tier 0
    public static float BismuthEff = 11;
    public static float TinEff = 10.5f;
    public static float ZincEff = 10;
    //Tier 1
    public static float CopperEff = 12;
    //Tier 2
    public static float BronzeEff = 15;
    public static float RoseGoldEff = 13;
    public static float BismuthBronzeEff = 14;
    public static float BlackBronzeEff = 16;
    //Tier 3
    public static float WroughtIronEff = 16;
    //Tier 4
    public static float SteelEff = 17;
    //Tier 5
    public static float BlackSteelEff = 18;
    //Tier 6
    public static float BlueSteelEff = 21;
    public static float RedSteelEff = 21;
    
    
    
    
    public static EnumToolMaterial IgInToolMaterial = EnumHelper.addToolMaterial("IgIn", 1, IgInStoneUses, 7F, 10, 5);
    public static EnumToolMaterial SedToolMaterial = EnumHelper.addToolMaterial("Sed", 1, SedStoneUses, 6F, 10, 5);
    public static EnumToolMaterial IgExToolMaterial = EnumHelper.addToolMaterial("IgEx", 1, IgExStoneUses, 7F, 10, 5);
    public static EnumToolMaterial MMToolMaterial = EnumHelper.addToolMaterial("MM", 1, MMStoneUses, 6.5F, 10, 5);

    public static EnumToolMaterial BismuthToolMaterial = EnumHelper.addToolMaterial("Bismuth", 2, BismuthUses, BismuthEff, 65, 10);
    public static EnumToolMaterial BismuthBronzeToolMaterial = EnumHelper.addToolMaterial("BismuthBronze", 2, BismuthBronzeUses, BismuthBronzeEff, 85, 10);
    public static EnumToolMaterial BlackBronzeToolMaterial = EnumHelper.addToolMaterial("BlackBronze", 2, BlackBronzeUses, BlackBronzeEff, 100, 10);
    public static EnumToolMaterial BlackSteelToolMaterial = EnumHelper.addToolMaterial("BlackSteel", 2, BlackSteelUses, BlackSteelEff, 165, 12);
    public static EnumToolMaterial BlueSteelToolMaterial = EnumHelper.addToolMaterial("BlueSteel", 3, BlueSteelUses, BlueSteelEff, 185, 22);
    public static EnumToolMaterial BronzeToolMaterial = EnumHelper.addToolMaterial("Bronze", 2, BronzeUses, BronzeEff, 100, 13);
    public static EnumToolMaterial CopperToolMaterial = EnumHelper.addToolMaterial("Copper", 2, CopperUses, CopperEff, 85, 8);
    public static EnumToolMaterial IronToolMaterial = EnumHelper.addToolMaterial("Iron", 2, WroughtIronUses, WroughtIronEff, 135, 10);
    public static EnumToolMaterial RedSteelToolMaterial = EnumHelper.addToolMaterial("RedSteel", 3, RedSteelUses, RedSteelEff, 185, 22);
    public static EnumToolMaterial RoseGoldToolMaterial = EnumHelper.addToolMaterial("RoseGold", 2, RoseGoldUses, RoseGoldEff, 100, 20);
    public static EnumToolMaterial SteelToolMaterial = EnumHelper.addToolMaterial("Steel", 2, SteelUses, SteelEff, 150, 10);
    public static EnumToolMaterial TinToolMaterial = EnumHelper.addToolMaterial("Tin", 2, TinUses, TinEff, 65, 8);
    public static EnumToolMaterial ZincToolMaterial = EnumHelper.addToolMaterial("Zinc", 2, ZincUses, ZincEff, 65, 8);
    
    
    
    static Configuration config;
    
    
    public static void Setup()
    {
        try
        {
            config = new net.minecraftforge.common.Configuration(
            		new File(TerraFirmaCraft.proxy.getMinecraftDir(), "/config/TFC.cfg"));
            config.load();
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("[TFC] Error while trying to access item configuration!").toString());
            config = null;
        } 
        System.out.println(new StringBuilder().append("[TFC] Loading Items").toString());
        
        //Replace any vanilla Items here
        Item.itemsList[Item.coal.itemID] = null; Item.itemsList[Item.coal.itemID] = (new TFC.Items.ItemCoal(7)).setUnlocalizedName("coal");
        Item.itemsList[Item.stick.itemID] = null; Item.itemsList[Item.stick.itemID] = new ItemStick(24).setIconCoord(5, 3).setFull3D().setUnlocalizedName("Stick");
        Item.itemsList[Item.leather.itemID] = null; Item.itemsList[Item.leather.itemID] = new ItemTerra(Item.leather.itemID).setIconCoord(0, 0).setFull3D().setUnlocalizedName("Leather");
        
        minecartCrate = (new ItemCustomMinecart(TFC_Settings.getIntFor(config,"item","minecartCrate",16000), 1)).setIconCoord(7, 9).setUnlocalizedName("minecartChest");
        
        Item.itemsList[5+256] = null; Item.itemsList[5+256] = (new ItemCustomBow(5)).setIconCoord(5, 1).setUnlocalizedName("bow");
        Item.itemsList[63+256] = null; Item.itemsList[63+256] = new ItemTerra(63,"/gui/items.png").setIconCoord(7, 5).setUnlocalizedName("porkchopRaw");
        Item.itemsList[64+256] = null; Item.itemsList[64+256] = new ItemTerraFood(64, 35, 0.8F, true,"/gui/items.png", 38).setIconCoord(8, 5).setUnlocalizedName("porkchopCooked");
        Item.itemsList[93+256] = null; Item.itemsList[93+256] = new ItemTerra(93, "/gui/items.png").setIconCoord(9, 5).setUnlocalizedName("fishRaw");
        Item.itemsList[94+256] = null; Item.itemsList[94+256] = new ItemTerraFood(94, 30, 0.6F, true,"/gui/items.png", 39).setIconCoord(10, 5).setUnlocalizedName("fishCooked");
        Item.itemsList[107+256] = null; Item.itemsList[107+256] = new ItemTerra(107, "/gui/items.png").setIconCoord(9, 6).setUnlocalizedName("beefRaw");
        Item.itemsList[108+256] = null; Item.itemsList[108+256] = new ItemTerraFood(108, 40, 0.8F, true,"/gui/items.png", 40).setIconCoord(10, 6).setUnlocalizedName("beefCooked");
        Item.itemsList[109+256] = null; Item.itemsList[109+256] = new ItemTerra(109,"/gui/items.png").setIconCoord(9, 7).setUnlocalizedName("chickenRaw");
        Item.itemsList[110+256] = null; Item.itemsList[110+256] = new ItemTerraFood(110, 35, 0.6F, true,"/gui/items.png", 41).setIconCoord(10, 6).setIconCoord(10, 7).setUnlocalizedName("chickenCooked");
        Item.itemsList[41+256] = null; Item.itemsList[41+256] = (new ItemTerraFood(41, 25, 0.6F, false,"/gui/items.png", 42)).setIconCoord(9, 2).setUnlocalizedName("bread");
        Item.itemsList[88+256] = null; Item.itemsList[88+256] = (new ItemTerra(88,"/gui/items.png")).setIconCoord(12, 0).setUnlocalizedName("egg");
        Item.itemsList[Item.dyePowder.itemID] = null; Item.itemsList[Item.dyePowder.itemID] = new ItemDyeCustom(95).setIconCoord(14, 4).setUnlocalizedName("dyePowder");
        Item.itemsList[Item.potion.itemID] = null; Item.itemsList[Item.potion.itemID] = (ItemCustomPotion)(new ItemCustomPotion(117)).setIconCoord(13, 8).setUnlocalizedName("potion");
        
        
        
		
        terraGoldPan = new ItemGoldPan(TFC_Settings.getIntFor(config,"item","terraGoldPan",16001)).setUnlocalizedName("GoldPan").setIconCoord(1, 0);
        terraSluiceItem = new ItemSluice(TFC_Settings.getIntFor(config,"item","terraSluiceItem",16002)).setUnlocalizedName("SluiceItem").setIconCoord(9, 0);
        
        ProPickStone = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickStone",16003)).setUnlocalizedName("Stone ProPick").setIconCoord(0, 1).setMaxDamage(64);
        ProPickBismuth = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickBismuth",16004)).setUnlocalizedName("Bismuth ProPick").setIconCoord(1, 1).setMaxDamage(BismuthUses);
        ProPickBismuthBronze = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickBismuthBronze",16005)).setUnlocalizedName("Bismuth Bronze ProPick").setIconCoord(2, 1).setMaxDamage(BismuthBronzeUses);
        ProPickBlackBronze = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickBlackBronze",16006)).setUnlocalizedName("Black Bronze ProPick").setIconCoord(3, 1).setMaxDamage(BlackBronzeUses);
        ProPickBlackSteel = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickBlackSteel",16007)).setUnlocalizedName("Black Steel ProPick").setIconCoord(4, 1).setMaxDamage(BlackSteelUses);
        ProPickBlueSteel = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickBlueSteel",16008)).setUnlocalizedName("Blue Steel ProPick").setIconCoord(5, 1).setMaxDamage(BlueSteelUses);
        ProPickBronze = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickBronze",16009)).setUnlocalizedName("Bronze ProPick").setIconCoord(6, 1).setMaxDamage(BronzeUses);
        ProPickCopper = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickCopper",16010)).setUnlocalizedName("Copper ProPick").setIconCoord(7, 1).setMaxDamage(CopperUses);
        ProPickIron = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickWroughtIron",16012)).setUnlocalizedName("Wrought Iron ProPick").setIconCoord(8, 1).setMaxDamage(WroughtIronUses);
        ProPickRedSteel = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickRedSteel",16016)).setUnlocalizedName("Red Steel ProPick").setIconCoord(9, 1).setMaxDamage(RedSteelUses);
        ProPickRoseGold = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickRoseGold",16017)).setUnlocalizedName("Rose Gold ProPick").setIconCoord(10, 1).setMaxDamage(RoseGoldUses);
        ProPickSteel = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickSteel",16019)).setUnlocalizedName("Steel ProPick").setIconCoord(11, 1).setMaxDamage(SteelUses);
        ProPickTin = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickTin",16021)).setUnlocalizedName("Tin ProPick").setIconCoord(12, 1).setMaxDamage(TinUses);
        ProPickZinc = new ItemProPick(TFC_Settings.getIntFor(config,"item","ProPickZinc",16022)).setUnlocalizedName("Zinc ProPick").setIconCoord(13, 1).setMaxDamage(ZincUses);
        
        BismuthIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BismuthIngot",16028), EnumMetalType.BISMUTH).setUnlocalizedName("BismuthIngot").setIconCoord(0, 3);
        BismuthBronzeIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BismuthBronzeIngot",16029), EnumMetalType.BISMUTHBRONZE).setUnlocalizedName("BismuthBronzeIngot").setIconCoord(1, 3);
        BlackBronzeIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BlackBronzeIngot",16030), EnumMetalType.BLACKBRONZE).setUnlocalizedName("BlackBronzeIngot").setIconCoord(2, 3);
        BlackSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BlackSteelIngot",16031), EnumMetalType.BLACKSTEEL).setUnlocalizedName("BlackSteelIngot").setIconCoord(3, 3);
        BlueSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BlueSteelIngot",16032), EnumMetalType.BLUESTEEL).setUnlocalizedName("BlueSteelIngot").setIconCoord(4, 3);
        BrassIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BrassIngot",16033), EnumMetalType.BRASS).setUnlocalizedName("BrassIngot").setIconCoord(5, 3);
        BronzeIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","BronzeIngot",16034), EnumMetalType.BRONZE).setUnlocalizedName("BronzeIngot").setIconCoord(6, 3);
        CopperIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","CopperIngot",16035), EnumMetalType.COPPER).setUnlocalizedName("CopperIngot").setIconCoord(7, 3);
        GoldIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","GoldIngot",16036), EnumMetalType.GOLD).setUnlocalizedName("GoldIngot").setIconCoord(8, 3);
        WroughtIronIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","WroughtIronIngot",16037), EnumMetalType.WROUGHTIRON).setUnlocalizedName("WroughtIronIngot").setIconCoord(9, 3);
        LeadIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","LeadIngot",16038), EnumMetalType.LEAD).setUnlocalizedName("LeadIngot").setIconCoord(10, 3);
        NickelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","NickelIngot",16039), EnumMetalType.NICKEL).setUnlocalizedName("NickelIngot").setIconCoord(0, 4);
        PigIronIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","PigIronIngot",16040), EnumMetalType.PIGIRON).setUnlocalizedName("PigIronIngot").setIconCoord(1, 4);
        PlatinumIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","PlatinumIngot",16041), EnumMetalType.PLATINUM).setUnlocalizedName("PlatinumIngot").setIconCoord(2, 4);
        RedSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","RedSteelIngot",16042), EnumMetalType.REDSTEEL).setUnlocalizedName("RedSteelIngot").setIconCoord(3, 4);
        RoseGoldIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","RoseGoldIngot",16043), EnumMetalType.ROSEGOLD).setUnlocalizedName("RoseGoldIngot").setIconCoord(4, 4);
        SilverIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","SilverIngot",16044), EnumMetalType.SILVER).setUnlocalizedName("SilverIngot").setIconCoord(5, 4);
        SteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","SteelIngot",16045), EnumMetalType.STEEL).setUnlocalizedName("SteelIngot").setIconCoord(6, 4);
        SterlingSilverIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","SterlingSilverIngot",16046), EnumMetalType.STERLINGSILVER).setUnlocalizedName("SterlingSilverIngot").setIconCoord(7, 4);
        TinIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","TinIngot",16047), EnumMetalType.TIN).setUnlocalizedName("TinIngot").setIconCoord(8, 4);
        ZincIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","ZincIngot",16048), EnumMetalType.ZINC).setUnlocalizedName("ZincIngot").setIconCoord(9, 4);

        BismuthIngot2x = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BismuthIngot2x",16049), EnumMetalType.BISMUTH).setUnlocalizedName("BismuthIngot2x").setIconCoord(0, 5)).setSize(EnumSize.LARGE);
        BismuthBronzeIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BismuthBronzeIngot2x",16050), EnumMetalType.BISMUTHBRONZE).setUnlocalizedName("BismuthBronzeIngot2x").setIconCoord(1, 5)).setSize(EnumSize.LARGE);
        BlackBronzeIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BlackBronzeIngot2x",16051), EnumMetalType.BLACKBRONZE).setUnlocalizedName("BlackBronzeIngot2x").setIconCoord(2, 5)).setSize(EnumSize.LARGE);
        BlackSteelIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BlackSteelIngot2x",16052), EnumMetalType.BLACKSTEEL).setUnlocalizedName("BlackSteelIngot2x").setIconCoord(3, 5)).setSize(EnumSize.LARGE);
        BlueSteelIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BlueSteelIngot2x",16053), EnumMetalType.BLUESTEEL).setUnlocalizedName("BlueSteelIngot2x").setIconCoord(4, 5)).setSize(EnumSize.LARGE);
        BrassIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BrassIngot2x",16054), EnumMetalType.BRASS).setUnlocalizedName("BrassIngot2x").setIconCoord(5, 5)).setSize(EnumSize.LARGE);
        BronzeIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","BronzeIngot2x",16055), EnumMetalType.BRONZE).setUnlocalizedName("BronzeIngot2x").setIconCoord(6, 5)).setSize(EnumSize.LARGE);
        CopperIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","CopperIngot2x",16056), EnumMetalType.COPPER).setUnlocalizedName("CopperIngot2x").setIconCoord(7, 5)).setSize(EnumSize.LARGE);
        GoldIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","GoldIngot2x",16057), EnumMetalType.GOLD).setUnlocalizedName("GoldIngot2x").setIconCoord(8, 5)).setSize(EnumSize.LARGE);
        WroughtIronIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","WroughtIronIngot2x",16058), EnumMetalType.WROUGHTIRON).setUnlocalizedName("WroughtIronIngot2x").setIconCoord(9, 5)).setSize(EnumSize.LARGE);
        LeadIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","LeadIngot2x",16059), EnumMetalType.LEAD).setUnlocalizedName("LeadIngot2x").setIconCoord(10, 5)).setSize(EnumSize.LARGE);
        NickelIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","NickelIngot2x",16060), EnumMetalType.NICKEL).setUnlocalizedName("NickelIngot2x").setIconCoord(0, 6)).setSize(EnumSize.LARGE);
        PigIronIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","PigIronIngot2x",16061), EnumMetalType.PIGIRON).setUnlocalizedName("PigIronIngot2x").setIconCoord(1, 6)).setSize(EnumSize.LARGE);
        PlatinumIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","PlatinumIngot2x",16062), EnumMetalType.PLATINUM).setUnlocalizedName("PlatinumIngot2x").setIconCoord(2, 6)).setSize(EnumSize.LARGE);
        RedSteelIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","RedSteelIngot2x",16063), EnumMetalType.REDSTEEL).setUnlocalizedName("RedSteelIngot2x").setIconCoord(3, 6)).setSize(EnumSize.LARGE);
        RoseGoldIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","RoseGoldIngot2x",16064), EnumMetalType.ROSEGOLD).setUnlocalizedName("RoseGoldIngot2x").setIconCoord(4, 6)).setSize(EnumSize.LARGE);
        SilverIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","SilverIngot2x",16065), EnumMetalType.SILVER).setUnlocalizedName("SilverIngot2x").setIconCoord(5, 6)).setSize(EnumSize.LARGE);
        SteelIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","SteelIngot2x",16066), EnumMetalType.STEEL).setUnlocalizedName("SteelIngot2x").setIconCoord(6, 6)).setSize(EnumSize.LARGE);
        SterlingSilverIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","SterlingSilverIngot2x",16067), EnumMetalType.STERLINGSILVER).setUnlocalizedName("SterlingSilverIngot2x").setIconCoord(7, 6)).setSize(EnumSize.LARGE);
        TinIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","TinIngot2x",16068), EnumMetalType.TIN).setUnlocalizedName("TinIngot2x").setIconCoord(8, 6)).setSize(EnumSize.LARGE);
        ZincIngot2x  = ((ItemIngot)new ItemIngot(TFC_Settings.getIntFor(config,"item","ZincIngot2x",16069), EnumMetalType.ZINC).setUnlocalizedName("ZincIngot2x").setIconCoord(9, 6)).setSize(EnumSize.LARGE);

        SulfurPowder = new ItemTerra(TFC_Settings.getIntFor(config,"item","SulfurPowder",16070)).setTexturePath("/bioxx/terrasprites.png").setUnlocalizedName("SulfurPowder").setIconCoord(1, 0);
        SaltpeterPowder = new ItemTerra(TFC_Settings.getIntFor(config,"item","SaltpeterPowder",16071)).setTexturePath("/bioxx/terrasprites.png").setUnlocalizedName("SaltpeterPowder").setIconCoord(0, 0);

        GemRuby = new ItemGem(TFC_Settings.getIntFor(config,"item","GemRuby",16080)).setUnlocalizedName("Ruby").setIconCoord(11, 3);
        GemSapphire = new ItemGem(TFC_Settings.getIntFor(config,"item","GemSapphire",16081)).setUnlocalizedName("Sapphire").setIconCoord(11, 4);
        GemEmerald = new ItemGem(TFC_Settings.getIntFor(config,"item","GemEmerald",16082)).setUnlocalizedName("Emerald").setIconCoord(11, 5);
        GemTopaz = new ItemGem(TFC_Settings.getIntFor(config,"item","GemTopaz",16083)).setUnlocalizedName("Topaz").setIconCoord(11, 6);
        GemTourmaline = new ItemGem(TFC_Settings.getIntFor(config,"item","GemTourmaline",16084)).setUnlocalizedName("Tourmaline").setIconCoord(11, 7);
        GemJade = new ItemGem(TFC_Settings.getIntFor(config,"item","GemJade",16085)).setUnlocalizedName("Jade").setIconCoord(11, 8);
        GemBeryl = new ItemGem(TFC_Settings.getIntFor(config,"item","GemBeryl",16086)).setUnlocalizedName("Beryl").setIconCoord(11, 9);
        GemAgate = new ItemGem(TFC_Settings.getIntFor(config,"item","GemAgate",16087)).setUnlocalizedName("Agate").setIconCoord(11, 10);
        GemOpal = new ItemGem(TFC_Settings.getIntFor(config,"item","GemOpal",16088)).setUnlocalizedName("Opal").setIconCoord(11, 11);
        GemGarnet = new ItemGem(TFC_Settings.getIntFor(config,"item","GemGarnet",16089)).setUnlocalizedName("Garnet").setIconCoord(11, 12);
        GemJasper = new ItemGem(TFC_Settings.getIntFor(config,"item","GemJasper",16090)).setUnlocalizedName("Jasper").setIconCoord(11, 13);
        GemAmethyst = new ItemGem(TFC_Settings.getIntFor(config,"item","GemAmethyst",16091)).setUnlocalizedName("Amethyst").setIconCoord(11, 14);
        GemDiamond = new ItemGem(TFC_Settings.getIntFor(config,"item","GemDiamond",16092)).setUnlocalizedName("Diamond").setIconCoord(11, 15);

        //Tools
        IgInPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","IgInPick",16100),IgInToolMaterial).setUnlocalizedName("IgIn Stone Pick").setMaxDamage(IgInStoneUses).setIconCoord(0, 3);
        IgInShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","IgInShovel",16101),IgInToolMaterial).setUnlocalizedName("IgIn Stone Shovel").setMaxDamage(IgInStoneUses).setIconCoord(0, 4);
        IgInAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","IgInAxe",16102),IgInToolMaterial).setUnlocalizedName("IgIn Stone Axe").setMaxDamage(IgInStoneUses).setIconCoord(0, 5);
        IgInHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","IgInHoe",16103),IgInToolMaterial).setUnlocalizedName("IgIn Stone Hoe").setMaxDamage(IgInStoneUses).setIconCoord(0, 6);
        SedPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","SedPick",16104),SedToolMaterial).setUnlocalizedName("Sed Stone Pick").setMaxDamage(SedStoneUses).setIconCoord(0, 3);
        SedShovel= new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","SedShovel",16105),SedToolMaterial).setUnlocalizedName("Sed Stone Shovel").setMaxDamage(SedStoneUses).setIconCoord(0, 4);
        SedAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","SedAxe",16106),SedToolMaterial).setUnlocalizedName("Sed Stone Axe").setMaxDamage(SedStoneUses).setIconCoord(0, 5);
        SedHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","SedHoe",16107),SedToolMaterial).setUnlocalizedName("Sed Stone Hoe").setMaxDamage(SedStoneUses).setIconCoord(0, 6);
        IgExPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","IgExPick",16108),IgExToolMaterial).setUnlocalizedName("IgEx Stone Pick").setMaxDamage(IgExStoneUses).setIconCoord(0, 3);
        IgExShovel= new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","IgExShovel",16109),IgExToolMaterial).setUnlocalizedName("IgEx Stone Shovel").setMaxDamage(IgExStoneUses).setIconCoord(0, 4);
        IgExAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","IgExAxe",16110),IgExToolMaterial).setUnlocalizedName("IgEx Stone Axe").setMaxDamage(IgExStoneUses).setIconCoord(0, 5);
        IgExHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","IgExHoe",16111),IgExToolMaterial).setUnlocalizedName("IgEx Stone Hoe").setMaxDamage(IgExStoneUses).setIconCoord(0, 6);
        MMPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","MMPick",16112),MMToolMaterial).setUnlocalizedName("MM Stone Pick").setMaxDamage(MMStoneUses).setIconCoord(0, 3);
        MMShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","MMShovel",16113),MMToolMaterial).setUnlocalizedName("MM Stone Shovel").setMaxDamage(MMStoneUses).setIconCoord(0, 4);
        MMAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","MMAxe",16114),MMToolMaterial).setUnlocalizedName("MM Stone Axe").setMaxDamage(MMStoneUses).setIconCoord(0, 5);
        MMHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","MMHoe",16115),MMToolMaterial).setUnlocalizedName("MM Stone Hoe").setMaxDamage(MMStoneUses).setIconCoord(0, 6);

        BismuthPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","BismuthPick",16116),BismuthToolMaterial).setUnlocalizedName("Bismuth Pick").setMaxDamage(BismuthUses).setIconCoord(1, 3);
        BismuthShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","BismuthShovel",16117),BismuthToolMaterial).setUnlocalizedName("Bismuth Shovel").setMaxDamage(BismuthUses).setIconCoord(1, 4);
        BismuthAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","BismuthAxe",16118),BismuthToolMaterial).setUnlocalizedName("Bismuth Axe").setMaxDamage(BismuthUses).setIconCoord(1, 5);
        BismuthHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","BismuthHoe",16119),BismuthToolMaterial).setUnlocalizedName("Bismuth Hoe").setMaxDamage(BismuthUses).setIconCoord(1, 6);

        BismuthBronzePick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","BismuthBronzePick",16120),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Pick").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 3);
        BismuthBronzeShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","BismuthBronzeShovel",16121),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Shovel").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 4);
        BismuthBronzeAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","BismuthBronzeAxe",16122),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Axe").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 5);
        BismuthBronzeHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","BismuthBronzeHoe",16123),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Hoe").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 6);

        BlackBronzePick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","BlackBronzePick",16124),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Pick").setMaxDamage(BlackBronzeUses).setIconCoord(3, 3);
        BlackBronzeShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","BlackBronzeShovel",16125),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Shovel").setMaxDamage(BlackBronzeUses).setIconCoord(3, 4);
        BlackBronzeAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","BlackBronzeAxe",16126),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Axe").setMaxDamage(BlackBronzeUses).setIconCoord(3, 5);
        BlackBronzeHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","BlackBronzeHoe",16127),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Hoe").setMaxDamage(BlackBronzeUses).setIconCoord(3, 6);

        BlackSteelPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","BlackSteelPick",16128),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Pick").setMaxDamage(BlackSteelUses).setIconCoord(4, 3);
        BlackSteelShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","BlackSteelShovel",16129),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Shovel").setMaxDamage(BlackSteelUses).setIconCoord(4, 4);
        BlackSteelAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","BlackSteelAxe",16130),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Axe").setMaxDamage(BlackSteelUses).setIconCoord(4, 5);
        BlackSteelHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","BlackSteelHoe",16131),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Hoe").setMaxDamage(BlackSteelUses).setIconCoord(4, 6);

        BlueSteelPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","BlueSteelPick",16132),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Pick").setMaxDamage(BlueSteelUses).setIconCoord(5, 3);
        BlueSteelShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","BlueSteelShovel",16133),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Shovel").setMaxDamage(BlueSteelUses).setIconCoord(5, 4);
        BlueSteelAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","BlueSteelAxe",16134),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Axe").setMaxDamage(BlueSteelUses).setIconCoord(5, 5);
        BlueSteelHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","BlueSteelHoe",16135),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Hoe").setMaxDamage(BlueSteelUses).setIconCoord(5, 6);

        BronzePick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","BronzePick",16136),BronzeToolMaterial).setUnlocalizedName("Bronze Pick").setMaxDamage(BronzeUses).setIconCoord(6,3);
        BronzeShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","BronzeShovel",16137),BronzeToolMaterial).setUnlocalizedName("Bronze Shovel").setMaxDamage(BronzeUses).setIconCoord(6, 4);
        BronzeAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","BronzeAxe",16138),BronzeToolMaterial).setUnlocalizedName("Bronze Axe").setMaxDamage(BronzeUses).setIconCoord(6, 5);
        BronzeHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","BronzeHoe",16139),BronzeToolMaterial).setUnlocalizedName("Bronze Hoe").setMaxDamage(BronzeUses).setIconCoord(6, 6);

        CopperPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","CopperPick",16140),CopperToolMaterial).setUnlocalizedName("Copper Pick").setMaxDamage(CopperUses).setIconCoord(7, 3);
        CopperShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","CopperShovel",16141),CopperToolMaterial).setUnlocalizedName("Copper Shovel").setMaxDamage(CopperUses).setIconCoord(7, 4);
        CopperAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","CopperAxe",16142),CopperToolMaterial).setUnlocalizedName("Copper Axe").setMaxDamage(CopperUses).setIconCoord(7, 5);
        CopperHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","CopperHoe",16143),CopperToolMaterial).setUnlocalizedName("Copper Hoe").setMaxDamage(CopperUses).setIconCoord(7, 6);

        WroughtIronPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","WroughtIronPick",16148),IronToolMaterial).setUnlocalizedName("Wrought Iron Pick").setMaxDamage(WroughtIronUses).setIconCoord(8, 3);
        WroughtIronShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","WroughtIronShovel",16149),IronToolMaterial).setUnlocalizedName("Wrought Iron Shovel").setMaxDamage(WroughtIronUses).setIconCoord(8, 4);
        WroughtIronAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","WroughtIronAxe",16150),IronToolMaterial).setUnlocalizedName("Wrought Iron Axe").setMaxDamage(WroughtIronUses).setIconCoord(8, 5);
        WroughtIronHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","WroughtIronHoe",16151),IronToolMaterial).setUnlocalizedName("Wrought Iron Hoe").setMaxDamage(WroughtIronUses).setIconCoord(8, 6);

        RedSteelPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","RedSteelPick",16168),RedSteelToolMaterial).setUnlocalizedName("Red Steel Pick").setMaxDamage(RedSteelUses).setIconCoord(9, 3);
        RedSteelShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","RedSteelShovel",16169),RedSteelToolMaterial).setUnlocalizedName("Red Steel Shovel").setMaxDamage(RedSteelUses).setIconCoord(9, 4);
        RedSteelAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","RedSteelAxe",16170),RedSteelToolMaterial).setUnlocalizedName("Red Steel Axe").setMaxDamage(RedSteelUses).setIconCoord(9, 5);
        RedSteelHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","RedSteelHoe",16171),RedSteelToolMaterial).setUnlocalizedName("Red Steel Hoe").setMaxDamage(RedSteelUses).setIconCoord(9, 6);

        RoseGoldPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","RoseGoldPick",16172),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Pick").setMaxDamage(RoseGoldUses).setIconCoord(10, 3);
        RoseGoldShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","RoseGoldShovel",16173),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Shovel").setMaxDamage(RoseGoldUses).setIconCoord(10, 4);
        RoseGoldAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","RoseGoldAxe",16174),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Axe").setMaxDamage(RoseGoldUses).setIconCoord(10, 5);
        RoseGoldHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","RoseGoldHoe",16175),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Hoe").setMaxDamage(RoseGoldUses).setIconCoord(10, 6);

        SteelPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","SteelPick",16180),SteelToolMaterial).setUnlocalizedName("Steel Pick").setMaxDamage(SteelUses).setIconCoord(11, 3);
        SteelShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","SteelShovel",16181),SteelToolMaterial).setUnlocalizedName("Steel Shovel").setMaxDamage(SteelUses).setIconCoord(11, 4);
        SteelAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","SteelAxe",16182),SteelToolMaterial).setUnlocalizedName("Steel Axe").setMaxDamage(SteelUses).setIconCoord(11, 5);
        SteelHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","SteelHoe",16183),SteelToolMaterial).setUnlocalizedName("Steel Hoe").setMaxDamage(SteelUses).setIconCoord(11, 6);

        TinPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","TinPick",16188),TinToolMaterial).setUnlocalizedName("Tin Pick").setMaxDamage(TinUses).setIconCoord(12, 3);
        TinShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","TinShovel",16189),TinToolMaterial).setUnlocalizedName("Tin Shovel").setMaxDamage(TinUses).setIconCoord(12, 4);
        TinAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","TinAxe",16190),TinToolMaterial).setUnlocalizedName("Tin Axe").setMaxDamage(TinUses).setIconCoord(12, 5);
        TinHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","TinHoe",16191),TinToolMaterial).setUnlocalizedName("Tin Hoe").setMaxDamage(TinUses).setIconCoord(12, 6);

        ZincPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","ZincPick",16192),ZincToolMaterial).setUnlocalizedName("Zinc Pick").setMaxDamage(ZincUses).setIconCoord(13, 3);
        ZincShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","ZincShovel",16193),ZincToolMaterial).setUnlocalizedName("Zinc Shovel").setMaxDamage(ZincUses).setIconCoord(13, 4);
        ZincAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","ZincAxe",16194),ZincToolMaterial).setUnlocalizedName("Zinc Axe").setMaxDamage(ZincUses).setIconCoord(13, 5);
        ZincHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","ZincHoe",16195),ZincToolMaterial).setUnlocalizedName("Zinc Hoe").setMaxDamage(ZincUses).setIconCoord(13, 6);

        //chisels
        BismuthChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","BismuthChisel",16226),BismuthToolMaterial).setUnlocalizedName("Bismuth Chisel").setMaxDamage(BismuthUses).setIconCoord(1, 7);
        BismuthBronzeChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","BismuthBronzeChisel",16227),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Chisel").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 7);
        BlackBronzeChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","BlackBronzeChisel",16228),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Chisel").setMaxDamage(BlackBronzeUses).setIconCoord(3, 7);
        BlackSteelChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","BlackSteelChisel",16230),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Chisel").setMaxDamage(BlackSteelUses).setIconCoord(4, 7);
        BlueSteelChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","BlueSteelChisel",16231),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Chisel").setMaxDamage(BlueSteelUses).setIconCoord(5, 7);
        BronzeChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","BronzeChisel",16232),BronzeToolMaterial).setUnlocalizedName("Bronze Chisel").setMaxDamage(BronzeUses).setIconCoord(6, 7);
        CopperChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","CopperChisel",16233),CopperToolMaterial).setUnlocalizedName("Copper Chisel").setMaxDamage(CopperUses).setIconCoord(7, 7);
        WroughtIronChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","WroughtIronChisel",16234),IronToolMaterial).setUnlocalizedName("Wrought Iron Chisel").setMaxDamage(WroughtIronUses).setIconCoord(8, 7);
        RedSteelChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","RedSteelChisel",16235),RedSteelToolMaterial).setUnlocalizedName("Red Steel Chisel").setMaxDamage(RedSteelUses).setIconCoord(9, 7);
        RoseGoldChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","RoseGoldChisel",16236),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Chisel").setMaxDamage(RoseGoldUses).setIconCoord(10, 7);
        SteelChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","SteelChisel",16237),SteelToolMaterial).setUnlocalizedName("Steel Chisel").setMaxDamage(SteelUses).setIconCoord(11, 7);
        TinChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","TinChisel",16238),TinToolMaterial).setUnlocalizedName("Tin Chisel").setMaxDamage(TinUses).setIconCoord(12, 7);
        ZincChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","ZincChisel",16239),ZincToolMaterial).setUnlocalizedName("Zinc Chisel").setMaxDamage(ZincUses).setIconCoord(13, 7);
        StoneChisel = new ItemChisel(TFC_Settings.getIntFor(config,"item","StoneChisel",16240),IgInToolMaterial).setUnlocalizedName("Stone Chisel").setMaxDamage(IgInStoneUses).setIconCoord(0, 7);

        BismuthSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BismuthSword",16245),BismuthToolMaterial).setUnlocalizedName("Bismuth Sword").setMaxDamage(BismuthUses).setIconCoord(1, 13);
        BismuthBronzeSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BismuthBronzeSword",16246),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Sword").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 13);
        BlackBronzeSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BlackBronzeSword",16247),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Sword").setMaxDamage(BlackBronzeUses).setIconCoord(3, 13);
        BlackSteelSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BlackSteelSword",16248),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Sword").setMaxDamage(BlackSteelUses).setIconCoord(4, 13);
        BlueSteelSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BlueSteelSword",16249),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Sword").setMaxDamage(BlueSteelUses).setIconCoord(5, 13);
        BronzeSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BronzeSword",16250),BronzeToolMaterial).setUnlocalizedName("Bronze Sword").setMaxDamage(BronzeUses).setIconCoord(6, 13);
        CopperSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","CopperSword",16251),CopperToolMaterial).setUnlocalizedName("Copper Sword").setMaxDamage(CopperUses).setIconCoord(7, 13);
        WroughtIronSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","WroughtIronSword",16252),IronToolMaterial).setUnlocalizedName("Wrought Iron Sword").setMaxDamage(WroughtIronUses).setIconCoord(8, 13);
        RedSteelSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","RedSteelSword",16253),RedSteelToolMaterial).setUnlocalizedName("Red Steel Sword").setMaxDamage(RedSteelUses).setIconCoord(9, 13);
        RoseGoldSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","RoseGoldSword",16254),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Sword").setMaxDamage(RoseGoldUses).setIconCoord(10, 13);
        SteelSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","SteelSword",16255),SteelToolMaterial).setUnlocalizedName("Steel Sword").setMaxDamage(SteelUses).setIconCoord(11, 13);
        TinSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","TinSword",16256),TinToolMaterial).setUnlocalizedName("Tin Sword").setMaxDamage(TinUses).setIconCoord(12, 13);
        ZincSword = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","ZincSword",16257),ZincToolMaterial).setUnlocalizedName("Zinc Sword").setMaxDamage(ZincUses).setIconCoord(13, 13);

        BismuthMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BismuthMace",16262),BismuthToolMaterial).setUnlocalizedName("Bismuth Mace").setMaxDamage(BismuthUses).setIconCoord(1, 12);
        BismuthBronzeMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BismuthBronzeMace",16263),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Mace").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 12);
        BlackBronzeMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BlackBronzeMace",16264),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Mace").setMaxDamage(BlackBronzeUses).setIconCoord(3, 12);
        BlackSteelMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BlackSteelMace",16265),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Mace").setMaxDamage(BlackSteelUses).setIconCoord(4, 12);
        BlueSteelMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BlueSteelMace",16266),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Mace").setMaxDamage(BlueSteelUses).setIconCoord(5, 12);
        BronzeMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","BronzeMace",16267),BronzeToolMaterial).setUnlocalizedName("Bronze Mace").setMaxDamage(BronzeUses).setIconCoord(6, 12);
        CopperMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","CopperMace",16268),CopperToolMaterial).setUnlocalizedName("Copper Mace").setMaxDamage(CopperUses).setIconCoord(7, 12);
        WroughtIronMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","WroughtIronMace",16269),IronToolMaterial).setUnlocalizedName("Wrought Iron Mace").setMaxDamage(WroughtIronUses).setIconCoord(8, 12);
        RedSteelMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","RedSteelMace",16270),RedSteelToolMaterial).setUnlocalizedName("Red Steel Mace").setMaxDamage(RedSteelUses).setIconCoord(9, 12);
        RoseGoldMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","RoseGoldMace",16271),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Mace").setMaxDamage(RoseGoldUses).setIconCoord(10, 12);
        SteelMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","SteelMace",16272),SteelToolMaterial).setUnlocalizedName("Steel Mace").setMaxDamage(SteelUses).setIconCoord(11, 12);
        TinMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","TinMace",16273),TinToolMaterial).setUnlocalizedName("Tin Mace").setMaxDamage(TinUses).setIconCoord(12, 12);
        ZincMace = new ItemCustomSword(TFC_Settings.getIntFor(config,"item","ZincMace",16274),ZincToolMaterial).setUnlocalizedName("Zinc Mace").setMaxDamage(ZincUses).setIconCoord(13, 12);

        BismuthSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","BismuthSaw",16275),BismuthToolMaterial).setUnlocalizedName("Bismuth Saw").setMaxDamage(BismuthUses).setIconCoord(1, 8);
        BismuthBronzeSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","BismuthBronzeSaw",16276),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Saw").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 8);
        BlackBronzeSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","BlackBronzeSaw",16277),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Saw").setMaxDamage(BlackBronzeUses).setIconCoord(3, 8);
        BlackSteelSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","BlackSteelSaw",16278),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Saw").setMaxDamage(BlackSteelUses).setIconCoord(4, 8);
        BlueSteelSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","BlueSteelSaw",16279),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Saw").setMaxDamage(BlueSteelUses).setIconCoord(5, 8);
        BronzeSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","BronzeSaw",16280),BronzeToolMaterial).setUnlocalizedName("Bronze Saw").setMaxDamage(BronzeUses).setIconCoord(6, 8);
        CopperSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","CopperSaw",16281),CopperToolMaterial).setUnlocalizedName("Copper Saw").setMaxDamage(CopperUses).setIconCoord(7, 8);
        WroughtIronSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","WroughtIronSaw",16282),IronToolMaterial).setUnlocalizedName("Wrought Iron Saw").setMaxDamage(WroughtIronUses).setIconCoord(8, 8);
        RedSteelSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","RedSteelSaw",16283),RedSteelToolMaterial).setUnlocalizedName("Red Steel Saw").setMaxDamage(RedSteelUses).setIconCoord(9, 8);
        RoseGoldSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","RoseGoldSaw",16284),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Saw").setMaxDamage(RoseGoldUses).setIconCoord(10, 8);
        SteelSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","SteelSaw",16285),SteelToolMaterial).setUnlocalizedName("Steel Saw").setMaxDamage(SteelUses).setIconCoord(11, 8);
        TinSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","TinSaw",16286),TinToolMaterial).setUnlocalizedName("Tin Saw").setMaxDamage(TinUses).setIconCoord(12, 8);
        ZincSaw = new ItemCustomSaw(TFC_Settings.getIntFor(config,"item","ZincSaw",16287),ZincToolMaterial).setUnlocalizedName("Zinc Saw").setMaxDamage(ZincUses).setIconCoord(13, 8);

        HCBlackSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","HCBlackSteelIngot",16290), EnumMetalType.BLACKSTEEL).setUnlocalizedName("HCBlackSteelIngot").setIconCoord(3, 3);
        WeakBlueSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","WeakBlueSteelIngot",16291),EnumMetalType.BLUESTEEL).setUnlocalizedName("WeakBlueSteelIngot").setIconCoord(4, 3);
        WeakRedSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","WeakRedSteelIngot",16292),EnumMetalType.REDSTEEL).setUnlocalizedName("WeakRedSteelIngot").setIconCoord(3, 4);
        WeakSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","WeakSteelIngot",16293),EnumMetalType.STEEL).setUnlocalizedName("WeakSteelIngot").setIconCoord(6, 4);
        HCBlueSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","HCBlueSteelIngot",16294), EnumMetalType.BLUESTEEL).setUnlocalizedName("HCBlueSteelIngot").setIconCoord(4, 3);
        HCRedSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","HCRedSteelIngot",16295), EnumMetalType.REDSTEEL).setUnlocalizedName("HCRedSteelIngot").setIconCoord(3, 4);
        HCSteelIngot = new ItemIngot(TFC_Settings.getIntFor(config,"item","HCSteelIngot",16296), EnumMetalType.STEEL).setUnlocalizedName("HCSteelIngot").setIconCoord(6, 4);

        OreChunk = new ItemOre(TFC_Settings.getIntFor(config,"item","OreChunk",16297)).setUnlocalizedName("Ore").setIconCoord(0, 3);
        Logs = new ItemLogs(TFC_Settings.getIntFor(config,"item","Logs",16298)).setUnlocalizedName("Log").setIconCoord(0, 2);
        Barrel = new ItemBarrels(TFC_Settings.getIntFor(config, "item", "barrels", 16299)).setUnlocalizedName("Barrel").setIconCoord(0,15);
        
        WoodSupportItemV = new ItemWoodSupport(TFC_Settings.getIntFor(config,"item","WoodSupportItemV", 16300), true).setUnlocalizedName("WoodSupportItemV").setIconCoord(0, 0);
        WoodSupportItemH = new ItemWoodSupport(TFC_Settings.getIntFor(config,"item","WoodSupportItemH", 16301), false).setUnlocalizedName("WoodSupportItemH").setIconCoord(0, 1);
        boneIgInPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","boneIgInPick",16302),IgInToolMaterial).setUnlocalizedName("Bone IgIn Stone Pick").setMaxDamage(IgInStoneUses).setIconCoord(14, 3);
        boneIgInShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","boneIgInShovel",16303),IgInToolMaterial).setUnlocalizedName("Bone IgIn Stone Shovel").setMaxDamage(IgInStoneUses).setIconCoord(14, 4);
        boneIgInAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","boneIgInAxe",16304),IgInToolMaterial).setUnlocalizedName("Bone IgIn Stone Axe").setMaxDamage(IgInStoneUses).setIconCoord(14, 5);
        boneIgInHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","boneIgInHoe",16305),IgInToolMaterial).setUnlocalizedName("Bone IgIn Stone Hoe").setMaxDamage(IgInStoneUses).setIconCoord(14, 6);
        boneSedPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","boneSedPick",16306),SedToolMaterial).setUnlocalizedName("Bone Sed Stone Pick").setMaxDamage(SedStoneUses).setIconCoord(14, 3);
        boneSedShovel= new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","boneSedShovel",16307),SedToolMaterial).setUnlocalizedName("Bone Sed Stone Shovel").setMaxDamage(SedStoneUses).setIconCoord(14, 4);
        boneSedAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","boneSedAxe",16308),SedToolMaterial).setUnlocalizedName("Bone Sed Stone Axe").setMaxDamage(SedStoneUses).setIconCoord(14, 5);
        boneSedHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","boneSedHoe",16309),SedToolMaterial).setUnlocalizedName("Bone Sed Stone Hoe").setMaxDamage(SedStoneUses).setIconCoord(14, 6);
        boneIgExPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","boneIgExPick",16310),IgExToolMaterial).setUnlocalizedName("Bone IgEx Stone Pick").setMaxDamage(IgExStoneUses).setIconCoord(14, 3);
        boneIgExShovel= new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","boneIgExShovel",16311),IgExToolMaterial).setUnlocalizedName("Bone IgEx Stone Shovel").setMaxDamage(IgExStoneUses).setIconCoord(14, 4);
        boneIgExAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","boneIgExAxe",16312),IgExToolMaterial).setUnlocalizedName("Bone IgEx Stone Axe").setMaxDamage(IgExStoneUses).setIconCoord(14, 5);
        boneIgExHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","boneIgExHoe",16313),IgExToolMaterial).setUnlocalizedName("Bone IgEx Stone Hoe").setMaxDamage(IgExStoneUses).setIconCoord(14, 6);
        boneMMPick = new ItemCustomPickaxe(TFC_Settings.getIntFor(config,"item","boneMMPick",16314),MMToolMaterial).setUnlocalizedName("Bone MM Stone Pick").setMaxDamage(MMStoneUses).setIconCoord(14, 3);
        boneMMShovel = new ItemCustomShovel(TFC_Settings.getIntFor(config,"item","boneMMShovel",16315),MMToolMaterial).setUnlocalizedName("Bone MM Stone Shovel").setMaxDamage(MMStoneUses).setIconCoord(14, 4);
        boneMMAxe = new ItemCustomAxe(TFC_Settings.getIntFor(config,"item","boneMMAxe",16316),MMToolMaterial).setUnlocalizedName("Bone MM Stone Axe").setMaxDamage(MMStoneUses).setIconCoord(14, 5);
        boneMMHoe = new ItemCustomHoe(TFC_Settings.getIntFor(config,"item","boneMMHoe",16317),MMToolMaterial).setUnlocalizedName("Bone MM Stone Hoe").setMaxDamage(MMStoneUses).setIconCoord(14, 6);
        Javelin = new ItemJavelin(TFC_Settings.getIntFor(config,"item","javelin",16318)).setUnlocalizedName("javelin").setIconCoord(15, 1);

        terraSlag = new ItemTerra(TFC_Settings.getIntFor(config,"item","terraSlag",16349),"/bioxx/terrasprites.png").setUnlocalizedName("terraSlag").setIconCoord(2, 0);

        BismuthUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBismuth",16350)).setUnlocalizedName("UnshapedBismuth").setIconCoord(0, 7);
        BismuthBronzeUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBismuthBronze",16351)).setUnlocalizedName("UnshapedBismuthBronze").setIconCoord(1, 7);
        BlackBronzeUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBlackBronze",16352)).setUnlocalizedName("UnshapedBlackBronze").setIconCoord(2, 7);
        BlackSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBlackSteel",16353)).setUnlocalizedName("UnshapedBlackSteel").setIconCoord(3, 7);
        BlueSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBlueSteel",16354)).setUnlocalizedName("UnshapedBlueSteel").setIconCoord(4, 7);
        BrassUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBrass",16355)).setUnlocalizedName("UnshapedBrass").setIconCoord(5, 7);
        BronzeUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedBronze",16356)).setUnlocalizedName("UnshapedBronze").setIconCoord(6, 7);
        CopperUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedCopper",16357)).setUnlocalizedName("UnshapedCopper").setIconCoord(7, 7);
        GoldUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedGold",16358)).setUnlocalizedName("UnshapedGold").setIconCoord(8, 7);
        WroughtIronUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedIron",16359)).setUnlocalizedName("UnshapedWroughtIron").setIconCoord(9, 7);
        LeadUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedLead",16360)).setUnlocalizedName("UnshapedLead").setIconCoord(10, 7);
        NickelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedNickel",16361)).setUnlocalizedName("UnshapedNickel").setIconCoord(0, 8);
        PigIronUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedPigIron",16362)).setUnlocalizedName("UnshapedPigIron").setIconCoord(1, 8);
        PlatinumUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedPlatinum",16363)).setUnlocalizedName("UnshapedPlatinum").setIconCoord(2, 8);
        RedSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedRedSteel",16364)).setUnlocalizedName("UnshapedRedSteel").setIconCoord(3, 8);
        RoseGoldUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedRoseGold",16365)).setUnlocalizedName("UnshapedRoseGold").setIconCoord(4, 8);
        SilverUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedSilver",16366)).setUnlocalizedName("UnshapedSilver").setIconCoord(5, 8);
        SteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedSteel",16367)).setUnlocalizedName("UnshapedSteel").setIconCoord(6, 8);
        SterlingSilverUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedSterlingSilver",16368)).setUnlocalizedName("UnshapedSterlingSilver").setIconCoord(7, 8);
        TinUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedTin",16369)).setUnlocalizedName("UnshapedTin").setIconCoord(8, 8);
        ZincUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedZinc",16370)).setUnlocalizedName("UnshapedZinc").setIconCoord(9, 8);

        //Hammers
        StoneHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraStoneHammer",16371),TFCItems.IgInToolMaterial).setUnlocalizedName("Stone Hammer").setIconCoord(0, 11).setMaxDamage(TFCItems.IgInStoneUses);
        BismuthHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraBismuthHammer",16372),TFCItems.BismuthToolMaterial).setUnlocalizedName("Bismuth Hammer").setIconCoord(1, 11).setMaxDamage(TFCItems.BismuthUses);
        BismuthBronzeHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraBismuthBronzeHammer",16373),TFCItems.BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Hammer").setIconCoord(2, 11).setMaxDamage(TFCItems.BismuthBronzeUses);
        BlackBronzeHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraBlackBronzeHammer",16374),TFCItems.BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Hammer").setIconCoord(3, 11).setMaxDamage(TFCItems.BlackBronzeUses);
        BlackSteelHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraBlackSteelHammer",16375),TFCItems.BlackSteelToolMaterial).setUnlocalizedName("Black Steel Hammer").setIconCoord(4, 11).setMaxDamage(TFCItems.BlackSteelUses);
        BlueSteelHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraBlueSteelHammer",16376),TFCItems.BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Hammer").setIconCoord(5, 11).setMaxDamage(TFCItems.BlueSteelUses);
        BronzeHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraBronzeHammer",16377),TFCItems.BronzeToolMaterial).setUnlocalizedName("Bronze Hammer").setIconCoord(6, 11).setMaxDamage(TFCItems.BronzeUses);
        CopperHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraCopperHammer",16378),TFCItems.CopperToolMaterial).setUnlocalizedName("Copper Hammer").setIconCoord(7, 11).setMaxDamage(TFCItems.CopperUses);
        WroughtIronHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraWroughtIronHammer",16379),TFCItems.IronToolMaterial).setUnlocalizedName("Wrought Iron Hammer").setIconCoord(8, 11).setMaxDamage(TFCItems.WroughtIronUses);
        RedSteelHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraRedSteelHammer",16380),TFCItems.RedSteelToolMaterial).setUnlocalizedName("Red Steel Hammer").setIconCoord(9, 11).setMaxDamage(TFCItems.RedSteelUses);
        RoseGoldHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraRoseGoldHammer",16381),TFCItems.RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Hammer").setIconCoord(10, 11).setMaxDamage(TFCItems.RoseGoldUses);
        SteelHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraSteelHammer",16382),TFCItems.SteelToolMaterial).setUnlocalizedName("Steel Hammer").setIconCoord(11, 11).setMaxDamage(TFCItems.SteelUses);
        TinHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraTinHammer",16383),TFCItems.TinToolMaterial).setUnlocalizedName("Tin Hammer").setIconCoord(12, 11).setMaxDamage(TFCItems.TinUses);
        ZincHammer = new ItemHammer(TFC_Settings.getIntFor(config,"item","terraZincHammer",16384),TFCItems.ZincToolMaterial).setUnlocalizedName("Zinc Hammer").setIconCoord(13, 11).setMaxDamage(TFCItems.ZincUses);

        Ink = new ItemTerra(TFC_Settings.getIntFor(config,"item","Ink",16391),"/bioxx/terrasprites.png").setUnlocalizedName("Ink").setIconCoord(3, 0);

        StoneAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraStoneAnvilItem",16398), 0, AnvilReq.STONE).setUnlocalizedName("StoneAnvilItem").setIconCoord(0, 2);
        BlackSteelAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraBlackSteelAnvilItem",16399), 5, AnvilReq.BLACKSTEEL).setUnlocalizedName("BlackSteelAnvilItem").setIconCoord(4, 2);
        BlueSteelAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraBlueSteelAnvilItem",16400), 7, AnvilReq.BLUESTEEL).setUnlocalizedName("BlueSteelAnvilItem").setIconCoord(5, 2);
        BronzeAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraBronzeAnvilItem",16401), 2, AnvilReq.BRONZE).setUnlocalizedName("BronzeAnvilItem").setIconCoord(6, 2);
        CopperAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraCopperAnvilItem",16402), 1, AnvilReq.COPPER).setUnlocalizedName("CopperAnvilItem").setIconCoord(7, 2);
        WroughtIronAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraWroughtIronAnvilItem",16403), 3, AnvilReq.WROUGHTIRON).setUnlocalizedName("WroughtIronAnvilItem").setIconCoord(8, 2);
        RedSteelAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraRedSteelAnvilItem",16404), 6, AnvilReq.REDSTEEL).setUnlocalizedName("RedSteelAnvilItem").setIconCoord(9, 2);
        SteelAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","terraSteelAnvilItem",16405), 4, AnvilReq.STEEL).setUnlocalizedName("SteelAnvilItem").setIconCoord(11, 2);

        BellowsItem = new ItemBellows(TFC_Settings.getIntFor(config,"item","terraBellowsItem",16406)).setUnlocalizedName("BellowsItem").setIconCoord(8, 0);

        FireStarter = new ItemFirestarter(TFC_Settings.getIntFor(config,"item","terraFireStarter",16407)).setUnlocalizedName("FireStarter").setIconCoord(7, 0);
        ClayMold = new ItemTerra(TFC_Settings.getIntFor(config,"item","terraClayMold",16408),"/bioxx/terrasprites.png").setUnlocalizedName("ClayMold").setIconCoord(5, 0);
        CeramicMold = new ItemTerra(TFC_Settings.getIntFor(config,"item","terraFiredClayMold",16409),"/bioxx/terrasprites.png").setUnlocalizedName("FiredClayMold").setIconCoord(6, 0);
        //Tool heads
        BismuthPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthPickaxeHead",16500)).setUnlocalizedName("Bismuth Pickaxe Head").setIconCoord(1, 3);
        BismuthBronzePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzePickaxeHead",16501)).setUnlocalizedName("Bismuth Bronze Pickaxe Head").setIconCoord(2, 3);
        BlackBronzePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzePickaxeHead",16502)).setUnlocalizedName("Black Bronze Pickaxe Head").setIconCoord(3, 3);
        BlackSteelPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelPickaxeHead",16503)).setUnlocalizedName("Black Steel Pickaxe Head").setIconCoord(4, 3);
        BlueSteelPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelPickaxeHead",16504)).setUnlocalizedName("Blue Steel Pickaxe Head").setIconCoord(5, 3);
        BronzePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzePickaxeHead",16505)).setUnlocalizedName("Bronze Pickaxe Head").setIconCoord(6, 3);
        CopperPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperPickaxeHead",16506)).setUnlocalizedName("Copper Pickaxe Head").setIconCoord(7, 3);
        WroughtIronPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronPickaxeHead",16507)).setUnlocalizedName("Wrought Iron Pickaxe Head").setIconCoord(8, 3);
        RedSteelPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelPickaxeHead",16508)).setUnlocalizedName("Red Steel Pickaxe Head").setIconCoord(9, 3);
        RoseGoldPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldPickaxeHead",16509)).setUnlocalizedName("Rose Gold Pickaxe Head").setIconCoord(10, 3);
        SteelPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelPickaxeHead",16510)).setUnlocalizedName("Steel Pickaxe Head").setIconCoord(11, 3);
        TinPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinPickaxeHead",16511)).setUnlocalizedName("Tin Pickaxe Head").setIconCoord(12, 3);
        ZincPickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincPickaxeHead",16512)).setUnlocalizedName("Zinc Pickaxe Head").setIconCoord(13, 3);

        BismuthShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthShovelHead",16513)).setUnlocalizedName("Bismuth Shovel Head").setIconCoord(1, 4);
        BismuthBronzeShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeShovelHead",16514)).setUnlocalizedName("Bismuth Bronze Shovel Head").setIconCoord(2, 4);
        BlackBronzeShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeShovelHead",16515)).setUnlocalizedName("Black Bronze Shovel Head").setIconCoord(3, 4);
        BlackSteelShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelShovelHead",16516)).setUnlocalizedName("Black Steel Shovel Head").setIconCoord(4, 4);
        BlueSteelShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelShovelHead",16517)).setUnlocalizedName("Blue Steel Shovel Head").setIconCoord(5, 4);
        BronzeShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeShovelHead",16518)).setUnlocalizedName("Bronze Shovel Head").setIconCoord(6, 4);
        CopperShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperShovelHead",16519)).setUnlocalizedName("Copper Shovel Head").setIconCoord(7, 4);
        WroughtIronShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronShovelHead",16520)).setUnlocalizedName("Wrought Iron Shovel Head").setIconCoord(8, 4);
        RedSteelShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelShovelHead",16521)).setUnlocalizedName("Red Steel Shovel Head").setIconCoord(9, 4);
        RoseGoldShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldShovelHead",16522)).setUnlocalizedName("Rose Gold Shovel Head").setIconCoord(10, 4);
        SteelShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelShovelHead",16523)).setUnlocalizedName("Steel Shovel Head").setIconCoord(11, 4);
        TinShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinShovelHead",16524)).setUnlocalizedName("Tin Shovel Head").setIconCoord(12, 4);
        ZincShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincShovelHead",16525)).setUnlocalizedName("Zinc Shovel Head").setIconCoord(13, 4);

        BismuthHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthHoeHead",16526)).setUnlocalizedName("Bismuth Hoe Head").setIconCoord(1, 6);
        BismuthBronzeHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeHoeHead",16527)).setUnlocalizedName("Bismuth Bronze Hoe Head").setIconCoord(2, 6);
        BlackBronzeHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeHoeHead",16528)).setUnlocalizedName("Black Bronze Hoe Head").setIconCoord(3, 6);
        BlackSteelHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelHoeHead",16529)).setUnlocalizedName("Black Steel Hoe Head").setIconCoord(4, 6);
        BlueSteelHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelHoeHead",16530)).setUnlocalizedName("Blue Steel Hoe Head").setIconCoord(5, 6);
        BronzeHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeHoeHead",16531)).setUnlocalizedName("Bronze Hoe Head").setIconCoord(6, 6);
        CopperHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperHoeHead",16532)).setUnlocalizedName("Copper Hoe Head").setIconCoord(7, 6);
        WroughtIronHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronHoeHead",16533)).setUnlocalizedName("Wrought Iron Hoe Head").setIconCoord(8, 6);
        RedSteelHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelHoeHead",16534)).setUnlocalizedName("Red Steel Hoe Head").setIconCoord(9, 6);
        RoseGoldHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldHoeHead",16535)).setUnlocalizedName("Rose Gold Hoe Head").setIconCoord(10, 6);
        SteelHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelHoeHead",16536)).setUnlocalizedName("Steel Hoe Head").setIconCoord(11, 6);
        TinHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinHoeHead",16537)).setUnlocalizedName("Tin Hoe Head").setIconCoord(12, 6);
        ZincHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincHoeHead",16538)).setUnlocalizedName("Zinc Hoe Head").setIconCoord(13, 6);

        BismuthAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthAxeHead",16539)).setUnlocalizedName("Bismuth Axe Head").setIconCoord(1, 5);
        BismuthBronzeAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeAxeHead",16540)).setUnlocalizedName("Bismuth Bronze Axe Head").setIconCoord(2, 5);
        BlackBronzeAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeAxeHead",16541)).setUnlocalizedName("Black Bronze Axe Head").setIconCoord(3, 5);
        BlackSteelAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelAxeHead",16542)).setUnlocalizedName("Black Steel Axe Head").setIconCoord(4, 5);
        BlueSteelAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelAxeHead",16543)).setUnlocalizedName("Blue Steel Axe Head").setIconCoord(5, 5);
        BronzeAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeAxeHead",16544)).setUnlocalizedName("Bronze Axe Head").setIconCoord(6, 5);
        CopperAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperAxeHead",16545)).setUnlocalizedName("Copper Axe Head").setIconCoord(7, 5);
        WroughtIronAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronAxeHead",16546)).setUnlocalizedName("Wrought Iron Axe Head").setIconCoord(8, 5);
        RedSteelAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelAxeHead",16547)).setUnlocalizedName("Red Steel Axe Head").setIconCoord(9, 5);
        RoseGoldAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldAxeHead",16548)).setUnlocalizedName("Rose Gold Axe Head").setIconCoord(10, 5);
        SteelAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelAxeHead",16549)).setUnlocalizedName("Steel Axe Head").setIconCoord(11, 5);
        TinAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinAxeHead",16550)).setUnlocalizedName("Tin Axe Head").setIconCoord(12, 5);
        ZincAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincAxeHead",16551)).setUnlocalizedName("Zinc Axe Head").setIconCoord(13, 5);

        BismuthHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthHammerHead",16552)).setUnlocalizedName("Bismuth Hammer Head").setIconCoord(1, 11);
        BismuthBronzeHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeHammerHead",16553)).setUnlocalizedName("Bismuth Bronze Hammer Head").setIconCoord(2, 11);
        BlackBronzeHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeHammerHead",16554)).setUnlocalizedName("Black Bronze Hammer Head").setIconCoord(3, 11);
        BlackSteelHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelHammerHead",16555)).setUnlocalizedName("Black Steel Hammer Head").setIconCoord(4, 11);
        BlueSteelHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelHammerHead",16556)).setUnlocalizedName("Blue Steel Hammer Head").setIconCoord(5, 11);
        BronzeHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeHammerHead",16557)).setUnlocalizedName("Bronze Hammer Head").setIconCoord(6, 11);
        CopperHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperHammerHead",16558)).setUnlocalizedName("Copper Hammer Head").setIconCoord(7, 11);
        WroughtIronHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronHammerHead",16559)).setUnlocalizedName("Wrought Iron Hammer Head").setIconCoord(8, 11);
        RedSteelHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelHammerHead",16560)).setUnlocalizedName("Red Steel Hammer Head").setIconCoord(9, 11);
        RoseGoldHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldHammerHead",16561)).setUnlocalizedName("Rose Gold Hammer Head").setIconCoord(10, 11);
        SteelHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelHammerHead",16562)).setUnlocalizedName("Steel Hammer Head").setIconCoord(11, 11);
        TinHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinHammerHead",16563)).setUnlocalizedName("Tin Hammer Head").setIconCoord(12, 11);
        ZincHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincHammerHead",16564)).setUnlocalizedName("Zinc Hammer Head").setIconCoord(13, 11);

        //chisel heads
        BismuthChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthChiselHead",16565)).setUnlocalizedName("Bismuth Chisel Head").setIconCoord(1, 7);
        BismuthBronzeChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeChiselHead",16566)).setUnlocalizedName("Bismuth Bronze Chisel Head").setIconCoord(2, 7);
        BlackBronzeChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeChiselHead",16567)).setUnlocalizedName("Black Bronze Chisel Head").setIconCoord(3, 7);
        BlackSteelChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelChiselHead",16568)).setUnlocalizedName("Black Steel Chisel Head").setIconCoord(4, 7);
        BlueSteelChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelChiselHead",16569)).setUnlocalizedName("Blue Steel Chisel Head").setIconCoord(5, 7);
        BronzeChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeChiselHead",16570)).setUnlocalizedName("Bronze Chisel Head").setIconCoord(6, 7);
        CopperChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperChiselHead",16571)).setUnlocalizedName("Copper Chisel Head").setIconCoord(7, 7);
        WroughtIronChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronChiselHead",16572)).setUnlocalizedName("Wrought Iron Chisel Head").setIconCoord(8, 7);
        RedSteelChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelChiselHead",16573)).setUnlocalizedName("Red Steel Chisel Head").setIconCoord(9, 7);
        RoseGoldChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldChiselHead",16574)).setUnlocalizedName("Rose Gold Chisel Head").setIconCoord(10, 7);
        SteelChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelChiselHead",16575)).setUnlocalizedName("Steel Chisel Head").setIconCoord(11, 7);
        TinChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinChiselHead",16576)).setUnlocalizedName("Tin Chisel Head").setIconCoord(12, 7);
        ZincChiselHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincChiselHead",16577)).setUnlocalizedName("Zinc Chisel Head").setIconCoord(13, 7);

        BismuthSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthSwordHead",16578)).setUnlocalizedName("Bismuth Sword Blade").setIconCoord(1, 13);
        BismuthBronzeSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeSwordHead",16579)).setUnlocalizedName("Bismuth Bronze Sword Blade").setIconCoord(2, 13);
        BlackBronzeSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeSwordHead",16580)).setUnlocalizedName("Black Bronze Sword Blade").setIconCoord(3, 13);
        BlackSteelSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelSwordHead",16581)).setUnlocalizedName("Black Steel Sword Blade").setIconCoord(4, 13);
        BlueSteelSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelSwordHead",16582)).setUnlocalizedName("Blue Steel Sword Blade").setIconCoord(5, 13);
        BronzeSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeSwordHead",16583)).setUnlocalizedName("Bronze Sword Blade").setIconCoord(6, 13);
        CopperSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperSwordHead",16584)).setUnlocalizedName("Copper Sword Blade").setIconCoord(7, 13);
        WroughtIronSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronSwordHead",16585)).setUnlocalizedName("Wrought Iron Sword Blade").setIconCoord(8, 13);
        RedSteelSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelSwordHead",16586)).setUnlocalizedName("Red Steel Sword Blade").setIconCoord(9, 13);
        RoseGoldSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldSwordHead",16587)).setUnlocalizedName("Rose Gold Sword Blade").setIconCoord(10, 13);
        SteelSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelSwordHead",16588)).setUnlocalizedName("Steel Sword Blade").setIconCoord(11, 13);
        TinSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinSwordHead",16589)).setUnlocalizedName("Tin Sword Blade").setIconCoord(12, 13);
        ZincSwordHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincSwordHead",16590)).setUnlocalizedName("Zinc Sword Blade").setIconCoord(13, 13);

        BismuthMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthMaceHead",16591)).setUnlocalizedName("Bismuth Mace Head").setIconCoord(1, 12);
        BismuthBronzeMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeMaceHead",16592)).setUnlocalizedName("Bismuth Bronze Mace Head").setIconCoord(2, 12);
        BlackBronzeMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeMaceHead",16593)).setUnlocalizedName("Black Bronze Mace Head").setIconCoord(3, 12);
        BlackSteelMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelMaceHead",16594)).setUnlocalizedName("Black Steel Mace Head").setIconCoord(4, 12);
        BlueSteelMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelMaceHead",16595)).setUnlocalizedName("Blue Steel Mace Head").setIconCoord(5, 12);
        BronzeMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeMaceHead",16596)).setUnlocalizedName("Bronze Mace Head").setIconCoord(6, 12);
        CopperMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperMaceHead",16597)).setUnlocalizedName("Copper Mace Head").setIconCoord(7, 12);
        WroughtIronMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronMaceHead",16598)).setUnlocalizedName("Wrought Iron Mace Head").setIconCoord(8, 12);
        RedSteelMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelMaceHead",16599)).setUnlocalizedName("Red Steel Mace Head").setIconCoord(9, 12);
        RoseGoldMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldMaceHead",16600)).setUnlocalizedName("Rose Gold Mace Head").setIconCoord(10, 12);
        SteelMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelMaceHead",16601)).setUnlocalizedName("Steel Mace Head").setIconCoord(11, 12);
        TinMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinMaceHead",16602)).setUnlocalizedName("Tin Mace Head").setIconCoord(12, 12);
        ZincMaceHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincMaceHead",16603)).setUnlocalizedName("Zinc Mace Head").setIconCoord(13, 12);

        BismuthSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthSawHead",16604)).setUnlocalizedName("Bismuth Saw Blade").setIconCoord(1, 8);
        BismuthBronzeSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeSawHead",16605)).setUnlocalizedName("Bismuth Bronze Saw Blade").setIconCoord(2, 8);
        BlackBronzeSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeSawHead",16606)).setUnlocalizedName("Black Bronze Saw Blade").setIconCoord(3, 8);
        BlackSteelSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelSawHead",16607)).setUnlocalizedName("Black Steel Saw Blade").setIconCoord(4, 8);
        BlueSteelSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelSawHead",16608)).setUnlocalizedName("Blue Steel Saw Blade").setIconCoord(5, 8);
        BronzeSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeSawHead",16609)).setUnlocalizedName("Bronze Saw Blade").setIconCoord(6, 8);
        CopperSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperSawHead",16610)).setUnlocalizedName("Copper Saw Blade").setIconCoord(7, 8);
        WroughtIronSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronSawHead",16611)).setUnlocalizedName("Wrought Iron Saw Blade").setIconCoord(8, 8);
        RedSteelSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelSawHead",16612)).setUnlocalizedName("Red Steel Saw Blade").setIconCoord(9, 8);
        RoseGoldSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldSawHead",16613)).setUnlocalizedName("Rose Gold Saw Blade").setIconCoord(10, 8);
        SteelSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelSawHead",16614)).setUnlocalizedName("Steel Saw Blade").setIconCoord(11, 8);
        TinSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinSawHead",16615)).setUnlocalizedName("Tin Saw Blade").setIconCoord(12, 8);
        ZincSawHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincSawHead",16616)).setUnlocalizedName("Zinc Saw Blade").setIconCoord(13, 8);
        
        HCBlackSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedHCBlackSteel",16617)).setUnlocalizedName("UnshapedHCBlackSteel").setIconCoord(3, 7);
        WeakBlueSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedWeakBlueSteel",16618)).setUnlocalizedName("UnshapedWeakBlueSteel").setIconCoord(4, 7);
        HCBlueSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedHCBlueSteel",16619)).setUnlocalizedName("UnshapedHCBlueSteel").setIconCoord(4, 7);
        WeakRedSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedWeakRedSteel",16621)).setUnlocalizedName("UnshapedWeakRedSteel").setIconCoord(3, 8);
        HCRedSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedHCRedSteel",16622)).setUnlocalizedName("UnshapedHCRedSteel").setIconCoord(3, 8);
        WeakSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedWeakSteel",16623)).setUnlocalizedName("UnshapedWeakSteel").setIconCoord(6, 8);
        HCSteelUnshaped = new ItemMeltedMetal(TFC_Settings.getIntFor(config,"item","UnshapedHCSteel",16624)).setUnlocalizedName("UnshapedHCSteel").setIconCoord(6, 8);
        Coke = ((ItemTerra) new ItemTerra(TFC_Settings.getIntFor(config,"item","Coke",16625)).setUnlocalizedName("coke").setIconCoord(2, 0)).setTexturePath("/bioxx/terrasprites.png");

        BismuthProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthProPickHead",16626)).setUnlocalizedName("Bismuth ProPick Head").setIconCoord(1, 1);
        BismuthBronzeProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeProPickHead",16627)).setUnlocalizedName("Bismuth Bronze ProPick Head").setIconCoord(2, 1);
        BlackBronzeProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeProPickHead",16628)).setUnlocalizedName("Black Bronze ProPick Head").setIconCoord(3, 1);
        BlackSteelProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelProPickHead",16629)).setUnlocalizedName("Black Steel ProPick Head").setIconCoord(4, 1);
        BlueSteelProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelProPickHead",16630)).setUnlocalizedName("Blue Steel ProPick Head").setIconCoord(5, 1);
        BronzeProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeProPickHead",16631)).setUnlocalizedName("Bronze ProPick Head").setIconCoord(6, 1);
        CopperProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperProPickHead",16632)).setUnlocalizedName("Copper ProPick Head").setIconCoord(7, 1);
        WroughtIronProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronProPickHead",16633)).setUnlocalizedName("Wrought Iron ProPick Head").setIconCoord(8, 1);
        RedSteelProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelProPickHead",16634)).setUnlocalizedName("Red Steel ProPick Head").setIconCoord(9, 1);
        RoseGoldProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldProPickHead",16635)).setUnlocalizedName("Rose Gold ProPick Head").setIconCoord(10, 1);
        SteelProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelProPickHead",16636)).setUnlocalizedName("Steel ProPick Head").setIconCoord(11, 1);
        TinProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinProPickHead",16637)).setUnlocalizedName("Tin ProPick Head").setIconCoord(12, 1);
        ZincProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincProPickHead",16638)).setUnlocalizedName("Zinc ProPick Head").setIconCoord(13, 1);
        
        Flux = ((ItemTerra) new ItemTerra(TFC_Settings.getIntFor(config,"item","Flux",16639)).setUnlocalizedName("flux").setIconCoord(0, 0)).setTexturePath("/bioxx/terrasprites.png");
        BismuthBronzeAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","BismuthBronzeAnvilItem",16640), 0, AnvilReq.BISMUTHBRONZE).setUnlocalizedName("BismuthBronzeAnvilItem").setIconCoord(2, 2);
        BlackBronzeAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","BlackBronzeAnvilItem",16641), 1, AnvilReq.BLACKBRONZE).setUnlocalizedName("BlackBronzeAnvilItem").setIconCoord(3, 2);
        RoseGoldAnvilItem = new ItemAnvil(TFC_Settings.getIntFor(config,"item","RoseGoldAnvilItem",16642), 2, AnvilReq.ROSEGOLD).setUnlocalizedName("RoseGoldAnvilItem").setIconCoord(10, 2);

        /**
         * Scythe
         * */
        int num = 16643;
        BismuthScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","BismuthScythe",num),BismuthToolMaterial).setUnlocalizedName("Bismuth Scythe").setMaxDamage(BismuthUses).setIconCoord(1, 9);num++;
        BismuthBronzeScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","BismuthBronzeScythe",num),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Scythe").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 9);num++;
        BlackBronzeScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","BlackBronzeScythe",num),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Scythe").setMaxDamage(BlackBronzeUses).setIconCoord(3, 9);num++;
        BlackSteelScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","BlackSteelScythe",num),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Scythe").setMaxDamage(BlackSteelUses).setIconCoord(4, 9);num++;
        BlueSteelScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","BlueSteelScythe",num),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Scythe").setMaxDamage(BlueSteelUses).setIconCoord(5, 9);num++;
        BronzeScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","BronzeScythe",num),BronzeToolMaterial).setUnlocalizedName("Bronze Scythe").setMaxDamage(BronzeUses).setIconCoord(6, 9);num++;
        CopperScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","CopperScythe",num),CopperToolMaterial).setUnlocalizedName("Copper Scythe").setMaxDamage(CopperUses).setIconCoord(7, 9);num++;
        WroughtIronScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","WroughtIronScythe",num),IronToolMaterial).setUnlocalizedName("Wrought Iron Scythe").setMaxDamage(WroughtIronUses).setIconCoord(8, 9);num++;
        RedSteelScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","RedSteelScythe",num),RedSteelToolMaterial).setUnlocalizedName("Red Steel Scythe").setMaxDamage(RedSteelUses).setIconCoord(9, 9);num++;
        RoseGoldScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","RoseGoldScythe",num),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Scythe").setMaxDamage(RoseGoldUses).setIconCoord(10, 9);num++;
        SteelScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","SteelScythe",num),SteelToolMaterial).setUnlocalizedName("Steel Scythe").setMaxDamage(SteelUses).setIconCoord(11, 9);num++;
        TinScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","TinScythe",num),TinToolMaterial).setUnlocalizedName("Tin Scythe").setMaxDamage(TinUses).setIconCoord(12, 9);num++;
        ZincScythe = new ItemCustomScythe(TFC_Settings.getIntFor(config,"item","ZincScythe",num),ZincToolMaterial).setUnlocalizedName("Zinc Scythe").setMaxDamage(ZincUses).setIconCoord(13, 9);num++;
        
        BismuthScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthScytheHead",num)).setUnlocalizedName("Bismuth Scythe Blade").setIconCoord(1, 9);num++;
        BismuthBronzeScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeScytheHead",num)).setUnlocalizedName("Bismuth Bronze Scythe Blade").setIconCoord(2, 9);num++;
        BlackBronzeScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeScytheHead",num)).setUnlocalizedName("Black Bronze Scythe Blade").setIconCoord(3, 9);num++;
        BlackSteelScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelScytheHead",num)).setUnlocalizedName("Black Steel Scythe Blade").setIconCoord(4, 9);num++;
        BlueSteelScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelScytheHead",num)).setUnlocalizedName("Blue Steel Scythe Blade").setIconCoord(5, 9);num++;
        BronzeScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeScytheHead",num)).setUnlocalizedName("Bronze Scythe Blade").setIconCoord(6, 9);num++;
        CopperScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperScytheHead",num)).setUnlocalizedName("Copper Scythe Blade").setIconCoord(7, 9);num++;
        WroughtIronScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronScytheHead",num)).setUnlocalizedName("Wrought Iron Scythe Blade").setIconCoord(8, 9);num++;
        RedSteelScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelScytheHead",num)).setUnlocalizedName("Red Steel Scythe Blade").setIconCoord(9, 9);num++;
        RoseGoldScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldScytheHead",num)).setUnlocalizedName("Rose Gold Scythe Blade").setIconCoord(10, 9);num++;
        SteelScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelScytheHead",num)).setUnlocalizedName("Steel Scythe Blade").setIconCoord(11, 9);num++;
        TinScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinScytheHead",num)).setUnlocalizedName("Tin Scythe Blade").setIconCoord(12, 9);num++;
        ZincScytheHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincScytheHead",num)).setUnlocalizedName("Zinc Scythe Blade").setIconCoord(13, 9);num++;
        
        WoodenBucketEmpty = (new ItemCustomBucket(TFC_Settings.getIntFor(config,"item","WoodenBucketEmpty",num), 0)).setIconCoord(13, 0).setUnlocalizedName("WoodenBucketEmpty");num++;
        WoodenBucketWater = (new ItemCustomBucket(TFC_Settings.getIntFor(config,"item","WoodenBucketWater",num), TFCBlocks.finiteWater.blockID)).setIconCoord(14, 0).setUnlocalizedName("WoodenBucketWater").setContainerItem(WoodenBucketEmpty);num++;
        WoodenBucketMilk = (new ItemCustomBucketMilk(TFC_Settings.getIntFor(config,"item","WoodenBucketMilk",num))).setIconCoord(15, 0).setUnlocalizedName("WoodenBucketMilk").setContainerItem(WoodenBucketEmpty);num++;
        
        BismuthKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthKnifeHead",num)).setUnlocalizedName("Bismuth Knife Blade").setIconCoord(1, 10);num++;
        BismuthBronzeKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BismuthBronzeKnifeHead",num)).setUnlocalizedName("Bismuth Bronze Knife Blade").setIconCoord(2, 10);num++;
        BlackBronzeKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackBronzeKnifeHead",num)).setUnlocalizedName("Black Bronze Knife Blade").setIconCoord(3, 10);num++;
        BlackSteelKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlackSteelKnifeHead",num)).setUnlocalizedName("Black Steel Knife Blade").setIconCoord(4, 10);num++;
        BlueSteelKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BlueSteelKnifeHead",num)).setUnlocalizedName("Blue Steel Knife Blade").setIconCoord(5, 10);num++;
        BronzeKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","BronzeKnifeHead",num)).setUnlocalizedName("Bronze Knife Blade").setIconCoord(6, 10);num++;
        CopperKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","CopperKnifeHead",num)).setUnlocalizedName("Copper Knife Blade").setIconCoord(7, 10);num++;
        WroughtIronKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","WroughtIronKnifeHead",num)).setUnlocalizedName("Wrought Iron Knife Blade").setIconCoord(8, 10);num++;
        RedSteelKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RedSteelKnifeHead",num)).setUnlocalizedName("Red Steel Knife Blade").setIconCoord(9, 10);num++;
        RoseGoldKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","RoseGoldKnifeHead",num)).setUnlocalizedName("Rose Gold Knife Blade").setIconCoord(10, 10);num++;
        SteelKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SteelKnifeHead",num)).setUnlocalizedName("Steel Knife Blade").setIconCoord(11, 10);num++;
        TinKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","TinKnifeHead",num)).setUnlocalizedName("Tin Knife Blade").setIconCoord(12, 10);num++;
        ZincKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","ZincKnifeHead",num)).setUnlocalizedName("Zinc Knife Blade").setIconCoord(13, 10);num++;
        
        BismuthKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","BismuthKnife",num),BismuthToolMaterial).setUnlocalizedName("Bismuth Knife").setMaxDamage(BismuthUses).setIconCoord(1, 10);num++;
        BismuthBronzeKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","BismuthBronzeKnife",num),BismuthBronzeToolMaterial).setUnlocalizedName("Bismuth Bronze Knife").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 10);num++;
        BlackBronzeKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","BlackBronzeKnife",num),BlackBronzeToolMaterial).setUnlocalizedName("Black Bronze Knife").setMaxDamage(BlackBronzeUses).setIconCoord(3, 10);num++;
        BlackSteelKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","BlackSteelKnife",num),BlackSteelToolMaterial).setUnlocalizedName("Black Steel Knife").setMaxDamage(BlackSteelUses).setIconCoord(4, 10);num++;
        BlueSteelKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","BlueSteelKnife",num),BlueSteelToolMaterial).setUnlocalizedName("Blue Steel Knife").setMaxDamage(BlueSteelUses).setIconCoord(5, 10);num++;
        BronzeKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","BronzeKnife",num),BronzeToolMaterial).setUnlocalizedName("Bronze Knife").setMaxDamage(BronzeUses).setIconCoord(6, 10);num++;
        CopperKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","CopperKnife",num),CopperToolMaterial).setUnlocalizedName("Copper Knife").setMaxDamage(CopperUses).setIconCoord(7, 10);num++;
        WroughtIronKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","WroughtIronKnife",num),IronToolMaterial).setUnlocalizedName("Wrought Iron Knife").setMaxDamage(WroughtIronUses).setIconCoord(8, 10);num++;
        RedSteelKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","RedSteelKnife",num),RedSteelToolMaterial).setUnlocalizedName("Red Steel Knife").setMaxDamage(RedSteelUses).setIconCoord(9, 10);num++;
        RoseGoldKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","RoseGoldKnife",num),RoseGoldToolMaterial).setUnlocalizedName("Rose Gold Knife").setMaxDamage(RoseGoldUses).setIconCoord(10, 10);num++;
        SteelKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","SteelKnife",num),SteelToolMaterial).setUnlocalizedName("Steel Knife").setMaxDamage(SteelUses).setIconCoord(11, 10);num++;
        TinKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","TinKnife",num),TinToolMaterial).setUnlocalizedName("Tin Knife").setMaxDamage(TinUses).setIconCoord(12, 10);num++;
        ZincKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","ZincKnife",num),ZincToolMaterial).setUnlocalizedName("Zinc Knife").setMaxDamage(ZincUses).setIconCoord(13, 10);num++;
        
        LooseRock = ((ItemTerra) new ItemLooseRock(TFC_Settings.getIntFor(config,"item","LooseRock",num)).setUnlocalizedName("LooseRock")).setTexturePath(TFC_Textures.RockSheet);num++;
        
        FlatRock = ((ItemTerra) new ItemFlatRock(TFC_Settings.getIntFor(config,"item","FlatRock",num)).setUnlocalizedName("FlatRock")).setTexturePath(TFC_Textures.RockSheet);num++;

        
        IgInStonePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgInStonePickaxeHead",num)).setUnlocalizedName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        SedStonePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SedStonePickaxeHead",num)).setUnlocalizedName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        IgExStonePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgExStonePickaxeHead",num)).setUnlocalizedName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        MMStonePickaxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","MMStonePickaxeHead",num)).setUnlocalizedName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        
        IgInStoneShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgInStoneShovelHead",num)).setUnlocalizedName("Stone Shovel Head").setIconCoord(0, 4);num++;
        SedStoneShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SedStoneShovelHead",num)).setUnlocalizedName("Stone Shovel Head").setIconCoord(0, 4);num++;
        IgExStoneShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgExStoneShovelHead",num)).setUnlocalizedName("Stone Shovel Head").setIconCoord(0, 4);num++;
        MMStoneShovelHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","MMStoneShovelHead",num)).setUnlocalizedName("Stone Shovel Head").setIconCoord(0, 4);num++;
        
        IgInStoneAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgInStoneAxeHead",num)).setUnlocalizedName("Stone Axe Head").setIconCoord(0, 5);num++;
        SedStoneAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SedStoneAxeHead",num)).setUnlocalizedName("Stone Axe Head").setIconCoord(0, 5);num++;
        IgExStoneAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgExStoneAxeHead",num)).setUnlocalizedName("Stone Axe Head").setIconCoord(0, 5);num++;
        MMStoneAxeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","MMStoneAxeHead",num)).setUnlocalizedName("Stone Axe Head").setIconCoord(0, 5);num++;
        
        IgInStoneHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgInStoneHoeHead",num)).setUnlocalizedName("Stone Hoe Head").setIconCoord(0, 6);num++;
        SedStoneHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","SedStoneHoeHead",num)).setUnlocalizedName("Stone Hoe Head").setIconCoord(0, 6);num++;
        IgExStoneHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","IgExStoneHoeHead",num)).setUnlocalizedName("Stone Hoe Head").setIconCoord(0, 6);num++;
        MMStoneHoeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","MMStoneHoeHead",num)).setUnlocalizedName("Stone Hoe Head").setIconCoord(0, 6);num++;
        
        StoneKnifeHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","StoneKnifeHead",num)).setUnlocalizedName("Stone Knife Blade").setIconCoord(0, 10);num++;
        StoneHammerHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","StoneHammerHead",num)).setUnlocalizedName("Stone Hammer Head").setIconCoord(0, 11);num++;
        StoneProPickHead = new ItemMiscToolHead(TFC_Settings.getIntFor(config,"item","StoneProPickHead",num)).setUnlocalizedName("Stone ProPick Head").setIconCoord(0, 1);num++;
        
        StoneKnife = new ItemCustomKnife(TFC_Settings.getIntFor(config,"item","StoneKnife",num),IgExToolMaterial).setUnlocalizedName("Stone Knife").setMaxDamage(IgExStoneUses).setIconCoord(0, 10);num++;
        SmallOreChunk = new ItemOreSmall(TFC_Settings.getIntFor(config,"item","SmallOreChunk",num++)).setUnlocalizedName("Small Ore").setIconCoord(0, 14);
        SinglePlank = new ItemPlank(TFC_Settings.getIntFor(config,"item","SinglePlank",num++),"/bioxx/terrasprites2.png").setUnlocalizedName("SinglePlank").setIconCoord(0, 6);
        
        RedSteelBucketEmpty = (new ItemCustomRedSteelBucket(TFC_Settings.getIntFor(config,"item","RedSteelBucketEmpty",num++), 0)).setIconCoord(13, 2).setUnlocalizedName("RedSteelBucketEmpty");
        RedSteelBucketWater = (new ItemCustomRedSteelBucket(TFC_Settings.getIntFor(config,"item","RedSteelBucketWater",num++), Block.waterMoving.blockID)).setIconCoord(14, 2).setUnlocalizedName("RedSteelBucketWater");
        
        BlueSteelBucketEmpty = (new ItemCustomBlueSteelBucket(TFC_Settings.getIntFor(config,"item","BlueSteelBucketEmpty",num++), 0)).setIconCoord(12, 2).setUnlocalizedName("BlueSteelBucketEmpty");
        BlueSteelBucketLava = (new ItemCustomBlueSteelBucket(TFC_Settings.getIntFor(config,"item","BlueSteelBucketLava",num++), Block.lavaMoving.blockID)).setIconCoord(15, 2).setUnlocalizedName("BlueSteelBucketLava");
        
        Quern = new ItemTerra(TFC_Settings.getIntFor(config,"item","Quern",num++),"/bioxx/terrasprites.png").setUnlocalizedName("Quern").setIconCoord(7, 0).setMaxDamage(250);
        FlintSteel = new ItemFlintSteel(TFC_Settings.getIntFor(config,"item","FlintSteel",num++)).setUnlocalizedName("flintAndSteel").setIconCoord(5, 0).setMaxDamage(200);
        
        DoorOak = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorOak", num++), 0).setUnlocalizedName("Door Oak").setIconCoord(0, 15);
		DoorAspen = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorAspen", num++), 1).setUnlocalizedName("Door Aspen").setIconCoord(1, 15);
		DoorBirch = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorBirch", num++), 2).setUnlocalizedName("Door Birch").setIconCoord(2, 15);
		DoorChestnut = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorChestnut", num++), 3).setUnlocalizedName("Door Chestnut").setIconCoord(3, 15);
		DoorDouglasFir = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorDouglasFir", num++), 4).setUnlocalizedName("Door Douglas Fir").setIconCoord(4, 15);
		DoorHickory = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorHickory", num++), 5).setUnlocalizedName("Door Hickory").setIconCoord(5, 15);
		DoorMaple = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorMaple", num++), 6).setUnlocalizedName("Door Maple").setIconCoord(6, 15);
		DoorAsh = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorAsh", num++), 7).setUnlocalizedName("Door Ash").setIconCoord(7, 15);
		DoorPine = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorPine", num++), 8).setUnlocalizedName("Door Pine").setIconCoord(8, 15);
		DoorSequoia = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorSequoia", num++), 9).setUnlocalizedName("Door Sequoia").setIconCoord(9, 15);
		DoorSpruce = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorSpruce", num++), 10).setUnlocalizedName("Door Spruce").setIconCoord(10, 15);
		DoorSycamore = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorSycamore", num++), 11).setUnlocalizedName("Door Sycamore").setIconCoord(11, 15);
		DoorWhiteCedar = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorWhiteCedar", num++), 12).setUnlocalizedName("Door White Cedar").setIconCoord(12, 15);
		DoorWhiteElm = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorWhiteElm", num++), 13).setUnlocalizedName("Door White Elm").setIconCoord(13, 15);
		DoorWillow = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorWillow", num++), 14).setUnlocalizedName("Door Willow").setIconCoord(14, 15);
		DoorKapok = new ItemWoodDoor(TFC_Settings.getIntFor(config,"item","DoorKapok", num++), 15).setUnlocalizedName("Door Kapok").setIconCoord(15, 15);
		
		Blueprint = new ItemBlueprint(TFC_Settings.getIntFor(config,"item","Blueprint", num++));
		writabeBookTFC = new ItemWritableBookTFC(TFC_Settings.getIntFor(config,"item","WritableBookTFC", num++),Item.book.getTextureFile()).setIconCoord(11, 3).setUnlocalizedName("book");
		WoolYarn = new ItemTerra(TFC_Settings.getIntFor(config, "item", "WoolYarn", num++),"/bioxx/terrasprites2.png").setIconCoord(0,10).setUnlocalizedName("WoolYarn").setCreativeTab(TFCTabs.TFCMaterials);
		Wool = new ItemTerra(TFC_Settings.getIntFor(config,"item","Wool",num++),"/bioxx/terrasprites2.png").setUnlocalizedName("Wool").setIconCoord(0,11).setCreativeTab(TFCTabs.TFCMaterials);
		WoolCloth = new ItemTerra(TFC_Settings.getIntFor(config, "item", "WoolCloth", num++),"/bioxx/terrasprites2.png").setIconCoord(0,8).setUnlocalizedName("WoolCloth").setCreativeTab(TFCTabs.TFCMaterials);
		Spindle = new ItemSpindle(TFC_Settings.getIntFor(config,"item","Spindle",num++),SedToolMaterial).setIconCoord(15, 3).setUnlocalizedName("Spindle").setCreativeTab(TFCTabs.TFCMaterials);
		ClaySpindle = new ItemTerra(TFC_Settings.getIntFor(config, "item", "ClaySpindle", num++),"/bioxx/terratools.png").setIconCoord(15,4).setUnlocalizedName("ClaySpindle").setCreativeTab(TFCTabs.TFCMaterials);
		SpindleHead = new ItemTerra(TFC_Settings.getIntFor(config, "item", "SpindleHead", num++),"/bioxx/terratoolheads.png").setIconCoord(0,13).setUnlocalizedName("SpindleHead").setCreativeTab(TFCTabs.TFCMaterials);
		StoneBrick = ((ItemTerra) new ItemStoneBrick(TFC_Settings.getIntFor(config,"item","ItemStoneBrick2",num++)).setUnlocalizedName("ItemStoneBrick")).setTexturePath(TFC_Textures.RockSheet);
		Mortar = new ItemTerra(TFC_Settings.getIntFor(config,"item","Mortar",num++),"/bioxx/terratools.png").setUnlocalizedName("Mortar").setIconCoord(1,14).setCreativeTab(TFCTabs.TFCMaterials);
		Limewater = new ItemCustomBucket(TFC_Settings.getIntFor(config,"item","Limewater",num++),0).setUnlocalizedName("LimeWater").setIconCoord(0,14).setContainerItem(WoodenBucketEmpty).setCreativeTab(TFCTabs.TFCMaterials);
		Hide = new ItemTerra(TFC_Settings.getIntFor(config,"item","Hide",num++),"/bioxx/terratools.png").setUnlocalizedName("Hide").setIconCoord(2, 14).setCreativeTab(TFCTabs.TFCMaterials);
		SoakedHide = new ItemTerra(TFC_Settings.getIntFor(config,"item","SoakedHide",num++),"/bioxx/terratools.png").setUnlocalizedName("SoakedHide").setIconCoord(3,14).setCreativeTab(TFCTabs.TFCMaterials);
		ScrapedHide = new ItemTerra(TFC_Settings.getIntFor(config,"item","ScrapedHide",num++),"/bioxx/terratools.png").setUnlocalizedName("ScrapedHide").setIconCoord(4, 14).setCreativeTab(TFCTabs.TFCMaterials);
		PrepHide = new ItemTerra(TFC_Settings.getIntFor(config,"item","PrepHide",num++),"/bioxx/terratools.png").setUnlocalizedName("PrepHide").setIconCoord(5, 14).setCreativeTab(TFCTabs.TFCMaterials);
		TerraLeather = new ItemTerra(TFC_Settings.getIntFor(config,"item","TFCLeather",num++),"/bioxx/terratools.png").setUnlocalizedName("TFCLeather").setIconCoord(7, 14).setCreativeTab(TFCTabs.TFCMaterials);
		SheepSkin = new ItemTerra(TFC_Settings.getIntFor(config,"item","SheepSkin",num++),"/bioxx/terratools.png").setUnlocalizedName("SheepSkin").setIconCoord(6, 14).setCreativeTab(TFCTabs.TFCMaterials);
		muttonRaw = new ItemTerra(TFC_Settings.getIntFor(config,"item","muttonRaw",num++),"/bioxx/FoodSprites.png").setUnlocalizedName("muttonRaw").setIconCoord(0,10);
		muttonCooked =  new ItemTerraFood(TFC_Settings.getIntFor(config,"item","muttonCooked",num++), 40, 0.8F, true,"/bioxx/FoodSprites.png", 48).setUnlocalizedName("muttonCooked").setIconCoord(1,10);
        FlatLeather = ((ItemTerra) new ItemFlatLeather(TFC_Settings.getIntFor(config,"items","FlatLeather2",num++)).setUnlocalizedName("FlatLeather")).setTexturePath("/bioxx/terratools.png").setIconCoord(8, 14);
        
        
		/**Plans*/
        num = 20000;
        SetupPlans(num);
        
        /**Food related items*/
        num = 18000;
        SetupFood(num);

        /**Armor Crafting related items*/
        num = 19000;
        SetupArmor(num);
        
        Recipes.Doors = new Item[]{DoorOak, DoorAspen, DoorBirch, DoorChestnut, DoorDouglasFir, 
        		DoorHickory, DoorMaple, DoorAsh, DoorPine, DoorSequoia, DoorSpruce, DoorSycamore, 
        		DoorWhiteCedar, DoorWhiteElm, DoorWillow, DoorKapok};
        
        Recipes.Axes = new Item[]{SedAxe,IgInAxe,IgExAxe,MMAxe,
                BismuthAxe,BismuthBronzeAxe,BlackBronzeAxe,
                BlackSteelAxe,BlueSteelAxe,BronzeAxe,CopperAxe,
                WroughtIronAxe,RedSteelAxe,RoseGoldAxe,SteelAxe,
                TinAxe,ZincAxe,
                boneSedAxe,boneIgInAxe,boneIgExAxe,boneMMAxe};
        
        Recipes.Chisels = new Item[]{BismuthChisel,BismuthBronzeChisel,BlackBronzeChisel,
            BlackSteelChisel,BlueSteelChisel,BronzeChisel,CopperChisel,
            WroughtIronChisel,RedSteelChisel,RoseGoldChisel,SteelChisel,
            TinChisel,ZincChisel};
        
        Recipes.Saws = new Item[]{BismuthSaw,BismuthBronzeSaw,BlackBronzeSaw,
                BlackSteelSaw,BlueSteelSaw,BronzeSaw,CopperSaw,
                WroughtIronSaw,RedSteelSaw,RoseGoldSaw,SteelSaw,
                TinSaw,ZincSaw};
        
        Recipes.Knives = new Item[]{StoneKnife,BismuthKnife,BismuthBronzeKnife,BlackBronzeKnife,
                BlackSteelKnife,BlueSteelKnife,BronzeKnife,CopperKnife,
                WroughtIronKnife,RedSteelKnife,RoseGoldKnife,SteelKnife,
                TinKnife,ZincKnife};
        
        Recipes.MeltedMetal = new Item[]{BismuthUnshaped, BismuthBronzeUnshaped,BlackBronzeUnshaped,
                TFCItems.BlackSteelUnshaped,TFCItems.BlueSteelUnshaped,TFCItems.BrassUnshaped,TFCItems.BronzeUnshaped,
                TFCItems.CopperUnshaped,TFCItems.GoldUnshaped,
                TFCItems.WroughtIronUnshaped,TFCItems.LeadUnshaped,TFCItems.NickelUnshaped,TFCItems.PigIronUnshaped,
                TFCItems.PlatinumUnshaped,TFCItems.RedSteelUnshaped,TFCItems.RoseGoldUnshaped,TFCItems.SilverUnshaped,
                TFCItems.SteelUnshaped,TFCItems.SterlingSilverUnshaped,
                TFCItems.TinUnshaped,TFCItems.ZincUnshaped, TFCItems.HCSteelUnshaped, TFCItems.WeakSteelUnshaped,
                TFCItems.HCBlackSteelUnshaped, TFCItems.HCBlueSteelUnshaped, TFCItems.HCRedSteelUnshaped, 
                TFCItems.WeakBlueSteelUnshaped, TFCItems.WeakRedSteelUnshaped};
            
        Recipes.Hammers  = new Item[]{TFCItems.StoneHammer,TFCItems.BismuthHammer,TFCItems.BismuthBronzeHammer,TFCItems.BlackBronzeHammer,
                TFCItems.BlackSteelHammer,TFCItems.BlueSteelHammer,TFCItems.BronzeHammer,TFCItems.CopperHammer,
                TFCItems.WroughtIronHammer,TFCItems.RedSteelHammer,TFCItems.RoseGoldHammer,TFCItems.SteelHammer,
                TFCItems.TinHammer,TFCItems.ZincHammer};
        
       Recipes.Spindle = new Item[]{TFCItems.Spindle};
        
        Recipes.Gems  = new Item[]{TFCItems.GemAgate, TFCItems.GemAmethyst, TFCItems.GemBeryl, TFCItems.GemDiamond, TFCItems.GemEmerald, TFCItems.GemGarnet, 
        		TFCItems.GemJade, TFCItems.GemJasper, TFCItems.GemOpal,TFCItems.GemRuby,TFCItems.GemSapphire,TFCItems.GemTopaz,TFCItems.GemTourmaline};
        
        Meals = new Item[]{MealMoveSpeed, MealDigSpeed, MealDamageBoost, MealJump, MealDamageResist, 
            	MealFireResist, MealWaterBreathing, MealNightVision};
        
        ((TFCTabs)TFCTabs.TFCTools).setTabIconItemIndex(TFCItems.RoseGoldHammer.itemID);
        ((TFCTabs)TFCTabs.TFCMaterials).setTabIconItemIndex(TFCItems.Spindle.itemID);
        ((TFCTabs)TFCTabs.TFCUnfinished).setTabIconItemIndex(TFCItems.RoseGoldHammerHead.itemID);
        ((TFCTabs)TFCTabs.TFCArmor).setTabIconItemIndex(TFCItems.SteelHelmet.itemID);
        
        if (config != null) {
            config.save();
        }
    }
    
    public static void SetupPlans(int num)
    {
    	PickaxeHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","PickaxeHeadPlan",num)).setUnlocalizedName("PickaxeHeadPlan").setIconCoord(0, 0);num++;
        ShovelHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","ShovelHeadPlan",num)).setUnlocalizedName("ShovelHeadPlan").setIconCoord(0, 0);num++;
        HoeHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","HoeHeadPlan",num)).setUnlocalizedName("HoeHeadPlan").setIconCoord(0, 0);num++;
        AxeHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","AxeHeadPlan",num)).setUnlocalizedName("AxeHeadPlan").setIconCoord(0, 0);num++;
        HammerHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","HammerHeadPlan",num)).setUnlocalizedName("HammerHeadPlan").setIconCoord(0, 0);num++;
        ChiselHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","ChiselHeadPlan",num)).setUnlocalizedName("ChiselHeadPlan").setIconCoord(0, 0);num++;
        SwordBladePlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","SwordBladePlan",num)).setUnlocalizedName("SwordBladePlan").setIconCoord(0, 0);num++;
        MaceHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","MaceHeadPlan",num)).setUnlocalizedName("MaceHeadPlan").setIconCoord(0, 0);num++;
        SawBladePlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","SawBladePlan",num)).setUnlocalizedName("SawBladePlan").setIconCoord(0, 0);num++;
        ProPickHeadPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","ProPickHeadPlan",num)).setUnlocalizedName("ProPickHeadPlan").setIconCoord(0, 0);num++;
        HelmetPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","HelmetPlan",num)).setUnlocalizedName("HelmetPlan").setIconCoord(0, 0);num++;
        ChestplatePlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","ChestplatePlan",num)).setUnlocalizedName("ChestplatePlan").setIconCoord(0, 0);num++;
        GreavesPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","GreavesPlan",num)).setUnlocalizedName("GreavesPlan").setIconCoord(0, 0);num++;
        BootsPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","BootsPlan",num)).setUnlocalizedName("BootsPlan").setIconCoord(0, 0);num++;
        ScythePlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","ScythePlan",num)).setUnlocalizedName("ScythePlan").setIconCoord(0, 0);num++;
        KnifePlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","KnifePlan",num)).setUnlocalizedName("KnifePlan").setIconCoord(0, 0);num++;
        BucketPlan = new ItemMiscTool(TFC_Settings.getIntFor(config,"item","BucketPlan",num)).setUnlocalizedName("BucketPlan").setIconCoord(0, 0);num++;
    }
     
    public static void SetupFood(int num)
    {
    	FruitTreeSapling1 = new ItemFruitTreeSapling(TFC_Settings.getIntFor(config,"item","FruitSapling1", num), TFC_Textures.VegetationSheet, 0).setUnlocalizedName("FruitSapling1").setIconCoord(0, 7);num++;
        FruitTreeSapling2 = new ItemFruitTreeSapling(TFC_Settings.getIntFor(config,"item","FruitSapling2", num), TFC_Textures.VegetationSheet, 8).setUnlocalizedName("FruitSapling2").setIconCoord(8, 7);num++;
        RedApple = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Red Apple",num), 15, 0.1F, false,TFC_Textures.FoodSheet, 2).setIconCoord(2, 0).setUnlocalizedName("Fruit.Red Apple");num++;
        Banana = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Banana",num), 10, 0.1F, false,TFC_Textures.FoodSheet, 3).setIconCoord(0, 0).setUnlocalizedName("Fruit.Banana");num++;
        Orange = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Orange",num), 10, 0.1F, false,TFC_Textures.FoodSheet, 4).setIconCoord(1, 0).setUnlocalizedName("Fruit.Orange");num++;
        GreenApple = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Green Apple",num), 15, 0.1F, false,TFC_Textures.FoodSheet, 5).setIconCoord(3, 0).setUnlocalizedName("Fruit.Green Apple");num++;
        Lemon = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Lemon",num), 10, 0.03F, false,TFC_Textures.FoodSheet, 6).setIconCoord(4, 0).setUnlocalizedName("Fruit.Lemon");num++;
        Olive = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Olive",num), 10, 0.05F, false,TFC_Textures.FoodSheet, 7).setIconCoord(8, 0).setUnlocalizedName("Fruit.Olive");num++;
        Cherry = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Cherry",num), 10, 0.03F, false,TFC_Textures.FoodSheet, 8).setIconCoord(5, 0).setUnlocalizedName("Fruit.Cherry");num++;
        Peach = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Peach",num), 12, 0.1F, false,TFC_Textures.FoodSheet, 9).setIconCoord(6, 0).setUnlocalizedName("Fruit.Peach");num++;
        Plum = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Fruit.Plum",num), 10, 0.1F, false,TFC_Textures.FoodSheet, 10).setIconCoord(7, 0).setUnlocalizedName("Fruit.Plum");num++;
        EggCooked = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Meat.EggCooked",num), 25, 0.4F, false,TFC_Textures.FoodSheet, 11).setIconCoord(0, 7).setUnlocalizedName("Meat.EggCooked");num++;
        
        WheatGrain = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","WheatGrain",num++), 1, 0.4F, false,TFC_Textures.FoodSheet, 12).setIconCoord(1, 4).setUnlocalizedName("WheatGrain");
        BarleyGrain = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","BarleyGrain",num++), 1, 0.4F, false,TFC_Textures.FoodSheet, 14).setIconCoord(0, 4).setUnlocalizedName("BarleyGrain");
        OatGrain = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","OatGrain",num++), 1, 0.4F, false,TFC_Textures.FoodSheet, 16).setIconCoord(3, 4).setUnlocalizedName("OatGrain");
        RyeGrain = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RyeGrain",num++), 1, 0.4F, false,TFC_Textures.FoodSheet, 18).setIconCoord(2, 4).setUnlocalizedName("RyeGrain");
        RiceGrain = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RiceGrain",num++), 1, 0.4F, false,TFC_Textures.FoodSheet, 20).setIconCoord(4, 4).setUnlocalizedName("RiceGrain");
        MaizeEar = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","MaizeEar",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 22).setIconCoord(5, 4).setUnlocalizedName("MaizeEar");
        Tomato = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Tomato",num++), 15, 0.4F, false,TFC_Textures.FoodSheet, 24).setIconCoord(15, 4).setUnlocalizedName("Tomato");
        Potato = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Potato",num++), 22, 0.4F, false,TFC_Textures.FoodSheet, 25).setIconCoord(6, 4).setUnlocalizedName("Potato");
        Onion = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Onion",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 27).setIconCoord(7, 4).setUnlocalizedName("Onion");
        Cabbage = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Cabbage",num++), 20, 0.4F, false,TFC_Textures.FoodSheet, 28).setIconCoord(8, 4).setUnlocalizedName("Cabbage");
        Garlic = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Garlic",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 29).setIconCoord(11, 4).setUnlocalizedName("Garlic");
        Carrot = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Carrot",num++), 5, 0.4F, false,TFC_Textures.FoodSheet, 30).setIconCoord(12, 4).setUnlocalizedName("Carrot");
        Sugarcane = new ItemTerra(TFC_Settings.getIntFor(config,"item","Sugarcane",num++),TFC_Textures.FoodSheet).setIconCoord(13, 4).setUnlocalizedName("Sugarcane");
        Hemp = new ItemTerra(TFC_Settings.getIntFor(config,"item","Hemp",num++), TFC_Textures.FoodSheet).setIconCoord(15, 2).setUnlocalizedName("Hemp");
        Soybean = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Soybeans",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 31).setIconCoord(8, 5).setUnlocalizedName("Soybeans");
        Greenbeans = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Greenbeans",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 32).setIconCoord(10, 5).setUnlocalizedName("Greenbeans");
        GreenBellPepper = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","GreenBellPepper",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 34).setIconCoord(5, 5).setUnlocalizedName("GreenBellPepper");
        YellowBellPepper = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","YellowBellPepper",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 35).setIconCoord(6, 5).setUnlocalizedName("YellowBellPepper");
        RedBellPepper = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RedBellPepper",num++), 10, 0.4F, false,TFC_Textures.FoodSheet, 36).setIconCoord(7, 5).setUnlocalizedName("RedBellPepper");
        Squash = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","Squash",num++), 12, 0.4F, false,TFC_Textures.FoodSheet, 37).setIconCoord(9, 5).setUnlocalizedName("Squash");
        
        WheatWhole = new ItemTerra(TFC_Settings.getIntFor(config,"item","WheatWhole",num++),TFC_Textures.FoodSheet).setUnlocalizedName("WheatWhole").setIconCoord(1, 5);
        BarleyWhole = new ItemTerra(TFC_Settings.getIntFor(config,"item","BarleyWhole",num++),TFC_Textures.FoodSheet).setUnlocalizedName("BarleyWhole").setIconCoord(0, 5);
        OatWhole = new ItemTerra(TFC_Settings.getIntFor(config,"item","OatWhole",num++),TFC_Textures.FoodSheet).setUnlocalizedName("OatWhole").setIconCoord(3, 5);
        RyeWhole = new ItemTerra(TFC_Settings.getIntFor(config,"item","RyeWhole",num++),TFC_Textures.FoodSheet).setUnlocalizedName("RyeWhole").setIconCoord(2, 5);
        RiceWhole = new ItemTerra(TFC_Settings.getIntFor(config,"item","RiceWhole",num++),TFC_Textures.FoodSheet).setUnlocalizedName("RiceWhole").setIconCoord(4, 5);
        
        MealGeneric = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealGeneric",num++),TFC_Textures.FoodSheet).setUnlocalizedName("MealGeneric").setIconCoord(15, 1);
        MealMoveSpeed = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealMoveSpeed",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.moveSpeed.id,8000,4)).setUnlocalizedName("MealGeneric").setIconCoord(14, 1);
        MealDigSpeed = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealDigSpeed",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.digSpeed.id,8000,4)).setUnlocalizedName("MealGeneric").setIconCoord(13, 1);
        MealDamageBoost = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealDamageBoost",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.damageBoost.id,4000,4)).setUnlocalizedName("MealGeneric").setIconCoord(12, 1);
        MealJump = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealJump",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.jump.id,8000,4)).setUnlocalizedName("MealGeneric").setIconCoord(11, 1);
        MealDamageResist = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealDamageResist",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.resistance.id,8000,4)).setUnlocalizedName("MealGeneric").setIconCoord(10, 1);
        MealFireResist = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealFireResist",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.fireResistance.id,8000,4)).setUnlocalizedName("MealGeneric").setIconCoord(9, 1);
        MealWaterBreathing = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealWaterBreathing",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.waterBreathing.id,8000,4)).setUnlocalizedName("MealGeneric").setIconCoord(8, 1);
        MealNightVision = new ItemMeal(TFC_Settings.getIntFor(config,"item","MealNightVision",num++),TFC_Textures.FoodSheet).setPotionEffect(new PotionEffect(Potion.nightVision.id,4000,4)).setUnlocalizedName("MealGeneric").setIconCoord(7, 1);
        
        WheatGround = new ItemTerra(TFC_Settings.getIntFor(config,"item","WheatGround",num++),TFC_Textures.FoodSheet).setUnlocalizedName("WheatGround").setIconCoord(10, 0);
        BarleyGround = new ItemTerra(TFC_Settings.getIntFor(config,"item","BarleyGround",num++),TFC_Textures.FoodSheet).setUnlocalizedName("BarleyGround").setIconCoord(11, 0);
        OatGround = new ItemTerra(TFC_Settings.getIntFor(config,"item","OatGround",num++),TFC_Textures.FoodSheet).setUnlocalizedName("OatGround").setIconCoord(12, 0);
        RyeGround = new ItemTerra(TFC_Settings.getIntFor(config,"item","RyeGround",num++),TFC_Textures.FoodSheet).setUnlocalizedName("RyeGround").setIconCoord(13, 0);
        RiceGround = new ItemTerra(TFC_Settings.getIntFor(config,"item","RiceGround",num++),TFC_Textures.FoodSheet).setUnlocalizedName("RiceGround").setIconCoord(14, 0);
        CornmealGround = new ItemTerra(TFC_Settings.getIntFor(config,"item","CornmealGround",num++),TFC_Textures.FoodSheet).setUnlocalizedName("CornmealGround").setIconCoord(15, 0);
        
        WheatDough = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","WheatDough",num++), 1, 0.0F, false,TFC_Textures.FoodSheet, 0).setUnlocalizedName("WheatDough").setIconCoord(15, 3);
        BarleyDough = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","BarleyDough",num++), 1, 0.0F, false,TFC_Textures.FoodSheet, 0).setUnlocalizedName("BarleyDough").setIconCoord(15, 3);
        OatDough = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","OatDough",num++), 1, 0.0F, false,TFC_Textures.FoodSheet, 0).setUnlocalizedName("OatDough").setIconCoord(15, 3);
        RyeDough = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RyeDough",num++), 1, 0.0F, false,TFC_Textures.FoodSheet, 0).setUnlocalizedName("RyeDough").setIconCoord(15, 3);
        RiceDough = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RiceDough",num++), 1, 0.0F, false,TFC_Textures.FoodSheet, 0).setUnlocalizedName("RiceDough").setIconCoord(15, 3);
        CornmealDough = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","CornmealDough",num++), 1, 0.0F, false,TFC_Textures.FoodSheet, 0).setUnlocalizedName("CornmealDough").setIconCoord(15, 3);
        
        BarleyBread = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","BarleyBread",num++), 25, 0.6F, false,TFC_Textures.FoodSheet, 43).setUnlocalizedName("BarleyBread").setIconCoord(0, 1);
        OatBread = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","OatBread",num++), 25, 0.6F, false,TFC_Textures.FoodSheet, 44).setUnlocalizedName("OatBread").setIconCoord(1, 1);
        RyeBread = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RyeBread",num++), 25, 0.6F, false,TFC_Textures.FoodSheet, 45).setUnlocalizedName("RyeBread").setIconCoord(2, 1);
        RiceBread = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","RiceBread",num++), 25, 0.6F, false,TFC_Textures.FoodSheet, 46).setUnlocalizedName("RiceBread").setIconCoord(3, 1);
        CornBread = new ItemTerraFood(TFC_Settings.getIntFor(config,"item","CornBread",num++), 25, 0.6F, false,TFC_Textures.FoodSheet, 47).setUnlocalizedName("CornBread").setIconCoord(4, 1);
        
        num = 18900;
        SeedsWheat = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsWheat",num++),0).setUnlocalizedName("SeedsWheat").setIconCoord(0, 8);
        SeedsBarley = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsBarley",num++),5).setUnlocalizedName("SeedsBarley").setIconCoord(2, 8);
        SeedsRye = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsRye",num++),7).setUnlocalizedName("SeedsRye").setIconCoord(4, 8);
        SeedsOat = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsOat",num++),9).setUnlocalizedName("SeedsOat").setIconCoord(6, 8);
        SeedsRice = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsRice",num++),11).setUnlocalizedName("SeedsRice").setIconCoord(8, 8);
        SeedsMaize = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsMaize",num++),2).setUnlocalizedName("SeedsMaize").setIconCoord(10, 8);
        SeedsPotato = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsPotato",num++),13).setUnlocalizedName("SeedsPotato").setIconCoord(12, 8);
        SeedsOnion = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsOnion",num++),15).setUnlocalizedName("SeedsOnion").setIconCoord(14, 8);
        SeedsCabbage = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsCabbage",num++),16).setUnlocalizedName("SeedsCabbage").setIconCoord(15, 8);
        SeedsGarlic = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsGarlic",num++),17).setUnlocalizedName("SeedsGarlic").setIconCoord(0, 9);
        SeedsCarrot = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsCarrot",num++),18).setUnlocalizedName("SeedsCarrot").setIconCoord(1, 9);
        SeedsSugarcane = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsSugarcane",num++),21).setUnlocalizedName("SeedsSugarcane").setIconCoord(2, 9);
        SeedsHemp = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsHemp",num++),22).setUnlocalizedName("SeedsHemp").setIconCoord(3, 9);
        SeedsTomato = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsTomato",num++),4).setUnlocalizedName("SeedsTomato").setIconCoord(4, 9);
        SeedsYellowBellPepper = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsYellowBellPepper",num++),19).setUnlocalizedName("SeedsYellowBellPepper").setIconCoord(5, 9);
        SeedsRedBellPepper = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsRedBellPepper",num++),20).setUnlocalizedName("SeedsRedBellPepper").setIconCoord(6, 9);
        SeedsSoybean = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsSoybean",num++),21).setUnlocalizedName("SeedsSoybean").setIconCoord(7, 9);
        SeedsGreenbean = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsGreenbean",num++),22).setUnlocalizedName("SeedsGreenbean").setIconCoord(8, 9);
        SeedsSquash = new ItemCustomSeeds(TFC_Settings.getIntFor(config,"item","SeedsSquash",num++),23).setUnlocalizedName("SeedsSquash").setIconCoord(9, 9);
    }
    
    public static void SetupArmor(int num)
    {
    	BismuthArmorMaterial = EnumHelper.addArmorMaterial("Bismuth", 20, new int[] {2,4,3,2}, 1);
		BismuthBronzeArmorMaterial = EnumHelper.addArmorMaterial("BismuthBronze", 40, new int[] {4,6,5,4}, 1);
		BlackBronzeArmorMaterial = EnumHelper.addArmorMaterial("BlackBronze", 40, new int[] {4,6,5,4}, 1);
		BlackSteelArmorMaterial = EnumHelper.addArmorMaterial("BlackSteel", 70, new int[] {6,8,7,6}, 1);
		BlueSteelArmorMaterial = EnumHelper.addArmorMaterial("BlueSteel", 80, new int[] {7,8,8,7}, 1);
		BronzeArmorMaterial = EnumHelper.addArmorMaterial("Bronze", 42, new int[] {4,6,5,4}, 1);
		CopperArmorMaterial = EnumHelper.addArmorMaterial("Copper", 30, new int[] {3,5,4,3}, 1);
		IronArmorMaterial = EnumHelper.addArmorMaterial("Iron", 50, new int[] {5,7,6,5}, 1);
		RedSteelArmorMaterial = EnumHelper.addArmorMaterial("RedSteel", 80, new int[] {7,8,8,7}, 1);
		RoseGoldArmorMaterial = EnumHelper.addArmorMaterial("RoseGold", 40, new int[] {4,6,5,4}, 1);
		SteelArmorMaterial = EnumHelper.addArmorMaterial("Steel", 60, new int[] {6,8,7,6}, 1);
		TinArmorMaterial = EnumHelper.addArmorMaterial("Tin", 20, new int[] {2,4,3,2}, 1);
		ZincArmorMaterial = EnumHelper.addArmorMaterial("Zinc", 20, new int[] {2,4,3,2}, 1);
		
    	String[] Names = {"Bismuth", "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Bronze", "Copper", "Wrought Iron", "Red Steel", "Rose Gold", "Steel", "Tin", "Zinc"};
    	String[] NamesNS = {"Bismuth", "BismuthBronze", "BlackBronze", "BlackSteel", "BlueSteel", "Bronze", "Copper", "WroughtIron", "RedSteel", "RoseGold", "Steel", "Tin", "Zinc"};
    	String[] NamesNSO = {"Brass", "Gold", "Lead", "Nickel", "Pig Iron", "Platinum", "Silver", "Sterling Silver"};
    	CommonProxy proxy = TerraFirmaCraft.proxy;
        
        EnumArmorMaterial[] mats = new EnumArmorMaterial[]{TFCItems.BismuthArmorMaterial,TFCItems.BismuthBronzeArmorMaterial,TFCItems.BlackBronzeArmorMaterial,TFCItems.BlackSteelArmorMaterial,TFCItems.BlueSteelArmorMaterial,
                TFCItems.BronzeArmorMaterial,TFCItems.CopperArmorMaterial,TFCItems.IronArmorMaterial,TFCItems.RedSteelArmorMaterial,TFCItems.RoseGoldArmorMaterial,
                TFCItems.SteelArmorMaterial,TFCItems.TinArmorMaterial,TFCItems.ZincArmorMaterial};
        
        
        
        int i = 0;
        BismuthSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("BismuthSheet").setIconCoord(0,11)).setTexturePath("/bioxx/terrasprites.png");num++;
        BismuthBronzeSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Bismuth BronzeSheet").setIconCoord(1, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        BlackBronzeSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Black BronzeSheet").setIconCoord(2, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        BlackSteelSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Black SteelSheet").setIconCoord(3, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        BlueSteelSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Blue SteelSheet").setIconCoord(4, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        BronzeSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("BronzeSheet").setIconCoord(6, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        CopperSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("CopperSheet").setIconCoord(7, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        WroughtIronSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Wrought IronSheet").setIconCoord(10, 11)).setTexturePath("/bioxx/terrasprites.png");num++;
        RedSteelSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Red SteelSheet").setIconCoord(3, 12)).setTexturePath("/bioxx/terrasprites.png");num++;
        RoseGoldSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("Rose GoldSheet").setIconCoord(4, 12)).setTexturePath("/bioxx/terrasprites.png");num++;
        SteelSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("SteelSheet").setIconCoord(6, 12)).setTexturePath("/bioxx/terrasprites.png");num++;
        TinSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("TinSheet").setIconCoord(8, 12)).setTexturePath("/bioxx/terrasprites.png");num++;
        ZincSheet = ((ItemTerra)new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet",num)).setUnlocalizedName("ZincSheet").setIconCoord(9, 12)).setTexturePath("/bioxx/terrasprites.png");num++;
        
        i = 0;
        BismuthSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("BismuthSheet2x").setIconCoord(0,13)).setTexturePath("/bioxx/terrasprites.png");num++;
        BismuthBronzeSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Bismuth BronzeSheet2x").setIconCoord(1, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        BlackBronzeSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Black BronzeSheet2x").setIconCoord(2, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        BlackSteelSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Black SteelSheet2x").setIconCoord(3, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        BlueSteelSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Blue SteelSheet2x").setIconCoord(4, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        BronzeSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("BronzeSheet2x").setIconCoord(6, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        CopperSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("CopperSheet2x").setIconCoord(7, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        WroughtIronSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Wrought IronSheet2x").setIconCoord(10, 13)).setTexturePath("/bioxx/terrasprites.png");num++;
        RedSteelSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Red SteelSheet2x").setIconCoord(3, 14)).setTexturePath("/bioxx/terrasprites.png");num++;
        RoseGoldSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("Rose GoldSheet2x").setIconCoord(4, 14)).setTexturePath("/bioxx/terrasprites.png");num++;
        SteelSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("SteelSheet2x").setIconCoord(6, 14)).setTexturePath("/bioxx/terrasprites.png");num++;
        TinSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("TinSheet2x").setIconCoord(8, 14)).setTexturePath("/bioxx/terrasprites.png");num++;
        ZincSheet2x = ((ItemTerra)new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNS[i++]+"Sheet2x",num)).setUnlocalizedName("ZincSheet2x").setIconCoord(9, 14)).setTexturePath("/bioxx/terrasprites.png");num++;
        
        i = 0;
        TFCItems.BismuthUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedBoots",num)).setUnlocalizedName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BismuthBronzeBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BlackBronzeBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BlackSteelBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BlueSteelBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BronzeBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.CopperBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.WroughtIronBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.RedSteelBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.RoseGoldBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.SteelBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.TinBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.ZincBoots = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setUnlocalizedName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        i = 0;
        TFCItems.BismuthUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedGreaves",num)).setUnlocalizedName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BismuthBronzeGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BlackBronzeGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BlackSteelGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BlueSteelGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BronzeGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.CopperGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.WroughtIronGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.RedSteelGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.RoseGoldGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.SteelGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.TinGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.ZincGreaves = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setUnlocalizedName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        i = 0;
        TFCItems.BismuthUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedChestplate",num)).setUnlocalizedName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BismuthBronzeChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BlackBronzeChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BlackSteelChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BlueSteelChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BronzeChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.CopperChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.WroughtIronChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.RedSteelChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.RoseGoldChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.SteelChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.TinChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.ZincChestplate = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setUnlocalizedName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        i = 0;
        TFCItems.BismuthUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"UnfinishedHelmet",num)).setUnlocalizedName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BismuthBronzeHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BlackBronzeHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BlackSteelHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BlueSteelHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BronzeHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.CopperHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.WroughtIronHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.RedSteelHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.RoseGoldHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.SteelHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.TinHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.ZincHelmet = ((ItemCustomArmor)new ItemCustomArmor(TFC_Settings.getIntFor(config,"item",NamesNS[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setUnlocalizedName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
    
        i = 0;
        BrassSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(5,11);
        GoldSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(8,11);
        LeadSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(9,11);
        NickelSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(0,12);
        PigIronSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(1,12);
        PlatinumSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(2,12);
        SilverSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(5,12);
        SterlingSilverSheet = new ItemMetalSheet(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet").setIconCoord(7,12);
        
        i = 0;
        BrassSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(5,13);
        GoldSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(8,13);
        LeadSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(9,13);
        NickelSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(0,14);
        PigIronSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(1,14);
        PlatinumSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(2,14);
        SilverSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(5,14);
        SterlingSilverSheet2x = new ItemMetalSheet2x(TFC_Settings.getIntFor(config,"item",NamesNSO[i]+"Sheet2x",num++)).setUnlocalizedName(NamesNSO[i++]+"Sheet2x").setIconCoord(7,14);
    }
    
    public static Item[] Meals;


	public static EnumArmorMaterial BismuthArmorMaterial;
	public static EnumArmorMaterial BismuthBronzeArmorMaterial;
	public static EnumArmorMaterial BlackBronzeArmorMaterial;
	public static EnumArmorMaterial BlackSteelArmorMaterial;
	public static EnumArmorMaterial BlueSteelArmorMaterial;
	public static EnumArmorMaterial BronzeArmorMaterial;
	public static EnumArmorMaterial CopperArmorMaterial;
	public static EnumArmorMaterial IronArmorMaterial;
	public static EnumArmorMaterial RedSteelArmorMaterial;
	public static EnumArmorMaterial RoseGoldArmorMaterial;
	public static EnumArmorMaterial SteelArmorMaterial;
	public static EnumArmorMaterial TinArmorMaterial;
	public static EnumArmorMaterial ZincArmorMaterial;
}