package kh.project.geneJar.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kh.project.geneJar.model.vo.CustomerLogin;

public class CustomerLoginDAO implements Data<CustomerLogin> {
	private CustomerLogin[] cArr = new CustomerLogin[10000];

	public void addData(CustomerLogin c) {

		File f = new File("CustomerLogin.txt");

		DataOutputStream dos = null;

		try {		// 입력받은 객체를 데이터로 분리하여 파일에 저장 (이어쓰기)
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));

			dos.writeUTF(c.getId());
			dos.writeUTF(c.getPassword());
			dos.writeUTF(c.getName());

			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public CustomerLogin[] fileRead() {		// 회원정보들을 파일에서 가져와 객체배열로 생성
		File f = new File("CustomerLogin.txt");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));

			int i = 0;
			while (true) {
				cArr[i] = new CustomerLogin(dis.readUTF(), dis.readUTF(), dis.readUTF());
				i++;
			}

		} catch (EOFException e) {

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}

		return cArr;
	}

	public void changeData(CustomerLogin[] cArr) { // 입력받은 객체배열을 데이터로 분리하여 파일에 저장 (덮어쓰기)
		File f = new File("CustomerLogin.txt");

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			for (CustomerLogin c : cArr) {		// 배열 데이터 모두 입력
				dos.writeUTF(c.getId());
				dos.writeUTF(c.getPassword());
				dos.writeUTF(c.getName());
			}

			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
