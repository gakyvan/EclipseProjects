package edu.mum.asd.designpattern.chainofresponibility;

public class Agent {
	private String agentID;
	private String names;
	private Address workLocation;
	
	public Agent() {}
	
	public Agent(String agentID, String names, Address workLocation) {
		this.agentID=agentID;
		this.names=names;
		this.workLocation=workLocation;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public Address getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentID == null) ? 0 : agentID.hashCode());
		result = prime * result + ((names == null) ? 0 : names.hashCode());
		result = prime * result + ((workLocation == null) ? 0 : workLocation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (agentID == null) {
			if (other.agentID != null)
				return false;
		} else if (!agentID.equals(other.agentID))
			return false;
		if (names == null) {
			if (other.names != null)
				return false;
		} else if (!names.equals(other.names))
			return false;
		if (workLocation == null) {
			if (other.workLocation != null)
				return false;
		} else if (!workLocation.equals(other.workLocation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  agentID + ", " + names + ", workLocation= [ " + workLocation + " ]";
	}
	
	
}
