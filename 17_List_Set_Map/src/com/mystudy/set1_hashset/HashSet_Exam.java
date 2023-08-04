package com.mystudy.set1_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.mystudy.list5_list_vo.StudentVO;


public class HashSet_Exam {

	public static void main(String[] args) {
		// HashSet : Set 인터페이스 구현한 구현체(클래스)
		// 중복데이터 없음(동일데이터는 1개만 저장), 순서가 없다
		//------------------
		// Set에서 동일데이터 여부 확인 hashCode(), equals() 값 확인
		// 1. 해시코드 값 확인 : hashCode()
		// 2. equals() 메소드 결과값이 모두 일치하면 동일 데이터 처리
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		set.add(new String("홍길동"));
		
		System.out.println("set : " + set);
		System.out.println("set.size() : " + set.size());
		System.out.println("\"홍길동\".hashCode() : " + "홍길동".hashCode());
		System.out.println("new String(\"홍길동\").hashCode() : " + new String("홍길동").hashCode());
		
		System.out.println("set.contains(\"홍길동\") : " + set.contains("홍길동"));
		System.out.println("set.contains(\"김자바\") : " + set.contains("김자바"));
		
		set.add("을지문덕");
		set.add("홍경래");
		
		System.out.println("set : " + set);
		
		System.out.println("--- Set 전체 데이터 조회 -----");
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("--- Set 전체 데이터 조회(Iterator 사용) -----");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			//String name = ite.next();
			//System.out.println(name);
			System.out.println(ite.next());
		}
		
		System.out.println("==== 김유신 ---> 강감찬(수정/변경) =====");
		// 수정(변경) : 김유신 ---> 강감찬
		// 일단 김유신이 있는지 확인하고 있으면 변경하고, 없으면 진행하지 마세요.
		// 김유신 삭제 and 강감찬 입력
		// 강감찬 입력 and 김유신 삭제
		//-----------------------
		System.out.println("set에 김유신이 있니? " + set.contains("김유신"));
		System.out.println();
		String name1 = "김유신";
		String gam = "강감찬";
		for (String dd : set) {
			if (set.contains("김유신")) {
				set.remove(name1);
				set.add(gam);
				break;
			}
		}
	
		System.out.println(set);
		printData(set);
		
		System.out.println("----쌤--------------");
		System.out.println("수정전 : " + set);
		
		// 있는지 확인하고 있으면 수정작업, 없으면 작업중단
		if (set.contains("김유신")) {
			System.out.println(">> 데이터 있음 : 수정처리");
			set.remove("김유신");
			set.add("강감찬");
		} else {
			System.out.println(">> 데이터 없음 : 작업처리 안함");
		}
		
		System.out.println("수정후 : " + set);
		
		if (set.remove("김유산")) {
			System.out.println(":: 삭제 처리됨");
		} else {
			System.out.println(":: 없어서 삭제 못함");
		}
		
		System.out.println("---- 전체데이터 화면 출력 ---");
		for (String name : set) {
			System.out.println(name);
		}
		
	}
	
	static void printData(HashSet<String> set) {
		for (String name : set) {
			System.out.println(name);
		}
		
	}

}








