package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {

	private BookDAO bd = new BookDAO();

	public void makeFile() {
		// “book.txt”를 매개변수로 받는 File 
		// 객체를 생성하여 book.txt가 없다면 파일 생성 (createNewFile)
		File f = new File("book.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}

	public Book[] fileRead() {
		return bd.fileRead();
	}
}
