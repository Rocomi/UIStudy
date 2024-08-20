package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
//		받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
		// 면적 : PI * 반지름 * 반지름
		
		c = new Circle(x, y, radius);
		
		double a = Math.PI * radius * radius;
		
		return "면적 : " + c.toString() + a;
	}
	
	public String calcCircum(int x, int y, int radius) {
//		받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환
		// 둘레 : PI * 반지름 * 2
		c = new Circle(x, y, radius);
		
		double cir = Math.PI * radius * 2;
		
		return "둘레 : " + c.toString() + cir;
	}

}
