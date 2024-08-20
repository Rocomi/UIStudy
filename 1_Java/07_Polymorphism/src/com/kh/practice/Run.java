package com.kh.practice;

public class Run {

	public static void main(String[] args) {
		
		Phone p1 = new AndroidPhone();
		p1.call("010-1234-5678");
		
		Phone p2 = new ApplePhone();
		p2.call("010-8765-4321");

	}

}
