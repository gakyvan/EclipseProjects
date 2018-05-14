package edu.mum.asd.state;

public class WetRoardState implements RoardState {

	@Override
	public void leftHandle() {
		System.out.println("WET CONDITION: LEFT -> 4");
	}

	@Override
	public void rightHandle() {
		System.out.println("WET CONDITION: RIGHT -> 4");
	}

	@Override
	public void accelerationHandle() {
		System.out.println("WET CONDITION: ACCELERATION -> 9");
	}

	@Override
	public void brakeHandle() {
		System.out.println("WET CONDITION: BRAKE -> 7");
	}

}
