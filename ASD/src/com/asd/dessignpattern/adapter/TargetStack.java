package com.asd.dessignpattern.adapter;

public interface TargetStack {
	public void push(String msg);

	public String pop();

	public boolean isEmpty();
}
