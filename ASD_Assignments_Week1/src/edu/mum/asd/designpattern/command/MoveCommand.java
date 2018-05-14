package edu.mum.asd.designpattern.command;

public class MoveCommand extends AbstractCommand{

	private int position;
	
	public MoveCommand(Square square, int position) {
		super(square);
		this.position=position;
	}

	@Override
	public void action() {
		getReceiver().drawSquare(getSquare(), position);
	}

	@Override
	public void undo() {
		getReceiver().drawSquare(getSquare(), position/position);
	}

	public int getePosition() {
		return position;
	}

	public void setScale(int position) {
		this.position = position;
	}

}
