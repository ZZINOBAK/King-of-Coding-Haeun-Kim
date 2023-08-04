package edu.class1.basic;

public class Ex03_method {

	Ex03_method() {} //기본 생성자. 입력안해줘도 자동으로 설정됨.
	
	public static void main(String[] args) {
		int num1 = 500;
		int num2 = 200;
		//지역(로컬) 변수
		int sum = 0;
		
		// 메소드 실행(호출)
		int d = add(num1, num2); //2개만 넣을 수 있고 순서 중요
		System.out.println(d);

		// 지금 이 시점 여기서 넌스태틱 메소드는 사용 불가.
		// 여기서 객체(인스턴스)가 만들어 져야 쓸수 있음.
		// 객체를 사용하면 스태틱, 논스태틱 변수, 메소드 모두 사용 가능!!
		Ex03_method ex03 = new Ex03_method(); 
		//() 소괄호 = 생성자
		//new Ex03_method = 새로운 객체를 만든다.
		//Ex03_method(); = 생성자를 호출한다.
		ex03.sub(num1, num2); //sub(num1, num2); = 이렇게만 쓰면 오류임!! 무조건 객체필요~~~
		System.out.println();
		ex03.mul(num1, num2);
		System.out.println();
	}

	// 스태틱이 붙어 있는 메소드 선언
	static int add(int a, int b) {
			return a + b;
	}
	
	// 스태틱이 없는 메소드 선언
	int sub(int a, int b) {
		return a - b;
		// 객체(인스턴스)가 만들어 져야 쓸수 있음.
	}
	
	int mul(int a, int b)//파라미터의 유무???? 있을 시 두개 이상 있을 수 있나봄???
	{
		return a * b;
	}
	//리턴이 있으면 무한, 없으면 끝?????
	//리턴타입???????? 의 유무???????
	
	//----------------------------------------------------------
	//메소드 형태 : 파라미터 값 유무, 리턴값 유무
	void method1() {
		System.out.println("파라미터값 X, return 값 X");
	}
	
	void method2(String param) {
		System.out.println("파라미터값 O, return 값 X");
	}
	
	String method3() { //스트링 타입
		System.out.println("파라미터값 X, return 값 O");
		return "파라미터값 X, return 값 O"; //스트링 타입이라 여기에 숫자 쓰면 안됨. 
	}
	
	int method31() { //스트링 타입
		System.out.println("파라미터값 X, return 값 O");
		return 100; //int쓰면 숫자 됨????
	}
	
	String method4(String param) {
		System.out.println("파라미터값 O, return 값 O");
		return "파라미터값 O, return 값 O";
	}
	
	
	
	
		
}
