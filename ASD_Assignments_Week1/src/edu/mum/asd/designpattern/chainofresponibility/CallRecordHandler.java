package edu.mum.asd.designpattern.chainofresponibility;

public abstract class CallRecordHandler {

	protected CallRecordHandler successor;

	public abstract void callRecordHandler(CallRecord callRecord);

}
