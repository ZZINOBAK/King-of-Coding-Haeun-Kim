
public class Ex03_byte {

	public static void main(String[] args) {
		// 정수형 바이트 : 정수 숫자 저장 256개 번위 = -128 ~ 127
		byte byte1 = 100;
		System.out.println("byte1 : " + byte1);
		
		byte byte11 = 20;
		System.out.println("byte11 : " + byte11);
		
		byte byte111 = 28;
		System.out.println("byte111 : " + byte111);
		
		byte byte2 = 127;
		System.out.println("byte2 : " + byte2);
		
		/*
		byte byte3 = 128;
		System.out.println("byte3 : " + byte3);
		이거는 오류임. 128은 바이트가 표현 못함
		*/
		
		byte byte4 = (byte)(byte1 + byte11);
		System.out.println("byte1 + byte11 : " + byte4);
		
		byte byte5 = (byte)(byte1 + byte111);
		System.out.println("byte5 : " + byte5);
		// 진짜 정답은 128인데 바이트가 표현할 수 있는 범위를 초과해서 이상한 값이 나와버림. -128. 
		// 자바가 오류났다고 안알려줌. 그래서 망하는 계산이 됨. 잘못 계산떄리면 ㅎㄷㄷ
		
		
		System.out.println("------------------------------byteeeeeeeeeeee");
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);
		// Byte = 클래스. byte = 매소드
		// 복합어 = 언더바 붙임.
		// 관습적 대문자 소문자 부호 사용 루틴이 있나봄 ㅋ
		
		
	}

}
