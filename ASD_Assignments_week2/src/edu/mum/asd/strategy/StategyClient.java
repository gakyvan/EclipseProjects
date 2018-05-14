package edu.mum.asd.strategy;

public class StategyClient {

	public static void main(String[]args) {
		Model singlePrice=new SinglePrice();
		Model twoClasses=new TwoClasses();
		Model multiClass=new MultiClass();
		RevenueCalculatorContext rcc=new RevenueCalculatorContext();
		rcc.setModel(singlePrice);
		System.out.printf("Single Price Model Total Revenue $%,d\n", rcc.computeTotalRevenue(Flight.getFlights()));
		rcc.setModel(twoClasses);
		System.out.printf("Two class Price Model Total Revenue $%,d\n", rcc.computeTotalRevenue(Flight.getFlights()));
		rcc.setModel(multiClass);
		System.out.printf("Two class Price Model Total Revenue $%,d\n", rcc.computeTotalRevenue(Flight.getFlights()));
	}
}
