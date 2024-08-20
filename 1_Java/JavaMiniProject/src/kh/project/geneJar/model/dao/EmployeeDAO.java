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
import java.util.Arrays;
import java.util.Comparator;

import kh.project.geneJar.model.vo.Employee;

public class EmployeeDAO implements Data<Employee>{
	private Employee[] eArr = new Employee[10000];
	
	public void addData(Employee em) {
		File f = new File("Employee.txt");

		DataOutputStream dos = null;

		try {		// 입력받은 객체를 데이터로 분리하여 파일에 저장 (이어쓰기)
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
			
			dos.writeInt(em.getEmpNo());
			dos.writeUTF(em.getId());
			dos.writeUTF(em.getPassword());
			dos.writeUTF(em.getName()); // gender phone dept salary, bonus
			dos.writeChar(em.getGender());
			dos.writeUTF(em.getPhone());
			dos.writeUTF(em.getDept());
			dos.writeInt(em.getSalary());
			dos.writeDouble(em.getBonus());
			

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
	
	public Employee[] fileRead() {
		File f = new File("Employee.txt");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));

			int i = 0;
			while (true) {
				eArr[i] = new Employee(dis.readInt(), dis.readUTF(), dis.readUTF(), dis.readUTF(),dis.readChar(),
				dis.readUTF(), dis.readUTF(), dis.readInt(), dis.readDouble());
				i++;
			}

		} catch (EOFException e) {

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		return eArr;
	}
	
	public void changeData(Employee[] eArr) {
		File f = new File("Employee.txt");

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			for (Employee e : eArr) {		// 배열 데이터 모두 입력
				
				if (e == null) continue;
				
				dos.writeInt(e.getEmpNo());
				dos.writeUTF(e.getId());
				dos.writeUTF(e.getPassword());
				dos.writeUTF(e.getName());
				dos.writeChar(e.getGender());
				dos.writeUTF(e.getPhone());
				dos.writeUTF(e.getDept());
				dos.writeInt(e.getSalary());
				dos.writeDouble(e.getBonus());
				
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
