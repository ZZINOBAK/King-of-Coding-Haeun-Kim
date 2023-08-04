package com.mystudy.string;

public class Ex04_String_array {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(i + " : " + nums[i]);
		}
		
		System.out.println("----개선된(향상된) for문------");
		//for (타입 변수명 : 집합객체) {}
		for (int num : nums) {
			System.out.println(num);
		}
		System.out.println("----------");
		int idx = 0;
		for (int num : nums) {
			System.out.println(idx++ + " : " + num);
		}
		
		System.out.println("--------------");
		String[] names = {"김하은1", "김하은2", "김하은3", "김하은4"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + " : " + names[i] + " - " + names[i]);
		}
		System.out.println("--------------");

		for (String name : names) {
			System.out.println(name);
		}
	}

}
