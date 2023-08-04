
public class Ex01_plusplus {

	public static void main(String[] args) {
		// 증감연산자 : ++, -- 등
		// 사용형태 : ++변수명, 변수명++, --변수명, 변수명-- 등
		// ++ 값을 1증가, -- 값을 1 감소 시킴
		// ++num; = num = num + 1; // 둘이 의미가 같음.
		// 앞쪽에 증감연사자 사용 시, 증감 후 연산에 참여.
		// 뒷쪽에 증감연산자 사용 시 , 연산 후 증감 함.
		
		int num = 100;
		System.out.println("num : " + num);
		num = num + 1;
		System.out.println("num = num + 1 : " + num);
		
		//++, -- 단독 사용시 항상 1 증가 또는 감소 함.
		num = 100;
		System.out.println("num : " + num);
		++num; // num = num + 1;
		System.out.println("++num : " + num);
		
		num = 100;
		System.out.println("num : " + num);
		--num; // num = num + 1;
		System.out.println("--num : " + num);
		
		System.out.println("------------------------------");

		
		// ++, --가 연산식에 사용되는 경우
		// ++뱐수명 : 변수값이 1 증가된 상태에서 연산 시작.
		// 변수명++ : 변수값이 연산에 사용되고 그 후 변수값이 1 증가함.
		int sum = 0;
		num = 100;
		System.out.println("num : " + num);
		sum = num++;
		System.out.println("sum = num++ : " + sum);
		System.out.println("num : " + num);
		
		System.out.println("------------------------------");
		num = 100;
		sum = num++ + 5; 
		System.out.println("sum : " + sum);
			num = 100;
			sum = ++num + 5; 
			System.out.println("sum : " + sum);
				num = 100;
				sum = num-- + 5; 
				System.out.println("sum : " + sum);
						num = 100;
						sum = --num + 5; 
						System.out.println("sum : " + sum);
		
		System.out.println("------------------------------");
		num = 100;
		System.out.println("num : " + num);
		sum = ++num;
		System.out.println("sum = ++num : " + sum);
		System.out.println("num : " + num);
		
		System.out.println("------------------------------");
		num = 100;
		System.out.println("num : " + num);
		sum = num--;
		System.out.println("sum = num-- : " + sum);
		System.out.println("num : " + num);
		
		System.out.println("------------------------------");
		num = 100;
		System.out.println("num : " + num);
		sum = --num;
		System.out.println("sum = --num : " + sum);
		System.out.println("num : " + num);
		System.out.println("------------------------------");

		
		
	}

}
