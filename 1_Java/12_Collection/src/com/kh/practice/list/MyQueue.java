package com.kh.practice.list;

import java.util.ArrayList;

public class MyQueue {
	/*
	 * 큐(Queue) : FIFO(First In First Out)
	 * 				처음 저장된 데이터가 가장 먼저 꺼내 올 수 있는 구조
	 * 
	 * - 데이터 추가 : 순서대로 추가
	 * - 데이터 제거 : 처음 위치부터 제거
	 * 
	 * -------------------
	 *  MyQueue
	 * ----------------
	 * arrStack : ArrayList<String> = new ArrayList<>();
	 * ------------------------------------
	 * + enQueue(data:String): void	
	 * + deQueu() : String										
	 * 
	 */
	
	private ArrayList<String> queue = new ArrayList<>();
	
	public void enQueue(String f) {
		queue.add(f);	
	}
	
	public String deQueu() {
		if (queue.isEmpty()) {
			return "리스트가 비었습니다." ;
		}
		return queue.remove(0);
	}
	
	
	

}
