package com.kh.practice2;

import java.util.Scanner; 

public class VariablePractice2 {
	
	public static void main(String[] args) {
		
		// 사용자로부터 문자열로 입력받기 위함 문자열 입력 받음 => Scanner
		Scanner sc = new Scanner(System.in); 
		
		// "문자열을 입력하세요 : "출력
		System.out.print("문자열을 입력하세요 : "); //출력
		
		String name = sc.next(); // 문자열을 입력받아 주는 메소드 : next(), nextLine() -->띄어쓰기 전까지, 전체까지
		
		// String 기능 중 문자 하나씩 꺼내오는 메소드 : charAt
		System.out.println("첫번째 문자 : " + name.charAt(0));
		System.out.println("두번째 문자 : " + name.charAt(1));
		System.out.println("세번째 문자 : " + name.charAt(2));
		
		
		char firstChar = name.charAt(0); //charAt() 메서드는 정수 인덱스 값을 매개 변수로 사용, 해당 인덱스에 있는 문자를 반환
		
		char secondChar = name.charAt(1); // 문자열의 인덱스선택하여 알파벳 지정
		
		char thirdChar = name.charAt(2);
		
		System.out.println("첫번째 문자 : " + firstChar); //출력 
		
		System.out.println("두번째 문자 : " + secondChar);
		
		System.out.println("세번째 문자 : " + thirdChar);
		 
	}

}
