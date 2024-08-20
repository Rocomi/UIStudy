package com.kh.practice;

public class StringTest {

	public static void main(String[] args) {

//		test1();
		test2();

	}

	public static void test1() {
		String str1 = "apple";
		String str2 = "apple";
		
		// str1 == str2 : 문자열 값을 비교하는게 아니라, 주소값을 비교
		System.out.println(str1 == str2);
		// => 문자열 값 자체를 대입하면 상수풀 이라는 공간에 값이 저장되어
		//		같은 곳을 가리키게 됨 (주소값이 동일)
		
		System.out.println(str1 == "apple");
		// => str1이 가리키는 주소와 "apple" 값 자체가 저장된 주소를 비교
		//		str1, "apple" 모두 상수풀의 같은 곳에 저장되어 있으므로 true
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		System.out.println(str3 == str4);
		// => 문자열 객체를 생성해서 값을 대입하면 메모리에 새로운 영역을 할당하므로
		// 		각각 할당된 영역을 가리키게됨 (주소값이 다름)
		
		System.out.println(str3 == "apple");
		// => str3가 가리키는 주소와 "apple"값 자체가 저장된 주소를 비교
		//		str3는 새로운 메모리 공간 할당 후 "apple"값을 저장
		// 		"apple" 값 자체는 상수풀에 저장되어 있어 서로 다른 곳을 가리킴
		
		System.out.println(str3.equals("apple"));
		System.out.println("====================================");
		
		String str5 = "Hello";
		String str6 = "World";
		
		System.out.println(str5);				// 출력 : Hello
		System.out.println(str5.toString());	// String 클래스에서 toString 메소드가 오버라이딩됨
		
		// System.idetityHashCode(참조변수명) : System 클래스 내에서 해쉬값(주소값)을 확인하는 기능을 제공하는 메소드
		int hash = System.identityHashCode(str5);
		System.out.println(hash);
		
		str5 = str5.concat(str6);
		System.out.println(str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println(hash2);
		
		System.out.println(System.identityHashCode("HelloWorld"));
	}
	
//	----------------------------------------------------------
	
	public static void test2() {
		// 1) equals : 문자열의 비교를 위해 사용
		String str = "Hello";
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals("Bye"));
		
		// 2) charAt : 문자열 해당 인덱스의 문자 값을 반환
		System.out.println(str.charAt(1));
		
		// 3) length : 문자열.length() : int => 해당 문자열의 길이를 반환
		System.out.println(str.length());
		
		// => str 변수의 마지막 문자 출력
		System.out.println(str.charAt(str.length()-1));
		
		// 4) toUpperCase() : String => 해당 문자열의 값을 모두 대문자로 변환
		// 		toLowerCase() : String => 해당 문자열의 값을 모두 소문자로 변환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// 5) contains : 문자열A.contains(문자열B) : boolean => 문자열A안에 문자열 B가 포함되어 있는가
		System.out.println(str.contains("el"));
		System.out.println(str.contains("bb"));
		
		// 6) indexOf : 문자열A.indexOf(문자열B) : int => 문자열A에 문자열B의 시작 인덱스 위치를 반환
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("bb"));
		
		// 7) substring : 문자열.substring(시작인덱스, 종료인덱스) : String =>문자열에서 해당 인덱스 기준으로 문자열을 잘라냄
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 4));
		
		// 8) repeat : 문자열.repeat(개수) : String => 해당 문자열을 개수만큼 반복
		System.out.println("배고파".repeat(8));
		
		// 9) split : 문자열.split(대상문자열) : String[] => 해당 문자열을 대상문자열 기준으로 분리하여 배열
		String str2 = "카레/돈까스/밥/김치/닭갈비";
		String[] menus = str2.split("/");
		
		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i]);
		}
		
		
	}
	
	
	
}
