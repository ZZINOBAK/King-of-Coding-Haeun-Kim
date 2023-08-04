package com.mystudy.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04_array_swap {

	public static void main(String[] args) {
		// 변수값 서로 교환하기
		int a1 = 100;
		int b1 = 200;
		int c1 = 0;
		System.out.println("a1  b1  c1");
		
		c1 = a1;
		// 여기서 a1=100, b1=200, c1=100 
		System.out.println(a1 + " " + b1 + " " + c1);
		
		a1 = b1;
		// 여기서 a1=200, b1=200, c1=100
		System.out.println(a1 + " " + b1 + " " + c1);
		
		b1 = c1;
		// 여기서 a1=200, b1=100, c1=100
		System.out.print(a1 + " ");
		System.out.print(b1 + " ");
		System.out.print(c1);
		System.out.println();
		
		System.out.println("---------------------");
		int[] nums = {100, 200, 300, 400, 500, 0};
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		nums[5] = nums[0];
		nums[0] = nums[4];
		nums[4] = nums[5];
		
		nums[5] = nums[1];
		nums[1] = nums[3];
		nums[3] = nums[5];
		
		//빈곳 = 바꾸고싶은곳1
		//바꾸고싶은곳1 = 바꾸고싶은곳2
		//바꾸고싶은곳2 = 빈곳
		//a = b
		//b = c
		//c = a
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("---------------------");
		int[] nums1 = {100, 200, 300, 400, 500, 0};
		//nums[5] = nums[0];
		//nums[0] = nums[4];
		//nums[4] = nums[5];
		
		//nums[5] = nums[1];
		//nums[1] = nums[3];
		//nums[3] = nums[5];
		int bincan = nums1[5];
		int bagga = 4;
		for(int i = 0; i < 2; i++) {
			bincan = nums1[i];
			nums1[i] = nums1[bagga];
			nums1[bagga] = bincan;
			bagga--;
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		int[] nums2 = {100, 200, 300, 400, 500};
		
		int temp = 0;
		int bagga1 = 4;
		for(int i = 0; i < 2; i++) {
			temp = nums1[i];
			nums1[i] = nums1[bagga1];
			nums1[bagga1] = temp;
			bagga1--;
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		
		System.out.println("---------------------");
		int[] h = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int temp1 = 0;
		int a = h.length-1; 
		for(int i = 0; i < a/2; i++) {
			temp1 = h[i];
			h[i] = h[a]; 
			h[a] = temp1; 
			a--;
		}
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + " ");
		}		System.out.println();

		System.out.println(Arrays.toString(h));
		
		System.out.println("---------------------");
		int[] h1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 00};
		int a11 = h1.length; //10
		int bagga111 = a11-2; // 8
		//int bincan1 = h[a-1]; //9
		for(int i = 0; i < a11/2; i++) {
			h1[a11-1] = h1[i];
			h1[i] = h1[bagga111];
			h1[bagga111] = h1[a11-1];
			bagga111--;
		}
		for (int i = 0; i < h1.length; i++) {
			System.out.print(h1[i] + " ");
		}		System.out.println();

		System.out.println(Arrays.toString(h));

		System.out.println();
		
		System.out.println("---------------------");
		int[] h11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		// j=10-1 =9    // 10/2 = 5    // 10/2=5
		for (int i = 0, j = (h11.length - 1); i <= (h11.length/2) && j >= (h11.length/2); i++, j--) {
			int temp1111 = 0 ;
			temp1111 = h11[i];
			h11[i] = h11[j];
			h11[j] = temp1111;
			System.out.print(h11[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(h11));
		
		
		

		

		
		
		

		
	}

}
