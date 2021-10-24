package com.niangaoa.dreamsmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {

        GameRegistry.addSmelting(ModBlocks.DREAM_ORE, new ItemStack(ModItems.DREAM_INGOT, 1), Float.MAX_VALUE);

    }

}
