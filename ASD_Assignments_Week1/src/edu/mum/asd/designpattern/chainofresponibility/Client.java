package edu.mum.asd.designpattern.chainofresponibility;

public class Client {

	public static void main(String[] args) {
		// Declaring address
		Address fairfield=new Address("1000 N 4th ST", "FAIRFIELD", "IOWA", "52557");
		Address denver=new Address("UNIVERSITY BOULEVARD 5th ST", "DENVER", "COLORADO", "55557");

		// Agents
		Agent agent1=new Agent("AGNT001", "PRAKASH RAI", fairfield);
		Agent agent2=new Agent("AGNT002", "TEMESGEN Hapte", denver);
		
		//Customers
		Customer customer1=new Customer("Yvan", "GAKUBA", "ygakuba@mum.edu", "641-980-4138", fairfield);
		Customer customer2=new Customer("Rupendra","Maharjan", "rmaharjan@mum.edu","643-984-4938", denver);
		Customer customer3=new Customer("Mafrel","KARKI", "mkarki@mum.edu","640-984-4938", null);
		
		//CallRecord
		CallRecord c1=new CallRecord(customer1, agent1, "My sales were high this past week and things are going good");
		CallRecord c2=new CallRecord(customer2, agent2, "My Sales were low this past week and i hope they will go high next week");
		CallRecord c3=new CallRecord(customer3, agent2, "My Sales are not moving nowadays.");
		
		ChainBuilder cb=new ChainBuilder();
		cb.getHandler().callRecordHandler(c1);
		cb.getHandler().callRecordHandler(c2);
		cb.getHandler().callRecordHandler(c1);
		cb.getHandler().callRecordHandler(c3);
	}

}
