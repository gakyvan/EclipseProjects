package edu.mum.asd.designpattern.chainofresponibility;

public class CallRecordValidatorHandler extends CallRecordHandler{

	@Override
	public void callRecordHandler(CallRecord callRecord) {
		if(callRecord.getCustomer().getHomeAddress()!=null) {
			System.out.println("Step 1: Validated");
			callRecord.setValid(true);
			successor.callRecordHandler(callRecord);
		}else {
			System.out.println("Step 1: Not Validated");
			DiscardedCallRecordUtility.saveDiscardedCallRecord(callRecord);
		}
	}

}
