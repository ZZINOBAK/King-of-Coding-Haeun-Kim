package edu.class2.car;

public class CarMain {

	public static void main(String[] args) {
		//Car 클래스를 이용해서 Car 타입의 객체(인스턴스)를 생성해서 사용
		Car car1 = new Car();
		//개발자가 생성자를 따로 정의한 경우 자동으로 생성자 컴파일 할때 안만들어줌!!

		System.out.println(car1.name);
		System.out.println(car1.model);
		System.out.println(car1.color); //변수. 을 입력하면 쓸 수 있는 메소드들이 쭉 나옴
		System.out.println(car1.CAR_LENGTH);
		System.out.println(car1.CAR_WIDTH);
		System.out.println(car1.hasAirbag);
		System.out.println();
		
		car1.name = "첫차";
		System.out.println(car1.name);
		car1.hasAirbag = true; // final이 안붙은 메소드?는 값 변경 가능!
		
		System.out.println("-----기능테스트----------");
		car1.run();
		car1.stop();
		car1.back();
		car1.info();
		
		System.out.println("-----car2 생성 사용----------");
		// Car car2 = new Car();
		Car car2 = new Car("dd", "ss", "ee");
		car2.CAR_WIDTH = 300; // final 지우니까 수정 되네.
		car2.dispData();
		
					
		
	
	
	}
	
}
