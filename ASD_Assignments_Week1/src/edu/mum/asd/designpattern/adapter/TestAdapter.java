package edu.mum.asd.designpattern.adapter;

public class TestAdapter {
	public static void main(String args[]) {
		TargetQueue target=new Adapter();
		target.enqueu("Yvan");
		target.enqueu("GAKUBA");
		target.enqueu("Mina");
		System.out.println(target.dequeu());
		System.out.println(target.dequeu());
		System.out.println(target.dequeu());
	}
}
