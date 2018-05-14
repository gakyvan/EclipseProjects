package edu.mum.asd.designpattern.chainofresponibility;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String requestInformation;
	private boolean isValid;
	private boolean isSalesLead;

	public CallRecord() {
		this.isValid = false;
		this.isSalesLead = false;
	}

	public CallRecord(Customer customer, Agent agent, String requestInformation) {
		this.customer = customer;
		this.agent = agent;
		this.requestInformation = requestInformation;
		this.isValid = false;
		this.isSalesLead = false;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getRequestInformation() {
		return requestInformation;
	}

	public void setRequestInformation(String requestInformation) {
		this.requestInformation = requestInformation;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isSalesLead() {
		return isSalesLead;
	}

	public void setSalesLead(boolean isSalesLead) {
		this.isSalesLead = isSalesLead;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agent == null) ? 0 : agent.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + (isSalesLead ? 1231 : 1237);
		result = prime * result + (isValid ? 1231 : 1237);
		result = prime * result + ((requestInformation == null) ? 0 : requestInformation.hashCode());
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
		CallRecord other = (CallRecord) obj;
		if (agent == null) {
			if (other.agent != null)
				return false;
		} else if (!agent.equals(other.agent))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (isSalesLead != other.isSalesLead)
			return false;
		if (isValid != other.isValid)
			return false;
		if (requestInformation == null) {
			if (other.requestInformation != null)
				return false;
		} else if (!requestInformation.equals(other.requestInformation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Names: "+customer.getFirstName()+" "+customer.getLastName()+ "--> "+ requestInformation;
	}

}
