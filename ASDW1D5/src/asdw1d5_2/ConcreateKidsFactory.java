package asdw1d5_2;

public class ConcreateKidsFactory implements AbstractFactory {

	@Override
	public AbstractBox createBox() {
		// TODO Auto-generated method stub
		return new KidsBox();
	}

	@Override
	public AbstractBag createBag() {
		// TODO Auto-generated method stub
		return new KidsBag();
	}

	@Override
	public AbstractWrap crerateWrap() {
		// TODO Auto-generated method stub
		return new KidsWrap();
	}

}
