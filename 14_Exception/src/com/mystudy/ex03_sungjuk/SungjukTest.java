package com.mystudy.ex03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		SungjukVO stu = new SungjukVO("홍길동", 100, 90, 80, 0, 0);
		stu.setKor(999);
		
		System.out.println("--- setEng() 처리 ----");
		try {
			stu.setEng(955);
		} catch (JumsuOutOfValueException e) {
			e.printStackTrace(); //이거는 어디서 오류난지 확인하는 코드.
			System.out.println(e.getMessage()
					+ " : 0~100 범위의 값으로 다시 입력하시오");
		} catch (SungjukProcessException e) {
			System.out.println("성적처리 중 예외 발생");
		}
		
		System.out.println("stu : " + stu);
		
		System.out.println("--- main() 끝 ---");

	}

}
