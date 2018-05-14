package edu.mum.asd.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Agent {

	private int id;
	private String firstName;
	private String lastName;
	private String position;
	
	
	/* Consider this as a a database table of agents*/
	public static List<Agent> getAgents() {
		List<Agent> agents = new ArrayList<Agent>();
		agents.add(new Agent(1, "Alexandre", "LACAZETTE", "JUNIOR"));
		agents.add(new Agent(2, "Lionnel", "MESSI", "DIRECTOR"));
		agents.add(new Agent(3, "Luis", "SUAREZ", "SENIOR"));
		return agents;
	}
	
	/* Render one Agent from the considered list above*/
	public static Agent find(int index) {
		return getAgents().get(index);
	}

	public Agent() {
	}

	public Agent(int id, String firstName, String lastName, String position) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Agent ["+ firstName + " " + lastName + "]";
	}

}
