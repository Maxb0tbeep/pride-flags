package com.maxb0tbeep.prideflags.block;

import com.maxb0tbeep.prideflags.PrideFlags;
import com.maxb0tbeep.prideflags.block.custom.DirectionalBlock;
import com.maxb0tbeep.prideflags.block.custom.FlagBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.maxb0tbeep.prideflags.item.ModItemGroup;

public class ModBlocks {
    public static final Block PRIDE_BLOCK = registerBlock("pride_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE); //not directional because you can make a swastika with 4 of them
    public static final Block OLD_PRIDE_BLOCK = registerBlock("old_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block ASEXUAL_PRIDE_BLOCK = registerBlock("asexual_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block BI_PRIDE_BLOCK = registerBlock("bi_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block ENBY_PRIDE_BLOCK = registerBlock("enby_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block GAY_PRIDE_BLOCK = registerBlock("gay_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block GENDERFLUID_PRIDE_BLOCK = registerBlock("genderfluid_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block INTERSEX_PRIDE_BLOCK = registerBlock("intersex_pride_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block LESBIAN_PRIDE_BLOCK = registerBlock("lesbian_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block PAN_PRIDE_BLOCK = registerBlock("pan_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);
    public static final Block TRANS_PRIDE_BLOCK = registerBlock("trans_pride_block",
            new DirectionalBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f)), ModItemGroup.PRIDE);

    public static final Block FLAG = registerBlock("flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block PRIDE_FLAG = registerBlock("pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block OLD_PRIDE_FLAG = registerBlock("old_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block ASEXUAL_PRIDE_FLAG = registerBlock("asexual_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block BI_PRIDE_FLAG = registerBlock("bi_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block ENBY_PRIDE_FLAG = registerBlock("enby_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block GAY_PRIDE_FLAG = registerBlock("gay_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block GENDERFLUID_PRIDE_FLAG = registerBlock("genderfluid_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block INTERSEX_PRIDE_FLAG = registerBlock("intersex_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block LESBIAN_PRIDE_FLAG = registerBlock("lesbian_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block PAN_PRIDE_FLAG = registerBlock("pan_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);
    public static final Block TRANS_PRIDE_FLAG = registerBlock("trans_pride_flag",
            new FlagBlock(FabricBlockSettings.of(Material.WOOL).strength(.25f).nonOpaque().noCollision()), ModItemGroup.PRIDE);


    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(PrideFlags.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(PrideFlags.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        PrideFlags.LOGGER.info("Registering mod blocks for "+ PrideFlags.MOD_ID);
    }
}
