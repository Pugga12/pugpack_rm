package com.idtech;

import java.util.Set;

import com.idtech.block.QuickLoader_Blocks;
import com.idtech.item.QuickLoader_Items;

public class JSONManager {
	
	public static final String assetsDir = "../src/main/resources/assets/" + BaseMod.MODID;

	public static void buildJSON() {
		buildItems();
		buildBlocks();
	}
	
	private static void buildBlocks() {
		Set<QuickLoader_Blocks> blocks = QuickLoader_Blocks.getRegistry();
		for(QuickLoader_Blocks block : blocks)
			block.createJSONFiles();			
	}

	private static void buildItems() {
		Set<QuickLoader_Items> items = QuickLoader_Items.getRegistry();
		for (QuickLoader_Items item : items)
			item.createJSONFile();
		
	}

	public static String jsonName(String s) {
		StringBuilder b = new StringBuilder(s.length());
		for (char c : s.toCharArray())
			b.append(Character.isAlphabetic(c) ? Character.toLowerCase(c) : c);
		return b.toString();
	}
	
	public static String safeString(String s){
		StringBuilder b = new StringBuilder(s.length());
		for(char c : s.toCharArray())
			b.append(Character.isAlphabetic(c) ? c : '_');
		return b.toString();
	}

}
