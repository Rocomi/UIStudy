package com.kh.example.practice7.model.vo;

public class Employee {
	//ALT + SHIFT + S --> O
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(int empNo, String empName) {
		
		System.out.println("사원번호 = " + empNo);
		System.out.println("사원이름 = " + empName);
		
	}
	
	public Employee(int empNo, String empName, String dept, 
			String job,	int age, char gender, int salary, 
			double bonusPoint, String phone, String address) {
		
		System.out.println("사원번호 = " + empNo);
		System.out.println("사원이름 = " + empName);
		System.out.println("부서 = " + dept);
		System.out.println("직책 = " + job);
		System.out.println("나이 = " + age);
		System.out.println("성별 = " + gender);
		System.out.println("급여 = " + salary);
		System.out.println("보너스점수 = " + bonusPoint);
		System.out.println("전화번호 = " + phone);
		System.out.println("주소 = " + address);
		
	}
	
	//ALT + SHIFT + S --> R
	public int getEmpNo() {
		System.out.println("사원번호 = " + empNo);
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getEmpName() {
		System.out.println("사원이름 = " + empName);
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getDept() {
		System.out.println("부서 = " + dept);
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getJob() {
		System.out.println("직책 = " + job);
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getAge() {
		System.out.println("나이 = " + age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		System.out.println("성별 = " + gender);
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getSalary() {
		System.out.println("급여 = " + salary);
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonusPoint() {
		System.out.println("보너스점수 = " + bonusPoint);
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public String getPhone() {
		System.out.println("전화번호 = " + phone);
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		System.out.println("주소 = " + address);
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
