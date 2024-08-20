package com.kh.practice.set.model.vo;

public class Lottery {
	
	private String name;
	private String phone;
	
	public Lottery() {
		super();
	}

	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name+"("+phone+")";
	}

	@Override
	public int hashCode() {
		String hash = name + phone;
		return hash.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery others = (Lottery) obj;
			if ( this.name.equals(others.name)
					&& this.phone.equals(others.phone)) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
