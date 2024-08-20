package com.kh.view;

import java.util.Scanner;
import com.kh.controller.PlayController;
import com.kh.model.dao.UserDAO;

public class DisplayMenu {

	private Scanner sc = new Scanner(System.in);
	private PlayController pc = new PlayController();

	public DisplayMenu() {
		System.out.print("닉네임을 입력해 주세요 : ");
		String nickName = sc.nextLine();
		pc.makeNickName(nickName);
		System.out.println(pc.getUserInfo().getNickName()); //테스트
	}
	
	public void mainMenu() {
		
		while (true) {
			
			System.out.println("======Console Game======");
			System.out.println();
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
			System.out.println();
			System.out.println("1. Up & Down");
			System.out.println("2. 가위바위보");
			System.out.println("3. 숫자 야구");
			System.out.println("9. 점수 조회");
			System.out.println("0. 게임 종료");

			System.out.print("메뉴 입력 : ");
			int mNum = sc.nextInt();
			System.out.println();

			switch (mNum) {
			case 1:
				pc.game01();
				break;
			case 2:
				pc.game02();
				break;
			case 3:
				pc.game03();
				break;
			case 9:
				System.out.println(pc.getUserInfo().toString());
				System.out.println();
				break;
			case 0:		
				pc.fileSave(pc.getUserInfo().getNickName());
				System.out.println(" 　　　　　／＞￣￣￣／フ");
				System.out.println(" 　　　　　| 　_　 _l");
				System.out.println(" 　 　　　／` ミ＿Yノ");
				System.out.println(" 　　 　 /　　　  |");
				System.out.println(" 　　　 /　 ヽ　　 ﾉ");
				System.out.println(" 　 　 │　　|　|　|");
				System.out.println(" 　／￣|　　 |　|　|");
				System.out.println(" 　| (￣ヽ＿_ヽ_)__)");
				System.out.println(" 　＼二つ");
				System.out.println();
				System.out.println("안녕히 가세요!!!!!!");
				return;
			default : 
				System.out.println("그런거 없다 마;");
				break;
			}
		}
	}
}
