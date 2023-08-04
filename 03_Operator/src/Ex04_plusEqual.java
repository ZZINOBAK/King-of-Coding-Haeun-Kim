
public class Ex04_plusEqual {

	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, *=, /=, %=
		// 예 
		// num += 2; 랑 num = num +2 랑 같은 의미!!
		int result = 0;
		System.out.println("r : " + result);
		
		result += 15;
		System.out.println("r += 15 : " + result);
		
		result += 15;
		System.out.println("r += 15 : " + result);
		
		result -= 15;
		System.out.println("r -= 15 : " + result);
		
		
		result *= 15;
		System.out.println("r *= 15 : " + result);
		
		
		result /= 15;
		System.out.println("r /= 15 : " + result);
		
		
		result %= 15;
		System.out.println("r %= 15 : " + result);
	}

}
