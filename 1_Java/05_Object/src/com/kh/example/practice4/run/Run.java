package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student sd = new Student();
					//학년 반 이름 키 성별
		sd.studentInfor(3, 2, "엄희윤", 181.1, '남');
		sd.information();

	}

}
