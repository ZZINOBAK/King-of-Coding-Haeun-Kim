
public class Ex06_for_star {

	public static void main(String[] args) {
		// *** 화면출력
		
		System.out.println("******");
		System.out.println("-----------");
		
		System.out.print("*****");
		// System.out.print(); ln안 붙이면 내용 무조건 있어야 함.
		System.out.println(); // ln 붙이면 내용 없어도 줄바꿈 역할 함.
		System.out.println("-----------");
		
		System.out.print("*****");
		System.out.println("\n-----------"); // \n써도 줄바꿈 됨.
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		// 똑같은 데이터가 반복되면 반복문 이용하기!!!

		System.out.println("\n-----------");

		for (int i = 1; i < 6; i++) {
			System.out.print("*");
			// 숫자가 아니어도 반복이 되는군... ln 붙이면 줄바꿈 돼서 프린트됨.
		}
		
		System.out.println("\n-----------");
		// 방법1 (나)
		for (int i = 1; i < 5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("-----------");
		// 방법2 (쌤)
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		
		System.out.println("\n-----------");
		//방법 3 (나)
		for (int i = 1; i < 4; i++) {
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println();
		}
		
		System.out.println("\n-----------");
		//방법 4 (쌤)
		for (int line =1; line < 4; line++) {
			for (int star = 1; star <= 5; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 반복문 = 몇번 반복해라~~~~

		System.out.println("\n--------------");
		// 별로 피라미드 만들기
		
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		
		
		System.out.println("\n--------------");

		System.out.println("    *    ");
		System.out.println("   * *   ");
		System.out.println("  *   *  ");
		System.out.println(" *     * ");
		System.out.println("*       *");
		
		System.out.println("\n---------------");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println();
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println();

		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println();
		
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print(" ");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("\n-피라미드 반복문 만들기--");
		// 반복문
		int b11 = 4;
		int b2 = 2;
		for (int p2 = 1; p2 < 5; p2++) {
			for (int p = 1; p < b11; p++) {
				System.out.print(" ");
			}
			for (int p1 = 1; p1 < b2; p1++) {
				System.out.print("*");
			}
			System.out.println();
			b11--;
			b2 = b2 + 2;
		}
		System.out.println("\n---만들었따~~~~~~--");

		


		
		
		System.out.println("\n---------------");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println();
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println();
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println();
		
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.println();
		
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.println();
		
		
		System.out.println("\n---나------------");
		int b = 2;
		for (int s = 1; s < b; s++) {
			b = 2;
			System.out.print("*");
			System.out.println();

			b = 3;
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			System.out.println();

			b = 3;
			System.out.print("*");
			
		}
		System.out.println();
		
		System.out.println("\n----쌤-----------");
		// 이중 반복문
		int b1 = 2;
		for (int s = 1; s < 6; s++) {
			for (int s1 = 1; s1 < b1; s1++) {
				System.out.print("*");
			}
			System.out.println();
			b1++;
		}
		
		System.out.println("\n------쌤-------");
		// 일차로 반복문 만듬. 이걸로 이중 반복문 만듬.
		for (int s = 1; s < 2; s++) {
			System.out.print("*");
		}
		System.out.println();
		for (int s = 1; s < 3; s++) {
			System.out.print("*");
		}
		System.out.println();
		for (int s = 1; s < 4; s++) {
			System.out.print("*");
		}
		System.out.println();
		for (int s = 1; s < 5; s++) {
			System.out.print("*");
		}
		System.out.println();
		for (int s = 1; s < 6; s++) {
			System.out.print("*");
		}

		System.out.println("\n-------쌤------");
		// 일단 풀어서 다 써보기
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
	}

}


