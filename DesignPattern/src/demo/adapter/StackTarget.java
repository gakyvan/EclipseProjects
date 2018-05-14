package demo.adapter;

public interface StackTarget {
	
	public void push(String value);
	
	public String pop();
	
	public String peek();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
}
