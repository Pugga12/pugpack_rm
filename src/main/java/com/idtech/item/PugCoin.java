package com.idtech.item;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import scala.util.Random;




public class PugCoin extends QuickLoader_Items {
    {
        name = "Pugcoin";
        tab = CreativeTabs.MISC;
        texture = "pugcoin";
    }



    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        EntityWolf wolf = new EntityWolf(worldIn);
        Random random = new Random();
        BlockPos blockPos = findBlock(30, playerIn, worldIn);
        wolf.setLocationAndAngles(blockPos.getX(), blockPos.getY(), blockPos.getZ(), MathHelper.wrapDegrees(random.nextFloat() * 360.0F), 0.0F);
        if(!worldIn.isRemote)
            worldIn.spawnEntity(wolf);

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

    protected BlockPos findBlock(float range, EntityPlayer player, World world) {
        Vec3d posVec = new Vec3d(player.posX, player.posY + player.getEyeHeight(), player.posZ);
        Vec3d lookVec = player.getLookVec();

        RayTraceResult blockHit = world.rayTraceBlocks(posVec,
                posVec.addVector(lookVec.x * range, lookVec.y * range, lookVec.z * range));
        if (blockHit == null)
            return null;

        BlockPos block = blockHit.getBlockPos().offset(blockHit.sideHit);
        return block;
    }



}
