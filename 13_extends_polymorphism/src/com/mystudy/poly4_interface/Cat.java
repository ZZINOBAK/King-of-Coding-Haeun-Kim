package com.mystudy.poly4_interface;

public class Cat extends AbstractAnimal {

	public Cat() {
		super("고양이");
	}
	
	@Override 
	public void sound() {
		System.out.println(getName() + "::::::야오오옹오오오옹");
	} // 부모가 getName을 가지고 있기 때문에 여기서 사용 가능함.
	// 그냥 name은 부모클래스에서 사용못하게 private 선언해놔서 못씀.
	
	public void test() {
		System.out.println("test");
	}
	
	
}
