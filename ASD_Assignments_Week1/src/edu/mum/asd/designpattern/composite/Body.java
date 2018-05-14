package edu.mum.asd.designpattern.composite;

public class Body extends Component {

	public Body(String name){
		super(name);
		
	}
	@Override
	public void print() {
		for(Component item: list){
			item.print();
		}
		
	}

}
