package com.PolarBear505.excessiron.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block DenseIronBlock;
    public static Block DiamondIronBlock;

    public static final void init() {
        GameRegistry.registerBlock(DenseIronBlock = new DenseIronBlock("DenseIronBlock", Material.iron), "DenseIronBlock");
        GameRegistry.registerBlock(DiamondIronBlock = new DiamondIronBlock("DiamondIronBlock", Material.iron), "DiamondIronBlock");
    }
}
