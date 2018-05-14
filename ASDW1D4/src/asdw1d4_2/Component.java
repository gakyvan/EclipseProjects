package asdw1d4_2;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {
	public  Collection<Component> list= new ArrayList<Component>();
	protected String componenetName;
	protected String otherInfo;
	public Component(){}
	
	public Component(String componenetName){
		this.componenetName= componenetName;
	}
	
	public Component(String componenetName, String otherInfo){
		this.componenetName= componenetName;
		this.otherInfo=otherInfo;
	}
	
	public abstract void print();
	public void addChild(Component item){
		list.add(item);
		
	}

}
