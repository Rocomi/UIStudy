package com.kh.practice.file.view;

import java.io.File;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {

		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String text = sc.nextLine();

			if (!text.equals("ex끝it")) {
				sb.append(text);
				sb.append("\n");
			} else {
				break;
			}
		}

		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fName = sc.nextLine();

//				File f = new File("./resources1", fName);

			if (fc.checkName(fName)) { // 이미 파일이 존재하는 경우
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까 ? (y/n) : ");
				char yn = sc.nextLine().charAt(0);
				if (yn == 'Y' || yn == 'y') { // 덮어씌우는 경우
					fc.fileSave(fName, sb);
					return;
				}
				// 덮어씌우지 않을 경우는 다시 파일명을 입력받도록..
			} else { // 파일이 존재하지 않는 경우
				fc.fileSave(fName, sb);
				return;
			}
		}
	}

	public void fileOpen() {
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		System.out.print("열 파일 명 : ");
		String fName = sc.nextLine();

		if (fc.checkName(fName)) {
			System.out.println(fc.fileOpen(fName));
		} else {
			System.out.println("없는 파일입니다.");
			return; // 없어도 됨
		}
	}

	public void fileEdit() {
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
		// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
		System.out.print("수정할 파일 명 : ");
		String fName = sc.nextLine();

		// 해당 파일이 존재하는지 확인
		if (fc.checkName(fName)) {
			// 파일이 존재하는 경우
			StringBuilder sb = new StringBuilder();

			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String text = sc.nextLine();

				if (!text.equals("ex끝it")) {
					sb.append(text);
					sb.append("\n");
				} else {
					fc.fileEdit(fName, sb);
					return;
				}
			}
		} else {
			// 파일이 존재하지 않는 경우
			System.out.println("없는 파일입니다.");
			return;
		}
	}
}
