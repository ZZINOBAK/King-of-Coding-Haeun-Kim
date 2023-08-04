package com.mystudy.array;

import java.util.Arrays;

public class SungjukManagerExam {
	public static void main(String[] args) {

	// 타입[][] 변수명 = new 타입[크기값][크기값];
	// 타입 변수명[][] = new 타입[크기값][크기값];
	// 타입[][] 변수명 = { {..}, {..}, ..., {..}};
	
		int[][] kk = { {100, 100, 100}, 
					   {97, 90, 93},
		               {23, 75, 34} };
		String[] name = {"김하은", "김하똥", "김똥똥"};
		
		
		int tot = 0;
		for (int i1 = 0; i1 < kk.length; i1++) {
			System.out.print(name[i1] + " : ");
			for (int i = 0; i < kk[i1].length; i++) {
				System.out.print(kk[i1][i] + "\t" ); 
				tot = tot + kk[i1][i];
			}
			System.out.print(tot + "\t"); 
			double avg = tot * 100 / 3 / 100.0;
			System.out.println(avg);
			tot = 0;
		}
		System.out.println();
		

		System.out.println("----쌤-----");
		int[][] sungjuk = { {100, 90, 80}, 
				   {100, 90, 81},
	               {100, 90, 82} };
		String[] names = {"김유신", "이순신", "홍길동"};
		int[] tots = new int[sungjuk.length];
		double[] avgs = new double[sungjuk.length];
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------");
		for (int i = 0; i < sungjuk.length; i++) {
			//데이터 처리 -----
			String n = names[i];
			int kor = sungjuk[i][0];
			int eng = sungjuk[i][1];
			int math = sungjuk[i][2];
			
			//계산처리
			tots[i] = kor + eng + math;
			avgs[i] = tots[i] * 100 / 3 / 100.0;
			
			//화면출력
			System.out.println(n + "\t" + kor + "\t" + eng + "\t" + math
					+ "\t" + tots[i] + "\t" + avgs[i]);
		}
	}
	
}
