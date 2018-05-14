package edu.mum.asd.designpattern.composite;

public class BComposit extends Component {
	public BComposit(String name){
		super(name);
		
	}
	@Override
	public void print() {
		for(Component item: list){
			item.print();
		}
		
	}

}
