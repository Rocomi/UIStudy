package com.kh.practice;

// 인터페이스 구현(상속)시 "implements" 키워드 사용
public class AndroidPhone implements Phone {
	
	public void call(String number) {
		System.out.println("AndroidPhone...");
		System.out.println("Call..."+number);
	}

}
