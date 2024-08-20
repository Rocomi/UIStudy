package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
	bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
	bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
	bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
	bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
	bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		this.mem = mem;
	}
	
	public Member myInfo() {
		// 회원 레퍼런스(mem) 주소 값 리턴		
		return mem;
	}
	
	public Book[] selectAll() {
		// 도서 목록 레퍼런스(bList) 주소 값 리턴		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
//		전달받은 키워드가 포함된 도서가 여러 개가 존재할 수 있으니 검색된 도서를 담아줄 Book 객체 배열을 새로이 생성하고
//		for문을 통해 bList 안의 도서들과 전달받은 키워드를 비교하여 포함하고 있는 경우 새로운 배열에 차곡차곡 담기
//		→ 그 배열 주소 값 리턴
		Book[] b = new Book[5];
		int count = 0;
		
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		for (int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				b[count] = bList[i];
				count++;
			}
		}
		
		return b;
	}
	
	public int rentBook(int index) {

		int result = 0;
		
		if(bList[index] instanceof AniBook) {			
			if (mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result = 1;
			}
			
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				result = 2;
				mem.setCouponCount(mem.getCouponCount()+1);
			}
		}
	
		return result;
	}

}
