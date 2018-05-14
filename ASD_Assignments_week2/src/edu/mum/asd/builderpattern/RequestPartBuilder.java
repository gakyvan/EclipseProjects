package edu.mum.asd.builderpattern;

public class RequestPartBuilder implements RequestBuilder {

	private Request request;

	@Override
	public void openingInfoBuilder(Call call, String phoneNumber) {
		request = new Request();
		request.setReqId(call.getRequestID());
		request.setAgent(call.getAgent());
		request.setRequester(Customer.find(phoneNumber));
		System.out.println("Opening information Completed");
	}

	@Override
	public void contentInfoBuilder(String reqContent, String reqResponse) {
		request.setReqContent(reqContent);
		if (reqResponse != null) {
			request.setRespContent(reqResponse);
		} else {
			System.out.println("Transfer to the superior agent....");
		}
	}

	@Override
	public void closingInfoBuilder(boolean saleLead, boolean needCallBack) {
		request.setSaleLead(saleLead);
		request.setNeedCallBack(needCallBack);
		request.addRequest();
	}

	@Override
	public Request getRequest() {
		return request;
	}
}