package com.mystudy.array4_2dim;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		// 문제 
		// 2차원 배열을 사용하여
		// int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		// 1. 2차원 배열 num2dim 값을 화면으로 출력 하3
		int[][] num2dim = new int[3][];
//		num2dim[0] = new int[] {10, 20};
//		num2dim[1] = new int[] {30, 40};
//		num2dim[2] = new int[] {50, 60};
		
		int a = 10;
		for (int i = 0; i < 3; i++) {
			num2dim[i] = new int[] {a, a+10};
			a = a + 20;
		}

//		System.out.println(num2dim[0][1]);
//		System.out.println(num2dim[0][2]);
//		System.out.println(num2dim[0][3]);
		for (int i = 0; i < 3; i++) {
			for (int i1 = 0; i1 < 2; i1++) {
				System.out.print(num2dim[i][i1] + " ");
			}
		}
		
//		-----------------쌤---------------------
//		for (int i = 0; i < num2dim.length; i++) {
//			System.out.println(Arrays.toString(num2dim[i]));
//		}
//		이중 for문 사용 데이터 출력
//		for (int d2 = 0; d2 < num2dim.length; d2++) {
//			System.out.println(d2 + " " + num2dim[d2]);
//			// 2차원 배열의 요소(1차원 배열 데이터)
//			for (int i = 0; i < num2dim[d2]).length; i++) {
//				System.out.print(num2dim[d2][i] + " ");
//			}
//		}
//		
		System.out.println();
		System.out.println("------------------------------");

		// 2. num2dim의 세번째 값인 30을 100으로 변경 후 출력 ㄱㄱ
		num2dim[1][0] = 100;
		printData(num2dim);
		System.out.println("------------------------------");

		// 3. num2dim의 크기로 똑같이 num2Copy 배열 만들기
		int[][] num2Copy = new int[num2dim.length][num2dim.length];	
		printData(num2dim);
		System.out.println();
		printData(num2Copy);
		System.out.println("------------------------------");
//		-----------------쌤---------------------
//		int[][] num2Copy = new int[][];
//		for (int i = 0; i < num2dim.length; i++) {
//			num2Copy[i] = new int[new??????????????] 뭐야 코드
//		}
//		System.out.println(Arrays.toString(num2Copy));
		
		//	  num2dim -> num2Copy 데이터 복사
//		num2Copy = num2dim.clone();
//		printData(num2dim);
//		System.out.println();
//		printData(num2Copy);
		System.out.println("------------------------------");
//		-----------------쌤---------------------
		for (int d2 = 0; d2 < num2Copy.length; d2++) {
			for (int i = 0; i < num2dim[d2].length; i++) {
				num2Copy[d2][i] = num2dim[d2][i];
			}
		}
		num2Copy[0][0] = 999;
		printData2("ㅇㅇ", num2dim);
		printData2("ㅇㅇ", num2Copy);
		// 쌤이 한대로 하면 카피의 값만 999로 변경됨.
		// 근데 내 코드로 하면 주소값이 같아서 걍 두개다 변경되어버리는데?
		// 아마 내가한거는 넘2딤 주소 안에 있는 데이터를 카피에 넣은거고
		// 쌤이한거는 그냥 길이면 넘2딤꺼 카피하고, 
		// 데이터는 저 반복문으로 카피에 넘2딤 데이터 하나하나 복붙해줬나봄.
		// 출력 확인 함.
		// clone(), copy() 등 복사 기능 개많음. 다 써보삼.
		
		//    num2Copy 데이터 화면 출력
		//    어떤 복사인지 표시
		System.out.println(num2dim);
		System.out.println(num2dim[0]);
		System.out.println(num2dim[1]);
		System.out.println(num2dim[2]);
		System.out.println("------------------------------");
		System.out.println(num2Copy);
		System.out.println(num2Copy[0]);
		System.out.println(num2Copy[1]);
		System.out.println(num2Copy[2]);
		System.out.println("------------------------------");
		System.out.println(num2Copy == num2dim);
		System.out.println("깊은복사");
		
		
		
		
		
		
		
	}
	static void printData(int[][] num2dim) {
		for (int i = 0; i < num2dim.length; i++) {
			for (int i1 = 0; i1 < num2dim[i].length; i1++) {
				System.out.print(num2dim[i][i1] + " ");
			}
			System.out.println();
		}
	}
//	-----------------쌤---------------------
	static void printData2(String name, int[][] num2dim) {
		System.out.println(name);
		for (int i = 0; i < num2dim.length; i++) {
			for (int i1 = 0; i1 < num2dim[i].length; i1++) {
				System.out.print(num2dim[i][i1] + " ");
			}
			System.out.println();
		}
	}

}
