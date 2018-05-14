package com.asd.designpattern.templatemethod;

public class OrderProcessor extends AOrderProcessor{

	@Override
	public float getShippingFee(IOrder order) {
		return 20* order.getItemNumber();
	}

	@Override
	public int getShippingTime(IOrder order) {
		return 8;
	}

	@Override
	public void sendConfirmation(String orderDetails, float shippingFee, int shippingTime) {
		System.out.println(orderDetails+ "  "+ shippingFee+"  "+ shippingTime+"h");
	}

}
