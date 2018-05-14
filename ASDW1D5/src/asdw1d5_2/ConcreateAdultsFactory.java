package asdw1d5_2;

public class ConcreateAdultsFactory implements AbstractFactory {

	@Override
	public AbstractBox createBox() {
		// TODO Auto-generated method stub
		return new AdultsBox();
	}

	@Override
	public AbstractBag createBag() {
		// TODO Auto-generated method stub
		return new AdultsBag();
	}

	@Override
	public AbstractWrap crerateWrap() {
		// TODO Auto-generated method stub
		return new AdultsWrap();
	}

}
