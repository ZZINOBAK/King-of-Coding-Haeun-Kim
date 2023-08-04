package com.mystudy.array4_2dim;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 객체 생성
		// 타입[][] 변수명 = new 타입[크기값][크기값];
		// 타입 변수명[][] = new 타입[크기값][크기값];
		// 타입[][] 변수명 = { {..}, {..}, ..., {..}};
		// -------------------------------
		
		int[][] nums = {{1, 2, 3}, 
						{4, 5, 66}, 
						{1,2,3,4,5,6}
						};
		System.out.println(nums.length);
		System.out.println(nums);
		System.out.println(nums[0].length);
		System.out.println(nums[0]);
		System.out.println(nums[2].length);
		System.out.println(nums[1][2]);
		
		//nums에 있는 첫번째 데이터(1차원배열) 화면 출력
		for (int i = 0; i < nums[1].length; i++) {
			System.out.print(nums[1][i] + " ");
		}
		System.out.println();
		
		//nums에 있는 세번째 데이터(1차원배열) 화면 출력
		for (int i = 0; i < nums[2].length; i++) {
			System.out.print(nums[2][i] + " ");
		}
		System.out.println();
		
		System.out.println("---2차원 배열 데이터 화면 출력---");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + " " + nums[i]);
		}
		System.out.println();
		
		for (int i1 = 0; i1 < nums.length; i1++) {
			System.out.print("nums" + i1 + " : ");
			for (int i = 0; i < nums[i1].length; i++) {
				System.out.print(nums[i1][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("------------------");
		int[][] numsBackup = nums.clone();
		System.out.println(nums);
		System.out.println(numsBackup);
		System.out.println(nums == numsBackup);
		// 물리적으로 분리된 다른 객체!
		// 걍 데이터 값만 같을 뿐...
		
		System.out.println("---------");
		System.out.println(nums[0]);
		System.out.println(numsBackup[0]);
		System.out.println(nums[0] == numsBackup[0]);
		// 안에 배열 데이터는 같은 데이터임!!!
		// 동일 객체. 같은 주소
		
		nums[0][0] = 1000;
		System.out.println(nums[0][0]);
		System.out.println(numsBackup[0][0]);
		// 같은 주소라서 그럼
		
		//** 그래서 클론은 1차원 배열에서 사용
		//** 왜냐하면 다른 주소에 복제하기 때문
		//** 원본의 1차원 배열 주소만 복사해서 원본과는 다른 주소에 배열 데이터 집어넣음.
		
	}
	

}
