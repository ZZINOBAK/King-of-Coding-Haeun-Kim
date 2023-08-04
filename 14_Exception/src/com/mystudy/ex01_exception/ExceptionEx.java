package com.mystudy.ex01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("----main() 시작----");
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		System.out.println("연산 ㄱㄱ");
		
		//result = num1 / num2; //ArithmeticException : / by zero
		
		//예외처리 ----
		if (num2 == 0) {
			System.out.println("예외발생 : 나누는 값이 0이다.");
		} else {
			result = num1 / num2;
			System.out.println(result);
		}
		System.out.println();
		
		System.out.println("---try ~ catch 예외처리----");
		try {
			result = num1 / num2;
			System.out.println(result);
			System.out.println("--try문 끝---");
			// return; // 메소드 종료
		} catch (ArithmeticException e) {
			System.out.println("예외발생 : 나누는 값이 0이다.");
			System.out.println("예외발생 : 아리스토텔레스" + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("예외발생예외발생 런데빌런" + e.getMessage());
		} 
		// 만약 런타임이 먼저 선언되고 그 이후에 아리띰이 선언되면 컴파일 오류남.
		// 그 오류를 잡는 순서가 있어서 그럼.
		  catch (Exception e) {
			 System.out.println("예외예외 인셉션" + e.getMessage());
		 } finally {
			 System.out.println("항상 무조건 실행해라");
		 }
		
		System.out.println("test : try~catch~finally 이후 문장");
		
		
		System.out.println("----main() 끝----");
		
	}

}
