package com.asd.designpattern.templatemethod;

import java.util.Date;

public class Client {
	public static void main(String[]args) {
		IOrder order=new Order(1, new Date(), "LENOVO E470", 690, 2);
		AOrderProcessor orderProcessor=new OrderProcessor();
		orderProcessor.processOrder(order);
	}
}
