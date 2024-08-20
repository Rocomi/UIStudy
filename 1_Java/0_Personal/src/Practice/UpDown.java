package Practice;

import java.util.Scanner;

public class UpDown {

	public void title1() {

		System.out.println("업 다운 게임");

	}

	// --------------------------------------------------------

	public void game1() {
		
		long beforeTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		int rnum = (int) (Math.random() * 100+1);
		
		while (true) {

			System.out.print("1~100 까지의 숫자 : ");
			int num = sc.nextInt();

			if (num < rnum) {
				System.out.println("                   up");
				continue;
			} else if (num > rnum) {
				System.out.println("                   down");
				continue;
			} else {
				System.out.println("	정답입니다!");
				break;
			}
		}
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		double secDiffTime = (afterTime - beforeTime)/1000.00; //두 시간에 차 계산
		System.out.println("***클리어 시간 : "+secDiffTime+"초***" );
	}
}
