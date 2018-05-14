package com.asd.dessignpattern.adapter;

public class Adaptee {
	
	private String data[];
	private int start;
	private int end;
	
	public Adaptee() {
		data=new String[10];
		start=0;
		end=-1;
	}
	
	public String startString() {
		return data[start];
	}
	
	public String endString() {
		return data[end];
	}
	
	public boolean empty() {
		return (end==-1);
	}
	
	public void add(String msg) {
		end++;
		data[end]=msg;
	}
	
	public void remove(int pos) {
		if(empty()==false) {
			for(int i=pos; i<end; i++) {
				data[i]=data[i+1];
			}
			end--;
		}
	}
	
	public String get(int pos) {
		return data[pos];
	}
	
	public int getEnd() {
		return end;
	}
}
