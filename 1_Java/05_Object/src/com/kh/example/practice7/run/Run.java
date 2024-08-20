package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		
		emp.getEmpNo();
		emp.getEmpName();
		
		
		
		Employee emp2 = new Employee();
		
		emp2.setEmpNo(100);
		emp2.setEmpName("홍길동");
		emp2.setDept("영업부");
		emp2.setJob("과장");
		emp2.setAge(25);
		emp2.setGender('남');
		emp2.setSalary(2500000);
		emp2.setBonusPoint(0.05);
		emp2.setPhone("010-1234-5678");
		emp2.setAddress("서울시 강남구");
		
		emp2.getEmpNo();
		emp2.getEmpName();
		emp2.getDept();
		emp2.getJob();
		emp2.getAge();
		emp2.getGender();
		emp2.getSalary();
		emp2.getBonusPoint();
		emp2.getPhone();
		emp2.getAddress();

	}

}
