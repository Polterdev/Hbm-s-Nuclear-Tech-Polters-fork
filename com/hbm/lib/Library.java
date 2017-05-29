package com.hbm.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.hbm.blocks.ModBlocks;
import com.hbm.calc.UnionOfTileEntitiesAndBooleans;
import com.hbm.calc.UnionOfTileEntitiesAndBooleansForGas;
import com.hbm.calc.UnionOfTileEntitiesAndBooleansForOil;
import com.hbm.entity.mob.EntityHunterChopper;
import com.hbm.entity.projectile.EntityChopperMine;
import com.hbm.interfaces.IConductor;
import com.hbm.interfaces.IConsumer;
import com.hbm.interfaces.IGasAcceptor;
import com.hbm.interfaces.IGasDuct;
import com.hbm.interfaces.IGasSource;
import com.hbm.interfaces.IOilDuct;
import com.hbm.interfaces.IOilAcceptor;
import com.hbm.interfaces.IOilSource;
import com.hbm.interfaces.ISource;
import com.hbm.items.ModItems;
import com.hbm.main.MainRegistry;
import com.hbm.tileentity.TileEntityCable;
import com.hbm.tileentity.TileEntityGasDuct;
import com.hbm.tileentity.TileEntityGasDuctSolid;
import com.hbm.tileentity.TileEntityLaunchPad;
import com.hbm.tileentity.TileEntityMachineBattery;
import com.hbm.tileentity.TileEntityMachineDeuterium;
import com.hbm.tileentity.TileEntityMachineElectricFurnace;
import com.hbm.tileentity.TileEntityOilDuct;
import com.hbm.tileentity.TileEntityOilDuctSolid;
import com.hbm.tileentity.TileEntityWireCoated;

