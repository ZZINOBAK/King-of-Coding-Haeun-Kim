
public class Ex05_for_exam {

	public static void main(String[] args) {
		// 문제 1~ 10 숫자 짝수 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n---------------");

		// 1~ 10 3의 배수 출력
		for (int i1 = 1; i1 < 11; i1++) {
			if (i1 % 3 == 0) {
				System.out.print(i1 + " ");
			}
		}
		
		System.out.println("\n---------------");

		// 900 ~ 1000 17의 배수
		for (int i2 = 900; i2 <= 1000; i2++) {
			if (i2 % 17 == 0) {
				System.out.print(i2 + " ");
			}
		}
		
		System.out.println("\n---------------");

		// 2000 ~ 3000 19의 배수
		for (int i3 = 2000; i3 < 3001; i3++) {
			if (i3 % 19 == 0) {
				System.out.print(i3 + " ");
				// 이 안에 19의 배수가 몇개 인지는 어케 계산함?
			}
		}
		
		System.out.println("\n---------------");

		System.out.println((double)2033/19);
		System.out.println(2014/19);

		
		// 변수를 사용해서 일반화 하기
		int startNum = 10000;
		int endNum = 20000;
		int divNum = 199;
		for (int i = startNum; i <= endNum; i++) {
			if (i % divNum == 0) {
				System.out.println(divNum + "의 배수 : " + i);
			}
		}
	}

}
