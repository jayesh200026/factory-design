package com.factory;

public class Main {

	public static void main(String[] args) {
		
		Ram ram = new Ram((byte)16);
		HardDisk hardDisk = new HardDisk((short)512);
		Mouse mouse = new Mouse("HP");
		Keyboard keyBoard = new Keyboard("Asus");
		Processor processor = new Processor("i5","intel");
		
		Computer computer = new Computer();
		computer.setHardDisk(hardDisk);
		computer.setKeyBoard(keyBoard);
		computer.setMouse(mouse);
		computer.setProcessor(processor);
		computer.setRam(ram);
		computer.setPrice(37400);
		
		Ram ram1 = new Ram((byte)8);
		HardDisk hardDisk1 = new HardDisk((short)256);
		Mouse mouse1 = new Mouse("HP");
		Keyboard keyBoard1 = new Keyboard("Asus");
		Processor processor1 = new Processor("i3","intel");
		
		Computer computer1 = new Computer();
		computer1.setHardDisk(hardDisk1);
		computer1.setKeyBoard(keyBoard1);
		computer1.setMouse(mouse1);
		computer1.setProcessor(processor1);
		computer1.setRam(ram1);
		computer1.setPrice(31000);
		
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer2 = computerFactory.getComputer(Computer.budget.LOW, (short)1024, "lenovo", "dell");
		

	}

}
