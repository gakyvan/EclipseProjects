package edu.mum.asd.designpattern.command;

public class Client {

	public static void main(String[] args) {
		Square square=new Square(5);
		SquareCommandInvoker invoker=new SquareCommandInvoker();
		invoker.executeCreateCommand(square, 0);
		invoker.executeMoveCommand(square, 5);
		invoker.executeMoveCommand(square, 5);
		invoker.undoCommand();
		invoker.executeScaleCommand(square, 5, 2);
		invoker.undoCommand();
		invoker.undoCommand();
	}

}
