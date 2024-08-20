package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int menu = sc.nextInt();
		//메뉴 1을 선택했을때 => menu 변수의 값이 1과 같다면
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}//메뉴 2을 선택했을때 => menu 변수의 값이 2와 같다면
		else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}//메뉴 3을 선택했을때 => menu 변수의 값이 3과 같다면
		else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}//메뉴 4을 선택했을때 => menu 변수의 값이 4와 같다면
		else if(menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		}//메뉴 7을 선택했을때 => menu 변수의 값이 7과 같다면
		else if(menu == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}//메뉴에 없는 번호를 선택했을때
		else {
			System.out.println("없는 메뉴입니다.");
		}
	}
//---------------------------------------------------------------------------------------------------
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		int num1 = num % 2;
		if(num > 0) {
			if (num1==1) {
				System.out.print("짝수다.");
			}
			else {
				System.out.print("홀수다.");
			}
		
		}else {
			System.out.print("양수만 입력해 주세요.");
		}
		
	}
//--------------------------------------------------------------------------------------------------
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kr = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int en = sc.nextInt();
		
		 if (kr>=40 && math>=40 && en>=40) {
			 
					 if ((kr + math + en)/3 >= 60) {
						 System.out.printf
						 ("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n"
						 		+ "평균 : %.1f\n축하합니다, 합격입니다!\n",
						 		kr , math, en, kr + math + en, (double)(kr + math + en)/3);
					 }
					 else {
						 System.out.println("불합격입니다.");
					 }
		 }
		 else {
		 	System.out.println("불합격입니다.");
		 }
		
	}
//	---------------------------------------------------------------------------------------------------
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		
		switch (month) {
		case 3 :
		case 4 :
		case 5 :	
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :	
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :	
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12 :
		case 1 :
		case 2 :	
			System.out.println(month + "월은 겨울입니다.");
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}
//	---------------------------------------------------------------------------------------------------
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		String lid = "myId";
		String lpw = "myPassword12";
		
		if (id.equals(lid)) {		// .equals() 메서드 --> 객체의 내용을 비교하여 동일한지 확인하는 메서드(문자열)
			if (pw.equals(lpw)) { 			// == 연산자는 객체의 주소를 비교하여 일치하는지 확인(숫자)
			System.out.println("로그인 성공");  // 문자열의 내용은 같더라도 리터럴로 선언함과 new연산자로 선언함에 따라 주소가 다름
			}
			else {
			System.out.println("비밀번호가 틀렸습니다."); 
			}
		}
		else {
		System.out.println("아이디가 틀렸습니다.");
		}
	}
//	---------------------------------------------------------------------------------------------------
	public void practice6() {  //switch문으로 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원등급 : ");
		String grade = sc.next();
		
		if (grade.equals("관리자")) {
			System.out.println("회원관리, 게시글관리, 게시글작성, 게시글조회, 댓글작성.");
		}
		else if (grade.equals("회원")) {
			System.out.println("게시글작성, 게시글조회, 댓글작성.");
		}
		else if (grade.equals("비회원")) {
			System.out.println("게시글조회.");
		}
	}
//	---------------------------------------------------------------------------------------------------
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를입력해주세요 : ");
		double h = sc.nextDouble();
		
		System.out.print("몸무게(kg)를입력해주세요 : ");
		double w = sc.nextDouble();
		
		double bmi = w/(h*h);
		
		System.out.println("BMI 지수 : "+ bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}
		else if (bmi < 23) {
			System.out.println("정상체중");
		}
		else if (bmi < 25) {
			System.out.println("과체중");
		}
		else if (bmi < 30) {
			System.out.println("비만");
		}
		else if (bmi >= 30) {
			System.out.println("고도비만");
		}
	}
