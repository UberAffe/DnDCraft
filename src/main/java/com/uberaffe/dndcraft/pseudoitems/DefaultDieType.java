package com.uberaffe.dndcraft.pseudoitems;

import com.uberaffe.dndcraft.api.IDieType;
import java.util.Random;

public class DefaultDieType implements IDieType{

	private static Random RANDOM = new Random();
	private int sides;
	
	public static IDieType FOURSIDED = new DefaultDieType(4);
	public static IDieType SIXSIDED = new DefaultDieType(6);
	public static IDieType EIGHTSIDED = new DefaultDieType(8);
	public static IDieType TENSIDED = new DefaultDieType(10);
	public static IDieType TWELVESIDED = new DefaultDieType(12);
	public static IDieType TWENTYSIDED = new DefaultDieType(20);
	
	private DefaultDieType(int s){sides = s;}
	@Override
	public int Roll() {return RANDOM.nextInt(sides);}
	@Override
	public int Sided() {return sides;}
}
