package edu.mum.asd.designpattern.factorymethod;

public interface Trace {
	
	public void setDebug(boolean debug);
	public void debug(String message);
	public void error(String message);

}
