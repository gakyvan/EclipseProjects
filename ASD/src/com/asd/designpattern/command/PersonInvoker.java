package com.asd.designpattern.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class PersonInvoker {

	private Command currentCommand;
	private Deque<Command> commandExecuted = new ArrayDeque<>();
	
	public boolean saveParent(Person person) {
		currentCommand=new SaveCommand(person);
		if(currentCommand.execute()==true) {
			commandExecuted.push(currentCommand);
			System.out.println("Operation executed");
			return true;
		}else {
			System.out.println("Operaion failed");
			return false;
		}
	}

	public Command getCurrentCommand() {
		return currentCommand;
	}

	public Deque<Command> getCommandExecuted() {
		return commandExecuted;
	}

}
