package edu.mum.asd.builderpattern;

public class RequestDirector {
	
	private RequestBuilder builder=null;
	
	public RequestDirector(RequestBuilder builder) {
		this.builder=builder;
	}
	
	public void constructRequestBuilder(Call call, String phoneNumber, String reqContent, String reqResponse, boolean saleLead, boolean needCallBack) {
		builder.openingInfoBuilder(call, phoneNumber);
		builder.contentInfoBuilder(reqContent, reqResponse);
		builder.closingInfoBuilder(saleLead, needCallBack);
	}
	
	public Request getRequst() {
		return builder.getRequest();
	}
}