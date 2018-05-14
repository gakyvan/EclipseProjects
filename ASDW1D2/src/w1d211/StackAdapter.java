package w1d211;

public class StackAdapter implements StackTarget {
	private Adaptee adaptee;
	
	@Override
	public void push(String str){
		adaptee.add(str);
	}

	

	@Override
	public String pop() {
		int end= adaptee.getEnd();
		String str= adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return adaptee.empty();
	}
}
