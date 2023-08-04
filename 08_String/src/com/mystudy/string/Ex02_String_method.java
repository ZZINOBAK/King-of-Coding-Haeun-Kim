package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// String 클래스 메소드를 사용 문자열 처리(단, 원본문자열 불변)
		//    0123456789
		String he = "김하은";
		he = "김똥똥";
		
		String hello = "Java World";
		System.out.println(hello);
		
		System.out.println("-----charAt(인덱스번호)-----");
		char ch = hello.charAt(0);
		System.out.println(ch);
		System.out.println(hello.charAt(1));
		
		char[] ch2 = new char[4];
//		ch2[0] = hello.charAt(0);
//		ch2[1] = hello.charAt(1);
//		ch2[2] = hello.charAt(2);
//		ch2[3] = hello.charAt(3);
		for (int i = 0; i < 4; i++) {
			ch2[i] = hello.charAt(i);
		}
		System.out.println(Arrays.toString(ch2));		
		
		System.out.println("----compareTo() : 문자열비교(결과: 음수, 0, 양수)---");
		System.out.println("java".compareTo("java"));
		System.out.println("aaa".compareTo("aaa"));
		System.out.println("bbb".compareTo("aaa"));
		// 앞쪽 문자열이 비교 기준이 됨. 맨 앞부터 문자 하나하나 비교해 나감.
		// 저 문장에서는 bbb가 비교 기준이 됨.
		System.out.println("aaa".compareTo("bbb"));
		System.out.println("aaa".compareTo("ㄱ"));
		System.out.println("bbb".compareTo("bbbb"));
		System.out.println("ccc".compareTo("aaa"));
		//이게 숫자가 그 int로 바꿨을때 나오는 숫자 차액이 나오네.
		// 저거를 뭐라고 하더라 유니코드 인가.... 아무튼...
		
		System.out.println("----------------------------");
		//       0123456789
		hello = "Java World Kim Ha Eun";
		System.out.println(hello);
		System.out.println("-----indexOf() : 문자(문자열) 위치값 확인-----------");
		System.out.println(hello.indexOf('J'));
		System.out.println(hello.indexOf('E'));
		System.out.println(hello.indexOf("Kim"));
		System.out.println(hello.indexOf("C")); //없으니까 -1이 뜨네
		System.out.println(hello.indexOf(" "));
		System.out.println(hello.indexOf("a")); //겹치는 데이터는 맨 앞거 알려주네
		System.out.println(hello.indexOf('a', 2)); //2번 인덱스부터 a 찾기
		System.out.println(hello.lastIndexOf('a')); // 끝에서부터 a 찾기

		System.out.println("-----startsWith(), endsWith()-----------");
		System.out.println(hello.startsWith("Java")); //자바로 시작하니?
		System.out.println(hello.startsWith("World")); //월드로 시작하니?
		System.out.println(hello.endsWith("Java")); //자바로 끝나니?
		System.out.println(hello.endsWith("World")); //월드로 끝나니?
		System.out.println(hello.endsWith("Eun")); //은으로 끝나니?

		System.out.println("-----isEmpty()-----");
		System.out.println(hello.isEmpty());
		hello = "";
		System.out.println(hello.isEmpty());
		
		System.out.println();
		
		hello = "Java World Kim Ha Eun";
		System.out.println(hello.length());
		
		System.out.println("----replace() : 문자, 문자열 변경값 리턴----");
		System.out.println(hello.replace("Ha Eun", "ddong ddong"));
		System.out.println(hello); //원본데이터 값은 안변함!!!!
		
		hello = "jabak jabak";
		System.out.println(hello.replace("ja", "cha"));
		System.out.println(hello.replace("jabak", "ddong"));
		
		System.out.println("-----substring() : 부분 문자열 추출----");
		hello = "Java World Kim Ha Eun";
		System.out.println(hello.substring(5)); //5번 인덱스부터 끝까지 출력
		System.out.println(hello.length());
		
		hello.substring(3, 9);
		System.out.println(hello.substring(3, 9)); //3번 인덱스 이상, 9번 인덱스 미만
		System.out.println(hello.substring(3, hello.length())); //3번부터 랭스만큼 데이터 출력.
		
		// 뒤에서 문자 5개만 사용
		System.out.println(hello.substring(hello.length() - 5));
		
		System.out.println("-----가지치기 trim---");
		hello = "    Java World Kim Ha Eun    ";
		System.out.println(hello);
		System.out.println(hello.trim()); // 앞뒤 스페이스 잘라내버림.
		
		System.out.println(hello.toUpperCase()); // 전체가 대문자로 바뀜
		System.out.println(hello.toLowerCase()); // 전체가 소문자로 바뀜
		
		System.out.println("-----String.valueOf() : 문자열로 변환----");
		int num = 100;
		hello = num + ""; // String < ----- int // 인트타입을 스트링타입으로 변환??
		hello = String.valueOf(100); //100을 문자열로 형변환
		hello = String.valueOf(num); //.valueOf 는 이미 static이 붙어있음.
		// 그래서 뭐 쓸수 있다는거 같은데 뭔소리인지 모르겠구나~~~~~~~~~
		System.out.println();
		
		System.out.println("-----toCharArray() : 문자열을 char[]로 변환----");
		hello = "Java World Kim Ha Eun";
		char[] charArray = hello.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[0]);
		System.out.println(charArray);
		
		hello = "Java World Kim Ha Eun";
		System.out.println(hello.contains("Kim"));
		// (무엇의 안에 또는 그 일부로) …이 들어[함유되어] 있다


		
	}

}
