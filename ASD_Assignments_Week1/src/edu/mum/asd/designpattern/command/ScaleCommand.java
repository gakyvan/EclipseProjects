package edu.mum.asd.designpattern.command;

public class ScaleCommand extends AbstractCommand {

	private int scale;
	private int position;

	public ScaleCommand(Square square, int position, int scale) {
		super(square);
		this.position = position;
		this.scale = scale;
	}

	@Override
	public void action() {
		getSquare().setSide(getSquare().getSide() * scale);
		getReceiver().drawSquare(getSquare(), position);
	}

	@Override
	public void undo() {
		getSquare().setSide(getSquare().getSide()/scale);
		getReceiver().drawSquare(getSquare(), position);

	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
