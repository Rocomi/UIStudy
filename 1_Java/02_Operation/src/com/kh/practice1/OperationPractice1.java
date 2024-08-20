package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int n2 = sc.nextInt();
		
		// 더하기 / 빼기 / 곱하기 / 나누기 몫 / 나누기 나머지 결과 출력
		System.out.printf("더하기 결과 : %d\n빼기 결과   : %d\n곱하기 결과 : %d\n나누기 결과 : %d\n나머지     : %d\n",
				n1 + n2, n1 - n2, n1 * n2, n1 / n2, n1 % n2);
		
		//한줄 공백
		System.out.println("");
		
		//혹은
		System.out.println("더하기 결과 : " + (n1 + n2));
		System.out.println("빼기 결과  : " + (n1 - n2));
		System.out.println("곱하기 결과 : " + (n1 * n2));
		System.out.println("나누기 결과 : " + (n1 / n2));
		System.out.println("나머지     : " + (n1 % n2));
	}
}
