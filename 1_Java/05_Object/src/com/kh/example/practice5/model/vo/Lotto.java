package com.kh.example.practice5.model.vo;

public class Lotto {

	private int[] lotto = new int[6];

	public Lotto() {

	}

	public void lotto() {

		for (int i = 0; i < 6; i++) {

			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}

	public void information() {

		/*
		 * 향상된 for문/foeach문 : 배열의 첫번째 위치부터 마지막 위치까지 순서대로 데이터에 접군 for (자료형 변수명 : 배열명) {}
		 * -->
		 */
		for (int num : lotto) {
			System.out.print(num + " ");

		}
		System.out.println();

		for (int i = 0; i < 6; i++) {

			System.out.print(lotto[i]);
			if (i < 6) {
				System.out.print(" ");

			}
		}
	}
}
