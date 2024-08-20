package com.kh.practice.score.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {

		File f = new File("StudentsScore.txt");

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f,true)));

			dos.writeUTF(name); // 아스키코드
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);

			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

//		매개변수들을 DataOutputStream을 통해 파일에 저장
	}

	public DataInputStream readScore() throws FileNotFoundException {

		File f = new File("StudentsScore.txt");
		DataInputStream dis = null;

		// 스트림 객체 생성
		dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
//		파일을 DataInputStream을 통해 읽어옴

		return dis;

	}
}
