package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 1. 길이가 10인 배열 선언 (1부터10까지의 값을 저장 =>int)

		int[] arr = new int[10];

		// 2. 반복문을 사용하여 배열 인덱스에 그 값을 저장
		/*
		 * for (int i = 1; 1 <= 10; i++) { // 인덱스 시작 arr [i-1] = i; // arr 배열의 i-1 위치에 i
		 * 값을 저장
		 */
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}

		// 3. 반복문을 사용하여 각 인덱스의 값을 출력

		/*
		 * for (int i = 0; i < 10; i++) { System.out.print(arr[i]);
		 * 
		 * if (i != 9) { System.out.print(" "); }
		 */
//			--------------혹은
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			if (i != arr.length - 1) {
				System.out.print(" ");
			}

		}

	}

//	---------------------------------------

	public void practice2() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			if (i != arr.length - 1) {
				System.out.print(" ");
			}

		}
	}
//	---------------------------------------

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				arr[i] = i + 1;
			}

			for (int i = 0; i < num; i++) {
				System.out.print(arr[i]);
				if (arr[i] != num) {
					System.out.print(" ");
				}
			}
		}
	}
//	---------------------------------------

	public void practice4() {

		String[] str = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

//		System.out.print(str[1]);

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("귤")) {
				System.out.print(str[i]);
			}
		}

	}
//	---------------------------------------

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str1 = sc.nextLine();

		System.out.print("문자 : ");
		String str2 = sc.nextLine();
		char[] ch = new char[str1.length()];

		for (int i = 0; i < str1.length(); i++) {
			ch[i] = str1.charAt(i);
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) :", str1, str2);

		int j = 0;

		for (int i = 0; i < str1.length(); i++) {
			if (ch[i] == str2.charAt(0)) {
				System.out.print(" ");
				System.out.print(i);
				j++;
			} else if (i == str1.length() - 1) {
				System.out.print("\n");
			}
		}
		System.out.print(str2 + " 개수 : " + j);
	}
//	---------------------------------------

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 0 || num > 6) {
			System.out.print("잘못 입력하셨습니다.");
		}
		String[] str = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.println(str[num]);

	}
//	---------------------------------------

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] inum = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int inNum = sc.nextInt();
			inum[i] = inNum;
			/*
			 * System.out.print(inum[i]); if (i != num) { System.out.print("\n"); }
			 */
		}
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print(inum[i]);
			if (i != num) {
				System.out.print(" ");
			}
			sum += inum[i];
		}
		System.out.print("\n총 합 : " + sum);

	}
//	---------------------------------------

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 : ");
			int num1 = sc.nextInt();

			if (num1 < 3 || num1 % 2 != 1) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				for (int i = 1; i < num1 / 2 + 1; i++) {
					System.out.print(i);
					System.out.print(", ");
				}
				for (int i = num1 / 2 + 1; i > 0; i--) {
					System.out.print(i);
					if (i != 1) {
						System.out.print(", ");
					}
				}
				break;
			}
		}
	}
//	---------------------------------------

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();

		String[] list = { "후라이드", "양념", "간장", "뿌링클", "반반" };

		for (int i = 0; i < 5; i++) {
			if (menu.equals(list[i])) {
				System.out.println(list[i] + "치킨 배달 가능");
			}
		}
	}
//	---------------------------------------

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String idnum = sc.nextLine();

		char[] saveData = new char[14];
		char[] exportData = new char[14];

		for (int i = 0; i < 14; i++) {
			saveData[i] = idnum.charAt(i);
		}
		for (int i = 0; i < 14; i++) {
			exportData[i] = saveData[i];
		}
		for (int i = 0; i < 14; i++) {
			if (i <= 7) {
				System.out.print(exportData[i]);
			} else {
				exportData[i] = '*';
				System.out.print(exportData[i]);
			}
		}

	}
