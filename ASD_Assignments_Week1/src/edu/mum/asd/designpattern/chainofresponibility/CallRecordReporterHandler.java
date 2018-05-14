package edu.mum.asd.designpattern.chainofresponibility;

public class CallRecordReporterHandler extends CallRecordHandler{

	@Override
	public void callRecordHandler(CallRecord callRecord) {
		SalesLeadByState.addToReport(callRecord);
		SalesLeadByState.report();
	}

}
