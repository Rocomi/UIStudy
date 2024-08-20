package com.kh.practice;

import java.io.File;

public class IO00_File {

	public static void main(String[] args) {

		File file = new File("C:/test.txt"); // 절대경로
		// 존재하지 않는 파일********
		System.out.println(">" + file);
		System.out.println(">" + file.toString());
		
		System.out.println("length : " + file.length());
		System.out.println("exists : " + file.exists());
		System.out.println("canRead : " + file.canRead());
		System.out.println("canWrite : " + file.canWrite());
		
		System.out.println();
		System.out.println("==================================");
		System.out.println();
		
		// 존재하는 파일*********************
		File file2 = new File("./resources/FileTest.txt"); // 상대경로 (현재위치 기준)
		
		System.out.println(">" + file2);
		
		System.out.println("length : " + file2.length());
		System.out.println("exists : " + file2.exists());
		System.out.println("canRead : " + file2.canRead());
		System.out.println("canWrite : " + file2.canWrite());
		
		
		

	}

}
