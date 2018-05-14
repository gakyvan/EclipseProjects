package edu.mum.asd.designpattern.templatemethod;

import java.util.ArrayList;

public abstract class AlphabetDesign {

    
	public abstract ArrayList<String> FullImage(String type, ArrayList<String> array );
	
	public final void printFullImage(String type, ArrayList<String> mine){
		ArrayList<String> str= FullImage(type, mine);
		drowFullImage(str);
		
	}
	
	public abstract void drowFullImage(ArrayList<String> str);
	
}
