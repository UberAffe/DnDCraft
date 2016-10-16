package com.uberaffe.dndcraft.pseudoitems;

import com.uberaffe.dndcraft.api.IDie;
import com.uberaffe.dndcraft.api.IDieType;

public class DefaultIDie implements IDie{

	private IDieType type;
	private int amount;
	
	public DefaultIDie(int am, IDieType dt){
		type = dt != null ? dt : DefaultDieType.TWENTYSIDED;
		amount = am > 0 ? am : 1;
	}
	
	@Override
	public int Roll() {
		int value = 0;
		for(int i = 0; i < amount; i++)
			value += type.Roll();
		return value;
	}

	@Override
	public int Amount() {return amount;}

	@Override
	public IDieType Type() {return type;}

	@Override
	public void SetType(IDieType dt) {type = dt != null ? dt : type;}

	@Override
	public void SetAmount(int am) {amount = am > 0 ? am : amount;}

}
