package com.kh.ch11_api;

public class API01_Math {
	public static void main(String[] args) {
		System.out.println("===== java.lang.Math =====");
		
		// abs : 절대값을 구해주는 메소드
		int n = 100;
		System.out.println("-10의 절대값 : "+ Math.abs(-10));
		System.out.println(n+ "의 절대값 : "+ Math.abs(n));
		
		// ceil : 소숫점을 올림처리 해주는 메소드
		double d = 3.141592;
		System.out.println(d + "의 값을 올림 처리 : " + Math.ceil(d));
		
		// round : 소숫점을 반올림처리 해주는 메소드
		System.out.println(d + "의 값을 반올림 처리 : " + Math.round(d));
		
		// floor : 내림(버림) 처리 해주는 메소드
		System.out.println(d + "의 값을 내림 처리 : " + Math.floor(d));
		
		// rint : 가장 가까운 정수값을 알아낸 후 실수형으로 반환해주는 메소드
		System.out.println(d + "의 값에 가까운 정수(->실수형) : " + Math.rint(d));
		System.out.println(3.7 + "의 값에 가까운 정수(->실수형) : " + Math.rint(3.7));
		
		// sqrt : 제곱근(루트) 값을 구해누는 메소드
		System.out.println("제곱근 : "+ Math.sqrt(4));
		
		// pow : 제곱값을 구해주는 메소드
		// 2의 10제곱(승)
		System.out.println("2의 10제곱 : "+ Math.pow(2, 10));
		System.out.println("====================");
		
		for(int i=0;i<=10;i++) {
			System.out.println("2의 "+i+"제곱 : "+ Math.pow(2, i));
		}
		//-------------------------------------------
		// Math math = new Math();
		/*
		 * Math : 모든 필드는 상수, 메소드는 static으로 정의되어 있음
		 * 			생성자는 private으로 되어 있음 --> 생성 불가!
		 * 
		 * 			--> 싱글톤 패턴 : 한번만 메모리 영역에 올려놓고 재사용하는 개념 (디자인패턴)
		 */
		
		
	}

}
