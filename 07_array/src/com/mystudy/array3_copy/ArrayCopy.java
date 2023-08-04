package com.mystudy.array3_copy;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		// 두개의 배열의 주소값이 같니? 아니 안같아.
		// 참조형 데이터일때는 객체를 비교해서 값을 냄.
		// 동일한 객체(동일한 주소)인지 아닌지 비교.
		
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;

		System.out.println("배열 복사 = 주소값 복사 = 얕은복사");
		num2 = num1; //  넘1의 주소값을 넘2로 복사 붙여넣기
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		// 두개가 동일 객체가 되어버림
		
		printData(num1);
		printData(num2);
		
		System.out.println("-----------------");
		System.out.println("배열값 복사 = 물리적 복사 = 깊은 복사");
		int[] num3 = new int[num1.length]; //num1 배열과 같은 크기로
		printData(num3);
		
		//num3 : num1의 배열값 복사
		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i];
		}
		printData(num1);
		printData(num3);
		System.out.println(num1 == num3);
		// 이렇게 복사하면
		// 데이터 값은 똑같지만 주소는 다름!!!
		num1[0] = 888;
		System.out.println("넘1의 데이터 변경 후 ");
		printData(num1);
		printData(num3);
		
		System.out.println("-------------------");

		System.out.println("system.arraycopy() 복사하기");

		//num4
		int[] num4 = new int[num1.length]; 
		
		printData(num1);
		printData(num4);
		//System.arraycopy(Object src, int srcPos, Object dest, int dest);
		System.arraycopy(num1, 0, num4, 0, num1.length);
		
		System.out.println("----복사 후------- ");
		printData(num1);
		printData(num4);
		System.out.println(num1 == num4);
		// 주소 값이 같아야 트루 나옴.
		// 주소 값이 같아야 동일 객체임.
		
		System.out.println("--- 배열객체,clone() 복사 ----");
		int[] num5 = num4.clone();
		printData(num4);
		printData(num5);
		System.out.println(num5 == num4);

		System.out.println("--- Arrays.copyOF() 사용 복사 ----");
		//Arrays.copyOf(원본 배열 데이터, 복사할 데이터 갯수);
		int[] num6 = Arrays.copyOf(num4, num4.length);
		printData(num4);
		printData(num6);
		System.out.println(num6 == num4);
		
		//Arrays.copyOfRange(원본 배열 데이터 이름, 몇번째 부터, 몇번째 이전 까지);
		int[] num7 = Arrays.copyOfRange(num4, 0, 3);
		printData(num4);
		printData(num7);
		System.out.println(num7 == num4);
		
		
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	// 메소드 오버로딩
	static void printData(String name, int[] num) {
		for ( int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		System.out.println();
	}

}
