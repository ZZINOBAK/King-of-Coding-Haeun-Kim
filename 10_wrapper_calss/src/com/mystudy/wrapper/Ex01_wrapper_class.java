package com.mystudy.wrapper;

public class Ex01_wrapper_class {

	public static void main(String[] args) {
		// wrapper class : 기본 데이터 타입의 기능 확장한 클래스(들) 총칭
		// 기본 데이터 타입 : 전체소문자
		// boolean, char, byte, short, int, long, float, double
		//wrapper class : 기본 데이터 타입의 첫글자를 대문자로
		// 예외 : char -> Character, int -> Integer
		// Boolean, Character, Byte, Short, Integer, Long, Float, Double
		// -----------
		int num = 100;
		System.out.println(num);
		
//		Integer intNum = new Integer(num); //이렇게 해도 num = 100임.
		Integer intNum = new Integer(100);
		System.out.println(intNum);
		
		String strNum = intNum.toString();
		System.out.println(strNum);
		
		intNum = 900; // Integer <--- int : 자동형변환
		num = intNum; // int <--- Integer : 자동형변환
		
		num = Integer.parseInt("999"); // int <--- String 형변환
		//문자열 999를 팔스인트(인트로변환)한다. 
		intNum = Integer.valueOf("999"); // Integer <--- String 형변환
		// valuOf = 해당 데이터 타입으로 바꿔주는 역할을 한다고 함.
		// 인티저로 바꿈.
		
		String str = String.valueOf(9999); // String <--- int
		// 무슨 데이터든지 스트링으로 바꾼다고????
		
		System.out.println(Integer.MIN_VALUE); //int 최소값 = -2147483648
		System.out.println(Integer.MAX_VALUE); //int 최대값 = 2147483647
		
		System.out.println("-----Boolean-----");
		Boolean bool = true;
		bool = new Boolean(true);
		System.out.println(bool);
		bool = new Boolean("true");
		System.out.println(bool);
		bool = new Boolean("TRUE");
		System.out.println(bool);
		bool = new Boolean("TRue"); 
		System.out.println(bool);
		// 문자열이어도, 대소문자 구분없이 true는 다 트루 출력됨.
		
		bool = new Boolean("false");
		System.out.println(bool);
		// 폴스라고 하면 폴스처리 됨. 이것도 대소문자 구분없이 다 됨.
		
		bool = new Boolean("true2");
		System.out.println(bool);
		// 이것도 폴스
		
		bool = new Boolean("abcd");
		System.out.println(bool);
		// 이것도 폴스
		
		System.out.println("-----Stirng -> Boolean -----");
		Boolean bool2 = Boolean.valueOf("true"); // Boolean <--- Stirng 형변환
		boolean bool3 = Boolean.parseBoolean("true");
		System.out.println(bool2); //true
		System.out.println(bool3); //true
		
		System.out.println("----Float----");
		Float f = 10.5f; // Float <--- float 형변환
		f = new Float(12.5f);
		System.out.println(f);
		f = new Float("12.5f");
		System.out.println(f);
		f = new Float("12.5");
		System.out.println(f);
		
//		f = "12.5f" //이건 오류임. Type mismatch
				
		String str2 = String.valueOf(f); // Strung <--- Float 형변환
		System.out.println(str2); //숫자처럼 출력되지만 타입은 문자열임.
		
		f = Float.valueOf("12.5f"); // Float <--- String 형변환
		//이렇게 하면 오류 아님.
		System.out.println(f);
		
		System.out.println("----Double----");
		Double d = 10.5D; // Double <--- double 서로는 자동형변환 됨.
		d = new Double(12.5d);
		System.out.println(d);
		d = new Double("12.5d");
		System.out.println(d);
		
		d = Double.valueOf("12.5d");
		System.out.println(d);
		d = Double.valueOf("12.5");
		System.out.println(d);
		d = Double.valueOf("10.5f"); //float타입 : double타입에 담을 수 있음.
		System.out.println(d);
		
		
	}

}
