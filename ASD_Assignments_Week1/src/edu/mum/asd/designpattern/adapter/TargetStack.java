package edu.mum.asd.designpattern.adapter;

public interface TargetStack {
	public void push(String msg);

	public String pop();

	public boolean isEmpty();
}
