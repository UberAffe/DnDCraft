package com.uberaffe.dndcraft.items;

import java.util.List;
import java.util.HashMap;

import com.uberaffe.dndcraft.api.Stats;
import com.uberaffe.dndcraft.api.playerside.IAbility;
import com.uberaffe.dndcraft.api.playerside.ICharacterSheet;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DefaultCharacterSheet extends Item implements ICharacterSheet{

	public static DefaultCharacterSheet instance = new DefaultCharacterSheet();
	
	private String characterName = "Character Sheet";
	private Stats stats;
	private List<Integer> classes;
	private HashMap<Integer, List<IAbility>> classAbilities;
	

	public DefaultCharacterSheet(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.MISC);
		setUnlocalizedName(characterName);
	}
	
	@Override
	public Stats getStats() {
		return stats;
	}
	
	
}
