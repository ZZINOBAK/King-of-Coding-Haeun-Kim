package com.mystudy.array;

public class Ex02_array_exam {

	public static void main(String[] args) {
		System.out.println("--문제1 (나)-----------");
		
		int[] nums = new int[10];
		nums[0] = 3;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 2;
		nums[5] = 4;
		nums[6] = 6;
		nums[7] = 8;
		nums[8] = 9;
		nums[9] = 10;
		//int[] nums1 = new int[] {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
		//int[] nums2 = {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
		// 마지막 방법이 젤 간단해 보이는데
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		int d = 0;
		for (int i = 0; i < nums.length; i++) {
			d = d + nums[i];
		}
			System.out.println(d);
		
		System.out.println();
		System.out.println("--문제2 (나)--------");
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
			} else {
				
			}
		}
		System.out.println();	
		////////////////////////////////////////////////
		int d1 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				d1 = d1 + nums[i];
			} 
		}
			System.out.println(d1);
			
		System.out.println();	
		/////////////////////////////////////////////////
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.print(nums[i] + " ");
			} else {
				
			}		
		}
		System.out.println();	
		////////////////////////////////////////////////
		int d2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				d2 = d2 + nums[i];
			} 
		}
			System.out.println(d2);
		/////////////////////////////////////////////
	}

}
