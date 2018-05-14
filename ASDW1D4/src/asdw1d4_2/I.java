package asdw1d4_2;

public class I extends Component{
	public I(String name, String otherInfo){
		super(name, otherInfo);
		
	}
	@Override
	public void print() {
		System.out.println("Leaf I" + componenetName +
				"OtherInfo" + otherInfo +"]");
		
	}
}
