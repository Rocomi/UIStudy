package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	
	public void upDown(){
		
		Scanner sc = new Scanner(System.in);
		int rnum = (int) (Math.random() * 100+1);
		int i = 0;
		System.out.println(rnum);
				
		while (true) {
			i++;
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();

			if (num < rnum) {
				System.out.println("Up !");
				continue;
			} else if (num > rnum) {
				System.out.println("Down !");
				continue;
			} else {
				System.out.println("정답입니다!\n"+i+"회만에맞추셨습니다.");
				break;
			}
		}
		
	}

}
