package w1d6_2;

import java.util.List;

public class Reciever {
	public List<String> boxes; 
	public String create5(Square sq){
		
		if(!sq.equals(null)){
		String fiveby5 = "*****\n*****\n*****\n"
				+ "*****\n*****\n";
		boxes.add(fiveby5);
		
		return fiveby5;
		}
		else { return null;}
	};
	public String Scale2(Square sq){
		
		if(!sq.equals(null)){
	    String scale2= "**********\n**********\n**********\n"
				+ "**********\n**********\n";
	    boxes.set(1, scale2);
	    
	    return scale2;
	    
		}
		else { return null;}
	};
	public String Moveright3(Square sq){
		if(!sq.equals(null)){
		String moveright3= "   *****\n   *****\n   *****\n"
				+ "   *****\n   *****\n";
		
		boxes.set(1,moveright3);
		
		
		return moveright3;
		
		}
		else { return null;}
	}
 
	public boolean removeCreatedBox(){
		
				boxes.remove(1);
				int i= boxes.size();
				if(i!=0){
					return false;
				}
				return true;
				
		}

	}

