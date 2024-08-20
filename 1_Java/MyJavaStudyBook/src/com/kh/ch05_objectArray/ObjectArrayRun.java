package com.kh.ch05_objectArray;

public class ObjectArrayRun {

	public static void main(String[] args) {
		/*
		 * * 객체배열 : 객제를 저장하는 배열
		 * 				배열의 각 요소가 참조변수들로 이루어져 있음
		 * 					=> 객체를 사용하려면 각 요소마다 객체 생성이 필요**
		 * 
		 * 클래스명[] 참조변수명(배열명) = new 클래스명[배열 크기];
		 * 		=> 배열 크기만큼의 참조변수 배열이 생성됨
		 * 
		 * 배열명[인덱스] = new 클래스명(); // new 생성자;
		 */
/*		Product[] products = new Product[3];
		
			for(int i=0; i<=products.length; i++) {
				System.out.println(products[i].getName());
		}
*/		// 문제가 되는 부분이 있는가?
		/* 1) 인덱스 범위를 벗어나서 접근 (ArrayIndexOutOfBoundsException 예외 발생)
		 * 		반복문의 조건식 부분이 i<=배열길이 로 되어있어 마지막 인덱스보다 큰 값까지 접근
		 * 		=> 조건식 부분을 i<배열길이 로 수정해줘야 함
		 * 
		 * 2) 객체 배열의 각 인덱스 위치에 담긴 값이 null인 산태인데,
		 * 		이 상태에서 객체 내의 메소드로 접근하려 함 (NullPointerException 예외 발생)
		 * 		=> 메소드 접근 전에 각 인덱스 위치에 객체를 생성해줘야 함
		 */
		Product[] products = new Product[3];

			products[0] = new Product("우산", 10000);
			products[1] = new Product("슬리퍼", 15000);
			products[2] = new Product("음료수", 2000);
			
			
			for(int i=0; i<products.length; i++) {
				System.out.println(products[i].getName());
			}
		
	}

}












