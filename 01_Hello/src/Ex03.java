
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 십진수 = 우리가 쓰는 거. 2진수 = 컴퓨터가 쓰는거.
		// 8진수가 뭐야 16진수는 뭐야
		// 한 비트에는 0과 1만 넣을 수 있다??
		// 비트 8개 = 1바이트
		// 우리가 보는 문자 1개는 비트4개
		//그럼 문자 2개는 1바이트이자 비트8개
		
		
		//int = 인티즈 = 정수형 데이터 = 정수값을 저장하는 데이터 타입
		// 우측에 있는 10을 좌측에 있는 kim에 저장/치환 한다.
		int kim = 10;
		int ha = 9;
		int eun = 11;
		int khe = 16;
		int binary = 1010;
		System.out.println("kim:" + kim);
		System.out.println("ha:" +  ha);
		System.out.println("eun:" + eun);
		System.out.println("khe:" + khe);
		System.out.println("binary:" + binary);
		
		
		System.out.println("------------------------");

		// 2진수로 표현하려면 0b 또는 0B를 접두어로 사용하면 자바에서 2진수값으로 표현함.
		int bb = 0b1010;
		System.out.println("bb:" + bb);
		System.out.println(bb);
		System.out.println(0b1000001);
		System.out.println((char)0b1000001);

		
		System.out.println("------------------------");

		// 8진수는 접두어 0만 사용
		int octal = 12;
		int oo = 012;
		System.out.println("octal:" + octal);
		System.out.println("oo:" + oo);
		System.out.println(oo);
		System.out.println(0101);
		System.out.println((char)0101);

		
		
		System.out.println("------------------------");

		//0x 또는 0X를 접두어로 사용하면 16진수로 사용됨
		int hexaDecimal = 0Xa;
		System.out.println("hexaDecimal:" + hexaDecimal);
		// 16 진수는 0 1 2 3 4 5 6 7 8 9 a  b  c  d  e  f 로 표현됨
		//                             10 11 12 13 14 15 로 표현됨
		// 16 진수는 0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F 로 표현됨
		System.out.println(hexaDecimal);
		System.out.println(0x41); //이렇게 하면 정수로 출력
		System.out.println((char)0x41); //이렇게 해야 문자로 출력

		System.out.println("------------------------");

		// 참고 : 첫글자가 대문자인 단어는 대부분 클래스임.
		
		System.out.println(Integer.toBinaryString('A'));
		// 바이너리 값이 출력 됨.
		// 바이너리 = 2진수 값
		
		System.out.println(Integer.toOctalString('A'));
		// 팔진수 값이 출력 됨.
		
		System.out.println(Integer.toHexString('A'));
		// 헥사 값이 출력
		// 헥사 = 16진수 값
		
		int decimal = 10000000;
		//데이터 타입 = int
		//변수 = decimal
	

		
	}

}
