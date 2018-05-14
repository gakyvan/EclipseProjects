package edu.mum.asd.designpattern.composite;

public class a extends Component{
	public a(String name, String otherInfo){
		super(name, otherInfo);
		
	}
	@Override
	public void print() {
		System.out.println("Leaf Anchor" + componenetName +
				"OtherInfo" + otherInfo +"]");
		
	}

}
