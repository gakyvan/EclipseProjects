package edu.mum.asd.designpattern.composite;

public class H2 extends Component{
	public H2(String name, String otherInfo){
		super(name, otherInfo);
		
	}
	@Override
	public void print() {
		System.out.println("Leaf H2" + componenetName +
				"OtherInfo" + otherInfo +"]");
		
	}

}
