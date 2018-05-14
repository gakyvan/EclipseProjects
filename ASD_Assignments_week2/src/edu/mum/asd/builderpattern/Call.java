package edu.mum.asd.builderpattern;

import java.util.Date;

public class Call {

	private String requestID;
	private Agent agent;

	public Call(Agent agent) {
		this.agent = agent;
		this.requestID = "#" + new Date().getTime();
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

}
