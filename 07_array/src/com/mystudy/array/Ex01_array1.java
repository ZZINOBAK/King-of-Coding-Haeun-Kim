package com.mystudy.array;

import java.util.Arrays;

public class Ex01_array1 {

	public static void main(String[] args) {
		// 배열(array) : 동일한 데이터 타입들의 연속된 저장 공간
		// 배열의 선언 : 자료형[] 변수명
		// 변수에 값을 저장 : 배열변수명[인덱스번호] = 값;
		/* 배열 선언 및 생성
		 * 1. 자료형[] 변수명 = new 자료형[갯수];
		 * 	  자료형 변수명[] = new 자료형[갯수];
		 * 2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		 * 3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};
		 */
		
		System.out.println("111111111111자료형[] 변수명 = new 자료형[갯수]; "
				+ "자료형 변수명[] = new 자료형[갯수];-------");
		int[] arr = new int[5];
		// 배열 5개의 값을 넣을 수 있는 데이터공간 만든거임.
		// 초기값 5개는 다 0임
		System.out.println(arr);
		// arr의 주소값이 출력됨. 거기 주소에 데이터 저장되어있는거임. 
		// 배열 = 참조형 데이터
		// 주소를 참조해서 데이터 출력함.
		System.out.println(arr[0]);
		//arr의 주소에 있는 0번째 인덱스의 값을 출력해라. 그래서 0이 출력됨.
		System.out.println(arr[4]);
		// 지금 값을 설정 안해줘서 전부 값이 0 나옴.
		System.out.println("--------------------");
		
		int index = 0;
		for (int i = 1; i < 6; i++) {
			System.out.print(arr[index] + " ");
		} // 변수 사용해서 인덱스값 출력한 식.
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		} // 변수 없이 for 문 내 int 값 이용해서 인덱스값 출력한 식.
		System.out.println();
		
		// 배열의 크기(데이터 입력 칸)를 확인할 수 있는 속성값
		System.out.println(arr.length);
				
		System.out.println("---인덱스 값 설정---");
		arr[0] = 10; // 배열 첫번째 위치(인덱스번소 0번)의 값 설정 : 10
		arr[1] = 'È'; // 문자용 작은따옴표 써야함. 문자열용 큰따옴표 안됨.
		arr[2] = 3000;
		arr[3] = '鱀'; // 오... 이렇게 출력하니까 문자에 해당하는 숫자 출력됨!!!
					  // char 써도 숫자로 출력됨!!!
		arr[4] = 500000; // 마지막 데이터(크기 -1)
		
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 위에 arr.length를 반복문 내 조건으로 사용하면 범위가 변해도 오류 없이 출력 쌉가능!!!
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("22222자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};--------");
		int[] arr2 = new int[] {10, 200, 'ஸ', 40000, 500000};
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("333333333자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};--------");
		int[] arr3 = {10, 100, 1000, 10000, 10000};
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		System.out.println("--------------");
		int[] nums = new int[10];
		//초기값 설정 : 1~10 숫자를 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.print(nums[i] + " ");
		}
		
		System.out.println("-----영어 알파벳 문자 저장 후 출력 a-z---");
		char[] ch = new char[26];
		System.out.println(Arrays.toString(ch)); //어레이.투스트링(변수명) 출력하면 배열의 데이터 값 다 출력해줌.
		System.out.println("-" + ch[0] + "-");

		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		System.out.println(ch);
		
		System.out.println("-----영어 알파벳 a-z 반복문으로 출력---");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)(65 + i);
			System.out.print(ch[i] + " ");
		}
		System.out.println();

		System.out.println("-----배열 ch 데이터 화면 출력---");
		System.out.println(Arrays.toString(ch)); 

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)(65 + i);
			System.out.print(ch[i] + " ");
		}
		
		System.out.println();

		System.out.print(ch[0]);
		System.out.print(ch[1]);
		
		System.out.println();
		
		char[] ch1 = new char[51];
		for (int i = 0; i < ch1.length; i++) {
			ch1[i] = (char)(12593 + i);
			System.out.print
			(ch1[i] + " ");
		}
		System.out.println();

		System.out.println((char)12643);
		char[] ch2 = new char[10000];
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = (char)(10000 + i);
			System.out.print
			(ch2[i]);
		}
		System.out.println();
		
		System.out.println((int)'ㄱ');
		System.out.println((int)'ㄲ');
		System.out.println((int)'ㄳ');
		System.out.println((int)'ㄴ');
		System.out.println((int)'ㄵ');
		System.out.println((int)'ㄶ');
		System.out.println((int)'ㄷ');
		System.out.println((int)'ㄸ');
		System.out.println((int)'ㄹ');
		System.out.println((int)'ㄺ');
		System.out.println((int)'ㄻ');
		System.out.println((int)'ㄼ');
		System.out.println((int)'ㄽ');
		System.out.println((int)'ㄾ');
		System.out.println((int)'ㄿ');
		System.out.println((int)'ㅀ');
		System.out.println((int)'ㅁ');
		System.out.println((int)'ㅂ');
		System.out.println((int)'ㅃ');
		System.out.println((int)'ㅄ');
		System.out.println((int)'ㅅ');
		System.out.println((int)'ㅆ');
		System.out.println((int)'ㅇ');
		System.out.println((int)'ㅈ');
		System.out.println((int)'ㅉ');
		System.out.println((int)'ㅊ');
		System.out.println((int)'ㅋ');
		System.out.println((int)'ㅌ');
		System.out.println((int)'ㅍ');
		System.out.println((int)'ㅎ');
		System.out.println((int)'ㅏ');
		System.out.println((int)'ㅐ');
		System.out.println((int)'ㅑ');
		System.out.println((int)'ㅒ');
		System.out.println((int)'ㅓ');
		System.out.println((int)'ㅔ');
		System.out.println((int)'ㅕ');
		System.out.println((int)'ㅖ');
		System.out.println((int)'ㅗ');
		System.out.println((int)'ㅘ');
		System.out.println((int)'ㅙ');
		System.out.println((int)'ㅚ');
		System.out.println((int)'ㅛ');
		System.out.println((int)'ㅜ');
		System.out.println((int)'ㅝ');
		System.out.println((int)'ㅞ');
		System.out.println((int)'ㅟ');
		System.out.println((int)'ㅠ');
		System.out.println((int)'ㅡ');
		System.out.println((int)'ㅢ');
		System.out.println((int)'ㅣ');
		System.out.println((char)12643);



		
		
		
	}

}
