package com.kh.game.list;

import java.util.Scanner;

import com.kh.model.vo.User;

public class RockSissorPaper {
	
	private User u;
	
	public RockSissorPaper(User user) {
		
		System.out.println("가위 바위 보");
		u = user;
		game();
	
	}
	public void game() {
		 Scanner sc = new Scanner(System.in);
	        
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        int l = 0;
	        
	        for(;;i++) {
	            
	            int rnum = (int) (Math.random() * 3);
	            
	            System.out.print("가위바위보 (exit 입력시 종료) : ");
	            String rps = sc.next();
	            sc.nextLine();
	            
	            switch (rnum) {
	            case 0 :
	                System.out.println("컴퓨터 : 가위");
	                
	                if (rps.equals("가위")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("비겼습니다.");
	                    k++;
	                }else if(rps.equals("바위")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("이겼습니다 !");
	                    j++;
	                }else if(rps.equals("보")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("졌습니다 ㅠㅠ");
	                    l++;
	                }
	                System.out.println();
	                break;
	            case 1 :
	                System.out.println("컴퓨터 : 바위");
	                
	                if (rps.equals("가위")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("졌습니다 ㅠㅠ");
	                    l++;
	                }else if(rps.equals("바위")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("비겼습니다.");
	                    k++;
	                }else if(rps.equals("보")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("이겼습니다 !");
	                    j++;
	                }
	                System.out.println();
	                break;
	            case 2 :
	                System.out.println("컴퓨터 : 보");
	                
	                if (rps.equals("가위")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("이겼습니다!");
	                    j++;
	                }else if(rps.equals("바위")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("졌습니다 ㅠㅠ");
	                    l++;
	                }else if(rps.equals("보")) {
	                    System.out.println("당신 : " + rps);
	                    System.out.println("비겼습니다.");
	                    k++;
	                }
	                System.out.println();
	                break;
	            }
	            if (rps.equals("exit")) {
	                System.out.printf("%d전 %d승 %d무 %d패\n", i, j, k, l);
	                u.setScore(u.getScore()+10*j-10*l);			
	                System.out.println("획득한 점수 : "+ (10*j-10*l)+"점");
	                System.out.println();
	                break;
	            }
	        }
	}
}
