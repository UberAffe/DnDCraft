package com.uberaffe.dndcraft.api;

import com.uberaffe.dndcraft.pseudoitems.DefaultIDie;

public class Stats implements IStats{
	private int initiative;
	private int maxHP;
	private int speed;
	private IDie hitDie;
	private int armorClass;
	private int proficiency;
	private Stat strength;
	private Stat intelligence;
	private Stat dexterity;
	private Stat Wisdom;
	private Stat constitution;
	private Stat charisma;
	
	public Stats(){
		initiative = maxHP = speed = armorClass = proficiency = 0;
		hitDie = new DefaultIDie(1, null);
		strength = new Stat();
		intelligence = new Stat();
		dexterity = new Stat();
		Wisdom = new Stat();
		constitution = new Stat();
		charisma = new Stat();
	}
	
	@Override
	public int Initiative() {return initiative;}
	@Override
	public int MaxHP() {return maxHP;}
	@Override
	public int Speed() {return speed;}
	@Override
	public IDie HitDie() {return hitDie;}
	@Override
	public int ArmorClass() {return armorClass;}
	@Override
	public int Proficiency() {return proficiency;}
	@Override
	public Stat Strength() {return strength;}
	@Override
	public Stat Intelligence() {return intelligence;}
	@Override
	public Stat Dexterity() {return dexterity;}
	@Override
	public Stat Wisdom() {return Wisdom;}
	@Override
	public Stat Constitution() {return constitution;}
	@Override
	public Stat Charisma() {return charisma;}
	@Override
	public void SetInitiative(int val) {initiative = val >= 0 ? val : initiative;} //Cannot be less than 0
	@Override
	public void SetMaxHP(int val) {maxHP = val >= 0 ? val : maxHP;} //Cannot be less than 0
	@Override
	public void SetSpeed(int val) {speed = val >= 0 ? val : speed;} //Cannot be less than 0
	@Override
	public void SetHitDie(IDie dice) {hitDie = dice.Amount() > 0 ? dice : new DefaultIDie(0, null);}
	@Override
	public void SetArmorClass(int val) {armorClass = val >= 0 ? val : armorClass;} //Cannot be less than 0
	@Override
	public void SetProficiency(int val) {proficiency = val >= 0 ? val : proficiency;} //Cannot be less than 0
	@Override
	public void SetStrength(Stat stat) {strength = stat != null ? stat : new Stat();}
	@Override
	public void SetIntelligence(Stat stat) {intelligence = stat != null ? stat : new Stat();}
	@Override
	public void SetDexterity(Stat stat) {dexterity = stat != null ? stat : new Stat();}
	@Override
	public void SetWisdom(Stat stat) {Wisdom = stat != null ? stat : new Stat();}
	@Override
	public void SetConstitution(Stat stat) {constitution = stat != null ? stat : new Stat();}
	@Override
	public void SetCharisma(Stat stat) {charisma = stat != null ? stat : new Stat();}
}
