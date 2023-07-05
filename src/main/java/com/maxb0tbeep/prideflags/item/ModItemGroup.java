package com.maxb0tbeep.prideflags.item;

import com.maxb0tbeep.prideflags.PrideFlags;
import com.maxb0tbeep.prideflags.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    public static final ItemGroup PRIDE = FabricItemGroupBuilder.build(new Identifier(PrideFlags.MOD_ID, "pride"),
            () -> new ItemStack(ModBlocks.PRIDE_BLOCK));
}