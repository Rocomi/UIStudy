package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {

	private Book[] bArr = new Book[10];

	public void fileSave(Book[] bArr) {
		// 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에
		// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함

		// 1. 스트림 객체 생성
		// 2. 입력받을때(read), 출력할때(write)에 필요한 메소드 사용하여 입출력 작업
		// 3. 스트림 사용완료(close) => try~with~catch문 사용시 생략 가능
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {
			// 향상된 for문 => for(배열아이템타입(자료형) 변수명 : 배열명)
			for (Book b : bArr) {
				if (b != null) {
					oos.writeObject(b);
				} else {
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Book[] fileRead() {
		// 저장된 객체를 읽어오는 스트림인 ObjectInputStream을 가지고
		// book.txt에 저장된 객체를 필드 bArr에 저장하여 반환

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))) {
			int index = 0;
			while (true) {

				Book b = (Book) ois.readObject();

				bArr[index++] = b;

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			// EOFException 발생시 반복문 종료
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

		// 더 이상 파일에 읽을 게 없을 때 뜨는 예외인 EOFException이 발생하면
		// 예외만 잡아주고 안에는 아무 처리도 하지 않음
		return bArr;

	}
}
