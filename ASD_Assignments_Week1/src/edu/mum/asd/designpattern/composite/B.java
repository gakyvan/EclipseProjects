package edu.mum.asd.designpattern.composite;

public class B extends Component {
	public B(String name, String otherInfo){
		super(name, otherInfo);
		
	}
	@Override
	public void print() {
		System.out.println("Leaf B" + componenetName +
				"OtherInfo" + otherInfo +"]");
		
	}


}
