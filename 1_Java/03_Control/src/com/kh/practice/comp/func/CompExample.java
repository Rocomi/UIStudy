package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 0; i < num; i++)

				if (i % 2 == 0) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
		} else {
			System.out.print("양수가 아닙니다.");
		}

	}

//	-----------------------------------------
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 0; i < num; i++)

					if (i % 2 == 0) {
						System.out.print("박");
						continue;
					} else {
						System.out.print("수");
						continue;
					}
			} else {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			break;
		}
	}

//	-----------------------------------------
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String text1 = sc.next();

		System.out.print("문자 : ");
		String text2 = sc.next();

		int TEXT_LENGHT = text1.length();

		int j = 0;

		for (int i = 0; i < TEXT_LENGHT; i++) {
			////
			if (text2.charAt(0) == text1.charAt(i)) {

				if (i != TEXT_LENGHT - 1) {
					j++;
				} else {
					j++;
					System.out.println(text1 + " 안에 포함된 " + text2 + " 개수 : " + j);

					break;

				}
			} else {
				if (i != TEXT_LENGHT - 1) {

				} else {
					System.out.println(text1 + " 안에 포함된 " + text2 + " 개수 : " + j);
				}
			}

		}

	}

	// -----------------------------------------
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		CompExample ce = new CompExample();

		System.out.print("문자열 : ");
		String text1 = sc.next();

		System.out.print("문자 : ");
		String text2 = sc.next();

		int TEXT_LENGHT = text1.length();

		int j = 0;

		for (int i = 0; i < TEXT_LENGHT; i++) {
			////
			if (text2.charAt(0) == text1.charAt(i)) { /// 마지막글자 다르면 실행이안됨

				if (i != TEXT_LENGHT - 1) {
					j++;
				} else {
					j++;
					System.out.println(text1 + " 안에 포함된 " + text2 + " 개수 : " + j);
					System.out.print("더 하시겠습니까? (y/n) : ");

					String yon = sc.next();

					if (yon.equals("y")) {

						ce.practice4();

					} else if (yon.equals("n")) {
						break;
					}
				}

			} else {
				if (i != TEXT_LENGHT - 1) {

				} else {

					System.out.println(text1 + " 안에 포함된 " + text2 + " 개수 : " + j);
					System.out.print("더 하시겠습니까? (y/n) : ");

					String yon = sc.next();

					if (yon.equals("y")) {

						ce.practice4();

					}

				}

			}
		}

	}

	// -----------------------------------------
	public void practice5() {
		Scanner sc = new Scanner(System.in);
	}

//	-----------------------------------------
	public void practice6() {
		Scanner sc = new Scanner(System.in);
	}
}
