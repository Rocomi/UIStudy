package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

// 화면(view)용 클래스 --> 사용자에 데이터를 표시(출력)하거나 입력을 받는 역할
public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public void mainMenu() {

		System.out.println("== Welcome KH Library ==");

		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가"); // insertBook () 실행
			System.out.println("2. 도서 전체 조회"); // selectList ()
			System.out.println("3. 도서 검색 조회"); // searchBook ()
			System.out.println("4. 도서 삭제"); // deleteBook ()
			System.out.println("5. 도서 명 오름차순 정렬"); // ascBook()
			System.out.println("9. 종료"); // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (num) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				System.out.println();
				break;
			}

		}
	}

	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {

		String category = " ";
		while (true) {
			System.out.println("===== 새 도서 추가 =====");
			System.out.println("책 정보를 입력해주세요.");
			System.out.print("도서 명 : ");
			String title = sc.nextLine();
			System.out.print("저자 명 : ");
			String author = sc.nextLine();

			System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
			int cat = sc.nextInt();
			sc.nextLine();

			switch (cat) {
			case 1:
				category = "인문";
				break;
			case 2:
				category = "자연과학";
				break;
			case 3:
				category = "의료";
				break;
			case 4:
				category = "기타";
				break;
			default:
				System.out.println("다시 입력해주세요.");
				System.out.println();
				continue;
			}
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println();

			Book bk = new Book(title, author, category, price);
			// 배열 사용

			bc.insertBook(bk);
			return;
			
			/*
			 * 문자열 split() 사용...  
			 *
			 * String categories = "인문,자연과학,의료,기타";
			 * Book b3 = new Book(title, author, categories.split(","), price);
			 *
			 */
		}
	}

	// 2. 도서 전체용 view 메소드
	public void selectList() {

		ArrayList<Book> bookList = bc.selectList();
		
		System.out.println("===== 도서 전체 조회 =====");
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			System.out.println();
		} else {
			for (int i = 0; i < bookList.size(); i++) {

				System.out.println(bookList.get(i)); 
				
			}
		}

	}

	// 3. 도서 검색용 view 메소드
	public void searchBook() {

		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String key = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(key);

		if (searchList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			System.out.println();
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(bc.selectList().get(i)); 
			}
			//for (Book b : searchList){
			//System.out.println(b);}

		}

	}

	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {

		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 :");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 :");
		String author = sc.nextLine();
		System.out.println();

		Book remove = bc.deleteBook(title, author);
		
		
		if (remove != null) { 			
			System.out.println("성공적으로 삭제되었습니다.");
			System.out.println();
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			System.out.println();
		}

	}

	// 5. 도서 명 오름차순 정렬용 view 메소드
	public void ascBook() {
		
		int result = bc.ascBook();
		if (result == 1) {
			System.out.println("정렬에 성공하였습니다.");
			System.out.println();
		}

		else {
			System.out.println("정렬에 실패하였습니다.");
			System.out.println();
		}
	}

}
