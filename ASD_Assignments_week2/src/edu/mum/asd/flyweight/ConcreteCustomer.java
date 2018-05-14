package edu.mum.asd.flyweight;

public class ConcreteCustomer implements CustomerLogger{
	protected Image locationMap; 
	
	public ConcreteCustomer(City city){
		locationMap = new Image(city);
	}
	
	@Override
	public void logCustomerInfo(String cutomerId, String firstName, String lastName) {
		System.out.println("Cutomer details::cutomerId"+cutomerId+" firstName::"+firstName+" lastName::"+lastName);
		
	} 
}
