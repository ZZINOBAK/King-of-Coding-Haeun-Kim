
public class Ex01_for {

	public static void main(String[] args) {
		// 제어문 - 반복문(for, while, do ~ while
		// for (초기값설정 ; 실행(종결); 증감설정 ) {} // 무한 반복?
		// (세미콜론 두개가 무조건 있어야 함.)

		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("---------");
		//문장이 완벽히 똑같을 때만 반복문을 이용할 수 있음!
		
		/*
		 for (;;) {
			System.out.println("|");
		} 
		*/
		
		//i++(= i = i + 1)
		
		
		for (int i = 10; i <= 50; i = i + 2) {
			System.out.println("|");
		}
		
		
		for (int i = 10; i <= 55; i = i + 5) {
			System.out.println("*");
		}
		
		for (int i = 10; i >= -55; i--) {
			System.out.println("0");
		}
		
		System.out.println("-------------------");
		System.out.println("1부터 5까지 출력");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		System.out.println("2의 제곱 출력");
		for (int i = 2; i <= 5000; i = i * 2) {
			System.out.println(i);
		}
		
		for (int i = 2; i <= 5000; i = i * i) {
			System.out.println(i);
		}
		
		/////////////////////////
		int num = 1;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		System.out.println(num);
		num = num * 2;
		
		
		// 선생님 코드~~~~ 
		int num1 = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(num1);
			num1++;
		}
		
		System.out.println("-----------------");
		num1 = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
			System.out.println(num1++);
		}

	}

}
