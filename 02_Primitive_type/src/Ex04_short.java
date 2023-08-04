
public class Ex04_short {

	public static void main(String[] args) {
		// 숏은 2바이트 사용. 데이터 갯수는 65536개임. 범위는 -32768~32767
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		// short sum = short1 + short2
		// 숏타입 + 숏타임 = 인트타입으로 바뀜. 바이트도 똑같음.
		// 그래서 강제로 형변환 작업을 해줘야 함.
				
		short sum = (short)(short1 + short2);
		System.out.println("short sum : " + sum);
		// 표현범위 벗어나면 쓰레기값나오니 항상 주의하렴
		// 원래 50000이 나와야 하는데 숏의 범위 밖이라 이상한 값이 나와버림~~~~
		
		// 그렇다면 인트로 해보겠노라
		int sumInt = short1 + short2;
		System.out.println("int sumInt : " + sumInt); 
		
		// 큰데이터 타입과 작은데이터 타입 중 큰 데이터 타입으로 결과값을 출력해줌.
		// 오류값이 나와도 계산은 잘 되는 중임. 해당 타입 범위가 벗어나서 걍 출력의 한계를 느끼고 이상한거 출력
		 

	}

}
