package com.kh.chap01_beforeNSafter.after.model.vo;

public class SmartPhone extends Product {

	private String mobileAgency;

	public SmartPhone() {

	}

	public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {

		super(brand, code, name, price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String information() {
		return super.information() + ", moblieAgency = " + mobileAgency;
	}

}
