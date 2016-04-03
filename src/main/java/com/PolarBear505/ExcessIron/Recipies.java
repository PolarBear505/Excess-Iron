package com.PolarBear505.excessiron;

import com.PolarBear505.excessiron.block.ModBlocks;
import com.PolarBear505.excessiron.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class Recipies {

    public static final void init() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.DenseIronBlock), new Object[] {"###", "###", "###", '#', Blocks.iron_block});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.DiamondIronBlock), new Object[] {"#I#", "IDI", "#I#", '#', ModBlocks.DenseIronBlock, 'I', Items.iron_ingot, 'D', Items.diamond});
        GameRegistry.addSmelting(ModBlocks.DiamondIronBlock, new ItemStack(ModItems.DiamondIronIngot), 1.0F);
    }
}
