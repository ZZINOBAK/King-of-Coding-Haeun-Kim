package com.mystudy.string;

import java.util.Arrays;

public class Ex04_String_array_exam {

	public static void main(String[] args) {
		//* String[]과 String 메소드 사용 실습	
//		문자열 : "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		String name0 = "김똥깨";
		String name1 = "김하은";
		String name2 = "김똥똥";
		String name3 = "김뷰리풀";
		String name4 = "김하은";
		String name5 = "김아리따움";
		String name6 = "김똥똥똥";
		String name7 = "KIM";
		String name8 = "김똥똥";
		String name9 = "KiM";
		String name10 = "김하은";
		String name11 = "kim";
		String name12 = "찐호박박박";
		String name13 = "김아름다움";
		
//		1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		String[] names = {name0, name1, name2, name3, name4, name5, name6, name7
				, name8, name9, name10, name11, name12, name13};
		System.out.println(names);
		System.out.println("-----------1번 나-------------");
		String aaa = names[0];
		System.out.println(aaa);
		System.out.println(aaa.substring(0, 1));
//		for (int i = 0; i < names.length; i++) {
//			String ai = names[i];	
//			System.out.println(ai);
//		}
		System.out.println();

		
//		-------------------쌤-----------------
		System.out.println("---------1번 쌤--------------");
		System.out.println(Arrays.toString(names));
		System.out.println();

		
//		2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
//		   출력 예) 홍길동,이순신,이순신,을지문덕....
		System.out.println("---------2번 나-----------------");
//		System.out.print(names[0] + ", ");
//		System.out.print(names[1]);		
		for (int i = 0; i < names.length-1; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.print(names[names.length-1]);
		System.out.println();
		System.out.println();
		
//		-------------------쌤-----------------
		System.out.println("---------2번 쌤--------------");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) {
				System.out.print(names[i]);
			} else {
				System.out.print(names[i] + ", ");
			}
		} // 마지막 데이터에 ,콤마 없애는 코드
		System.out.println();
		
		System.out.print(names[0]);
		for (int i = 1; i < names.length; i++) {
			System.out.print(", " + names[i]);
		}// 마지막 데이터에 ,콤마 없애는 코드
		
		System.out.println();

//		3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
//		   출력 예) 홍,이,이,을,김,연,T,T...
		System.out.println("----------3번 나------------");
//		System.out.println(name0.charAt(0));
//		System.out.println(name1.charAt(0));
	
//		String namess = names[0];
//		System.out.println(namess.charAt(0));
//		String namess = names[1];
//		System.out.println(namess.charAt(0));
		System.out.print(names[0].charAt(0));
		for (int i = 1; i < names.length; i++) {
			String namesf = names[i];
			System.out.print(", " + namesf.charAt(0));
		}
		System.out.println();
		System.out.println("你好吗 我是金夏恩。 你叫什么名字？ 啊！ 你的名字是朴^(*￣(oo)￣)^映");
		// 마지막 T 끝에 ,콤마 빼고 싶은데 어케 하는거임 ㅡㅡ
		System.out.println();
		
//		-------------------쌤-----------------
		System.out.println("---------3번 쌤--------------");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i].charAt(0) + ",");
		} 
		System.out.println();
		System.out.println();

//		String[] names = {name0, name1, name2, name3, name4, name5, name6, name7};
//		4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
//		   예) 3:을지문덕
		System.out.println("------------4번 나------------------");
//		if (names[0].length() >= 4) {
//			System.out.println("출력");
//		}
//		if (names[3].length() >= 4) {
//			System.out.println("출력");
//		}
		for (int i = 0; i < names.length; i++) {
			String namesf = names[i];	
			if (namesf.length() >= 4) {
				System.out.println("인덱스번호:" + i 
						+ ", 이름:" + namesf);
			}
		}
		System.out.println("li zhi yuan");
		System.out.println();
		
//		-------------------쌤-----------------
		System.out.println("---------4번 쌤--------------");
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				System.out.println(i + " " + names[i]);
			}
		}
		System.out.println();
		
//		5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
//		   예) 1:이순신=2:이순신
//		(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)		
		System.out.println("---------5번 나--------------");
//		.equals 사용하기	
		for (int i = 0; i < names.length-1; i++) {
			for (int i1 = i+1; i1 < names.length; i1++) {
				if (names[i].equalsIgnoreCase(names[i1])) { 
					System.out.println(i + " " + names[i] 
							+ " = " + i1 + " " + names[i1]);
					} 
			}
			
		} // 끝!!!!! 완료 !!!! 
		System.out.println();
		// .equalsIgnoreCase() 이거 메모 안해둠.
		// 선생님 말했다고 하는데, 말 안한듯

//		-------------------쌤-----------------
		System.out.println("---------5번 쌤--------------");
		int lastIndex = names.length - 1;
		for (int baseIdx = 0; baseIdx < names.length; baseIdx++) {
			for (int i = baseIdx = 1; i < names.length; i++) {
				if(names[baseIdx].equalsIgnoreCase(names[i])) {
					System.out.println(baseIdx + " " + names[baseIdx]
							+ " " + i + " " + names[i]);
				}
			}
			break;
		}
		
		System.out.println("---------5번 쌤--------------");
		names = new String[] {"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"};
		if (names[0].equalsIgnoreCase(names[1])) {
			System.out.println(0 + " " + names[0] + " " + 1 + " " + names[1]);
		}
		// 마지막 데이터 비교 코드
		if (names[0].equalsIgnoreCase(names[names.length-1])) {
			System.out.println(0 + names[0] + " " + (names.length-1) + names[names.length-1]);
		}
		
		// 뒤에 무슨 코드 있었는데 못배낌.
		
	}

}
