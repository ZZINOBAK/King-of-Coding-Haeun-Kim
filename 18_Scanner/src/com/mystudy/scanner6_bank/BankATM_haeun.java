package com.mystudy.scanner6_bank;

import java.util.Scanner;

//(실습) 은행의 ATM
// 1.입금  2.출금  3.통장확인   0.종료
public class BankATM_haeun {
	private int money = 1000; //통장계좌 금액
	
	private Scanner scan = new Scanner(System.in);
	private static final String INSERT = "입금";
	private static final String WITHDROW = "출금";
	private static final String CHECK = "통장확인";
	
	public void startBank() {
		int a;
		int b;
		while (true) {
			System.out.println("1.입금  2.출금  3.통장확인   0.종료");
			System.out.println("----------------------------");
			System.out.print("원하는 번호를 입력하시오 -> ");
			a = scan.nextInt();
			if (a == 1) {
				System.out.print("입금할 금액을 입력하시오 -> ");
				b = scan.nextInt();
				System.out.println(b +"원이 입금되었습니다.");
			}
			if (a == 2) {
				while (true) {
					System.out.print("출금할 금액을 입력하시오 -> ");
					b = scan.nextInt();
					if (b > money) {
						System.out.println("잔액이 부족함.");
						System.out.println("통장의 잔액은 " + money + "원 입니다.");
					} else {
					System.out.println("드르르르르르르륽");				
					System.out.println(b +"원이 출금되었습니다.");
					break;
					}
				}
			}
			if (a == 3) {
				System.out.println("통장의 잔액은 " + money + "원 입니다.");
			}
			if (a == 0) {
				System.out.print("감사합니다. 안녕히가시오.");
				break;
			}
			System.out.println("----------------------------------");
			System.out.print("더 이용할거면 1번 아니면 0번을 입력하시오. -> ");
			a = scan.nextInt();
			if (a == 0) {
				System.out.print("감사합니다. 안녕히가시오.");
				break;
			}
		}


	}	
	
}













