package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	public Student() {
		
	}
	
	public void studentInfor(int grade, int classroom, 
			String name, double height, char gender) {
		
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
		
	}
		
	public void information() {
		System.out.printf("%d학년 %d반 %s의 키는 %.1f이고 %c자 입니다."
				, grade, classroom, name, height, gender);
	}

}
