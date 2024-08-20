package com.kh.example.practice3.model.vo;

public class Circle {
	
	private static final double PI =3.14;
	private static final int radius = 1;
	
	static int rad;
	static double area;
	static double size;
	
	public Circle() {
		
	}
	public int getRad() {		//get 변수명()
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	public void incrementRadius() {
		rad++;
	}
	
	public void getAreaOfCircle() {
		area = PI * rad * rad;
		System.out.println("원의 넓이 : " + area);
	}
	
	public void getSizeOfCircle () {
		size = 2 * PI * rad;
		System.out.println("원의 둘레 : " + size);
	}

}
