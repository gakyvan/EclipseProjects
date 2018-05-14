package demo.adapter;

public interface QueueTarget {

	public void enqueue(String value);
	
	public String dequeue();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
}
