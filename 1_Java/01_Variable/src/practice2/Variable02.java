package practice2;

public class Variable02 {

	public static void main(String[] args) {
		
		// 1. 대소문자가 구분된다. (길이제한 x)
		int num = 10;
		int nuM = 20;
		
		// 2. 예약어를 사용하면 안된다.
		// int class; //syntax error
		int classNum = 19;
		
		// 3.숫자로 시작하면 안된다.
		// int 1age; //syntax error
		int age1 = 30;
		
		// 4. 특수문자는 '_'와 '$'만 가능하다.
		//String sh@rp; //syntax error
		String $harp = "knife";
		
		// 5. 카멜케이스 : 소문자로 시작하여 다음 단어의 첫글자를 대문자로 작성하는 규칙
		//회원이름
		String userName = "HeeYun";
		//String UserName;  문법상 오류는 아니나, 추후 어떤환경에서 문제가 생길수 있음
		// 제품(porduct)의 번호(id) => 정수형
		int productId = 979;
		// 책(book)의 제목(title) => 문자열
		String bookTitle = "java programming";
	
		
		System.out.println(num);
		System.out.println(nuM);
		System.out.println(num + nuM);
		System.out.println(age1);
		System.out.println($harp);
		System.out.println(userName);
		System.out.println(productId);
		System.out.println(bookTitle);
	
		/*String str = "기차"; - 기차
		String str = new String("기차");
		String str = "기차" + "칙칙폭폭"; - 기차칙칙폭폭
		String str = new String("기차" + "칙칙폭폭");*/
		
		String str = "기차" + 123 + 45 + "출발";
		System.out.println(str); // 기차12345출발
		
		String stR = 123 + 45 + "기차" + "출발";
		System.out.println(stR); // 168기차출발
		
	}
}
