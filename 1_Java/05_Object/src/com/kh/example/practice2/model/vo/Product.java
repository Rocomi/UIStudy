package com.kh.example.practice2.model.vo;

public class Product {
	
	private String name;
	private int price;
	private String brand;
	
	//생성자부
	public Product() {
		
	}
	
	//메소드부
	//pName 변수의 getter/setter
	// getter메소드 : 해당 변수의 값을 조회하는 기능을 제공하는 메소드
	
	public String getName() {		//get 변수명()
		return name;
	}
	//setter 메소드 : 해당 변수에 값을 저장하는 기능을 수행하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// information
	public void information() {
		
		System.out.println(name);
		System.out.println(price+ " 원");
		System.out.println(brand);
	}

}
