package com.mystudy.scanner4_scissors;

import java.util.Scanner;

public class Scanner_Exam4_scissors_haeun {

	public static void main(String[] args) {
		/* Scanner를 이용한 가위, 바위 , 보 게임 *******
		// scissors, rock, paper
		// draw : 무승부, person_win, computer_win
		컴퓨터와 함께하는 가위,바위,보 게임
		0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력 
		2. 선택값 입력
		3. 결과 비교 후 승자, 패자 결정
		(반복) 게임 반복 진행 - 0 선택시 종료 처리
		=============================== */

		Scanner gbb = new Scanner(System.in);
		int gayui = 1;
		int bayui = 2;
		int bo = 3;
	
		while (true) {
			System.out.println("1.가위   2.바위   3.보   0.종료 ");
			System.out.println("가위~바위~보!");
			System.out.print("사람 -> ");
			int saram = gbb.nextInt();
			// 0 입력하면 여기서도 종료될 수 있게 만들어야 함.
			gbb.nextLine();
			
			if (saram == 0) {
				System.out.println("슬보슬 개비똥꾸 멍멍이가 노래를 한다람쥐가 소풍을 간다!!!");
				break;
			} else {
				int com = (int)(Math.random() * 3) + 1;
				System.out.println("컴 -> " + com);
				// 여기서 컴퓨터가 뭐 낼지 정해짐
				
				System.out.println("결과는~~~두구두구두굳구두구둑두구두국~~~~  ");
				System.out.print("-> ");
				if ((saram == 1 && com == 1) || (saram == 2 && com == 2)
						 || (saram == 3 && com == 3)) {
					System.out.println("무승부~~~~");
				}
				if ((saram == 1 && com == 2) || (saram == 2 && com == 3)
						 || (saram == 3 && com == 1)) {
					System.out.println("컴 win!!!!");
				}
				if ((saram == 1 && com == 3) || (saram == 2 && com == 1)
						|| (saram == 3 && com == 2) ) {
					System.out.println("사람 win!!!!");
				}
			}

			System.out.println("-------------------------");
			System.out.println("더하고 싶으면 \"더ㄱㄱㄱㄱㄱ\"를 입력하고,");
			System.out.println("종료를 원하면 \"0\"을 입력하시오");
			String more = gbb.nextLine();
			
			if (more.equalsIgnoreCase("0")) {
				System.out.println("가위바위보 종료");
				break;
			}
		}
		
	}

}
