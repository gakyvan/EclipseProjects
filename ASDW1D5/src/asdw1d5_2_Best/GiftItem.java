package asdw1d5_2_Best;

import java.util.UUID;

public class GiftItem {
	
	private String giftId;
    private String giftName;
    private String description;
    private String packagingType; //"bag", "box", or "wrap".
    private float packageCost;

    public GiftItem(String giftName, String packagingType, float packageCost) {
        this.giftId = UUID.randomUUID().toString();
        this.giftName = giftName;
        this.description = "";
        this.packagingType = packagingType;
        this.packageCost = packageCost;
    }

    public float getPackageCost() {
        return packageCost;
    }

    public String getGiftId() {
        return giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public String getDescription() {
        return description;
    }

    public String getPackagingType() {
        return packagingType;
    }

    @Override
    public String toString() {
        return "GiftItem{" +
                "giftId='" + giftId + '\'' +
                ", giftName='" + giftName + '\'' +
                ", description='" + description + '\'' +
                ", packagingType='" + packagingType + '\'' +
                ", packageCost=" + packageCost +
                "}\n";
    }

}
