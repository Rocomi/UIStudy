package com.kh.ch08_polymorphism;

public class Parent {
	private int x;
	private int y;
	
	public Parent() {
		super();
	}
	
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println("나는 Parent다!");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
 

}
