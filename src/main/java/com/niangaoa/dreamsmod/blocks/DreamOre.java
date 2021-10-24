package com.niangaoa.dreamsmod.blocks;

import com.niangaoa.dreamsmod.init.ModBlocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class DreamOre extends BlockBase{

    public DreamOre(String name, Material material, CreativeTabs tab) {

        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(50.0f);
        setResistance(Float.MAX_VALUE);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(3.0f);

    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(ModBlocks.DREAM_ORE);

    }

    @Override
    public int quantityDropped(Random rand) {

        int min = 1;
        int max = 3;
        return rand.nextInt(max)+min;

    }

}
