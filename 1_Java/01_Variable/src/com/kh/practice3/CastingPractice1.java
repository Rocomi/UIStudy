package com.kh.practice3;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		// Q. 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력
		
		System.out.print("문자 : ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char a = str.charAt(0);
		
		System.out.println(str + " unicord : " + (int)a);
		
	}
}
