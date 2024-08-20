package com.kh.practice.book.view;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;
import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;

	public BookMenu() {

		bc.makeFile();
		bArr = bc.fileRead();
	}

	public void mainMenu() {

		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("3. 저장 도서 전체삭제");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 3:
				fileDelete();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}

	}

	public void fileSave() {

		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		sc.nextLine();

		String[] s = date.split("-");

		Calendar c = Calendar.getInstance(); // 둘다 같은 값
		// c.set(Integer.parseInt(s[0]), Integer.parseInt(s[1])-1,
		// Integer.parseInt(s[2]));
		c.set(Calendar.YEAR, Integer.parseInt(s[0]));
		c.set(Calendar.MONTH, Integer.parseInt(s[1]) - 1); // 월 데이터를 0부터 저장함
		c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(s[2]));

		Book b = new Book(title, author, price, c, discount);
		// Book 객체에 담기 --> 테이터를 사용하여 Book 객체 생성

		for (int i = 0; i < bArr.length; i++) {

			if (bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		bc.fileSave(bArr);
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달

	}

	public void fileRead() {
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출

		Book[] bList = bc.fileRead();
		for (Book b : bList) {
			if (b != null) {
				System.out.println(b);
			}
		}
	}

	public void fileDelete() {
		
		File file = new File("book.txt");

		if (file.exists()) {
			file.delete();
				System.out.println("파일삭제 성공");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}
}
