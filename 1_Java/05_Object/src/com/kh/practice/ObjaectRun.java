package com.kh.practice;

public class ObjaectRun {
	
	public static void main(String[] args) {
	
	int no1 = 100;
	String name1 = "엄희윤";
	int age1 = 30;
	char gender1 = '남';
	
	int no2 = 101;
	String name2 = "임수진";
	int age2 = 25;
	char gender2 = '여';
	
	int no3 = 102;
	String name3 = "카리나";
	int age3 = 30;
	char gender3 = '여';
	
// 변수가 너무 많으므로
	
//	배열을 사용해보자
	int[] noArr = new int[3];
	String[] nameArr = new String[3];
	int[] ageArr = new int[3];
	char[] genderArr = new char[3];
	
	
	//클래스를 사용해보자 (서로다른 종류의 테이터를 한 공간에 저장)
	Student s1 = new Student();
	s1.no = 100;
	s1.name = "엄희윤";
	s1.age = 20;
	s1.gender = '남';
	
	Student s2 = new Student();
	s2.no = 101;
	s2.name = "임수진";
	s2.age = 25;
	s2.gender = '여';
	
	s1.inform();
	s2.inform();
	}
		
	

}
