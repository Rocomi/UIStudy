package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book bk = new Book("리액트 200제", "이정열", "정보문화사");
		bk.inform();
		
		//제목 출판사 작가 가격 할인율
		Book b2 = new Book("리액트 200제", "이정열", "정보문화사", 25000, 20.5);
//		bk.Book("리액트 200제", "이정열", "정보문화사", 25000, 20.5);
		b2.inform();
		
//		생성자 객체생성 
		
	}

}
