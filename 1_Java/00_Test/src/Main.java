import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int ball[] = new int[n];
		int empty = 0;
		
		for(int p = 0; p < n; p++) {
		ball[p] = p+1;
		}
		
		for(int p = 0; p < m; p++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			empty = ball[i-1];
			ball[i-1] = ball[j-1];
			ball[j-1] = empty;			
		}
		for(int p =0; p<n; p++) {
		System.out.print(ball[p]+" ");
		}
	}
}
