package com.kh.practice.student.veiw;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {

	private StudentController sm = new StudentController();

	public StudentMenu() {

		System.out.println("========== 학생 정보 출력 ==========");
		for (int i = 0; i < sm.printStudent().length; i++) {
			System.out.println(sm.printStudent()[i].inform());
		}
//		 향상된 for문 아직 모르겟음...;
//		for (Student s : sArr  ) {
//			String info = s.inform();
//			System.out.println(info);
//		}

		System.out.println("========== 학생 성적 출력 ==========");
		double[] s = sm.avgScore();
		System.out.println("학생 점수 합계 : " + (int) s[0]);
		System.out.println("학생 점수 평균 : " + s[1]);

		System.out.println("========== 성적 결과 출력 ==========");

		for (int i = 0; i < sm.printStudent().length; i++) {
			if (sm.printStudent()[i].getScore() >= StudentController.CUT_LINE) {

				System.out.println(sm.printStudent()[i].getName() + "학생은 통과입니다.");
			} else {
				System.out.println(sm.printStudent()[i].getName() + "학생은 재시험 대상입니다.");
			}
		}

	}

}
