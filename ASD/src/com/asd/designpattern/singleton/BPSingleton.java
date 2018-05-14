package com.asd.designpattern.singleton;

public class BPSingleton {
	
	private BPSingleton() {}
	
	//Inner class
	private static  class InnerSingleton{
		private static final BPSingleton instance=new BPSingleton();
	}
	
	public static BPSingleton getInstance() {
		return InnerSingleton.instance;
	}
}
