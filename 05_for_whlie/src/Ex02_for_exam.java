
public class Ex02_for_exam {

	public static void main(String[] args) {
		// (실습) 1~5까지의 숫자 화면출력
		for (int i = 1; i <= 5; i++) {
			System.out.println("1~5 : " + i);
		}
		System.out.println("------------------");
		
		// 실습 11~15까지 출력
		for (int i = 11; i <= 15; i++) {
			System.out.println("11~15 : " + i);
		}
		System.out.println("------------------");
		
		// 실습 홀수 출력
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println("1부터 100까지 홀수 : " + i);
		}
		System.out.println("------------------");
		
		// 실습 짝수 출력
		for (int i = 2; i < 11; i = i + 2) {
			System.out.println("1부터 100까지 짝수 : " + i);
		}
		
		int num = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
			System.out.println(num += 2);
		}
		// 이 코드를 왜 쓴거지??? 뭐여???
		
		System.out.println("------------------");
		
		// 5~1 역순으로 출력
		for (int i = 5; i > 0; i--) {
			System.out.println("5부터 1까지 역순 : " + i);
		}
		System.out.println("------------------");
	}

}
