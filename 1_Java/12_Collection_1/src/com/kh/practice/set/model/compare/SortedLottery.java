package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

// 정렬 기준을 정의하기 위한 객체
//comparator 인터페이스 구형
public class SortedLottery implements Comparator<Lottery> {
	
	
	@Override
	public int compare(Lottery o1, Lottery o2) {
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는 정렬
		int num = o1.getName().compareTo(o2.getName());
		/*
		 * A.compareTo(B) : 오름차순
		 * - 0 : A 와 B가 같을때
		 * - 양수 (0<) : A 가 B 보다 클때. A B
		 * - 음수 (0>) : B 가 A 보다 클때. B A
		 */
		if (num == 0) {
			// 이름이 같을 경우 번호로 정렬 기준 확인
			return o1.getPhone().compareTo(o2.getName());
		}
		
		return num;
	}


}
