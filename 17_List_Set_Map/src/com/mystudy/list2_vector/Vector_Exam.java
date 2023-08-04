package com.mystudy.list2_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector_Exam {

	public static void main(String[] args) {
		// Vector 클래스 : List 인터페이스 구현체
		Vector<String> v = new Vector<String>();
//		List<String> v = new Vector<Stirng>();
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		String temp = v.toString();
		System.out.println(temp);
		
		v.remove(2);
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("--- v.trimToSize() 실행후 ----");
		v.trimToSize();
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.addElement("4문자열");
		System.out.println(v);
		
		v.add("AAA"); //맨뒤에 추가
		System.out.println(v);
		
		Vector<String> v2 = (Vector) v.clone();
		System.out.println(v);
		System.out.println(v2);

		//(개인별)주소값 복사인지 물리적으로 분리된 복사본인지 확인

		System.out.println("======= Enumeration 객체 사용 ============");
		Enumeration<String> enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println("enu.nextElement() : " + enu.nextElement());
		}
		System.out.println("-----------");
		
		//(번외개인별) 기본 for문 사용해서 화면출력(Enumeration 객체 사용)
		
		//=====================
		Iterator<String> ite = v.iterator();
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			System.out.println("ite.next() : " + ite.next());
		}
		System.out.println("ite.hasNext() : " + ite.hasNext());
		
		System.out.println("===== 개선된 for문 사용 데이터 조회 ====");
		for (String str : v) {
			System.out.println(str);
		}
		
		System.out.println("------------나-----------------");
		Vector<Integer> inti = new Vector<Integer>();
		inti.add(9);
		inti.add(1);
		inti.add(3);
		inti.add(10);
		System.out.println(inti);
		System.out.println("v.size() : " + inti.size());
		System.out.println("v.capacity() : " + inti.capacity());
		
		
	}

}
