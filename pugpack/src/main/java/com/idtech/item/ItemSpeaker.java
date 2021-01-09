package com.idtech.item;

import com.idtech.SoundMap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.SoundEvent;

public class ItemSpeaker extends QuickLoader_Items {
	
	int i = 0;
	
	{
		name = "Sound Tester";
		tab = CreativeTabs.MISC;
		texture = "speaker";
	}

	public void onRightClick(){
		SoundEvent sound = SoundMap.soundEvents[i];
		String soundName = SoundMap.soundStrings[i];
		playSound(sound);
		displayMessage(soundName);
		if(!world.isRemote) i = ++i % SoundMap.soundEvents.length;
	}
	
}
