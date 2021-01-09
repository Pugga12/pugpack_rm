package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;

public class TeleportRod extends QuickLoader_Items {
    {
        name = "Teleport Wand";
        tab = CreativeTabs.TOOLS;
        texture = "teleportrod";
        type = ItemType.HandHeld;
    }


    protected void onRightClick() {
        BlockPos block = findBlockAtCursor(125);
        moveToBlock(block);
        displayMessage("Whoosh!");

    }
}


