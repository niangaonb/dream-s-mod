package com.niangaoa.dreamsmod.tabs;

import com.niangaoa.dreamsmod.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DreamTab extends CreativeTabs {

    public DreamTab() {

        super("dream_tab");

    }

    @Override
    public ItemStack getTabIconItem() {

        return new ItemStack(Item.getItemFromBlock(ModBlocks.DREAM_BLOCK));


    }

}
