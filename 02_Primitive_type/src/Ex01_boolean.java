
public class Ex01_boolean {

	public static void main(String[] args) {
		// 불린 데이터 타입은 트루 폴스 값만 가능. 논리형
		// 타입 변수명; // = 변수 선언만 하는거임 = 변수 공간만 확보
		// 타입 변수명 = 값; // 변수선언 + 초기값 설정 두개 다함.
		boolean bool1 = true; // 이 트루는 문자열 트루 아님. 트루라는 키워드 값임
		boolean bool2 = false;
		
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		
		bool1 = false;
		if (bool1) {
			System.out.println("if문 bool1이 참(true)이면 실행");
		} else {
			System.out.println("if문 bool1이 거짓(false)이면 실행");
		}
		
		System.out.println("--------main() 메소드 끝 -----");
	}

}
