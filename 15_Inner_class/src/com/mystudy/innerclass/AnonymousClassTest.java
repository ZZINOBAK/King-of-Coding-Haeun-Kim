package com.mystudy.innerclass;

interface TestInter {
	int DATA = 100;
	void printData(); //구현부가 없음 = 추상메소드(abstract없어도 추상메소드)
}

// 인터페이스를 구현한 클래스
class TestInterImpl implements TestInter {

	@Override
	public void printData() {
		System.out.println("구현한 메소드");
	}
}

public class AnonymousClassTest {
	
	public static void main(String[] args) {
		TestInterImpl imp = new TestInterImpl();
		imp.printData();

		TestInter imp2 = new TestInterImpl();
		imp.printData();

		System.out.println("---- 익명클래스 작성 ----");
		//익명클래스 : 클래스에 이름이 없는 클래스
		TestInter test = new TestInter() {
			
			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		};
		test.printData();
		
		System.out.println("--- 1회성 객체 생성 사용 ---");
		// 단 한 번 사용하고 버려지는 객체
		(new TestInter() {
			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		}).printData();
		
	}

}
