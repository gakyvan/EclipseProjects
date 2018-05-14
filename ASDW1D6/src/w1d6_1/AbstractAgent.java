package w1d6_1;

public abstract class AbstractAgent {
	
	protected AbstractAgent nextAgent;
	protected void nextAgent(AbstractAgent ag){
		this.nextAgent= ag;
		
	}
	abstract public void handleRequest(CallRecord req);
	

}
