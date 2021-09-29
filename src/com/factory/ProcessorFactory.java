package com.factory;

public class ProcessorFactory {
	
	public static ProcessorFactory instance;
	private ProcessorFactory() {
		
	}
	
	public static ProcessorFactory getInstance() {
		if(instance == null)
			instance= new ProcessorFactory();
		return instance;
	}
	
	
	public Processor get(Computer.budget budget) {
		
		switch(budget) {
		case LOW:
			return new Processor("i3","intel");
		case MEDIUM:
			return new Processor("i5","intel");
		case HIGH:
			return new Processor("i7","intel");
		}
		
		return null;
		
	}

}
