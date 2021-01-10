package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemMod {

	// Material
	public static Item.ToolMaterial GEL;

	// Tools
	public static GelPickaxe gelPickaxe;
	public static GelSword gelSword;
	public static Burrito burrito;
	public static Chipotle_burrito chipotle_burrito;

	public static void preInit(){

		// Materials
		GEL= EnumHelper.addToolMaterial("GEL", 2, 325, 20, 20, 30);

		// Tools
		burrito = new Burrito(8, 0.1f, false);
		chipotle_burrito = new Chipotle_burrito(2, 0.1f, false);
		gelPickaxe = new GelPickaxe();
		gelSword = new GelSword();


	}

	public static void init(){

		// Register Item Renderer
		BaseMod.proxy.registerItemInventoryRender(burrito, burrito.name);
		BaseMod.proxy.registerItemInventoryRender(gelPickaxe, gelPickaxe.name);
		BaseMod.proxy.registerItemInventoryRender(gelSword, gelSword.name);
		BaseMod.proxy.registerItemInventoryRender(chipotle_burrito, chipotle_burrito.name);

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		// Register Items
		event.getRegistry().register(burrito.setRegistryName(burrito.name));
		event.getRegistry().register(gelPickaxe.setRegistryName(gelPickaxe.name));
		event.getRegistry().register(gelSword.setRegistryName(gelSword.name));
		event.getRegistry().register(chipotle_burrito.setRegistryName(chipotle_burrito.name));
	}
}