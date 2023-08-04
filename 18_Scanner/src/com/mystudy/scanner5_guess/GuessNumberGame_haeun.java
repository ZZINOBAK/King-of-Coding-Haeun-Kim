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
public class GuessNumberGame_haeun {
	// 필드--------------------------
	
	// 생성자--------------------------
	// 기본생성자만 필요하군요
	
	// 메소드-----------------------
	public void startGame() {
		Scanner sumugogea = new Scanner(System.in);
		
		System.out.println("게임을 시작한다.");
		while (true) {
			int munjae = (int)(Math.random() * 100 + 1);
			System.out.println("1부터 100까지 중 숫자 하나를 골라서 입력해라");
			System.out.println("기회는 총 5번!!");
			System.out.print("1번째 시도 -> ");
			int dab = sumugogea.nextInt();
			
			int a = 4;
			for (int i = 1; i < 6; i++) {
				if (dab > 100 || dab <= 0) {
					System.out.println("범위 초과. 다시 입력 ㄱㄱ");
					i--;
				} 
				if (dab == munjae) {
					System.out.println("정답이오!!!!~~~!! " + i + "번 만에 맞추었구나 잘했도다.");
					break;
				}
				if (i == 5) {
					System.out.println("기회 " + i + "번을 모두 소진했다. 넌 탈락이야.");
					break;
				}
				if (dab < munjae && dab > 0) {
					System.out.println("정답은" + dab + "보다 크다. 기회는 " + a + "번 남았다.");
				}
				if (dab > munjae && dab < 101) {
					System.out.println("정답은" + dab + "보다 작다. 기회는 " + a + "번 남았다.");
				}
				a--;
				System.out.println("----------------------");
				System.out.println("다시 정답을 입력해라");
				System.out.print((i + 1) + "번째 시도 -> ");
				dab = sumugogea.nextInt();
			}
			
			
			System.out.println("다시도전하고 싶으면 \"도전\", 그만하고싶으면 \"그만\"을 입력해라.");
			sumugogea.nextLine();
			String dojeon = sumugogea.nextLine();
			if (dojeon.equalsIgnoreCase("그만")) {
				System.out.println("게임종료");
				break;
			}
		}
	}
	
}







