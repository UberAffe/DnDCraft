package com.uberaffe.dndcraft.api;

public class Stat {

	private int score;
	private int modifier;
	private int save;
	
	public Stat(){
		score = modifier = save = 0;
	}
	
	public Stat(int sc, int m, int sa){
		score = sc >= 0 ? sc : 0;
		modifier = m;
		save = sc;
	}
	
	
	public int Score() {return score;}
	public int Modifier() {return modifier;}
	public int Save() {return save;}
	
	public void SetScore(int val){score = val >= 0 ? val : score;}//score can not be less than 0
	public void SetModifier(int val){modifier = val;}
	public void SetSave(int val){save = val;}
}
