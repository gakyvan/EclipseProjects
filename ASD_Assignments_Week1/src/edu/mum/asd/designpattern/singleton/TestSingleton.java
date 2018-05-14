package edu.mum.asd.designpattern.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		singleton.setData(34);
		Singleton singleton1=Singleton.getInstance();
		System.out.println(singleton.getData());
		System.out.println(singleton1.getData());
		
		BPSingleton instanceOfBPSingleton0=BPSingleton.getInstance();
		BPSingleton instanceOfBPSingleton1=BPSingleton.getInstance();
		System.out.println(instanceOfBPSingleton0+"  "+instanceOfBPSingleton1);
	}

}
