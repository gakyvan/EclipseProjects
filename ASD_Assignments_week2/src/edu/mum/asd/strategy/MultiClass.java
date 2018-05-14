package edu.mum.asd.strategy;

import java.util.List;

public class MultiClass implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long totalRevenue = 0;
		long firstClass = 0;
		long businessClassRevenue = 0;
		long coachRevenue = 0;
		for (Flight flight : flights) {
			firstClass = ((flight.getPassangers() * 1 / 10) * (BASE_TICKET_PRICE * 4));
			businessClassRevenue = (long) ((flight.getPassangers() * 1 / 5) * (BASE_TICKET_PRICE * 1.5));
			coachRevenue = (long) ((flight.getPassangers() * 7 / 10) * (BASE_TICKET_PRICE * 0.75));
			totalRevenue += ((firstClass + businessClassRevenue + coachRevenue) - (FIXED_COST * 1.2));
		}
		return totalRevenue;
	}

}
