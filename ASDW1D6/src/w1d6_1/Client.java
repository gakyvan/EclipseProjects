package w1d6_1;

public class Client {
	private static AbstractAgent getChainOfAgents(){
		AbstractAgent validator= new ValidatorAgent();
		AbstractAgent dataWasher = new DataWaher();
		AbstractAgent reporter = new Reporter();
		
		validator.nextAgent(dataWasher);
		dataWasher.nextAgent(reporter);
		return validator;
	}
 public static void main(String[] args){
	 
	 Address ad= new Address("1000 n 4th st","fairfield","IA","52557");
	 
	 Agent ag= new Agent("2",ad);
	 Customer cu= new Customer("John","David",ad,"653-789-4021","john@gmail.com");
	 
	 CallRecord cr= new CallRecord(cu,ag,"I want to have a nice software", false, false);
	 AbstractAgent firstAgent= getChainOfAgents();
	 firstAgent.handleRequest(cr);
 }
}
