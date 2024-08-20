package com.kh.practice;

public class GenericExtendsRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(12345);
		print(3.1415926535897);
//		print("LOL!!"); //String 클래스는 Number 클래스를 상속받지 않음
	}

	// 제네릭 메소드 정의 : Number 클래스의 상속받은 클래스만 타입으로 받는 메소드
	//					전달된 값을 콘솔창에 출력하는 기능 (print)
	public static <T extends Number> void print(T o) {
		
		System.out.println(o);
		
	}

	
}
