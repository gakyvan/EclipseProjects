package edu.mum.asd.builderpattern;

public interface RequestBuilder {
	
	public void openingInfoBuilder(Call call, String phoneNumber);
	
	public void contentInfoBuilder(String reqContent, String reqResponse);
	
	public void closingInfoBuilder(boolean saleLead, boolean needCallBack);
	
	public Request getRequest();

}
