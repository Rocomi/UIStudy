package com.kh.practice;

public class ApplePhone implements Phone {
	
	public void call(String number) {
		System.out.println("ApplePhone...");
		System.out.println("Call..."+number);
	}

}
