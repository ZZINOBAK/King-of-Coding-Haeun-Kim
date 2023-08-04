package com.mystudy.ex02_extends;

// Phone 허용된 속성, 기능을 사용 + Mp3Phone 속성, 기능 추가 사용
class Mp3Phone extends Phone { //extends Phone = Phone 클래스를 상속 확장 하겠다.
//원래는 컴파일러가 자동으로 extends Object를 하는데, 이번엔 Phone으로 직접 지정해준거임.
	
	public Mp3Phone(String phoneNo) {
		super(phoneNo); //부모클래스 생성자 호출
		// 컨트롤 누르고 슈퍼 클릭하면 부모클래스 생성자로 이동함.	
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}
	
	//메소드(기능) -----
	public void iliketheMusic() {
		System.out.println("알라잌더뮤직직직직직직직 댄싱뮤직~");
	}
}