import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Library {

	public static List<String> book1 = new ArrayList<String>();
	public static List<String> book2 = new ArrayList<String>();
	public static List<String> book3 = new ArrayList<String>();
	public static List<String> book4 = new ArrayList<String>();
	public static List<String> book5 = new ArrayList<String>();

	public static String HbMinecraft = "192af5d7-ed0f-48d8-bd89-9d41af8524f8";
	public static String LPkukin = "937c9804-e11f-4ad2-a5b1-42e62ac73077";
	public static String Dafnik = "3af1c262-61c0-4b12-a4cb-424cc3a9c8c0";
	public static String a20 = "4729b498-a81c-42fd-8acd-20d6d9f759e0";
	public static String LordVertice = "a41df45e-13d8-4677-9398-090d3882b74f";
	
	public static List<String> superuser = new ArrayList<String>();
	
	public static void initBooks() {

		book1.add("This book contains detailed information about the resources in Hbm's Nuclear Tech Mod. Some can be found underground, some have to be processed in special machines before becoming useful.");
		book1.add("Uranium\nRare metal which spawns below Y:25. Impure uranium which is not useful by itself. Can be crafted into uranium hexafluoride, which can be seperated by the centrifuge.");
		book1.add("Uranium 235\nRare uranium isotope obtained from processing uranium hexafluoride in the centrifuge. This isotope is fissile, it can be used for reactor fuel and bombs. Np237 can be bred from U235.");
		book1.add("Uranium 238\nVery abundant isotope which is not as useful as it's fissile counterpart. Used in reactor fuel and for breeding fissile Pu239.");
		book1.add("Plutonium\nTransuranic element which cannot be found underground. It can be found in the nether (config option required) or bred from impure uranium.");
		book1.add("Plutonium 238\nAlpha emitter that can be bred from Np237, useful for making RTG pellets which is needed for the RTG furnace.");
		book1.add("Plutonium 239\nFissile plutonium isotope that can be crafted into reactor fuel. Implosion-type nukes also need this isotope.");
		book1.add("Plutonium 240\nIsotope with a high spontaneous fission rate. Not very useful.");
		book1.add("Neptunium\nNeptunium 237 can only be obtained by breeding U235. Other than being crucial for Pu238 production, it doesn't have many uses.");
		book1.add("Titanium\nTough metal which can be found underground below Y:35. Titanium is important for crafting machines and stong tools.");
		book1.add("Copper\nMetal found below Y:50. Very important metal for machines, mostly used for alloys.");
		book1.add("Minecraft Grade Copper\nMinecraft Grade Copper (or red copper) is used for all machines that use electricity. Every conductor is made from red copper.");
		book1.add("Advanced Alloy\nAlloy made from red copper and steel. Very tough, used for super conductors, late game machines and heavy duty tools.");
		book1.add("Tungsten\nFound below Y:35 or in the nether, needed for heating elements, neutron reflectors and late game alloys.");
		book1.add("Aluminium\nSoft metal found below Y:45. Can be used to craft shells and canisters.");
		book1.add("Steel\nAlloy made from coal and iron. Almost everything needs steel, shells, frames, machines, tools, etc.");
		book1.add("Lead\n.Found below Y:35. Used for nuclear reactors, hazmat equpiment and bullets.");
		book1.add("Beryllium\n.Brittle metal found below Y:35, used for deco elements and atom bombs.");
		book1.add("Schrabidium\n.Weird. Can be created using the schrabidium transmutation device or by setting off nukes near uranium ore. Can be crafted into extremely powerful equipment and machines.");
		book1.add("Magnetized Tungsten\nTungsten with traces of schrabidium. Strong super conductor which withstands very high temparatures. Used for 4000K magnets and calculation matrices.");
		book1.add("Lithium\nCan be extracted from quartz using the centrifuge, used for breeding tritium.");
		book1.add("Sulfur\nDust found underground below Y:35. Useful for matchsticks, deuterium production and crafting gunpowder.");
		book1.add("Niter\nDust found below Y:35. Can be used to craft gunpowder and det cord.");
		book1.add("Fluorite\nCan be found below Y:40. Only used for crafting uranium and plutonium hexafluoride.");
		book1.add("Uranium Hexafluoride\nCan be seperated in the centrifuge. Storable in the UF6 tank.");
		book1.add("Plutonium Hexafluoride\nCan be seperated in the centrifuge. Storable in the PuF6 tank.");

		book2.add("This book contains detailed information about the machines in Hbm's Nuclear Tech Mod. Most machines use electricity in the form of HE.");
		book2.add("Alloy Furnace\nType: Processor\nUses fuels like redstone, coal and netherrack to combine two items. Accepts RTG pellets.");
		book2.add("Centrifuge\nType: Processor\nUses the same fuels as the alloy furnace to seperate an imput to up to four outputs. Used for uranium enrichment.");
		book2.add("Hexafluoride Tanks\nType: Storage\nComes in two different variations, for uranium and plutonium.");
		book2.add("Breeding Reactor\nType: Processor\nUses nuclear rods as fuel to breed other rods. Used to process isotopes.");
		book2.add("Nuclear Furnace\nType: Processor\nUses nuclear rods as fuel to smelt items like a normal furnace does, but much faster.");
		book2.add("RTG-Furnace\nType: Processor\nUtilizes three plutonium 238 pellets which never run out to smelt items very fast.");
		book2.add("Coal Generator\nType: Generator\nUses coal and water in order to create little amounts of HE.");
		book2.add("Diesel Generator\nType: Generator\nUses diesel fuel to create HE, does not need water in order to run.");
		book2.add("Small Nuclear Reactor\nType: Generator\nUses reactor fuel, water and coolant to generate HE, the reactor explodes when it overheats.");
		book2.add("Red Copper Cable\nType: Conductor\nConnects to other cables and machines, transfers HE.");
		book2.add("Coated Red Copper Cable\nType: Conductor\nFull block conductors which are more resistant than normal cables.");
		book2.add("Energy Storage Block\nType: Storage\nStores energy when connected to a power source, releases it if it's powered with a redstone signal.");
		book2.add("HE to RF Converter\nType: Power Converter\nCollects HE and converts it to RF, which can be used by machines from other mods which are RF compatible.");
		book2.add("RF to HE Converter\nType: Power Converter\nCollects RF and converts it to HE.");
		book2.add("Electric Furnace\nType: Processor\nNeeds HE in order to smelt items much faster than a normal furnace.");
		book2.add("Shredder\nType: Processor\nNeeds HE and two blades in order to run. Ingots and ores are turned into dust, other blocks get processed into scrap. Useful to make fuel out of junk.");
		book2.add("Deuterium Extractor\nType: Processor\nNeeds HE, water and sulfur in order to extract deuterium out of the water. Sulfur is used up slower than water.");
		book2.add("Schrabidium Transmutation Device\nType: Processor\nWith 500 million HE, a special capacitor and uranium, this machine creates schrabidium ingots.");
		book2.add("CMB Steel Factory\nType: Processor\nCombines magnetized tungsten, advanced alloy and poisonous mud into CMB steel.");
		book2.add("Basic Factory\nType: Processor\nLarge furnace with in- and output queue that smelts two items at a time. Needs a specific energy core to run, though it also accepts external energy if it has an electricity port.");
		book2.add("Advanced Factory\nType: Processor\nThis factory smelts four items at a time, twice as fast, making it four times better than the basic factory.");
		book2.add("Large Nuclear Reactor\nType: Generator\nA much larger version of the nuclear reactor which works similarly, but needs a fuse to run. The optional concrete coating will prevent radiation from leaking out.");
		book2.add("Fusion Reactor\nType: Generator\nA very large reactor which fuses deuterium and tritium to create power. It needs startup energy in form of four energy cores (and or fusion cores) and a fuse.");
		book2.add("Watz Power Plant\nType: Generator\nA special fission reactor whcih needs a titanium filter and fuel pellets to run. Pellets have different modifiers changing lifetime and efficiency of all other components. Mind the waste.");
		book2.add("Fusionary Watz Plant\nType: Generator\nThe strongest reactor which fuses antimatter with antischrabidium with the help of a singularity. Different singularities have different effects. Beware the screwdriver.");

		book3.add("This book contains detailed information about the explosives in Hbm's Nuclear Tech Mod. All explosives can also be used with the detonator.");
		book3.add("The Gadget\nType: Nuke\nStrength: " + MainRegistry.gadgetRadius + "\nItems required: 4x bundled propellant, 1x Gadget plutonium core, 1x Wiring");
		book3.add("Little Boy\nType: Nuke\nStrength: " + MainRegistry.boyRadius + "\nItems required: 1x neutron shielding, 1x U235 target, 1x U235 bullet, 1x Little Boy propellant, 1x Little Boy igniter");
		book3.add("Fat Man\nType: Nuke\nStrength: " + MainRegistry.manRadius + "\nItems required: 4x bundled propellant, 1x Fat Man plutonium core, 1x Fatman fuse");
		book3.add("Ivy Mike\nType: H-Bomb\nStrength (nuke): " + MainRegistry.manRadius + "\nStrength (h-bomb): " + MainRegistry.mikeRadius + "\nItems required: 4x bundled propellant, 1x Fat Man plutonium core\nOptional: 1x deuterium supercooler, 1x uranium covered deuterium tank, 1x deuterium tank");
		book3.add("Tsar Bomba\nType: H-Bomb\nStrength (nuke): " + MainRegistry.manRadius + "\nStrength (h-bomb): " + MainRegistry.tsarRadius + "\nItems required: 4x bundled propellant, 1x Fat Man plutonium core\nOptional: Tsar Bomba core");
		book3.add("The Prototype\nType: Schrabidium-Bomb\nStrength:" + MainRegistry.prototypeRadius + "\nItems required: 4x schrabidium-trisulfide, 4x uranium quad rod, 4x lead quad rod, 2x neptunium quad rod");
		book3.add("F.L.E.I.J.A.\nType: Schrabidium-Bomb\nStrength:" + MainRegistry.fleijaRadius + "\nItems required: 2x pulse igniter, 3x schrabidium propellant, 6x F.L.E.I.J.A. uranium charge");
		book3.add("Multi Purpose Bomb\nType: Generic\nStrength: Variable\nNeeds four blocks of TNT in the marked slots, special items can be added in the right two slots. Equal items have their own icon, unequal items show a ?-icon, though they still work together.");
		book3.add("Multi Purpose Bomb (cont.)\nGunpowder: +1 explosion strength, TNT: +4 explosion strength, explosive pellets: +50 bomblets, fire powder: +10 fire radius, poison powder: +15 poison radius, gas cartridge: +15 gas radius");
		book3.add("Dud\nType: ???\nStrength:" + MainRegistry.fatmanRadius + "\nUncraftable, right-click with empty cells to extract antimatter. Can explode via detonator.");
		book3.add("Flame War in a Box\nType: Box\nSpawns random explosions, sets everything on fire.");
		book3.add("Levitation Bomb\nRadius: 15\nHeight: 50\nLifts all blocks and entites caught in it's area of effect.");
		book3.add("Endothermic Bomb\nRadius: 15\nTurns blocks into ice, freezes entities solid.");
		book3.add("Exothermic Bomb\nRadius: 15\nBurns/melts blocks, sets all entities on fire.");
		book3.add("Explosive Barrel\nType: Barrel\nExplodes when shot/set on fire.");
		book3.add("Radioactive Barrel\nType: Barrel\nOnly set off by explosions, contaminates area.");
		
		book4.add("This book contains detailed information about the missiles in Hbm's Nuclear Tech Mod. All missiles are launched from the launch pad, the coordinates are set using the short range target designator.");
		book4.add("HE Missiles\nNormal missile which explodes on impact.\nSmall: 10\nMedium: 25\nLarge: 50 x 5");
		book4.add("Incendiary Missiles\nSpecial missile which explodes and sets the surrounding area on fire.\nSmall: 10 + F\nMedium: 25 + F\nLarge: 35 + F");
		book4.add("Cluster Missiles\nMissile which explodes mid-air and releases small bomblets.\nSmall: 5 + 25B\nMedium: 15 + 50B\nLarge: 25 + 100B");
		book4.add("Bunker Buster\nMissile which creates vertical explosions.\nSmall: 5 x 15\nMedium: 7.5 x 20\nLarge: 10 x 30B");
		book4.add("Thermal Missiles\nEndo or exothermic, area of effect is twice as large as for their stationary counterparts.");
		book4.add("Nuclear Missile\nLarge missile equipped with a nuclear warhead.\nRadius: " + MainRegistry.missileRadius);
		book4.add("Nuclear MIRV\nCrossbreed of a nuclear missile and a cluster missile...splits into eight smaller nukes.\nRadius per MIRV: " + MainRegistry.mirvRadius);

		book5.add("This book contains detailed information about the miscellaneous items in Hbm's Nuclear Tech Mod. All missiles are launched from the launch pad, the coordinates are set using the short range target designator.");
		book5.add("Revolvers\nThese guns come in different variants, each one has it's own ammo. Charge them like a bow for half a second and release to shoot.");
		book5.add("Rocket Launcher\nWorks much like a revolver, but it needs to be completely charged up to fire. Shoots explosive rockets instead of bullets. Duh.");
		book5.add("M42 Nuclear Catapult\nIs basically just an RPG. That shoots nukes. In an arch. Which kill everybody. Full stop.");
		book5.add("Waffle of Mass Destruction\nEat & explode.");
		book5.add("Vegan Schnitzel\nEat & die.");
		book5.add("Radioactive Cotton Candy\nEat & enjoy.");
		book5.add("Schrabidium Apples\nGives you an epic bizeps in 1.2 seconds.");
		book5.add("Tem Flakes\nfood of tem. com in 3 flavurs, on sale, nurmal & PREMIUM!!! (expensiv) heals 2HP. construction paper.");
		book5.add("Oversugared Unhealthy Beverages\nHalf of them taste like urine, all of them are unhealthy.");
		book5.add("Grenades\nMany different types with effects, do not use the schrabidium/drill ones.");
		book5.add("Detonator\nRight click a block to set the position, shift-right click to detonate.");
		book5.add("Supply Drop Requester\nRight click to call in a supply drop, has five uses in survival mode.");
		book5.add("Magazines\nRight click to retrieve ammo for a specific gun.");
		book5.add("Syringes\nRight click to inject the syringe's content, hit somebody else to give them the effects.");
		book5.add("");
		book5.add("");
		book5.add("");
		book5.add("Coincidences are less likely than most people believe, don't you think? Look at things twice. Try imagining what the creators and inventors were thinking. All things happen for a reason, tough sometimes they are not as clear. \n\nPPPPPPP");
	}
	
	public static boolean checkArmor(EntityPlayer player, Item helmet, Item plate, Item legs, Item boots) {
		
		if(player.inventory.armorInventory[0] != null && 
				player.inventory.armorInventory[0].getItem() == boots && 
				player.inventory.armorInventory[1] != null && 
				player.inventory.armorInventory[1].getItem() == legs && 
				player.inventory.armorInventory[2] != null && 
				player.inventory.armorInventory[2].getItem() == plate && 
				player.inventory.armorInventory[3] != null && 
				player.inventory.armorInventory[3].getItem() == helmet)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean checkArmorPiece(EntityPlayer player, Item armor, int slot)
	{
		if(player.inventory.armorInventory[slot] != null &&
				player.inventory.armorInventory[slot].getItem() == armor) 
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean checkArmorNull(EntityPlayer player, int slot)
	{
		if(player.inventory.armorInventory[slot] == null) 
		{
			return true;
		}
		
		return false;
	}
	
	public static void damageSuit(EntityPlayer player, int slot) {
		
		int j = player.inventory.armorInventory[slot].getItemDamage();
		player.inventory.armorInventory[slot].setItemDamage(j += 1);

		if(player.inventory.armorInventory[slot].getItemDamage() == player.inventory.armorInventory[slot].getMaxDamage())
		{
			player.inventory.armorInventory[slot] = null;
		}
	}
	
	public static boolean checkForHazmat(EntityPlayer player) {
		
		if(checkArmor(player, ModItems.hazmat_helmet, ModItems.hazmat_plate, ModItems.hazmat_legs, ModItems.hazmat_boots) || 
				checkArmor(player, ModItems.t45_helmet, ModItems.t45_plate, ModItems.t45_legs, ModItems.t45_boots) || 
				checkArmor(player, ModItems.euphemium_helmet, ModItems.euphemium_plate, ModItems.euphemium_legs, ModItems.euphemium_boots) || 
				checkArmor(player, ModItems.hazmat_paa_helmet, ModItems.hazmat_paa_plate, ModItems.hazmat_paa_legs, ModItems.hazmat_paa_boots))
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean checkForAsbestos(EntityPlayer player) {
		
		if(checkArmor(player, ModItems.asbestos_helmet, ModItems.asbestos_plate, ModItems.asbestos_legs, ModItems.asbestos_boots))
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean checkForGasMask(EntityPlayer player) {

		if(checkArmorPiece(player, ModItems.hazmat_helmet, 3))
		{
			return true;
		}
		if(checkArmorPiece(player, ModItems.hazmat_paa_helmet, 3))
		{
			return true;
		}
		if(checkArmorPiece(player, ModItems.gas_mask, 3))
		{
			return true;
		}
		if(checkArmorPiece(player, ModItems.t45_helmet, 3))
		{
			return true;
		}
		if(checkArmorPiece(player, ModItems.schrabidium_helmet, 3))
		{
			return true;
		}
		if(checkArmorPiece(player, ModItems.euphemium_helmet, 3))
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean checkCableConnectables(World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if((tileentity != null && (tileentity instanceof IConductor ||
				tileentity instanceof IConsumer ||
				tileentity instanceof ISource)) ||
				world.getBlock(x, y, z) == ModBlocks.fusion_center ||
				world.getBlock(x, y, z) == ModBlocks.reactor_conductor ||
				world.getBlock(x, y, z) == ModBlocks.factory_titanium_conductor ||
				world.getBlock(x, y, z) == ModBlocks.factory_advanced_conductor ||
				world.getBlock(x, y, z) == ModBlocks.watz_conductor ||
				world.getBlock(x, y, z) == ModBlocks.fwatz_hatch ||
				world.getBlock(x, y, z) == ModBlocks.dummy_port_igenerator ||
				world.getBlock(x, y, z) == ModBlocks.dummy_port_cyclotron ||
				world.getBlock(x, y, z) == ModBlocks.dummy_port_well ||
				world.getBlock(x, y, z) == ModBlocks.dummy_port_flare)
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkOilConnectables(World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if((tileentity != null && tileentity instanceof IOilDuct) || 
				world.getBlock(x, y, z) == ModBlocks.dummy_port_well ||
				world.getBlock(x, y, z) == ModBlocks.machine_refinery)
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkGasConnectables(World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if((tileentity != null && tileentity instanceof IGasDuct) || 
				world.getBlock(x, y, z) == ModBlocks.dummy_port_well ||
				world.getBlock(x, y, z) == ModBlocks.dummy_port_flare)
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkUnionList(List<UnionOfTileEntitiesAndBooleans> list, ISource that) {
		
		for(UnionOfTileEntitiesAndBooleans union : list)
		{
			if(union.source == that)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkOilUnionListForOil(List<UnionOfTileEntitiesAndBooleansForOil> list, IOilSource that) {
		
		for(UnionOfTileEntitiesAndBooleansForOil union : list)
		{
			if(union.source == that)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkGasUnionListForGas(List<UnionOfTileEntitiesAndBooleansForGas> list, IGasSource that) {
		
		for(UnionOfTileEntitiesAndBooleansForGas union : list)
		{
			if(union.source == that)
			{
				return true;
			}
		}
		
		return false;
	}
	
	//////  //////  //////  //////  //////  ////        //////  //////  //////
	//      //  //  //        //    //      //  //      //      //      //    
	////    //////  /////     //    ////    ////        ////    //  //  //  //
	//      //  //     //     //    //      //  //      //      //  //  //  //
	//////  //  //  /////     //    //////  //  //      //////  //////  //////

	public static EntityLivingBase getClosestEntityForChopper(World world, double x, double y, double z, double radius) {
		double d4 = -1.0D;
		EntityLivingBase entityplayer = null;

		for (int i = 0; i < world.loadedEntityList.size(); ++i) {
			if (world.loadedEntityList.get(i) instanceof EntityLivingBase && !(world.loadedEntityList.get(i) instanceof EntityHunterChopper)) {
				EntityLivingBase entityplayer1 = (EntityLivingBase) world.loadedEntityList.get(i);

				if (entityplayer1.isEntityAlive() && !(entityplayer1 instanceof EntityPlayer && ((EntityPlayer)entityplayer1).capabilities.disableDamage)) {
					double d5 = entityplayer1.getDistanceSq(x, y, z);
					double d6 = radius;

					if (entityplayer1.isSneaking()) {
						d6 = radius * 0.800000011920929D;
					}

					if ((radius < 0.0D || d5 < d6 * d6) && (d4 == -1.0D || d5 < d4)) {
						d4 = d5;
						entityplayer = entityplayer1;
					}
				}
			}
		}

		return entityplayer;
	}

	public static Item getItemByCode(int i) {
		
		if(i == 1337)
			return ModItems.schrabidium_hammer;
		if(i == 234)
			return ModItems.euphemium_kit;
		if(i == 69)
			return ModItems.nuke_advanced_kit;
		if(i == 34)
			return ModItems.t45_kit;
		
		return null;
	}

	public static EntityPlayer getClosestPlayerForSound(World world, double x, double y, double z, double radius) {
		double d4 = -1.0D;
		EntityPlayer entity = null;

		for (int i = 0; i < world.loadedEntityList.size(); ++i) {
				Entity entityplayer1 = (Entity)world.loadedEntityList.get(i);

				if (entityplayer1.isEntityAlive() && entityplayer1 instanceof EntityPlayer) {
					double d5 = entityplayer1.getDistanceSq(x, y, z);
					double d6 = radius;

					if ((radius < 0.0D || d5 < d6 * d6) && (d4 == -1.0D || d5 < d4)) {
						d4 = d5;
						entity = (EntityPlayer)entityplayer1;
					}
			}
		}

		return entity;
	}

	public static EntityHunterChopper getClosestChopperForSound(World world, double x, double y, double z, double radius) {
		double d4 = -1.0D;
		EntityHunterChopper entity = null;

		for (int i = 0; i < world.loadedEntityList.size(); ++i) {
				Entity entityplayer1 = (Entity)world.loadedEntityList.get(i);

				if (entityplayer1.isEntityAlive() && entityplayer1 instanceof EntityHunterChopper) {
					double d5 = entityplayer1.getDistanceSq(x, y, z);
					double d6 = radius;

					if ((radius < 0.0D || d5 < d6 * d6) && (d4 == -1.0D || d5 < d4)) {
						d4 = d5;
						entity = (EntityHunterChopper)entityplayer1;
					}
			}
		}

		return entity;
	}

	public static EntityChopperMine getClosestMineForSound(World world, double x, double y, double z, double radius) {
		double d4 = -1.0D;
		EntityChopperMine entity = null;

		for (int i = 0; i < world.loadedEntityList.size(); ++i) {
				Entity entityplayer1 = (Entity)world.loadedEntityList.get(i);

				if (entityplayer1.isEntityAlive() && entityplayer1 instanceof EntityChopperMine) {
					double d5 = entityplayer1.getDistanceSq(x, y, z);
					double d6 = radius;

					if ((radius < 0.0D || d5 < d6 * d6) && (d4 == -1.0D || d5 < d4)) {
						d4 = d5;
						entity = (EntityChopperMine)entityplayer1;
					}
			}
		}

		return entity;
	}
	
	public static MovingObjectPosition rayTrace(EntityPlayer player, double d, float f) {
        Vec3 vec3 = getPosition(f, player);
        vec3.yCoord += player.eyeHeight;
        Vec3 vec31 = player.getLook(f);
        Vec3 vec32 = vec3.addVector(vec31.xCoord * d, vec31.yCoord * d, vec31.zCoord * d);
        return player.worldObj.func_147447_a(vec3, vec32, false, false, true);
	}
	
    public static Vec3 getPosition(float par1, EntityPlayer player) {
        if (par1 == 1.0F)
        {
            return Vec3.createVectorHelper(player.posX, player.posY + (player.getEyeHeight() - player.getDefaultEyeHeight()), player.posZ);
        }
        else
        {
            double d0 = player.prevPosX + (player.posX - player.prevPosX) * (double)par1;
            double d1 = player.prevPosY + (player.posY - player.prevPosY) * (double)par1 + (player.getEyeHeight() - player.getDefaultEyeHeight());
            double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double)par1;
            return Vec3.createVectorHelper(d0, d1, d2);
        }
    }
	
	public static List<int[]> getBlockPosInPath(int x, int y, int z, int length, Vec3 vec0) {
		List<int[]> list = new ArrayList<int[]>();
		
		for(int i = 0; i <= length; i++) {
			list.add(new int[] { (int)(x + (vec0.xCoord * i)), y, (int)(z + (vec0.zCoord * i)), i });
		}
		
		return list;
	}
	
	public static int chargeItemsFromTE(ItemStack[] slots, int index, int power, int maxPower) {
		
		if(power - 100 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.battery_generic && slots[index].getItemDamage() > 0)
		{
			power -= 100;
			slots[index].setItemDamage(slots[index].getItemDamage() - 1);
		}
		
		for(int i = 0; i < 5; i++)
			if(power - 100 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.battery_advanced && slots[index].getItemDamage() > 0)
			{
				power -= 100;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 15; i++)
			if(power - 100 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.battery_schrabidium && slots[index].getItemDamage() > 0)
			{
				power -= 100;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 10; i++)
			if(power - 100 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.factory_core_titanium && slots[index].getItemDamage() > 0)
			{
				power -= 100;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 10; i++)
			if(power - 100 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.factory_core_advanced && slots[index].getItemDamage() > 0)
			{
				power -= 100;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 50; i++)
			if(power - 1 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.elec_sword && slots[index].getItemDamage() > 0)
			{
				power -= 1;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 50; i++)
			if(power - 1 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.elec_pickaxe && slots[index].getItemDamage() > 0)
			{
				power -= 1;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 50; i++)
			if(power - 1 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.elec_axe && slots[index].getItemDamage() > 0)
			{
				power -= 1;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		for(int i = 0; i < 50; i++)
			if(power - 1 >= 0 && slots[index] != null && slots[index].getItem() == ModItems.elec_shovel && slots[index].getItemDamage() > 0)
			{
				power -= 1;
				slots[index].setItemDamage(slots[index].getItemDamage() - 1);
			} else break;
		
		return power;
	}
	
	public static int chargeTEFromItems(ItemStack[] slots, int index, int power, int maxPower) {
		
		if(slots[index] != null && slots[index].getItem() == ModItems.battery_creative)
		{
			return maxPower;
		}
		
		if(power + 100 <= maxPower && slots[index] != null && slots[index].getItem() == ModItems.battery_generic && slots[index].getItemDamage() < 50)
		{
			power += 100;
			slots[index].setItemDamage(slots[index].getItemDamage() + 1);
		}
		
		for(int i = 0; i < 5; i++)
			if(power + 100 <= maxPower && slots[index] != null && slots[index].getItem() == ModItems.battery_advanced && slots[index].getItemDamage() < 200)
			{
				power += 100;
				slots[index].setItemDamage(slots[index].getItemDamage() + 1);
			} else break;

		for(int i = 0; i < 15; i++)
			if(power + 100 <= maxPower && slots[index] != null && slots[index].getItem() == ModItems.battery_schrabidium && slots[index].getItemDamage() < 10000)
			{
				power += 100;
				slots[index].setItemDamage(slots[index].getItemDamage() + 1);
			} else break;
		
		for(int i = 0; i < 25; i++)
			if(power + 100 <= maxPower && slots[index] != null && slots[index].getItem() == ModItems.fusion_core && slots[index].getItemDamage() < 5000)
			{
				power += 100;
				slots[index].setItemDamage(slots[index].getItemDamage() + 1);
			} else break;
		
		for(int i = 0; i < 10; i++)
			if(power + 100 <= maxPower && slots[index] != null && slots[index].getItem() == ModItems.energy_core && slots[index].getItemDamage() < 5000)
			{
				power += 100;
				slots[index].setItemDamage(slots[index].getItemDamage() + 1);
			} else break;
		
		return power;
	}
	
	//Flut-Füll gesteuerter Energieübertragungsalgorithmus
	//Flood fill controlle energy transmission algorithm
	public static void ffgeua(int x, int y, int z, boolean newTact, ISource that, World worldObj) {
		Block block = worldObj.getBlock(x, y, z);
		TileEntity tileentity = worldObj.getTileEntity(x, y, z);

		if(block == ModBlocks.factory_titanium_conductor && worldObj.getBlock(x, y + 1, z) == ModBlocks.factory_titanium_core)
		{
			tileentity = worldObj.getTileEntity(x, y + 1, z);
		}
		if(block == ModBlocks.factory_titanium_conductor && worldObj.getBlock(x, y - 1, z) == ModBlocks.factory_titanium_core)
		{
			tileentity = worldObj.getTileEntity(x, y - 1, z);
		}
		if(block == ModBlocks.factory_advanced_conductor && worldObj.getBlock(x, y + 1, z) == ModBlocks.factory_advanced_core)
		{
			tileentity = worldObj.getTileEntity(x, y + 1, z);
		}
		if(block == ModBlocks.factory_advanced_conductor && worldObj.getBlock(x, y - 1, z) == ModBlocks.factory_advanced_core)
		{
			tileentity = worldObj.getTileEntity(x, y - 1, z);
		}
		if(block == ModBlocks.dummy_port_well && worldObj.getBlock(x + 1, y, z) == ModBlocks.machine_well)
		{
			tileentity = worldObj.getTileEntity(x + 1, y, z);
		}
		if(block == ModBlocks.dummy_port_well && worldObj.getBlock(x - 1, y, z) == ModBlocks.machine_well)
		{
			tileentity = worldObj.getTileEntity(x - 1, y, z);
		}
		if(block == ModBlocks.dummy_port_well && worldObj.getBlock(x, y, z + 1) == ModBlocks.machine_well)
		{
			tileentity = worldObj.getTileEntity(x, y, z + 1);
		}
		if(block == ModBlocks.dummy_port_well && worldObj.getBlock(x, y, z - 1) == ModBlocks.machine_well)
		{
			tileentity = worldObj.getTileEntity(x, y, z - 1);
		}
		
		if(tileentity instanceof IConductor)
		{
			if(tileentity instanceof TileEntityCable)
			{
				if(Library.checkUnionList(((TileEntityCable)tileentity).uoteab, that))
				{
					for(int i = 0; i < ((TileEntityCable)tileentity).uoteab.size(); i++)
					{
						if(((TileEntityCable)tileentity).uoteab.get(i).source == that)
						{
							if(((TileEntityCable)tileentity).uoteab.get(i).ticked != newTact)
							{
								((TileEntityCable)tileentity).uoteab.get(i).ticked = newTact;
								that.ffgeua(x, y + 1, z, that.getTact());
								that.ffgeua(x, y - 1, z, that.getTact());
								that.ffgeua(x - 1, y, z, that.getTact());
								that.ffgeua(x + 1, y, z, that.getTact());
								that.ffgeua(x, y, z - 1, that.getTact());
								that.ffgeua(x, y, z + 1, that.getTact());
							}
						}
					}
				} else {
					((TileEntityCable)tileentity).uoteab.add(new UnionOfTileEntitiesAndBooleans(that, newTact));
				}
			}
			if(tileentity instanceof TileEntityWireCoated)
			{
				if(Library.checkUnionList(((TileEntityWireCoated)tileentity).uoteab, that))
				{
					for(int i = 0; i < ((TileEntityWireCoated)tileentity).uoteab.size(); i++)
					{
						if(((TileEntityWireCoated)tileentity).uoteab.get(i).source == that)
						{
							if(((TileEntityWireCoated)tileentity).uoteab.get(i).ticked != newTact)
							{
								((TileEntityWireCoated)tileentity).uoteab.get(i).ticked = newTact;
								that.ffgeua(x, y + 1, z, that.getTact());
								that.ffgeua(x, y - 1, z, that.getTact());
								that.ffgeua(x - 1, y, z, that.getTact());
								that.ffgeua(x + 1, y, z, that.getTact());
								that.ffgeua(x, y, z - 1, that.getTact());
								that.ffgeua(x, y, z + 1, that.getTact());
							}
						}
					}
				} else {
					((TileEntityWireCoated)tileentity).uoteab.add(new UnionOfTileEntitiesAndBooleans(that, newTact));
				}
			}
		}
		
		if(tileentity instanceof IConsumer && newTact && !(tileentity instanceof TileEntityMachineBattery && ((TileEntityMachineBattery)tileentity).conducts))
		{
			that.getList().add((IConsumer)tileentity);
		}
		
		if(!newTact)
		{
			int size = that.getList().size();
			if(size > 0)
			{
				int part = that.getSPower() / size;
				for(IConsumer consume : that.getList())
				{
					if(consume.getPower() < consume.getMaxPower())
					{
						if(consume.getMaxPower() - consume.getPower() >= part)
						{
							that.setSPower(that.getSPower()-part);
							consume.setPower(consume.getPower() + part);
						} else {
							that.setSPower(that.getSPower() - (consume.getMaxPower() - consume.getPower()));
							consume.setPower(consume.getMaxPower());
						}
					}
				}
			}
			that.clearList();
		}
	}
	
	public static void transmitOil(int x, int y, int z, boolean newTact, IOilSource that, World worldObj) {
		Block block = worldObj.getBlock(x, y, z);
		TileEntity tileentity = worldObj.getTileEntity(x, y, z);
		
		if(tileentity instanceof IOilDuct)
		{
			if(tileentity instanceof TileEntityOilDuct)
			{
				if(Library.checkOilUnionListForOil(((TileEntityOilDuct)tileentity).uoteab, that))
				{
					for(int i = 0; i < ((TileEntityOilDuct)tileentity).uoteab.size(); i++)
					{
						if(((TileEntityOilDuct)tileentity).uoteab.get(i).source == that)
						{
							if(((TileEntityOilDuct)tileentity).uoteab.get(i).ticked != newTact)
							{
								((TileEntityOilDuct)tileentity).uoteab.get(i).ticked = newTact;
								that.fill(x, y + 1, z, that.getTact());
								that.fill(x, y - 1, z, that.getTact());
								that.fill(x - 1, y, z, that.getTact());
								that.fill(x + 1, y, z, that.getTact());
								that.fill(x, y, z - 1, that.getTact());
								that.fill(x, y, z + 1, that.getTact());
							}
						}
					}
				} else {
					((TileEntityOilDuct)tileentity).uoteab.add(new UnionOfTileEntitiesAndBooleansForOil(that, newTact));
				}
			}
			if(tileentity instanceof TileEntityOilDuctSolid)
			{
				if(Library.checkOilUnionListForOil(((TileEntityOilDuctSolid)tileentity).uoteab, that))
				{
					for(int i = 0; i < ((TileEntityOilDuctSolid)tileentity).uoteab.size(); i++)
					{
						if(((TileEntityOilDuctSolid)tileentity).uoteab.get(i).source == that)
						{
							if(((TileEntityOilDuctSolid)tileentity).uoteab.get(i).ticked != newTact)
							{
								((TileEntityOilDuctSolid)tileentity).uoteab.get(i).ticked = newTact;
								that.fill(x, y + 1, z, that.getTact());
								that.fill(x, y - 1, z, that.getTact());
								that.fill(x - 1, y, z, that.getTact());
								that.fill(x + 1, y, z, that.getTact());
								that.fill(x, y, z - 1, that.getTact());
								that.fill(x, y, z + 1, that.getTact());
							}
						}
					}
				} else {
					((TileEntityOilDuctSolid)tileentity).uoteab.add(new UnionOfTileEntitiesAndBooleansForOil(that, newTact));
				}
			}
		}
		
		if(tileentity instanceof IOilAcceptor && newTact)
		{
			that.getList().add((IOilAcceptor)tileentity);
		}
		
		if(!newTact)
		{
			int size = that.getList().size();
			if(size > 0)
			{
				int part = that.getSFill() / size;
				for(IOilAcceptor consume : that.getList())
				{
					if(consume.getFill() < consume.getMaxFill())
					{
						if(consume.getMaxFill() - consume.getFill() >= part)
						{
							that.setSFill(that.getSFill()-part);
							consume.setFill(consume.getFill() + part);
						} else {
							that.setSFill(that.getSFill() - (consume.getMaxFill() - consume.getFill()));
							consume.setFill(consume.getMaxFill());
						}
					}
				}
			}
			that.clearList();
		}
	}
	
	public static void transmitGas(int x, int y, int z, boolean newTact, IGasSource that, World worldObj) {
		Block block = worldObj.getBlock(x, y, z);
		TileEntity tileentity = worldObj.getTileEntity(x, y, z);
		
		if(block == ModBlocks.dummy_port_flare && worldObj.getBlock(x + 1, y, z) == ModBlocks.machine_flare)
		{
			tileentity = worldObj.getTileEntity(x + 1, y, z);
		}
		if(block == ModBlocks.dummy_port_flare && worldObj.getBlock(x - 1, y, z) == ModBlocks.machine_flare)
		{
			tileentity = worldObj.getTileEntity(x - 1, y, z);
		}
		if(block == ModBlocks.dummy_port_flare && worldObj.getBlock(x, y, z + 1) == ModBlocks.machine_flare)
		{
			tileentity = worldObj.getTileEntity(x, y, z + 1);
		}
		if(block == ModBlocks.dummy_port_flare && worldObj.getBlock(x, y, z - 1) == ModBlocks.machine_flare)
		{
			tileentity = worldObj.getTileEntity(x, y, z - 1);
		}
		
		if(tileentity instanceof IGasDuct)
		{
			if(tileentity instanceof TileEntityGasDuct)
			{
				if(Library.checkGasUnionListForGas(((TileEntityGasDuct)tileentity).uoteab, that))
				{
					for(int i = 0; i < ((TileEntityGasDuct)tileentity).uoteab.size(); i++)
					{
						if(((TileEntityGasDuct)tileentity).uoteab.get(i).source == that)
						{
							if(((TileEntityGasDuct)tileentity).uoteab.get(i).ticked != newTact)
							{
								((TileEntityGasDuct)tileentity).uoteab.get(i).ticked = newTact;
								that.fillGas(x, y + 1, z, that.getTact());
								that.fillGas(x, y - 1, z, that.getTact());
								that.fillGas(x - 1, y, z, that.getTact());
								that.fillGas(x + 1, y, z, that.getTact());
								that.fillGas(x, y, z - 1, that.getTact());
								that.fillGas(x, y, z + 1, that.getTact());
							}
						}
					}
				} else {
					((TileEntityGasDuct)tileentity).uoteab.add(new UnionOfTileEntitiesAndBooleansForGas(that, newTact));
				}
			}
			if(tileentity instanceof TileEntityGasDuctSolid)
			{
				if(Library.checkGasUnionListForGas(((TileEntityGasDuctSolid)tileentity).uoteab, that))
				{
					for(int i = 0; i < ((TileEntityGasDuctSolid)tileentity).uoteab.size(); i++)
					{
						if(((TileEntityGasDuctSolid)tileentity).uoteab.get(i).source == that)
						{
							if(((TileEntityGasDuctSolid)tileentity).uoteab.get(i).ticked != newTact)
							{
								((TileEntityGasDuctSolid)tileentity).uoteab.get(i).ticked = newTact;
								that.fillGas(x, y + 1, z, that.getTact());
								that.fillGas(x, y - 1, z, that.getTact());
								that.fillGas(x - 1, y, z, that.getTact());
								that.fillGas(x + 1, y, z, that.getTact());
								that.fillGas(x, y, z - 1, that.getTact());
								that.fillGas(x, y, z + 1, that.getTact());
							}
						}
					}
				} else {
					((TileEntityGasDuctSolid)tileentity).uoteab.add(new UnionOfTileEntitiesAndBooleansForGas(that, newTact));
				}
			}
		}
		
		if(tileentity instanceof IGasAcceptor && newTact)
		{
			that.getGasList().add((IGasAcceptor)tileentity);
		}
		
		if(!newTact)
		{
			int size = that.getGasList().size();
			if(size > 0)
			{
				int part = that.getGasFill() / size;
				for(IGasAcceptor consume : that.getGasList())
				{
					if(consume.getGasFill() < consume.getMaxGasFill())
					{
						if(consume.getMaxGasFill() - consume.getGasFill() >= part)
						{
							that.setGasFill(that.getGasFill()-part);
							consume.setGasFill(consume.getGasFill() + part);
						} else {
							that.setGasFill(that.getGasFill() - (consume.getMaxGasFill() - consume.getGasFill()));
							consume.setGasFill(consume.getMaxGasFill());
						}
					}
				}
			}
			that.clearGasList();
		}
	}
}
