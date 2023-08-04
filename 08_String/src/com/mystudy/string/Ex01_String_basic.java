package com.mystudy.string;

public class Ex01_String_basic {

	public static void main(String[] args) {
		// String 클래스 : 문자열 저장, 처리하기 위한 클래스
		// String 클래스 : 참조형 데이터 타입
		// String 데이터는 불변임(immutable)
		//---------------------------------
		// 사용형식 2가지
		// String str = "홍길동"; //기본 데이터 타입처럼 사용 가능
		
		// String str = new String("홍길동"); //객체(인스턴스) 생성
		//---------------------------
		String he1 = "김하은";
		String he2 = "김하은";
		String he3 = "김똥똥";
		// he1과 he2의 주소값 동일. 데이터 값이 완전 똑같아서 주소도 같은건가봄~~~
		// he3은 저 두개와 주소값 다름!
		System.out.println("he1의 값 : " + he1);
		System.out.println("he2의 값 : " + he2);
		System.out.println("he3의 값 : " + he3);
		// == : 객체(인스턴스, 주소값) 비교(동일 객체 여부 확인)
		System.out.println("he1과 he2가 같니? : " + (he1 ==he2));
		System.out.println("he1과 he3이 같니? : " + (he1 ==he3));
		System.out.println("he.equals(he2)를 출력하면 : " + he1.equals(he2));
		System.out.println("he.equals(he3)를 출력하면 : " + he1.equals(he3));
		System.out.println("---------------------------");
		
		String heObj1 = new String("김하은");
		String heObj2 = new String("김하은");
		String heObj3 = new String("김똥똥");
		// 얘네는 아까 제일 첫줄과 다르게
		// 데이터 값이 같아도 주소값 다름. 각각 다른 주소에 데이터가 입력되어 있음.
		System.out.println("heObj1의 값 : " + heObj1);
		System.out.println("heObj2의 값 : " + heObj2);
		System.out.println("heObj3의 값 : " + heObj3);
		// == : 객체(인스턴스, 주소값) 비교(동일 객체 여부 확인)
		System.out.println("heObj1과 heObj2가 같니? : " + (heObj1 == heObj2));
		System.out.println("heObj1과 heObj3이 같니? : " + (heObj1 == heObj3));
		// 오 이거는 주소값 출력하는거라서 폴스뜨고
		System.out.println("heObj1.equals(heObj2)를 출력하면 : " + heObj1.equals(heObj2));
		System.out.println("heObj1.equals(heObj3)를 출력하면 : " + heObj1.equals(heObj3));
		// 이거는 진짜 데이터 값 그 자체가 같냐는 물음이라 하나는 트루 하나는 폴스 뜨네.
		System.out.println("---------------------------");
		
		System.out.println("he1과 heObj1가 같니? : " + (he1 == heObj1));
		// 둘이 주소값 다름.
		System.out.println("he1.equals(heObj1)를 출력하면 : " + he1.equals(heObj1));
		// 둘이 데이터 값 같음
		System.out.println("---------------------------");
		
		// !!!!!!!!!!!!!!!!!!강조!!!!!!!!!!!!!!!!!!!!!
		// equals() : 문자열 값을 비교할 때는 반드시 equals() 사용할 것!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// !!강조!!강조!!강조!!강조!!강조!!강조!!강조!!강조!!
		
	}

}
