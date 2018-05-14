package asdw1d5_2_Best;

public class KidsCustomerFactoryImpl implements ICustomerFactory {

	@Override
	public GiftItem getGiftItem(PackageType type) {
		GiftItem item= null;
		switch(type){
		case BAG:
			item= new GiftItem("Micky", type.toString(), 0.25f);
			break;
			
		case BOX:
			item= new GiftItem("Cartoon", type.toString(), 0.5f);
			break;
		
		case WRAP:
			item= new GiftItem("Happy Kid", type.toString(), 0.1f);
			break;
		}
		return item;
	}
	

}
