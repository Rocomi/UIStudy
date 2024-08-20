package com.kh.phone.book.view;

import java.util.Scanner;

import com.kh.phone.book.controller.PhoneBookController;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneBookMenu {

	private Scanner sc = new Scanner(System.in);
	private PhoneBookController bc = new PhoneBookController();
	private PhoneBook[] pArr;

	public PhoneBookMenu() {
		bc.makePhoneBook();
		pArr = bc.fileRead();
	}

	public void mainMenu() {
		System.out.println("=====번화전호부=====");
		System.out.println("⊂_ヽ");
		System.out.println("　 ＼＼ Λ＿Λ");
		System.out.println("　　 ＼(ˇωˇ)");
		System.out.println("　　　 >　⌒ヽ");
		System.out.println("　　 /   へ＼");
		System.out.println("　　 ﾚ　ノ　  ヽ_つ");
		System.out.println("　 /　/|");
		System.out.println("　(　(ヽ");
		System.out.println("　| 丿  ⌒)");
		System.out.println("　| |　) /");
		System.out.println("`ノ )　Lﾉ");
		System.out.println("(_／");

		while (true) {
			System.out.println("1. 번호 저장 할끼가?");
			System.out.println("2. 번화전호부 볼끼가?");
			System.out.println("9. 집에 갈끼가?");
			System.out.print("메번뉴호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println(" 　　　　　／＞￣￣￣／フ");
				System.out.println(" 　　　　　| 　_　 _l");
				System.out.println(" 　 　　　／` ミ＿Yノ");
				System.out.println(" 　　 　 /　　　  |");
				System.out.println(" 　　　 /　 ヽ　　 ﾉ");
				System.out.println(" 　 　 │　　|　|　|");
				System.out.println(" 　／￣|　　 |　|　|");
				System.out.println(" 　| (￣ヽ＿_ヽ_)__)");
				System.out.println(" 　＼二つ");
				System.out.println("잘가래이~ ><");
				return;
			default:
				System.out.println("똑바로 안누르나? 다시눌러라 마.");
				break;
			}

		}
	}

	public void fileSave() {

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전번화호 : ");
		String pNum = sc.nextLine();

		System.out.print("더 적을꺼 뭐 있나마? (y/n) : ");
		int nyn = 0;
		while (true) {

			char yn = sc.nextLine().charAt(0);

			if (yn == 'y' || yn == 'Y') {
				System.out.print("소ㅅ소솟소속 : ");
				String blong = sc.nextLine();
				System.out.print("E-Mail : ");
				String eMail = sc.nextLine();
				System.out.print("메모 : ");
				String memo = sc.nextLine();

				PhoneBook b = new PhoneBook(name, pNum, blong, eMail, memo);
				
				for (int i = 0; i < pArr.length; i++) {

					if (pArr[i] == null) {
						pArr[i] = b;
						break;
					}
					bc.fileSave(pArr);
					
				}
			} else if (yn == 'n' || yn == 'N') {
				PhoneBook b = new PhoneBook(name, pNum);

				for (int i = 0; i < pArr.length; i++) {

					if (pArr[i] == null) {
						pArr[i] = b;
						break;
					}
					bc.fileSave(pArr);
				}
			} else {
				if (nyn == 0) {
					nyn++;
				System.out.print("뭐라노; 다시쓰라 : ");
				continue;
				}
				if (nyn == 1) {
					nyn++;
				System.out.print("y나 n중에 쓰라카이; : ");
				continue;
				}if (nyn == 2) {
					nyn++;
				System.out.print("아따마 새기 정신안차리제? : ");
				continue;
				}if (nyn == 3) {
					nyn++;
				System.out.print("뇌로 알탕해뭇나; 똑디쓰라꼬! : ");
				continue;
				}if (nyn == 4) {
					nyn++;
				System.out.print("진짜 마지막이다이;; : ");
				continue;
				}if (nyn == 5) {
					nyn++;
				System.out.print("하...니 맘대로해라");
				continue;
				}else {continue;}
			}
			return;
		}
	}

	public void fileRead() {
		PhoneBook[] p = bc.fileRead();

		for (PhoneBook pb : p) {
			if (pb != null)
				System.out.println(pb);

		}

	}
}
