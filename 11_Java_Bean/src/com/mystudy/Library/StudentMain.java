package com.mystudy.Library;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu);
		System.out.println(stu.toString()); 
		//toString은 Student 클래스에 있는 메소드 아님.
		//사용가능한 이유 = 부모클래스 Object가 가지고 있는 메소드이기 때문.
		
//		System.out.println(stu.name);
		// Student 클래스에 필드가 없을 때랑, private 붙였을 때랑 
		// 오류 메세지가 다르게 뜸.
		
		stu.setName("홍길동");
		String name = stu.getName();
		System.out.println(name);
		System.out.println(stu.getName());
		
		System.out.println("--------------------");
//		stu.kor = 999;
//		System.out.println(stu.kor);
		
		stu.setKor(39);
		System.out.println("국어 점수 : "+ stu.getEng());
		
		stu.setEng(36);
		System.out.println("영어 점수 : "+ stu.getEng());
		
		stu.setMath(74);
		System.out.println("수학 점수 : "+ stu.getMath());
		
		System.out.println("--------------------");
		stu.printData();
		//stu객체가 가진 메소드 중 printData라는 메소드를 실행해라.
		System.out.println("-------쌤---------");
		stu.printDataSam();
		// 메소드 만든 방법이 쌤이랑 내거랑 다름. 참고하길...
		
		System.out.println("--------------------");
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		System.out.println(tot);
		
		stu.setTot(tot); //계산된 합계 데이터를 Student 타입의 객체의 필드에 저장
		
		System.out.println("--------------------");
		double avg = tot * 100 / 3 / 100.0;
		stu.setAvg(avg);
		System.out.println(avg);
		
		System.out.println("--------------------");
		stu.printDataSam();

		System.out.println("---생성자 사용 데이터 입력----");
		Student stu2 = new Student("김하은");
		stu2.printDataSam();
		System.out.println("--------------------");

		Student stu3 = new Student("김하은", 100, 20, 40);
		stu3.printDataSam();

		
	}

}
