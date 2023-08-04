
public class Ex02_gt_lt {

	public static void main(String[] args) {
		// 비교연산자 : >, <, >= (크거나같다), <= (작거나같다)
		// == (같다, 동일하다), != (같지않다. 다르다.)
		// 비교연산자의 결과 값 = 항상 트루 or 폴스 임!
		
		int num1 = 30;
		int num2 = 20;
		int num3 = 10;
		int num4 = 10;
		System.out.println(num1 > num2);
		System.out.println(num3 > num2);
		System.out.println(num3 > num4);
		System.out.println(num3 >= num4);
		
		System.out.println(num1 + ">" + num2 + ":" + (num1 > num2));
		System.out.println(num3 + ">" + num2 + ":" + (num3 > num2));
		System.out.println(num3 + ">" + num4 + ":" + (num3 > num4));
		System.out.println(num3 + ">=" + num4 + ":" + (num3 >= num4));
		System.out.println(num3 + "<=" + num4 + ":" + (num3 <= num4));
		System.out.println(num3 + "==" + num4 + ":" + (num3 == num4));
		System.out.println(num3 + "!=" + num4 + ":" + (num3 != num4));
		
		// ! = 부정처리
		// !true = 참이 아니다.= false
		// !false = 거짓이 아니다. = true
		boolean power = true; // 전원이 켜짐.
		System.out.println("power : " + power);
		
		power = !power; // 현재 저장된 값이 아닌 값(부저처리)
		System.out.println("power : " + power);

	}

}
