package com.mystudy.stringbuilder;

import java.text.Collator;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		// String 클래스의 split() vs StringTokenizer 클래스
		System.out.println("-----String split()------");
		String str = "사과-배-복숭아--포도-딸기-수박-체리-망고토마토-참외-메론-오렌지-블루베리";
		System.out.println(str.toString());
		System.out.println(str.split("포"));
		System.out.println(str.split("-"));
		System.out.println(str.split("-", 3));

		System.out.println("-------------------");
		String[] strSplit = str.split("-");
		System.out.println(strSplit.length);
		System.out.println(Arrays.toString(strSplit));
		
		System.out.println("-------------------");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(i + " " + strSplit[i]);
		}
		System.out.println();
		
		System.out.println("---개선된for문으로 배열 strSplit의 데이터 확인하기------");
		for (String str2 : strSplit) {
			System.out.print(str2 + " ");
		} //Arrays.toString(strSplit) 이거랑 사실상 같은거. 데이터 확인용.
		//forEach 또는 개선된for문으로 부른다고 함.
		//위에 저렇게 for문에 i값 안주고 바로 데이터 출력할 수 있는 방법!!
		
		int idx = 0;
		for (String str2 : strSplit) {
			System.out.println(idx + " " + str2);
			idx++;
		} // 개선된for문에서 인덱스 번호 추가하고 싶으면 저렇게 변수 사용하면 됨.
		
		System.out.println("\n----StringTokenizer-----");
		// \n 기억하렴. 한줄 띄기. 굳이 sysout 한번 더 안써도 되니까.
		str = "사과-배-복숭아--포도-딸기-수박-체리-망고토마토-참외-메론-오렌지-블루베리";
		System.out.println(str);
		StringTokenizer strToken = new StringTokenizer(str,"-");
		System.out.println(strToken.countTokens());
		// 스플릿 썼을때는 데이터 랭스가 13으로 찍히는데, 
		// 토큰을 쓰고 토큰의 개수를 출력하면 12개로 찍힘.
		// 두개가 다름.
		System.out.println(strToken); //데이터 안나오고 주소나오네. 
		System.out.println(strToken.toString()); // 이것도 주소 나옴.
		System.out.println(strToken.nextToken()); // 이건 사과 나오고
		System.out.println(strToken.nextToken()); //이건 사과 다음인 배 나옴.
		System.out.println(strToken.hasMoreTokens()); // 있다.
	
		System.out.println("----------------------");
		while(strToken.hasMoreTokens()) {
			System.out.print(strToken.nextToken() + " ");
		} // 아 빈칸은 출력 안되네. 토큰개수에 빈칸도 제외하긴 했지.
		System.out.println();
		System.out.println(strToken.countTokens()); // 데이터 다 써서 이제 데이터 없음.
		// 토큰개수 0개.
		// 토큰 없을 때 next토큰 메소드 사용하면 예외 발생. Exception!!
		
		//스플릿과 토크나이저의 차이는 빈칸을 데이터로 취급하느냐 안하느냐 차이.
		System.out.println("----------------------");

		String str1 = "호박, 당근, 아스파라거스, 양파, 마늘, 파, 고추, 가지, 애호박, 콩, 콩나물, 시금치, 오이";
		StringTokenizer strToken1 = new StringTokenizer(str1,", ");
		System.out.println(strToken1.countTokens());
		for (int i = 0; i < strToken1.countTokens(); i++) {
			System.out.print(strToken1.nextToken() + " ");
		} // i의 범위를 저렇게 토큰개수로 하면, 넥스트토큰 지나면서 계속 토큰개수가 줄어들어서 범위가 13으로 고정이 안됨.
		// 그래서 밑에서 변수 써서 그냥 13으로 숫자로 고정해 줘야 함.
		System.out.println("\n----------------");
		String str2 = "호박, 당근, 아스파라거스, 양파, 마늘, 파, 고추, 가지, 애호박, 콩, 콩나물, 시금치, 오이";
		StringTokenizer strToken2 = new StringTokenizer(str2,", ");
		System.out.println(strToken2.countTokens());
		int a = strToken2.countTokens();
		for (int i = 0; i < a; i++) {
			System.out.print(strToken2.nextToken() + " ");
		}
		System.out.println("\n----------------");
		System.out.println(strToken2.toString());

	
		
		
		
	}

}
