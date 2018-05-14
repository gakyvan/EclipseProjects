package edu.mum.asd.designpattern.adapter;

public class Adapter implements TargetStack, TargetQueue{
	private Adaptee adaptee;

	public Adapter() {
		adaptee = new Adaptee();
	}

	@Override
	public void push(String msg) {
		adaptee.add(msg);

	}

	@Override
	public String pop() {
		if (!isEmpty()) {
			int pos = adaptee.getEnd();
			String msg = adaptee.get(pos);
			adaptee.remove(pos);
			return msg;
		}

		return "N/A";
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

	@Override
	public void enqueu(String str) {
		adaptee.add(str);
	}

	@Override
	public String dequeu() {
		if (!isEmpty()) {
			String msg = adaptee.get(0);
			adaptee.remove(0);
			return msg;
		}
		return "N/A";
	}

}
