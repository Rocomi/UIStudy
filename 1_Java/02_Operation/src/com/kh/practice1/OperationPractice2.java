package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		
		double length = sc.nextDouble();
		
		System.out.println("면적 : " + width * length);
		System.out.println("둘레 : " + (width + length)*2);
		
		///혹은
		System.out.printf("면적 : %.2f\n둘레 : %.1f",width * length, (width + length)*2 );
		
	}
}
