package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone haeun = new Phone();
		haeun.hasLCD = true;
		String receiveSms = haeun.receiveSms("오랜만");
		haeun.view();
		System.out.println();
		
		haeun.call();
		System.out.println(haeun.name);
		haeun.receiveCall();
		System.out.println();
		
		haeun.sendSms("ㅇㅇㅇㅇ");
	
		
		System.out.println();
		System.out.println("----------phone1(쌤)---------");
		System.out.println(receiveSms);
		haeun.sendSms("ㅇㅇㅇㅇ");
		
		System.out.println();
		System.out.println("----------phone2(쌤)---------");
		Phone ph2 = new Phone("dd", "ff");
		ph2.view();
		
		
		

		
		
		

	}

}
