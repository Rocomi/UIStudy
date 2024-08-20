package com.kh.phone.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.phone.model.dao.PhoneBookDAO;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneBookController {
	
	private PhoneBookDAO pbd = new PhoneBookDAO();
	
	public void makePhoneBook() {
		File f = new File("PhoneBook.txt"); 
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(PhoneBook[] pArr) {
		pbd.fileSave(pArr);
	}
	
	public PhoneBook[] fileRead() {
		return pbd.fileRead();
	}

}
