package edu.mum.asd.designpattern.abstractfactory;

public class AdultsCustomerFactoryImpl implements ICustomerFactory{

	@Override
	public GiftItem getGiftItem(PackageType type) {
		// TODO Auto-generated method stub
		GiftItem item= null;
		switch(type){
		    
		case BAG:
			item= new GiftItem("Reusable Shopper", type.toString(), 0.0f);
		    break;
		case BOX:
			item= new GiftItem("Plain Paper", type.toString(), 0.2f);
			break;
		case WRAP:
			item= new GiftItem("Everyday", type.toString(), 0.0f );
			break;
			
	}
		return item;

}
}