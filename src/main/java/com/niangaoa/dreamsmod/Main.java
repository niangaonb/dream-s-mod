package com.niangaoa.dreamsmod;

import com.niangaoa.dreamsmod.init.ModRecipes;
import com.niangaoa.dreamsmod.proxy.CommonProxy;
import com.niangaoa.dreamsmod.tabs.DreamTab;
import com.niangaoa.dreamsmod.util.Reference;

import com.niangaoa.dreamsmod.util.handlers.RegistryHandler;
import com.niangaoa.dreamsmod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

        @Instance
        public static Main instance;

        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
        public static CommonProxy proxy;

        @EventHandler
        public static void PreInit(FMLPreInitializationEvent event) {

                RegistryHandler.perInitRegistries();
                GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);

        }

        @EventHandler
        public static void Init(FMLInitializationEvent event) {

                ModRecipes.init();

        }

        @EventHandler
        public static void PostInit(FMLPostInitializationEvent event) {

        }

        public static CreativeTabs DREAM_TAB = new DreamTab();

}
