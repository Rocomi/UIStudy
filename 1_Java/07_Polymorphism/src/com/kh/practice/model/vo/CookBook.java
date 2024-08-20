package com.kh.practice.model.vo;

public class CookBook {
	
	private String title;
	private String author;
	private String publisher;
	private boolean coupon;
	
	public CookBook() {
	}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.coupon = coupon;
	}
	
	public String toString() {
		return "title="+title+", author="+author+", publisher="+publisher+", coupon="+coupon;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
		

}
