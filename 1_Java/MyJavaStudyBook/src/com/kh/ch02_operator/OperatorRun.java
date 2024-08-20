package com.kh.ch02_operator;

public class OperatorRun {

	public static void main(String[] args) {
		/*
		 * * 논리 부정 연산자 (단항 연산자 : 하나의 값을 가지고 연산 수행)
		 * 	- 연산자 : !
		 * 	- 논리값(true/false)을 반대로 바꿔주는 연산자
		 */
		System.out.println("true의 값을 부정 : "+ !true);
		System.out.println("false의 값을 부정 : "+ !false);
		
		boolean b1 = true;
		System.out.println("b1의 값을 부정 : "+ !b1);
		
		boolean b2 = !b1;	// b2 => false .변수의 값을 부정하여 대입
		
		boolean b3 = !(10 % 2 ==0);		// b3 => false .연산 결과의 값을 부정하여 대입
		
		//------------------------------------------------
		/*
		 * 증감 연산자 (단항연산자)
		 * - 연산자
		 * 		[1] ++ : 변수에 담긴 값을 1씩 증가시키는 연산자
		 * 		[2] -- : 변수에 담긴 값을 1씩 감소시키는 연산자
		 * 
		 * - 다른 연산이 있을 경우..
		 * 		* 전위 연산 : (증감연산자)변수 => 선 증감 후 처리(다른 연산 수행)
		 * 		* 후위 연산 : 변수(증감연산자) => 선 처리 후 증감
		 */
		int i1 = 10;
		System.out.println("1) i1 = "+i1);			// i1 => 10
		System.out.println("2) ++i1 = "+ ++i1);		// i1 => 11
		System.out.println("3) i1++ = "+ i1++);		// i1 => 11, 출력후 12
		System.out.println("4) i1 = "+ i1);			// i1 => 12
		
		int i2 = ++i1;
		System.out.println("5) i1 = "+ i1+", i2 = "+ i2); // i1 = 13, i2 = 13
		
		int i3 = i1++;
		System.out.println("6) i1 = "+ i1+", i3 = "+ i3); // i1 = 14, i3 = 13
		
		int i4 = i1++ * 5;
		System.out.println("7) i1 = "+ i1+", i4 = "+ i4); // i1 = 15, i4 = 70
		
		//----------------------------------------
		/*
		 * * 산술 연산자 (이항 연산자 : 두 개의 값을 가지고 연산 수행)
		 * 	- 연산자 : + - * / %
		 *  - 우선순위 : * / % > + -
		 *
		 */
		int n1 = 10;
		int n2 = 5;
		
		System.out.println("n1 + n2 = " + n1 + n2);	// 이렇게 되면 앞의 ""와 연산이 되므로 10과 5 둘다 출력
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + n1 * n2);
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 % n2 = " + n1 % n2);
		
		// ***나머지 연산자 활용하기***
		// Q1) n1의 값이 짝수인지 홀수인지?
		// n1%2 == 0 의 결과가 true이면 짝수, false이면 홀수
		if (n1%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		// Q2) n2가 3의 배수인지?
		// n2%3 == 0 의 결과가 true이면 배수
		if (n2%3 == 0) {
			System.out.println("3의배수");
		}
		
		//------------------------------------------------------
		/*
		 * * 비교연산자/관계연산자 (이항연산자)
		 * 	- 두 값을 비교하는 연산자
		 *  - 비교연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환(결과 논리값)
		 *  
		 *  - 연산자
		 *  	* 대소 비교 연산자 : > < >= <=
		 *  	* 동등 비교 연산자 : == !=
		 */
		int a = 7;
		int b = 4;
		
		System.out.println(" a==b :" + (a == b));
		System.out.println(" a==b :" + (a != b));
		
		boolean result = a>b;
		System.out.println("result : "+ result);
		
		System.out.println(a*2 > b/3); // 산술 연산이 비교 연산보다 먼저 수행됨
		
		System.out.println("a 값이 짝수인가 ?" + (a%2 == 0));
		System.out.println("a 값이 짝수인가 ?" + (a%2 == 1));
		System.out.println("a 값이 짝수인가 ?" + (a%2 != 0));
		System.out.println("a 값이 짝수인가 ?" + !(a%2 == 0));
		//-----------------------------------------------------
		/*
		 * 논리 연산자 (이항 연산자)
		 * : 두 개의 논리값을 연산해주는 연산자
		 * 		연산 수행 결과값도 논리값
		 * 
		 * - 연산자
		 * 		* 논리값 && 논리값 : 왼쪽, 오른쪽 값이 모두 true일 때 결과가 true
		 * 		* 논리값 || 논리값 : 왼쪽, 오른쪽 둘 중 하나라도 true일 때 결과가 true
		 */
		int num = 55;
		
		// num 변수에 저장된 값이 1 이상이고, 100 이하인 경우 1 <= num <= 100
		boolean r2 = (num>=1) && (num <= 100);
		System.out.println("num의 값은 1이상 100이하의 수인가?" + r2);
		// && : ~이고, 그리고, ~하면서
		 
		char yn = 'y';
		
		// yn 변수에 저장된 값이 'y'이거나 'Y'인 경우
		boolean r3 = (yn == 'y') || (yn == 'Y');
		System.out.println("yn 변수의 값이 'y' 또는 'Y'인가? "+r3);
		// || : ~이거나, 또는
		
		boolean r4 = (num > 55) && (++num >0);
		System.out.println("r4 : "+r4+"num : "+num);	// r4 : false, num = 55
		// && 연산의 경우 왼쪽 결과가 false인 경우 오른쪽의 연산이 수행되지 않는다.
		
		boolean r5 = (num>0) || (num++>1);
		System.out.println("r5 : "+r5+"num : "+num);	// r5 : false, num = 55
		// || 연산의 경우 왼쪽 결과가 true인 경우 오른쪽의 연산이 수행되지 않는다.
		
		//-----------------------------------------------------
		/*
		 * 복합 대입 연산자 : 산술 연산자와 대입 연산자가 결합되어 있는 연산자
		 * 				 연산처리 속도가 좀 더 빨라 사용이 권장됨.
		 * - 연산자 : += -= *= /= %=
		 * 
		 * 		a = a+3;	=> a+=3;
		 * 		a = a-3;	=> a-=3;
		 * 		a = a*3;	=> a*=3;
		 * 		a = a/3;	=> a/=3;
		 * 		a = a%3;	=> a%=3;
		 * 
		 */
		int num2 = 45;
		
		// num2를 2배 증가
		num2 *= 2;
		
		// num2에 5 증가
		num2 += 5;
		
		// num2를 2배 감소
		num2 /= 2;
		
		String str = "Hi";
		// str = str + ", Java!";
		str += ", Java!";
		
		//------------------------------------------
		/*
		 * 삼항 연산자 (3개 값을 가지고 연산 수행)
		 * 
		 * - 연산자 : 조건식 ? 조건식의 결과가 참일때 사용할 값 : 조건식의 결과가 거짓일때 사용할 값
		 */
		// 랜덤값 (1~100) 추출
		int random = (int)(Math.random() * (100-1+1)+1);
		
		// 랜덤값이 짝수인지 홀수인지 출력 " 랜덤값 : 결과" 형식
		String result2 = random % 2 ==0 ? "짝수" : "홀수";
		System.out.println(random + " : "+ result2);
		
		// 랜덤값을 문자로 변환했을 때 대문자인지 아닌지 판별
		String result3 = random >= 'A' && random <= 'Z' ? "대문자" : "대문자 아님";
		System.out.println((char)random + " : " + result3);
		
//		System.out.println((int)'0'); =>48
	}

}





