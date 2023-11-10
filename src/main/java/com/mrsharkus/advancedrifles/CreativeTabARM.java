package com.mrsharkus.advancedrifles;

import com.mrsharkus.advancedrifles.core.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabARM extends CreativeTabs {

    public CreativeTabARM(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ASSAULT_RIFLE_ADVANCED); // Set the icon for your creative tab
    }
}
