package com.mystudy.bean_vo;

// 자바빈(Java Bean) 형태의 클래스 작성
// VO(Value Object) : 값(데이터)을 저장하기 위한 클래스(객체) - Oxxxx, OxxxVO, OxxxVo
// DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(
//     Oxxxx, OxxxDTO, OxxxxDto
public class StudentVO {
	//필드(변수)선언 -------------------
	//성명 - name : String
	//국어 - kor : int
	//영어 - eng : int
	//수학 - math  : int
	//총점 - tot : int
	//평균 - avg : double
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;	
		
	//생성자 작성--------------
	//생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자 	
	public StudentVO() {};
	
	public StudentVO(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//메소드 작성------------------------
	// setters, getters
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	
	void setKor(int kor) {
		this.kor = kor;
	}

	int getKor() {
		return kor;
	}
	
	void setEng(int eng) {
		this.eng = eng;
	}

	int getEng() {
		return eng;
	}
	
	void setMath(int math) {
		this.math = math;
	}

	int getMath() {
		return math;
	}
	
	int getTot() {
		tot = this.kor + this.eng + this.math;
		return tot;
	}
	
	double getAvg() {
		avg = tot * 100 / 3 / 100.0;
		return avg;
	}
	
	void printData() {
		getTot();
		getAvg();
		System.out.println(name + "\t" + kor + "\t" + eng  + "\t" + math
				  + "\t" + tot   + "\t" + avg);
	}
	

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + ", getName()=" + getName() + ", getKor()=" + getKor() + ", getEng()=" + getEng()
				+ ", getMath()=" + getMath() + ", Tot()=" + getTot() + ", Avg()=" + getAvg() + "]";
	} // 이거 뭐여 자동생성된거임. 뭐여 봐도 모르겠네 
	
	
	
}
