package incorrect.question.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudyAgain {
	public static void main(String[] args) {
		/* 문제번호 1157
		 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 
		 * 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		 */
		
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		char result = getMostFrequentChar(text);

		if (result == '?') {
			System.out.println("?");
		} else {
			System.out.println(result);
		}
	}

	public static char getMostFrequentChar(String str) {
        // 대소문자를 구분하지 않기 위해 대문자로 변환
        str = str.toUpperCase();
        
        // 알파벳의 빈도를 저장할 맵
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // 문자열 순회
        for (char ch : str.toCharArray()) {
            // 알파벳인 경우에만 처리
            if (Character.isAlphabetic(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        // 가장 많이 사용된 알파벳 찾기
        char mostFrequentChar = 0;
        int maxFrequency = -1;
        boolean isTie = false;
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
                isTie = false;
            } else if (entry.getValue() == maxFrequency) {
                isTie = true;
            }
        }
        
        return isTie ? '?' : mostFrequentChar;
    }

}
