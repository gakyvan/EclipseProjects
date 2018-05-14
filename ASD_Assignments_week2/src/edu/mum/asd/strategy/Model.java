package edu.mum.asd.strategy;

import java.util.List;

public interface Model {
	
	public final long BASE_TICKET_PRICE=300;
	
	public final long FIXED_COST=50000;
	
	public long getRevenue(List<Flight>flights);
}
