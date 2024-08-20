package com.kh.practice.demension;

import java.util.Scanner;

public class DemensionPractice {

	public void practice1() {
		// 1. 3행 3열짜리 문자열 배열 선언 및 할당
		String[][] arr = new String[3][3];

		// 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0,0)"형식으로 값을 저장
		// arr.length => 2차원 배열의 길이. 즉, 행의 길이
		for (int i = 0; i < arr.length; i++) {

			// arr[i].length => 1차원 배열의 길이. 즉, 열의 길이
			// arr[i]는 문자열 데이터를 담고있는 배열이다!
			for (int j = 0; j < arr[i].length; j++) {
				// arr[i][j]는 문자열 데이터다
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		// 3. 저장된 값들을 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

// ---------------------------------------------------------------
	public void practice2() {

		int[][] arr = new int[4][4];
		int input = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

// ---------------------------------------------------------------
	public void practice3() {

	}

//---------------------------------------------------------------
	public void practice4() {

	}

//---------------------------------------------------------------
	public void practice03() {

		int[][] arr = new int[4][4];
		int input = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input;
				input--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

//---------------------------------------------------------------
	public void practice04() {

		int[][] arr = new int[4][4];
		int[] sum = new int[4];

		for (int i = 0; i < arr.length; i++) {

			if (i != arr.length - 1) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j == arr[i].length - 1) {
						arr[i][j] = sum[i];
					} else {
						arr[i][j] = (int) (Math.random() * 10 + 1);
						sum[i] += arr[i][j];
					}
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					for (int k = 0; k < i; k++) {
						arr[i][j] += arr[k][j];
					}
				}
			}
		}

		for (int i = 0; i < arr[i].length - 1; i++) {
			arr[3][3] += arr[i][3];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

//------------------------------------------------------------------
	public void practice4_4() { // 강사님 풀이

		int[][] sumArr = new int[4][4];

		// 0행0열부터 2행 2열까지는 1 ~10까지의 임의의 정수 값 저장
		// 3행에는 각 열의 합을, 3열에는 각 행의 합, 3행3열에는 가로세로 합

		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; i < sumArr[i].length; j++) {

				int lastRow = sumArr.length - 1; // 마지막 행의 인덱스
				int lastcol = sumArr[i].length - 1; // 마지막 열의 인덱스

				// 랜덤값을 각 위치에 저장 (0,0 ~ 2,2)
				if (i != lastRow && j != lastcol) {
					sumArr[i][j] = (int) (Math.random() * 10 + 1);
				}

				// 마지막 행의 위치에 현재 값을 더하기
				if (i < lastRow) {
					sumArr[lastRow][j] += sumArr[i][j];
				}

				// 마지막 열의 위치에 현재 값을 더하기
				if (j < lastcol) {
					sumArr[i][lastcol] += sumArr[i][j];
				}

			}
		}
		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; i < sumArr[i].length; j++) {
				System.out.print(sumArr[i][j]);
			}
		}

	}

//---------------------------------------------------------------

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 크기 : ");
		int hang = sc.nextInt();

		System.out.print("열 크기 : ");
		int yeol = sc.nextInt();

		char[][] ch = new char[hang][yeol];

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				ch[i][j] = (char) (Math.random() * 25 + 66);
			}
		}

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.printf("%s", ch[i][j]);
				if (j != ch.length - 2) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

//---------------------------------------------------------------
	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]);
				if (j != strArr[i].length - 1 || i != strArr.length - 1) {
					System.out.print(" ");
				}
			}
		}
	}

//---------------------------------------------------------------
	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int hang = sc.nextInt();

		int a = 97;
		int[][] arr = new int[hang][];

		// 열 크기 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int num = sc.nextInt();
			arr[i] = new int[num];
		}

		// a부터 배치하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // arr[4].length
				arr[i][j] = a;
				a++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}

	}

//---------------------------------------------------------------
	public void practice8() {

		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] strArr = new String[3][2];
		String[][] strArr2 = new String[3][2];

		int stuNum = 0;
//		--------------------------1분단 시작------------------------
		System.out.println("== " + 1 + "분단 ==");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				strArr[i][j] = arr[stuNum];
				stuNum++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(strArr[i][j]);
				if (j != 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//	--------------------------2분단 시작------------------------
		System.out.println("== " + 2 + "분단 ==");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				strArr2[i][j] = arr[stuNum];
				stuNum++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(strArr2[i][j]);
				if (j != 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

//---------------------------------------------------------------
	public void practice9() {

		Scanner sc = new Scanner(System.in);

		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] strArr = new String[3][2];
		String[][] strArr2 = new String[3][2];

		int stuNum = 0;
//		--------------------------1분단 시작------------------------
		System.out.println("== " + 1 + "분단 ==");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				strArr[i][j] = arr[stuNum];
				stuNum++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(strArr[i][j]);
				if (j != 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//	--------------------------2분단 시작------------------------
		System.out.println("== " + 2 + "분단 ==");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				strArr2[i][j] = arr[stuNum];
				stuNum++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(strArr2[i][j]);
				if (j != 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// --------------------------여기까지 문제8번----------------

		System.out.println("===========================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String a = "NULL";

		for (int n = 1; n <= 2; n++) {
			if (n == 1) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 2; j++) {
						if (strArr[i][j].equals(name)) {
							switch (j) {
							case 0:
								a = "왼쪽";
								break;
							case 1:
								a = "오른쪽";
								break;
							}
							System.out.printf("검색하신 %s 학생은 %d분단 %d번째줄 %s에 있습니다.", name, n, i + 1, a);
						}

					}
				}
			} else if (n == 2) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 2; j++) {
						if (strArr2[i][j].equals(name)) {
							switch (j) {
							case 0:
								a = "왼쪽";
								break;
							case 1:
								a = "오른쪽";
								break;
							}
							System.out.printf("검색하신 %s 학생은 %d분단 %d번째줄 %s에 있습니다.", name, n, i + 1, a);
						}

					}
				}

			}
		}
	}

//	----------------------------------------------------------
	public void practice10() {

		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[6][6];

//		0 1 2 3 4 가로세로 입력
		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				for (int j = 1; j < arr[i].length; j++) {
					arr[i][j] = (char) (j + 47);
				}
			} else if (i != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j == 0) {
						arr[i][j] = (char) (i + 47);
					}
				}

			}

		}

//		나머지 변수 " "로 변경
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = ' ';
			}
		}

//		인덱스 위치 입력 받은 후 x로 변환
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();

		arr[row + 1][col + 1] = 'X';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if (j != arr[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

//	----------------------------------------------------------
	public void practice11() {

		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[6][6];

//		0 1 2 3 4 가로세로 입력
		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				for (int j = 1; j < arr[i].length; j++) {
					arr[i][j] = (char) (j + 47);
				}
			} else if (i != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j == 0) {
						arr[i][j] = (char) (i + 47);
					}
				}

			}

		}

//		나머지 변수 " "로 변경
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = ' ';
			}
		}
//		여기서 부터 반복
		while (true) {

//		인덱스 위치 입력 받은 후 x로 변환
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if (row == 99) {  		// 99 입력시 종료---------
				System.out.print("프로그램 종료.");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();

			arr[row + 1][col + 1] = 'X';

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
					if (j != arr[i].length - 1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}