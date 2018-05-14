package edu.mum.asd.strategy;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	private String flightNo;
	private String fromAirport;
	private String toAirport;
	private String airplane;
	private int passangers;
	
	public Flight() {}
	
	public Flight(String flightNo, String fromAirport, String toAirport, String airplane, int passangers) {
		super();
		this.flightNo = flightNo;
		this.fromAirport = fromAirport;
		this.toAirport = toAirport;
		this.airplane = airplane;
		this.passangers = passangers;
	}

	public static List<Flight>getFlights(){
		List<Flight>flights=new ArrayList<>();
		flights.add(new Flight("FL20193-DES", "DESMOINES", "DENVER", "BOEING-747", 200));
		flights.add(new Flight("FL26793-BEI", "BEIJING", "TOKYO", "BOEING-777", 290));
		flights.add(new Flight("FL26287-KGL", "KIGALI", "BRUXELLES", "BOEING-777", 410));
		flights.add(new Flight("FL67221-KGL", "BRUXELLES", "KIGALI", "BOEING-747", 320));
		return flights;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(String fromAirport) {
		this.fromAirport = fromAirport;
	}

	public String getToAirport() {
		return toAirport;
	}

	public void setToAirport(String toAirport) {
		this.toAirport = toAirport;
	}

	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}

	public int getPassangers() {
		return passangers;
	}

	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}

}
