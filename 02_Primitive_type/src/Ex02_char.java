
public class Ex02_char {

	public static void main(String[] args) {
		//문자형 // 2바이트 사용 // 문자 1글자를 저장함 // 0~65535 총 65536개 사용.
		// 자바 문자처리 방식은 유니코드 형태
		char char1 = 'A';
		//쌍따옴표 쓰면 안됨. 작은따옴표 사용. 문자 한개를 나타날 때 = 작은 따옴표 사용
		// "A"는 문자열(스트링) //  'A'는 문자(차)
		System.out.println("char1 : " + char1);
		System.out.println("char1 다음문자 : " + char1 + 1);
		System.out.println("char1 다음문자 : " + (char1 + 1));
		//계산 순서에 따라 값이 달라짐
		// 차 + 1이 계산이 가능한 것은 차의 값이 숫자를 가지고 있기 때문임????
		
		System.out.println("char1 다음문자 : " + (char)(66));
		System.out.println("char1 다음문자 : " + (char)(char1 + 1));
		// 차타입으로 형변환 한다는 의미임 // 문자로 형변환 됨.
		// 65 = a // 66 = b
		
		char char2 = '한';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00';
		// 역실래시u = 유니코드 값을 의미 // AC00 = 16진수임 // AC 한바이트, 00 한바이트 총 2바이트
		System.out.println("char3 : " + char3);
		
		System.out.println("-------------------------------------");
		System.out.println("char1 : " + char1);
		
		char1 = (char)(char1 + 1); 
		//char <- int를 강제로 char로 형변환 함. 인트값이 차보다 크니까 자연스럽지는 않은 형변환임.
		System.out.println("char1(다음값) : " + char1);
		char1 = (char)(char1 + 1); 
		System.out.println("char1(다음다음값) : " + char1);
		char1 = (char)(char1 + 2); 
		System.out.println("char1(다음다음다음다음값) : " + char1);
		// 오???? 뭐여
		
		
		
	}

}
