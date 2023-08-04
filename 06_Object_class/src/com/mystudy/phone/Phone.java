package com.mystudy.phone;

import java.util.Scanner;

public class Phone {
	static String name = "iPhone";
	String type = "12pro";
	static int hsize = 6;
	static int vsize = 13;
	boolean hasLCD;
	int storage = 256;
	//-----------------------------------------------------------
	Phone() {}
	
	Phone(String name, String type) {
		this.name = name; //this 현재객체(인스턴스) 필드변수에서 선언한 네임의 값을 의미.
		this.type = type;		
	}
	// 이름 필드변수랑 파라미터의 이름이랑 똑같으면 this. 붙여야함
	Phone(String m, String t, boolean b) {
		m = name; 
		t = type;
		b = hasLCD;
	}
	// 이름 안똑같으면 this 안붙여도 됨~
	
	//--------------------------------------------------
	void call() {
		System.out.println("전화걸기");
	}
	
	void receiveCall() {
		System.out.println("전화받기");
	}
	
	void sendSms(String msg) {
		// 메시지를 String 타입으로 받아서 보냅니다
		System.out.println(name + " " + type);
		System.out.println("메시지 내용 입력 : " );
		
	}
	

	String receiveSms(String msg) {
		System.out.println("메시지 수신 내용 : ");
		return msg;
	}

	
	void view() {
		System.out.println("이름" + "\t : " + name);
		System.out.println("종류" + "\t : " + type);
		System.out.println("가로크기" + "\t : " + hsize + "cm");
		System.out.println("세로크기" + "\t : " + vsize + "cm");
		System.out.println("LCD유무" + "\t : " + hasLCD);
	}
	
	
	
}
