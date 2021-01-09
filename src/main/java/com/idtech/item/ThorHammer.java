package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;

public class ThorHammer extends QuickLoader_Items {
    {
        name = "Thor's Hammer";
        texture = "lightninghammer";
        tab = CreativeTabs.COMBAT;
        type = ItemType.HandHeld;
    }

    public void onRightClick() {
        BlockPos block = findBlockAtCursor(60);
        createLightningBolt(block);
        displayMessage("Zap!");
    }
}
