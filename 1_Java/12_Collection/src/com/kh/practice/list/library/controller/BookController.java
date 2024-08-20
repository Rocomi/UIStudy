package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

// 제어(controller)용 클래스 --> 사용자의 요청에 따라 작업을 제어(수행)한 후 결과를 전달하는 역할
public class BookController {

	private List<Book> list = new ArrayList<>();

	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 27000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));

	}

	public void insertBook(Book bk) {
		list.add(bk);
	}

	public ArrayList<Book> selectList() {
		// 해당 리스트의 주소값 반환 --> 현재 컨드롤러에서 사용중인 리스트의 참조변수를 반환
		return (ArrayList<Book>)list; // 주소값 반환
	}

	public ArrayList<Book> searchBook(String keyword) {

		ArrayList<Book> searchList = new ArrayList<Book>();
		
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;

	}

	public Book deleteBook(String title, String author) {

		Book removeBook = null;

		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				return removeBook = list.remove(i);		//remove (index) 리스트에서 해당 인덱스 위치의 객체를 반환
			}
		
		return removeBook;

	}

	public int ascBook() {
		//책이름으로 오름차순 정렬 후 1 반환
		
		//ArratList에 담긴 객체인 Book클래스에 compareTO\o 메소드 재정의 하여 정렬
		
		Collections.sort(list);		/** 강사님 풀이 */
		
		return 1;
	}
		
		
		
/*		Collections.sort(list, new Comparator<Book>() {   /** 내풀이 

			@Override
			public int compare(Book o1, Book o2) {
				
				return Integer.compare(o1.getTitle().charAt(0), o2.getTitle().charAt(0));
			}
		});
		return 1;
	}
*/
}
