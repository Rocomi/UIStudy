package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {

	public void practice015() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");

		int num = sc.nextInt();
		int i;
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		if (num == 2) {
			System.out.println("소수입니다.");
		}

		for (i = 2; i < num; i++) {

			// 소수가 아닐경우
			if (num % i == 0) {
				System.out.println("소수가 아닙니다.");
				break;

			} else if (i == num - 1) {
				System.out.println("소수입니다.");
			}
		}
	}

// ------------------------------------------------
	public void practice016() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");

			int num = sc.nextInt();

			int i;

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			for (i = 2;; i++) {
				if (num % i != 0) {
					if (i == num - 1) {
						System.out.println("소수입니다.");
						break;
					} else {
						continue;
					}
				} else {
					System.out.println("소수가 아닙니다.");
					break;
				}

			}
			break;

		}

	}

// ------------------------------------------------
	public void practice017() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");

		int num = sc.nextInt();
		int i;
		int k = 1;
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		if (num == 2) {
			System.out.println("2");
			System.out.printf("2부터 %d까지의 소수의 개수는 %d개 입니다.", num, 1);
		}
		System.out.print("2");
		for (int j = 2; j <= num; j++) {

			for (i = 2; i < j; i++) {

				// 소수가 아닐경우
				if (j % i == 0) {
					break;
				} else if (i == j - 1) {
					System.out.print(" " + j);
					k++;
				}

			}
			if (j == num) {
				System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개 입니다.", num, k);
			}

		}
	}

// ------------------------------------------------
	public void practice018() {

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");

		int num = sc.nextInt();
		int i;
		int k = 0;

		for (int j = 1; j <= num; j++) {

			for (i = 1; i < j; i++) {
				// 소수가 아닐경우
				if (j % 2 == 0 || j % 3 == 0) {
					System.out.print(j+" ");
					break;
				}
				
			}
			for (i = 1; i < j; i++) {
				// 소수가 아닐경우
				if (j % 2 == 0 && j % 3 == 0) {
					k++;
					break;
				}
				
			}
			if (j == num) {
				System.out.printf("\ncount : %d", k);
			}

		}
	}

//	------------------------------------------------
	public void practice019() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			for (int i = num; i > j; i--) {

				System.out.print(" ");
			}

			for (int i = 1; i <= j; i++) {

				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

//	------------------------------------------------
	public void practice020() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			for (int i = 1; i <= j; i++) {

				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (int j = num - 1; j > 0; j--) {

			for (int i = 1; i <= j; i++) {

				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

//	------------------------------------------------
	public void practice021() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			for (int i = num; i > j; i--) {

				System.out.print(" ");
			}

			for (int i = 1; i < j * 4 - 2; i += 2) {

				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

//	------------------------------------------------
	public void practice022() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.print("*");

		}
		System.out.print("\n");

		for (int j = 1; j <= num - 2; j++) {
			for (int i = 1; i <= num; i++) {
				if (i == 1 || i == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

		for (int i = 1; i <= num; i++) {

			System.out.print("*");

		}

	}

//	------------------------------------------------
	public void practice() {

	}
}