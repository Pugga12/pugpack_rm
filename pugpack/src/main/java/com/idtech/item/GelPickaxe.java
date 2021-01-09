package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class GelPickaxe extends ItemPickaxe {
    public final String name = "GelPickaxe";

    public GelPickaxe()
    {
        super(ItemMod.GEL);

        this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
