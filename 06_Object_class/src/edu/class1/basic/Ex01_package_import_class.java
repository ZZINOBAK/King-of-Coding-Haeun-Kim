package edu.class1.basic;
// 패키지 만들었더니 나온 문장
/*
 package 선언문 : java 파일의 맨 첫번째에 위치하며 한 번만 작성
 자바(class) 파일의 위치를 나타냄
 일반적으로 회사의 도메인명을 반대로 적용해서 사용
 작성예) com.naver.project, com.itwill.mystudy
 */
import java.util.Scanner;
// 매번 위치 경로를 쓰지 않아도
// 앞에서 import 선언문을 사용해주면 계속 경로 안써도 됨.
// 편리한 것

//String, System 등은
//java.lang 패키지에 있음.
//java.lang 패키지에 있는 클래스들은 경로설정 안해줘도 
//자동으로 사용 가능함~~~~

import java.util.*;
// 별 = 모든 것
// 자바의 유틸 패키지에 있는 모든 클래스
// 대표문자(wild card)
// 그래도 웬만하면 클래스 이름 명시해 주는 것이 좋음!!

public class Ex01_package_import_class {
//class 선언문은 필수!!
// 여기 클래스 {} 안에 있는 내용이 메소드????????????	
	
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		//첫글자 대문자로 시작 시 = 클래스 또는 인터페이스
		//() 소괄호 = 생성자
		//첫글자 소문자로 시작 시 = 변수 = 소괄호 없음
		//java.util.Scanner = 자바 내의 유틸에 있는 스캐너라는 클래스
		Scanner scan1 = new Scanner(System.in);
		System.out.println("인사");
		
		String hello = scan.nextLine();
		// 스캔 변수에 있는 넥스트라인이라는 메소드
		// 소문자 시작 + 소괄호 = 메소드
		System.out.println(hello);
		

	}

}
