package com.mystudy.array;

import java.util.Arrays;
import java.util.List;

public class Ex05_array_lotto {

	public static void main(String[] args) {
		// 로또 번호 만들기
		// 1 - 45 
		
		//랜던한 값 만들기
		System.out.println(Math.random() * 45);
		System.out.println(Math.random() * 45);
		System.out.println((int)(Math.random() * 45));
		////////////////////////////////////
				
		int[] l = new int[45];
		l[0] = (int)(Math.random() * 45);
		l[1] = (int)(Math.random() * 45);
		l[2] = (int)(Math.random() * 45);

		
		for (int i = 0; i < 45; i++) {
			l[i] = i + 1;
		}
		System.out.println(Arrays.toString(l));
		/*
		bk = l[0];
		l[0] = l[44];
		l[44] = bk;
		
		bk = l[1];
		l[1] = l[43];
		l[43] = bk;
		*/
	
		System.out.println("--------로또만들기 (나)-------------");
		int bk = 0;
		int random = (int)(Math.random() * 45);
		
		for (int i1 = 0; i1 < 100000; i1++) {
			for (int i = 0; i < 45; i++) {
				bk = l[0];
				l[0] = l[random];
				l[random] = bk;
				random = (int)(Math.random() * 45);
			}
		}
		System.out.println(Arrays.toString(l));	
		

		for (int i = 0; i < 6; i++) {
			System.out.print(l[i] + " ");
		}
		
		System.out.println();
		System.out.println("--------로또만들기 (쌤)-------------");
		
		int[] balls = new int[45];
		System.out.println(Arrays.toString(balls));
		
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		int random1 = (int)(Math.random() * 45);
		System.out.println(random1);
		
		int temp;
		
		for (int i = 1; i < 100_000; i++) {
			random1 = (int)(Math.random() * 45);
			temp = balls[0];
			balls[0] = balls[random1];
			balls[random1] = temp;
		}
		
		System.out.println();
		for (int i = 0; i < balls.length; i++)
		{
			System.out.print(balls[i] + " ");
		}
		
		System.out.println();

		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
		
		System.out.println();
		System.out.println("--------로또 경우의 수");
		System.out.print(1000 * 814506);

		System.out.println();

		// 로또 번호 오름차순 정렬
		Arrays.sort(balls);
		System.out.println(Arrays.toString(balls));
		
	}
	
}
