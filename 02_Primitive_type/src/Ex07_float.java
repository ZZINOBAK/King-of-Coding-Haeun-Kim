
public class Ex07_float {

	public static void main(String[] args) {
		// 플로트 둥둥둥둥
		System.out.println("-----float 타입 최소값, 최대값 ---");
		System.out.println("float 최소값 : " + Float.MIN_VALUE);
		System.out.println("float 최대값 : " + Float.MAX_VALUE);
		// 범위가 38제곱까지 가능ㅋ
		//부동소수점 위키백과 참고
		//소수점 이하 데이터 저장 가능~~~
		
		float f1 = 3.4F;
		//소수점은 자바님께서 기본적으로 더블로 인식하기 때문에 F를 접미해줘서 플로트 타입으로 인식하게 만듬.
		float f2 = 3.14f;
		float f3 = 3.2f;
		float sum = f1 + f2;
		float sum2 = f1 + f3;
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		System.out.println("f1 + f2 : " + sum);
		System.out.println("f1 + f3 : " + sum2);
		// 소수점 이하 6자리까지만 정확도가 보장. 그 이후는 정확도가 없나보구만...
		//근데 소수점 이하 6자리도 100퍼는 아니라고 함~~
		

	}

}
