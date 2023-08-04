package com.mystudy.ex04_interface2;

class PhoneTest {

	public static void main(String[] args) {
		System.out.println("------Phone-----");
		Phone ph1 = new Phone("01011111111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();
		ph1.sendSMS();
		ph1.receiveSMS();
		System.out.println(ph1.getPhoneNo());
		
		System.out.println("---Mp3Phone----");
		Mp3Phone mp3ph = new Mp3Phone("01011111111");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.sendSMS();
		mp3ph.receiveSMS();
	}

}
