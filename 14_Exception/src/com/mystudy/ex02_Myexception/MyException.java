package com.mystudy.ex02_Myexception;

public class MyException extends Exception {

	// 생성자
	public MyException() {
		//수퍼(부모)클래스의 생성자 호출(예외 메세지 전달)
		super("내가만든 쿠키 아니고 익셉션~");
	}
	
	public MyException(String msg) {
		super("메세지" + msg);
	}
}
