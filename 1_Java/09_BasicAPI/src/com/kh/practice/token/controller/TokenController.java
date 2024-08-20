package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		// StringBulider 객체 생성시 String 타입의 변수 필요
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		
		// 토큰화 가능 여부 체크 : 변수명.hasMoreTokens()
		while (st.hasMoreTokens()) {
			
			sb.append(st.nextToken());
		}
		return sb.toString();
	}
	
	public String firstCap(String input) {
		/* [내풀이]
		char firstLetter = input.toUpperCase().charAt(0);
		StringBuilder sb = new StringBuilder(firstLetter);
		
		sb.append(firstLetter);
		sb.append(input.substring(1));
		
		return sb.toString();
		*/
		String subStr = input.substring(0,1);
		
		return subStr.toUpperCase() + input.substring(1);
		
		
	}
	
	public int findChar(String input, char one) {
		/*
		int num =0;
		for (int i = 0; i < input.length(); i++ ) {
			if(input.charAt(i) == one) {
				num++;
			}
		}
		
		return num;
		*/
		
		// subString, indexOf 사용하여 해결해보기
		
		int count = 0;
        int index = input.indexOf(one);
        
		while (index != -1) {
            count++;
            // 다음 인덱스를 찾기 위해 substring 사용
            input = input.substring(index + 1);
            index = input.indexOf(one);
        }
        
        return count;
		
		
		
	}

}
