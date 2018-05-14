package edu.mum.asd.state;

public class RoardContext {
	
	private RoardState regularCondition;
	private RoardState gravelCondition;
	private RoardState wetCondition;
	private RoardState iceCondition;
	
	public RoardContext() {
		regularCondition=new RegularRoadState();
		gravelCondition=new GravelRoardState();
		wetCondition=new WetRoardState();
		iceCondition=new IceRoardState();
	}

	public RoardState getRegularCondition() {
		return regularCondition;
	}

	public RoardState getGravelCondition() {
		return gravelCondition;
	}

	public RoardState getWetCondition() {
		return wetCondition;
	}

	public RoardState getIceCondition() {
		return iceCondition;
	}
	
}
