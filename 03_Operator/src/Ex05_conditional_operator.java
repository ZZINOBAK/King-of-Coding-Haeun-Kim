
public class Ex05_conditional_operator {

	public static void main(String[] args) {
		// ? : - 조건연산자 또는 삼항연산자
		// 조건 ? 실행문1 : 실행문2;
		// 트루 일 경우 실행문과 폴스일 경우 실행문을 해보겠다.
		
		int num1 = 3333;
		int num2 = 22222;
		System.out.println("n1 : " + num1 + " | n2 : " + num2);
 
		// 첫번째 실행문이 트루일 경우 실행되고, 두번째 실행문은 폴스일 경우 실행됨!!!
		String str = (num1 > num2) ? "n1은 n2보다 크다." : "n1은 n2보다 크지 않다.";
		System.out.println("n1 > n2 결과 : " + str);
			
		String str1 = (num1 >= num2) ? "n1은 n2보다 크거나 n2와 같다." : "n1은 n2보다 크거나 n2와 같지 않다.";
		System.out.println(str1);
		
		String str2 = (num1 < num2) ? "n1은 n2보다 작다." : "n1은 n2보다 작지 않다.";
		System.out.println(str2);
		
		String str3 = (num1 <= num2) ? "n1은 n2보다 작거나 n2와 같다." : "n1은 n2보다 작거나 n2와 같지 않다.";
		System.out.println(str3);
		
		
		// 제어문 분기처리
		if (num1 > num2) {
			str = "n1은 n2보다 크다.";
		} else {
			str = "n1은 n2보다 크지 않다.";
		}
		System.out.println("n1 > n2 결과 : " + str);
		// 두개 결과값 같음!!
		String str00 = (num1 > num2) ? "n1은 n2보다 크다." : "n1은 n2보다 크지 않다.";
		System.out.println("n1 > n2 결과 : " + str00);
		
	}

}
