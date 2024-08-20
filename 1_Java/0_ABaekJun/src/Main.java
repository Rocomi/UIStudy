import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] a = new String[6];
		
		a[5] = "가";
		a[4] = "나";
		a[3] = "라";
		a[2] = "다";
		a[1] = "마";
		a[0] = "바";
		
		a[0].compareTo(a[2]);
		
		for(String s : a)
		System.out.println(s);
		
		
		
		
		
	}
}
