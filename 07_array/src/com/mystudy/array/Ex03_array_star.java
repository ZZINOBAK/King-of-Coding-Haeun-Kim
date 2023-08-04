package com.mystudy.array;

public class Ex03_array_star {

	public static void main(String[] args) {
		char[] s = {'*', '*', '*', '*', '*'};
		
		System.out.print(s[0]);
		System.out.println();
		
		System.out.print(s[0]);
		System.out.print(s[1]);
		System.out.println();
		
		System.out.print(s[0]);
		System.out.print(s[1]);
		System.out.print(s[2]);
		System.out.println();

		System.out.println("----------------");
		int b = 1;
		for (int i1 = 0; i1 < s.length; i1++) {
			for (int i = 0; i < b;i++) {
				System.out.print(s[i]);
			}
			System.out.println();
			b++;
		}
		
		System.out.println("----------------");
		char[] s1 = {'!', '@', '#', '$', '%'};
		int b1 = 1;
		for (int i1 = 0; i1 < s.length; i1++) {
			for (int i = 0; i < b1;i++) {
				System.out.print(s1[i]);
			}
			System.out.println();
			b1++;
		}
		
		
		

	}

}
