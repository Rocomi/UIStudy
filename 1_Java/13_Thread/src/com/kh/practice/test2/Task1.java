package com.kh.practice.test2;

public class Task1 extends Thread {

	@Override
	public void run() {
		// 1~30 까지 짝수만 출력
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() +":"+ i);

				// 출력 후 0.1초 재우기
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				super.run();
			}
		}
	}

}
