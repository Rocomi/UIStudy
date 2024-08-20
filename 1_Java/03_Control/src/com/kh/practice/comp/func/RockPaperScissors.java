package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		
		for(;;i++) {
			
			int rnum = (int) (Math.random() * 3);
			
			System.out.print("\n가위바위보 : ");
			String rps = sc.next();
			
			switch (rnum) {
			case 0 :
				System.out.println("컴퓨터 : 가위");
				
				if (rps.equals("가위")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 비겼습니다.");
					k++;
				}else if(rps.equals("바위")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 이겼습니다 !");
					j++;
				}else if(rps.equals("보")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 졌습니다 ㅠㅠ");
					l++;
				}
				break;
			case 1 :
				System.out.println("컴퓨터 : 바위");
				
				if (rps.equals("가위")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 졌습니다 ㅠㅠ");
					l++;
				}else if(rps.equals("바위")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 비겼습니다.");
					k++;
				}else if(rps.equals("보")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 이겼습니다 !");
					j++;
				}
				break;
			case 2 :
				System.out.println("컴퓨터 : 보");
				
				if (rps.equals("가위")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 이겼습니다!");
					j++;
				}else if(rps.equals("바위")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 졌습니다 ㅠㅠ");
					l++;
				}else if(rps.equals("보")) {
					System.out.println("박신우 : " + rps);
					System.out.println("박신우 : 비겼습니다.");
					k++;
				}
				break;
			}
			if (rps.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", i, j, k, l);
				break;
			}
		}
		
		
	}

}
