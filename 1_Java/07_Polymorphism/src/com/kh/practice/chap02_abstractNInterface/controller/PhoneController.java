package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		
		GalaxyNote9 n9 = new GalaxyNote9();
		result[0] = n9.printInformation();
		
		V40 v4 = new V40();
		result[1] = v4.printInformation();
		
		return result;
	}

}
