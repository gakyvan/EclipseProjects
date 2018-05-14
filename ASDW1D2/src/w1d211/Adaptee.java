package w1d211;

public class Adaptee {
	private String[] data;
	private int start;
	private int end;
	
	public String startString(){
		return data[start];
	}
	public String endString(){
		return data[end];
	}
	public boolean empty(){
		return (end==-1);
	}
	public void add(String str){
		data[end] = str;
		
	}
	
	public void remove(int pos){
		
		for(int i=pos; i<end; i++){
			data[i] = data[i+1];
		}
	}
	public String get(int pos){
		return data[pos];
	}
	public int getEnd(){
		return end;
	}

}
