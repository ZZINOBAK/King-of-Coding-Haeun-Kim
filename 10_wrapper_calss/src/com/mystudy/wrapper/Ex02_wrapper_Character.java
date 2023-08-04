package com.mystudy.wrapper;

public class Ex02_wrapper_Character {

	public static void main(String[] args) {
		// Character 클래스
		// "a" = String 타입임.
		char ch = 'a';
		System.out.print("ch는 알파벳이니? "); //true
		System.out.println(Character.isAlphabetic(ch)); 
		
		System.out.print("'한'은 알파벳이니? "); //true
		System.out.println(Character.isAlphabetic('한')); 
		
		System.out.print("ch는 문자니? "); //true
		System.out.println(Character.isLetter(ch)); 
		
		System.out.print("'0'은 문자니? "); //false
		System.out.println(Character.isLetter('0')); 

		System.out.print("'0'은 디지트니? "); //true
		System.out.println(Character.isDigit('0')); 
		
		System.out.print("'A'는 문자니? "); //true
		System.out.println(Character.isLetter('A')); 
		
		System.out.print("'A'는 대문자니? "); //true
		System.out.println(Character.isUpperCase('A')); 
		
		System.out.print("'A'는 소문자니? "); //false
		System.out.println(Character.isLowerCase('A')); 
		
		System.out.print("' '는 화이트스페이스니? "); //true
		System.out.println(Character.isWhitespace(' ')); 
		
		System.out.print("'\t'는 화이트스페이스니? "); //true
		System.out.println(Character.isWhitespace('\t')); 
		
		System.out.print("'A'는 화이트스페이스니? "); //false
		System.out.println(Character.isWhitespace('A')); 
		
		System.out.println("------------");
		char[] chs = {'한', 'a', ' ', 'A', '+', '0'};
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if (Character.isDigit(chs[i])) {
				System.out.print("숫자");
			}
			if (Character.isWhitespace(chs[i])) {
				System.out.print("공백(제어문자)");
			}
			if (Character.isUpperCase(chs[i])) {
				System.out.print("대 ");
			}
			if (Character.isLowerCase(chs[i])) {
				System.out.print("소 ");
			}
			if (Character.isLetter(chs[i])) {
				System.out.print("문자");
			}
			if (Character.isDefined(chs[i])) {
				System.out.print(", 유니코드문자");
			}
			System.out.println();
		}
	}

}
