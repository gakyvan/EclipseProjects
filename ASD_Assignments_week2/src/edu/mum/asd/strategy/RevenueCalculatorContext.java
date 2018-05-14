package edu.mum.asd.strategy;

import java.util.List;

public class RevenueCalculatorContext {
	
	private Model model;
	
	public long computeTotalRevenue(List<Flight> flights) {
		return model.getRevenue(flights);
	}

	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model=model;
	}
	
}
