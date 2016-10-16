package com.uberaffe.dndcraft.api;

public interface IStats {

	public int Initiative();
	public int MaxHP();
	public int Speed();
	public IDie HitDie();
	public int ArmorClass();
	public int Proficiency();
	public Stat Strength();
	public Stat Intelligence();
	public Stat Dexterity();
	public Stat Wisdom();
	public Stat Constitution();
	public Stat Charisma();
	
	public void SetInitiative(int val);
	public void SetMaxHP(int val);
	public void SetSpeed(int val);
	public void SetHitDie(IDie dice);
	public void SetArmorClass(int val);
	public void SetProficiency(int val);
	public void SetStrength(Stat stat);
	public void SetIntelligence(Stat stat);
	public void SetDexterity(Stat stat);
	public void SetWisdom(Stat stat);
	public void SetConstitution(Stat vastatl);
	public void SetCharisma(Stat stat);
}
