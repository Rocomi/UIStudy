import java.util.Scanner;

public class memo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(((num1 += 10) < 20) && ((num2 += 100) > 5));
		
		System.out.println(num1);
		
		System.out.println(num2);
		
		num1 = 10;
		num2 = 5;
		
		System.out.println(((num1 += 10) <= 20) && ((num2 += 100) > 5));
		
		System.out.println(num1);
		
		System.out.println(num2);
		
		/* 앞문장 false였기 때문에  num2 +=100이 실행되지 않았으나 
		뒷 지문은 앞문장이 true였으므로 num2 +=100이 실행*/
		
		int i=0;
		
		for (int j=0; j < 5; i += j) // i!를 코드로 나타냄
			
			j += 1; 
		
		System.out.println(i);
		
		int n=2;
		
		for (int m=0; m < 3; n = n + n)
			
			m += 1; 
		
		System.out.println(n);
		//------------------------------------------------------------------------
		int diff;
		
		int num3 = 1;
		int num4 = 2;
		
		if (num3 > num4) {
			diff = num3 - num4;
		}
		else{
			diff = num4 - num3;
		}
			System.out.println(diff);
		
		//----------------------------------------------------------
		int age = sc.nextInt();
		
		if (age >= 60) {
			System.out.println("노인입니다.");
		}
		else if(age >= 20) {
			System.out.println("성인입니다.");
		}
		else if(age >= 8) {
			System.out.println("청소년입니다.");
		}
		else {
			System.out.println("어린이입니다.");
		}
		
		//--------------------------------------------------------------
		
		int num= sc.nextInt();
				
		System.out.println(num %2 == 0 ? "짝수" : "홀수");
		
		
		if (num % 2 ==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	
		
	}
}
