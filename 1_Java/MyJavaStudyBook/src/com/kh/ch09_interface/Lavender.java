package com.kh.ch09_interface;

public class Lavender extends Plant {
	
	public Lavender (String name) {
		this.name = name;
	}

	@Override
	public void sprinkleWater() {
		// nutrients의 값을 3 증가
		setNutrients(getNutrients()+3);
	}

	@Override
	public void baskSun() {
		// nutrients의 값을 7 증가
		setNutrients(getNutrients()+7);
	}
	
	// toString() 재정의 : 모든 필드 정보 반환
	@Override
	public String toString() {
		return "name=" + name +", nutrients="+ getNutrients();
	}

}
