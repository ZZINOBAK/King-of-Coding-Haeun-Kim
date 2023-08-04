package com.mystudy.ex04_interface2;

// class Phone extends Object implements I_Phone 
// 원래 익스텐즈 오브젝트가 있는데 생략된거임.
class Phone implements I_Phone{
	//필드변수(속성) -------
	private String type; //전화타입(형태)
	private String phoneNo; //전화번호
		
	//생성자 ---------
//	public Phone() {}
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}

	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	@Override
	public void view() {
		System.out.println(type + ", " + phoneNo);
		
	}

	@Override
	public void call() {
		System.out.println("전화걸기");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받기");

		
	}

	@Override
	public void sendSMS() {
		System.out.println("메세지보내기");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("메세지받기");

		
	}
		
}
