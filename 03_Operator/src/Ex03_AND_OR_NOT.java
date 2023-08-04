
public class Ex03_AND_OR_NOT {

	public static void main(String[] args) {
		//  논리연산자 
		// && = and = 그리고
		// || = or = 또는
		// ! = not = 부정
		// 논리 연산자 좌, 우에는 true, false 값이 있어야 함!!!!!
		System.out.println("앤드 연산을 알아보자");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		//앞에가 트루여도 뒤에 폴스면 폴스
		// 즉 앞에가 트루면 뒤에까지 계속 계산 ㄱㄱㄱㄱㄱㄱ 진행.
		// 앞에 폴스 나오면 뒤에 확인할 필요도 없이 걍 폴스.
		// 폴스 나와버리면 연산 멈춤.
		
		boolean bool1 = 10 == 10; //트루
		boolean bool2 = 10 == 20; //폴스
		System.out.println(bool1 + "&&" + bool2 + ":" + (bool1 && bool2));
		System.out.println(bool2 + "&&" + bool1 + ":" + (bool2 && bool1));
		System.out.println(bool1 + "&&" + bool1 + ":" + (bool1 && bool1));

		int num1 = 1000;
		int num2 = 2000;
		boolean result = (num1 < num2) && bool1;
		System.out.println("(" + num1 + "<" + num2 + ")" + "&&" + bool1 + ":" + ((num1 < num2) && bool1));
		System.out.println("(" + num1 + "<" + num2 + ")" + "&&" + bool1 + ":" + (result));
		System.out.println("(" + num1 + ">" + num2 + ")" + "&&" + bool1 + ":" + ((num1 > num2) && bool1));
		System.out.println("(" + num1 + "==" + num2 + ")" + "&&" + bool1 + ":" + ((num1 == num2) && bool1));

		
		System.out.println("---------------------");
		System.out.println(" 또는 연산을 알아보자");
		System.out.println("false || true : " + (false || true));
		// or 연산은 앤드랑 반대임.
		// 앞쪽이 트루면 연산 끝남.
		// 앞쪽에 폴스 나오면 뒤에도 연산함.
		
		System.out.println("---------------------");
		System.out.println("부정 연산을 알아보자");
		System.out.println("!true : " + !true);
		result = !(num1 < num2 || bool1);
		System.out.println("!(num1 < num2 || bool1) : " + result);
	
		

	}

}
