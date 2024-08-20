package com.kh.game.list;

import java.util.Scanner;

import com.kh.model.vo.User;

public class UpAndDown {
	
	private User u;

	public UpAndDown(User user) {

		System.out.println("업 다운 게임");
		u = user;
		game();
	}

	// --------------------------------------------------------

	public void game() {

		long beforeTime = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		int rnum = (int) (Math.random() * 100 + 1);
		int count = 0;
		
		while (true) {
			
			System.out.println("남은횟수 : " +(10-count) );
			
			System.out.print("1~100 까지의 숫자 : ");
			int num = sc.nextInt();

			if (num < rnum) {
				System.out.println("                   up");
				count++;
			} else if (num > rnum) {
				System.out.println("                   down");
				count++;
			} else {
				System.out.println("정답입니다! 10점을 획득합니다.");
				u.setScore(u.getScore()+10);	
				break;
			}
			if (count == 10) {
				System.out.println("실패 ㅠㅠ 5점 잃어버렸어요ㅜㅜ");
				u.setScore(u.getScore()-5);
				System.out.println();
				return;
			}
		}
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		double secDiffTime = (afterTime - beforeTime) / 1000.00; // 두 시간에 차 계산
		System.out.println("***클리어 시간 : " + secDiffTime + "초***");
		System.out.println();
	}
}
