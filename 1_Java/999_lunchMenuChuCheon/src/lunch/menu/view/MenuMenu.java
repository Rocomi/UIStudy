package lunch.menu.view;

import java.util.Scanner;

public class MenuMenu {

	private Scanner sc = new Scanner(System.in);
	private String[] chucheon = new String[4];
	private String[] menu = new String[100];

	
	
	public MenuMenu() {
		menu[0] = "한판도";
		menu[1] = "은희네";
		menu[2] = "카쿠레가";
		menu[3] = "짬뽕지존";
		menu[4] = "김밥천국";
		menu[5] = "맘스터치";
		
		
	}

	public void mainMenu() {
		
		for (int i =0; i<4; i++) {
			
			int j = (int)(Math.random()*5);
			String x = menu[j];
			System.out.println(x);
			
		}

		
	}
}
