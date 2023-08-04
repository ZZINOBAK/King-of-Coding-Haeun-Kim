
public class Ex08_double {

	public static void main(String[] args) {
		// 실수형 데이터 저장 타입. 8바이트 사용
		System.out.println("-----double 타입 최소값, 최대값 ---");
		System.out.println("double 최소값 : " + Double.MIN_VALUE);
		System.out.println("double 최대값 : " + Double.MAX_VALUE);

		double d1 = 3.4;
		double d2 = 3.14;
		double d3 = 3.123456789123456789123456789d;
		// 얘는 접미사 안붙여도 자동으로 더블로 인식하긴 하는데 써도 상관음슴
		double sum = d1 + d2;
		double sum2 = d1 + d3;
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		System.out.println("d1 + d2 : " + sum);
		System.out.println("d1 + d3 : " + sum2);
		//소수점 15자리?까지는 정확도 !!거의!! 유지 그러나 그 이후 정확도 음슴
		
		System.out.println("3.4d + 3.2d = " + (3.4d+3.2d));
		//이걸 왜 한거죠???? 디 안써도 된다매 왜 한거죠???
		
	}

}
