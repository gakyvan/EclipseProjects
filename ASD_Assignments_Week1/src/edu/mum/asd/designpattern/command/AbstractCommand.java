package edu.mum.asd.designpattern.command;

public abstract class AbstractCommand implements Command {

	private SquareReceiver receiver = new SquareReceiver();
	private Square square;

	public AbstractCommand(Square square) {
		this.square=square;
	}
	
	public SquareReceiver getReceiver() {
		return receiver;
	}

	public Square getSquare() {
		return square;
	}

}
