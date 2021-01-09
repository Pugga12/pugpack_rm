package com.idtech;

import com.idtech.block.QuickLoader_Blocks;
import com.idtech.item.ItemMod;
import com.idtech.item.QuickLoader_Items;
import com.idtech.proxy.CommonProxy;
import com.idtech.world.WorldMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = BaseMod.MODID, version = BaseMod.VERSION)
@Mod.EventBusSubscriber
public class BaseMod
{
	/**
	 * Change MODID to a unique name for your mod.
	 * You can change VERSION to higher numbers as you make new versions.
	 */
	public static final String MODID = "examplemod";
	public static final String VERSION = "Alpha-0.1.2";

	/**
	 * ----DO NOT EDIT----
	 * BaseMod.instance will get the currently running copy of your mod.
	 * Used in other mod classes.
	 */
	@Instance(MODID)
	public static BaseMod instance;

	/**
	 * ----DO NOT EDIT----
	 * Sided proxies for your mod. Used in cases where code must be only run on either the client or the server.
	 */
	@SidedProxy(modId=MODID, clientSide="com.idtech.proxy.ClientProxy", serverSide="com.idtech.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		
		// Mod PreInit
		ItemMod.preInit();
		QuickLoader_Items.preInit();
		QuickLoader_Blocks.preInit();

		LanguageLocalization.createLanguageFile();
		JSONManager.buildJSON();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		// Mod Init
		ItemMod.init();
		QuickLoader_Items.init();
		QuickLoader_Blocks.init();
		WorldMod.init();


	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		for(QuickLoader_Blocks b : QuickLoader_Blocks.getRegistry()){
			event.getRegistry().register(b.setRegistryName(b.getName()));
		}
		
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for(QuickLoader_Items i : QuickLoader_Items.getRegistry()) {
			event.getRegistry().register(i.setRegistryName(i.getName()));
		}
		
		for(Block b : QuickLoader_Blocks.getRegistry()){
			event.getRegistry().register(new ItemBlock(b).setRegistryName(b.getRegistryName()) );
		}
		
	}


}
