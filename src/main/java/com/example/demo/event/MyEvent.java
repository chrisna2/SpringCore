package com.example.demo.event;

public class MyEvent{
	
	private int data;
	private Object source;
	
	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public Object getSource() {
		return source;
	}

}
