package edu.mum.asd.designpattern.chainofresponibility;

import java.util.ArrayList;
import java.util.List;

public class DiscardedCallRecordUtility {
	
	private static List<CallRecord> discardedCallRecord=new ArrayList<>();
	
	public static void saveDiscardedCallRecord(CallRecord callRecord) {
		discardedCallRecord.add(callRecord);
	}
}
