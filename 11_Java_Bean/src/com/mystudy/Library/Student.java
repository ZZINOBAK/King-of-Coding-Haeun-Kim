package com.mystudy.Library;

//		■ 캡슐화(Encapsulation) - 정보은닉(Infomation Hiding)
//		  - 사용자의 편의와 안정성을 위해 숨길 것은 숨기고, 공개할 것은 공개
//		  - 주로 속성은 숨기고 속성에 접근시 메소드(기능)를 통해 접근 처리	
//			
//		■ 자바빈(Java Bean)
//		  - 멤버변수(property)의 접근제어자는 private
//		  - 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
//		  - get/set 메소드는 public
//		  - get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
//		  - 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
//		  - 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근


//	public class Student extends Object {
class Student { // extends Object 생략하면 컴파일러가 자동 삽입
	private String name;
//	String name;
	private int kor;
//	int kor;
	private int eng;
	
	private int math;

	private int tot;
	private double avg;
	
	//-----생성자 작성 영역------
	public Student() { //student의 부모클래스 = object
		// super : 부모클래스 객체(인스턴스)
		super(); // 이거 생략해도 컴파일러가 자동으로 삽입해서 처리함..........
		// super() : 부모클래스 객체(인스턴스)의 기본 생성자 호출;
	};
	
	public Student(String name) {
//		super(); 이거 작성 안해줘도 자동생성 되어있는거임.
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		// 현재객체(인스턴스)의 생성자 호출
		// 생성자의 재사용
		// this.name = name;
		this(name); //생성자 재사용은 생성자 코드 중 맨 처음 작성되어야 함.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name, int kor, int eng, int math, int tot, int avg) {
		this(name, kor, eng, math); 
		this.tot = tot;
		this.avg = avg;
	}
	
	//-----메소드 작성 영역-----
	// 외부에서 사용할 수 있도록 메소드 제공(public)
	// 외부에서 데이터를 전달받아 필드(멤버변수)에 데이터 저장
	// 명칭(호칭) set메소드, setter, set property(속성값 설정-쓰기)
	void setName(String name) {
		this.name = name;
	}
	
	// 외부에서 데이터를 읽어가기 위한 get 메소드
	// 명칭(호칭) : get메소드, getter, get property(속성값 읽기)
	public String getName() {
		return name;
	}
	
	// kor : setter, getter
	public void setKor(int kor) {
		// 적절한 데이터 여부 확인
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			System.out.println("[예외발생] 국어 0-100 값이 아님");
		}
	}

	public int getKor() {
		return kor;
	}
	
	// 실습 eng, math : setters, getters 작성

	public void setEng(int eng) {
			this.eng = eng;
	}

	public int getEng() {
		return eng;
	}
	
	public void setMath(int math) {
			this.math = math;
	}

	public int getMath() {
		return math;
	}
	
	public void printData() {	
	// public = 누구나 쓰삼.
	// void = 리턴할 값은 음슴.
	// printData = 메소드 이름임.
	// () = 전달받을 파라미터값은 음슴.
		System.out.println("이름 : " + getName());
		System.out.println("국어 : " + getKor());
		System.out.println("영어 : " + getEng());
		System.out.println("수학 : " + getMath());
		// 이걸 실행해라.
	}

	public void printDataSam() {	
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	
}


