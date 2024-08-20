package com.kh.practice;

/* [사용자 정의 예외 클래스 만들기]
 *  - Exception 클래스 상속
 *  -  생성자 (기본/매개변수1개->msg:String)
 */

public class ValueLengthException extends Exception {
	
	public ValueLengthException() {}
	public ValueLengthException(String msg) {
		super(msg);
	}
	

}
