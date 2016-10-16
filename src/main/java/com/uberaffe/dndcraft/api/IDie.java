package com.uberaffe.dndcraft.api;

public interface IDie {

	public int Roll(); // returns the result of rolling that die type the given amount of times.
	public int Amount(); // how many times this die should be rolled
	public IDieType Type(); // returns the type of die
	public void SetType(IDieType dt);
	public void SetAmount(int am);
}
