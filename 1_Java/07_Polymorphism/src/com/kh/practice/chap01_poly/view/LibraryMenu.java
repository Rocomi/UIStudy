package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
//		메인 메뉴 출력 메소드
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);

		lc.insertMember(new Member(name, age, gender));

		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				System.out.println("Member [" + lc.myInfo() + "]");
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("재입력");
				break;

			}

		}
	}

	public void selectAll() {

//		도서 전체 목록 출력 메소드
		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i + "번도서 : " + lc.selectAll()[i]);
		}

	}

	public void searchBook() {
//		검색할 제목 키워드를 입력 받아 검색 결과를 출력하는 메소드
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();

		// LibraryController의 searchBook() 에 전달
		lc.searchBook(keyword);

		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
		Book[] searchList = lc.searchBook(keyword);
		for (int i = 0; i < searchList.length; i++) {
			if (searchList[i] != null) {
				System.out.println(searchList[i]);
			}
		}
	}

	public void rentBook() {
//		대여할 도서 인덱스를 입력 받아LibraryController의 rentBook 메소드로 전달
//		→ 결과 값을 result로 받아 result가0일 경우, 1일 경우, 2일 경우 각각에
//		해당하는 출력문 출력

		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i + "번도서 : " + lc.selectAll()[i]);
		}
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();

		switch (lc.rentBook(index)) {

		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;

		}
	}

}
