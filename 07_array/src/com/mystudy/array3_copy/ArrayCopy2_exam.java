package com.mystudy.array3_copy;

import java.util.Arrays;

public class ArrayCopy2_exam {

	public static void main(String[] args) {
		
		// 문제1
		int[] he = new int[4];
		ArrayCopy.printData(he);
		int b = 10;
		for (int i = 0; i < 4; i++) {
			he[i] = b;
			b = b + 10;
		}	
		System.out.print("1. 숫자 입fur 후 출력 : ");
		ArrayCopy.printData(he);
		
		he[2] = 100;	
		System.out.print("2. 세번째 데이터 100으로 변경 : ");
		ArrayCopy.printData(he);
		
		int a = 99;
		for (int i = 0; i < 4; i++) {
			if (he[i] == 20) {
				he[i] = a;
			}	
		}
		System.out.print("3. 20을 99로 변경 : ");
		ArrayCopy.printData(he);
		
		System.out.println();

		// 문제2
		
		int[] heCopy = new int[4];
		
		heCopy = he;
		ArrayCopy.printData(he);
		ArrayCopy.printData(heCopy);	
		System.out.print("얕은 복사 : ");
		System.out.println(he == heCopy); //true
		System.out.println("--------------------------");
		
		int[] heCopy1 = new int[he.length];
		for (int i = 0; i < heCopy1.length; i++) {
			heCopy1[i] = he[i];
		}
		ArrayCopy.printData(he);
		ArrayCopy.printData(heCopy1);	
		System.out.print("깊은 복사 : ");
		System.out.println(he == heCopy1); //false
		System.out.println("--------------------------");

		int[] heCopy2 = new int[he.length];
		System.arraycopy(he, 0, heCopy2, 0, he.length);
		ArrayCopy.printData(he);
		ArrayCopy.printData(heCopy2);	
		System.out.print("깊은 복사 : ");
		System.out.println(he == heCopy2); //false
		System.out.println("--------------------------");
		
		int[] heCopy3 = he.clone();
		ArrayCopy.printData(he);
		ArrayCopy.printData(heCopy3);	
		System.out.print("깊은 복사 : ");
		System.out.println(he == heCopy3); //false
		System.out.println("--------------------------");
		
		int[] heCopy4 = Arrays.copyOf(he, he.length);
		ArrayCopy.printData(he);
		ArrayCopy.printData(heCopy4);	
		System.out.print("깊은 복사 : ");
		System.out.println(he == heCopy4); //false
		System.out.println("--------------------------");
		
		int[] heCopy5 = Arrays.copyOfRange(he, 0, 1);
		ArrayCopy.printData(he);
		ArrayCopy.printData(heCopy5);	
		System.out.print("깊은 복사 : ");
		System.out.println(he == heCopy5); //false
		System.out.println("--------------------------");
		
	}
//	static void printData(int[] he) {
//		for (int i = 0; i < he.length; i++) {
//			System.out.print(he[i] + " ");
//		}
//		System.out.println();
//	}

}
