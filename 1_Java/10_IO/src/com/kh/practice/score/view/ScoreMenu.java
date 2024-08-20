package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장"); // saveScore()
			System.out.println("2. 성적 출력"); // readScore()
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
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

	public void saveScore() {
		int num = 0; // 학생 숫자를 나타낼 변수
		
		while(true) {
		System.out.println(num+1 + "번 째 학생 정보 기록");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + eng + math;
		double avg = sum/3;
		
		scr.saveScore(name, kor, eng, math, sum, avg);
		
		System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
		char yn = sc.nextLine().toUpperCase().charAt(0);
		
		if (yn != 'N') {
			num++;
		}else {return;}
		}
	}

	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		
		
		try {
			
			DataInputStream dis = null;
			dis = scr.readScore();
			
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			while(true) {
				
				String name = dis.readUTF();
				int kor = dis.readInt();
				int eng = dis.readInt();
				int math = dis.readInt();
				int sum = dis.readInt();
				double avg = dis.readDouble();
				
				System.out.print(name+"\t");
				System.out.print(kor+"\t");
				System.out.print(eng+"\t");
				System.out.print(math+"\t");
				System.out.print(sum+"\t");
				System.out.print(avg);
				System.out.println();
				
				count++;
				sumAll += sum;
				if(count != 0) {
				avgAll = avg/count*(count-1)/3;}
				else {avgAll = avg;}
			}
		
		
		} catch (EOFException e) {
			System.out.println("읽은 횟수\t 전체 합계\t 전체평균");
			System.out.println(count +"\t"+ sumAll +"\t"+ avgAll);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}

