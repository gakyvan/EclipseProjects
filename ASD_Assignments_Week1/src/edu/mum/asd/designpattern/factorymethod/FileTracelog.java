package edu.mum.asd.designpattern.factorymethod;

public class FileTracelog implements Trace {

	private boolean debug= false;
	private String message;
	private String errMessage;
	
	public FileTracelog(boolean debug, String message, String errMessage){
		this.debug=debug;
		this.message= message;
		this.errMessage=errMessage;
		
	}
	
	
	
	@Override
	public void setDebug(boolean debug) {
		System.out.println(debug);
		
	}

	@Override
	public void debug(String message) {
		System.out.println(message);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	public String toString(){
		return "Heyy This is a file .... having " + debug + " " +
				message + " " + errMessage;
	}
}
