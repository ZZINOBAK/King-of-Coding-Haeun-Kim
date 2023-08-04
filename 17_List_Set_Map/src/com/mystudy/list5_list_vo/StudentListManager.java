package com.mystudy.list5_list_vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mystudy.map2_exam_vo.StudentVO;

/*
성적처리를 위한 관리용 클래스를 생성 CRUD 기능을 구현하고 확인하시오
(학생 정보를 List에 저장하고 관리하되 이름은 중복되지 않는다)  
■ 클래스명 : StudentListManager
■ 속성(필드변수) : StudentVO 저장을 위한 List
■ 기능(메소드)
  - select : StudentVO 타입 데이터를 전달받아 동일한 이름 데이터를 찾아서 리턴
  - select : 이름(String)을 전달받아 동일한 이름 데이터 찾아서 리턴
  - selectAll : 전체 데이터 리턴
  - insert : StudentVO 타입 데이터를 전달받아 List에 추가
  - update : StudentVO 타입 데이터를 전달받아 List에서 동일데이터 찾아서 수정
  - update : 이름(String)을 전달받아 동일한 이름 데이터 수정
  - delete : StudentVO 타입 데이터를 전달받아 List에서 동일데이터 찾아서 삭제
  - delete : 이름(String)을 전달받아 동일한 이름 데이터 삭제
*/
public class StudentListManager {

	//필드 선언------------------------------------
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	private List<StudentVO> list = new ArrayList<StudentVO>();
	
	//생성자 선언-----------------------------------
	public StudentListManager() {}
		
	public StudentListManager(String name) {}
	
	public StudentListManager(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}

	public StudentListManager(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}

	public StudentListManager(List<StudentVO> list) {
		this.list = list;
	}
	
	//메소드 선언-------------------------------
//	- select : StudentVO 타입 데이터를 전달받아 동일한 이름 데이터를 찾아서 리턴
	public List<StudentVO> select(StudentVO studentvo) {
		return null;
	}
	
//	- select : 이름(String)을 전달받아 동일한 이름 데이터 찾아서 리턴
	public List<StudentVO> select(String string) {
		return null;
	}
	
//	- selectAll : 전체 데이터 리턴
	public List<StudentVO> selectAll() {
		return list;
	}
	
//	- insert : StudentVO 타입 데이터를 전달받아 List에 추가
	public void insert(StudentVO sabib) {
		 list.add(sabib);
	}

//	public void insertSample() {
//		list.add(new StudentVO("홍길동", 100, 90, 81));
//		list.add(new StudentVO("이순신", 95, 88, 92));
//		list.add(new StudentVO("김유신", 90, 87, 77));
//	}
	
//	- update : StudentVO 타입 데이터를 전달받아 List에서 동일데이터 찾아서 수정
	public List<StudentVO> update(StudentVO up) {
		
		return null;
	}
	
//	- update : 이름(String)을 전달받아 동일한 이름 데이터 수정
	public List<StudentVO> update(String date) {
		
		return null;
	}
	
//	- delete : StudentVO 타입 데이터를 전달받아 List에서 동일데이터 찾아서 삭제
	public List<StudentVO> delete(StudentVO del) {
		
		return null;
	}
	
//	- delete : 이름(String)을 전달받아 동일한 이름 데이터 삭제
	public List<StudentVO> delete(String ete) {
		
		return null;
	}
	
	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	@Override
	public String toString() {
		return  "리스트" + list;
	}
	
}
