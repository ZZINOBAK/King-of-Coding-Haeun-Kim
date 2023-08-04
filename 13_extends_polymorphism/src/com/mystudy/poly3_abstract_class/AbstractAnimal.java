package com.mystudy.poly3_abstract_class;

// 추상클래스 : abstract class
// 클래스에 추상메소드가 1개 이상 있으면 추상클래스로 선언
// 추상클래스는 객체(인스턴스) 생성 할 수 없음
abstract class AbstractAnimal { //클래스에는 100% 구현된 메소드만 올 수 있음.
	String name; //이름, 명칭
	int legCnt; //다리갯수
	
	void eat() {
		System.out.println("냠냠냠냠");
	}
	
	void sleep() {
		System.out.println("쿨쿨쿨쿨");
	}
	
	abstract void sound(); // 추상메소드(abstract 메소드)
}
