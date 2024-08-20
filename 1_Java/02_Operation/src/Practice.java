
public class Practice {

	public static void main(String[] args) {
		
		/*int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 / num2 = " + num1 / num2); // 정수값 2 나옴
		System.out.println("num1 / num2 = " + 7.0 / 3.0); // 실수값 2.33333333
				
		System.out.println("num1 % num2 = " + num1 % num2); // 정수 나머지 1 나옴
		System.out.println("num1 % num2 = " + 7.0 % 3.0); // 실수 나머지 1.0 나옴
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Happy");*/
		int i;
		int j;
		
		for (i=1; i < 10; i++) {
			for(j=1; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + i*j + "\t");
			}
			System.out.print("\n");
			}
	}
}
