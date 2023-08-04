
public class Ex06_long {

	public static void main(String[] args) {
		// 롱롱롱롱 타입. 8바이트 사용. 
		System.out.println("-----long 타입 최소값, 최대값 ---");
		System.out.println("long 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 최대값 : " + Long.MAX_VALUE);
		
		long long1 = 20000000000L;
		long long2 = 30000000000l;
		long sum = long1 + long2;

		// 그냥 2억만 쓰면 이 컴퓨터가 int타입(범위가 2억아 안됨)으로 인식해서 표시 안됨.
		// 그래서 롱타입으로 쓸라면 저렇게 끝에 '엘'을 써줘야 함.
		// 엘은 대소문자 다 가능
		System.out.println("long1 : " + long1);
		System.out.println("long2 : " + long2);
		System.out.println("long1 + long2 : " + sum);
		
		// 정수형 타입은 바이트, 쇼트, 인트, 롱이 있는데
		// 보통 정수는 걍 다 인트로 인식함.
		// 근데 바이트나 쇼트를 인트로 인식할 때는 작은범위에서 넓은범위로 가는거라 데이터손실 없는데
		// 롱을 인트로 인식할때는 데이터 손실발생함.
		// 그리고 보통 다 인트로 자동형변환 됨.
		// 강제로 넓은 범위 타입에서 좁은 범위 타입으로 형변환은 가능은 함. 근데 데이터손실 됨.
		
		//문자형에서 정수형이나 아무튼 다른형에서 다른형으로 형변환은 안됨~~~\
		
		


	}

}
