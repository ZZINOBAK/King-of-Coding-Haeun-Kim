package com.mystudy.stringbuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex04_String_controls_exam {

	public static void main(String[] args) {
//		****************************** 문자열 다루기 ******************************
//		0.문자열 데이터
//		  String str1 = "홍길동 이순신  이순신 Tom 홍길동";
//		  String str2 = "    TOM   을지문덕 김유신 연개소문";
		String he1 = "김하은 金하은  金하은 Kim 김하은";
		String he2 = "    KIM   김하은씨 찐호박 김하은님";
	
		System.out.println("<1번> 김하은 코드");
		System.out.println("<String 문자열을 StringBuilder 문자열로 만들기>");		
		System.out.println();

//		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		System.out.println("1-1. String str1");
		StringBuilder sb1 = new StringBuilder(he1);
		System.out.println(sb1);
		System.out.println();

		System.out.println("1-2. String str2");
		StringBuilder sb2 = new StringBuilder(he2);
		System.out.println(sb2);
		
		System.out.println("---------------------");
		System.out.println("<1번> 썜 코드 : split");
		String str1 = "홍길동 이순신  이순신 Tom 홍길동";
		String str2 = "   TOM  을지문덕 김유신 연개소문";
		
		StringBuilder sb = new StringBuilder(str1);
		sb.append(str1).append(str2);
		System.out.println(sb);
		
		System.out.println("---------------------");
		System.out.println("<1번> 썜 코드 : StringTokenizer");
		StringTokenizer tokens = new StringTokenizer(sb.toString(), " "); 
		//충격적 이렇게 쓰면 스트링빌더 쓸수 있네!!!!!!!
		System.out.println(tokens.countTokens());
		
		System.out.println("---------------------");
		System.out.println("<2-1번> 김하은 코드");
		System.out.println("<StringBuilder 문자열을 잘라서 빈칸 추출하지 말고 이름만 출력>");		
		System.out.println();

//		2-1. sb의 문자열을 빈칸 1개(" ")를 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
//		     (String split() 또는 StringTokenizer 클래스 사용)
//		      예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		System.out.println("2-1-1. String str1 : 토크나이저");
		StringTokenizer strToken1 = new StringTokenizer(he1," ");
//		System.out.println(strToken1.countTokens());
		int a1 = strToken1.countTokens();
		for (int i = 0; i < a1; i++) {
			System.out.print(strToken1.nextToken() + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("2-1-2. String str2 : 토크나이저");
		StringTokenizer strToken2 = new StringTokenizer(he2," ");
//		System.out.println(strToken2.countTokens());
		int a2 = strToken2.countTokens();
		for (int i = 0; i < a2; i++) {
			System.out.print(strToken2.nextToken() + " ");
		}
		System.out.println();
		// 스플릿 쓰면 스페이스가 다 데이터로 입력되고
		// 토크나이저 쓰면 스페이스는 데이터 아니고 이름만 데이터.
		
		System.out.println("---------------------");
		System.out.println("<2-1번> 썜 코드 : split");
//		String str = sb.toString();
//		String[] names = str.split(" ");
		String[] names = sb.toString().split(" "); //**이게 조금 특이하군. 
		System.out.println(names.length);
		//저장된 배열 데이터 확인
		for (int i = 0; i < names.length; i++) {
			System.out.print("-" + names[i] + "- , ");
		}
		System.out.println();
		
		//화면에 출력 : 홍길동,이순신,이순신,Tom ...
		System.out.println("equals() 사용");
		for (int i = 0; i < names.length-1; i++) {
			if (!"".equalsIgnoreCase(names[i])) { //names[i].equalsIgnoreCase("") 이것보다는 지금 실행된 코드로 사용하는 것이 좋음.
				System.out.print(names[i] + ", "); // 이유는 데이터 중 null이 있을 수 있기 때문이라고 함. 굳이 반대로 하겠다면 null이 아니면 이라는 가정도 추가해 줘야 함.
			} // 맨앞에 느낌표는 아니면, 실행해라 라는 표시.
		} System.out.print(names[names.length-1]);
		System.out.println();
		
		System.out.println("length() > 0 사용");
		for (int i = 0; i < names.length-1; i++) {
			if (names[i].length() > 0) { 
				System.out.print(names[i] + ", "); 
			} 
		} System.out.print(names[names.length-1]);
		System.out.println();
		
		for (int i =0; i < names.length; i++) {
			if (names[i] == null) continue; //지금데이터에는 null없는거 알아서 안써도 됨.
			if (names[i].trim().length() < 1) continue;
			if (i == 0) {
				System.out.print(names[i]);
			} else {
				System.out.print(", " + names[i]);
			}
		} //이렇게 하니까 마지막 콤마 안나오는군.
		System.out.println();
		
		System.out.println("---------------------");
		System.out.println("<2-1번> 썜 코드 : StringTokenizer");
		while (tokens.hasMoreTokens()) {
			System.out.print(tokens.nextToken() + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("---------------------");
		System.out.println("<2-2번> 김하은 코드");
		System.out.println();

//		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		System.out.println("2-2-1. String str1 : 스플릿");
		String[] strSplit1 = he1.split(" ");
//		System.out.println(strSplit1.length);
//		System.out.println(Arrays.toString(strSplit1));
		for (String aaa : strSplit1) {
			System.out.print(aaa + ", ");
		} // 개선된 포문?이걸로 하면 마지막 쉼표 못없앰???
		System.out.println();
		System.out.println();

		System.out.println("2-2-2. String str2 : 스플릿");
		String[] strSplit2 = he2.split(" ");
//		System.out.println(strSplit2.length);
//		System.out.println(Arrays.toString(strSplit2));	
		for (String aaa : strSplit2) {
			System.out.print(aaa + ", ");
		} // 개선된 포문?이걸로 하면 마지막 쉼표 못없앰???
		System.out.println();
		
		System.out.println("---------------------");
		System.out.println("<3번> 김하은 코드");
		System.out.println("<StringBuilder 문자열을 잘라서 빈칸 추출하지 말고 이름을 콤마(,)로 구분하여 출력>");
		System.out.println();

//		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
//		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM... 
//		StringBuilder sb1 = new StringBuilder(he1);
//		StringBuilder sb2 = new StringBuilder(he2);
//		String sb11 = sb1.toString();
//		String sb22 = sb2.toString();
		System.out.println("3-1. String str1 : 스플릿");
		for (int i = 0; i < strSplit1.length-1; i++) {	
			if (strSplit1[i].length() != 0) {
			System.out.print(strSplit1[i] + ", ");
			}
		} System.out.print(strSplit1[strSplit1.length-1]);
		System.out.println();
		System.out.println();
		
		System.out.println("3-2. String str2 : 스플릿");
				for (int i = 0; i < strSplit2.length-1; i++) {	
			if (strSplit2[i].length() != 0) {
			System.out.print(strSplit2[i] + ", ");
			}
		} System.out.print(strSplit2[strSplit2.length-1]);
		System.out.println();
		System.out.println();
		
		System.out.println("3-1. String str1 : 토크나이저");
		StringTokenizer strToken11 = new StringTokenizer(he1," ");
//		System.out.println(strToken11.countTokens());
		int a11 = strToken11.countTokens()-1;
		for (int i = 0; i < a11; i++) {
			System.out.print(strToken11.nextToken() + ", ");
		}System.out.print(strToken11.nextToken());
		System.out.println();
		System.out.println();
		
		System.out.println("3-2. String str2 : 토크나이저");
		StringTokenizer strToken22 = new StringTokenizer(he2," ");
//		System.out.println(strToken22.countTokens());
		int a22 = strToken22.countTokens()-1;
		for (int i = 0; i < a22; i++) {
			System.out.print(strToken22.nextToken() + ", ");
		}System.out.print(strToken22.nextToken());
		System.out.println();
		
		System.out.println("---------------------");
		System.out.println("<3번> 썜 코드 : split");
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) continue;
			if (names[i].trim().length() < 1) continue;
			if (i == 0) {
				sb3.append(names[i]);
			} else {
				sb3.append(",").append(names[i]);
			}
		}
		System.out.println(sb3.toString());
		
		System.out.println("---------------------");
		System.out.println("<3번> 썜 코드 : StringTokenizer");
		tokens = new StringTokenizer(sb.toString(), " ");  //새로 만들 필요가 없네. 이렇게 코딩을 하면.
		//충격적 이렇게 쓰면 스트링빌더 쓸수 있네!!!!!!!
		System.out.println(tokens.countTokens());
		String[] names2 = new String[tokens.countTokens()]; //이렇게 배열 만들면 되는군요.
		System.out.println(names2.length);
		int idx = 0;
		while (tokens.hasMoreTokens()) {
			//배열에 저장
			System.out.print(names2[idx] = tokens.nextToken());
			idx++;
		} // while문으로 배열 생성함.
		System.out.println();
		System.out.println(Arrays.toString(names2));
		for (int i = 0; i < names2.length-1; i++) {
			System.out.print (names2[i] + ", ");
		} System.out.println(names2[names2.length-1]);
		System.out.println();

		System.out.println("---------------------");
		System.out.println("<4번> 김하은 코드");
		System.out.println("<StringBuilder 문자열을 잘라서 빈칸 추출하지 말고 이름 첫자만 콤마(,)로 구분하여 출력>");	
		System.out.println();

//		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
//		      예) 홍,이,이,T,홍,T,을... 
		System.out.println("4-1. String str1 : 토크나이저");
		StringTokenizer strTokenb1 = new StringTokenizer(he1," ");
//		System.out.println(strTokenb1.countTokens());
		int b1 = strTokenb1.countTokens()-1;
		for (int i = 0; i < b1; i++) {
			System.out.print(strTokenb1.nextToken().charAt(0) + ", ");
		} 
		System.out.println(strTokenb1.nextToken().charAt(0));
		System.out.println();

		System.out.println("4-2. String str2 : 토크나이저");
		StringTokenizer strTokenb2 = new StringTokenizer(he2," ");
//		System.out.println(strTokenb2.countTokens());
		int b2 = strTokenb2.countTokens()-1;
		for (int i = 0; i < b2; i++) {
			System.out.print(strTokenb2.nextToken().charAt(0) + ", ");
		} 
		System.out.println(strTokenb2.nextToken().charAt(0));
		System.out.println();
		
		System.out.println("4-1. String str1 : 스플릿");
		for (int i = 0; i < strSplit1.length-1; i++) {	
			if (strSplit1[i].length() != 0) {
				System.out.print(strSplit1[i].charAt(0) + ", ");
			}
		} System.out.println(strSplit1[strSplit1.length-1].charAt(0));
		System.out.println();
		
		System.out.println("4-2. String str2 : 스플릿");
		for (int i = 0; i < strSplit2.length-1; i++) {	
			if (strSplit2[i].length() != 0) {
				System.out.print(strSplit2[i].charAt(0) + ", ");
			}
		} System.out.println(strSplit2[strSplit2.length-1].charAt(0));
		System.out.println();
		
		System.out.println("---------------------");
		System.out.println("<4번> 썜 코드 : split");
		StringBuilder sb4 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) continue;
			if (names[i].trim().length() < 1) continue;
			sb4.append(names[i].charAt(0)).append(",");
		}
//		sb4.delete(sb4.length() - 1, sb4.length());
		sb4.deleteCharAt(sb4.length() - 1);
		System.out.println(sb4);
		
		System.out.println("---------------------");
		System.out.println("<4번> 썜 코드 : StringTokenizer");
		for (int i = 0; i < names2.length-1; i++) {
			System.out.print (names2[i].charAt(0) + ", ");
		} System.out.println(names2[names2.length-1].charAt(0));
		System.out.println();
		
		System.out.println("---------------------");
		System.out.println("<5번> 김하은 코드");
		System.out.println("<StringBuilder 문자열을 자른 데이터값 중 4글자 이상인 값만 출력>");	
		System.out.println();
//		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
//		      예) 인덱스번호:을지문덕
		System.out.println("5-1. String str1 : 스플릿");
//		System.out.println(strSplit11.length);
//		System.out.println(Arrays.toString(strSplit11));
		for (int i = 0; i < strSplit1.length; i++) {
			if (strSplit1[i].length() >= 4) {
				System.out.println("인덱스번호:" + i 
						+ ", 이름:" + strSplit1[i]);
			} 
		} 
		System.out.println();	
//		
		System.out.println("5-2. String str2 : 스플릿");
//		System.out.println(strSplit22.length);
//		System.out.println(Arrays.toString(strSplit22));
		for (int i = 0; i < strSplit2.length; i++) {
			if (strSplit2[i].length() >= 4) {
				System.out.println("인덱스번호:" + i 
						+ ", 이름:" + strSplit2[i]);
			}
		} 
		System.out.println();	


		
	}

}
