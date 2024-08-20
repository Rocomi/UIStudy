package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		double score = (korean + english + math);
		
		System.out.println("총점 : " + (int)score);
		System.out.println("평균 : " + (int)(score)/3);	
		
		System.out.printf("총점 : %d\n평균 : %d\n", (int)score ,(int)(score)/3);
		
//		혹은
		int total = (int)(korean + english + math);
		
		System.out.println("\n총점 : " + total);
		System.out.println("평균 : " + (total)/3);	
		
		System.out.printf("총점 : %d\n평균 : %d", total , (total)/3);
		
	}

}
