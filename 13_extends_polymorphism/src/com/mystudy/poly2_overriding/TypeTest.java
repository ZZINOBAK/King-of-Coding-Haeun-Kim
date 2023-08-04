package com.mystudy.poly2_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.sound();
		dog.sound();
		pig.sound();
		
		System.out.println("---메소드 오버로딩(overloading)---");
		sound_overloading(cat);
		sound_overloading(dog);
		sound_overloading(pig);
		
		System.out.println("----instanceof 타입체크----");
		sound_instanceof(cat);
		sound_instanceof(dog);
		sound_instanceof(pig);
		
		System.out.println("---메소드 오버라이딩(overriding) 사용----");
		sound(an);
		sound(cat);
		sound(dog);
		sound(pig);		
	}
	
	// 메소드 오버라이딩(overriding)
	static void sound(Animal animal) {
		animal.sound();
	}
	
	// instanceof 사용 타입 확인하는 패턴
	static void sound_instanceof(Animal animal) {
		if (animal instanceof Cat) {
			((Cat) animal).sound();
		}
		if (animal instanceof Dog) {
			((Dog) animal).sound();
		}
		if (animal instanceof Pig) {
			((Pig) animal).sound();
		}
		
	}
	
	// 메소드 오버로딩(overloading) 방식-------
	static void sound_overloading(Cat cat) {
		cat.sound();
	}
	
	static void sound_overloading(Dog dog) {
		dog.sound();
	}
	
	static void sound_overloading(Pig pig) {
		pig.sound();
	}

}
