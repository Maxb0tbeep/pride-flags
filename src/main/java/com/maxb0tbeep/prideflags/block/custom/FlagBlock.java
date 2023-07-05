package com.maxb0tbeep.prideflags.block.custom;

import net.minecraft.block.Block;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;

public class FlagBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public FlagBlock(Settings settings){
        super(settings);
    }
}
