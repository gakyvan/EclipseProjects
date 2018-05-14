package asdw1d5_2;

public abstract class AbstractBox {
	private String name;
	private double money;
	
	public void setName(String newName){
		name=newName;
	}
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getName(){
		return name;
	}

}
