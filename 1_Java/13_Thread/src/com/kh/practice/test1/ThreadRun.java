package com.kh.practice.test1;

public class ThreadRun {
	/*
	 * Thread : 프로세스(실행 중인 프로그램) 내에서 가지고 있는 최소 작업 단위
	 * 
	 */

	
	public static void main(String[] args) {
		// Task1 객체 생성 (Thread1)
		 Task1 t1 = new Task1();
		
		// Task2 객체 생성 (Thread2)
		 Task2 task = new Task2();
		 Thread t2 = new Thread(task);
		
		t1.start();		// Thread 실행 : start()
		t2.start();		//
		
		System.out.println("==== " + Thread.currentThread().getName() + " ====");

	}

}
