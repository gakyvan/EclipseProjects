package w1d6_1;

public class Agent {
	private String agentId;
	private Address workLocation;
	public Agent(String agentId, Address workLocation) {
		super();
		this.agentId = agentId;
		this.workLocation = workLocation;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", workLocation=" + workLocation + "]";
	}
	

}
