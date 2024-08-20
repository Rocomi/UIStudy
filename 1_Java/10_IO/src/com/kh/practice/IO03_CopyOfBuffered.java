package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03_CopyOfBuffered {

	public static void main(String[] args) {
		// BufferedInputStream과 BufferedOutputStream을 이용하여
		// resources/src.txt ----> resources/dst.txt 복사

		// 파일 객체
		File src = new File("./resources/src.txt");
		File dst = new File("./resources/dst.txt");

		// : 입출력 스트림 객체 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		//  입출력 데이터 관련 변수 선언

		byte[] buf = new byte[1024]; 	// 입력 데이터 저장 변수 (버퍼)
		int len = -1; 					// 입력 데이터 길이
		int total = 0;					// 총 입출력 길이 저장을 위한 변수

		try {
			// 파일 입출력 스트림 생성
			bis = new BufferedInputStream(new FileInputStream(src));
			// File ---> FileInputStream
			bos = new BufferedOutputStream(new FileOutputStream(dst));
			//  FileOutputStream ---> File 
			
			// 파일 입 출력 (파일 복사)
			while ( (len = bis.read(buf)) != -1) {	//파일 입력(데이터를 읽어오기)
				bos.write(buf, 0, len);
				bos.flush();
				
				total += len;
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 		// 파일 조회 실패
		} catch (IOException e) {
			e.printStackTrace();		// 입출력 작업 실패
		} finally {
			try {
			if (bos != null) bos.close();
			if (bis != null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// TODO : 복사된 총 길이 출력
		System.out.println(total);
		
	}
}
