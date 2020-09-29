package com.mrcrayfish.advancedrifles;

import com.mrcrayfish.advancedrifles.core.ModItems;
import com.mrcrayfish.advancedrifles.entity.EntityCrossbowDart;
import com.mrcrayfish.advancedrifles.entity.EntityAdvancedShell;
import com.mrcrayfish.advancedrifles.proxy.CommonProxy;
import com.mrcrayfish.guns.client.gui.DisplayProperty;
import com.mrcrayfish.guns.client.gui.GuiWorkbench;
import com.mrcrayfish.guns.common.WorkbenchRegistry;
import com.mrcrayfish.guns.item.AmmoRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/*
 * This is all you need in your mod class to create an addon.
 */

/**
 * Author: MrCrayfish
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MC_VERSION, dependencies = Reference.DEPENDENCIES)
public class AdvancedRiflesMod
{
    public static final CreativeTabs TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.ASSAULT_RIFLE_ADVANCED);
        }
    };

    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static CommonProxy proxy;
	
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "crossbow_dart"), EntityCrossbowDart.class, Reference.MOD_ID + ".crossbow_dart", 0, this, 64, 80, true);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "advanced_shell"), EntityAdvancedShell.class, Reference.MOD_ID + ".advanced_shell", 0, this, 64, 80, true);
        proxy.preInit();
    }

    /*
     * Uncomment this below if you want make your custom ammo to shoot a custom projectile. A projectile is
     * an entity, so you will need to register it as normally would for an entity.
     *
     * You can copy the registration from MrCrayfish's Gun Mod
     * https://github.com/MrCrayfish/MrCrayfishGunMod/blob/master/src/main/java/com/mrcrayfish/guns/init/ModEntities.java#L15
     *
     * The missile entity is an example of a custom projectile. You can see the example here.
     * https://github.com/MrCrayfish/MrCrayfishGunMod/blob/master/src/main/java/com/mrcrayfish/guns/entity/EntityMissile.java
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        /* Register new crafting recipes to the workbench */
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.ASSAULT_RIFLE_ADVANCED),
                new ItemStack(Items.IRON_INGOT, 35),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.SHOTGUN_AUTO),
                new ItemStack(Items.IRON_INGOT, 45),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.RIFLE_ADVANCED),
                new ItemStack(Items.IRON_INGOT, 40),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.REVOLVER),
                new ItemStack(Items.IRON_INGOT, 35),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.HAND_GRENADELAUNCHER),
                new ItemStack(Items.IRON_INGOT, 46));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.AWP),
                new ItemStack(Items.IRON_INGOT, 120),
                new ItemStack(Blocks.CONCRETE, 25, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 25, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.DEAGLE),
                new ItemStack(Items.IRON_INGOT, 65),
                new ItemStack(Blocks.CONCRETE, 10, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 10, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.CHEAPRIFLE),
				new ItemStack(Items.IRON_INGOT, 12));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.GLOCK),
                new ItemStack(Items.IRON_INGOT, 17),
                new ItemStack(Blocks.CONCRETE, 1, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.UZI),
                new ItemStack(Items.IRON_INGOT, 35),
                new ItemStack(Blocks.CONCRETE, 15, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.SHOTGUN_MK2),
                new ItemStack(Items.IRON_INGOT, 40),
                new ItemStack(Blocks.CONCRETE, 25, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.ASSAULT_RIFLE_MK2),
                new ItemStack(Items.IRON_INGOT, 20),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.M16),
                new ItemStack(Items.IRON_INGOT, 14));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.MP5),
                new ItemStack(Items.IRON_INGOT, 15),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.MP5STOCKCLOSED),
                new ItemStack(Items.IRON_INGOT, 15),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.GRENADE_LAUNCHER_ADVANCED),
                new ItemStack(Items.IRON_INGOT, 35),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.AUG),
                new ItemStack(Items.IRON_INGOT, 35),
                new ItemStack(Blocks.CONCRETE, 25, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.REVOLVER_MK2),
                new ItemStack(Items.IRON_INGOT, 40),
                new ItemStack(Blocks.CONCRETE, 10, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 10, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.SCAR),
                new ItemStack(Items.IRON_INGOT, 35),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 25, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.SCAR),
                new ItemStack(Items.IRON_INGOT, 25),
                new ItemStack(Blocks.CONCRETE, 10, EnumDyeColor.GRAY.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 15, EnumDyeColor.SILVER.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.SHOTGUN_DOUBLEBARREL),
                new ItemStack(Items.IRON_INGOT, 25),
                new ItemStack(Blocks.CONCRETE, 10, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.SHOTGUN_SAWEDOFF),
                new ItemStack(Items.IRON_INGOT, 15),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.CROSSBOW),
                new ItemStack(Items.IRON_INGOT, 25),
                new ItemStack(Blocks.CONCRETE, 2, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.CROSSBOW_DART, 32),
                new ItemStack(Items.IRON_INGOT, 5),
                new ItemStack(Blocks.CONCRETE, 1, EnumDyeColor.GRAY.getMetadata()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModItems.ADVANCED_SHELL, 32),
                new ItemStack(Items.IRON_INGOT, 10),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(Blocks.CONCRETE, 1, EnumDyeColor.RED.getMetadata()),
                new ItemStack(Blocks.CONCRETE, 5, EnumDyeColor.GREEN.getMetadata()));

        proxy.init();
    }
}
