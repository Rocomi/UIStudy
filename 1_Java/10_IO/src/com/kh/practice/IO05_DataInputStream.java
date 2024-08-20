package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO05_DataInputStream {

	public static void main(String[] args) {
		// 04에서 생성한 파일 객체
		File f = new File("./resources", "DataSample.txt");
		
		// 데이터 입력 스트림 객체
		DataInputStream dis = null;
		
		try {
		// 스트림 객체 생성
		dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(f)
							)
					);	
		
		int data1 = dis.read();
		boolean data2 = dis.readBoolean();
		char data3 = dis.readChar();
		double data4 = dis.readDouble();
		int data5 = dis.readInt();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
		
		
		
		} catch(FileNotFoundException e) {
			System.out.println("[ERROR] 파일을 찾을 수 없습니다. 오타를 확인하세요!");	
		} catch(IOException e) {
			System.out.println("[ERROR] 입출력 오류 발생!");
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();	
			}
		}
	}

}
