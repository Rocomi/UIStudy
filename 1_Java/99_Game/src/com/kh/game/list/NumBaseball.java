package com.kh.game.list;

import java.util.Scanner;

import com.kh.model.vo.User;

public class NumBaseball {
	
	private User u;
	
	public NumBaseball(User user) {
		
		System.out.println("숫자야구");
		u = user;
		game();

	}

	public void game() {
		Scanner s = new Scanner(System.in);

		int numArr[] = new int[3];
		int inputArr[] = new int[3];
		int strike = 0;
		int ball = 0;
		int count = 0;

		for (int i = 0; i < numArr.length; i++) { // 랜덤숫자를 배열에 넣기
			numArr[i] = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < i; j++) {
				if (numArr[j] == numArr[i]) {
					i--;
					break;
				}
			}
		}

		while (true) {
			count++;
			System.out.print("숫자 3개를 띄어서 입력하세요 : ");
			for (int i = 0; i < inputArr.length; i++) {
				inputArr[i] = s.nextInt();
				for (int j = 0; j < i; j++) {
					if (inputArr[j] == inputArr[i]) {
						System.out.println("중복된 값을 입력했습니다.");
						i--;
						break;
					}
				}
			}

			// Strike인지 Ball인지
			for (int i = 0; i < numArr.length; i++) {
				for (int j = 0; j < inputArr.length; j++) {
					if (numArr[i] == inputArr[j] && i == j) {
						// 같은 숫자가 있고 위치도 같으면 스트라이크
						strike++;
					} else if (numArr[i] == inputArr[j] && i != j) {
						// 같은 숫자만 있으면 볼
						ball++;
					}
				}
			}

			System.out.println("\t\t\t" + strike + "S " + ball + "B");
			if (strike == 3) {
				System.out.println("정답!");
				u.setScore(u.getScore()+10);	
				break;
			}
			strike = 0;
			ball = 0;

			if (count == 5) {
				System.out.println("실패!");
				u.setScore(u.getScore()-5);	
				return;
			}
		}
		System.out.println("수고하셨습니다!!!");
		System.out.println();
	}
}
