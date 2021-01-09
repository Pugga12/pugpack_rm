package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class GelSword extends ItemSword {
    public final String name = "GelSword";

    public GelSword()
    {
        super(ItemMod.GEL);

        this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
