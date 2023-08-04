package com.mystudy.set2_exam_vo;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Iterator;

public class StudentSetManagerMain {

	public static void main(String[] args) {
		



//		======================================== */
//		/* (실습) Set 중 HashSet 또는 TreeSet 사용
//		 사용클래스명 : StudentVO, StudentSetManagerMain - main() 메소드
//		1. StudentVO 클래스를 사용해서
//		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
//		   "홍길동", 100, 90, 81
//		   "이순신", 95, 88, 92
//		   "김유신", 90, 87, 77
		StudentVO gil = new StudentVO("홍길동", 100, 90, 81);
		StudentVO sun = new StudentVO("이순신", 95, 88, 92);
		StudentVO you = new StudentVO("김유신", 90, 87, 77);
		System.out.println(gil.getName());
		System.out.println(gil);
//		---------------------
//		2. Set 타입의 변수(set)에 저장하고
		HashSet<StudentVO> set = new HashSet<StudentVO>();
		set.add(gil);
		set.add(sun);
		set.add(you);
		System.out.println(set);
		
//		3. set에 있는 데이터를 사용해서 화면출력
//		   성명   국어  영어  수학  총점  평균
//		   ---------------------------------
//		   홍길동  100  90  81   270  90.33
//		   ...
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");

		for (StudentVO ss : set) {
			ss.computeTotAvg();
			System.out.println(ss.getName() + "\t" + ss.getKor() + "\t" + ss.getEng()
			 + "\t" + ss.getMath() + "\t" + ss.getTot() + "\t" + ss.getAvg());
		}
	
		System.out.println("--------------------------");
//		4. "김유신" 국어 점수를 95 점으로 수정				
		for (StudentVO ss : set) {
			if ("김유신".equalsIgnoreCase(ss.getName())) {
				ss.setKor(95);
//				set.remove(ss.getKor());
			}
			ss.computeTotAvg();
			System.out.println(ss.getName() + "\t" + ss.getKor() + "\t" + ss.getEng()
			 + "\t" + ss.getMath() + "\t" + ss.getTot() + "\t" + ss.getAvg());
		}
		System.out.println("------------------");
		
//		5. 수정된 "김유신" 데이터만 출력 확인
		System.out.println(you.getName() + "\t" + you.getKor() + "\t" + you.getEng()
		 + "\t" + you.getMath() + "\t" + you.getTot() + "\t" + you.getAvg());
		
		System.out.println("----------------------");
//		6. 전체 데이터 화면 출력
		for (StudentVO dd : set) {
			System.out.println(dd);
		}
		
		System.out.println("-----트리셋----------------");
		StudentVO hong = new StudentVO("홍길동", 100, 90, 81);
		StudentVO lee = new StudentVO("이순신", 95, 88, 92);
		StudentVO kim = new StudentVO("김유신", 90, 87, 77);
	
//		---------------------
//		2. Set 타입의 변수(set)에 저장하고
		TreeSet<StudentVO> set1 = new TreeSet<StudentVO>();
		set1.add(hong);
		set1.add(lee);
		set1.add(kim);
		System.out.println(set1);
		System.out.println("----------------------");
		
//		3. set에 있는 데이터를 사용해서 화면출력
//		   성명   국어  영어  수학  총점  평균
//		   ---------------------------------
//		   홍길동  100  90  81   270  90.33
//		   ...
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");

		for (StudentVO ss : set1) {
			ss.computeTotAvg();
			System.out.println(ss.getName() + "\t" + ss.getKor() + "\t" + ss.getEng()
			 + "\t" + ss.getMath() + "\t" + ss.getTot() + "\t" + ss.getAvg());
		}
	
		System.out.println("--------------------------");
//		4. "김유신" 국어 점수를 95 점으로 수정				
		for (StudentVO ss : set1) {
			if ("김유신".equalsIgnoreCase(ss.getName())) {
				ss.setKor(95);
//				set.remove(ss.getKor());
			}
			ss.computeTotAvg();
			System.out.println(ss.getName() + "\t" + ss.getKor() + "\t" + ss.getEng()
			 + "\t" + ss.getMath() + "\t" + ss.getTot() + "\t" + ss.getAvg());
		}
		System.out.println("------------------");
		
//		5. 수정된 "김유신" 데이터만 출력 확인
		System.out.println(kim.getName() + "\t" + kim.getKor() + "\t" + kim.getEng()
		 + "\t" + kim.getMath() + "\t" + kim.getTot() + "\t" + kim.getAvg());
		
		System.out.println("----------------------");
//		6. 전체 데이터 화면 출력
		for (StudentVO dd : set1) {
			System.out.println(dd);
		}
		
		
		System.out.println("----쌤------------------");
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		
		//2. Set 타입의 변수(set)에 저장하고
		//HashSet<StudentVO> set11 = new HashSet<>();
		TreeSet<StudentVO> set11 = new TreeSet<>();
		//Set<StudentVO> set11 = new TreeSet<>();
		set11.add(stu1);
		set11.add(stu2);
		set11.add(stu3);
		System.out.println("set : " + set11);
		
		System.out.println("== 3. 전체 데이터 화면출력 =========");
		//3. set에 있는 데이터를 사용해서 화면출력
		for (StudentVO vo : set11) {
			System.out.println(vo.getName() + "\t" 
					+ vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMath() + "\t" 
					+ vo.getTot() + "\t" + vo.getAvg());
		}
		System.out.println("----------");
		
		Iterator<StudentVO> ite = set11.iterator();
		while (ite.hasNext()) {
			StudentVO vo = ite.next();
			System.out.println(vo.getName() + "\t" 
					+ vo.getKor() + "\t" 
					+ vo.getEng() + "\t" 
					+ vo.getMath() + "\t" 
					+ vo.getTot() + "\t" 
					+ vo.getAvg());
		}
		
		System.out.println("== 4. 김유신 점수 95로 수정");
		//4. "김유신" 국어 점수를 95 점으로 수정
		for (StudentVO vo : set11) {
			if ("김유신".equals(vo.getName())) {
				vo.setKor(95);
			}
		}
		System.out.println("===5. 김유신 데이터 화면출력 ===");
		//5. 수정된 "김유신" 데이터만 출력 확인
		for (StudentVO vo : set11) {
			if ("김유신".equals(vo.getName())) {
				System.out.println(vo.getName() + "\t" 
						+ vo.getKor() + "\t" 
						+ vo.getEng() + "\t" 
						+ vo.getMath() + "\t" 
						+ vo.getTot() + "\t" 
						+ vo.getAvg());
				break;
			}
		}
		System.out.println("=== 전체 데이터 출력 ===");
		for (StudentVO vo : set11) {
			System.out.println(vo.getName() + "\t" 
					+ vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMath() + "\t" 
					+ vo.getTot() + "\t" + vo.getAvg());
		}
		
		System.out.println("=================");
		set11.descendingIterator(); //개인별 실습
		
	}

}
