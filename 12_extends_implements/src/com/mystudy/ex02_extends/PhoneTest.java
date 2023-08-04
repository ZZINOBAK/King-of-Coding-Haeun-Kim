package com.mystudy.ex02_extends;

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
		// Mp3Phone 클래스에서 선언하지 않은 메소드들이 잘 작동함.
		// 왜냐면 Mp3Phone 클래스의 부모 클래스인 Phone에 이 메소드들이 있기 때문임.
		// 그래서 저 메소드들은 컨트롤 클릭하면 Phone클래스로 이동하고
		ipod1.iliketheMusic();
		// 이 뮤직 메소드는 부모클래스인 Phone에 선언되지 않은 메소드라 실행 안됨.
		// 실행하고 싶으면 Mp3Phone에 메소드 선언하면 됨.
		// 이메소드는 컨트롤 클릭하면 Mp3Phone 클래스로 이동함.   
		
		System.out.println("-----WebPhone-----");
		WebPhone web = new WebPhone("아이폰", "01012345678");
		web.iseeYou(); 
		web.givemeaCall();
		web.receiveCall();
		web.naver();
		
		System.out.println("-----PhoneWebIpod-----");
		PhoneWebIpod iphone3GS = new PhoneWebIpod("아이폰3GS", "01012345678");
		iphone3GS.iseeYou(); 
		iphone3GS.givemeaCall();
		iphone3GS.receiveCall();
		iphone3GS.iliketheMusic();
		iphone3GS.naver();
		
	}

}
