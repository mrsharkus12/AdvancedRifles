package com.mrsharkus.advancedrifles.proxy;

import com.mrsharkus.advancedrifles.core.ModItems;
import com.mrcrayfish.guns.client.gui.DisplayProperty;
import com.mrcrayfish.guns.client.gui.GuiWorkbench;
import net.minecraft.item.ItemStack;

/**
 * Author: MrCrayfish
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void init() {
        /* Adds a display property for items so they render nicely in the workbench GUI */
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.ASSAULT_RIFLE_ADVANCED), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.SHOTGUN_AUTO), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.RIFLE_ADVANCED), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.REVOLVER), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.HAND_GRENADELAUNCHER), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.AWP), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.DEAGLE), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.CHEAPRIFLE), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.UZI), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.GLOCK), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.ASSAULT_RIFLE_MK2), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.SHOTGUN_MK2), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.M16), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.MP5), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.MP5STOCKCLOSED), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.GRENADE_LAUNCHER_ADVANCED), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.AUG), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.REVOLVER_MK2), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.SCAR), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.AK12), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.SHOTGUN_DOUBLEBARREL), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.SHOTGUN_SAWEDOFF), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.CROSSBOW), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.CROSSBOW_DART), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.ADVANCED_SHELL), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
        GuiWorkbench.addDisplayProperty(new ItemStack(ModItems.ADVANCED_BAZOOKA), new DisplayProperty(0.0, 0.55, -0.15, 0.0, 0.0, 0.0, 3.0));
    }
}
