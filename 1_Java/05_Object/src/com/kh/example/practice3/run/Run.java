package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	
	public static void main(String[] args) {
		
		Circle cc = new Circle();
		
		cc.setRad(1);
		
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
		
		cc.incrementRadius();
		
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
	}

}
