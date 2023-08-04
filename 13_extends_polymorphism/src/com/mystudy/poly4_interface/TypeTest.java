package com.mystudy.poly4_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.sleep();
		cat.sound();
		cat.test(); //여기는 아직 cat타입이라 캣 메소드 사용 가능.
		
		dog.eat();
		dog.sleep();
		dog.sound();
		
		Pig pig = new Pig();
		pig.sound();
		
		System.out.println("----Animal 타입 사용(Cat 객체)----");
		Animal animal = new Cat(); //캣타입을 애니몰타입에 저장했다???
		animal.eat();
		animal.sleep();
		animal.sound();
//		animal.test();
		// 인터페이스타입이 되면 인터페이스 내의 정의된 메소드만 사용 가능.
		
		System.out.println("----메소드 파라미터 Animal 인터페이스 사용----");
		soundPoly(cat);
		soundPoly(dog);
		soundPoly(pig);

	}
	
	// 인터페이스 Animal 타입으로 데이터를 받아서
	// 인터페이스 타입에 저장된 데이터에 있는 sound() 메소드 호출
	// (메소드 오버라이딩에 의해 저장된 객체의 메소드 호출된다)
	static void soundPoly(Animal animal) {
		animal.sound();
	}

}
