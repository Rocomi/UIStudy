package com.kh.chap01_beforeNSafter.after.run;

import com.kh.chap01_beforeNSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeNSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeNSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {

		Desktop d = new Desktop();
		System.out.println(d.information());
		
		SmartPhone s = new SmartPhone();
		System.out.println(s.information());
		
		Tv t  = new Tv();
		System.out.println(t.information());
		
		
		Desktop d2 = new Desktop("삼성", "SS-01", "삼성데스크탑", 200, true);
		
		SmartPhone s2 = new SmartPhone("삼성", "S052201", "갤럭시 폴드5", 180, "KT");
		
		Tv t2  = new Tv("삼성", "St-02123", "삼성 full HD TV", 250, 108);
		
		
		System.out.println(d2.information());
		System.out.println(s2.information());
		System.out.println(t2.information());
		

	}

}
