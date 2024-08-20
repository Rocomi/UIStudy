package com.kh.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	/*
	 * *List 특징 : 중복이 가능하고, 순서가 있는 콜렉션
	 * 
	 * * ArrayList - 배열 구조 - 데이터 조회가 빠름 - 데이터 추가/삭제가 복잡하여 오래 걸림
	 * 
	 * ArrayList<E> 참조변수명 = new ArrayList<[E]>(); //[]는 생략 가능 -다형성 적용시- List<E>
	 * 참조변수명 = new ArrayList<>();
	 * 
	 * * LinkedList - 리스트 구조 - 데이터 추가/삭제가 빠르다 - 데이터 조회가 느림
	 * 
	 * LinkedList<E> 참조변수명 = new LinkedList<[E]>(); -다형성 적용시- List<E> 참조변수명 = new
	 * LinkedList<>();
	 * 
	 * * List 관련 메소드 - 저장된 데이터 크기 : size() - 데이터 추가 : add(데이터) - 데이터 삭제 :
	 * remove(인덱스) - 데이터 조회 : get(인덱스)
	 */

	public static void main(String[] args) {
//		arrayListTest();
//		linkedListTest();
//		stackTest();
		queueTest();

	}
	
	public static void queueTest() {
		
		MyQueue queue = new MyQueue();
		queue.enQueue("집에");
		queue.enQueue("가고");
		queue.enQueue("싶다 ");
		
		System.out.println(queue.deQueu());
		System.out.println(queue.deQueu());
		System.out.println(queue.deQueu());
		System.out.println(queue.deQueu());
		
	}
	
	public static void stackTest() {
		/*
		 * 스택(Stack) : LIFO (Last in First Out)
		 * 				제일 마지막에 저장된 데이터가 제일 처음으로 꺼내 올 수 있는 구조
		 * - 데이터 추가 : 순서대로 추가(끝에 추가)
		 * - 데이터 제거 : 마지막 위치부터 제거
		 */
	MyStack stack = new MyStack();
	
	stack.push("레몬");
	stack.push("아보카도");
	stack.push("파인애플");
	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	
	
	
	}
	
	public static void linkedListTest() {
		// 문자열 데이터를 관리하는 LinkedList 객체 생성
				LinkedList<Integer> list = new LinkedList<>();

				// 사용자에게 정수 값을 입력받아
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 값을 입력하세요 : ");
				int length = sc.nextInt();
				
				// 그 길이만큼 랜덤 값을 저장
				for(int i=0; i<length ;i++)
					list.add((int)(Math.random()*length+1));
				
				printFood(list);
	}

	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();

		// 데이터 추가 : add //배열에서 데이터를 추가했을 때
		list.add("아구찜"); // arr[0] = "아구찜";
		list.add("찜닭");
		list.add("갈비찜");

		// 데이터 조회 : get
		printFood(list);
		
		for (String food : list) {
			System.out.println(food);
		}
		System.out.println("----------------------------");

		// 아구찜과 찜닭 사이에 돈가스 추가
		list.add(1, "돈가스"); // add(추가할 인덱스, 데이터)
		printFood(list);

		// 돈가스 삭제 : remove
		list.remove(1);
		printFood(list);

		// 아구찜을 돈가스로 변경 : set
		list.set(0, "돈가스");
		printFood(list);
		
		swapList(list, 1, 2);
		printFood(list);
		
		Collections.swap(list, 0, 1);
		
		printFood(list);
		
	}

	public static <E> void swapList(List<E> food, int n1, int n2) {
		E copy;
		copy = food.get(n1);
		food.set(n1, food.get(n2));
		food.set(n2, copy);
	}

	public static <E> void printFood(List<E> list) {

		for (int i = 0; i < list.size(); i++) { // 데이터 길이 : size
			System.out.println(i + "번째 : " + list.get(i));
		}
	}

}