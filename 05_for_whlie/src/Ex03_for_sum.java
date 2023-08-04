
public class Ex03_for_sum {

	public static void main(String[] args) {
		// 문제 : 1~10 합계 구해라
		
		//int sum = 1
		//	System.out.println("1~10의 합계 : " + sum);
		
		
		//int sum = 0;
		//for (int i = 1; i < 11; i = ++i +i ) {
		//	System.out.println(i);
		//}
		
		/*
		int sum = 0;
		System.out.println(sum);
		sum = sum + 1;
		System.out.println(sum);
		sum = sum + 2;
		System.out.println(sum);
		sum = sum + 3;
		System.out.println(sum);
		sum = sum + 4;
		System.out.println(sum);
		sum = sum + 5;
		System.out.println(sum);
		sum = sum + 6;
		System.out.println(sum);
		sum = sum + 7;
		System.out.println(sum);
		sum = sum + 8;
		System.out.println(sum);
		sum = sum + 9;
		System.out.println(sum);
		sum = sum + 10;
		System.out.println(sum);
		*/
		
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum = sum + i;
		System.out.println("i : " + i + ", sum : " + sum);
	}
		System.out.println(sum);
		//섬을 반복시키는게 아니라 변수를 반복시킴.
		//변하지 않는 값은 i로 안둠. 변하는 수를 i 로 둠.
		//그리고 원하는 계산을 대괄호 안에 두면 됨.
		
		//실습 1~10까지의 숫자 중에 짝수 출력
	
		int jj;
		for (int i1 = 1; i1 < 31; i1++) {
			jj = i1 % 2;	
			if (jj == 0) {
					System.out.println(i1);
				}
		}
		

		for (int i2 = -10; i2 < 31; i2++) {
			if (i2 % 2 != 0) {
				System.out.println(i2);
				}
		
	}
		
		for (int i3 = 3; i3 < 100; i3 = i3 + 3) {
			System.out.println(i3);
		}
		
		int ss = 0;
		for (int i4 = 1; i4 < 10; i4++) {
			ss = ss + i4;
		}
		System.out.println(ss);

	}
}
