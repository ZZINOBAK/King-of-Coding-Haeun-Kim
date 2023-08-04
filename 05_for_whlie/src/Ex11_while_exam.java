
public class Ex11_while_exam {

	public static void main(String[] args) {
		// while 사용 
		// 문제1 : 1-10 합 구하기
		System.out.println("---------문제1 (나)------");
		int d = 0;
		int i = 1;
		while (i < 11) {	
			d = i + d;
			i++;
		}
		System.out.println(d);

		System.out.println("---------문제1 (쌤)------");
		System.out.println("** for문으로 만들어 보기");
		int sum = 0;
		for (int o = 1; o < 11; o++) {
			sum += o; //sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println("** while문으로 만들어 보기");
		int sum1 = 0;
		int o1 = 1;
		while (o1 < 11) {
			sum1 = sum1 + o1;
			System.out.println(o1 + " " + sum1);
			o1++;
		} // 처리 순서 봐보셈
		System.out.println("최종 값 : " + sum1);

		
		/* 문제2 : 
		 *****
		 *****
		 *****
		 */
		System.out.println("---------문제2 (나)------");
		int a = 1;
		int a1 = 1;
		while(a1 < 4) {
			while (a < 6) {	
				System.out.print("*");
				a++;
			}
			a = 1;
			System.out.println();
			a1++;
		}
		
		System.out.println();
		
		System.out.println("---------문제2 (쌤)------");
		int line = 1;
		int o2 = 1;
		while (line < 4) {
			while (o2 < 6) {
				System.out.print("*");
				o2++;
			}
			System.out.println();
			line++;
			o2 = 1;
		}
		

		/* 문제3 : 
		 *
		 **
		 ***
		 ****
		 */
		System.out.println("---------문제3 (나)------");
		int b = 1;
		int b1 = 1;
		int b2 = 2;
		while (b1 < 5) {
			while (b < b2) {	
				System.out.print("*");
				b++;
			}
			b = 1;
			b1++;
			b2++;
			System.out.println();
		}
		
		System.out.println();
		
		int c = 1;
		int c1 = 2;
		while (c1 < 6) {
			while (c < c1) {	
				System.out.print("*");
				c++;
			}
			c = 1;
			c1++;
			System.out.println();
		}
		
		System.out.println();
		
		int e = 1;
		String f = "*";
		while (e < 5) {	
			System.out.print(f);
			f = "*" + f;
			System.out.println();
			e++;			
		}
		
		System.out.println();
	}

}
