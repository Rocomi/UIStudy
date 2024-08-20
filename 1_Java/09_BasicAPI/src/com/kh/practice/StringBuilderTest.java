package com.kh.practice;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBulider : 문자열 값을 변경할 수 있음
//		스레드 safe 보장되지 않음 ( 단일 스레드에서 사용)

// StringBulider 객체 생성시 String 타입의 변수 필요
		String str = "Winter";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(System.identityHashCode(sb));
		System.out.println("-----------------------");
		System.out.println("");
		
		//값을 변경하고자 할때 : 변수명.append(추가할 값)
		sb.append(" is pretty");
		sb.append("!!!");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb)); // 같은 메모리공간에서 값 변경

	}

}
