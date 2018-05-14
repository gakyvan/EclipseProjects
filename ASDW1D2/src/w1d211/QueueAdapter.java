package w1d211;

public class QueueAdapter implements QueueInterface {
  private Adaptee adaptee;
	@Override
	public void queue(String str) {
		adaptee.add(str);
		
	}

	@Override
	public String dequeue() {
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
