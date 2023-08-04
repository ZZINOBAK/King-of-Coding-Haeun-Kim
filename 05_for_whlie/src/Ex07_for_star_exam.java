
public class Ex07_for_star_exam {

	public static void main(String[] args) {
		//
		/*
		 문제1
		 *****
		 ****
		 ***
		 **
		 *
		 */
		System.out.println("-----문제1------");
		int b = 6;
		for (int i1 = 1; i1 < 6; i1++) {
			for (int i = 1; i < b; i++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
		}		
		/*
		 문제2
		     *
		    **
		   ***
		  ****
		 *****
		 */
		System.out.println("-----문제2------");
		int b1 = 5;
		int b2 = 2;
		for (int i4 = 1; i4 < 6; i4++) {
			for (int i2 = 1; i2 < b1; i2++) {
				System.out.print(" ");
			}
			for (int i3 = 1; i3 < b2; i3++) {
				System.out.print("*");
			}
			System.out.println();
			b1--;
			b2++;
		}

		/*
		 문제3
		 *****
		  ****
		   ***
		    **
		     *
		 */
		System.out.println("-----문제3------");
		int b3 = 1;
		int b4 = 6;
		for (int i7 = 1; i7 < 6; i7++) {
			for (int i5 = 1; i5 < b3; i5++) {
				System.out.print(" ");
			}
			for (int i6 = 1; i6 < b4; i6++) {
				System.out.print("*");
			}
			b3++;
			b4--;
			System.out.println();
		}
		
		/*
		 문제4
		 1 : (1 + 빈칸1) + 줄바꿈
		 1 2 : (1 + 빈칸1) + (2 + 빈칸1) + 줄바꿈
		 1 2 3 : (1 + 빈칸1) + (2 + 빈칸1) + (3 + 빈칸1) + 줄바꿈
		 1 2 3 4 : (1 + 빈칸1) + ... + 줄바꿈
		 */
		System.out.println("-----문제4------");
		System.out.print("1");
		System.out.print(" ");
		System.out.println();
		
		System.out.print("1");
		System.out.print(" ");
		System.out.print("2");
		System.out.print(" ");
		System.out.println();
		
		System.out.print("1");
		System.out.print(" ");
		System.out.print("2");
		System.out.print(" ");
		System.out.print("3");
		System.out.print(" ");
		System.out.println();
		
		System.out.print("1");
		System.out.print(" ");
		System.out.print("2");
		System.out.print(" ");
		System.out.print("3");
		System.out.print(" ");
		System.out.print("4");
		System.out.print(" ");
		System.out.println();
		
		System.out.println("-----문제4----(나)--");
		int b5 = 2;
		for (int i8 = 1; i8 < 5; i8++) {
			for (int o = 1; o < b5; o++) {
				System.out.print(o);
				System.out.print(" ");	
			}
			b5++;
			System.out.println();
		}
		
		System.out.println("-----문제4----(쌤)--");
		int b51 = 2;
		for (int i81 = 1; i81 < 5; i81++) {
			int num = 1;
			for (int o1 = 1; o1 < b51; o1++) {
				System.out.print(num);
				System.out.print(" ");
				num++;
			}
			b51++;
			System.out.println();
		}
		
		/*
		 문제5
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 */
		System.out.println("-----문제5--(나)----");
		int b6 = 2;
		int b7 = 1;
		for (int i9 = 1; i9 < 5; i9++) {
			for (int o = 1; o < b6; o++) {
				System.out.print(b7);
				System.out.print(" ");	
				b7++;
			}
			b6++;
			System.out.println();
		}
		
		System.out.println("-----문제5--(쌤)----");
		
		int cnt = 2;
		int num = 1;
		for (int line = 1; line < 5; line++) {
			for (int i = 1; i < cnt; i++) {
				System.out.print(num++);
				System.out.print(" ");		
			}	
			System.out.println(" ");
			cnt++;
		}
		

		}
}
