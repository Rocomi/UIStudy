package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		
		System.out.println(pc.method()[0]);
		System.out.println();
		System.out.println(pc.method()[1]);
	}

}
