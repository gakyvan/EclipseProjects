package edu.mum.asd.state;

public class GravelRoardState implements RoardState {

	@Override
	public void leftHandle() {
		System.out.println("GRAVEL CONDITION: LEFT -> 3");
	}

	@Override
	public void rightHandle() {
		System.out.println("GRAVEL CONDITION: RIGHT -> 3");
	}

	@Override
	public void accelerationHandle() {
		System.out.println("GRAVEL CONDITION: ACCELERATION -> 7");
	}

	@Override
	public void brakeHandle() {
		System.out.println("GRAVEL CONDITION: BRAKE -> 6");
	}

}
