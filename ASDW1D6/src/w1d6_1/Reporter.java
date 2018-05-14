package w1d6_1;

public class Reporter extends AbstractAgent {

	@Override
	public void handleRequest(CallRecord req) {
		
		System.out.println(req.toString());
		
		
	}

}
