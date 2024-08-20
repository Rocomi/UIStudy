package com.kh.practice.chap01;

import java.util.Scanner;

public class memo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력해 주세요 : ");
		
		String idnum = sc.next();
		
		if (idnum.length() != 14) {
			System.out.println("잘못 입력되었습니다.");
		}
		else if (idnum.charAt(6) != '-') {
			System.out.println("잘못된 형식입니다.");
		}
		else if (idnum.charAt(7) == '1' ||
					idnum.charAt(7) == '3') {
			System.out.println("남자입니다.");
		}
		else if (idnum.charAt(7) == '2' ||
					idnum.charAt(7) == '4') {
			System.out.println("여자입니다.");
		}
		
//	----------------------------------------------------------------------
		
		System.out.print("월을 입력해 주세요 : ");
		
		int month = sc.nextInt();
		
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("31일");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("30일");
				break;
			case 2 :
				int ran = (int)(Math.random()*2);
				System.out.print(28 + ran + "일");
				break;
			
		
			default :
			System.out.print("1 ~ 12월만 입력해 주세요.");
			}
//		-----------------------------------------------------	
			
/*		int i;							//구구단 세로
			int j;
			
			for (i=1; i < 10; i++) {
				for(j=1; j < 10; j++) {
					System.out.print(j + " x " + i + " = " + i*j + "\t");
				}
				System.out.print("\n");
				}*/

	}

}

//Q1. 주민번호를 입력받아 남자인지, 여자인지 출력하기 (입력 형식: 000000-0000000)
//단, 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다." 출력
//( hint ) 문자열의 길이를 확인하는 메소드 : length()


//Q2. 월을 입력받아 입력받은 월의 마지막 날을 출력하기
//1, 3, 5, 7, 8, 10, 12 => 31일
//4, 6, 9, 11            => 30일
//2                       => 28일 또는 29일 (둘 중 하나의 값을 출력!)