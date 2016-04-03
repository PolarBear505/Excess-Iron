package com.PolarBear505.excessiron.item;


import com.PolarBear505.excessiron.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public final class ModItems {

    public static Item DiamondIronIngot;

    public static final void init() {
        DiamondIronIngot = new Item().setUnlocalizedName("DiamondIronIngot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":Diamond_Iron_Ingot");
        GameRegistry.registerItem(DiamondIronIngot, "DiamondIronIngot");
    }

}