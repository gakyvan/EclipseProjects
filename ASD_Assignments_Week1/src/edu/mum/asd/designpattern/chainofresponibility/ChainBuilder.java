package edu.mum.asd.designpattern.chainofresponibility;

public class ChainBuilder {
	
	private CallRecordHandler handler;
	
	private void buildChain() {
		CallRecordHandler validator=new CallRecordValidatorHandler();
		CallRecordHandler dataWasher=new CallRecordDataWasherHandler();
		CallRecordHandler reporter=new CallRecordReporterHandler();
		validator.successor=dataWasher;
		dataWasher.successor=reporter;
		handler=validator;
	}
	
	public CallRecordHandler getHandler() {
		buildChain();
		return handler;
	}
}
