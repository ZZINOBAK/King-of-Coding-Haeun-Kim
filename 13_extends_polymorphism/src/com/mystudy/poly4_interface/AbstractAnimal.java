package com.mystudy.poly4_interface;

public abstract class AbstractAnimal implements Animal{ 
	private String name; //이름, 명칭
	int legCnt; //다리갯수
	
	public AbstractAnimal() {}
	public AbstractAnimal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void eat() {
		System.out.println("냠냠냠냠");
	}
	
	@Override
	public void sleep() {
		System.out.println("zzzzzzzz");
	}
	
	@Override
	public abstract void sound();
	

}
