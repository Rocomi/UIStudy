package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker; //제조사 정보
	
	public SmartPhone() {
		
	}
	
//	추상 메소드 6개(셀폰 4 터치디스플레이 1 본인 1)
	
	public abstract String printInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
}
