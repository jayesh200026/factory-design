package com.factory;

public class ComputerFactory {
	
	public Computer getComputer(Computer.budget budget,short hardDiskSize,String mouseName,String keyBoardName) {
		
		
		Ram ram = RamFactory.getInstance().get(budget);
		HardDisk hardDisk = new HardDisk((short)hardDiskSize);
		Mouse mouse = new Mouse(mouseName);
		Keyboard keyBoard = new Keyboard(keyBoardName);
		Processor processor = ProcessorFactory.getInstance().get(budget);
		
		Computer computer = new Computer();
		computer.setHardDisk(hardDisk);
		computer.setKeyBoard(keyBoard);
		computer.setMouse(mouse);
		computer.setProcessor(processor);
		computer.setRam(ram);
		computer.setPrice(37400);
		
		
		
		
		
		return computer;
	}

}
