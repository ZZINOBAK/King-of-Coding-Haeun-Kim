package com.mystudy.array4_2dim;

public class ArrayTwoDimension2 {

	public static void main(String[] args) {
		int[][] nums = new int[3][2];
		//2차원 배열에 크기는 확정시켜놔야 함.
		//첫번째 [] 이게 크기임. 
		// 방법1: new int[2] -> new 사용 1차원 배열 생성선언
		nums[0] = new int[2];
		nums[0][0] = 10;
		nums[0][1] = 20;
		
		// 방법2 : new int[] {30, 40} -> new 사용 1차원배열과 데이터
		nums[1] = new int[] {30, 40};
		
		// 방법3(X) : {30, 40} -> 컴파일 오류 뜸!! Array constats can
		// nums[3] = {30, 40};
		nums[2] = new int[] {50, 60, 70, 80};
		
		
	}

}
