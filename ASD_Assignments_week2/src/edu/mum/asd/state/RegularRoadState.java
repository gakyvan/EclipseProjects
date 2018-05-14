package edu.mum.asd.state;

public class RegularRoadState implements RoardState {

	@Override
	public void leftHandle() {
		System.out.println("LEFT -> 5");
	}

	@Override
	public void rightHandle() {
		System.out.println("RIGHT -> 5");
	}

	@Override
	public void accelerationHandle() {
		System.out.println("ACCELERATION -> 9");
	}

	@Override
	public void brakeHandle() {
		System.out.println("BRAKE -> 8");
	}

}
