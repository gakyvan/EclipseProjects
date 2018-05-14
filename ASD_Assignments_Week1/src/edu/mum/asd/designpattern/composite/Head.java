package edu.mum.asd.designpattern.composite;

public class Head extends Component {
	public Head(String name){
		super(name);
		
	}
	@Override
	public void print() {
		for(Component item: list){
			item.print();
		}
		
	}

}
