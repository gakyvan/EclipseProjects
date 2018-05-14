package edu.mum.asd.state;

public class IceRoardState implements RoardState {

	@Override
	public void leftHandle() {
		System.out.println("ICE CONDITION: LEFT -> 1");
	}

	@Override
	public void rightHandle() {
		System.out.println("ICE CONDITION: RIGHT -> 1");
	}

	@Override
	public void accelerationHandle() {
		System.out.println("ICE CONDITION: ACCELERATION -> 3");
	}

	@Override
	public void brakeHandle() {
		System.out.println("ICE CONDITION: BRAKE -> 2");
	}

}
