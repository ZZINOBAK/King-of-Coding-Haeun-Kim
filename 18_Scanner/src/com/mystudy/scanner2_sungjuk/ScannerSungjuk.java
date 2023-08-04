package com.mystudy.scanner2_sungjuk;

import java.util.Scanner;

public class ScannerSungjuk {

	public ScannerSungjuk() {}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			// 입력 -----------------------
			// 입력 : 성명, 국어, 영어, 수학 점수를 입력받아(화면에서)
			System.out.print("성명 : ");
			String name = scan.next(); // 문자열(String) 값 읽기
			
			System.out.print("국어점수 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = scan.nextInt();
			scan.nextLine(); //nextInt() 뒤에 nextLine() 사용시 문제해결용
			
			System.out.print("수학점수 : ");
			int math = Integer.parseInt(scan.nextLine());
			
			// 처리 ----------------------
			// 처리 : 총점, 평균 계산한다
			int tot = kor + eng + math;
			double avg = tot * 100 / 3 / 100.0;
			avg = Math.round(tot * 100 / 3.0) / 100.0;
			
			//결과 출력 -------------------
			System.out.println("\n=== 성적처리 결과 ===");
			System.out.println("성명 : " + name);
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("--------------");
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
			System.out.println();
			
			System.out.print(">> 계속할거냐(중단시: 0 입력)? ");
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("0")) {
				System.out.println(":: 작업을 중단합니다~~~");
				break;
			}
		}
	}
	
}
