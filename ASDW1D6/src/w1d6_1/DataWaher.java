package w1d6_1;

public class DataWaher extends AbstractAgent {

	private CallRecord cr;
	@Override
	public void handleRequest(CallRecord req) {
		req.setASalesLead(true);
		//((CallRecord) req).setASalesLead(true);
		this.nextAgent.handleRequest(req);
		
	}

}
