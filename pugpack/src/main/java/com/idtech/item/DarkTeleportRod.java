package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;

public class DarkTeleportRod extends QuickLoader_Items {
    {
        name = "Dark Teleport Staff";
        tab = CreativeTabs.TOOLS;
        texture = "teleportstaff";
        type = ItemType.HandHeld;
    }


    protected void onRightClick() {
        BlockPos block = findBlockAtCursor(200);
        moveToBlock(block);
        displayMessage("Whoosh!");
    }
}


