package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Burrito extends ItemFood {
    public final String name = "Burrito";

    public Burrito(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.FOOD);
    }

    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer Player) {
        if (!world.isRemote) {
            Player.addPotionEffect(new PotionEffect(Potion.getPotionById(4), 200, 5));
            Player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 500, 30));
        }
    }
}