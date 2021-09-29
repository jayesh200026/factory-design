package com.factory;

public class Computer {
	
	Ram ram;
	HardDisk hardDisk ;
	Mouse mouse;
	Keyboard keyBoard;
	Processor processor;
	int price;
	
	enum budget {
			LOW,MEDIUM,HIGH
	};
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public HardDisk getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Keyboard getKeyBoard() {
		return keyBoard;
	}
	public void setKeyBoard(Keyboard keyBoard) {
		this.keyBoard = keyBoard;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	
	

}
