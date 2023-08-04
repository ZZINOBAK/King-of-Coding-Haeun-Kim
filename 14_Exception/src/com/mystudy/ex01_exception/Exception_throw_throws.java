package com.mystudy.ex01_exception;

public class Exception_throw_throws {

	public static void main(String[] args) {
		// throw : 예외 발생시키기
		// throws : 예외(들) 던질 때(위임, 전가) 사용
		// throw는 메소드 선언부에 사용
		//---------------------------
		// throw new ArithmeticException();
		// throw new ArithmeticException("throw 테스트중");
		// Exception 계열은 강제 예외처리
		// throw new Exception(); //예외를 발생 시킴
		System.out.println("----main() 시작----");
		int num1 = 100;
		int num2 = 50;
		int result = 0;
		
		System.out.println("연산 ㄱㄱ");
		num2 = 0;
		try {
			result = divThrows(num1, num2);
		} catch (Exception e) {
			e.printStackTrace(); //어디서 예외 발생한지 알려주는 코드.
			System.out.println("예ㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔ" + e.getMessage());
		}
		
		System.out.println(result);
		
		System.out.println("----main() 끝----");
	}
	
	// throws : 메소드 선언부에 작성해서 호출한 곳으로 예외를 던짐(위임, 전가)
	// throw : 예외를 발생시킴
	static int divThrows(int num1, int num2) throws Exception {
		System.out.println("---divThorws() 시작---");
		int result = 0;
		try {
		result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("ㅇ예외발생" + e.getMessage());
			throw new Exception("예외 내가발생시킨 예ㅔ여ㅛㅓㅣ");
		}
		System.out.println("---divThorws() 끝---");
		return result;
	}

}
