package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

	public Book() {

	}

	public Book(String title, String publisher, String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	
	public void inform() {
		
		System.out.printf("%s 책은 %s 작가가 %s 출판사에서 발행하여 %d원에 판매중입니다. "
				+ "\n할인율은 %.1f%%입니다.\n",
				title, publisher, author, price, discountRate);
		
	}

}
