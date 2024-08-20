package com.kh.practice;

import java.io.*; // io내의 모든 import

public class IO02_BufferedOutputStream {

	public static void main(String[] args) {
		// 출력 파일 대상 객체
		File f = new File("./resources", "OutputTest.txt");
		
		// 파일 출력 스트림 객체 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
		//파일 출력 스트림 생성
//		fos = new FileOutputStream(f);			// File --> FlieOutputStream
//		bos = new BufferedOutputStream(fos);	// FileOutputStream --> BufferedOutputStream
		
			bos = new BufferedOutputStream(new FileOutputStream(f));
			
			String contents = "2024-07-02 11:08 IO는 재미없어!";
			bos.write(contents.getBytes()); 	// 파일 출력 (write)
			bos.flush();
			// => 출력 스트림의 flush() 를 하지 않으면 출력 버퍼에만 데이터가 기록되어,
			//		실제 출력 장치(대상)에는 출력되지 않음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if (bos != null) bos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
