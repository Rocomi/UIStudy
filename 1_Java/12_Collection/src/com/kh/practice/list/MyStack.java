package com.kh.practice.list;

import java.util.ArrayList;

public class MyStack {
	/*-------------------
	 *  MyStack
	 * ----------------
	 * arrStack : ArrayList<String> = new ArrayList<>();
	 * ------------------------------------
	 * + push(data:String): void	// 데이터 추가
	 * + pop() : String				// 데이터 제거
	 * 								// isEmpty() => 데이터가 없을 경우 "리스트가 비었습니다." 반환
	 * 								// remove() => arrStrack(리스트)에서 데이터 제거 후 해당 데이터를 반환
	 */
	
	ArrayList<String> arrStack = new ArrayList<>();
	
	public void push(String f) {
		arrStack.add(f);	
	}
	
	public String pop() {
		if (arrStack.isEmpty()) {
			return "리스트가 비었습니다." ;
		}
		return arrStack.remove(arrStack.size()-1);
	}
}
