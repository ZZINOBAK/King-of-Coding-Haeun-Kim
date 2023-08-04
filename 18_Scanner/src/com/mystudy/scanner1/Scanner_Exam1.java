package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam1 {

	public static void main(String[] args) {
		// Scanner 클래스 : 콘솔에서 데이터 읽어오기
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		System.out.println("-> ");
		// 이렇게 되면 리턴값이 없는건가봄.
		// 출력 후 입력해도 걍 화살표만 나오고 입력한 데이터는 안나옴.
		
		System.out.print("문자열 입력1 : ");
		String str1 = scan.nextLine();
		System.out.println(str1);
		
		System.out.print("문자열 입력2 : ");
		String str2 = scan.nextLine();
		System.out.println(str2);

		System.out.println("-------------");
		System.out.println("정수값 2개를 입력하면 더한 결과를 출력해라");
		//int num1 = 100;
		//int num2 = 20;
		
		//(주의) nextXxx 메소드 사용 후 nextLine() 사용시 문제발생
		System.out.print("숫자입력1");
		int num1 = scan.nextInt();
		scan.nextLine(); // 줄바꿈(엔터)문자까지의 값을 읽어서 버리기

		System.out.print("숫자입력2");
		int num2 = Integer.parseInt(scan.nextLine());
//		int num2 = scan.nextInt();
//		scan.nextLine(); //줄바꿈(엔터) 문자까지의 값을 읽어서 처리
		
		int sum = 0;
		sum = num1 + num2;
		System.out.println("합계 " + sum);

		System.out.print("문자열 입력 -> ");
		String temp = scan.nextLine();
		System.out.println(temp);
		
		System.out.println("==============");
		System.out.print("문자열1개와 정수 숫자3개 연속 입력 : ");
		String strTemp = scan.next();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		System.out.println("첫번째문자열 : " + strTemp);
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
	}

}
