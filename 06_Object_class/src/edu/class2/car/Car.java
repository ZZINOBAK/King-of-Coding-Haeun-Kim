package edu.class2.car;

/*
 자동차 클래스
 속성(데이터) : 차량명, 모델명, 차량색상
 기능(동작/메소드) : go, stop, go back, parking, information
 
 객체 = 인스턴스
 인스턴스 만든다 = 인스턴스화 한다.
 */

public class Car {
	//필드변수(속성) --------------------------------
	String name = "모닝"; //차량명
	String model = "morning"; //모델명
	String color = "silver"; //색상
	
	//final 제한자 : 마지막의 의미, 변수에서는 마지막 값(데잍터), 변경할 수 없음.
	//final 변수 : 상수화된 변수(상수)
	final int CAR_LENGTH = 350; // 차량길이
	int CAR_WIDTH = 200; // 차량넓이
	
	boolean hasAirbag; //에어백 유무
	
	//생성자-----------------------------------
	// 클래스명() {} = 기본생성자
	// 클래스명() {}???? 필기하다가 넘어가버림 ㅡㅡ
	
	Car() {}
	//그래서 기본생성자 쓰고 싶으면 이렇게 따로 정의해야 함~~
	// 생성자 주의 사항!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	Car(String n, String m, String c) {
		name = n;
		model = m;
		color = c;
	} //두개 생성자 정의함.
	//개발자가 생성자를 따로 정의한 경우 자동으로 생성자 컴파일 할때 안만들어줌!!
	
	//메소드(기능, 동작, 함수)--------------------------------------
	void run() {
		System.out.println("ㄱ ㄱ ㄱ ㄱ ㄱ ㄱ ㄱ");
	}
	
	void stop() {
		System.out.println("멈춤");
	}
	
	void back() {
		System.out.println("뒤로 ㄱㄱㄱㄱㄱㄱ");
	}
	
	void info() {
		System.out.println("모닝이");
	}
	
	//자동차 속성값 확인
	void dispData() {
		System.out.println("------ 자동차 정보 -----------");
		System.out.println(name);
		System.out.println(model);
		System.out.println(color);
		System.out.println(CAR_LENGTH);
		System.out.println(CAR_WIDTH);
		System.out.println(hasAirbag);
	}
	
	
	
	
}
