
public class Ex05_max_number {

	public static void main(String[] args) {
		// 숫자 3개 중 가장 큰 수 구하기
		// a는 30, b는 60, c는 20
		// 결과 : 가장 큰수
		
		int a = 100;
		int b = 1056465464;
		int c = 100436342;
		int d = 1002;
		int e = 100342;
	
		String BIG;
		
		//처리
		if (a > b && a > c && a > d && a > e) {
		    BIG = "A";
		} else if (b > a && b > c && b > d && b > e) {
	    	BIG = "B";
	    } else if (c > a && c > b && c > e && c > d) {
			BIG = "C";
		} else if (d > a && d > b && d > c && d > e) {
			BIG = "D";
		} else  {
			BIG = "E";
		}
		
		// 출력
				System.out.println("가장 큰 수를 가진 알파벳 : " + BIG);
		
				// 처리 (쌤) 1
		if (a > b) {
			if (a > c) {
				if (a > d) {
					if (a > e) {
						System.out.println(BIG = "A");
					}
				}
			}
		} else if (b > c) {
			if (b > d) {
				if (b > e) {
				    System.out.println(BIG = "B");
				}
			}
		} else if (c > d) {
			if (c > e) {
				System.out.println(BIG = "C");
			}
		} else if (d > e) {
			System.out.println(BIG = "D");
		} else {
			System.out.println(BIG = "E");
		}
		
		// 처리 (쌤) 2 
		//??? 이거 이해가 안가는데???

		int max = 0;
		// int max = Integer.MIN_VALUE;
		
		if (a > max) {
			max = a;
		}
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = c;
		}
		if (e > max) {
			max = c;
		}
	    System.out.println(max);
		
		
			

	}

}
