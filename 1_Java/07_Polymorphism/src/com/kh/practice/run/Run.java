package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.model.vo.AniBook;
import com.kh.practice.model.vo.CookBook;

public class Run {

	public static void main(String[] args) {

		AniBook[] ab = new AniBook[5];

		CookBook[] cb = new CookBook[5];

		// AniBook 5권을 배열에 초기화
		ab[0] = new AniBook("귀칼", "탄지로", "니혼사", 18);
		ab[1] = new AniBook("슬램덩크", "강백호", "니뽄사", 15);
		ab[2] = new AniBook("원피스", "루피", "니뽕사", 15);
		ab[3] = new AniBook("나루토", "나루토", "릐뻔사", 12);
		ab[4] = new AniBook("블리치", "누구지얘", "일점사", 18);

		// CookBook 5권을 배열에 초기화
		cb[0] = new CookBook("집밥", "백종원", "집식사", true);
		cb[1] = new CookBook("한식", "김풍", "한식사", true);
		cb[2] = new CookBook("양식", "최승원", "양식사", false);
		cb[3] = new CookBook("일식", "다마고치", "일식사", false);
		cb[4] = new CookBook("중식", "이연복", "중식사", true);

		// 사용자에게 책 제목을 입력받아 책 정보를 조회해보자.
		Scanner sc = new Scanner(System.in);
		System.out.print("조회하고자 하는 책 제목 입력 : ");
		String title = sc.nextLine();

		boolean found = false;
		
		for (int i = 0; i < ab.length; i++) {
			if (ab[i].getTitle().equals(title)) {
				System.out.println(ab[i].toString());
				found = true;
				break;
			}
		}

		if (!found) { // 입력된 책을 찾지 못했을 경우
			// 요리책 목록에서 찾아보기
			for (int i = 0; i < cb.length; i++) {
				if (cb[i].getTitle().equals(title)) {
					System.out.println(cb[i].toString());
					found = true;
					break;
				}
			}
		}
	}

}
