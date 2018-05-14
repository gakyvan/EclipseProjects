package edu.mum.asd.designpattern.command;

public class SquareReceiver {

	public void drawSquare(Square square, int position) {
		for (int row = 0; row < square.getSide(); row++) {
			for (int sp = 0; sp < position; sp++) {
				System.out.print(" ");
			}
			for (int col = 0; col < square.getSide(); col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public void eraseSquare() {
		System.out.println("");
	}

}
