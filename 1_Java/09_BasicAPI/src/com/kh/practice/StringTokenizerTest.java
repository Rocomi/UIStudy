package com.kh.practice;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// StringTokenizer : 문자열 내에 특정 구분자로 나눠주는 클래스(토큰화)
		
		String data = "name:Hong,phone:010-1234-5678,address:gangnam,email:hong@gmail.com";
		String[] dArr = new String[4];
		StringTokenizer st = new StringTokenizer(data, ",");
		// dArr 배열에 data값만 추출하여 저장
		int index = 0;
		while(st.hasMoreTokens()) {
			String text = st.nextToken();
			
			int count = 0;
			StringTokenizer st2 = new StringTokenizer(text, ":");
			while(st2.hasMoreTokens()) {
				if(count%2 !=0) {
					dArr[index++] = st2.nextToken();
				}else {
					st2.nextToken();
					count++;
				}
			}
		}
		
		
		
		System.out.printf("이름은 %s이고, 연락처는%s이고, 주소는%s이고, 이메일은%s입니다.\n",
						dArr[0], dArr[1], dArr[2], dArr[3]);
		
		
	}

	public static void test1() {
		String msg = "안녕하세요|나는엄희윤입니다|반갑습니다";
		String[] arr = new String[3];
		StringTokenizer st = new StringTokenizer(msg, "|");

		int index = 0;
		// 토큰화 가능 여부 체크 : 변수명.hasMoreTokens()
		while (st.hasMoreTokens()) {
			// 기준 문자열로 분리하여 데이터를 가져오고자 할 때 : 변수명.nextToken() : String
			arr[index] = st.nextToken();
			System.out.println(arr[index]);
			index++;
		}
	}

}
