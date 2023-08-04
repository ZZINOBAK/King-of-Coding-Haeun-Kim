package edu.class1.basic;

//클래스 선언부 시작
//클래스 내부에 작성하는 내용 : 변수 선언, 생성자, 메소드 선언
public class Ex02_class { //클래스 필드영역 시작
	// 변수 선언 영역 ---------------
	// 변수 선언 아무데서나 해도 되지만
	// 이곳에 하는것이 관습적임.
	int num = 111; 
	// 필드 변수(인스턴스 변수, 멤버변수, 속성-property, 전역변수) 선언
	// 객체지향 언어에서 필드 변수와 인스턴스 변수가 가장 많이 사용됨.
	
	static int staticNum = 222;
	// 이 변수 = 클래스 변수, 스태틱(static)변수 라고 함.
	// 의미상으로는 인스턴스(객체), 공통변수라고 함?????? ㅜ머라는거죠~~???
	// staticNum = 전역변수
	
	// 생성자 선언 영역 ---------------
	Ex02_class() {} //기본생성자(default constructor) 생략가능 
	// 생성자 선언 안하면 컴파일러가 자동으로 코드 삽입해줌.
	
	// 메소드 선언 영역 ---------------------
	// 메인(main)메소드 시작
	public static void main(String[] args) {
		// 이 영역에 메소드 필요시 추가 가능~~~
		int num1 = 111; //지역 변수
		//System.out.println(num); //non-static 접근
		System.out.println(staticNum);
		
		Ex02_class ex02 = new Ex02_class();
		//ex02 = 객체
		System.out.println(ex02);
		//ex02. = ex02에 있는
		System.out.println(ex02.num);
		//num = ex02라는 객체에 있는 변수
		System.out.println(ex02.staticNum);
		//객체를 통하면 스태틱이 붙어있는거 안붙어있는거 다 사용 가능?????? 뭔소리야~~
		System.out.println("----------------");
		
		int result = add(100, 200);
		//static을 없애면 코드 오류남!! 
		System.out.println(result);
		System.out.println(add(300, 500));
		
	}
	// 메인(main)메소드 끝
	static int add(int a, int b) {
	//add = 메소드 이름
	//static을 없애면 코드 오류남!! 
	//a나 b같은 애들을 인자(파라미터)라고 함.
		return a + b;
		// 값이 메소드 안에 add로 리턴된다고????/ 뭔라는거쥬 증맬이지
	}

} // 클래스 필드영역 끝
//클래스 선언부 끝
