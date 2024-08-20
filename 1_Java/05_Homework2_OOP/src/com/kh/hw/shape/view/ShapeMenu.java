package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;

import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

//	삼각형과 사각형을 선택하게 하는 메소드
	public void inputMenu() {
		while (true) {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int type = sc.nextInt();
		sc.nextLine();
		
			if (type == 3) {
				triangleMenu();
			} else if (type == 4) {
				squareMenu();
			} else if (type == 9) {
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

//	삼각형 메뉴 출력 메소드
	public void triangleMenu() {

		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로 돌아갑니다.");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			if (menuNum == 1) {
				inputSize(3, menuNum);
			} else if (menuNum == 2) {
				inputSize(3, menuNum);
			} else if (menuNum == 3) {
				printInformation(3);
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
			
		}
	}

//	사각형 메뉴 출력 메소드
	public void squareMenu() {

		while (true) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로 돌아갑니다.");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			if (menuNum == 1) {
				inputSize(4, menuNum);
			} else if (menuNum == 2) {
				inputSize(4, menuNum);
			} else if (menuNum == 3) {
				inputSize(4, menuNum);
			} else if (menuNum == 4) {
				printInformation(4);
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

//	너비와 높이를 받아 요청사항을 처리하거나 색깔	을 받아 요청사항을 처리하는 메소드
	public void inputSize(int type, int menuNum) {
			
		if (type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			
			double area = tc.calcArea(height, width);
			System.out.println("삼각형 면적 : "+area);
		}

		else if (type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}
		
		if (type == 4 && menuNum == 1) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			// 저장 안해도 되는건가...?
			double area = scr.calcPerimeter(height, width);
			System.out.println("사각형 둘레 : "+ area);
		}
		
		else if (type == 4 && menuNum == 2) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			// 저장 안해도 되는건가...?
			double area = scr.calcArea(height, width);
			System.out.println("사각형 면적 : "+area);
		}

		else if (type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}

	}

//	매개변수에 따라 삼각형/사각형의 정보를 출력하	는 메소드
	public void printInformation(int type) {
		if (type ==3) {
		System.out.println(tc.print());
		}
		else if (type == 4) {
		System.out.println(scr.print());
		}
	}

}
