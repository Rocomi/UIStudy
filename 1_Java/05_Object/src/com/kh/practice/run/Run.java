package com.kh.practice.run;

import com.kh.practice.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.setName("아이폰");
//		p1.information();
		
		//매개변수 3개인 생성자를 사용하여 Product객체를 생성
		Product p2 = new Product("Fold 5", 1500000, "갤럭시");
		//저장된 정보를 출력해보자
		p2.information();
	}

}
