package com.mystudy.scanner5_guess;

import java.util.Scanner;

/* 숫자 추측 게임
컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
선택 기회 5회
---------------------
Math.random() : 0 <= random값 < 1 범위의 실수값 
컴숫자 : 70 인 경우 
  사람이 선택한 숫자(80)가 크면 : 생각한 숫자보다 작다는 메시지 출력
  사람이 선택한 숫자(50)가 작으면 : 생각한 숫자보다 크다는 메시지 출력
5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
-----
다시 도전하시겠습니까?(y,n) 
---------------------------
*/
public class GuessNumberGame {
	private Scanner scan = new Scanner(System.in);
	private int min = 1;
	private int max = 100;

	public void startGame() {
		System.out.println("::: 게임을 시작합니다");
		while (true) {
			playGame();
			System.out.print("컴) 다시 도전하겠습니까(y/n)? ");
			if ("n".equalsIgnoreCase(scan.nextLine())) {
				break;
			}
		}
		System.out.println("::: 게임을 종료되었습니다");
	}

	private void playGame() {
		System.out.println("----->> 게임 플레이 시작");
		//1. 컴퓨터가 1~100까지 숫자 중 하나를 선택
		int comNo = (int) (Math.random() * 100 + 1);
		System.out.println("컴) 1~100까지 숫자 중 하나를 생각했습니다. "
				+ "5번 만에 맞춰보세요~~~");
		System.out.println("> 컴퓨터가 생각한 숫자 : " + comNo);
		
		min = 1;
		max = 100;
		int tryCnt = 1;
		while (tryCnt <= 5) {
			//2. 사람이 숫자를 선택
			//int selectNumber = selectNumber(i, min, max);
			int selectNumber = selectNumber(tryCnt);
			
			if (selectNumber < min || selectNumber > max) {
				System.out.println("컴) 범위 확인하고 다시 입력하세요~~");
				continue;
			}
			
			//3. 사람선택 숫자와 컴퓨터 숫자 비교 판정
			if (comNo == selectNumber) {
				System.out.println("컴) 성공!!! 맞췄습니다. "
						+ "내가 생각한 숫자는 " + comNo + "입니다");
				break;
			}
			if (comNo > selectNumber) {
				System.out.println("컴) " + selectNumber + " 보다 큽니다");
				min = selectNumber + 1;
			}
			if (comNo < selectNumber) {
				System.out.println("컴) " + selectNumber + " 보다 작습니다");
				max = selectNumber - 1;
			}
			
			//5번 시도하고 여기까지 왔으면 실패
			if (tryCnt == 5) {
				System.out.println("컴) 실패!!! "
						+ "내가 생각한 숫자는 " + comNo + "입니다");
			}
			tryCnt++;
		}
		
		System.out.println("----->> 게임 플레이 종료");
		System.out.println("-------------------------------");
	}
	
	private int selectNumber(int tryCnt) {
		int number = -1;
		while (true) {
			try {
				System.out.print(tryCnt + "번째 숫자선택(" + min +"~" + max + ")> ");
				number = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("[주의] 숫자값을 입력하세요");
			}
		}
		return number;
	}	

	private int selectNumber(int tryCnt, int min, int max) {
		int number = -1;
		while (true) {
			try {
				System.out.print(tryCnt + "번째 숫자선택(" + min +"~" + max + ")> ");
				number = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("[주의] 숫자값을 입력하세요");
			}
		}
		return number;
	}


}











