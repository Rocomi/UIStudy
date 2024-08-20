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
import kh.project.geneJar.model.vo.Medicine;

public class MedicineDAO implements Data<Medicine> {
private Medicine[] mArr = new Medicine[100000];
	
	public void addData(Medicine m) {
		File f = new File("Medicine.txt");

		DataOutputStream dos = null;

		try {		// 입력받은 객체를 데이터로 분리하여 파일에 저장 (이어쓰기)
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
			
			dos.writeUTF(m.getName());
			dos.writeUTF(m.getMed());
			dos.writeUTF(m.getFormulation());
			dos.writeUTF(m.getTarget()); 
			dos.writeInt(m.getMedNo());
			dos.writeInt(m.getProdCost());
			dos.writeInt(m.getPrice());
			dos.writeInt(m.getInven());

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
	
	public Medicine[] fileRead() {
		File f = new File("Medicine.txt");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));

			int i = 0;
			while (true) {
				mArr[i] = new Medicine(dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readUTF(),dis.readInt(),
				dis.readInt(), dis.readInt(), dis.readInt());
				i++;
			}

		} catch (EOFException e) {

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}

		return mArr;
	}
	
	public void changeData(Medicine[] mArr) {
		File f = new File("Medicine.txt");

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			for (Medicine m : mArr) {		// 배열 데이터 모두 입력
				
				if (m == null) continue;
				
				dos.writeUTF(m.getName());
				dos.writeUTF(m.getMed());
				dos.writeUTF(m.getFormulation());
				dos.writeUTF(m.getTarget()); 
				dos.writeInt(m.getMedNo());
				dos.writeInt(m.getProdCost());
				dos.writeInt(m.getPrice());
				dos.writeInt(m.getInven());
				
				
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
