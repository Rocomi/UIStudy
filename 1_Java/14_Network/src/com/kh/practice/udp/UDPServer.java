package com.kh.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		// 1. IP(PC에 지정되어 있음) / 포트(!!)
		int port = 8090;

		// 이 서버는 8090 포트를 사용하여 요청받을 준비!
		try (DatagramSocket ds = new DatagramSocket(port)) {

			// 클라이언트로부터 받을 packet 객체 생성
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			// ---- 데이터 받을 준비 완료 ----

			while (true) {
				System.out.println(".... 요청 대기중 ....");

				ds.receive(dp); // 전송된 데이터를 받기

				System.out.println("클라이언트 IP : " + dp.getAddress());
				String message = new String(dp.getData());
				System.out.println("전송 데이터 : " + message);

			}

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}