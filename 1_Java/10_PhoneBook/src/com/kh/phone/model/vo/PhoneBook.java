package com.kh.phone.model.vo;

import java.io.Serializable;

public class PhoneBook implements Serializable {
	
	private String name;
	private String pNum;
	private String blong;
	private String eMail;
	private String Memo;
	
	public PhoneBook() {
		super();
	}
	
	public PhoneBook(String name, String pNum) {
		super();
		this.name = name;
		this.pNum = pNum;
		
	}
	
	
	public PhoneBook(String name, String pNum, String blong, String eMail, String Memo) {
		super();
		this.name = name;
		this.pNum = pNum;
		this.blong = blong;
		this.eMail = eMail;
		this.Memo = Memo;
	}
	
	public String toString() {
		
		return String.format("%s\t %s\t %s\t %s\t %s",
				name, pNum, blong, eMail, Memo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getBlong() {
		return blong;
	}

	public void setBlong(String blong) {
		this.blong = blong;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		Memo = memo;
	}
	
	
	
	
}
