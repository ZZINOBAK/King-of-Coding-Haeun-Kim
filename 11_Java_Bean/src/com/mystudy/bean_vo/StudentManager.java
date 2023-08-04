package com.mystudy.bean_vo;

import java.util.Arrays;

public class StudentManager {

	public static void main(String[] args) {
		// 3명의 성적 처리 StudentVO 사용
		// 김유신
		// 이순신
		// 홍길동
		//-------------------
		// 김유신 점수 점수 점수 ㅈ점수저쉬쥐 쉬ㅏ둣 ㅜㅈ두사ㅟㅏㅈㄴ
		// 3개의 객체 만들기. 밸류오브젝트 이용
		// 2차원 배열 말고 클래스 사용 객체 사용 메소드 사용
		// 아무튼 사용
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------");
		StudentVO kk1 = new StudentVO("김유신", 100, 90, 81);	
		kk1.printData();
		
		StudentVO kk2 = new StudentVO("이순신", 95, 88, 92);
		kk2.printData();
		
		StudentVO kk3 = new StudentVO("홍길동", 90, 87, 77);
		kk3.printData();
		
System.out.println("-------쌤------------------------");
		// 데이터 생성(입력)
		StudentVO stu = new StudentVO();
		StudentVO stu1 = new StudentVO("김유신", 100, 90, 81);
		System.out.println(stu1.getName());
		System.out.println(stu1.toString()); //부모클래스가 가진 toString 메소드.
		// studentVO에서 뭐 스트링 자동생성해서 바꿔주니까 출력이 뭐 다른게 되네.
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("홍길동", 90, 87, 77);

		// 화면출력---------
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		printData(stu1);
		printData(stu2);
		printData(stu3);
		
		StudentVO[] students = new StudentVO[3];
		students[0] = stu1;
		students[1] = stu2;
		students[2] = stu3;	
		
		System.out.println("-------------------");
		students = new StudentVO[] {stu3, stu2, stu1};
		System.out.println(Arrays.toString(students));
		printData(students);
		
	}
	static void printData(StudentVO stu) {
		System.out.println(stu.getName() + "\t" + 
				stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath() + "\t" + 
				stu.getTot() + "\t" + stu.getAvg());
	
	}
	static void printData(StudentVO[] students) {
		for (int i = 0; i < students.length; i++) {
			printData(students[i]);
		}
	}
}
