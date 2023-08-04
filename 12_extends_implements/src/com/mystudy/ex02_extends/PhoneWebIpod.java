package com.mystudy.ex02_extends;

class PhoneWebIpod extends Mp3Phone{
	
//	public PhoneWebIpod() {}
	public PhoneWebIpod(String phoneNo) {
			super(phoneNo);
	}
	public PhoneWebIpod(String type, String phoneNo) {
			super(type, phoneNo);
	}
	
	public void naver() {
		System.out.println("한국의 웹은 네이버지");
	}
}