//	---------------------------------------------------------------------------------------------------
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를입력(+,-,*,/,%) : ");
		String cal = sc.next();
		
		
		if (num1 > 0 && num2 >0) {																//    switch(cal) {
			if(cal.equals("+")) {																//		case "+" :
				System.out.printf("%d %s %d = %d", num1, cal, num2, (num1 + num2));				//			System.out.printf("%d %s %d = %d", num1, cal, num2, (num1 + num2))
			}																					//			break;
			else if(cal.equals("-")) {															//		case "-" :
				System.out.printf("%d %s %d = %d", num1, cal, num2, (num1 - num2));				//			System.out.printf("%d %s %d = %d", num1, cal, num2, (num1 - num2))
			}																					//			break;
			else if(cal.equals("*")) {															//		case "*" :
				System.out.printf("%d %s %d = %d", num1, cal, num2, (num1 * num2));				//			System.out.printf("%d %s %d = %d", num1, cal, num2, (num1 * num2))
			}																					//			break;
			else if(cal.equals("/")) {															//		case "/" :
				System.out.printf("%d %s %d = %f", num1, cal, num2, ((double)num1 / num2));		//			System.out.printf("%d %s %d = %f", num1, cal, num2, ((double)num1 / num2))
			}																					//			break;
			else if(cal.equals("%")) {															//
				System.out.printf("%d %s %d = %f", num1, cal, num2, ((double)num1 % num2));		//		default :
			}																					//			System.out.println("잘못입력하셨습니다. 프로그램을종료합니다.");
			else {																				//	양쪽 다 같은 식임
				System.out.println("잘못입력하셨습니다. 프로그램을종료합니다.");
			}
		}
		else {
			System.out.println("잘못입력하셨습니다. 프로그램을종료합니다.");
		}
		
	}
//	---------------------------------------------------------------------------------------------------	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int ch = sc.nextInt();
		
		double smid = mid*2/10;
		double sfin = fin*3/10;
		double shw = hw*3/10;
		double sch = ch;
		double total = smid + sfin + shw + sch;
		
		if ((double)ch / 20 > 0.7) {
			if (total >= 70) {
				System.out.print("Pass");
			}
			else { 
				System.out.print("Fail [점수 미달]");
			}
		}
		else {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]\n",ch);
		}

	}
//	---------------------------------------------------------------------------------------------------	
	public void practice10() {
		
		ControlPractice cp = new ControlPractice();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("실행할기능을선택하세요.\n"
				+ "1. 메뉴출력\n"
				+ "2. 짝수/홀수\n"
				+ "3. 합격/불합격\n"
				+ "4. 계절\n"
				+ "5. 로그인\n"
				+ "6. 권한확인\n"
				+ "7. BMI\n"
				+ "8. 계산기\n"
				+ "9. P/F\n"
				+ "선택: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			cp.practice1();
			break;
		case 2 : 
			cp.practice2();
			break;
		case 3 : 
			cp.practice3();
			break;
		case 4 : 
			cp.practice4();
			break;
		case 5 : 
			cp.practice5();
			break;
		case 6 : 
			cp.practice6();
			break;
		case 7 : 
			cp.practice7();
			break;
		case 8 : 
			cp.practice8();
			break;
		case 9 : 
			cp.practice9();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.\n다시입력 바랍니다.");
			cp.practice10();
			break;
		}
	}	
//	---------------------------------------------------------------------------------------------------	
	public void practice11() {	
		
		ControlPractice cp = new ControlPractice();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호입력(1000~9999) : ");
		String pas = sc.next();
		
//		정수로 변환하고 싶으면 
//		int ipas = (pas.charAt(0)-'0')*1000 + (pas.charAt(1)-'0')*100 +(pas.charAt(2)-'0')*10 +(pas.charAt(3)-'0')*1;
		
		int ipas = pas.charAt(0)-'0';
		int sln = pas.length();
		
		if (sln <= 4) {
			if (sln > 3 && ipas > 0) {
				if (!(pas.charAt(0) == pas.charAt(1)) && 
						!(pas.charAt(0) == pas.charAt(2)) &&
							!(pas.charAt(0) == pas.charAt(3)) &&
								!(pas.charAt(1) == pas.charAt(2)) &&
									!(pas.charAt(1) == pas.charAt(3)) &&
										!(pas.charAt(2) == pas.charAt(3))) {
					System.out.print("성공");
				}
				else {
					System.out.println("중복값 있음");
					cp.practice11();
				}
			}
			else {
				System.out.println("실패");
				cp.practice11();
			}
		}
		else {
			System.out.println("자리수 안맞음");
			cp.practice11();
		
		}
	}
//	---------------------------------------------------------------------------------------------------	
	
	
	
	
//	---------------------------------------------------------------------------------------------------	
	
}
