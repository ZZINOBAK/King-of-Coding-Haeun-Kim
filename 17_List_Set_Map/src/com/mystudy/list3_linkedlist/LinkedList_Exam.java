package com.mystudy.list3_linkedlist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedList_Exam {

	public static void main(String[] args) {
		// LinkedList : List 속성(List 인터페이스 구현체)
		//LinkedList<String> list = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		list.add("홍길동"); //0번 인덱스
		list.add("홍길동"); //1번 인덱스
		list.add("김유신");
		System.out.println("list : " + list);
		System.out.println("list.get(0) : " + list.get(0));
		
		list.remove("홍길동");
		System.out.println(list);

		String str = "홍길동,홍길동,김유신,강감찬,을지문덕,홍경래,김유신,홍길동";
		String[] names = str.split(",");
		System.out.println("names : " + Arrays.toString(names));
		
		//배열에 있는 데이터를 리스트에 추가
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		System.out.println("list : " + list);

		System.out.println("-----실습 나-----------");
		//list : [홍길동, 김유신, 홍길동, 홍길동, 김유신, 강감찬, 을지문덕, 홍경래, 김유신, 홍길동]
		//----------------------
		//(실습) 리스트에 있는 데이터 변경하기
		List<String> list1 = new LinkedList<String>();
		System.out.println("리스트1 만들기 : ");
		System.out.println(list1);
		System.out.println();
		
		String str1 = "홍길동, 김유신, 홍길동, 홍길동, 김유신, 강감찬, 을지문덕, 홍경래, 김유신, 홍길동";
		String[] names1 = str1.split(", ");
		System.out.println("배열 네임스1 만들기 : ");
		System.out.println(Arrays.toString(names1));
		System.out.println();
		
		for (int i = 0; i < names1.length; i++) {
			list1.add(names1[i]);
		}
		System.out.println("배열 네임스1의 데이터를 리스트1에 넣음 : ");
		System.out.println(list1);
		System.out.println();
		
		//1. 홍길동 : 모두 삭제(Delete)
		for (int i = 0; i < list1.size(); i++) {
				list1.remove("홍길동");
		}
		System.out.println("홍길동 삭제한 리스트 : ");
		System.out.println(list1);
		System.out.println();
		
		//2. 김유신 ---> 김유신2 모두 수정(Update)
		Iterator<String> ite = list1.iterator();
		while (ite.hasNext()) {
			if (ite.next().equalsIgnoreCase("김유신")) {
				list1.set(list1.indexOf("김유신"), "김유신2");
			}
		}
		System.out.println("김유신을 김유신2로 바꾼 리스트 : ");
		System.out.println(list1.toString());
		System.out.println();

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).equalsIgnoreCase("을지문덕")) {
				list1.set(i,  "김하은");
			}
		}
		System.out.println(list1);

		//-------------------------
		
		System.out.println("-----실습 쌤-----------");
		//1. 김유신 ---> 김유신2 모두 수정(Update)
		System.out.println("=== 김유신 ---> 김유신2 모두 수정 =====");
		for (int i = 0; i < list.size(); i++) {
			if ("김유신".equals(list.get(i))) {
				System.out.println(i + " : " + list.get(i));
				list.set(i, "김유신2");
			}
		}
		System.out.println("김유신 수정후 : " + list);
		
		System.out.println("==== 홍길동 : 모두 삭제(Delete) =====");
		System.out.println("홍길동 삭제전 : " + list);
		System.out.println("삭제전 size : " + list.size());
		/* 뒤에서부터 검색하고 찾으면 삭제 처리
		int size = list.size();
		int lastIdx = list.size() - 1;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " -  size : " + list.size());
			if ("홍길동".equals(list.get(i))) {
				System.out.println(i + " : " + list.get(i));
				list.remove(i);
			}
		}
		-----------------------*/
		//System.out.println("list.remove(\"홍길동\") : " + list.remove("홍길동"));
		//System.out.println("list.remove(\"ABC\") : " + list.remove("ABC"));
		
		/* 찾아서 삭제할 수 없을 때까지 삭제 반복처리
		//while (list.remove("홍길동")) {}
		while (true) {
			boolean removeSuccess = list.remove("홍길동");
			if (!removeSuccess ) { //삭제 실패시
				break;
			}
		}
		---------------------------- */
		
		System.out.println("list.contains(\"홍길동\") : " + list.contains("홍길동"));
		System.out.println("list.contains(\"ABC\") : " + list.contains("ABC"));
		/* 
		while (true) {
			if (list.contains("홍길동")) { // 데이터가 있냐?
				list.remove("홍길동");
			} else {
				System.out.println(">> 삭제 완료(작업끝)");
				break;
			}
			
		}
		--------------- */
		System.out.println("list.indexOf(\"홍길동\") : " + list.indexOf("홍길동"));
		System.out.println("list.indexOf(\"ABC\") : " + list.indexOf("ABC"));
		
		while (true) {
			int idx = list.indexOf("홍길동");
			if (idx == -1) { // 데이터가 없냐?
				System.out.println(">> 삭제 완료(작업끝)");
				break;
			} 
			list.remove(idx);
		}
		
		System.out.println("홍길동 삭제후 : " + list);
		System.out.println("삭제전 size : " + list.size());
				
	}

}
