
public class Ex10_while {

	public static void main(String[] args) {
		// 반복문 : while, do ~ whil3
		/*
		 while 반복문 사용 형태
		 반복 인자의 선언 및 초기값 설정;
		 while (실행조건식) {
		   		반복인자값 증감설정(선택적); // 반복 인자값 부분은 이 부분에 올 수도 있고
		   		실행문들;
		   		반복인자값 증감설정(선택적); // 이부분에 올 수도 있고, 없을 수도 있음.
		 }
		 */

		// 1~10 화면출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		// for (int i = 1, j = 1; i < 10, j < 10; i++, j++)
		// 이렇게 for 안에 두개의 변수 설정 가능!!!
		
		System.out.println();
		System.out.println("-----------와일와일-------");
		// while문으로 작성하기
		int i = 1;
		while (i < 11) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("-----------와일와일1-------");
		i = 0;
		while (i < 10) {
			i++;
			System.out.print(i + " ");	
		}
		// for와 while의 차이는 i++(증감)의 위치!!
		// for는 모든 계산 수행 후 증감함.
		// 와일은 내가 넣은 곳에서 증감 계산을 수행함!
		
		System.out.println();
		System.out.println("-----------브레이크-------");
		// for에서는 브레이크 컨티뉴를 사용해도 증감 설정에 따라 무한루프 안됨.
		// 하지만 while에서는 증감 설정 위치에 따라 무한루프에 빠질 수 있음/.
		// 브레이크 = 현재 실행중인 반복문을 종료하고 빠져나감~~
		int num = 1;
		while (true) {
			System.out.print(num++ + " ");
			if (num > 10) break; // 반복 중단 선언
		}

		System.out.println();
		System.out.println("----------컨티뉴-------");
		// 컨티뉴
		/*
		num = 1;
		while (num < 11) {
			if (num == 5) continue;
			System.out.println(num);	
			num++;
		} 
		*/
		// 1, 2, 3, 4 출력 후 무한 루프
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue;
			System.out.println(num);	
			// 증감식은 컨티뉴보다 앞에 있어야 무한루프 안됨.
		}
		
		System.out.println();
		System.out.println("----------for 내 컨티뉴-------");
		for (int m = 1; m < 11; m++) {
			if (m % 2 == 0) continue;
			System.out.println(m);
		}
		
		System.out.println();
		System.out.println("----------do ~ while-------");
		// 1 ` 10 출력
		num = 1;
		do {
			System.out.println("do~while : " + num);
			num++;
		} while (num < 11); 
		
		/* do - while 
		 반복 인자의 선언 및 초기값 설정
		 do {
		 	반복인자값
		 	
		 } while (실행조건식);
		 
		 !! while이랑 do-while이랑 똑같음 ~
		 */
		
		System.out.println("----내부 반복문에서 break 처리시-----");
		for (int out = 1; out <= 3; out++) {
			System.out.println("out : " + out);
			
			for (int in = 1; in <=5; in++) {
				System.out.println("out : " + out + ", in : " + in);
				if (out == 2) break; // 내부반복문만 종료 처리됨.
			}
		}
		
		System.out.println("----중첩 반복문 모두 중단하기----");
		outFor: for (int out = 1; out <= 3; out++) {
			System.out.println("out : " + out);
			
			for (int in = 1; in <=5; in++) {
				System.out.println("out : " + out + ", in : " + in);
				if (out == 2) break outFor; // 외부 반복문 중단처리
			} // 맨 앞에 설정해 둔 outFor를 break 뒤에 써줘서 아예 반복문 전체를 중단시켜 버림\
			// 저 outFor를 라벨? 이라고 하나봄. 
		} // 중첩 반복문(for에만 쓰는거 아님)
		// 을 모두 종료해야 하는 경우(위치지정 break문 사용하면 됨)
		System.out.println("----끝----");

		

		
		
	}

}
