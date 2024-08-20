package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		System.out.println("사원관리 시스템 입니다.");
		System.out.println("");
		
		while(true) {
		
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력"); // 선택한 사원번호만 정보출력
			System.out.println("5. 전체 사원 출력"); // 사원 번호순으로 전체 사원 출력
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			
			switch(menuNum) {
			case 1 : 
				insertEmp();
				break;
			case 2 : 
				updateEmp();
				break;
			case 3 : 
				deleteEmp();
				break;
			case 4 : 
				System.out.print("출력할 사원 번호를 입력하세요 : "); // 선택한 사원번호만 출력
				int empNo = sc.nextInt();
				sc.nextLine();
				printEmp(empNo);
				break;
			case 5 : 
				printEmp();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("");
				break;
				
			}
		}

	}

	public void insertEmp() {	
		
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		
		if (ec.inform(empNo) != null ) {
			System.out.print("사원번호가 이미 존재합니다. 덮어 쓰시겠시겠습니까? (y/n) : ");
			// 중복된 사원번호 입력시 데이터 덮어쓰기 사용, 혹은 새로운 사원번호 입력
			char yn = sc.nextLine().charAt(0);
			if (yn != 'y' && yn != 'Y') {
				System.out.println("메인 화면으로 돌아갑니다.");
				System.out.println("");
				return;
			}
			else {
				System.out.println("사원정보를 덮어씁니다.");
			}
		}
		//	--> 데이터가 있는 사원번호일 경우 "사원번호가 이미 존재합니다. 기존 데이터를 덮어 쓰시겠습니까?"  출력
		// 기존 데이터 위에 덮어쓰기
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까? (y/n) : ");
		char yn = sc.nextLine().charAt(0);
		if (yn == 'y' || yn == 'Y') {
			
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
			System.out.println("사원 등록 완료.");
			System.out.println("");
			
		}
		else {
			ec.add(empNo, name, gender, phone);
			System.out.println("사원 등록 완료.");
			System.out.println("");
		}

	}

	public void updateEmp() {
		 
		// 수정할 사원번호 입력 --> 해당 사원번호의 정보만 수정
		System.out.print("수정할 사원 번호를 입력하세요 : ");
		int empNo = sc.nextInt();
		
		System.out.println("해당 사원 번호의 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt(); 
		
		switch (menuNum) {
		case 1 : 
			System.out.print("수정할 전화 번호 :");
			String phone = sc.nextLine();
			ec.modify(empNo, phone);
			System.out.println("");
			break;
		case 2 : 
			System.out.print("수정할 사원 연봉 :");
			int salary = sc.nextInt();
			sc.nextLine();
			ec.modify(empNo, salary);
			System.out.println("");
			break;
		case 3 : 
			System.out.print("수정할 보너스 율 :");
			double bonus = sc.nextDouble();
			ec.modify(empNo, bonus);
			System.out.println("");
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.");
			System.out.println("");
			return;
		default : 
			System.out.println("잘못된 메뉴번호입니다. 메인으로 돌아갑니다.");
			System.out.println("");
			return;
				
		}

	

	}

	public void deleteEmp() {
		
		// 삭제할 사원번호 입력
		System.out.print("삭제할 사원 번호를 입력하세요 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char yn = sc.nextLine().charAt(0);
		if (yn == 'y' || yn =='Y') {
			 if(ec.remove(empNo) == null) {
				 System.out.println("데이터 삭제에 성공하였습니다.");
				 System.out.println("");
			 }else {
				 System.out.println("데이터 삭제에 실패하였습니다.");
				 System.out.println("");
			 }
			
		}else {
			System.out.println("메인으로 돌아갑니다.");
			System.out.println("");
			return;
		}
		
	}

	public void printEmp(int empNo) {  // 특정 사원만 출력할 수 있도록 메소드 오버로딩 
		
		if (ec.inform(empNo) == null){
			System.out.println("사원 데이터가 없습니다.");
			System.out.println("");
		}else {
			System.out.println(ec.inform(empNo));
			System.out.println("");
		}
		
		// 해당 사원번호의 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력

	}

	public void printEmp() {
		
		for(int i = 0; i < ec.getE().length; i++) {
			if (ec.inform(i) == null){
				continue;
			}else {
				System.out.println(ec.inform(i));
			}
		}
		//	전체 사원데이터 출력, 데이터가 없는 경우 출력하지 않음
		System.out.println("");
	}
}
