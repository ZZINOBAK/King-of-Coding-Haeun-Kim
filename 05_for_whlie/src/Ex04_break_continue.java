
public class Ex04_break_continue {

	public static void main(String[] args) {
		// 반복 제어문 : break, continue
		// break 중단(반복을 중단하고 현재 실행중인 반복문 빠져나감)
		// continue : 이어서 다음 반복 처리

		// 8만 제외하고 1~10 출력하기
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				
			} else {
			// if 문은 긍정문으로 사용하는 것이 좋음.
			 System.out.print(i + " ");
			// println 말고 print 하면 줄바꿈 없이 출력됨.
			
		}
	}
		
		 System.out.println("-----------");
			// 8만 제외하고 1~10 출력하기
		 for (int i = 1; i <= 10; i++) {
			 if (i == 8) continue;
			 // 컨티뉴를 만나면 해당 연산은 출력 안되고 바로 다음 연산으로 넘어감
			 System.out.print(i + " ");
		 }

		 System.out.println("\n-----------");
		
		 // "\n" 을 앞에 써주면 새로운 줄이라는 의미.
		 System.out.println("\n-----------");
		 
		 for (int i = 1; i <= 10; i++) {
			 if (i == 8) break;
			 System.out.print(i + " ");
		 }
		 // 브레이크는 걍 8에서 연산이 끝나버림.
		 System.out.println("반복문 종료");
		 
		 

		 
		 
		 
	}
}

