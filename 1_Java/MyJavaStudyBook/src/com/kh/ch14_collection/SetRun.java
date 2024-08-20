package com.kh.ch14_collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetRun {
	/*
	 * Set : 순서가 없고, 중복도 허용되지 않음
	 * 
	 * 	* 중복체크? equals(), hashCode()를 통해 중복 데이터가 체크됨
	 */
	
	public static void main(String[] args) {
		HashSet<Student> hSet = new HashSet<>();
		
		// 데이터 추가 : add(E e)
		hSet.add(new Student("기다운", 70));
		hSet.add(new Student("최종군", 40));
		hSet.add(new Student("기다운", 100));	
		
		System.out.println(hSet);
		
		for(Student s : hSet) {
			System.out.println(s);
		}
		Iterator<Student> it = hSet.iterator();
		
		for(; it.hasNext();) {	// 데이터가 존재하는 지 확인 메소드
			System.out.println(it.next()); 	//데이터를 조회(다음위치로 이동)
		}
	}

}

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		// 모든 필드의 값이 동일할 경우 같은 hashCode를 반환
		String hash = name + score;
		return hash.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// Stuednt.equals(Student객체) 와 같이 호출될 것임
		// this(현재 객체)		<-->	obj(전달받은 객체)
		if (obj instanceof Student) {
			Student other = (Student)obj;
			
			if(this.name.equals(other.name)
						&& this.score == other.score) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", score=" + score + "]";
	}
	
	
}