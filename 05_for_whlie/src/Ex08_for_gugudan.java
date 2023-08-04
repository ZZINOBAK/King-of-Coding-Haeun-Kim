
public class Ex08_for_gugudan {

	public static void main(String[] args) {
		/* 구구단 2단
		 2 1 2
		 2 2 4
		 2 3 6
		 2 4 8
		 2 9 18 
		 */
		System.out.println("---풀어쓰기---(나)----");

		System.out.print("2 * ");
		System.out.print("1");
		System.out.print(" = ");
		System.out.print(2*1);
		System.out.println();
		
		System.out.print("2 * ");
		System.out.print("2");
		System.out.print(" = ");
		System.out.print(2*2);
		System.out.println();
		
		System.out.println("...");
		
		System.out.print("2 * ");
		System.out.print("9");
		System.out.print(" = ");
		System.out.print(2*9);
		System.out.println();
		
		System.out.println("---반복문 만들기---(나)----");

		int b = 1;
		for (int g = 1; g < 10; g++) {
			System.out.print("2 * " + b + " = ");
			System.out.print(2*b);
			System.out.println();
			b++;
		}		
		
		System.out.println("---구구단 (쌤)----");
		for (int g1 = 1; g1 < 10; g1++) {
			System.out.print("2 * " + g1 + " = ");
			System.out.print(2*g1);
			System.out.println();
		}	
		
		System.out.println("---구구단 (나)----");
		
		int b1 = 2;
		for (int g3 = 1; g3 < 9; g3++) {
			for (int g2 = 1; g2 < 10; g2++) {
				System.out.print(b1 + " * " + g2 + " = ");
				System.out.print(b1*g2);
				System.out.println();
				}	
			b1++;
		System.out.println("--------");
		}
		
		System.out.println("---구구단 (쌤)----");
		/*for (int g3 = 1; g3 < 9; g3++) {
			System.out.println("--------");
			for (int g2 = 1; g2 < 10; g2++) {
				System.out.print(b1 + " * " + g2 + " = ");
				System.out.print(b1*g2);
				System.out.println();
			}	
		} */ //코드 못배낌ㅋㅋ
		

		

	}

}
