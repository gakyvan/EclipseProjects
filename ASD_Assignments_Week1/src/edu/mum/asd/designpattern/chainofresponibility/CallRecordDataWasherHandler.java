package edu.mum.asd.designpattern.chainofresponibility;

public class CallRecordDataWasherHandler extends CallRecordHandler{

	@Override
	public void callRecordHandler(CallRecord callRecord) {
		System.out.println("Step 2: Call Record Washed.");
		callRecord.setSalesLead(true);
		successor.callRecordHandler(callRecord);
	}

}
