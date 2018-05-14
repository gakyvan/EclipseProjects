package asdw1d5_2_Best;

import java.util.ArrayList;
import java.util.List;

public class GiftPack {
	private final List<GiftItem> giftItems= new ArrayList<>();
	private final Address shippingAddress;
    private final PackType packType;
    
    public GiftPack(Address shippingAddress, PackType packType){
    	this.shippingAddress=shippingAddress;
    	this.packType= packType;
    }
    
    public void addItem(GiftItem item){
    	giftItems.add(item);
    }
    
    public float getTotal(){
    	float total=0;
    	for(GiftItem item: giftItems){
    		total+= item.getPackageCost();
    	}
    	return total;
    }
    
    @Override
    public String toString() {
        return "GiftPack{" +
                "giftItems=" + giftItems +
                ", shippingAddress=" + shippingAddress +
                ", packType=" + packType +
                "}\n";
    }



public enum PackType{
	BUSINESS, ADULTS, KIDS
}
}
