package com.mystudy.poly1_extends;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("-----Car 클래스-----");
		Car car = new Car();
		car.type = "모닝";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("----Ambulance 클래스-----");
		Ambulance am = new Ambulance();
		am.type = "삐용삐용";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop(); 
		am.siren();
		
		System.out.println("-----FireEngine 클래스-----");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("----타입확인-----");
		Car carTemp = car; // Car <-- Car
		carTemp = am; // Car <-- Ambulance
		carTemp = fe; // Car <-- FireEngine
		System.out.println(carTemp.type);
		System.out.println("타입확인(instanceof)");
		if (carTemp instanceof Object) {
			System.out.println("------오브젝트타입임");
		}
		if (carTemp instanceof Car) {
			System.out.println("------차타임아니고 차타입");
			carTemp.drive();
			carTemp.stop();
		}
		if (carTemp instanceof FireEngine) {
			System.out.println("------소방차타입임");
			carTemp.drive();
			carTemp.stop();
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();			
		}
		if (carTemp instanceof Ambulance) {
			System.out.println("-----삐뽀삐뽀타입임");
			carTemp.drive();
			carTemp.stop();
			((Ambulance) carTemp).siren();
		}
		
		System.out.println("---Car 타입객체 전달시(타입쳌)---");
		typeChicken(car); //Car
		
		typeChicken(am); //Ambulance
		
		
	}
	
	static void typeChicken(Car car) {
		System.out.println("디씨즈 카얼 타입데수");
		car.drive();
		car.stop();
		
		// 비교할(확인할)객체 instanceof 비교할 클래스명(타입명)
		if (car instanceof FireEngine) {
			System.out.println("------소방차타입임");
			((FireEngine) car).siren();
			((FireEngine) car).water();			
		}
		if (car instanceof Ambulance) {
			System.out.println("-----삐뽀삐뽀타입임");
			((Ambulance) car).siren();
		}
	}
}
