package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	private Employee[] e = new Employee[10000]; 	// 10000개의 사원정보까지 저장 가능
													// 추가공간 필요시 임의로 설정

	public void add(int empNo, String name, char gender, String phone) {
		
		e[empNo] = new Employee(empNo, name, gender, phone);
		// 받아온 매개변수를 이용하여 해당 정보 수정
		
	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {

		e[empNo] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
		// 받아온 매개변수를 이용하여 해당 정보 수정

	}

	public void modify(int empNo, String phone) {
		e[empNo].setPhone(phone);
	}

	public void modify(int empNo, int salary) {
		e[empNo].setSalary(salary);
	}

	public void modify(int empNo, double bonus) {
		e[empNo].setBonus(bonus);
	}

	public Employee remove(int empNo) {

		e[empNo] = null;
		// 객체 e에 null을 저장하여 객체 삭제

		return e[empNo];
	}

	public String inform(int empNo) { // 사원정보 출력

		if (e[empNo] == null) {
			return null;
		}

		return e[empNo].printEmployee();

	}

	public Employee[] getE() {
		return e;
	}

	public void setE(Employee[] e) {
		this.e = e;
	}

}
