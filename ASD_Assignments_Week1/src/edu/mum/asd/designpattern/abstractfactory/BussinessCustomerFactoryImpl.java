package edu.mum.asd.designpattern.abstractfactory;

public class BussinessCustomerFactoryImpl implements ICustomerFactory {

	@Override
	public GiftItem getGiftItem(PackageType type) {
		GiftItem item= null;
		switch(type){
		case BAG:
			item=  new GiftItem("Mercant Collection", type.toString(), 0.5f);
		break;
		case BOX:
			item = new GiftItem("Hard Plastic", type.toString(), 1f);
			break;
			
		case WRAP:
			item= new GiftItem("Holiday Surprise", type.toString(), 0.25f);
		}
		return item;
	}

}
