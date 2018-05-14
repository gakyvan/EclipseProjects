package com.asd.designpattern.command;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		Person person=new Person(1, "Yvan GAKUBA", new Date(), "M");
		PersonInvoker pi=new PersonInvoker();
		pi.saveParent(person);
	}

}
