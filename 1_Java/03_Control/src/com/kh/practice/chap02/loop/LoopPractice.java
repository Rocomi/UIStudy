package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// 입력된 값이 1보다 작을때 "1 이상의 숫자를 입력해주세요." 출력
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else { // 입력된 값이 1보다 크거나 같을때
			// 1부터 입력된 값까지 출력
			for (int i = 0; i < num;) {
				i++;
				System.out.print(i);
				if (i != num) {
					System.out.print(" ");
				}
			}

		}
	}

//	--------------------------------------------------
	public void practice2() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");

			} else {
				for (int i = 0; i < num;) {
					i++;
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}

//	--------------------------------------------------
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for (int i = num; i > 0; i--) {

				System.out.print(i);
				if (i != 1) {
					System.out.print(" ");
				}
			}
		}

	}

//	--------------------------------------------------
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			} else {
				for (int i = num; i > 0; i--) {

					System.out.print(i);
					if (i != 1) {
						System.out.print(" ");
					}
				}
				break;
			}

		}
	}

//	--------------------------------------------------
	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");

		int i = sc.nextInt();

		int sum = 0;

		for (int j = 1; j <= i; j++) { // i!를 코드로 나타냄

			sum += j;
			System.out.print(j);

			if (j != i) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
		}
		System.out.println(sum);

	}

//	--------------------------------------------------
	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");

		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");

		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {

			System.out.println("1이상의 숫자를 입력해주세요.");

		} else {
			if (num1 >= num2) {

				for (int i = num2; i <= num1; i++) {

					System.out.print(i);

					if (i != num1) {
						System.out.print(" ");
					}

				}
			} else {
				for (int i = num1; i <= num2; i++) {

					System.out.print(i);

					if (i != num2) {
						System.out.print(" ");
					}

				}

			}
		}
	}

//	--------------------------------------------------
	public void practice7() {

		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");

			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {

				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;

			} else {
				if (num1 >= num2) {

					for (int i = num2; i <= num1; i++) {

						System.out.print(i);

						if (i != num1) {
							System.out.print(" ");
						}

					}
				} else {
					for (int i = num1; i <= num2; i++) {

						System.out.print(i);

						if (i != num2) {
							System.out.print(" ");
						}

					}

				}
			}
			break;
		}
	}

//	--------------------------------------------------
	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");

		int num = sc.nextInt();

		System.out.println("===== " + num + "단 =====");

		for (int i = 1; i < 10; i++) {
			
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

	}

//	--------------------------------------------------
	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");

		int num = sc.nextInt();
		while (true) {
			if (num <= 9) {
				for (int j = num; j <= 9; j++) {
					System.out.println("===== " + j + "단 =====");

					for (int i = 1; i <= 9; i++) {
						int ans = j * i;
						System.out.printf("%d * %d = %d\n", j, i, ans);

					}
				}
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
			break;
		}
	}

//	--------------------------------------------------
	public void practice10() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("숫자 : ");

			int num = sc.nextInt();

			if (num <= 9) {
				for (int j = num; j <= 9; j++) {
					System.out.println("===== " + j + "단 =====");

					for (int i = 1; i <= 9; i++) {
						int ans = j * i;
						System.out.printf("%d * %d = %d\n", j, i, ans);

					}
				}
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			break;
		}
	}

//	--------------------------------------------------
	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int in = sc.nextInt();

		int start = num - in;

		for (int i = 0; i < 10; i++) {
			start = start + in;
			System.out.print(start);
			if (i != 10) {
				System.out.print(" ");
			}
		}

	}

//	--------------------------------------------------
	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String oper = sc.next();

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			switch (oper) {
			case "+":
				System.out.printf("%d %s %d = %d",num1, oper, num2, num1 + num2);
				continue;
			case "-":
				System.out.printf("%d %s %d = %d",num1, oper, num2, num1 - num2);
				continue;
			case "*":
				System.out.printf("%d %s %d = %d",num1, oper, num2, num1 * num2);
				continue;
			case "/":
				if(num2!=0) {
				System.out.printf("%d %s %d = %d",num1, oper, num2, num1 / num2);
				}
				else {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				}
				continue;
			case "%":
				System.out.printf("%d %s %d = %d",num1, oper, num2, num1 % num2);
				continue;
			case "exit" :
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
				
			}
			
		}
	}

//	--------------------------------------------------
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
					System.out.print("*");
			if( i == j) {
				System.out.print("\n");
			}
			}
			
		}
	}

//	--------------------------------------------------
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
					System.out.print("*");
			if( j == 1) {
				System.out.print("\n");
			}
			}
			
		}
	}

}