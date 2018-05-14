package w1d6_1;

public class ValidatorAgent extends AbstractAgent {

	private CallRecord cr;
	private Customer cu;
	
	@Override
	public void handleRequest(CallRecord cust) {
		Customer cu= cust.getCustomer();
		if(cu.getFirstName()==" "){
			cust.setValid(false);
			
			}
		//else {cr.setValid(true);}
		if(cu.getLastName()==" "){
			cust.setValid(false);
			
			}
		//else {cr.setValid(true);}
		if(cu.getAddress()==null){
			cust.setValid(false);
			
			}
		//else {cr.setValid(true);}
		if(cu.getEmail()==" "){
			cust.setValid(false);
			
			}
		//else {cr.setValid(true);}
		if(cu.getPhone()==" "){
			cust.setValid(false);
			
			}
		else {
			cust.setValid(true);}
		this.nextAgent.handleRequest(cust);
		
	}

}
