package incorrect.question.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudyAgain_02 {
	/* 문제번호 11718
	 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 
	 * 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
	 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
	 * 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] text = new String[100];
	
		int i = 0;
		while(sc.hasNext() && i<100) {
			text[i] = sc.nextLine();
			System.out.println(text[i]);
			i++;
		}
			
	}
}
