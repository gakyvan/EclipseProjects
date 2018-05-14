package w1d22;

public class Row implements IRow{

	private int value = 13;

	@Override
	public void modifyValue(int value) {
		this.value = value;	
	}

	@Override
	public int retrieveValue() {
		return value;
	}
	
	
}
