package com.mystudy.map2_exam_vo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

import com.mystudy.set2_exam_vo.StudentVO;

import java.util.Map;

public class StudentMapManagerMain {

	public static void main(String[] args) {
//		(실습) Map<K, V> 데이터 다루기
//		 사용클래스명 : StudentVO, StudentMapManagerMain - main() 메소드
//		1. StudentVO 클래스를 사용해서
//		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
//		   "홍길동", 100, 90, 81
//		   "이순신", 95, 88, 92
//		   "김유신", 90, 87, 77
//		   ---------------------
		  StudentVO hong = new StudentVO("홍길동", 100, 90, 81);
		  StudentVO lee = new StudentVO("이순신", 95, 88, 92);
		  StudentVO kim = new StudentVO("김유신", 90, 87, 77);
		   
//		2. Map<String, StudentVO> 타입의 변수(map)에 저장하고
		  HashMap<String, StudentVO> jido = new HashMap<String, StudentVO>();
		  jido.put("홍길동", hong);
		  jido.put("강감찬", lee);
		  jido.put("김유신", kim);
		  System.out.println(jido);
		  
		  StudentVO test = jido.get("홍길동");
		  System.out.println(test);
		  System.out.println(test.getName());
		  System.out.println(test.getKor());
//		3. map에 있는 데이터를 사용해서 화면출력
//		   성명    국어   영어  수학    총점     평균
//		   --------------------------.
//		   홍길동   100  90  81  270  90.33
//		   ...
//		   -----------------------------
		  System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		  Collection<StudentVO> cola = jido.values();
		  for (StudentVO pomun : cola) {
			  pomun.computeTotAvg();
			  System.out.println(pomun.getName() + "\t" + pomun.getKor() + "\t" + pomun.getEng()
				 + "\t" + pomun.getMath() + "\t" + pomun.getTot() + "\t" + pomun.getAvg());
		  }
		  System.out.println("-----------------------");
//		4. 저장된 map에 있는 김유신 학생의 국어 점수를 95점으로 수정		  
		  for (StudentVO pomun : cola) {
			  if ("김유신".equalsIgnoreCase(pomun.getName())) {
					pomun.setKor(95);
				}
			  pomun.computeTotAvg();
			  System.out.println(pomun.getName() + "\t" + pomun.getKor() + "\t" + pomun.getEng()
				 + "\t" + pomun.getMath() + "\t" + pomun.getTot() + "\t" + pomun.getAvg());
		  } 
		  System.out.println("------------------------");
		  
//		5-1. "김유신" 학생의 성적 화면 출력
		  System.out.println(kim.getName() + "\t" + kim.getKor() + "\t" + kim.getEng()
			 + "\t" + kim.getMath() + "\t" + kim.getTot() + "\t" + kim.getAvg());
		  System.out.println("------------");
		  
//		5-2. "김유신" 학생의 성명, 총점, 평균 화면 출력
		  System.out.println(kim.getName() + "\t" + kim.getTot() + "\t" + kim.getAvg());
//		======================================= 
		  
		  System.out.println("---쌤------------------");
		  	StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
			StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
			StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
			
			//2. Map<String, StudentVO> 타입의 변수(map)에 저장하고
			Map<String, StudentVO> map = new HashMap<>();
			//map.put("홍길동", stu1);
			map.put(stu1.getName(), stu1);
			map.put(stu2.getName(), stu2);
			map.put(stu3.getName(), stu3);
			
			System.out.println("map : " + map);
			
			System.out.println("=== 3. 전체 데이터 화면출력 =============");
			//3. map에 있는 데이터를 사용해서 화면출력
			Collection<StudentVO> values = map.values();
			
			for (StudentVO vo : values) {
				System.out.println(vo.getName() + "\t" 
						+ vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMath() + "\t" 
						+ vo.getTot() + "\t" + vo.getAvg());
			}
			System.out.println("---------");
			
			Set<String> keySet = map.keySet();
			System.out.println("keySet : " + keySet);
			for (String key : keySet) {
				//StudentVO vo = map.get(key);
				//printData(vo);
				printData(map.get(key));
			}
			
			System.out.println("=== 4. 김유신 국어점수 95로 변경(수정) ===");
			//4. 저장된 map에 있는 김유신 학생의 국어 점수를 95점으로 수정
			String name = "김유신";
			int score = 95;
			StudentVO student = map.get(name);
			System.out.println("student : " + student);
			if (student == null) {
				System.out.println(">>> 데이터 없음");
			} else {
				student.setKor(score);
			}
			printData(student);
			System.out.println("---------");
			
			System.out.println("\n=== 5-1. 김유신 데이터 출력 ==========");
			//5-1. "김유신" 학생의 성적 화면 출력
			printData(map.get("김유신"));
			
			System.out.println("\n=== 5-2. 김유신 이름,총점,평균 출력 ==========");
			//5-2. "김유신" 학생의 성명, 총점, 평균 화면 출력
			StudentVO kim1 = map.get("김유신");
			System.out.println(kim1.getName() + ", " 
					+ kim1.getTot() + ", " + kim1.getAvg());
			
	
	}
		
	

	
	static void printData(StudentVO vo) {
		System.out.println(vo.getName() + "\t" 
			+ vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMath() + "\t" 
			+ vo.getTot() + "\t" + vo.getAvg());
	}

}
