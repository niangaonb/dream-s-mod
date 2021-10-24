package com.niangaoa.dreamsmod.init;

import com.niangaoa.dreamsmod.Main;
import com.niangaoa.dreamsmod.blocks.DreamBlock;
import com.niangaoa.dreamsmod.blocks.DreamOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DREAM_BLOCK = new DreamBlock("dream_block", Material.IRON, Main.DREAM_TAB);

    public static final Block DREAM_ORE = new DreamOre("dream_ore", Material.IRON, Main.DREAM_TAB);

}
