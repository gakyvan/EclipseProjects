package com.asd.designpattern.templatemethod;

import java.util.Date;

public class Order implements IOrder{
	private int orderNo;
	private Date orderDate;
	private String productName;
	private double unitPrice;
	private int quantity;
	
	public Order() {}

	public Order(int orderNo, Date orderDate, String productName, double unitPrice, int quantity) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}


	@Override
	public String getOrderInformation() {
		return "#"+orderNo + " / Date: "+orderDate+" / Product Name: "+productName;
	}

	@Override
	public int getItemNumber() {
		return quantity;
	}
	
	@Override
	public double getOrderTotalAmount() {
		return quantity*quantity;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

}
