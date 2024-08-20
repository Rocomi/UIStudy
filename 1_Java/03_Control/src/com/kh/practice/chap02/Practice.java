package com.kh.practice.chap02;

public class Practice {

	public void method1() {
		// 1~10 출력

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1);
			if (i != 9) {
				System.out.print(" ");
			}
		}

		System.out.print("\n---------------------\n");

		for (int i = 0; i < 10; i++) {
			System.out.print(10 - i);
			if (i != 9) {
				System.out.print(" ");
			}
		}
	}

//	--------------------------------------------------------------
	public void method2() {

		// 1~10까지 총합

		int i = 0;

		for (int j = 0; j < 10; j++) // i!를 코드로 나타냄

			i += (j + 1);

		System.out.println(i);

	}

//	--------------------------------------------------------------
	public void method3() {
		// 랜덤값 까지의 총 합을 구하여 출력 ( 1~10 사이의 랜덤값)
		/*
		 * 랜덤값 구하는 방법 - Math : java.lang.Math *random() : 랜덤값을 반환해주는 메소드 => 사용법 :
		 * Math.random() 값의 범위 : 0.0~0.99999xx (0.0 <= n < 1.0) =>1~10사이의 랜덤값 :
		 * (int)(Math.random() * 10 + 1)
		 */
		int random = (int) (Math.random() * 10 + 1);
		System.out.println("랜덤값은 " + random + "입니다");
		// random 까지의 총합을 구하여 출력 (1 ~ random)

		int i = 0;

		for (int j = 0; j < random; j++) // i!를 코드로 나타냄

			i += (j + 1);

		System.out.println(i);

	}

//	--------------------------------------------------------------
	public void method4() {

		// 분기문 : break (반복문 종료시키는 분기문)

		// 1~100 사이의 랜덤값을 추출하여
		// 해당 랜덤 값이 짝수일때 반복문 종료 (종료전 "종료" 출력)
		// 홀수일 때는 해당 값을 출력

		for (;;) {
			int random = (int) (Math.random() * 100 + 1);

			if (random % 2 == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println(random);
			}
		}
//		---------------------------------혹은
		while (true) {
			int random = (int) (Math.random() * 100 + 1);

			if (random % 2 == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println(random);
			}
		}

	}

//	---------------------------------------------------------------------
	public void method5() {
		// 1부터 10까지 정수 중에 짝수만 출력
		// *continue : 반복문 내에서 실행되면 뒤의 코드를 무시하고 증감식이나 조건식으로 이동
		for (int i = 0; i < 10;) {
			i++;
			if (i % 2 == 1) {
				continue;

			} else {
				System.out.println(i);

			}

		}
	}
}
