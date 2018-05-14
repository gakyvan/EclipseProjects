package edu.mum.asd.strategy;

import java.util.List;

public class SinglePrice implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long totalRevenue = 0;
		for (Flight flight : flights) {
			totalRevenue += (flight.getPassangers() * BASE_TICKET_PRICE) - FIXED_COST;
		}
		return totalRevenue;
	}

}
