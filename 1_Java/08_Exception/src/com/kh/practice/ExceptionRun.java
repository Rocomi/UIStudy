package com.kh.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {
//		exceptionTest1();
//		exceptionTest2();
		System.out.println("---start---");
		try {
			exceptionTest3();
		} catch (ValueLengthException e) {
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println("---end(무조건 출력)---");
	}

	/*
	 * 1. ArithmeticException 사용자로 부터 2개의 정수를 입력받고, 첫번째 입력된 값이 두번째 입력된 값의 배수인지 확인하여
	 * 배수인 경우에는 "x는x의 배수입니다." 출력 배수가 아닌 경우에는 "x는 x의 배수가 아닙니다." 출력 (프로그램이 정상적으로 종료될 수
	 * 있도록 시작지점에"----- start -----" 마지막지점에 "----- end -----" 출력)
	 */
	public static void exceptionTest1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("----- start -----");

		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a % b == 0 && a != 0) {
				System.out.println("x는 x의 배수입니다.");
			} else {
				System.out.println("x는 x의 배수가 아님니다.");
			}
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		System.out.println("----- end -----");
	}

	/*
	 * NegativeArraySizeException, ArrayIndexOutOfBoundsException -5 ~ 5 사이의 난수를
	 * 발생시켜 해당 난수 크기로 배열을 생성한 후에 1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력 (프로그램이 정상적으로 종료되는
	 * 것을 확인하기 위해 처음과 끝에 start, end 출력)
	 */
	public static void exceptionTest2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("----start----");
		int ranNum = (int) (Math.random() * 11 - 5);
		try {
			int a[] = new int[ranNum];

			for (int i = 0; i < a.length; i++) {
				a[i] = i + 1;
				System.out.println(a[i]);
			}
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----end----");
	}

	/*
	 * [사용자 정의 예외 클래스 만들기] - Exception 클래스 상속 - 생성자 (기본/매개변수1개->msg:String)
	 * 
	 * 사용자에게 입력받은 값의 길이가 3 이하인 경우 예외를 발생기키기! -클래스명 : ValueLengthException -
	 * main메소드에서 예외처리
	 */
	public static void exceptionTest3() throws ValueLengthException {
		Scanner sc = new Scanner(System.in);
		String v = sc.nextLine();

		if (v.length() <= 3) {
			System.out.println("----예외처리----");
			throw new ValueLengthException("입력된 길이가 3 이하. 4글자이상 입력좀");
		}

		System.out.println(v);
		System.out.println("----끝(예외시 출력 안됨)----");

	}

}
