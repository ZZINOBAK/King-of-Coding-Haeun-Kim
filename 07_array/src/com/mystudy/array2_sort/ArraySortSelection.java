package com.mystudy.array2_sort;

public class ArraySortSelection {

	public static void main(String[] args) {
		// 배열 숫자 데이터 정렬(sort)
		// 오름차순 = ASCS = 어센딩 // 내림차순 = DESC = 디센딩

		int[] num = { 30, 20, 50, 40, 10 };
		System.out.println(num);

		printData(num);

	}

	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}
		System.out.println();

		 int temp = 0; 
		 
		 for (int i1 = 0; i1 < num.length-1; i1++) {
				for (int i = i1 + 1; i < num.length; i++) {
					if (num[i1] > num[i]) {
						temp = num[i1];
						num[i1] = num[i];
						num[i] = temp;
					}
				}
			}
			
		System.out.println("------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
			
		  //1111111111111111111111111111111111
//		 if (num[0] > num[1]) {
//			temp = num[0];
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		if (num[0] > num[2]) {
//			temp = num[0];
//			num[0] = num[2];
//			num[2] = temp;
//		}
//		if (num[0] > num[3]) {
//			temp = num[0];
//			num[0] = num[3];
//			num[3] = temp;
//		}
//		if (num[0] > num[4]) {
//			temp = num[0];
//			num[0] = num[4];
//			num[4] = temp;
//		}
////		int a = 1;
////		for (int i = 0; i < 4; i++) {
////			if (num[0] > num[a]) {
////				temp = num[0];
////				num[0] = num[a];
////				num[a] = temp;
////			}
////			a++;
////		}
////		System.out.print("1번째 : ");
////		for (int i = 0; i < num.length; i++) {
////			
////			System.out.print(num[i] + " ");
////		}
////		System.out.println();
////	
////		//2222222222222222222222222222222222222
//////		if (num[1] > num[2]) {
//////			temp = num[1];
//////			num[1] = num[2];
//////			num[2] = temp;
//////		}
//////		if (num[1] > num[3]) {
//////			temp = num[1];
//////			num[1] = num[3];
//////			num[3] = temp;
//////		}
//////		if (num[1] > num[4]) {
//////			temp = num[1];
//////			num[1] = num[4];
//////			num[4] = temp;
//////		}
////		int a1 = 2;
////		for (int i = 0; i < 3; i++) {
////			if (num[1] > num[a1]) {
////				temp = num[1];
////				num[1] = num[a1];
////				num[a1] = temp;
////			}
////			a1++;
////		}
////		System.out.print("2번째 : ");
////
////		for (int i = 0; i < num.length; i++) {
////			System.out.print(num[i] + " ");
////		}
////		System.out.println();	
////		//3333333333333333333333333333333333333
//////		if (num[2] > num[3]) {
//////			temp = num[2];
//////			num[2] = num[3];
//////			num[3] = temp;
//////		}
//////		if (num[2] > num[4]) {
//////			temp = num[2];
//////			num[2] = num[4];
//////			num[4] = temp;
//////		}
////		int a2 = 3;
////		for (int i = 0; i < 2; i++) {
////			if (num[2] > num[a2]) {
////				temp = num[2];
////				num[2] = num[a2];
////				num[a2] = temp;
////			}
////			a2++;
////		}
////		System.out.print("3번째 : ");
////
////		for (int i = 0; i < num.length; i++) {
////			System.out.print(num[i] + " ");
////		}
////		System.out.println();	
////		//444444444444444444444444444444444444
////		for (int i = 0; i < 1; i++) {
////			if (num[3] > num[4]) {
////				temp = num[3];
////				num[3] = num[4];
////				num[4] = temp;
////			}	
////		}
////		System.out.print("4번쨰 마지막 : ");
////
////		for (int i = 0; i < num.length; i++) {
////			System.out.print(num[i] + " ");
////		}
////		System.out.println();
//		
//
		
		
//		

	}

}
