package com.idtech;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Set;

import com.idtech.item.QuickLoader_Items;
import org.apache.commons.io.FileUtils;

import com.idtech.block.QuickLoader_Blocks;

public class LanguageLocalization {

	public static void createLanguageFile(){
		Set<QuickLoader_Items> items = QuickLoader_Items.getRegistry();
		Set<QuickLoader_Blocks> blocks = QuickLoader_Blocks.getRegistry();
		StringBuilder builder = new StringBuilder();
		
		// Line break
		builder.append('\n');
		
		for(QuickLoader_Items item : items){
			builder.append(item.getUnlocalizedName() + ".name=" + item.getName() + "\n");
		}
		
		for(QuickLoader_Blocks block : blocks){
			builder.append(block.getUnlocalizedName() + ".name=" + block.getName() + "\n");
		}
		
		File custom = Paths.get(".").resolve("../src/main/resources/assets/" + BaseMod.MODID + "/lang/en_us_custom.lang").toFile();
		File f = Paths.get(".").resolve("../src/main/resources/assets/" + BaseMod.MODID + "/lang/en_us.lang").toFile();
		if(f.exists()){
			f.delete();
		}
			
		try {
			FileUtils.copyFile(custom, f);
			FileUtils.writeStringToFile(f, builder.toString(), true);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
