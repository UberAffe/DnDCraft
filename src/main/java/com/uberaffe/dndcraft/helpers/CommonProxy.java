package com.uberaffe.dndcraft.helpers;

import com.uberaffe.dndcraft.items.DefaultCharacterSheet;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(){
		DefaultCharacterSheet.instance.setRegistryName(Refs.MODID, "defaultcharactersheet");
		GameRegistry.register(DefaultCharacterSheet.instance);
	}
	
	public void init(){
		
	}
	
	public void postInit(){
		
	}
}
