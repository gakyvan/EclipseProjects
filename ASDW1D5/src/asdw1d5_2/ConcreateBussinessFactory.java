package asdw1d5_2;

public class ConcreateBussinessFactory implements AbstractFactory {

	@Override
	public AbstractBox createBox() {
		// TODO Auto-generated method stub
		return new BussinessBox();
	}

	@Override
	public AbstractBag createBag() {
		// TODO Auto-generated method stub
		return new BussinessBag();
	}

	@Override
	public AbstractWrap crerateWrap() {
		// TODO Auto-generated method stub
		return new BussinessWrap();
	}

}
