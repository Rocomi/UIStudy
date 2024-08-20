package com.kh.practice.run;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;



public class PolyRun {

	public static void main(String[] args) {
		
		Book[] b = new Book[10];
		
		b[0] = new AniBook("귀칼", "탄지로", "니혼사", 18);
		b[1] = new AniBook("슬램덩크", "강백호", "니뽄사", 15);
		b[2] = new AniBook("원피스", "루피", "니뽕사", 15);
		b[3] = new AniBook("나루토", "나루토", "릐뻔사", 12);
		b[4] = new AniBook("블리치", "누구지얘", "일점사", 18);
		b[5] = new CookBook("집밥", "백종원", "집식사", true);
		b[6] = new CookBook("한식", "김풍", "한식사", true);
		b[7] = new CookBook("양식", "최승원", "양식사", false);
		b[8] = new CookBook("일식", "다마고치", "일식사", false);
		b[9] = new CookBook("중식", "이연복", "중식사", true);
		
		String title = "집밥";
		
		for (int i = 0; i < b.length; i++) {
			if (b[i].getTitle().equals(title)) {
				System.out.println(b[i].toString());
				break;
			}
		}
	

	}

}
