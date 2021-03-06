package demo.adapter;

public class Adapter implements QueueTarget, StackTarget {

	private Adaptee adaptee;

	public Adapter() {
		adaptee = new Adaptee();
	}

	@Override
	public void push(String value) {
		if (!adaptee.isFull()) {
			adaptee.addValue(value);
		} else {
			System.out.println("The Stack is Full");
		}
	}

	@Override
	public String pop() {
		if(!adaptee.isEmpty()) {
			String value = adaptee.endString();
			adaptee.removeValue(adaptee.getEnd());
			return value;
		}else {
			return "The stack is empty";
		}
	}

	@Override
	public String peek() {
		return adaptee.endString();
	}

	@Override
	public boolean isEmpty() {
		return adaptee.isEmpty();
	}

	@Override
	public boolean isFull() {
		return adaptee.isFull();
	}

	@Override
	public void enqueue(String value) {
		adaptee.addValue(value);
	}

	@Override
	public String dequeue() {
		String value = adaptee.startString();
		adaptee.removeValue(adaptee.getStart());
		return value;
	}

}
