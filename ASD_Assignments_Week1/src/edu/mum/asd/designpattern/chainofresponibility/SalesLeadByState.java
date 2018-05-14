package edu.mum.asd.designpattern.chainofresponibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesLeadByState {
	
	private static Map<String, List<CallRecord>> report=new HashMap<>();
	
	public static void addToReport(CallRecord callRecord) {
		if(report.containsKey(callRecord.getCustomer().getHomeAddress().getState())) {
			report.get(callRecord.getCustomer().getHomeAddress().getState()).add(callRecord);
		}else {
			List<CallRecord>list=new ArrayList<>();
			list.add(callRecord);
			report.put(callRecord.getCustomer().getHomeAddress().getState(),list);
		}
	}
	
	public static void report() {
		for(Map.Entry<String, List<CallRecord>> entry: report.entrySet()) {
			System.out.println("State: "+ entry.getKey());
			System.out.println("__________________________________");
			for(CallRecord cr: entry.getValue()) {
				System.out.println(cr);
			}
		}
	}
}
