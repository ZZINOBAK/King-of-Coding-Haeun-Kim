package com.mystudy.ex01_class;

class Mp3Phone { //public을 빼면 현재 패키지 내에서만 사용 가능해짐. 
	private String type;
	private String phoneNo;
	
	public Mp3Phone() {}
	public Mp3Phone(String phoneNo) {
		type = "Mp3Phone";
		this.phoneNo = phoneNo;
	}
	
	public Mp3Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	//전화걸기 기능
	public void givemeaCall() {
		System.out.println("깁미어콜");
	}
	
	//전화받기 기능
	public void receiveCall() {
		System.out.println("겟폰콜");
	}
	
	//전화정보 확인
	public void iseeYou() {
		System.out.println("타입 = " + type + ", 전번 = " + phoneNo);
	}
		
	//음악플레이 기능
	public void iliketheMusic() {
		System.out.println("알라잌더뮤직직직직직직직 댄싱뮤직~");
	}
	
}
