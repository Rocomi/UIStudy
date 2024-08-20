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

import kh.project.geneJar.model.vo.Order;

public class OrderDAO implements Data<Order>{
private Order[] oArr = new Order[100000];
	
	@Override
	public void addData(Order o) {
		File f = new File("Order.txt");

		DataOutputStream dos = null;

		try {		// 입력받은 객체를 데이터로 분리하여 파일에 저장 (이어쓰기)
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
			
			dos.writeUTF(o.getMed());
			dos.writeUTF(o.getFormulation());
			dos.writeInt(o.getMedNo());
			dos.writeUTF(o.getOrderNo()); 
			dos.writeInt(o.getQuantity());
			dos.writeUTF(o.getOrderName());
			dos.writeUTF(o.getAddress());
			dos.writeUTF(o.getPhone()); 

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

	@Override
	public Order[] fileRead() {
		File f = new File("Order.txt");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));

			int i = 0;
			while (true) {
				oArr[i] = new Order(dis.readUTF(), dis.readUTF(), dis.readInt(), dis.readUTF(),dis.readInt(),
				dis.readUTF(), dis.readUTF(), dis.readUTF());
				i++;
			}

		} catch (EOFException e) {

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}

		return oArr;
	}

	@Override
	public void changeData(Order[] oArr) {
		File f = new File("Order.txt");

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			for (Order o : oArr) {		// 배열 데이터 모두 입력
				
				if (o == null) continue;
				
				dos.writeUTF(o.getMed());
				dos.writeUTF(o.getFormulation());
				dos.writeInt(o.getMedNo());
				dos.writeUTF(o.getOrderNo()); 
				dos.writeInt(o.getQuantity());
				dos.writeUTF(o.getOrderName());
				dos.writeUTF(o.getAddress());
				dos.writeUTF(o.getPhone()); 
				
				
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
