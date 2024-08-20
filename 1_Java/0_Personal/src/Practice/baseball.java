package Practice;

import java.util.Scanner;

public class baseball {
	int rannum = (int) (Math.random() * 10000);

	public void title1() {

		System.out.println("숫자 맞추기 게임(4자리수)");

	}

	// --------------------------------------------------------

	public void game1() {

		Practice pt = new Practice();
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		int num = rannum; // 숫자 랜덤입력 받음

//		System.out.println(num); // 완료되면 지워야함

		int a = (num / 1000);
		int b = (num / 100) - a * 10;
		int c = (num / 10) - a * 100 - b * 10;
		int d = (num / 1) - a * 1000 - b * 100 - c * 10;

		// 여기서 부터 반복문
		for (int i = 0; i < 10; i++) {

			System.out.println("\n남은 기회는 " + (10 - i) + "번 입니다.");

			String bb = sc.next();

//		System.out.println(num);
//		System.out.println(a + " + " + b + " + " + c + " + " + d);

			if (!(bb.length() == 4)) {
				System.out.println("다시 입력해 주세요.");
			}

			else {

				int one = bb.charAt(0) - '0';
				int two = bb.charAt(1) - '0';
				int three = bb.charAt(2) - '0';
				int four = bb.charAt(3) - '0';
				int target = one + two + three + four;

				if (a == one && b == two && c == three && !(d == four)) {
					if (d == one || d == two || d == three || d == four) {
						System.out.println("S : 3\nB : 1");
					} else {
						System.out.println("S : 3\nB : 0");
					}
				} else if (a == one && b == two && !(c == three) && d == four) {
					if (c == one || c == two || c == three || c == four) {
						System.out.println("S : 3\nB : 1");
					} else {
						System.out.println("S : 3\nB : 0");
					}
				} else if (a == one && !(b == two) && c == three && d == four) {
					if (b == one || b == two || b == three || b == four) {
						System.out.println("S : 3\nB : 1");
					} else {
						System.out.println("S : 3\nB : 0");
					}
				} else if (!(a == one) && b == two && c == three && d == four) {
					if (a == one || a == two || a == three || a == four) {
						System.out.println("S : 3\nB : 1");
					} else {
						System.out.println("S : 3\nB : 0");
					}
				}
				// 여기까지가 하나 틀렸을 경우---------------------------------------------------------
				else if (a == one && b == two && !(c == three) && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)) {
						System.out.println("S : 2\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							|| (c == one || c == two || c == three || c == four)) {
						System.out.println("S : 2\nB : 1");
					} else {
						System.out.println("S : 2\nB : 0");
					}
				} else if (a == one && !(b == two) && c == three && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 2\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							|| (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 2\nB : 1");
					} else {
						System.out.println("S : 2\nB : 0");
					}
				} else if (!(a == one) && b == two && c == three && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 2\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							|| (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 2\nB : 1");
					} else {
						System.out.println("S : 2\nB : 0");
					}
				} else if (a == one && !(b == two) && !(c == three) && d == four) {
					if ((c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 2\nB : 2");
					} else if ((c == one || c == two || c == three || c == four)
							|| (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 2\nB : 1");
					} else {
						System.out.println("S : 2\nB : 0");
					}
				} else if (!(a == one) && b == two && !(c == three) && d == four) {
					if ((c == one || c == two || c == three || c == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 2\nB : 2");
					} else if ((c == one || c == two || c == three || c == four)
							|| (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 2\nB : 1");
					} else {
						System.out.println("S : 2\nB : 0");
					}
				} else if (!(a == one) && !(b == two) && c == three && d == four) {
					if ((b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 2\nB : 2");
					} else if ((b == one || b == two || b == three || b == four)
							|| (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 2\nB : 1");
					} else {
						System.out.println("S : 2\nB : 0");
					}
				}

				// 여기까지가 두개 틀렸을 경우---------------------------------------------------------
				else if (!(a == one) && !(b == two) && !(c == three) && d == four) {
					if ((c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 3");
					} else if ((c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if (!(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else {
						System.out.println("S : 1\nB : 0");
					}
				} else if (!(a == one) && !(b == two) && c == three && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else {
						System.out.println("S : 1\nB : 0");
					}
				} else if (!(a == one) && b == two && !(c == three) && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 1\nB : 1");
					} else {
						System.out.println("S : 1\nB : 0");
					}
				} else if (a == one && !(b == two) && !(c == three) && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 2");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)) {
						System.out.println("S : 1\nB : 1");
					} else {
						System.out.println("S : 1\nB : 0");
					}
				}
				// 여기까지가 3개 틀렸을때...........

				else if (!(a == one) && !(b == two) && !(c == three) && !(d == four)) {
					if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 4");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 3");
					} else if ((d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 2");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 2");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 2");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 2");
					} else if ((d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& (c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& (b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& (a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 1");
					} else if (!(d == one || d == two || d == three || d == four)
							&& !(c == one || c == two || c == three || c == four)
							&& !(b == one || b == two || b == three || b == four)
							&& !(a == one || a == two || a == three || a == four)) {
						System.out.println("S : 0\nB : 0");

					}
				} else if (a == one && b == two && c == three && d == four) {
					System.out.println("정답입니다!");
					break;
				}
				// 정답일 경우---------------------------------------------------------
			}
		}
		System.out.println("수고하셨습니다");

	}


}
