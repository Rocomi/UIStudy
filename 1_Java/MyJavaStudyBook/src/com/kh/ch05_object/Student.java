package com.kh.ch05_object;

public class Student {
	/*
	 * 접근제한자 : 접근할 수 있는 범위를 제한하는 것
	 * 
	 * 		public(+) > protected(#) > [default](~) > private(-)
	 */
	// 필드부 : [접근제한자] [예약어] 자료형 필드명;
	String name;
	int age;
	double height;
	String phone;
	String address;
	// 생성자부 : 접근제한자 클래스명([매개변수]) {}
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, double height, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.phone = phone;
		this.address = address;
	}

	// 메소드부 : [접근제한자] [예약어] 반환타입 메소드명([매개변수])
	@Override
	public String toString() {
		// 반환타입 "void"가 아닐때는 반드시 return 값; 부분이 있어야함.
		//			=> void : 반환값이 없음을 의미
		return String.format("이름 : %s 나이 : %d 키 : %f 전화번호 : %s 주소 : %s", name, age, height, phone, address);
	}
	
	
	

}
