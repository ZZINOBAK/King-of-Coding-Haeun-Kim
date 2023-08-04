package com.mystudy.ex01_class;

public class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체(인스턴스) 생성 후 기능 테스트
		System.out.println("----Phone-----");
		Phone iphone1 = new Phone();
		iphone1.iseeYou();
		iphone1.givemeaCall();
		iphone1.receiveCall();
		
		Phone iphone2 = new Phone("01021695329");
		iphone2.iseeYou();

		System.out.println("------------");
		Phone iphone3 = new Phone("아이폰12Pro", "01021695329");
		iphone3.iseeYou();

		
		System.out.println("------Mp3Phone-------");
		Mp3Phone ipod1 = new Mp3Phone("01021695329");
		ipod1.iseeYou();
		ipod1.givemeaCall();
		ipod1.receiveCall();
		ipod1.iliketheMusic();
		
		
	}

}
