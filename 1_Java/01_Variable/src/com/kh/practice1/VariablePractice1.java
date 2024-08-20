package com.kh.practice1;

import java.util.Scanner; //import 현재 클래스 경로 외의 클래스 사용할때 선언문

public class VariablePractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //입력받을떄 도와주는 class = scanner, new = 생성
		
		System.out.print("이름을 입력하세요 : ");
		
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 : ");
		
		String gender = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		
		double h = sc.nextDouble();
		
		System.out.println("키 " + h + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다!");
		
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다!\n", h, age, gender, name); //출력 메소드 줄바꿈X, 출력값 대입
		                                                   // \n->줄바꿀때 사용
		System.out.println("수고하세요");
	}
}
