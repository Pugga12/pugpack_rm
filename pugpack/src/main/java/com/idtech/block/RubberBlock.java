package com.idtech.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubberBlock extends QuickLoader_Blocks {
    {
        name = "Rubber Block";
        tab = CreativeTabs.BUILDING_BLOCKS;
        texture = "rubber";
    }


    public void onEntityWalk(World worldIn, BlockPos posIn, Entity entityIn) {
        entityIn.motionY += 1;
    }
}
