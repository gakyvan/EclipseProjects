package edu.mum.asd.designpattern.factorymethod;

public class Test {
	
	public static void main(String[] args){
		Factory factory= SimpleTraceFactory.getFactory();
		Trace trace=factory.createTrace("console");
		Trace trace1=factory.createTrace("trace.log");
		
		
		//System.out.print(trace.debug("It is Console"));
		System.out.println(trace.toString());
		System.out.println(trace1.toString());
	}

}
