package asdw1d3_2;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Employee supervisor;
	private Employee staff[];
	

	public Employee(int id, Employee[] staff, Employee supervisor){
		this.id= id;
		this.staff= staff;
		this.supervisor=supervisor;
		
	
		}
		
	

	@Override
	protected Object clone(){
		
		System.out.println("I am coping the object");
		
		//staff[] myEmployee= null;
		
		
		for(int i=0; i<staff.length; i++){
			if(staff[i]!= supervisor){
				 staff[i].clone();
				 //staff.id= i;
			}
			return supervisor.clone();
		}
		return staff;
	
}
}