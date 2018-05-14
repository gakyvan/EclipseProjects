package edu.mum.asd.designpattern.composite;

public class Html extends Component {

	public Html(String name){
		super(name);
		
	}
	@Override
	public void print() {
		for(Component item: list){
			item.print();
		}
		
	}

}
