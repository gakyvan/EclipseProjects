package edu.mum.asd.designpattern.composite;

public class Title extends Component {

	public Title(String name, String otherInfo){
		super(name, otherInfo);
		
	}
	@Override
	public void print() {
		System.out.println("Leaf Title" + componenetName +
				"OtherInfo" + otherInfo +"]");
		
	}

}
