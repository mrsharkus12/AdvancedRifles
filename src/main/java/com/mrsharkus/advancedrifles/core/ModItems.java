package com.mrcrayfish.advancedrifles.core;

import com.mrcrayfish.advancedrifles.AdvancedRiflesMod;
import com.mrcrayfish.advancedrifles.Reference;
import com.mrcrayfish.advancedrifles.util.ItemNames;
import com.mrcrayfish.guns.item.ItemAmmo;
import com.mrcrayfish.guns.item.ItemGun;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModItems
{
    private static final List<Item> ITEMS = new ArrayList<>();

    /* Create your items here */

    @GameRegistry.ObjectHolder(ItemNames.ASSAULT_RIFLE_ADVANCED)
    public static final Item ASSAULT_RIFLE_ADVANCED = null;
	
    @GameRegistry.ObjectHolder(ItemNames.SHOTGUN_AUTO)
    public static final Item SHOTGUN_AUTO = null;
	
    @GameRegistry.ObjectHolder(ItemNames.RIFLE_ADVANCED)
    public static final Item RIFLE_ADVANCED = null;

    @GameRegistry.ObjectHolder(ItemNames.REVOLVER)
    public static final Item REVOLVER = null;
	
    @GameRegistry.ObjectHolder(ItemNames.HAND_GRENADELAUNCHER)
    public static final Item HAND_GRENADELAUNCHER = null;
	
    @GameRegistry.ObjectHolder(ItemNames.DEAGLE)
    public static final Item DEAGLE = null;
	
    @GameRegistry.ObjectHolder(ItemNames.AWP)
    public static final Item AWP = null;
	
    @GameRegistry.ObjectHolder(ItemNames.CHEAPRIFLE)
    public static final Item CHEAPRIFLE = null;
	
    @GameRegistry.ObjectHolder(ItemNames.UZI)
    public static final Item UZI = null;
	
    @GameRegistry.ObjectHolder(ItemNames.GLOCK)
    public static final Item GLOCK = null;
	
    @GameRegistry.ObjectHolder(ItemNames.ASSAULT_RIFLE_MK2)
    public static final Item ASSAULT_RIFLE_MK2 = null;
	
    @GameRegistry.ObjectHolder(ItemNames.SHOTGUN_MK2)
    public static final Item SHOTGUN_MK2 = null;
	
    @GameRegistry.ObjectHolder(ItemNames.M16)
    public static final Item M16 = null;
	
    @GameRegistry.ObjectHolder(ItemNames.MP5)
    public static final Item MP5 = null;
	
    @GameRegistry.ObjectHolder(ItemNames.MP5STOCKCLOSED)
    public static final Item MP5STOCKCLOSED = null;
	
    @GameRegistry.ObjectHolder(ItemNames.GRENADE_LAUNCHER_ADVANCED)
    public static final Item GRENADE_LAUNCHER_ADVANCED = null;

    @GameRegistry.ObjectHolder(ItemNames.AUG)
    public static final Item AUG = null;

    @GameRegistry.ObjectHolder(ItemNames.REVOLVER_MK2)
    public static final Item REVOLVER_MK2 = null;

    @GameRegistry.ObjectHolder(ItemNames.SCAR)
    public static final Item SCAR = null;
	
    @GameRegistry.ObjectHolder(ItemNames.AK12)
    public static final Item AK12 = null;

    @GameRegistry.ObjectHolder(ItemNames.SHOTGUN_DOUBLEBARREL)
    public static final Item SHOTGUN_DOUBLEBARREL = null;
	
    @GameRegistry.ObjectHolder(ItemNames.SHOTGUN_SAWEDOFF)
    public static final Item SHOTGUN_SAWEDOFF = null;
	
    @GameRegistry.ObjectHolder(ItemNames.CROSSBOW)
    public static final Item CROSSBOW = null;
	
    @GameRegistry.ObjectHolder(ItemNames.CROSSBOW_DART)
    public static final ItemAmmo CROSSBOW_DART = null;
	
    @GameRegistry.ObjectHolder(ItemNames.ADVANCED_SHELL)
    public static final ItemAmmo ADVANCED_SHELL = null;
	
    @GameRegistry.ObjectHolder(ItemNames.ADVANCED_BAZOOKA)
    public static final Item ADVANCED_BAZOOKA = null;

    public static List<Item> getItems() {
        return ITEMS;
    }

    private static void register()
    {
        /* Registering custom guns. Make sure you create a new gun json for every gun.
         * See "assets/foamguns/guns/assaulter.json" for an example. The json file is where you can
         * customize the properties for each of your weapons.
         *
         * For example of gun json, see MrCrayfish's Gun Mod repo
         * https://github.com/MrCrayfish/MrCrayfishGunMod/tree/master/src/main/resources/assets/cgm/guns
         *
         * */
        ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "assault_rifle_advanced")).setCreativeTab(AdvancedRiflesMod.TAB));
        ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "shotgun_auto")).setCreativeTab(AdvancedRiflesMod.TAB));
        ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "rifle_advanced")).setCreativeTab(AdvancedRiflesMod.TAB));
        ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "revolver")).setCreativeTab(AdvancedRiflesMod.TAB));
        ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "hand_grenadelauncher")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "awp")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "deagle")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "cheaprifle")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "uzi")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "glock")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "assault_rifle_mk2")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "shotgun_mk2")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "m16")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "mp5")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "mp5stockclosed")).setCreativeTab(AdvancedRiflesMod.TAB));		
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "grenade_launcher_advanced")).setCreativeTab(AdvancedRiflesMod.TAB));	
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "aug")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "revolver_mk2")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "scar")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "ak12")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "shotgun_doublebarrel")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "shotgun_sawedoff")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "crossbow")).setCreativeTab(AdvancedRiflesMod.TAB));
		ITEMS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "advanced_bazooka")).setCreativeTab(AdvancedRiflesMod.TAB));
		
        /* Registering custom ammo. Make sure you change in your gun json to use your custom ammo if you implement one */
        ITEMS.add(new ItemAmmo(new ResourceLocation(Reference.MOD_ID, "crossbow_dart")).setCreativeTab(AdvancedRiflesMod.TAB));
        ITEMS.add(new ItemAmmo(new ResourceLocation(Reference.MOD_ID, "advanced_shell")).setCreativeTab(AdvancedRiflesMod.TAB));
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event)
    {
        ModItems.register();
        ITEMS.forEach(item -> event.getRegistry().register(item));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void register(ModelRegistryEvent event)
    {
        ITEMS.forEach(ModItems::registerRender);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
