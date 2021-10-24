package com.niangaoa.dreamsmod.init;

import com.niangaoa.dreamsmod.Main;
import com.niangaoa.dreamsmod.items.ItemBase;
import com.niangaoa.dreamsmod.items.armor.ArmorBase;
import com.niangaoa.dreamsmod.items.tool.*;
import com.niangaoa.dreamsmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import java.util.ArrayList;
import java.util.List;

public class ModItems {
    //material
    public static final ToolMaterial MATERIAL_DREAM = EnumHelper.addToolMaterial("material_dream", (int) Float.MAX_VALUE, (int) Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, (int) Float.MAX_VALUE);
    public static final ArmorMaterial ARMOR_MATERIAL_DREAM = EnumHelper.addArmorMaterial("armor_material_dream", Reference.MOD_ID + ":dream", (int) Float.MAX_VALUE, new int[] {(int) Float.MAX_VALUE, (int) Float.MAX_VALUE, (int) Float.MAX_VALUE, (int) Float.MAX_VALUE}, (int) Float.MAX_VALUE, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Float.MAX_VALUE);

    public static final List<Item> ITEMS = new ArrayList<Item>();
    //item
    public static final Item DREAM_INGOT = new ItemBase("dream_ingot", Main.DREAM_TAB);
    public static final Item DREAM_STICK = new ItemBase("dream_stick", Main.DREAM_TAB);

    //tool
    public static final ItemSword DREAM_SWORD = new ToolSword("dream_sword", Main.DREAM_TAB, MATERIAL_DREAM);
    public static final ItemAxe DREAM_AXE = new ToolAxe("dream_axe", Main.DREAM_TAB, MATERIAL_DREAM);
    public static final ItemPickaxe DREAM_PICKAXE = new ToolPickaxe("dream_pickaxe", Main.DREAM_TAB, MATERIAL_DREAM);
    public static final ItemSpade DREAM_SPADE = new ToolSpade("dream_spade", Main.DREAM_TAB, MATERIAL_DREAM);
    public static final ItemHoe DREAM_HOE = new ToolHoe("dream_hoe", Main.DREAM_TAB, MATERIAL_DREAM);

    //armor
    public static final Item DREAM_HELMET = new ArmorBase("dream_helmet", ARMOR_MATERIAL_DREAM, 1, EntityEquipmentSlot.HEAD, Main.DREAM_TAB);
    public static final Item DREAM_CHESTPLATE = new ArmorBase("dream_chestplate", ARMOR_MATERIAL_DREAM, 1, EntityEquipmentSlot.CHEST, Main.DREAM_TAB);
    public static final Item DREAM_LEGGINGS = new ArmorBase("dream_leggings", ARMOR_MATERIAL_DREAM, 2, EntityEquipmentSlot.LEGS, Main.DREAM_TAB);
    public static final Item DREAM_BOOTS = new ArmorBase("dream_boots", ARMOR_MATERIAL_DREAM, 1, EntityEquipmentSlot.FEET, Main.DREAM_TAB);



}
