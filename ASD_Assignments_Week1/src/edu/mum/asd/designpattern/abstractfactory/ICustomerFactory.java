package edu.mum.asd.designpattern.abstractfactory;

public interface ICustomerFactory {
	GiftItem getGiftItem(PackageType type);

}
