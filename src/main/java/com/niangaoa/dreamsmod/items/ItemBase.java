package com.niangaoa.dreamsmod.items;

import com.niangaoa.dreamsmod.Main;
import com.niangaoa.dreamsmod.init.ModItems;
import com.niangaoa.dreamsmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs tab) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }

}
