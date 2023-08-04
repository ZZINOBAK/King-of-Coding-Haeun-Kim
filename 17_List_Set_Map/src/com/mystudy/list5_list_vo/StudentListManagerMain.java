package com.mystudy.list5_list_vo;

import java.util.ArrayList;

public class StudentListManagerMain {

	public static void main(String[] args) {
//		/* (실습) List를 사용한 성적 처리
//		사용클래스명 : StudentVO, StudentListManager - main() 메소드
//		1. StudentVO 클래스를 사용해서
//		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
//		   "홍길동", 100, 90, 81
//		   "이순신", 95, 88, 92
//		   "김유신", 90, 87, 77
//		StudentVO gil = new StudentVO("홍길동", 100, 90, 81);
//		StudentVO sun = new StudentVO("이순신", 95, 88, 92);
//		StudentVO you = new StudentVO("김유신", 90, 87, 77);

//		System.out.println(gil.computeTotAvg());
		
//		2. ArrayList 타입의 변수(list)에 저장하고
//		ArrayList<String> name = new ArrayList<>();
//		name.add(gil.getName()); 
//		name.add(sun.getName());
//		name.add(you.getName());
//		
//		ArrayList<Integer> gilscore = new ArrayList<>();
//		gilscore.add(gil.getKor()); 
//		gilscore.add(gil.getEng());
//		gilscore.add(gil.getMath());
//		gilscore.add(sun.getKor());
//		gilscore.add(sun.getEng());
//		gilscore.add(sun.getMath());
//		gilscore.add(you.getKor());
//		gilscore.add(you.getEng());
//		gilscore.add(you.getMath());
//		
//		ArrayList<Double> tot = new ArrayList<>();
//		tot.add((double)(gil.getKor() + gil.getEng() + gil.getMath())); 
//		tot.add((double)(sun.getKor() + sun.getEng() + sun.getMath())); 
//		tot.add((double)(you.getKor() + you.getEng() + you.getMath())); 
//		
//		ArrayList<Double> avg = new ArrayList<>();
//		avg.add(tot.get(0) * 100 / 3 / 100.0); 
//		avg.add(tot.get(1) * 100 / 3 / 100.0); 
//		avg.add(tot.get(2) * 100 / 3 / 100.0);
		
		System.out.println("----------------");
		StudentVO gil = new StudentVO("홍길동", 100, 90, 81);
		StudentVO sun = new StudentVO("이순신", 95, 88, 92);
		StudentVO you = new StudentVO("김유신", 90, 87, 77);
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(gil);
		list.add(sun);
		list.add(you);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
//		StudentVO gil = list.get(0); // 맨 처음에 선언한 StudentVO 클래스를 이용해서 객체 gil 만들기랑 코드가 거의 비슷.
//		String ssss = list.get(0); //list의 첫번째 인덱스의 데이터를 문자열데이터타입 ssss에 넣으려했으나 되지 않음.
//		int iiii = list.get(0); //정수데이터타입에도 안넣어짐.
		StudentVO ggg = list.get(0); //무조건 StudentVO 데이터 타입에만 넣어지는군.
		StudentVO sss = list.get(1);
		StudentVO yyy = list.get(2);
		System.out.println(ggg.getName()); //StudentVO 데이터타입 변수인 ggg
		System.out.println(gil.getName()); //StudentVO 클래스를 이용해 만든 객체 gil
		System.out.println(sss.getKor());
		System.out.println(yyy.getEng());
//		String dd = ggg.getName();
//		int aa = ggg.getKor();
//		System.out.println(dd + " " + aa);
//		list.add(new StudentVO(gil.getName()));
		System.out.println(list.get(0));
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");

		int tot1 = ggg.getKor() + ggg.getEng() + ggg.getMath();
		int tot11 = gil.getKor() + gil.getEng() + gil.getMath();
		System.out.println(tot11);
		int tot2 = sss.getKor() + sss.getEng() + sss.getMath();
		int tot3 = yyy.getKor() + yyy.getEng() + yyy.getMath();
		
//		double avg1 = tot1 * 100 / 3 / 100.0;
		double avg2 = tot2 * 100 / 3 / 100.0;
		double avg3 = tot3 * 100 / 3 / 100.0;
//		
//		System.out.println(gil.getName() + "\t" + gil.getKor()
//		+ "\t" + gil.getEng() + "\t" + gil.getMath()
//		+ "\t" + tot1 + "\t" + avg1);
		
//		System.out.println(ggg.getName() + "\t" + ggg.getKor()
//					+ "\t" + ggg.getEng() + "\t" + ggg.getMath()
//					+ "\t" + tot1 + "\t" + avg1);
		System.out.println(sss.getName() + "\t" + sss.getKor()
					+ "\t" + sss.getEng() + "\t" + sss.getMath()
					+ "\t" + tot2 + "\t" + avg2);
		System.out.println(yyy.getName() + "\t" + yyy.getKor()
					+ "\t" + yyy.getEng() + "\t" + yyy.getMath()
					+ "\t" + tot3 + "\t" + avg3);
		
//		3. list에 있는 전체 데이터 화면출력
//		   성명   국어  영어  수학  총점  평균
//		   ---------------------------------
//		   홍길동  100  90  81   270  90.33
//		   ...
//		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
//		System.out.print(name.get(0) + "\t");
//		System.out.print(gilscore.get(0) + "\t" + gilscore.get(1) 
//				+ "\t" + gilscore.get(2) + "\t");
//		System.out.print(tot.get(0) + "\t");
//		System.out.println(avg.get(0));
//		
//		for (int i = 0; i < 3; i++) {
////			System.out.print(name.get(i) + "\t");
//			for (int i1 = 0; i1 < 3; i1++) {
//				System.out.print(gilscore.get(i1) + "\t");
//				}
//			System.out.print(tot.get(i) + "\t");
//			System.out.println(avg.get(i));
//		}
		
//		4. 김유신 국어 점수를 95 점으로 수정 후 김유신 데이터만 출력
//		for (int i = 0; i < gilscore.size(); i++) {
//			if (name.get(i).equals("김유신")) {
//				gilscore.set(gilscore.indexOf(gil.getKor()), 95);
//			}
//		}
//		System.out.println();
		
		
//		5. 전체 데이터 화면 출력
//		========================================== */
//		for (int i = 0; i < 3; i++) {
//			System.out.print(name.get(i) + "\t");
//			for (int i1 = 0; i1 < 3; i1++) {
//				System.out.print(gilscore.get(i1) + "\t");
//				}
//			System.out.print(tot.get(i) + "\t");
//			System.out.println(avg.get(i));
//		}
//		
	}

}
