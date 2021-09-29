package com.factory;

public class RamFactory {
	
	public static RamFactory instance;
	private RamFactory() {
		
	}
	
	public static RamFactory getInstance() {
		if(instance == null)
			instance= new RamFactory();
		return instance;
	}
	
	
	public Ram get(Computer.budget budget) {
		
		switch(budget) {
		case LOW:
			return new Ram((byte)4);
		case MEDIUM:
			return new Ram((byte)8);
		case HIGH:
			return new Ram((byte)16);
		}
		
		return null;
		
	}

}
