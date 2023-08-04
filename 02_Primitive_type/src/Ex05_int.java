
public class Ex05_int {

	public static void main(String[] args) {
		// 정수형 int : 4바이트 사용함. 범위 알고만 있으셈.
		
		System.out.println("-----int 타입 최소값, 최대값 ---");
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		//인티저 의미 = 정수(整數) (→fraction)
		
		//final이 붙으면 정보 변경 불가.
		
		int int1 = 7777;
		// 7777을 int1에 저장한다 라는 의미
		int int2 = 3333;
		// 3333을 int2에 저장한다 라는 의미
		int sum = int1 + int2;
		System.out.println("int1 : " + int1);
		System.out.println("int2 : " + int2);
		System.out.println("int1 + int2 = " + sum);
		System.out.println(int1 + " + " + int2 + " = " + sum);
		System.out.println(int1 - int2);
		System.out.println(int1 * int2);
		System.out.println(int1 / int2);
		System.out.println((double)(int1 / int2));
		System.out.println((float)(int1 / int2));
		//2.33333이 값이어야 하는데 왜 2.0인거죠?
		
		// System.out.println(int1 + " + " + int2 + " = " + sum - int2);
		System.out.println(int1 + " + " + int2 + " = " + (sum - int2));
		// 문자열 + 연산 은 불가!!!!! 소괄호로 묶어줘야함~~~

		System.out.println(int1 % int2);
		// 7777/3333의 나머지를 출력함.
		
		// 0으로 나누면?
		// int num3 = 0;
		// System.out.println(int1 / num3);
		//오 류~~ Exception 예외 오류 발생!!!!
		
		
		  

		
	}

}
