package edu.mum.asd.designpattern.command;

public class CreateCommand extends AbstractCommand{

	private int position;
	public CreateCommand(Square square, int position) {
		super(square);
		this.position=position;
	}

	@Override
	public void action() {
		getReceiver().drawSquare(getSquare(), position);
	}

	@Override
	public void undo() {
		getReceiver().eraseSquare();		
	}

	public int getPosition() {
		return position;
	}

	
	
}
