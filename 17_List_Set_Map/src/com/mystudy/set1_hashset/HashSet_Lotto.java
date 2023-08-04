package com.mystudy.set1_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class HashSet_Lotto {
	
	public static void main(String[] args) {
		// Set 을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 Set에 저장
		// 1. 로또번호 6개를 추첨해서 Set에 저장하고 화면 출력
		//    Math.random() : 0.0 ~ 0.9999999.. 실수형 데이터 생성(0 <= ran < 1)
		//	  Math.random() 사용 : (int)(Math.random() * 45 + 1)

		HashSet<Integer> set1 = new HashSet<Integer>();
		
		int loddo = (int)(Math.random() * 45 + 1);
		System.out.println(set1);
		
		
		int[] sett = new int[6];
		int i = 0;
		Iterator<Integer> ite = set1.iterator();
		while (ite.hasNext()) {
			sett[i] = ite.next();
			i++;
		}
//		for (int i = 0; i < sett.length; i++) {
//				sett[i] = ltt.a;
//		}
//		Arrays.sort((set.add((int)(Math.random() * 45 + 1))));;
		System.out.println("--------------------");
		
		// 2. 출력은 작은 숫자부터 큰 숫자 형태로 출력
		//    예) 금주의 로또번호 : 5, 8, 10, 25, 33, 41
		
//		
		System.out.println(Arrays.toString(sett));

		System.out.println("----------------------");
		Arrays.sort(sett);
		System.out.println(Arrays.toString(sett));

		System.out.println();
		System.out.print("금주의 로또 번호는~~~~ ");
		for (int i1 = 0; i1 < sett.length-1; i1 ++) {
			 System.out.print(sett[i1] + ", ");
		} System.out.println(sett[sett.length-1]);
//		System.out.println(Arrays.toString(set));
		
		//---------------------------------------------
		
		
		System.out.println("-------------쌤-------------------");
		//HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set = new HashSet<>();
		
		for (; set.size() < 6; ) { //6개가 될때까지
			int ranNum = (int)(Math.random() * 45 + 1);
			System.out.println("로또번호 : " + ranNum);
			set.add(ranNum);
		}
		System.out.println("로또번호 : " + set);
		System.out.println("------------------");
		set.clear();
		
		while (set.size() < 6) { // 6개가 될때까지
			set.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("로또번호 : " + set);
		
		System.out.println("======= 오름차순 정렬 후 출력 ==========");
		ArrayList<Integer> lottoList = new ArrayList<Integer>(set);
		System.out.println("정렬전 lottoList : " + lottoList);
		
		Collections.sort(lottoList);
		System.out.println("정렬후 lottoList : " + lottoList);
		
		System.out.println("== 금주의 로또번호 발표 ===");
		System.out.print("금주의 로또번호 : ");
		boolean isFirst = true;
		for (Integer num : lottoList) {
			if (isFirst) {
				System.out.print(num);
				isFirst = false;
			} else {
				System.out.print(", " + num);
			}
		}
		System.out.println();
		
		
	}
	
}
