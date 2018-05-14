package edu.mum.asd.designpattern.factorymethod;

public class SimpleTraceFactory implements Factory {

	private static Factory factory= new SimpleTraceFactory();
	private SimpleTraceFactory(){};
	
	public static Factory getFactory(){
		return factory;
	}
	@Override
	public Trace createTrace(String type) {
		Trace trace= null;
		
		if(type.equals("trace.log")){
			trace= new FileTracelog(true, "trace.log", "Hey, It is file");
		}
		else if(type.equals("console")){
			trace= new ConsoleLog(true, "console", "Hey, It is console");
		}
		return trace;
	}



}