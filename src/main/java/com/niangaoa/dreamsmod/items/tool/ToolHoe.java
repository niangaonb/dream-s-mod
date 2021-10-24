package com.niangaoa.dreamsmod.items.tool;

import com.niangaoa.dreamsmod.Main;
import com.niangaoa.dreamsmod.init.ModItems;
import com.niangaoa.dreamsmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

    public ToolHoe(String name, CreativeTabs tab, Item.ToolMaterial material) {

        super(material);
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
