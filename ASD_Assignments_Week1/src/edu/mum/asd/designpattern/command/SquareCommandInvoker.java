package edu.mum.asd.designpattern.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class SquareCommandInvoker {

	private Command currentCommand = null;
	private Deque<Command> previousCommand = new ArrayDeque<>();
	
	public void executeCreateCommand(Square square,int position) {
		currentCommand=new CreateCommand(square, position);
		currentCommand.action();
		previousCommand.push(currentCommand);
	}
	
	public void executeScaleCommand(Square square, int position, int scale) {
		currentCommand=new ScaleCommand(square, position, scale);
		currentCommand.action();
		previousCommand.push(currentCommand);
	}
	
	public void executeMoveCommand(Square square, int position) {
		currentCommand=new MoveCommand(square, position);
		currentCommand.action();
		previousCommand.push(currentCommand);
	}
	
	public void undoCommand() {
		previousCommand.pop().undo();
	}

	public Command getCurrentCommand() {
		return currentCommand;
	}

	public void setCurrentCommand(Command currentCommand) {
		this.currentCommand = currentCommand;
	}

}
