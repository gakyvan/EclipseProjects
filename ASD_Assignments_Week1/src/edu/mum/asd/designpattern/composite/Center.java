package edu.mum.asd.designpattern.composite;

public class Center extends Component {
	public Center(String name, String otherInfo){
		super(name, otherInfo);
		
	}
	@Override
	public void print() {
		System.out.println("Leaf Center" + componenetName +
				"OtherInfo" + otherInfo +"]");
		
	}

}