//	---------------------------------------

	public void practice11() {

		int[] ranNum = new int[10];

		for (int i = 0; i < 10; i++) {
			ranNum[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(ranNum[i]);
			if (i != 10) {
				System.out.print(" ");
			}
		}
	}
//	---------------------------------------

	public void practice12() {

		int[] ranNum = new int[10];

		for (int i = 0; i < 10; i++) {
			ranNum[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(ranNum[i]);
			if (i != 9) {
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}
		int max = 0;
		int min = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (ranNum[i] >= ranNum[j]) {
					if (j == 9) {
						max = ranNum[i];
						break;
					}
					continue;
				} else {
					break;
				}

			}

		}
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (ranNum[i] <= ranNum[j]) {
					if (j == 9) {
						min = ranNum[i];
						break;
					}
					continue;
				} else {
					break;
				}
			}

		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

//	---------------------------------------

	public void practice13() {

		int[] ranNum = new int[10];

		ranNum[0] = (int) (Math.random() * 10) + 1;

		for (int i = 1; i < 10; i++) {
			ranNum[i] = (int) (Math.random() * 10) + 1;
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if (ranNum[i] == ranNum[j]) {
					ranNum[i] = (int) (Math.random() * 10) + 1;
					j--;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(ranNum[i]);
			if (i != 9) {
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}

	}
//	---------------------------------------

	public void practice14() {

		int[] ranNum = new int[6];

		ranNum[0] = (int) (Math.random() * 45) + 1;

		for (int i = 1; i < 6; i++) {
			ranNum[i] = (int) (Math.random() * 45) + 1;
		}

		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				if (ranNum[i] == ranNum[j]) {
					ranNum[i] = (int) (Math.random() * 45) + 1;
					j = -1;
				}
			}
		}

		// 랜덤 형성 이후 오름차순 정렬

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (ranNum[i] > ranNum[j]) {
					int copy = ranNum[i];
					ranNum[i] = ranNum[j];
					ranNum[j] = copy;
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(ranNum[i]);
			if (i != 5) {
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}

		///////////////////////// 다시옵시다
//		Arrays.sort(ranNum);
//		정렬식
	}
//	---------------------------------------

	public void practice15() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] ch = new char[str.length()];

		int sameNum = 1;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				System.out.print(ch[i]);
			}
			for (int j = 0; j < i; j++) {
				if (ch[j] == ch[i]) {

					break;
				} else if (j == i - 1) {
					sameNum++;
					System.out.print(", ");
					System.out.print(ch[i]);
					if (i == str.length() - 1) {
						System.out.print("\n");
					}

				}
			}

		}

		System.out.print("문자 개수 : " + sameNum);
	}

//	---------------------------------------

	public void practice16() {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int num2 = 0;
		int times = 0;
		String[] str = new String[0];
		;
		String[] copy;

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		// \n이 남아있는 경우 지워주는 역할

		while (true) {

			
			times++;
//			이전 데이터 업로드
			copy = new String[num];
			if (times > 1) {
				for (i = 0; i < num; i++) {
					copy[i] = str[i];
				}
			}
			num += num2;
			str = new String[num];
//			새로운 데이터 입력
			for (; i < num; i++) {

				System.out.print(i + 1 + " 번째 문자열 : ");
				String inStr = sc.nextLine();
				str[i] = inStr;
			}
//			이전 데이터 다운로드
			if (times > 1) {
				for (i = 0; i < num - num2; i++) {
					str[i] = copy[i];
				}
			}

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char yesNo = sc.next().charAt(0);

			if (yesNo == 'n') {

				System.out.print("[");
				for (i = 0; i < num; i++) {
					System.out.print(str[i]);
					if (i != num - 1) {
						System.out.print(", ");
					}
				}
				System.out.print("]");
				break;
			}
			else if (yesNo == 'y') {

			System.out.print("더 입력하고 싶은 개수 : ");
			num2 = sc.nextInt();
			sc.nextLine();
			// \n이 남아있는 경우 지워주는 역할
			}
			else {
				System.out.print("잘못입력하셨습니다.");
			}

		}
	}
}
