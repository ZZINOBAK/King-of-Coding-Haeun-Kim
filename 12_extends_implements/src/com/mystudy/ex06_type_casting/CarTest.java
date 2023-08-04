package com.mystudy.ex06_type_casting;

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
		
		System.out.println("------형변환------");
		// Car, Ambulance, FireEngine
		Car car2 = new Car();  // Car <-- Car
		car2.type = "자동차";
		System.out.println("type : " + car2.type);
		car2.drive();
		car2.stop();
		
		//car2.siren(); //컴파일오류 undefined : Car 타입에는 siren() 없음.
		
		System.out.println("----Car <--- Ambulance 저장-----");
		// Car <--- Ambulance : 부모(상위)타입 <---- 자녀(하위)타입(자동형변환)
		// 부모(상위)클래스에 자녀(하위)클래스를 저장
		car2 = am; // Car <--- Ambulance : 자동형변환
		System.out.println(car2.type);
		car2.drive();
		car2.stop();
		
		// 앰뷸런스 고유기능 siren() 사용하려면 Ambulance 타입이 되어야 함.
		((Ambulance)car2).siren();
		
		//---------------------------
		System.out.println("----Ambulance <-- Car <-- Ambulance----");
		Ambulance am2 = (Ambulance)car2; //
		
		// 자녀(하위)클래스에 부모(상위)클래스를 저장
		System.out.println("----Ambulance <--- Car-----");
		Car carTemp = new Car();
		carTemp.type = "일반자동차";
//		Ambulance am2 = (Ambulance) carTemp; //강제형변환
//		System.out.println(carTemp.type);
		// 강제형변환 문법적으로 가능하지만 실행시 오류가 발생함.
		// ClassCastException
//		Ambulance am2 = (Ambulance) carTemp;
		
		
	}

}
